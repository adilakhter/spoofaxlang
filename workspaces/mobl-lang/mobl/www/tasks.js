mobl.provides('tasks');
mobl.provides('mobl.ui');
mobl.provides('mobl.ui.generic');
mobl.provides('tasks');
mobl.provides('mobl');
persistence.debug = false;
tasks.addTask = function(callback, screenCallback) {
var root567 = $("<div>");
var subs__ = new mobl.CompSubscription();

var t = mobl.ref(new tasks.Task({}));
var nodes447 = $("<span>");
root567.append(nodes447);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Add"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root568 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   var result__ = mobl.add(t.get());
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp340 = mobl.ref(result__);
  
  var nodes448 = $("<span>");
  root568.append(nodes448);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Done"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp340, function(_, callback) {
    var root569 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root569); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes448;
    nodes448 = node.contents();
    oldNodes.replaceWith(nodes448);
  }));
  callback(root568); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes447;
  nodes447 = node.contents();
  oldNodes.replaceWith(nodes447);
}));
var nodes449 = $("<span>");
root567.append(nodes449);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root570 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes450 = $("<span>");
  root570.append(nodes450);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root571 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes451 = $("<span>");
    root571.append(nodes451);
    subs__.addSub((mobl.ui.generic.textField)(mobl.ref(t, 'name'), mobl.ref(null), mobl.ref(null), mobl.ref("text"), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(true), mobl.ref(true), mobl.ref(true), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root572 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root572); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes451;
      nodes451 = node.contents();
      oldNodes.replaceWith(nodes451);
    }));
    callback(root571); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes450;
    nodes450 = node.contents();
    oldNodes.replaceWith(nodes450);
  }));
  callback(root570); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes449;
  nodes449 = node.contents();
  oldNodes.replaceWith(nodes449);
}));
callback(root567); return subs__;


return subs__;
};

tasks.root = function(callback, screenCallback) {
var root573 = $("<div>");
var subs__ = new mobl.CompSubscription();

var phrase = mobl.ref("");
var nodes452 = $("<span>");
root573.append(nodes452);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tasks"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root574 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('tasks.addTask', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp345 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp341 = mobl.ref(result__);
  
  var nodes453 = $("<span>");
  root574.append(nodes453);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Add"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp341, function(_, callback) {
    var root575 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root575); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes453;
    nodes453 = node.contents();
    oldNodes.replaceWith(nodes453);
  }));
  callback(root574); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes452;
  nodes452 = node.contents();
  oldNodes.replaceWith(nodes452);
}));
var result__ = mobl._("Search term", []);
var tmp342 = mobl.ref(result__);

var nodes454 = $("<span>");
root573.append(nodes454);
subs__.addSub((mobl.ui.generic.searchBox)(phrase, tmp342, mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root576 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root576); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes454;
  nodes454 = node.contents();
  oldNodes.replaceWith(nodes454);
}));
var nodes455 = $("<span>");
root573.append(nodes455);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root577 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = tasks.Task.all();
  var tmp344 = mobl.ref(result__);
  subs__.addSub(mobl.ref(tasks.Task.all()).addEventListener('change', function() {
    tmp344.set(tasks.Task.all());
  }));
  subs__.addSub(mobl.ref(tasks.Task).addEventListener('change', function() {
    tmp344.set(tasks.Task.all());
  }));
  
  
  var node99 = mobl.loadingSpan();
  root577.append(node99);
  var list253;
  var listSubs19 = new mobl.CompSubscription();
  subs__.addSub(listSubs19);
  var renderList19 = function() {
    var subs__ = listSubs19;
    list253 = tmp344.get();
    list253.list(function(results19) {
      node99.empty();
      for(var i55 = 0; i55 < results19.length; i55++) {
        (function() {
          var iternode19 = $("<span>");
          node99.append(iternode19);
          var t;
          t = mobl.ref(mobl.ref(results19), i55);
          var nodes456 = $("<span>");
          iternode19.append(nodes456);
          subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
            var root578 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes457 = $("<span>");
            root578.append(nodes457);
            subs__.addSub((mobl.ui.generic.checkBox)(mobl.ref(t, 'done'), mobl.ref(t, 'name'), mobl.ref(null), function(_, callback) {
              var root579 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root579); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes457;
              nodes457 = node.contents();
              oldNodes.replaceWith(nodes457);
            }));
            var result__ = function(event, callback) {
                             if(event && event.stopPropagation) event.stopPropagation();
                             var result__ = new tasks.Tag({'name': "Piet"});
                             var tag = result__;
                             var result__ = t.get().tags.add(tag);
                             if(callback && callback.apply) callback(); return;
                           };
            var tmp343 = mobl.ref(result__);
            
            var nodes458 = $("<span>");
            root578.append(nodes458);
            subs__.addSub((mobl.ui.generic.sideButton)(mobl.ref("Add tag"), mobl.ref(mobl.ui.generic.sideButtonStyle), mobl.ref(mobl.ui.generic.sideButtonPushedStyle), tmp343, function(_, callback) {
              var root580 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root580); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes458;
              nodes458 = node.contents();
              oldNodes.replaceWith(nodes458);
            }));
            
            var node100 = mobl.loadingSpan();
            root578.append(node100);
            var list254;
            var listSubs20 = new mobl.CompSubscription();
            subs__.addSub(listSubs20);
            var renderList20 = function() {
              var subs__ = listSubs20;
              list254 = t.get().tags;
              list254.list(function(results20) {
                node100.empty();
                for(var i56 = 0; i56 < results20.length; i56++) {
                  (function() {
                    var iternode20 = $("<span>");
                    node100.append(iternode20);
                    var tag;
                    tag = mobl.ref(mobl.ref(results20), i56);
                    var nodes459 = $("<span>");
                    iternode20.append(nodes459);
                    subs__.addSub((mobl.label)(mobl.ref(tag, 'name'), mobl.ref(null), mobl.ref(null), function(_, callback) {
                      var root581 = $("<span>");
                      var subs__ = new mobl.CompSubscription();
                      callback(root581); return subs__;
                      return subs__;
                    }, function(node) {
                      var oldNodes = nodes459;
                      nodes459 = node.contents();
                      oldNodes.replaceWith(nodes459);
                    }));
                    
                    iternode20.append(" ");
                    
                    var oldNodes = iternode20;
                    iternode20 = iternode20.contents();
                    oldNodes.replaceWith(iternode20);
                    
                    
                  }());
                }
                mobl.delayedUpdateScrollers();
                subs__.addSub(list254.addEventListener('change', function() { listSubs20.unsubscribe(); renderList20(true); }));
                subs__.addSub(mobl.ref(t, 'tags').addEventListener('change', function() { listSubs20.unsubscribe(); renderList20(true); }));
              });
            };
            renderList20();
            
            callback(root578); return subs__;
            
            
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes456;
            nodes456 = node.contents();
            oldNodes.replaceWith(nodes456);
          }));
          
          var oldNodes = iternode19;
          iternode19 = iternode19.contents();
          oldNodes.replaceWith(iternode19);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list253.addEventListener('change', function() { listSubs19.unsubscribe(); renderList19(true); }));
      subs__.addSub(tmp344.addEventListener('change', function() { listSubs19.unsubscribe(); renderList19(true); }));
    });
  };
  renderList19();
  
  callback(root577); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes455;
  nodes455 = node.contents();
  oldNodes.replaceWith(nodes455);
}));
callback(root573); return subs__;



return subs__;
};

tasks.Task = persistence.define('tasks__Task', {
'name': 'VARCHAR(255)',
'done': 'BOOL'
});



tasks.Category = persistence.define('tasks__Category', {

});



tasks.Tag = persistence.define('tasks__Tag', {
'name': 'VARCHAR(255)'
});


tasks.Tag.hasMany('tasks', tasks.Task, 'tags');
tasks.Category.hasMany('tasks', tasks.Task, 'category');
tasks.Task.hasMany('tags', tasks.Tag, 'tasks');
tasks.Task.hasOne('category', tasks.Category);
