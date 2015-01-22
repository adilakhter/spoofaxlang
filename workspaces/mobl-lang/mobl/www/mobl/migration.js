mobl.provides('mobl.migration');
mobl.provides('mobl');
mobl.provides('mobl.migration');
(function(__ns) {
var stepBuffer;
__ns.Migration = function() {
                   this.stepBuffer = [ ];
                 };
__ns.Migration.defineMigration = function(version, cb) {
                                   var migration = new __ns.Migration();
                                   cb(migration);
                                   persistence.defineMigration(version, {
                                                                          up: function() {
                                                                                var that = this;
                                                                                migration.stepBuffer.forEach(function(step) {
                                                                                                               that[step[0]].apply(that, step.slice(1));
                                                                                                             });
                                                                              },
                                                                          down: function() {
                                                                                }
                                                                        });
                                 };
__ns.Migration.prototype = {
                             createEntity: function(name) {
                                             this.stepBuffer.push(['createTable',name.replace(/::/g, "__"),function() {
                                                                                                           }]);
                                           },
                             removeEntity: function(name) {
                                             this.stepBuffer.push(['dropTable',name.replace(/::/g, "__")]);
                                           },
                             addProperty: function(ent, name, type, defaultValue) {
                                            switch(type) {
                                              case "String":
                                                type = "TEXT";
                                                break;
                                              case "mobl::String":
                                                type = "TEXT";
                                                break;
                                              case "Num":
                                                type = "INT";
                                                break;
                                              case "mobl::Num":
                                                type = "INT";
                                                break;
                                              case "Bool":
                                                type = "TINYINT";
                                                defaultValue = defaultValue ? 1 : 0;
                                                break;
                                              case "mobl::Bool":
                                                type = "TINYINT";
                                                defaultValue = defaultValue ? 1 : 0;
                                                break;
                                              case "JSON":
                                                type = "TEXT";
                                                break;
                                              case "mobl::JSON":
                                                type = "TEXT";
                                                break;
                                              }
                                            this.stepBuffer.push(['addColumn',ent.replace(/::/g, "__"),name,type.replace(/::/g, "__"),defaultValue]);
                                          },
                             addManyToMany: function(fromEnt, prop, toEnt, invProp) {
                                              fromEnt = fromEnt.replace(/::/g, "__");
                                              toEnt = toEnt.replace(/::/g, "__");
                                              var tableName = fromEnt + "_" + prop + "_" + toEnt;
                                              var inverseTableName = toEnt + '_' + invProp + '_' + fromEnt;
                                              if(tableName > inverseTableName)
                                              {
                                                tableName = inverseTableName;
                                              }
                                              this.stepBuffer.push(['createTable',tableName,function(t) {
                                                                                              t.text(fromEnt + '_' + prop);
                                                                                              t.text(toEnt + '_' + invProp);
                                                                                            }]);
                                              this.stepBuffer.push(['addIndex',tableName,fromEnt + '_' + prop]);
                                              this.stepBuffer.push(['addIndex',tableName,toEnt + '_' + invProp]);
                                            },
                             removeProperty: function(ent, name, type) {
                                               this.stepBuffer.push(['removeColumn',ent.replace(/::/g, "__"),name]);
                                             },
                             addIndex: function(ent, name) {
                                         this.stepBuffer.push(['addIndex',ent.replace(/::/g, "__"),name]);
                                       },
                             removeIndex: function(ent, name) {
                                            this.stepBuffer.push(['removeIndex',ent.replace(/::/g, "__"),name]);
                                          },
                             executeSql: function(sql) {
                                           this.stepBuffer.push(['executeSql',sql]);
                                         }
                           };
__ns.performMigration = function(callback) {
                          persistence.migrations.init(function() {
                                                        persistence.migrate(callback);
                                                      });
                        };
}(mobl.migration));