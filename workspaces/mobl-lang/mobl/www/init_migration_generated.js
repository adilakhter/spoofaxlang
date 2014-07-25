mobl.provides('init_migration_generated');
mobl.provides('mobl.migration');
mobl.provides('mobl');
var result__ = mobl.migration.Migration.defineMigration(1, function(m, callback) {
                          var __this = this;
                          var result__ = m.createEntity("tasks::Task");
                          var result__ = m.addProperty("tasks::Task", "name", "mobl::String", null);
                          var result__ = m.addProperty("tasks::Task", "done", "mobl::Bool", null);
                          var result__ = m.addProperty("tasks::Task", "category", "tasks::Category", null);
                          var result__ = m.addManyToMany("tasks::Task", "tags", "tasks::Tag", "tasks");
                          var result__ = m.createEntity("tasks::Category");
                          var result__ = m.createEntity("tasks::Tag");
                          var result__ = m.addProperty("tasks::Tag", "name", "mobl::String", null);
                          if(callback && callback.apply) callback(); return;
                        });
