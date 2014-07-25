mobl.provides('draw');
mobl.provides('mobl.ui');
mobl.provides('mobl.ui.generic');
mobl.provides('mobl.canvas');
mobl.provides('mobl');
mobl.provides('draw');
persistence.debug = false;draw.drawPoint = function(g, color, penSize, x, y) {
   var __this = this;
  g.fillStyle = color;
  g.beginPath();
  g.arc(x, y, penSize, 0, 3.1415 * 2, false);
  g.closePath();
  g.fill();
};

draw.clear = function(g) {
   var __this = this;
  g.fillStyle = "#f0f0f0";
  g.fillRect(0, 0, mobl.window.get().innerWidth, mobl.window.get().innerHeight);
};


draw.colorSquare = function(newcolor, color, elements, callback) {
var root154 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node69 = $("<div>");

var ref92 = mobl.ref("display: inline-block; background-color: " + newcolor.get() + "; width: 30px; height: 30px; border: 1px solid #000;");
if(ref92.get() !== null) {
  node69.attr('style', ref92.get());
  subs__.addSub(ref92.addEventListener('change', function(_, ref, val) {
    node69.attr('style', val);
  }));
  subs__.addSub(newcolor.addEventListener('change', function() {
    node69.attr('style', "display: inline-block; background-color: " + newcolor.get() + "; width: 30px; height: 30px; border: 1px solid #000;");
  }));
  
}
subs__.addSub(ref92.rebind());

var val44 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = newcolor.get();
              color.set(result__);
              if(callback && callback.apply) callback(); return;
            };
if(val44 !== null) {
  subs__.addSub(mobl.domBind(node69, 'tap', val44));
}

root154.append(node69);
callback(root154); return subs__;

return subs__;
};
draw.colorPalet = mobl.ref(["black", "white", "blue", "yellow", "GoldenRod", "deepskyblue", "green", "red", "purple", "#f0f0f0"]);

draw.root = function(callback, screenCallback) {
var root155 = $("<div>");
var subs__ = new mobl.CompSubscription();

var g = mobl.ref(null);

var color = mobl.ref("black");

var penSize = mobl.ref(10);
var nodes103 = $("<span>");
root155.append(nodes103);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("mobl draw"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root156 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   var result__ = draw.clear(g.get());
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp107 = mobl.ref(result__);
  
  var nodes104 = $("<span>");
  root156.append(nodes104);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Clear"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp107, function(_, callback) {
    var root157 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root157); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes104;
    nodes104 = node.contents();
    oldNodes.replaceWith(nodes104);
  }));
  callback(root156); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes103;
  nodes103 = node.contents();
  oldNodes.replaceWith(nodes103);
}));
var nodes105 = $("<span>");
root155.append(nodes105);
subs__.addSub((mobl.block)(mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root158 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node70 = mobl.loadingSpan();
  root158.append(node70);
  var list170;
  var listSubs14 = new mobl.CompSubscription();
  subs__.addSub(listSubs14);
  var renderList14 = function() {
    var subs__ = listSubs14;
    list170 = draw.colorPalet.get();
    list170.list(function(results14) {
      node70.empty();
      for(var i14 = 0; i14 < results14.length; i14++) {
        (function() {
          var iternode14 = $("<span>");
          node70.append(iternode14);
          var c;
          c = mobl.ref(mobl.ref(results14), i14);
          var nodes106 = $("<span>");
          iternode14.append(nodes106);
          subs__.addSub((draw.colorSquare)(c, color, function(_, callback) {
            var root159 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            callback(root159); return subs__;
            return subs__;
          }, function(node) {
            var oldNodes = nodes106;
            nodes106 = node.contents();
            oldNodes.replaceWith(nodes106);
          }));
          
          var oldNodes = iternode14;
          iternode14 = iternode14.contents();
          oldNodes.replaceWith(iternode14);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list170.addEventListener('change', function() { listSubs14.unsubscribe(); renderList14(true); }));
      subs__.addSub(draw.colorPalet.addEventListener('change', function() { listSubs14.unsubscribe(); renderList14(true); }));
    });
  };
  renderList14();
  
  callback(root158); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes105;
  nodes105 = node.contents();
  oldNodes.replaceWith(nodes105);
}));
var result__ = function(event, callback) {
                 if(event && event.stopPropagation) event.stopPropagation();
                 event.preventDefault(function(result__) {
                   var tmp111 = result__;
                   var result__ = draw.drawPoint(g.get(), color.get(), penSize.get(), event.x, event.y);
                   if(callback && callback.apply) callback(); return;
                 });
               };
var tmp109 = mobl.ref(result__);

var result__ = function(event, callback) {
                 if(event && event.stopPropagation) event.stopPropagation();
                 event.preventDefault(function(result__) {
                   var tmp110 = result__;
                   var result__ = draw.drawPoint(g.get(), color.get(), penSize.get(), event.x, event.y);
                   if(callback && callback.apply) callback(); return;
                 });
               };
var tmp108 = mobl.ref(result__);

var nodes107 = $("<span>");
root155.append(nodes107);
subs__.addSub((mobl.canvas.canvas)(g, mobl.ref(mobl.window, 'innerWidth'), mobl.ref(mobl.window, 'innerHeight'), tmp108, tmp109, mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root160 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root160); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes107;
  nodes107 = node.contents();
  oldNodes.replaceWith(nodes107);
}));
callback(root155); return subs__;



return subs__;
};
