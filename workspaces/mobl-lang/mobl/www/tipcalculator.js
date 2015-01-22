mobl.provides('tipcalculator');
mobl.provides('mobl.ui');
mobl.provides('tipcalculator');
mobl.provides('mobl.ui.generic');
mobl.provides('mobl');
persistence.debug = false;
tipcalculator.root = function(callback, screenCallback) {
var root366 = $("<div>");
var subs__ = new mobl.CompSubscription();

var amount = mobl.ref(20);

var percentage = mobl.ref(10);
var nodes242 = $("<span>");
root366.append(nodes242);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tip calculatorTest"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root367 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root367); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes242;
  nodes242 = node.contents();
  oldNodes.replaceWith(nodes242);
}));
var nodes243 = $("<span>");
root366.append(nodes243);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root368 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes244 = $("<span>");
  root368.append(nodes244);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root369 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes245 = $("<span>");
    root369.append(nodes245);
    subs__.addSub((mobl.ui.generic.numField)(amount, mobl.ref("amount paid"), mobl.ref(null), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root370 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root370); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes245;
      nodes245 = node.contents();
      oldNodes.replaceWith(nodes245);
    }));
    callback(root369); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes244;
    nodes244 = node.contents();
    oldNodes.replaceWith(nodes244);
  }));
  var nodes246 = $("<span>");
  root368.append(nodes246);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root371 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes247 = $("<span>");
    root371.append(nodes247);
    subs__.addSub((mobl.ui.generic.numField)(percentage, mobl.ref("percentage"), mobl.ref(null), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root372 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root372); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes247;
      nodes247 = node.contents();
      oldNodes.replaceWith(nodes247);
    }));
    callback(root371); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes246;
    nodes246 = node.contents();
    oldNodes.replaceWith(nodes246);
  }));
  var nodes248 = $("<span>");
  root368.append(nodes248);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root373 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root373.append("$");
    var result__ = mobl.Math.round(amount.get() * (percentage.get() / 100));
    var tmp433 = mobl.ref(result__);
    subs__.addSub(mobl.ref(mobl.Math).addEventListener('change', function() {
      tmp433.set(mobl.Math.round(amount.get() * (percentage.get() / 100)));
    }));
    subs__.addSub(amount.addEventListener('change', function() {
      tmp433.set(mobl.Math.round(amount.get() * (percentage.get() / 100)));
    }));
    subs__.addSub(percentage.addEventListener('change', function() {
      tmp433.set(mobl.Math.round(amount.get() * (percentage.get() / 100)));
    }));
    
    var nodes249 = $("<span>");
    root373.append(nodes249);
    subs__.addSub((mobl.label)(tmp433, mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root374 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root374); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes249;
      nodes249 = node.contents();
      oldNodes.replaceWith(nodes249);
    }));
    callback(root373); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes248;
    nodes248 = node.contents();
    oldNodes.replaceWith(nodes248);
  }));
  callback(root368); return subs__;
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes243;
  nodes243 = node.contents();
  oldNodes.replaceWith(nodes243);
}));
var nodes250 = $("<span>");
root366.append(nodes250);
subs__.addSub((mobl.nl)(function(_, callback) {
  var root375 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root375); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes250;
  nodes250 = node.contents();
  oldNodes.replaceWith(nodes250);
}));
callback(root366); return subs__;



return subs__;
};
