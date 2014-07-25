mobl.provides('questions');
mobl.provides('mobl.ui');
mobl.provides('questions');
mobl.provides('mobl');
mobl.provides('mobl.ui.ios');
persistence.debug = false;
questions.toolbar = function(elements, callback) {
var root559 = $("<span>");
var subs__ = new mobl.CompSubscription();

root559.append("Hello");
var result__ = 8;
var n = result__;
callback(root559); return subs__;
return subs__;
};

questions.root = function(callback, screenCallback) {
var root560 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes441 = $("<span>");
root560.append(nodes441);
subs__.addSub((mobl.ui.ios.basicView)(mobl.ref("Questions"), mobl.ref(questions.toolbar), function(_, callback) {
  var root561 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var message = mobl.ref("<message will appear here>");
  var nodes442 = $("<span>");
  root561.append(nodes442);
  subs__.addSub((mobl.ui.ios.group)(function(_, callback) {
    var root562 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes443 = $("<span>");
    root562.append(nodes443);
    subs__.addSub((mobl.ui.ios.item)(mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root563 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var nodes444 = $("<span>");
      root563.append(nodes444);
      subs__.addSub((mobl.label)(message, mobl.ref(null), mobl.ref(null), function(_, callback) {
        var root564 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root564); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes444;
        nodes444 = node.contents();
        oldNodes.replaceWith(nodes444);
      }));
      callback(root563); return subs__;
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes443;
      nodes443 = node.contents();
      oldNodes.replaceWith(nodes443);
    }));
    callback(root562); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes442;
    nodes442 = node.contents();
    oldNodes.replaceWith(nodes442);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('mobl.ui.ios.promptString', [mobl.ref("What is your name?"), mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp339 = result__;
                   var result__ = "Hello, " + tmp339;
                   var tmp338 = result__;
                   var result__ = tmp338;
                   message.set(result__);
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp333 = mobl.ref(result__);
  
  var nodes445 = $("<span>");
  root561.append(nodes445);
  subs__.addSub((mobl.ui.ios.button)(mobl.ref("Ask for name"), tmp333, function(_, callback) {
    var root565 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root565); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes445;
    nodes445 = node.contents();
    oldNodes.replaceWith(nodes445);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('mobl.ui.ios.promptString', [mobl.ref("How old are you?"), mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp337 = result__;
                   var result__ = "You are " + tmp337;
                   var tmp336 = result__;
                   var result__ = tmp336 + " years old";
                   var tmp335 = result__;
                   var result__ = tmp335;
                   message.set(result__);
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp334 = mobl.ref(result__);
  
  var nodes446 = $("<span>");
  root561.append(nodes446);
  subs__.addSub((mobl.ui.ios.altButton)(mobl.ref("Ask for age"), tmp334, function(_, callback) {
    var root566 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root566); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes446;
    nodes446 = node.contents();
    oldNodes.replaceWith(nodes446);
  }));
  callback(root561); return subs__;
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes441;
  nodes441 = node.contents();
  oldNodes.replaceWith(nodes441);
}));
callback(root560); return subs__;

return subs__;
};
