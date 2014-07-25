mobl.provides('todo');
mobl.provides('mobl.ui');
mobl.provides('model');
mobl.provides('mobl');
mobl.provides('mobl.ui.generic');
mobl.provides('todo');
persistence.debug = false;
todo.addTask = function(callback, screenCallback) {
var root514 = $("<div>");
var subs__ = new mobl.CompSubscription();

var newTask = mobl.ref(new model.Task({}));
var nodes401 = $("<span>");
root514.append(nodes401);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Add"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root515 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp321 = mobl.ref(result__);
  
  var nodes402 = $("<span>");
  root515.append(nodes402);
  subs__.addSub((mobl.ui.generic.backButton)(mobl.ref("Back"), mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp321, function(_, callback) {
    var root516 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root516); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes402;
    nodes402 = node.contents();
    oldNodes.replaceWith(nodes402);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   var result__ = mobl.add(newTask.get());
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp322 = mobl.ref(result__);
  
  var nodes403 = $("<span>");
  root515.append(nodes403);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Add"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp322, function(_, callback) {
    var root517 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root517); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes403;
    nodes403 = node.contents();
    oldNodes.replaceWith(nodes403);
  }));
  callback(root515); return subs__;
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes401;
  nodes401 = node.contents();
  oldNodes.replaceWith(nodes401);
}));
var nodes404 = $("<span>");
root514.append(nodes404);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root518 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes405 = $("<span>");
  root518.append(nodes405);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root519 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes406 = $("<span>");
    root519.append(nodes406);
    subs__.addSub((mobl.ui.generic.textField)(mobl.ref(newTask, 'name'), mobl.ref("Task name"), mobl.ref(null), mobl.ref("text"), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(true), mobl.ref(true), mobl.ref(true), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root520 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root520); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes406;
      nodes406 = node.contents();
      oldNodes.replaceWith(nodes406);
    }));
    callback(root519); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes405;
    nodes405 = node.contents();
    oldNodes.replaceWith(nodes405);
  }));
  callback(root518); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes404;
  nodes404 = node.contents();
  oldNodes.replaceWith(nodes404);
}));
callback(root514); return subs__;


return subs__;
};

todo.editTask = function(t, callback, screenCallback) {
var root521 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes407 = $("<span>");
root521.append(nodes407);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Edit"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root522 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp323 = mobl.ref(result__);
  
  var nodes408 = $("<span>");
  root522.append(nodes408);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Done"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp323, function(_, callback) {
    var root523 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root523); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes408;
    nodes408 = node.contents();
    oldNodes.replaceWith(nodes408);
  }));
  callback(root522); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes407;
  nodes407 = node.contents();
  oldNodes.replaceWith(nodes407);
}));
var nodes409 = $("<span>");
root521.append(nodes409);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root524 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes410 = $("<span>");
  root524.append(nodes410);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root525 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes411 = $("<span>");
    root525.append(nodes411);
    subs__.addSub((mobl.ui.generic.textField)(mobl.ref(t, 'name'), mobl.ref("Task name"), mobl.ref(null), mobl.ref("text"), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(true), mobl.ref(true), mobl.ref(true), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root526 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root526); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes411;
      nodes411 = node.contents();
      oldNodes.replaceWith(nodes411);
    }));
    callback(root525); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes410;
    nodes410 = node.contents();
    oldNodes.replaceWith(nodes410);
  }));
  var nodes412 = $("<span>");
  root524.append(nodes412);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root527 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes413 = $("<span>");
    root527.append(nodes413);
    subs__.addSub((mobl.ui.generic.textField)(mobl.ref(t, 'description'), mobl.ref("Task description"), mobl.ref(null), mobl.ref("text"), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(true), mobl.ref(true), mobl.ref(true), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root528 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root528); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes413;
      nodes413 = node.contents();
      oldNodes.replaceWith(nodes413);
    }));
    callback(root527); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes412;
    nodes412 = node.contents();
    oldNodes.replaceWith(nodes412);
  }));
  callback(root524); return subs__;
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes409;
  nodes409 = node.contents();
  oldNodes.replaceWith(nodes409);
}));
callback(root521); return subs__;


return subs__;
};

todo.root = function(callback, screenCallback) {
var root529 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes414 = $("<span>");
root529.append(nodes414);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tasks"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root530 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('todo.addTask', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp329 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp324 = mobl.ref(result__);
  
  var nodes415 = $("<span>");
  root530.append(nodes415);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Add"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp324, function(_, callback) {
    var root531 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root531); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes415;
    nodes415 = node.contents();
    oldNodes.replaceWith(nodes415);
  }));
  callback(root530); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes414;
  nodes414 = node.contents();
  oldNodes.replaceWith(nodes414);
}));

var phrase = mobl.ref("");
var result__ = mobl._("Search term", []);
var tmp325 = mobl.ref(result__);

var nodes416 = $("<span>");
root529.append(nodes416);
subs__.addSub((mobl.ui.generic.searchBox)(phrase, tmp325, mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root532 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root532); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes416;
  nodes416 = node.contents();
  oldNodes.replaceWith(nodes416);
}));
var nodes417 = $("<span>");
root529.append(nodes417);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root533 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = model.Task.searchPrefix(phrase.get());
  var tmp328 = mobl.ref(result__);
  subs__.addSub(mobl.ref(model.Task.searchPrefix(phrase.get())).addEventListener('change', function() {
    tmp328.set(model.Task.searchPrefix(phrase.get()));
  }));
  subs__.addSub(mobl.ref(model.Task).addEventListener('change', function() {
    tmp328.set(model.Task.searchPrefix(phrase.get()));
  }));
  subs__.addSub(phrase.addEventListener('change', function() {
    tmp328.set(model.Task.searchPrefix(phrase.get()));
  }));
  
  
  var node98 = mobl.loadingSpan();
  root533.append(node98);
  var list252;
  var listSubs18 = new mobl.CompSubscription();
  subs__.addSub(listSubs18);
  var renderList18 = function() {
    var subs__ = listSubs18;
    list252 = tmp328.get();
    list252.list(function(results18) {
      node98.empty();
      for(var i54 = 0; i54 < results18.length; i54++) {
        (function() {
          var iternode18 = $("<span>");
          node98.append(iternode18);
          var t;
          t = mobl.ref(mobl.ref(results18), i54);
          var nodes418 = $("<span>");
          iternode18.append(nodes418);
          subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
            var root534 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes419 = $("<span>");
            root534.append(nodes419);
            subs__.addSub((mobl.ui.generic.checkBox)(mobl.ref(t, 'done'), mobl.ref(t, 'name'), mobl.ref(null), function(_, callback) {
              var root535 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root535); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes419;
              nodes419 = node.contents();
              oldNodes.replaceWith(nodes419);
            }));
            var nodes420 = $("<span>");
            root534.append(nodes420);
            subs__.addSub((mobl.ui.generic.contextMenu)(function(_, callback) {
              var root536 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               var result__ = mobl.remove(t.get());
                               if(callback && callback.apply) callback(); return;
                             };
              var tmp326 = mobl.ref(result__);
              
              var nodes421 = $("<span>");
              root536.append(nodes421);
              subs__.addSub((mobl.ui.generic.button)(mobl.ref("Delete"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp326, function(_, callback) {
                var root537 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                callback(root537); return subs__;
                return subs__;
              }, function(node) {
                var oldNodes = nodes421;
                nodes421 = node.contents();
                oldNodes.replaceWith(nodes421);
              }));
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               mobl.call('todo.editTask', [t, mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                               var tmp330 = result__;
                               if(callback && callback.apply) callback(); return;
                               });
                             };
              var tmp327 = mobl.ref(result__);
              
              var nodes422 = $("<span>");
              root536.append(nodes422);
              subs__.addSub((mobl.ui.generic.button)(mobl.ref("Edit"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp327, function(_, callback) {
                var root538 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                callback(root538); return subs__;
                return subs__;
              }, function(node) {
                var oldNodes = nodes422;
                nodes422 = node.contents();
                oldNodes.replaceWith(nodes422);
              }));
              callback(root536); return subs__;
              
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes420;
              nodes420 = node.contents();
              oldNodes.replaceWith(nodes420);
            }));
            callback(root534); return subs__;
            
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes418;
            nodes418 = node.contents();
            oldNodes.replaceWith(nodes418);
          }));
          
          var oldNodes = iternode18;
          iternode18 = iternode18.contents();
          oldNodes.replaceWith(iternode18);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list252.addEventListener('change', function() { listSubs18.unsubscribe(); renderList18(true); }));
      subs__.addSub(tmp328.addEventListener('change', function() { listSubs18.unsubscribe(); renderList18(true); }));
    });
  };
  renderList18();
  
  callback(root533); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes417;
  nodes417 = node.contents();
  oldNodes.replaceWith(nodes417);
}));
callback(root529); return subs__;



return subs__;
};
