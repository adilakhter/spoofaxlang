mobl.provides('mobl.ui.generic');
mobl.provides('mobl.ui.stylemixin');
mobl.provides('mobl.ui.generic');
mobl.provides('mobl');
mobl.provides('mobl.ui');
mobl.ui.generic.loadingStyle = 'mobl__ui__generic__loadingStyle';

mobl.ui.generic.whenLoaded = function(value, style, loadingMessage, elements, callback) {
var root258 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node137 = $("<span>");
root258.append(node137);
var condSubs33 = new mobl.CompSubscription();
subs__.addSub(condSubs33);
var oldValue33;
var renderCond33 = function() {
  var value149 = value.get();
  if(oldValue33 === value149) return;
  oldValue33 = value149;
  var subs__ = condSubs33;
  subs__.unsubscribe();
  node137.empty();
  if(value149) {
    var nodes166 = $("<span>");
    node137.append(nodes166);
    subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
      renderControl53();
    }));
    
    function renderControl53() {
      subs__.addSub((elements)(function(elements, callback) {
        var root259 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root259); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes166;
        nodes166 = node.contents();
        oldNodes.replaceWith(nodes166);
      }));
    }
    renderControl53();
    
    
  } else {
    var nodes167 = $("<span>");
    node137.append(nodes167);
    subs__.addSub((mobl.block)(style, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root260 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var nodes168 = $("<span>");
      root260.append(nodes168);
      subs__.addSub((mobl.label)(loadingMessage, mobl.ref(null), mobl.ref(null), function(_, callback) {
        var root261 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root261); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes168;
        nodes168 = node.contents();
        oldNodes.replaceWith(nodes168);
      }));
      var nodes169 = $("<span>");
      root260.append(nodes169);
      subs__.addSub((mobl.ui.generic.image)(mobl.ref("data:image/gif;base64,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"), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref("middle"), mobl.ref(null), function(_, callback) {
        var root262 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root262); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes169;
        nodes169 = node.contents();
        oldNodes.replaceWith(nodes169);
      }));
      callback(root260); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes167;
      nodes167 = node.contents();
      oldNodes.replaceWith(nodes167);
    }));
    
    
  }
};
renderCond33();
subs__.addSub(value.addEventListener('change', function() {
  renderCond33();
}));

callback(root258); return subs__;

return subs__;
};
mobl.ui.generic.headerStyle = 'mobl__ui__generic__headerStyle';
mobl.ui.generic.headerContainerStyle = 'mobl__ui__generic__headerContainerStyle';
mobl.ui.generic.headerTextStyle = 'mobl__ui__generic__headerTextStyle';

mobl.ui.generic.header = function(text, fixedPosition, onclick, elements, callback) {
var root263 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node138 = $("<div>");

var ref219 = mobl.ref(mobl.ui.generic.headerStyle);
if(ref219.get() !== null) {
  node138.attr('class', ref219.get());
  subs__.addSub(ref219.addEventListener('change', function(_, ref, val) {
    node138.attr('class', val);
  }));
  
}
subs__.addSub(ref219.rebind());

var val101 = onclick.get();
if(val101 !== null) {
  subs__.addSub(mobl.domBind(node138, 'tap', val101));
}

var ref220 = mobl.ref(fixedPosition.get() ? "position:fixed;" : null);
if(ref220.get() !== null) {
  node138.attr('style', ref220.get());
  subs__.addSub(ref220.addEventListener('change', function(_, ref, val) {
    node138.attr('style', val);
  }));
  subs__.addSub(fixedPosition.addEventListener('change', function() {
    node138.attr('style', fixedPosition.get() ? "position:fixed;" : null);
  }));
  
}
subs__.addSub(ref220.rebind());


var node141 = $("<div>");

var ref218 = mobl.ref(mobl.ui.generic.headerContainerStyle);
if(ref218.get() !== null) {
  node141.attr('class', ref218.get());
  subs__.addSub(ref218.addEventListener('change', function(_, ref, val) {
    node141.attr('class', val);
  }));
  
}
subs__.addSub(ref218.rebind());


var node142 = $("<div>");

var ref216 = text;
node142.text(""+ref216.get());
var ignore38 = false;
subs__.addSub(ref216.addEventListener('change', function(_, ref, val) {
  if(ignore38) return;
  node142.text(""+val);
}));
subs__.addSub(ref216.rebind());


var ref217 = mobl.ref(mobl.ui.generic.headerTextStyle);
if(ref217.get() !== null) {
  node142.attr('class', ref217.get());
  subs__.addSub(ref217.addEventListener('change', function(_, ref, val) {
    node142.attr('class', val);
  }));
  
}
subs__.addSub(ref217.rebind());

node141.append(node142);
node138.append(node141);
var nodes170 = $("<span>");
node138.append(nodes170);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl54();
}));

function renderControl54() {
  subs__.addSub((elements)(function(elements, callback) {
    var root264 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root264); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes170;
    nodes170 = node.contents();
    oldNodes.replaceWith(nodes170);
  }));
}
renderControl54();
root263.append(node138);

var node139 = $("<span>");
root263.append(node139);
var condSubs34 = new mobl.CompSubscription();
subs__.addSub(condSubs34);
var oldValue34;
var renderCond34 = function() {
  var value150 = fixedPosition.get();
  if(oldValue34 === value150) return;
  oldValue34 = value150;
  var subs__ = condSubs34;
  subs__.unsubscribe();
  node139.empty();
  if(value150) {
    
    var node140 = $("<div>");
    node140.attr('id', "hello");
    node140.attr('style', "height: 2.9em;");
    
    node139.append(node140);
    
    
  } else {
    
  }
};
renderCond34();
subs__.addSub(fixedPosition.addEventListener('change', function() {
  renderCond34();
}));

callback(root263); return subs__;





return subs__;
};
mobl.ui.generic.buttonStyle = 'mobl__ui__generic__buttonStyle';
mobl.ui.generic.buttonPushedStyle = 'mobl__ui__generic__buttonPushedStyle';
mobl.ui.generic.buttonStyle = 'mobl__ui__generic__buttonStyle';
mobl.ui.generic.buttonPushedStyle = 'mobl__ui__generic__buttonPushedStyle';

mobl.ui.generic.button = function(text, style, pushedStyle, onclick, elements, callback) {
var root265 = $("<span>");
var subs__ = new mobl.CompSubscription();

var pushed = mobl.ref(false);

var sp = $("<span>");

var ref221 = mobl.ref(pushed.get() ? pushedStyle.get() : style.get());
if(ref221.get() !== null) {
  sp.attr('class', ref221.get());
  subs__.addSub(ref221.addEventListener('change', function(_, ref, val) {
    sp.attr('class', val);
  }));
  subs__.addSub(pushed.addEventListener('change', function() {
    sp.attr('class', pushed.get() ? pushedStyle.get() : style.get());
  }));
  subs__.addSub(pushedStyle.addEventListener('change', function() {
    sp.attr('class', pushed.get() ? pushedStyle.get() : style.get());
  }));
  subs__.addSub(style.addEventListener('change', function() {
    sp.attr('class', pushed.get() ? pushedStyle.get() : style.get());
  }));
  
}
subs__.addSub(ref221.rebind());

var val102 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = event.preventDefault();
              var result__ = true;
              pushed.set(result__);
              if(callback && callback.apply) callback(); return;
            };
if(val102 !== null) {
  subs__.addSub(mobl.domBind(sp, 'touchdown', val102));
}

var val103 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = event.y < 0 || event.y > sp.outerHeight() || event.x < 0 || event.x > sp.outerWidth();
              if(result__) {
                var result__ = false;
                pushed.set(result__);
                if(callback && callback.apply) callback(); return;
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val103 !== null) {
  subs__.addSub(mobl.domBind(sp, 'touchdrag', val103));
}

var val104 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = pushed.get();
              if(result__) {
                var result__ = false;
                pushed.set(result__);
                function after33(result__) {
                  var tmp407 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onclick.get()(event, after33);if(result__ !== undefined) after33(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val104 !== null) {
  subs__.addSub(mobl.domBind(sp, 'touchup', val104));
}

var val105 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = pushed.get();
              if(result__) {
                var result__ = false;
                pushed.set(result__);
                if(callback && callback.apply) callback(); return;
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val105 !== null) {
  subs__.addSub(mobl.domBind(sp, 'mouseout', val105));
}

var ref222 = text;
sp.text(""+ref222.get());
var ignore39 = false;
subs__.addSub(ref222.addEventListener('change', function(_, ref, val) {
  if(ignore39) return;
  sp.text(""+val);
}));
subs__.addSub(ref222.rebind());


root265.append(sp);
callback(root265); return subs__;

return subs__;
};
mobl.ui.generic.sideButtonStyle = 'mobl__ui__generic__sideButtonStyle';
mobl.ui.generic.sideButtonPushedStyle = 'mobl__ui__generic__sideButtonPushedStyle';

mobl.ui.generic.sideButton = function(text, style, pushedStyle, onclick, elements, callback) {
var root266 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes171 = $("<span>");
root266.append(nodes171);
subs__.addSub((mobl.ui.generic.button)(text, style, pushedStyle, onclick, function(_, callback) {
  var root267 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root267); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes171;
  nodes171 = node.contents();
  oldNodes.replaceWith(nodes171);
}));
callback(root266); return subs__;

return subs__;
};
mobl.ui.generic.backButtonStyle = 'mobl__ui__generic__backButtonStyle';
mobl.ui.generic.backButtonPushedStyle = 'mobl__ui__generic__backButtonPushedStyle';
mobl.ui.generic.backButtonStyle = 'mobl__ui__generic__backButtonStyle';
mobl.ui.generic.backButtonPushedStyle = 'mobl__ui__generic__backButtonPushedStyle';

mobl.ui.generic.backButton = function(text, style, pushedStyle, onclick, elements, callback) {
var root268 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes172 = $("<span>");
root268.append(nodes172);
subs__.addSub((mobl.ui.generic.button)(text, style, pushedStyle, onclick, function(_, callback) {
  var root269 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root269); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes172;
  nodes172 = node.contents();
  oldNodes.replaceWith(nodes172);
}));
callback(root268); return subs__;

return subs__;
};
mobl.ui.generic.groupStyle = 'mobl__ui__generic__groupStyle';

mobl.ui.generic.group = function(elements, callback) {
var root270 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node143 = $("<ul>");

var ref223 = mobl.ref(mobl.ui.generic.groupStyle);
if(ref223.get() !== null) {
  node143.attr('class', ref223.get());
  subs__.addSub(ref223.addEventListener('change', function(_, ref, val) {
    node143.attr('class', val);
  }));
  
}
subs__.addSub(ref223.rebind());

var nodes173 = $("<span>");
node143.append(nodes173);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl55();
}));

function renderControl55() {
  subs__.addSub((elements)(function(elements, callback) {
    var root271 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root271); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes173;
    nodes173 = node.contents();
    oldNodes.replaceWith(nodes173);
  }));
}
renderControl55();
root270.append(node143);
callback(root270); return subs__;


return subs__;
};

mobl.ui.generic.image = function(url, width, height, onclick, style, valign, align, elements, callback) {
var root272 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node144 = $("<img>");

var ref224 = url;
if(ref224.get() !== null) {
  node144.attr('src', ref224.get());
  subs__.addSub(ref224.addEventListener('change', function(_, ref, val) {
    node144.attr('src', val);
  }));
  
}
subs__.addSub(ref224.rebind());

var ref225 = width;
if(ref225.get() !== null) {
  node144.attr('width', ref225.get());
  subs__.addSub(ref225.addEventListener('change', function(_, ref, val) {
    node144.attr('width', val);
  }));
  
}
subs__.addSub(ref225.rebind());

var ref226 = height;
if(ref226.get() !== null) {
  node144.attr('height', ref226.get());
  subs__.addSub(ref226.addEventListener('change', function(_, ref, val) {
    node144.attr('height', val);
  }));
  
}
subs__.addSub(ref226.rebind());

var ref227 = style;
if(ref227.get() !== null) {
  node144.attr('class', ref227.get());
  subs__.addSub(ref227.addEventListener('change', function(_, ref, val) {
    node144.attr('class', val);
  }));
  
}
subs__.addSub(ref227.rebind());

var val106 = onclick.get();
if(val106 !== null) {
  subs__.addSub(mobl.domBind(node144, 'tap', val106));
}

var ref228 = valign;
if(ref228.get() !== null) {
  node144.attr('valign', ref228.get());
  subs__.addSub(ref228.addEventListener('change', function(_, ref, val) {
    node144.attr('valign', val);
  }));
  
}
subs__.addSub(ref228.rebind());

var ref229 = align;
if(ref229.get() !== null) {
  node144.attr('align', ref229.get());
  subs__.addSub(ref229.addEventListener('change', function(_, ref, val) {
    node144.attr('align', val);
  }));
  
}
subs__.addSub(ref229.rebind());

root272.append(node144);
callback(root272); return subs__;

return subs__;
};
mobl.ui.generic.itemStyle = 'mobl__ui__generic__itemStyle';
mobl.ui.generic.itemPushedStyle = 'mobl__ui__generic__itemPushedStyle';
mobl.ui.generic.itemArrowStyle = 'mobl__ui__generic__itemArrowStyle';
mobl.ui.generic.itemDownArrowStyle = 'mobl__ui__generic__itemDownArrowStyle';

mobl.ui.generic.item = function(style, pushedStyle, onclick, onswipe, hideArrow, elements, callback) {
var root273 = $("<span>");
var subs__ = new mobl.CompSubscription();

var pushed = mobl.ref(false);

var el = $("<li>");

var ref230 = mobl.ref(mobl.ui.generic.itemStyle);
if(ref230.get() !== null) {
  el.attr('class', ref230.get());
  subs__.addSub(ref230.addEventListener('change', function(_, ref, val) {
    el.attr('class', val);
  }));
  
}
subs__.addSub(ref230.rebind());

var ref231 = mobl.ref(onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
if(ref231.get() !== null) {
  el.attr('class', ref231.get());
  subs__.addSub(ref231.addEventListener('change', function(_, ref, val) {
    el.attr('class', val);
  }));
  subs__.addSub(onclick.addEventListener('change', function() {
    el.attr('class', onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
  }));
  subs__.addSub(hideArrow.addEventListener('change', function() {
    el.attr('class', onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
  }));
  subs__.addSub(mobl.ref(mobl.ui.generic.itemArrowStyle).addEventListener('change', function() {
    el.attr('class', onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
  }));
  subs__.addSub(pushed.addEventListener('change', function() {
    el.attr('class', onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
  }));
  subs__.addSub(pushedStyle.addEventListener('change', function() {
    el.attr('class', onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
  }));
  subs__.addSub(style.addEventListener('change', function() {
    el.attr('class', onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
  }));
  
}
subs__.addSub(ref231.rebind());

var val107 = onswipe.get();
if(val107 !== null) {
  subs__.addSub(mobl.domBind(el, 'swipe', val107));
}

var val108 = onclick.get() ? function(event, callback) {
                                       if(event && event.stopPropagation) event.stopPropagation();
                                       var result__ = true;
                                       pushed.set(result__);
                                       mobl.sleep(100, function(result__) {
                                         var tmp408 = result__;
                                         function after34(result__) {
                                           var tmp409 = result__;
                                           
                                         }
                                         var result__ = onclick.get()(event, after34);if(result__ !== undefined) after34(result__);
                                         mobl.sleep(200, function(result__) {
                                           var tmp411 = result__;
                                           var result__ = false;
                                           pushed.set(result__);
                                           if(callback && callback.apply) callback(); return;
                                         });
                                         
                                       });
                                     } : null;
if(val108 !== null) {
  subs__.addSub(mobl.domBind(el, 'tap', val108));
}

var nodes174 = $("<span>");
el.append(nodes174);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl56();
}));

function renderControl56() {
  subs__.addSub((elements)(function(elements, callback) {
    var root274 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root274); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes174;
    nodes174 = node.contents();
    oldNodes.replaceWith(nodes174);
  }));
}
renderControl56();
root273.append(el);
callback(root273); return subs__;


return subs__;
};

mobl.ui.generic.checkBox = function(b, label, onchange, elements, callback) {
var root275 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node145 = $("<input>");
node145.attr('type', "checkbox");

var ref233 = b;
node145.attr('checked', !!ref233.get());
subs__.addSub(ref233.addEventListener('change', function(_, ref, val) {
  if(ref === ref233) node145.attr('checked', !!val);
}));
subs__.addSub(mobl.domBind(node145, 'change', function() {
  b.set(!!node145.attr('checked'));
}));

var val110 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              if(callback && callback.apply) callback(); return;
            };
if(val110 !== null) {
  subs__.addSub(mobl.domBind(node145, 'tap', val110));
}

var val111 = onchange.get();
if(val111 !== null) {
  subs__.addSub(mobl.domBind(node145, 'change', val111));
}

root275.append(node145);

root275.append(" ");

var node146 = $("<span>");

var ref232 = label;
node146.text(""+ref232.get());
var ignore40 = false;
subs__.addSub(ref232.addEventListener('change', function(_, ref, val) {
  if(ignore40) return;
  node146.text(""+val);
}));
subs__.addSub(ref232.rebind());


var val109 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = !b.get();
              b.set(result__);
              var result__ = onchange.get();
              if(result__) {
                function after35(result__) {
                  var tmp412 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onchange.get()(null, after35);if(result__ !== undefined) after35(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val109 !== null) {
  subs__.addSub(mobl.domBind(node146, 'tap', val109));
}

root275.append(node146);
callback(root275); return subs__;


return subs__;
};
mobl.ui.generic.textFieldStyle = 'mobl__ui__generic__textFieldStyle';
mobl.ui.generic.textFieldInvalidStyle = 'mobl__ui__generic__textFieldInvalidStyle';
mobl.ui.generic.textFieldLabelStyle = 'mobl__ui__generic__textFieldLabelStyle';
mobl.ui.generic.validationMessageStyle = 'mobl__ui__generic__validationMessageStyle';
mobl.ui.generic.alwaysOkValidator = function(s) {
   var __this = this;
  return "";
};


mobl.ui.generic.textField = function(s, placeholder, label, inputType, validator, style, invalidStyle, autofocus, autocorrect, autocapitalize, autocomplete, onchange, onkeyup, elements, callback) {
var root276 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node147 = $("<span>");
root276.append(node147);
var condSubs35 = new mobl.CompSubscription();
subs__.addSub(condSubs35);
var oldValue35;
var renderCond35 = function() {
  var value151 = label.get();
  if(oldValue35 === value151) return;
  oldValue35 = value151;
  var subs__ = condSubs35;
  subs__.unsubscribe();
  node147.empty();
  if(value151) {
    var nodes175 = $("<span>");
    node147.append(nodes175);
    subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
      var root277 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root277); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes175;
      nodes175 = node.contents();
      oldNodes.replaceWith(nodes175);
    }));
    
    
  } else {
    
  }
};
renderCond35();
subs__.addSub(label.addEventListener('change', function() {
  renderCond35();
}));


var node148 = $("<span>");
root276.append(node148);
var condSubs36 = new mobl.CompSubscription();
subs__.addSub(condSubs36);
var oldValue36;
var renderCond36 = function() {
  var value152 = validator.get();
  if(oldValue36 === value152) return;
  oldValue36 = value152;
  var subs__ = condSubs36;
  subs__.unsubscribe();
  node148.empty();
  if(value152) {
    
    var temp = mobl.ref(s.get());
    
    var identifier = mobl.ref(mobl.random(999));
    function after39(result__) {
      var tmp413 = result__;
      var validationMessage = mobl.ref(result__);
      mobl.sleep(200, function(result__) {
        var tmp414 = result__;
        var result__ = mobl.setValidationError(identifier.get(), !validationMessage.get());
        
      });
      
      var node149 = $("<input>");
      
      var ref234 = inputType;
      if(ref234.get() !== null) {
        node149.attr('type', ref234.get());
        subs__.addSub(ref234.addEventListener('change', function(_, ref, val) {
          node149.attr('type', val);
        }));
        
      }
      subs__.addSub(ref234.rebind());
      
      var ref235 = mobl.ref(validationMessage.get() ? invalidStyle.get() : style.get());
      if(ref235.get() !== null) {
        node149.attr('class', ref235.get());
        subs__.addSub(ref235.addEventListener('change', function(_, ref, val) {
          node149.attr('class', val);
        }));
        subs__.addSub(validationMessage.addEventListener('change', function() {
          node149.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(invalidStyle.addEventListener('change', function() {
          node149.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(style.addEventListener('change', function() {
          node149.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        
      }
      subs__.addSub(ref235.rebind());
      
      var ref236 = placeholder;
      if(ref236.get() !== null) {
        node149.attr('placeholder', ref236.get());
        subs__.addSub(ref236.addEventListener('change', function(_, ref, val) {
          node149.attr('placeholder', val);
        }));
        
      }
      subs__.addSub(ref236.rebind());
      
      var ref237 = temp;
      node149.val(""+ref237.get());
      var ignore41 = false;
      subs__.addSub(ref237.addEventListener('change', function(_, ref, val) {
        if(ignore41) return;
        node149.val(""+val);
      }));
      subs__.addSub(ref237.rebind());
      
      subs__.addSub(mobl.domBind(node149, 'keyup change', function() {
        ignore41 = true;
        temp.set(mobl.stringTomobl__String(node149.val()));
        ignore41 = false;
      }));
      
      
      var val112 = onchange.get();
      if(val112 !== null) {
        subs__.addSub(mobl.domBind(node149, 'change', val112));
      }
      
      var val113 = function(event, callback) {
                    if(event && event.stopPropagation) event.stopPropagation();
                    var result__ = onkeyup.get();
                    if(result__) {
                      function after36(result__) {
                        var tmp415 = result__;
                        function after37(result__) {
                          var tmp416 = result__;
                          var result__ = tmp416;
                          validationMessage.set(result__);
                          var result__ = !validationMessage.get();
                          if(result__) {
                            var result__ = temp.get();
                            s.set(result__);
                            var result__ = mobl.setValidationError(identifier.get(), !validationMessage.get());
                            if(callback && callback.apply) callback(); return;
                          } else {
                            {
                              var result__ = mobl.setValidationError(identifier.get(), !validationMessage.get());
                              if(callback && callback.apply) callback(); return;
                            }
                          }
                        }
                        var result__ = validator.get()(temp.get(), after37);if(result__ !== undefined) after37(result__);
                      }
                      var result__ = onkeyup.get()(event, after36);if(result__ !== undefined) after36(result__);
                    } else {
                      {
                        function after38(result__) {
                          var tmp416 = result__;
                          var result__ = tmp416;
                          validationMessage.set(result__);
                          var result__ = !validationMessage.get();
                          if(result__) {
                            var result__ = temp.get();
                            s.set(result__);
                            var result__ = mobl.setValidationError(identifier.get(), !validationMessage.get());
                            if(callback && callback.apply) callback(); return;
                          } else {
                            {
                              var result__ = mobl.setValidationError(identifier.get(), !validationMessage.get());
                              if(callback && callback.apply) callback(); return;
                            }
                          }
                        }
                        var result__ = validator.get()(temp.get(), after38);if(result__ !== undefined) after38(result__);
                      }
                    }
                  };
      if(val113 !== null) {
        subs__.addSub(mobl.domBind(node149, 'keyup', val113));
      }
      
      var ref238 = autofocus;
      if(ref238.get() !== null) {
        node149.attr('autofocus', ref238.get());
        subs__.addSub(ref238.addEventListener('change', function(_, ref, val) {
          node149.attr('autofocus', val);
        }));
        
      }
      subs__.addSub(ref238.rebind());
      
      var ref239 = autocorrect;
      if(ref239.get() !== null) {
        node149.attr('autocorrect', ref239.get());
        subs__.addSub(ref239.addEventListener('change', function(_, ref, val) {
          node149.attr('autocorrect', val);
        }));
        
      }
      subs__.addSub(ref239.rebind());
      
      var ref240 = autocapitalize;
      if(ref240.get() !== null) {
        node149.attr('autocapitalize', ref240.get());
        subs__.addSub(ref240.addEventListener('change', function(_, ref, val) {
          node149.attr('autocapitalize', val);
        }));
        
      }
      subs__.addSub(ref240.rebind());
      
      var ref241 = autocomplete;
      if(ref241.get() !== null) {
        node149.attr('autocomplete', ref241.get());
        subs__.addSub(ref241.addEventListener('change', function(_, ref, val) {
          node149.attr('autocomplete', val);
        }));
        
      }
      subs__.addSub(ref241.rebind());
      
      node148.append(node149);
      var nodes176 = $("<span>");
      node148.append(nodes176);
      subs__.addSub((mobl.label)(validationMessage, mobl.ref(mobl.ui.generic.validationMessageStyle), mobl.ref(null), function(_, callback) {
        var root278 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root278); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes176;
        nodes176 = node.contents();
        oldNodes.replaceWith(nodes176);
      }));
      
      
      
      
    }
    var result__ = validator.get()(s.get(), after39);if(result__ !== undefined) after39(result__);
  } else {
    
    var node150 = $("<input>");
    
    var ref242 = inputType;
    if(ref242.get() !== null) {
      node150.attr('type', ref242.get());
      subs__.addSub(ref242.addEventListener('change', function(_, ref, val) {
        node150.attr('type', val);
      }));
      
    }
    subs__.addSub(ref242.rebind());
    
    var ref243 = style;
    if(ref243.get() !== null) {
      node150.attr('class', ref243.get());
      subs__.addSub(ref243.addEventListener('change', function(_, ref, val) {
        node150.attr('class', val);
      }));
      
    }
    subs__.addSub(ref243.rebind());
    
    var ref244 = placeholder;
    if(ref244.get() !== null) {
      node150.attr('placeholder', ref244.get());
      subs__.addSub(ref244.addEventListener('change', function(_, ref, val) {
        node150.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref244.rebind());
    
    var ref245 = s;
    node150.val(""+ref245.get());
    var ignore42 = false;
    subs__.addSub(ref245.addEventListener('change', function(_, ref, val) {
      if(ignore42) return;
      node150.val(""+val);
    }));
    subs__.addSub(ref245.rebind());
    
    subs__.addSub(mobl.domBind(node150, 'keyup change', function() {
      ignore42 = true;
      s.set(mobl.stringTomobl__String(node150.val()));
      ignore42 = false;
    }));
    
    
    var val114 = onchange.get();
    if(val114 !== null) {
      subs__.addSub(mobl.domBind(node150, 'change', val114));
    }
    
    var val115 = onkeyup.get();
    if(val115 !== null) {
      subs__.addSub(mobl.domBind(node150, 'keyup', val115));
    }
    
    var ref246 = autofocus;
    if(ref246.get() !== null) {
      node150.attr('autofocus', ref246.get());
      subs__.addSub(ref246.addEventListener('change', function(_, ref, val) {
        node150.attr('autofocus', val);
      }));
      
    }
    subs__.addSub(ref246.rebind());
    
    var ref247 = autocorrect;
    if(ref247.get() !== null) {
      node150.attr('autocorrect', ref247.get());
      subs__.addSub(ref247.addEventListener('change', function(_, ref, val) {
        node150.attr('autocorrect', val);
      }));
      
    }
    subs__.addSub(ref247.rebind());
    
    var ref248 = autocapitalize;
    if(ref248.get() !== null) {
      node150.attr('autocapitalize', ref248.get());
      subs__.addSub(ref248.addEventListener('change', function(_, ref, val) {
        node150.attr('autocapitalize', val);
      }));
      
    }
    subs__.addSub(ref248.rebind());
    
    var ref249 = autocomplete;
    if(ref249.get() !== null) {
      node150.attr('autocomplete', ref249.get());
      subs__.addSub(ref249.addEventListener('change', function(_, ref, val) {
        node150.attr('autocomplete', val);
      }));
      
    }
    subs__.addSub(ref249.rebind());
    
    node148.append(node150);
    
    
  }
};
renderCond36();
subs__.addSub(validator.addEventListener('change', function() {
  renderCond36();
}));

callback(root276); return subs__;


return subs__;
};

mobl.ui.generic.emailField = function(s, placeholder, label, validator, style, invalidStyle, autofocus, onchange, onkeyup, elements, callback) {
var root279 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes177 = $("<span>");
root279.append(nodes177);
subs__.addSub((mobl.ui.generic.textField)(s, placeholder, label, mobl.ref("email"), validator, style, invalidStyle, autofocus, mobl.ref(false), mobl.ref(false), mobl.ref(false), onchange, onkeyup, function(_, callback) {
  var root280 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root280); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes177;
  nodes177 = node.contents();
  oldNodes.replaceWith(nodes177);
}));
callback(root279); return subs__;

return subs__;
};

mobl.ui.generic.telField = function(phoneNumber, placeholder, label, validator, style, invalidStyle, autofocus, onchange, onkeyup, elements, callback) {
var root281 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes178 = $("<span>");
root281.append(nodes178);
subs__.addSub((mobl.ui.generic.textField)(phoneNumber, placeholder, label, mobl.ref("tel"), validator, style, invalidStyle, autofocus, mobl.ref(false), mobl.ref(false), mobl.ref(false), onchange, onkeyup, function(_, callback) {
  var root282 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root282); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes178;
  nodes178 = node.contents();
  oldNodes.replaceWith(nodes178);
}));
callback(root281); return subs__;

return subs__;
};

mobl.ui.generic.rangeField = function(n, min, max, step, placeholder, label, onchange, onkeyup, elements, callback) {
var root283 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node151 = $("<span>");
root283.append(node151);
var condSubs37 = new mobl.CompSubscription();
subs__.addSub(condSubs37);
var oldValue37;
var renderCond37 = function() {
  var value153 = label.get();
  if(oldValue37 === value153) return;
  oldValue37 = value153;
  var subs__ = condSubs37;
  subs__.unsubscribe();
  node151.empty();
  if(value153) {
    var nodes179 = $("<span>");
    node151.append(nodes179);
    subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
      var root284 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root284); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes179;
      nodes179 = node.contents();
      oldNodes.replaceWith(nodes179);
    }));
    
    
  } else {
    
  }
};
renderCond37();
subs__.addSub(label.addEventListener('change', function() {
  renderCond37();
}));


var node152 = $("<input>");
node152.attr('type', "range");

var ref250 = n;
node152.val(""+ref250.get());
var ignore43 = false;
subs__.addSub(ref250.addEventListener('change', function(_, ref, val) {
  if(ignore43) return;
  node152.val(""+val);
}));
subs__.addSub(ref250.rebind());

subs__.addSub(mobl.domBind(node152, 'keyup change', function() {
  ignore43 = true;
  n.set(mobl.stringTomobl__Num(node152.val()));
  ignore43 = false;
}));


var ref251 = min;
if(ref251.get() !== null) {
  node152.attr('min', ref251.get());
  subs__.addSub(ref251.addEventListener('change', function(_, ref, val) {
    node152.attr('min', val);
  }));
  
}
subs__.addSub(ref251.rebind());

var ref252 = max;
if(ref252.get() !== null) {
  node152.attr('max', ref252.get());
  subs__.addSub(ref252.addEventListener('change', function(_, ref, val) {
    node152.attr('max', val);
  }));
  
}
subs__.addSub(ref252.rebind());

var ref253 = step;
if(ref253.get() !== null) {
  node152.attr('step', ref253.get());
  subs__.addSub(ref253.addEventListener('change', function(_, ref, val) {
    node152.attr('step', val);
  }));
  
}
subs__.addSub(ref253.rebind());
node152.attr('style', "width: 99%;");

var val116 = onchange.get();
if(val116 !== null) {
  subs__.addSub(mobl.domBind(node152, 'change', val116));
}

var val117 = onkeyup.get();
if(val117 !== null) {
  subs__.addSub(mobl.domBind(node152, 'keyup', val117));
}

var ref254 = placeholder;
if(ref254.get() !== null) {
  node152.attr('placeholder', ref254.get());
  subs__.addSub(ref254.addEventListener('change', function(_, ref, val) {
    node152.attr('placeholder', val);
  }));
  
}
subs__.addSub(ref254.rebind());

root283.append(node152);
callback(root283); return subs__;


return subs__;
};

mobl.ui.generic.numField = function(n, label, placeholder, validator, style, invalidStyle, autofocus, step, min, max, onchange, onkeyup, elements, callback) {
var root285 = $("<span>");
var subs__ = new mobl.CompSubscription();

var validateNum = function(n) {
   var __this = this;
  if(mobl.Math.isNaN(n)) {
    return mobl._("Not a valid numeric value", []);
  } else if(max.get() != null && n > max.get()) {
    return mobl._("Number is too high, maximum is: %%", [max.get()]);
  } else if(min.get() != null && n < min.get()) {
    return mobl._("Number is too low, minimum is: %%", [min.get()]);
  } else {
    return "";
  }
};


var result__ = validator.get() == null;
if(result__) {
  var result__ = validateNum;
  validator.set(result__);
  function after42(result__) {
    var tmp417 = result__;
    var validationMessage = mobl.ref(result__);
    
    var node153 = $("<span>");
    root285.append(node153);
    var condSubs38 = new mobl.CompSubscription();
    subs__.addSub(condSubs38);
    var oldValue38;
    var renderCond38 = function() {
      var value154 = label.get();
      if(oldValue38 === value154) return;
      oldValue38 = value154;
      var subs__ = condSubs38;
      subs__.unsubscribe();
      node153.empty();
      if(value154) {
        var nodes180 = $("<span>");
        node153.append(nodes180);
        subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
          var root286 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root286); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes180;
          nodes180 = node.contents();
          oldNodes.replaceWith(nodes180);
        }));
        
        
      } else {
        
      }
    };
    renderCond38();
    subs__.addSub(label.addEventListener('change', function() {
      renderCond38();
    }));
    
    
    var node154 = $("<input>");
    node154.attr('type', "number");
    
    var ref255 = mobl.ref(validationMessage.get() ? invalidStyle.get() : style.get());
    if(ref255.get() !== null) {
      node154.attr('class', ref255.get());
      subs__.addSub(ref255.addEventListener('change', function(_, ref, val) {
        node154.attr('class', val);
      }));
      subs__.addSub(validationMessage.addEventListener('change', function() {
        node154.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
      }));
      subs__.addSub(invalidStyle.addEventListener('change', function() {
        node154.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
      }));
      subs__.addSub(style.addEventListener('change', function() {
        node154.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
      }));
      
    }
    subs__.addSub(ref255.rebind());
    
    var ref256 = placeholder;
    if(ref256.get() !== null) {
      node154.attr('placeholder', ref256.get());
      subs__.addSub(ref256.addEventListener('change', function(_, ref, val) {
        node154.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref256.rebind());
    
    var ref257 = n;
    node154.val(""+ref257.get());
    var ignore44 = false;
    subs__.addSub(ref257.addEventListener('change', function(_, ref, val) {
      if(ignore44) return;
      node154.val(""+val);
    }));
    subs__.addSub(ref257.rebind());
    
    subs__.addSub(mobl.domBind(node154, 'keyup change', function() {
      ignore44 = true;
      n.set(mobl.stringTomobl__Num(node154.val()));
      ignore44 = false;
    }));
    
    
    var val118 = onchange.get();
    if(val118 !== null) {
      subs__.addSub(mobl.domBind(node154, 'change', val118));
    }
    
    var val119 = function(event, callback) {
                  if(event && event.stopPropagation) event.stopPropagation();
                  function after40(result__) {
                    var tmp418 = result__;
                    var result__ = tmp418;
                    validationMessage.set(result__);
                    var result__ = onkeyup.get();
                    if(result__) {
                      function after41(result__) {
                        var tmp419 = result__;
                        if(callback && callback.apply) callback(); return;
                      }
                      var result__ = onkeyup.get()(event, after41);if(result__ !== undefined) after41(result__);
                    } else {
                      {
                        if(callback && callback.apply) callback(); return;
                      }
                    }
                  }
                  var result__ = validator.get()(n.get(), after40);if(result__ !== undefined) after40(result__);
                };
    if(val119 !== null) {
      subs__.addSub(mobl.domBind(node154, 'keyup', val119));
    }
    
    var ref258 = autofocus;
    if(ref258.get() !== null) {
      node154.attr('autofocus', ref258.get());
      subs__.addSub(ref258.addEventListener('change', function(_, ref, val) {
        node154.attr('autofocus', val);
      }));
      
    }
    subs__.addSub(ref258.rebind());
    
    var ref259 = step;
    if(ref259.get() !== null) {
      node154.attr('step', ref259.get());
      subs__.addSub(ref259.addEventListener('change', function(_, ref, val) {
        node154.attr('step', val);
      }));
      
    }
    subs__.addSub(ref259.rebind());
    
    var ref260 = min;
    if(ref260.get() !== null) {
      node154.attr('min', ref260.get());
      subs__.addSub(ref260.addEventListener('change', function(_, ref, val) {
        node154.attr('min', val);
      }));
      
    }
    subs__.addSub(ref260.rebind());
    
    var ref261 = max;
    if(ref261.get() !== null) {
      node154.attr('max', ref261.get());
      subs__.addSub(ref261.addEventListener('change', function(_, ref, val) {
        node154.attr('max', val);
      }));
      
    }
    subs__.addSub(ref261.rebind());
    
    root285.append(node154);
    var nodes181 = $("<span>");
    root285.append(nodes181);
    subs__.addSub((mobl.label)(validationMessage, mobl.ref(mobl.ui.generic.validationMessageStyle), mobl.ref(null), function(_, callback) {
      var root287 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root287); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes181;
      nodes181 = node.contents();
      oldNodes.replaceWith(nodes181);
    }));
    callback(root285); return subs__;
    
    
    
  }
  var result__ = validator.get()(n.get(), after42);if(result__ !== undefined) after42(result__);
} else {
  {
    function after42(result__) {
      var tmp417 = result__;
      var validationMessage = mobl.ref(result__);
      
      var node153 = $("<span>");
      root285.append(node153);
      var condSubs38 = new mobl.CompSubscription();
      subs__.addSub(condSubs38);
      var oldValue38;
      var renderCond38 = function() {
        var value154 = label.get();
        if(oldValue38 === value154) return;
        oldValue38 = value154;
        var subs__ = condSubs38;
        subs__.unsubscribe();
        node153.empty();
        if(value154) {
          var nodes180 = $("<span>");
          node153.append(nodes180);
          subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
            var root286 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            callback(root286); return subs__;
            return subs__;
          }, function(node) {
            var oldNodes = nodes180;
            nodes180 = node.contents();
            oldNodes.replaceWith(nodes180);
          }));
          
          
        } else {
          
        }
      };
      renderCond38();
      subs__.addSub(label.addEventListener('change', function() {
        renderCond38();
      }));
      
      
      var node154 = $("<input>");
      node154.attr('type', "number");
      
      var ref255 = mobl.ref(validationMessage.get() ? invalidStyle.get() : style.get());
      if(ref255.get() !== null) {
        node154.attr('class', ref255.get());
        subs__.addSub(ref255.addEventListener('change', function(_, ref, val) {
          node154.attr('class', val);
        }));
        subs__.addSub(validationMessage.addEventListener('change', function() {
          node154.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(invalidStyle.addEventListener('change', function() {
          node154.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(style.addEventListener('change', function() {
          node154.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        
      }
      subs__.addSub(ref255.rebind());
      
      var ref256 = placeholder;
      if(ref256.get() !== null) {
        node154.attr('placeholder', ref256.get());
        subs__.addSub(ref256.addEventListener('change', function(_, ref, val) {
          node154.attr('placeholder', val);
        }));
        
      }
      subs__.addSub(ref256.rebind());
      
      var ref257 = n;
      node154.val(""+ref257.get());
      var ignore44 = false;
      subs__.addSub(ref257.addEventListener('change', function(_, ref, val) {
        if(ignore44) return;
        node154.val(""+val);
      }));
      subs__.addSub(ref257.rebind());
      
      subs__.addSub(mobl.domBind(node154, 'keyup change', function() {
        ignore44 = true;
        n.set(mobl.stringTomobl__Num(node154.val()));
        ignore44 = false;
      }));
      
      
      var val118 = onchange.get();
      if(val118 !== null) {
        subs__.addSub(mobl.domBind(node154, 'change', val118));
      }
      
      var val119 = function(event, callback) {
                    if(event && event.stopPropagation) event.stopPropagation();
                    function after40(result__) {
                      var tmp418 = result__;
                      var result__ = tmp418;
                      validationMessage.set(result__);
                      var result__ = onkeyup.get();
                      if(result__) {
                        function after41(result__) {
                          var tmp419 = result__;
                          if(callback && callback.apply) callback(); return;
                        }
                        var result__ = onkeyup.get()(event, after41);if(result__ !== undefined) after41(result__);
                      } else {
                        {
                          if(callback && callback.apply) callback(); return;
                        }
                      }
                    }
                    var result__ = validator.get()(n.get(), after40);if(result__ !== undefined) after40(result__);
                  };
      if(val119 !== null) {
        subs__.addSub(mobl.domBind(node154, 'keyup', val119));
      }
      
      var ref258 = autofocus;
      if(ref258.get() !== null) {
        node154.attr('autofocus', ref258.get());
        subs__.addSub(ref258.addEventListener('change', function(_, ref, val) {
          node154.attr('autofocus', val);
        }));
        
      }
      subs__.addSub(ref258.rebind());
      
      var ref259 = step;
      if(ref259.get() !== null) {
        node154.attr('step', ref259.get());
        subs__.addSub(ref259.addEventListener('change', function(_, ref, val) {
          node154.attr('step', val);
        }));
        
      }
      subs__.addSub(ref259.rebind());
      
      var ref260 = min;
      if(ref260.get() !== null) {
        node154.attr('min', ref260.get());
        subs__.addSub(ref260.addEventListener('change', function(_, ref, val) {
          node154.attr('min', val);
        }));
        
      }
      subs__.addSub(ref260.rebind());
      
      var ref261 = max;
      if(ref261.get() !== null) {
        node154.attr('max', ref261.get());
        subs__.addSub(ref261.addEventListener('change', function(_, ref, val) {
          node154.attr('max', val);
        }));
        
      }
      subs__.addSub(ref261.rebind());
      
      root285.append(node154);
      var nodes181 = $("<span>");
      root285.append(nodes181);
      subs__.addSub((mobl.label)(validationMessage, mobl.ref(mobl.ui.generic.validationMessageStyle), mobl.ref(null), function(_, callback) {
        var root287 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root287); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes181;
        nodes181 = node.contents();
        oldNodes.replaceWith(nodes181);
      }));
      callback(root285); return subs__;
      
      
      
    }
    var result__ = validator.get()(n.get(), after42);if(result__ !== undefined) after42(result__);
  }
}
return subs__;
};

mobl.ui.generic.passwordField = function(s, placeholder, label, style, onchange, onkeyup, elements, callback) {
var root288 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node155 = $("<span>");
root288.append(node155);
var condSubs39 = new mobl.CompSubscription();
subs__.addSub(condSubs39);
var oldValue39;
var renderCond39 = function() {
  var value155 = label.get();
  if(oldValue39 === value155) return;
  oldValue39 = value155;
  var subs__ = condSubs39;
  subs__.unsubscribe();
  node155.empty();
  if(value155) {
    
    var node156 = $("<span>");
    node156.attr('style', "float: left; margin-top: 0.2em; width: 5em; color: #666;");
    
    var ref265 = label;
    node156.text(""+ref265.get());
    var ignore46 = false;
    subs__.addSub(ref265.addEventListener('change', function(_, ref, val) {
      if(ignore46) return;
      node156.text(""+val);
    }));
    subs__.addSub(ref265.rebind());
    
    
    node155.append(node156);
    
    var node157 = $("<span>");
    node157.attr('style', "float: left");
    
    
    var node158 = $("<input>");
    node158.attr('type', "password");
    
    var ref262 = style;
    if(ref262.get() !== null) {
      node158.attr('class', ref262.get());
      subs__.addSub(ref262.addEventListener('change', function(_, ref, val) {
        node158.attr('class', val);
      }));
      
    }
    subs__.addSub(ref262.rebind());
    
    var ref263 = placeholder;
    if(ref263.get() !== null) {
      node158.attr('placeholder', ref263.get());
      subs__.addSub(ref263.addEventListener('change', function(_, ref, val) {
        node158.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref263.rebind());
    
    var ref264 = s;
    node158.val(""+ref264.get());
    var ignore45 = false;
    subs__.addSub(ref264.addEventListener('change', function(_, ref, val) {
      if(ignore45) return;
      node158.val(""+val);
    }));
    subs__.addSub(ref264.rebind());
    
    subs__.addSub(mobl.domBind(node158, 'keyup change', function() {
      ignore45 = true;
      s.set(mobl.stringTomobl__String(node158.val()));
      ignore45 = false;
    }));
    
    
    var val120 = onchange.get();
    if(val120 !== null) {
      subs__.addSub(mobl.domBind(node158, 'change', val120));
    }
    
    var val121 = onkeyup.get();
    if(val121 !== null) {
      subs__.addSub(mobl.domBind(node158, 'keyup', val121));
    }
    
    var val122 = function(event, callback) {
                  if(event && event.stopPropagation) event.stopPropagation();
                  var result__ = mobl.ui.generic.scrollUp();
                  if(callback && callback.apply) callback(); return;
                };
    if(val122 !== null) {
      subs__.addSub(mobl.domBind(node158, 'blur', val122));
    }
    
    node157.append(node158);
    node155.append(node157);
    
    
    
    
  } else {
    
    var node159 = $("<input>");
    node159.attr('type', "password");
    
    var ref266 = style;
    if(ref266.get() !== null) {
      node159.attr('class', ref266.get());
      subs__.addSub(ref266.addEventListener('change', function(_, ref, val) {
        node159.attr('class', val);
      }));
      
    }
    subs__.addSub(ref266.rebind());
    
    var ref267 = placeholder;
    if(ref267.get() !== null) {
      node159.attr('placeholder', ref267.get());
      subs__.addSub(ref267.addEventListener('change', function(_, ref, val) {
        node159.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref267.rebind());
    
    var ref268 = s;
    node159.val(""+ref268.get());
    var ignore47 = false;
    subs__.addSub(ref268.addEventListener('change', function(_, ref, val) {
      if(ignore47) return;
      node159.val(""+val);
    }));
    subs__.addSub(ref268.rebind());
    
    subs__.addSub(mobl.domBind(node159, 'keyup change', function() {
      ignore47 = true;
      s.set(mobl.stringTomobl__String(node159.val()));
      ignore47 = false;
    }));
    
    
    var val123 = onchange.get();
    if(val123 !== null) {
      subs__.addSub(mobl.domBind(node159, 'change', val123));
    }
    
    var val124 = onkeyup.get();
    if(val124 !== null) {
      subs__.addSub(mobl.domBind(node159, 'keyup', val124));
    }
    
    var val125 = function(event, callback) {
                  if(event && event.stopPropagation) event.stopPropagation();
                  var result__ = mobl.ui.generic.scrollUp();
                  if(callback && callback.apply) callback(); return;
                };
    if(val125 !== null) {
      subs__.addSub(mobl.domBind(node159, 'blur', val125));
    }
    
    node155.append(node159);
    
    
  }
};
renderCond39();
subs__.addSub(label.addEventListener('change', function() {
  renderCond39();
}));

callback(root288); return subs__;

return subs__;
};
mobl.ui.generic.selectFieldStyle = 'mobl__ui__generic__selectFieldStyle';

mobl.ui.generic.selectField = function(value, options, onchange, style, optionStyle, elements, callback) {
var root289 = $("<span>");
var subs__ = new mobl.CompSubscription();

var sel = $("<select>");

var ref273 = style;
if(ref273.get() !== null) {
  sel.attr('class', ref273.get());
  subs__.addSub(ref273.addEventListener('change', function(_, ref, val) {
    sel.attr('class', val);
  }));
  
}
subs__.addSub(ref273.rebind());

var val126 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = sel.val();
              value.set(result__);
              var result__ = onchange.get();
              if(result__) {
                function after43(result__) {
                  var tmp421 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onchange.get()(event, after43);if(result__ !== undefined) after43(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val126 !== null) {
  subs__.addSub(mobl.domBind(sel, 'change', val126));
}


var node160 = mobl.loadingSpan();
sel.append(node160);
var list20;
var listSubs20 = new mobl.CompSubscription();
subs__.addSub(listSubs20);
var renderList20 = function() {
  var subs__ = listSubs20;
  list20 = options.get();
  list20.list(function(results20) {
    node160.empty();
    for(var i20 = 0; i20 < results20.length; i20++) {
      (function() {
        var iternode20 = $("<span>");
        node160.append(iternode20);
        var optionValue;var optionDescription;
        optionValue = mobl.ref(mobl.ref(mobl.ref(results20), i20), "_1");optionDescription = mobl.ref(mobl.ref(mobl.ref(results20), i20), "_2");
        
        var node161 = $("<option>");
        
        var ref269 = optionDescription;
        node161.text(""+ref269.get());
        var ignore48 = false;
        subs__.addSub(ref269.addEventListener('change', function(_, ref, val) {
          if(ignore48) return;
          node161.text(""+val);
        }));
        subs__.addSub(ref269.rebind());
        
        
        var ref270 = optionStyle;
        if(ref270.get() !== null) {
          node161.attr('class', ref270.get());
          subs__.addSub(ref270.addEventListener('change', function(_, ref, val) {
            node161.attr('class', val);
          }));
          
        }
        subs__.addSub(ref270.rebind());
        
        var ref271 = optionValue;
        if(ref271.get() !== null) {
          node161.attr('value', ref271.get());
          subs__.addSub(ref271.addEventListener('change', function(_, ref, val) {
            node161.attr('value', val);
          }));
          
        }
        subs__.addSub(ref271.rebind());
        
        var ref272 = mobl.ref(value.get() == optionValue.get() ? "selected" : "");
        if(ref272.get() !== null) {
          node161.attr('selected', ref272.get());
          subs__.addSub(ref272.addEventListener('change', function(_, ref, val) {
            node161.attr('selected', val);
          }));
          subs__.addSub(value.addEventListener('change', function() {
            node161.attr('selected', value.get() == optionValue.get() ? "selected" : "");
          }));
          subs__.addSub(optionValue.addEventListener('change', function() {
            node161.attr('selected', value.get() == optionValue.get() ? "selected" : "");
          }));
          
        }
        subs__.addSub(ref272.rebind());
        
        iternode20.append(node161);
        
        var oldNodes = iternode20;
        iternode20 = iternode20.contents();
        oldNodes.replaceWith(iternode20);
        
        
      }());
    }
    mobl.delayedUpdateScrollers();
    subs__.addSub(list20.addEventListener('change', function() { listSubs20.unsubscribe(); renderList20(true); }));
    subs__.addSub(options.addEventListener('change', function() { listSubs20.unsubscribe(); renderList20(true); }));
  });
};
renderList20();

root289.append(sel);
var result__ = sel.append(sel.children().eq(0).children());
callback(root289); return subs__;


return subs__;
};
mobl.ui.generic.tabbarStyle = 'mobl__ui__generic__tabbarStyle';
mobl.ui.generic.inActiveTabButtonStyle = 'mobl__ui__generic__inActiveTabButtonStyle';
mobl.ui.generic.activeTabButtonStyle = 'mobl__ui__generic__activeTabButtonStyle';
mobl.ui.generic.inActiveTabStyle = 'mobl__ui__generic__inActiveTabStyle';
mobl.ui.generic.activeTabStyle = 'mobl__ui__generic__activeTabStyle';

mobl.ui.generic.tabSet = function(tabs, activeTab, screenContextId, elements, callback) {
var root290 = $("<span>");
var subs__ = new mobl.CompSubscription();
var result__ = activeTab.get() == null;
if(result__) {
  var result__ = tabs.get().get(0)._1;
  activeTab.set(result__);
  
  var s = mobl.ref("");
  var nodes182 = $("<span>");
  root290.append(nodes182);
  subs__.addSub((mobl.block)(mobl.ref(mobl.ui.generic.tabbarStyle), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root291 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    var node162 = mobl.loadingSpan();
    root291.append(node162);
    var list21;
    var listSubs21 = new mobl.CompSubscription();
    subs__.addSub(listSubs21);
    var renderList21 = function() {
      var subs__ = listSubs21;
      list21 = tabs.get();
      list21.list(function(results21) {
        node162.empty();
        for(var i21 = 0; i21 < results21.length; i21++) {
          (function() {
            var iternode21 = $("<span>");
            node162.append(iternode21);
            var tabName;var tabIcon;var tabControl;
            tabName = mobl.ref(mobl.ref(mobl.ref(results21), i21), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results21), i21), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results21), i21), "_3");
            var result__ = function(event, callback) {
                             if(event && event.stopPropagation) event.stopPropagation();
                             var result__ = tabName.get();
                             activeTab.set(result__);
                             if(callback && callback.apply) callback(); return;
                           };
            var tmp387 = mobl.ref(result__);
            
            var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle;
            var tmp386 = mobl.ref(result__);
            subs__.addSub(activeTab.addEventListener('change', function() {
              tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            subs__.addSub(tabName.addEventListener('change', function() {
              tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.activeTabButtonStyle).addEventListener('change', function() {
              tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabButtonStyle).addEventListener('change', function() {
              tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            
            var nodes183 = $("<span>");
            iternode21.append(nodes183);
            subs__.addSub((mobl.span)(tmp386, mobl.ref(null), tmp387, mobl.ref(null), function(_, callback) {
              var root292 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var nodes184 = $("<span>");
              root292.append(nodes184);
              subs__.addSub((mobl.label)(tabName, mobl.ref(null), mobl.ref(null), function(_, callback) {
                var root293 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                callback(root293); return subs__;
                return subs__;
              }, function(node) {
                var oldNodes = nodes184;
                nodes184 = node.contents();
                oldNodes.replaceWith(nodes184);
              }));
              callback(root292); return subs__;
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes183;
              nodes183 = node.contents();
              oldNodes.replaceWith(nodes183);
            }));
            
            var oldNodes = iternode21;
            iternode21 = iternode21.contents();
            oldNodes.replaceWith(iternode21);
            
            
          }());
        }
        mobl.delayedUpdateScrollers();
        subs__.addSub(list21.addEventListener('change', function() { listSubs21.unsubscribe(); renderList21(true); }));
        subs__.addSub(tabs.addEventListener('change', function() { listSubs21.unsubscribe(); renderList21(true); }));
      });
    };
    renderList21();
    
    callback(root291); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes182;
    nodes182 = node.contents();
    oldNodes.replaceWith(nodes182);
  }));
  
  var node163 = mobl.loadingSpan();
  root290.append(node163);
  var list22;
  var listSubs22 = new mobl.CompSubscription();
  subs__.addSub(listSubs22);
  var renderList22 = function() {
    var subs__ = listSubs22;
    list22 = tabs.get();
    list22.list(function(results22) {
      node163.empty();
      for(var i22 = 0; i22 < results22.length; i22++) {
        (function() {
          var iternode22 = $("<span>");
          node163.append(iternode22);
          var tabName;var tabIcon;var tabControl;
          tabName = mobl.ref(mobl.ref(mobl.ref(results22), i22), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results22), i22), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results22), i22), "_3");
          var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle;
          var tmp388 = mobl.ref(result__);
          subs__.addSub(activeTab.addEventListener('change', function() {
            tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          subs__.addSub(tabName.addEventListener('change', function() {
            tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.activeTabStyle).addEventListener('change', function() {
            tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabStyle).addEventListener('change', function() {
            tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          
          var nodes185 = $("<span>");
          iternode22.append(nodes185);
          subs__.addSub((mobl.block)(tmp388, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
            var root294 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes186 = $("<span>");
            root294.append(nodes186);
            subs__.addSub((mobl.screenContext)(screenContextId, function(_, callback) {
              var root295 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var nodes187 = $("<span>");
              root295.append(nodes187);
              subs__.addSub(tabControl.addEventListener('change', function() {
                renderControl57();
              }));
              
              function renderControl57() {
                subs__.addSub((tabControl.get())(function(elements, callback) {
                  var root296 = $("<span>");
                  var subs__ = new mobl.CompSubscription();
                  callback(root296); return subs__;
                  return subs__;
                }, function(node) {
                  var oldNodes = nodes187;
                  nodes187 = node.contents();
                  oldNodes.replaceWith(nodes187);
                }));
              }
              renderControl57();
              callback(root295); return subs__;
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes186;
              nodes186 = node.contents();
              oldNodes.replaceWith(nodes186);
            }));
            callback(root294); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes185;
            nodes185 = node.contents();
            oldNodes.replaceWith(nodes185);
          }));
          
          var oldNodes = iternode22;
          iternode22 = iternode22.contents();
          oldNodes.replaceWith(iternode22);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list22.addEventListener('change', function() { listSubs22.unsubscribe(); renderList22(true); }));
      subs__.addSub(tabs.addEventListener('change', function() { listSubs22.unsubscribe(); renderList22(true); }));
    });
  };
  renderList22();
  
  callback(root290); return subs__;
  
  
} else {
  {
    
    var s = mobl.ref("");
    var nodes182 = $("<span>");
    root290.append(nodes182);
    subs__.addSub((mobl.block)(mobl.ref(mobl.ui.generic.tabbarStyle), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root291 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      var node162 = mobl.loadingSpan();
      root291.append(node162);
      var list21;
      var listSubs21 = new mobl.CompSubscription();
      subs__.addSub(listSubs21);
      var renderList21 = function() {
        var subs__ = listSubs21;
        list21 = tabs.get();
        list21.list(function(results21) {
          node162.empty();
          for(var i21 = 0; i21 < results21.length; i21++) {
            (function() {
              var iternode21 = $("<span>");
              node162.append(iternode21);
              var tabName;var tabIcon;var tabControl;
              tabName = mobl.ref(mobl.ref(mobl.ref(results21), i21), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results21), i21), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results21), i21), "_3");
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               var result__ = tabName.get();
                               activeTab.set(result__);
                               if(callback && callback.apply) callback(); return;
                             };
              var tmp387 = mobl.ref(result__);
              
              var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle;
              var tmp386 = mobl.ref(result__);
              subs__.addSub(activeTab.addEventListener('change', function() {
                tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              subs__.addSub(tabName.addEventListener('change', function() {
                tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              subs__.addSub(mobl.ref(mobl.ui.generic.activeTabButtonStyle).addEventListener('change', function() {
                tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabButtonStyle).addEventListener('change', function() {
                tmp386.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              
              var nodes183 = $("<span>");
              iternode21.append(nodes183);
              subs__.addSub((mobl.span)(tmp386, mobl.ref(null), tmp387, mobl.ref(null), function(_, callback) {
                var root292 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes184 = $("<span>");
                root292.append(nodes184);
                subs__.addSub((mobl.label)(tabName, mobl.ref(null), mobl.ref(null), function(_, callback) {
                  var root293 = $("<span>");
                  var subs__ = new mobl.CompSubscription();
                  callback(root293); return subs__;
                  return subs__;
                }, function(node) {
                  var oldNodes = nodes184;
                  nodes184 = node.contents();
                  oldNodes.replaceWith(nodes184);
                }));
                callback(root292); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes183;
                nodes183 = node.contents();
                oldNodes.replaceWith(nodes183);
              }));
              
              var oldNodes = iternode21;
              iternode21 = iternode21.contents();
              oldNodes.replaceWith(iternode21);
              
              
            }());
          }
          mobl.delayedUpdateScrollers();
          subs__.addSub(list21.addEventListener('change', function() { listSubs21.unsubscribe(); renderList21(true); }));
          subs__.addSub(tabs.addEventListener('change', function() { listSubs21.unsubscribe(); renderList21(true); }));
        });
      };
      renderList21();
      
      callback(root291); return subs__;
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes182;
      nodes182 = node.contents();
      oldNodes.replaceWith(nodes182);
    }));
    
    var node163 = mobl.loadingSpan();
    root290.append(node163);
    var list22;
    var listSubs22 = new mobl.CompSubscription();
    subs__.addSub(listSubs22);
    var renderList22 = function() {
      var subs__ = listSubs22;
      list22 = tabs.get();
      list22.list(function(results22) {
        node163.empty();
        for(var i22 = 0; i22 < results22.length; i22++) {
          (function() {
            var iternode22 = $("<span>");
            node163.append(iternode22);
            var tabName;var tabIcon;var tabControl;
            tabName = mobl.ref(mobl.ref(mobl.ref(results22), i22), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results22), i22), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results22), i22), "_3");
            var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle;
            var tmp388 = mobl.ref(result__);
            subs__.addSub(activeTab.addEventListener('change', function() {
              tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            subs__.addSub(tabName.addEventListener('change', function() {
              tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.activeTabStyle).addEventListener('change', function() {
              tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabStyle).addEventListener('change', function() {
              tmp388.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            
            var nodes185 = $("<span>");
            iternode22.append(nodes185);
            subs__.addSub((mobl.block)(tmp388, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
              var root294 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var nodes186 = $("<span>");
              root294.append(nodes186);
              subs__.addSub((mobl.screenContext)(screenContextId, function(_, callback) {
                var root295 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes187 = $("<span>");
                root295.append(nodes187);
                subs__.addSub(tabControl.addEventListener('change', function() {
                  renderControl57();
                }));
                
                function renderControl57() {
                  subs__.addSub((tabControl.get())(function(elements, callback) {
                    var root296 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root296); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes187;
                    nodes187 = node.contents();
                    oldNodes.replaceWith(nodes187);
                  }));
                }
                renderControl57();
                callback(root295); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes186;
                nodes186 = node.contents();
                oldNodes.replaceWith(nodes186);
              }));
              callback(root294); return subs__;
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes185;
              nodes185 = node.contents();
              oldNodes.replaceWith(nodes185);
            }));
            
            var oldNodes = iternode22;
            iternode22 = iternode22.contents();
            oldNodes.replaceWith(iternode22);
            
            
          }());
        }
        mobl.delayedUpdateScrollers();
        subs__.addSub(list22.addEventListener('change', function() { listSubs22.unsubscribe(); renderList22(true); }));
        subs__.addSub(tabs.addEventListener('change', function() { listSubs22.unsubscribe(); renderList22(true); }));
      });
    };
    renderList22();
    
    callback(root290); return subs__;
    
    
  }
}
return subs__;
};
mobl.ui.generic.searchboxStyle = 'mobl__ui__generic__searchboxStyle';
mobl.ui.generic.searchBoxInputStyle = 'mobl__ui__generic__searchBoxInputStyle';

mobl.ui.generic.searchBox = function(s, placeholder, onsearch, onkeyup, elements, callback) {
var root297 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node164 = $("<div>");

var ref277 = mobl.ref(mobl.ui.generic.searchboxStyle);
if(ref277.get() !== null) {
  node164.attr('class', ref277.get());
  subs__.addSub(ref277.addEventListener('change', function(_, ref, val) {
    node164.attr('class', val);
  }));
  
}
subs__.addSub(ref277.rebind());


var node165 = $("<input>");
node165.attr('type', "search");

var ref274 = mobl.ref(mobl.ui.generic.searchBoxInputStyle);
if(ref274.get() !== null) {
  node165.attr('class', ref274.get());
  subs__.addSub(ref274.addEventListener('change', function(_, ref, val) {
    node165.attr('class', val);
  }));
  
}
subs__.addSub(ref274.rebind());

var ref275 = placeholder;
if(ref275.get() !== null) {
  node165.attr('placeholder', ref275.get());
  subs__.addSub(ref275.addEventListener('change', function(_, ref, val) {
    node165.attr('placeholder', val);
  }));
  
}
subs__.addSub(ref275.rebind());

var ref276 = s;
node165.val(""+ref276.get());
var ignore49 = false;
subs__.addSub(ref276.addEventListener('change', function(_, ref, val) {
  if(ignore49) return;
  node165.val(""+val);
}));
subs__.addSub(ref276.rebind());

subs__.addSub(mobl.domBind(node165, 'keyup change', function() {
  ignore49 = true;
  s.set(mobl.stringTomobl__String(node165.val()));
  ignore49 = false;
}));


var val127 = onsearch.get();
if(val127 !== null) {
  subs__.addSub(mobl.domBind(node165, 'change', val127));
}

var val128 = onkeyup.get();
if(val128 !== null) {
  subs__.addSub(mobl.domBind(node165, 'keyup', val128));
}
node165.attr('autocorrect', false);
node165.attr('autocapitalize', false);
node165.attr('autocomplete', false);

node164.append(node165);
root297.append(node164);
callback(root297); return subs__;


return subs__;
};
mobl.ui.generic.contextMenuStyle = 'mobl__ui__generic__contextMenuStyle';
mobl.ui.generic.buttonStyle = 'mobl__ui__generic__buttonStyle';
mobl.ui.generic.buttonPushedStyle = 'mobl__ui__generic__buttonPushedStyle';

mobl.ui.generic.contextMenu = function(elements, callback) {
var root298 = $("<span>");
var subs__ = new mobl.CompSubscription();

var menu = $("<div>");

var ref278 = mobl.ref(mobl.ui.generic.contextMenuStyle);
if(ref278.get() !== null) {
  menu.attr('class', ref278.get());
  subs__.addSub(ref278.addEventListener('change', function(_, ref, val) {
    menu.attr('class', val);
  }));
  
}
subs__.addSub(ref278.rebind());

var nodes188 = $("<span>");
menu.append(nodes188);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl58();
}));

function renderControl58() {
  subs__.addSub((elements)(function(elements, callback) {
    var root299 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root299); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes188;
    nodes188 = node.contents();
    oldNodes.replaceWith(nodes188);
  }));
}
renderControl58();
root298.append(menu);
var result__ = menu.hide();

var img = $("<img>");
img.attr('src', "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABIAAAASCAYAAABWzo5XAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAA0AAAANABeWPPlAAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAEuSURBVDiNrdSrTkNBEMbx35aLIhUNEl4CsCSkmgfBoOoJz0B4BhSSBEcQSMA3GBJE34Br6CA6heWUA4huMuLszvc/c9stEaG5Sil97GADm7l9g1tcRsTFjCgiPg09nCDSxhimjav9E/S+aSvINkbpeIU+utV5N/eu0meE7W+gjGSEFwzQqf/WiLqTPi+p6dWgaTqDNsAPwME0zWmd+1U6rZG0RDZNs9/J7sBBRIxnutGy0vcgP3cWTVocuC6lLGD9H5z3iHjAdWo3ZMGGVchHvtrcZnuV/zAZM6CCUzz9AHjGYaNWn6Azk2GrZ2YJlw3YI44bkG5qzzomY1+wVRXyDbu4w2sCz7HfqNVWam/5pf1YxX2eLf/W/j8HEmtY+XMg53pF5nZp5/GMlHk9bB8Ws56C3JDK8wAAAABJRU5ErkJggg==");
img.attr('style', "float: right;");

var val129 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = img.parent();
              var target = result__;
              var result__ = target.css("position", "relative");
              var result__ = img.hide();
              var result__ = menu.css("right", "5px");
              var result__ = menu.css("top", "5px");
              var result__ = menu.show();
              mobl.sleep(500, function(result__) {
                var tmp424 = result__;
                var result__ = mobl.$("body").bind("tap", removeMenu);
                if(callback && callback.apply) callback(); return;
              });
            };
if(val129 !== null) {
  subs__.addSub(mobl.domBind(img, 'tap', val129));
}

root298.append(img);

var removeMenu = function(evt) {
   var __this = this;
  menu.hide();
  img.show();
  mobl.$("body").unbind("tap", removeMenu);
};


callback(root298); return subs__;



return subs__;
};

mobl.ui.generic.masterDetail = function(items, masterItem, detail, elements, callback) {
var root300 = $("<span>");
var subs__ = new mobl.CompSubscription();
var result__ = mobl.window.get().innerWidth > 500;
var tmp406 = mobl.ref(result__);
subs__.addSub(mobl.ref(mobl.window, 'innerWidth').addEventListener('change', function() {
  tmp406.set(mobl.window.get().innerWidth > 500);
}));


var node166 = $("<span>");
root300.append(node166);
var condSubs40 = new mobl.CompSubscription();
subs__.addSub(condSubs40);
var oldValue40;
var renderCond40 = function() {
  var value156 = tmp406.get();
  if(oldValue40 === value156) return;
  oldValue40 = value156;
  var subs__ = condSubs40;
  subs__.unsubscribe();
  node166.empty();
  if(value156) {
    items.get().one(function(result__) {
      var tmp425 = result__;
      var current = mobl.ref(result__);
      
      var node167 = $("<div>");
      node167.attr('width', "100%");
      
      
      var node168 = $("<div>");
      node168.attr('style', "float:left; width:33%; position:relative; border-right: solid 1px #cccccc;");
      
      var nodes191 = $("<span>");
      node168.append(nodes191);
      subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
        var root303 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        
        var node171 = mobl.loadingSpan();
        root303.append(node171);
        var list23;
        var listSubs23 = new mobl.CompSubscription();
        subs__.addSub(listSubs23);
        var renderList23 = function() {
          var subs__ = listSubs23;
          list23 = items.get();
          list23.list(function(results23) {
            node171.empty();
            for(var i23 = 0; i23 < results23.length; i23++) {
              (function() {
                var iternode23 = $("<span>");
                node171.append(iternode23);
                var it;
                it = mobl.ref(mobl.ref(results23), i23);
                var result__ = it.get() == current.get();
                var tmp395 = mobl.ref(result__);
                subs__.addSub(it.addEventListener('change', function() {
                  tmp395.set(it.get() == current.get());
                }));
                subs__.addSub(current.addEventListener('change', function() {
                  tmp395.set(it.get() == current.get());
                }));
                
                
                var node172 = $("<span>");
                iternode23.append(node172);
                var condSubs42 = new mobl.CompSubscription();
                subs__.addSub(condSubs42);
                var oldValue42;
                var renderCond42 = function() {
                  var value158 = tmp395.get();
                  if(oldValue42 === value158) return;
                  oldValue42 = value158;
                  var subs__ = condSubs42;
                  subs__.unsubscribe();
                  node172.empty();
                  if(value158) {
                    var nodes192 = $("<span>");
                    node172.append(nodes192);
                    subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.selectedItemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
                      var root304 = $("<span>");
                      var subs__ = new mobl.CompSubscription();
                      var nodes193 = $("<span>");
                      root304.append(nodes193);
                      subs__.addSub(masterItem.addEventListener('change', function() {
                        renderControl60();
                      }));
                      
                      function renderControl60() {
                        subs__.addSub((masterItem.get())(it, function(elements, callback) {
                          var root305 = $("<span>");
                          var subs__ = new mobl.CompSubscription();
                          callback(root305); return subs__;
                          return subs__;
                        }, function(node) {
                          var oldNodes = nodes193;
                          nodes193 = node.contents();
                          oldNodes.replaceWith(nodes193);
                        }));
                      }
                      renderControl60();
                      callback(root304); return subs__;
                      
                      return subs__;
                    }, function(node) {
                      var oldNodes = nodes192;
                      nodes192 = node.contents();
                      oldNodes.replaceWith(nodes192);
                    }));
                    
                    
                  } else {
                    var result__ = function(event, callback) {
                                     if(event && event.stopPropagation) event.stopPropagation();
                                     var result__ = it.get();
                                     current.set(result__);
                                     var result__ = mobl.ui.generic.scrollUp();
                                     if(callback && callback.apply) callback(); return;
                                   };
                    var tmp394 = mobl.ref(result__);
                    
                    var nodes194 = $("<span>");
                    node172.append(nodes194);
                    subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp394, mobl.ref(null), mobl.ref(true), function(_, callback) {
                      var root306 = $("<span>");
                      var subs__ = new mobl.CompSubscription();
                      var nodes195 = $("<span>");
                      root306.append(nodes195);
                      subs__.addSub(masterItem.addEventListener('change', function() {
                        renderControl61();
                      }));
                      
                      function renderControl61() {
                        subs__.addSub((masterItem.get())(it, function(elements, callback) {
                          var root307 = $("<span>");
                          var subs__ = new mobl.CompSubscription();
                          callback(root307); return subs__;
                          return subs__;
                        }, function(node) {
                          var oldNodes = nodes195;
                          nodes195 = node.contents();
                          oldNodes.replaceWith(nodes195);
                        }));
                      }
                      renderControl61();
                      callback(root306); return subs__;
                      
                      return subs__;
                    }, function(node) {
                      var oldNodes = nodes194;
                      nodes194 = node.contents();
                      oldNodes.replaceWith(nodes194);
                    }));
                    
                    
                  }
                };
                renderCond42();
                subs__.addSub(tmp395.addEventListener('change', function() {
                  renderCond42();
                }));
                
                
                var oldNodes = iternode23;
                iternode23 = iternode23.contents();
                oldNodes.replaceWith(iternode23);
                
                
              }());
            }
            mobl.delayedUpdateScrollers();
            subs__.addSub(list23.addEventListener('change', function() { listSubs23.unsubscribe(); renderList23(true); }));
            subs__.addSub(items.addEventListener('change', function() { listSubs23.unsubscribe(); renderList23(true); }));
          });
        };
        renderList23();
        
        callback(root303); return subs__;
        
        return subs__;
      }, function(node) {
        var oldNodes = nodes191;
        nodes191 = node.contents();
        oldNodes.replaceWith(nodes191);
      }));
      node167.append(node168);
      
      var node169 = $("<div>");
      node169.attr('style', "float:left; width:66.5%; position:relative; margin-left: 0.5%;");
      
      
      var node170 = $("<span>");
      node169.append(node170);
      var condSubs41 = new mobl.CompSubscription();
      subs__.addSub(condSubs41);
      var oldValue41;
      var renderCond41 = function() {
        var value157 = current.get();
        if(oldValue41 === value157) return;
        oldValue41 = value157;
        var subs__ = condSubs41;
        subs__.unsubscribe();
        node170.empty();
        if(value157) {
          var nodes189 = $("<span>");
          node170.append(nodes189);
          subs__.addSub(detail.addEventListener('change', function() {
            renderControl59();
          }));
          
          function renderControl59() {
            subs__.addSub((detail.get())(current, function(elements, callback) {
              var root301 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root301); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes189;
              nodes189 = node.contents();
              oldNodes.replaceWith(nodes189);
            }));
          }
          renderControl59();
          
          
        } else {
          var result__ = mobl._("Select an item on the left", []);
          var tmp396 = mobl.ref(result__);
          
          var nodes190 = $("<span>");
          node170.append(nodes190);
          subs__.addSub((mobl.label)(tmp396, mobl.ref(null), mobl.ref(null), function(_, callback) {
            var root302 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            callback(root302); return subs__;
            return subs__;
          }, function(node) {
            var oldNodes = nodes190;
            nodes190 = node.contents();
            oldNodes.replaceWith(nodes190);
          }));
          
          
        }
      };
      renderCond41();
      subs__.addSub(current.addEventListener('change', function() {
        renderCond41();
      }));
      
      node167.append(node169);
      node166.append(node167);
      
      
      
      
      
      
    });
  } else {
    var nodes196 = $("<span>");
    node166.append(nodes196);
    subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
      var root308 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      var node173 = mobl.loadingSpan();
      root308.append(node173);
      var list24;
      var listSubs24 = new mobl.CompSubscription();
      subs__.addSub(listSubs24);
      var renderList24 = function() {
        var subs__ = listSubs24;
        list24 = items.get();
        list24.list(function(results24) {
          node173.empty();
          for(var i24 = 0; i24 < results24.length; i24++) {
            (function() {
              var iternode24 = $("<span>");
              node173.append(iternode24);
              var it;
              it = mobl.ref(mobl.ref(results24), i24);
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               mobl.call('mobl.ui.generic.detailScreen', [it, detail, mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                               var tmp426 = result__;
                               if(callback && callback.apply) callback(); return;
                               });
                             };
              var tmp389 = mobl.ref(result__);
              
              var nodes197 = $("<span>");
              iternode24.append(nodes197);
              subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp389, mobl.ref(null), mobl.ref(false), function(_, callback) {
                var root309 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes198 = $("<span>");
                root309.append(nodes198);
                subs__.addSub(masterItem.addEventListener('change', function() {
                  renderControl62();
                }));
                
                function renderControl62() {
                  subs__.addSub((masterItem.get())(it, function(elements, callback) {
                    var root310 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root310); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes198;
                    nodes198 = node.contents();
                    oldNodes.replaceWith(nodes198);
                  }));
                }
                renderControl62();
                callback(root309); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes197;
                nodes197 = node.contents();
                oldNodes.replaceWith(nodes197);
              }));
              
              var oldNodes = iternode24;
              iternode24 = iternode24.contents();
              oldNodes.replaceWith(iternode24);
              
              
            }());
          }
          mobl.delayedUpdateScrollers();
          subs__.addSub(list24.addEventListener('change', function() { listSubs24.unsubscribe(); renderList24(true); }));
          subs__.addSub(items.addEventListener('change', function() { listSubs24.unsubscribe(); renderList24(true); }));
        });
      };
      renderList24();
      
      callback(root308); return subs__;
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes196;
      nodes196 = node.contents();
      oldNodes.replaceWith(nodes196);
    }));
    
    
  }
};
renderCond40();
subs__.addSub(tmp406.addEventListener('change', function() {
  renderCond40();
}));

callback(root300); return subs__;

return subs__;
};

mobl.ui.generic.detailScreen = function(it, detail, callback, screenCallback) {
var root311 = $("<div>");
var subs__ = new mobl.CompSubscription();
var result__ = mobl._("Detail", []);
var tmp393 = mobl.ref(result__);

var nodes199 = $("<span>");
root311.append(nodes199);
subs__.addSub((mobl.ui.generic.header)(tmp393, mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root312 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp392 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp391 = mobl.ref(result__);
  
  var nodes200 = $("<span>");
  root312.append(nodes200);
  subs__.addSub((mobl.ui.generic.backButton)(tmp391, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp392, function(_, callback) {
    var root313 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root313); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes200;
    nodes200 = node.contents();
    oldNodes.replaceWith(nodes200);
  }));
  callback(root312); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes199;
  nodes199 = node.contents();
  oldNodes.replaceWith(nodes199);
}));
var nodes201 = $("<span>");
root311.append(nodes201);
subs__.addSub(detail.addEventListener('change', function() {
  renderControl63();
}));

function renderControl63() {
  subs__.addSub((detail.get())(it, function(elements, callback) {
    var root314 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root314); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes201;
    nodes201 = node.contents();
    oldNodes.replaceWith(nodes201);
  }));
}
renderControl63();
callback(root311); return subs__;


return subs__;
};
mobl.ui.generic.selectedItemStyle = 'mobl__ui__generic__selectedItemStyle';

mobl.ui.generic.zoomList = function(coll, listCtrl, zoomCtrl, elements, callback) {
var root315 = $("<span>");
var subs__ = new mobl.CompSubscription();

var selected = mobl.ref(null);
var nodes202 = $("<span>");
root315.append(nodes202);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root316 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node174 = mobl.loadingSpan();
  root316.append(node174);
  var list25;
  var listSubs25 = new mobl.CompSubscription();
  subs__.addSub(listSubs25);
  var renderList25 = function() {
    var subs__ = listSubs25;
    list25 = coll.get();
    list25.list(function(results25) {
      node174.empty();
      for(var i25 = 0; i25 < results25.length; i25++) {
        (function() {
          var iternode25 = $("<span>");
          node174.append(iternode25);
          var it;
          it = mobl.ref(mobl.ref(results25), i25);
          var result__ = it.get() == selected.get();
          var tmp398 = mobl.ref(result__);
          subs__.addSub(it.addEventListener('change', function() {
            tmp398.set(it.get() == selected.get());
          }));
          subs__.addSub(selected.addEventListener('change', function() {
            tmp398.set(it.get() == selected.get());
          }));
          
          
          var node175 = $("<span>");
          iternode25.append(node175);
          var condSubs43 = new mobl.CompSubscription();
          subs__.addSub(condSubs43);
          var oldValue43;
          var renderCond43 = function() {
            var value159 = tmp398.get();
            if(oldValue43 === value159) return;
            oldValue43 = value159;
            var subs__ = condSubs43;
            subs__.unsubscribe();
            node175.empty();
            if(value159) {
              var nodes203 = $("<span>");
              node175.append(nodes203);
              subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
                var root317 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes204 = $("<span>");
                root317.append(nodes204);
                subs__.addSub(zoomCtrl.addEventListener('change', function() {
                  renderControl64();
                }));
                
                function renderControl64() {
                  subs__.addSub((zoomCtrl.get())(it, function(elements, callback) {
                    var root318 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root318); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes204;
                    nodes204 = node.contents();
                    oldNodes.replaceWith(nodes204);
                  }));
                }
                renderControl64();
                callback(root317); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes203;
                nodes203 = node.contents();
                oldNodes.replaceWith(nodes203);
              }));
              
              
            } else {
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               var result__ = it.get();
                               selected.set(result__);
                               if(callback && callback.apply) callback(); return;
                             };
              var tmp397 = mobl.ref(result__);
              
              var nodes205 = $("<span>");
              node175.append(nodes205);
              subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp397, mobl.ref(null), mobl.ref(true), function(_, callback) {
                var root319 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes206 = $("<span>");
                root319.append(nodes206);
                subs__.addSub(listCtrl.addEventListener('change', function() {
                  renderControl65();
                }));
                
                function renderControl65() {
                  subs__.addSub((listCtrl.get())(it, function(elements, callback) {
                    var root320 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root320); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes206;
                    nodes206 = node.contents();
                    oldNodes.replaceWith(nodes206);
                  }));
                }
                renderControl65();
                callback(root319); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes205;
                nodes205 = node.contents();
                oldNodes.replaceWith(nodes205);
              }));
              
              
            }
          };
          renderCond43();
          subs__.addSub(tmp398.addEventListener('change', function() {
            renderCond43();
          }));
          
          
          var oldNodes = iternode25;
          iternode25 = iternode25.contents();
          oldNodes.replaceWith(iternode25);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list25.addEventListener('change', function() { listSubs25.unsubscribe(); renderList25(true); }));
      subs__.addSub(coll.addEventListener('change', function() { listSubs25.unsubscribe(); renderList25(true); }));
    });
  };
  renderList25();
  
  callback(root316); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes202;
  nodes202 = node.contents();
  oldNodes.replaceWith(nodes202);
}));
callback(root315); return subs__;

return subs__;
};
mobl.ui.generic.loadMoreStyle = 'mobl__ui__generic__loadMoreStyle';

mobl.ui.generic.markableList = function(items, elements, callback) {
var root321 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes207 = $("<span>");
root321.append(nodes207);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root322 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node176 = mobl.loadingSpan();
  root322.append(node176);
  var list26;
  var listSubs26 = new mobl.CompSubscription();
  subs__.addSub(listSubs26);
  var renderList26 = function() {
    var subs__ = listSubs26;
    list26 = items.get();
    list26.list(function(results26) {
      node176.empty();
      for(var i26 = 0; i26 < results26.length; i26++) {
        (function() {
          var iternode26 = $("<span>");
          node176.append(iternode26);
          var checked;var it;
          checked = mobl.ref(mobl.ref(mobl.ref(results26), i26), "_1");it = mobl.ref(mobl.ref(mobl.ref(results26), i26), "_2");
          var nodes208 = $("<span>");
          iternode26.append(nodes208);
          subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
            var root323 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes209 = $("<span>");
            root323.append(nodes209);
            subs__.addSub((mobl.ui.generic.checkBox)(checked, it, mobl.ref(null), function(_, callback) {
              var root324 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root324); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes209;
              nodes209 = node.contents();
              oldNodes.replaceWith(nodes209);
            }));
            callback(root323); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes208;
            nodes208 = node.contents();
            oldNodes.replaceWith(nodes208);
          }));
          
          var oldNodes = iternode26;
          iternode26 = iternode26.contents();
          oldNodes.replaceWith(iternode26);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list26.addEventListener('change', function() { listSubs26.unsubscribe(); renderList26(true); }));
      subs__.addSub(items.addEventListener('change', function() { listSubs26.unsubscribe(); renderList26(true); }));
    });
  };
  renderList26();
  
  callback(root322); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes207;
  nodes207 = node.contents();
  oldNodes.replaceWith(nodes207);
}));
callback(root321); return subs__;

return subs__;
};

mobl.ui.generic.selectList = function(title, coll, doneButtonLabel, callback, screenCallback) {
var root325 = $("<div>");
var subs__ = new mobl.CompSubscription();

var items = mobl.ref([]);
var result__ = coll.get();
coll.get().list(function(coll137) {
  coll137 = coll137.reverse();
  function processOne3() {
    var it;
    it = coll137.pop();
    var result__ = items.get().push(new mobl.Tuple(false, it));
    
    if(coll137.length > 0) processOne3(); else rest3();
    
  }
  function rest3() {
    var nodes210 = $("<span>");
    root325.append(nodes210);
    subs__.addSub((mobl.ui.generic.header)(title, mobl.ref(false), mobl.ref(null), function(_, callback) {
      var root326 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = null;
                       if(callback && callback.apply) callback(result__);
                       return;
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp401 = mobl.ref(result__);
      
      var result__ = mobl._("Back", []);
      var tmp399 = mobl.ref(result__);
      
      var nodes211 = $("<span>");
      root326.append(nodes211);
      subs__.addSub((mobl.ui.generic.backButton)(tmp399, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp401, function(_, callback) {
        var root327 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root327); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes211;
        nodes211 = node.contents();
        oldNodes.replaceWith(nodes211);
      }));
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = [];
                       var selected = result__;
                       var result__ = items.get();
                       items.get().list(function(coll136) {
                         coll136 = coll136.reverse();
                         function processOne2() {
                           var checked;var it;
                           var tmp428 = coll136.pop();
                           checked = tmp428._1;it = tmp428._2;
                           var result__ = checked;
                           if(result__) {
                             var result__ = selected.push(it);
                             
                             if(coll136.length > 0) processOne2(); else rest2();
                             
                           } else {
                             {
                               
                               if(coll136.length > 0) processOne2(); else rest2();
                               
                             }
                           }
                         }
                         function rest2() {
                           var result__ = selected;
                           if(screenCallback) screenCallback(result__);
                           return;
                           if(callback && callback.apply) callback(); return;
                         }
                         if(coll136.length > 0) processOne2(); else rest2();
                       });
                       
                     };
      var tmp402 = mobl.ref(result__);
      
      var nodes212 = $("<span>");
      root326.append(nodes212);
      subs__.addSub((mobl.ui.generic.button)(doneButtonLabel, mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp402, function(_, callback) {
        var root328 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root328); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes212;
        nodes212 = node.contents();
        oldNodes.replaceWith(nodes212);
      }));
      callback(root326); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes210;
      nodes210 = node.contents();
      oldNodes.replaceWith(nodes210);
    }));
    var nodes213 = $("<span>");
    root325.append(nodes213);
    subs__.addSub((mobl.ui.generic.markableList)(items, function(_, callback) {
      var root329 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root329); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes213;
      nodes213 = node.contents();
      oldNodes.replaceWith(nodes213);
    }));
    callback(root325); return subs__;
    
    
  }
  if(coll137.length > 0) processOne3(); else rest3();
});

return subs__;
};
mobl.ui.generic.progressStyle = 'mobl__ui__generic__progressStyle';
mobl.ui.generic.startLoading = function(loadingMessage, style) {
   var __this = this;
  var loading = mobl.$("<div id='progress' class='" + style + "'>" + loadingMessage + "</div>");
  
  mobl.$("body").prepend(loading);
};

mobl.ui.generic.endLoading = function() {
   var __this = this;
  mobl.$("#progress").remove();
};

(function(__ns) {
__ns . floatBox = function ( top , right , bottom , left , elements , callback ) { var root928 = $ (
"<span>" ) ; var node280 = $ ( "<div style=\"position: absolute;\">" ) ; var nodes681 = $ ( "<span>"
) ; node280 . append ( nodes681 ) ; mobl . ref ( elements ) . addEventListener ( 'change' , function
(  ) { renderControl102 (  ) ; } ) ; function renderControl102 (  ) { ( elements ) ( function (
elements , callback ) { var root929 = $ ( "<span>" ) ; callback ( root929 ) ; return ; } , function
( node ) { var oldNodes = nodes681 ; nodes681 = node . contents (  ) ; oldNodes . replaceWith (
nodes681 ) ; } ) ; } renderControl102 (  ) ; root928 . append ( node280 ) ; var box = node280 ; if (
top . get (  ) !== null ) box . css ( "top" , "" + top . get (  ) + "px" ) ; if ( right . get (  )
!== null ) box . css ( "right" , "" + right . get (  ) + "px" ) ; if ( bottom . get (  ) !== null )
box . css ( "top" , "" + ( window . pageYOffset + window . innerHeight - box . outerHeight (  ) -
bottom . get (  ) ) + "px" ) ; if ( left . get (  ) !== null ) box . css ( "left" , "" + left . get
(  ) + "px" ) ; function updateLocation (  ) { if ( top . get (  ) !== null ) {


                                                                              box


                                                                              .


                                                                              css


                                                                              (


                                                                              "top"


                                                                              ,


                                                                              ""


                                                                              +


                                                                              (


                                                                              window


                                                                              .


                                                                              pageYOffset


                                                                              +


                                                                              top


                                                                              .


                                                                              get


                                                                              (


                                                                              )


                                                                              )


                                                                              +


                                                                              "px"


                                                                              )


                                                                              ;
                                                                              } if ( bottom . get ( 
) !== null ) {


             box


             .


             css


             (


             "top"


             ,


             ""


             +


             (


             window


             .


             pageYOffset


             +


             window


             .


             innerHeight


             -


             box


             .


             outerHeight


             (


             )


             -


             bottom


             .


             get


             (


             )


             )


             +


             "px"


             )


             ;
             } } $ ( window ) . bind ( 'scroll' , updateLocation ) ; $ ( window ) . bind ( 'resize'
, updateLocation ) ; callback ( root928 ) ; return ; } ;
}(mobl.ui.generic));mobl.ui.generic.accordionStyle = 'mobl__ui__generic__accordionStyle';
mobl.ui.generic.activeSectionHeaderStyle = 'mobl__ui__generic__activeSectionHeaderStyle';
mobl.ui.generic.inActiveSectionHeaderStyle = 'mobl__ui__generic__inActiveSectionHeaderStyle';
mobl.ui.generic.activeSectionHeaderStyle = 'mobl__ui__generic__activeSectionHeaderStyle';
mobl.ui.generic.inActiveSectionHeaderStyle = 'mobl__ui__generic__inActiveSectionHeaderStyle';
mobl.ui.generic.inActiveSectionStyle = 'mobl__ui__generic__inActiveSectionStyle';
mobl.ui.generic.activeSectionStyle = 'mobl__ui__generic__activeSectionStyle';

mobl.ui.generic.accordion = function(sections, activeSection, elements, callback) {
var root330 = $("<span>");
var subs__ = new mobl.CompSubscription();

var activeSection = mobl.ref(activeSection.get() ? activeSection.get() : sections.get().get(0)._1);
var nodes214 = $("<span>");
root330.append(nodes214);
subs__.addSub((mobl.block)(mobl.ref(mobl.ui.generic.accordionStyle), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root331 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node177 = mobl.loadingSpan();
  root331.append(node177);
  var list27;
  var listSubs27 = new mobl.CompSubscription();
  subs__.addSub(listSubs27);
  var renderList27 = function() {
    var subs__ = listSubs27;
    list27 = sections.get();
    list27.list(function(results27) {
      node177.empty();
      for(var i27 = 0; i27 < results27.length; i27++) {
        (function() {
          var iternode27 = $("<span>");
          node177.append(iternode27);
          var sectionName;var sectionControl;
          sectionName = mobl.ref(mobl.ref(mobl.ref(results27), i27), "_1");sectionControl = mobl.ref(mobl.ref(mobl.ref(results27), i27), "_2");
          var result__ = function(event, callback) {
                           if(event && event.stopPropagation) event.stopPropagation();
                           var result__ = sectionName.get();
                           activeSection.set(result__);
                           if(callback && callback.apply) callback(); return;
                         };
          var tmp404 = mobl.ref(result__);
          
          var result__ = activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle;
          var tmp403 = mobl.ref(result__);
          subs__.addSub(activeSection.addEventListener('change', function() {
            tmp403.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          subs__.addSub(sectionName.addEventListener('change', function() {
            tmp403.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.activeSectionHeaderStyle).addEventListener('change', function() {
            tmp403.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.inActiveSectionHeaderStyle).addEventListener('change', function() {
            tmp403.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          
          var nodes215 = $("<span>");
          iternode27.append(nodes215);
          subs__.addSub((mobl.span)(tmp403, mobl.ref(null), tmp404, mobl.ref(null), function(_, callback) {
            var root332 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes216 = $("<span>");
            root332.append(nodes216);
            subs__.addSub((mobl.label)(sectionName, mobl.ref(null), mobl.ref(null), function(_, callback) {
              var root333 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root333); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes216;
              nodes216 = node.contents();
              oldNodes.replaceWith(nodes216);
            }));
            callback(root332); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes215;
            nodes215 = node.contents();
            oldNodes.replaceWith(nodes215);
          }));
          var result__ = activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle;
          var tmp405 = mobl.ref(result__);
          subs__.addSub(activeSection.addEventListener('change', function() {
            tmp405.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          subs__.addSub(sectionName.addEventListener('change', function() {
            tmp405.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.activeSectionStyle).addEventListener('change', function() {
            tmp405.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.inActiveSectionStyle).addEventListener('change', function() {
            tmp405.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          
          var nodes217 = $("<span>");
          iternode27.append(nodes217);
          subs__.addSub((mobl.block)(tmp405, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
            var root334 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes218 = $("<span>");
            root334.append(nodes218);
            subs__.addSub(sectionControl.addEventListener('change', function() {
              renderControl66();
            }));
            
            function renderControl66() {
              subs__.addSub((sectionControl.get())(function(elements, callback) {
                var root335 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                callback(root335); return subs__;
                return subs__;
              }, function(node) {
                var oldNodes = nodes218;
                nodes218 = node.contents();
                oldNodes.replaceWith(nodes218);
              }));
            }
            renderControl66();
            callback(root334); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes217;
            nodes217 = node.contents();
            oldNodes.replaceWith(nodes217);
          }));
          
          var oldNodes = iternode27;
          iternode27 = iternode27.contents();
          oldNodes.replaceWith(iternode27);
          
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list27.addEventListener('change', function() { listSubs27.unsubscribe(); renderList27(true); }));
      subs__.addSub(sections.addEventListener('change', function() { listSubs27.unsubscribe(); renderList27(true); }));
    });
  };
  renderList27();
  
  callback(root331); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes214;
  nodes214 = node.contents();
  oldNodes.replaceWith(nodes214);
}));
callback(root330); return subs__;

return subs__;
};
mobl.ui.generic.tableStyle = 'mobl__ui__generic__tableStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.trStyle = 'mobl__ui__generic__trStyle';
mobl.ui.generic.trStyle = 'mobl__ui__generic__trStyle';
mobl.ui.generic.trStyle = 'mobl__ui__generic__trStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';
mobl.ui.generic.tdStyle = 'mobl__ui__generic__tdStyle';

mobl.ui.generic.table = function(style, elements, callback) {
var root336 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node178 = $("<table>");

var ref279 = style;
if(ref279.get() !== null) {
  node178.attr('class', ref279.get());
  subs__.addSub(ref279.addEventListener('change', function(_, ref, val) {
    node178.attr('class', val);
  }));
  
}
subs__.addSub(ref279.rebind());

var nodes219 = $("<span>");
node178.append(nodes219);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl67();
}));

function renderControl67() {
  subs__.addSub((elements)(function(elements, callback) {
    var root337 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root337); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes219;
    nodes219 = node.contents();
    oldNodes.replaceWith(nodes219);
  }));
}
renderControl67();
root336.append(node178);
callback(root336); return subs__;


return subs__;
};

mobl.ui.generic.row = function(style, elements, callback) {
var root338 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node179 = $("<tr>");

var ref280 = style;
if(ref280.get() !== null) {
  node179.attr('class', ref280.get());
  subs__.addSub(ref280.addEventListener('change', function(_, ref, val) {
    node179.attr('class', val);
  }));
  
}
subs__.addSub(ref280.rebind());

var nodes220 = $("<span>");
node179.append(nodes220);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl68();
}));

function renderControl68() {
  subs__.addSub((elements)(function(elements, callback) {
    var root339 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root339); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes220;
    nodes220 = node.contents();
    oldNodes.replaceWith(nodes220);
  }));
}
renderControl68();
root338.append(node179);
callback(root338); return subs__;


return subs__;
};

mobl.ui.generic.cell = function(width, style, elements, callback) {
var root340 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node181 = $("<td>");

var ref281 = width;
if(ref281.get() !== null) {
  node181.attr('width', ref281.get());
  subs__.addSub(ref281.addEventListener('change', function(_, ref, val) {
    node181.attr('width', val);
  }));
  
}
subs__.addSub(ref281.rebind());

var ref282 = style;
if(ref282.get() !== null) {
  node181.attr('class', ref282.get());
  subs__.addSub(ref282.addEventListener('change', function(_, ref, val) {
    node181.attr('class', val);
  }));
  
}
subs__.addSub(ref282.rebind());

var nodes221 = $("<span>");
node181.append(nodes221);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl69();
}));

function renderControl69() {
  subs__.addSub((elements)(function(elements, callback) {
    var root341 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root341); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes221;
    nodes221 = node.contents();
    oldNodes.replaceWith(nodes221);
  }));
}
renderControl69();
root340.append(node181);
callback(root340); return subs__;


return subs__;
};

mobl.ui.generic.col = function(width, style, elements, callback) {
var root342 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node182 = $("<td>");

var ref283 = width;
if(ref283.get() !== null) {
  node182.attr('width', ref283.get());
  subs__.addSub(ref283.addEventListener('change', function(_, ref, val) {
    node182.attr('width', val);
  }));
  
}
subs__.addSub(ref283.rebind());

var ref284 = style;
if(ref284.get() !== null) {
  node182.attr('class', ref284.get());
  subs__.addSub(ref284.addEventListener('change', function(_, ref, val) {
    node182.attr('class', val);
  }));
  
}
subs__.addSub(ref284.rebind());

var nodes222 = $("<span>");
node182.append(nodes222);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl70();
}));

function renderControl70() {
  subs__.addSub((elements)(function(elements, callback) {
    var root343 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root343); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes222;
    nodes222 = node.contents();
    oldNodes.replaceWith(nodes222);
  }));
}
renderControl70();
root342.append(node182);
callback(root342); return subs__;


return subs__;
};

mobl.ui.generic.headerCol = function(width, style, elements, callback) {
var root344 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node183 = $("<td>");

var ref285 = width;
if(ref285.get() !== null) {
  node183.attr('width', ref285.get());
  subs__.addSub(ref285.addEventListener('change', function(_, ref, val) {
    node183.attr('width', val);
  }));
  
}
subs__.addSub(ref285.rebind());

var ref286 = style;
if(ref286.get() !== null) {
  node183.attr('class', ref286.get());
  subs__.addSub(ref286.addEventListener('change', function(_, ref, val) {
    node183.attr('class', val);
  }));
  
}
subs__.addSub(ref286.rebind());


var node184 = $("<strong>");

var nodes223 = $("<span>");
node184.append(nodes223);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl71();
}));

function renderControl71() {
  subs__.addSub((elements)(function(elements, callback) {
    var root345 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root345); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes223;
    nodes223 = node.contents();
    oldNodes.replaceWith(nodes223);
  }));
}
renderControl71();
node183.append(node184);
root344.append(node183);
callback(root344); return subs__;



return subs__;
};
(function(__ns) {
setTimeout ( function (  ) { scrollTo ( 0 , -1 ) ; } , 250 ) ; __ns . scrollUp = function (  ) {
scrollTo ( 0 , 0 ) ; } ; __ns . setupScrollers = function (  ) { setTimeout ( function (  ) { var
allScrollers = $ ( "div.scroller" ) ; for ( var i = 0 ; i < allScrollers . length ; i ++ ) {


                                                                                           var


                                                                                           scroller


                                                                                           =


                                                                                           allScrollers


                                                                                           .


                                                                                           eq


                                                                                           (


                                                                                           i


                                                                                           )


                                                                                           ;


                                                                                           if


                                                                                           (


                                                                                           !


                                                                                           scroller


                                                                                           .


                                                                                           data


                                                                                           (


                                                                                           "scroller"


                                                                                           )


                                                                                           )


                                                                                           {


                                                                                           scroller


                                                                                           .


                                                                                           data


                                                                                           (


                                                                                           "scroller"


                                                                                           ,


                                                                                           new


                                                                                           TouchScroll


                                                                                           (


                                                                                           scroller


                                                                                           [


                                                                                           0


                                                                                           ]


                                                                                           ,


                                                                                           {


                                                                                           elastic


                                                                                           :


                                                                                           true


                                                                                           }


                                                                                           )


                                                                                           )


                                                                                           ;
                                                                                           }
                                                                                           } } , 250
) ; } ;
}(mobl.ui.generic));