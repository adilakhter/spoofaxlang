mobl.provides('tipcalculator');
mobl.provides('mobl.ui');
mobl.provides('tipcalculator');
mobl.provides('mobl.ui.generic');
mobl.provides('mobl');
persistence.debug = false;
tipcalculator.root = function(callback, screenCallback) {
var root582 = $("<div>");
var subs__ = new mobl.CompSubscription();

var amount = mobl.ref(20);

var percentage = mobl.ref(10);
var nodes460 = $("<span>");
root582.append(nodes460);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tip calculator"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root583 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root583); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes460;
  nodes460 = node.contents();
  oldNodes.replaceWith(nodes460);
}));
var nodes461 = $("<span>");
root582.append(nodes461);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root584 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes462 = $("<span>");
  root584.append(nodes462);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root585 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes463 = $("<span>");
    root585.append(nodes463);
    subs__.addSub((mobl.ui.generic.numField)(amount, mobl.ref("amount"), mobl.ref(null), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root586 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root586); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes463;
      nodes463 = node.contents();
      oldNodes.replaceWith(nodes463);
    }));
    callback(root585); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes462;
    nodes462 = node.contents();
    oldNodes.replaceWith(nodes462);
  }));
  var nodes464 = $("<span>");
  root584.append(nodes464);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root587 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes465 = $("<span>");
    root587.append(nodes465);
    subs__.addSub((mobl.ui.generic.numField)(percentage, mobl.ref("percentage"), mobl.ref(null), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root588 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root588); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes465;
      nodes465 = node.contents();
      oldNodes.replaceWith(nodes465);
    }));
    callback(root587); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes464;
    nodes464 = node.contents();
    oldNodes.replaceWith(nodes464);
  }));
  var nodes466 = $("<span>");
  root584.append(nodes466);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root589 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root589.append("$");
    var result__ = mobl.Math.round(amount.get() * (1 + percentage.get() / 100));
    var tmp346 = mobl.ref(result__);
    subs__.addSub(mobl.ref(mobl.Math).addEventListener('change', function() {
      tmp346.set(mobl.Math.round(amount.get() * (1 + percentage.get() / 100)));
    }));
    subs__.addSub(amount.addEventListener('change', function() {
      tmp346.set(mobl.Math.round(amount.get() * (1 + percentage.get() / 100)));
    }));
    subs__.addSub(percentage.addEventListener('change', function() {
      tmp346.set(mobl.Math.round(amount.get() * (1 + percentage.get() / 100)));
    }));
    
    var nodes467 = $("<span>");
    root589.append(nodes467);
    subs__.addSub((mobl.label)(tmp346, mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root590 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root590); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes467;
      nodes467 = node.contents();
      oldNodes.replaceWith(nodes467);
    }));
    callback(root589); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes466;
    nodes466 = node.contents();
    oldNodes.replaceWith(nodes466);
  }));
  callback(root584); return subs__;
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes461;
  nodes461 = node.contents();
  oldNodes.replaceWith(nodes461);
}));
var nodes468 = $("<span>");
root582.append(nodes468);
subs__.addSub((mobl.nl)(function(_, callback) {
  var root591 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root591); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes468;
  nodes468 = node.contents();
  oldNodes.replaceWith(nodes468);
}));
callback(root582); return subs__;



return subs__;
};
