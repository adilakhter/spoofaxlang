mobl.provides('mobl.ui.generic');
mobl.provides('mobl.ui.stylemixin');
mobl.provides('mobl.ui.generic');
mobl.provides('mobl');
mobl.provides('mobl.ui');
mobl.ui.generic.loadingStyle = 'mobl__ui__generic__loadingStyle';

mobl.ui.generic.whenLoaded = function(value, style, loadingMessage, elements, callback) {
var root37 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node16 = $("<span>");
root37.append(node16);
var condSubs1 = new mobl.CompSubscription();
subs__.addSub(condSubs1);
var oldValue1;
var renderCond1 = function() {
  var value11 = value.get();
  if(oldValue1 === value11) return;
  oldValue1 = value11;
  var subs__ = condSubs1;
  subs__.unsubscribe();
  node16.empty();
  if(value11) {
    var nodes22 = $("<span>");
    node16.append(nodes22);
    subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
      renderControl6();
    }));
    
    function renderControl6() {
      subs__.addSub((elements)(function(elements, callback) {
        var root38 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root38); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes22;
        nodes22 = node.contents();
        oldNodes.replaceWith(nodes22);
      }));
    }
    renderControl6();
    
    
  } else {
    var nodes23 = $("<span>");
    node16.append(nodes23);
    subs__.addSub((mobl.block)(style, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root39 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var nodes24 = $("<span>");
      root39.append(nodes24);
      subs__.addSub((mobl.label)(loadingMessage, mobl.ref(null), mobl.ref(null), function(_, callback) {
        var root40 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root40); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes24;
        nodes24 = node.contents();
        oldNodes.replaceWith(nodes24);
      }));
      var nodes25 = $("<span>");
      root39.append(nodes25);
      subs__.addSub((mobl.ui.generic.image)(mobl.ref("data:image/gif;base64,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"), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref("middle"), mobl.ref(null), function(_, callback) {
        var root41 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root41); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes25;
        nodes25 = node.contents();
        oldNodes.replaceWith(nodes25);
      }));
      callback(root39); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes23;
      nodes23 = node.contents();
      oldNodes.replaceWith(nodes23);
    }));
    
    
  }
};
renderCond1();
subs__.addSub(value.addEventListener('change', function() {
  renderCond1();
}));

callback(root37); return subs__;

return subs__;
};
mobl.ui.generic.headerStyle = 'mobl__ui__generic__headerStyle';
mobl.ui.generic.headerContainerStyle = 'mobl__ui__generic__headerContainerStyle';
mobl.ui.generic.headerTextStyle = 'mobl__ui__generic__headerTextStyle';

mobl.ui.generic.header = function(text, fixedPosition, onclick, elements, callback) {
var root42 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node17 = $("<div>");

var ref23 = mobl.ref(mobl.ui.generic.headerStyle);
if(ref23.get() !== null) {
  node17.attr('class', ref23.get());
  subs__.addSub(ref23.addEventListener('change', function(_, ref, val) {
    node17.attr('class', val);
  }));
  
}
subs__.addSub(ref23.rebind());

var val14 = onclick.get();
if(val14 !== null) {
  subs__.addSub(mobl.domBind(node17, 'tap', val14));
}

var ref24 = mobl.ref(fixedPosition.get() ? "position:fixed;" : null);
if(ref24.get() !== null) {
  node17.attr('style', ref24.get());
  subs__.addSub(ref24.addEventListener('change', function(_, ref, val) {
    node17.attr('style', val);
  }));
  subs__.addSub(fixedPosition.addEventListener('change', function() {
    node17.attr('style', fixedPosition.get() ? "position:fixed;" : null);
  }));
  
}
subs__.addSub(ref24.rebind());


var node20 = $("<div>");

var ref22 = mobl.ref(mobl.ui.generic.headerContainerStyle);
if(ref22.get() !== null) {
  node20.attr('class', ref22.get());
  subs__.addSub(ref22.addEventListener('change', function(_, ref, val) {
    node20.attr('class', val);
  }));
  
}
subs__.addSub(ref22.rebind());


var node21 = $("<div>");

var ref20 = text;
node21.text(""+ref20.get());
var ignore3 = false;
subs__.addSub(ref20.addEventListener('change', function(_, ref, val) {
  if(ignore3) return;
  node21.text(""+val);
}));
subs__.addSub(ref20.rebind());


var ref21 = mobl.ref(mobl.ui.generic.headerTextStyle);
if(ref21.get() !== null) {
  node21.attr('class', ref21.get());
  subs__.addSub(ref21.addEventListener('change', function(_, ref, val) {
    node21.attr('class', val);
  }));
  
}
subs__.addSub(ref21.rebind());

node20.append(node21);
node17.append(node20);
var nodes26 = $("<span>");
node17.append(nodes26);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl7();
}));

function renderControl7() {
  subs__.addSub((elements)(function(elements, callback) {
    var root43 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root43); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes26;
    nodes26 = node.contents();
    oldNodes.replaceWith(nodes26);
  }));
}
renderControl7();
root42.append(node17);

var node18 = $("<span>");
root42.append(node18);
var condSubs2 = new mobl.CompSubscription();
subs__.addSub(condSubs2);
var oldValue2;
var renderCond2 = function() {
  var value12 = fixedPosition.get();
  if(oldValue2 === value12) return;
  oldValue2 = value12;
  var subs__ = condSubs2;
  subs__.unsubscribe();
  node18.empty();
  if(value12) {
    
    var node19 = $("<div>");
    node19.attr('id', "hello");
    node19.attr('style', "height: 2.9em;");
    
    node18.append(node19);
    
    
  } else {
    
  }
};
renderCond2();
subs__.addSub(fixedPosition.addEventListener('change', function() {
  renderCond2();
}));

callback(root42); return subs__;





return subs__;
};
mobl.ui.generic.buttonStyle = 'mobl__ui__generic__buttonStyle';
mobl.ui.generic.buttonPushedStyle = 'mobl__ui__generic__buttonPushedStyle';
mobl.ui.generic.buttonStyle = 'mobl__ui__generic__buttonStyle';
mobl.ui.generic.buttonPushedStyle = 'mobl__ui__generic__buttonPushedStyle';

mobl.ui.generic.button = function(text, style, pushedStyle, onclick, elements, callback) {
var root44 = $("<span>");
var subs__ = new mobl.CompSubscription();

var pushed = mobl.ref(false);

var sp = $("<span>");

var ref25 = mobl.ref(pushed.get() ? pushedStyle.get() : style.get());
if(ref25.get() !== null) {
  sp.attr('class', ref25.get());
  subs__.addSub(ref25.addEventListener('change', function(_, ref, val) {
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
subs__.addSub(ref25.rebind());

var val15 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = event.preventDefault();
              var result__ = true;
              pushed.set(result__);
              if(callback && callback.apply) callback(); return;
            };
if(val15 !== null) {
  subs__.addSub(mobl.domBind(sp, 'touchdown', val15));
}

var val16 = function(event, callback) {
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
if(val16 !== null) {
  subs__.addSub(mobl.domBind(sp, 'touchdrag', val16));
}

var val17 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = pushed.get();
              if(result__) {
                var result__ = false;
                pushed.set(result__);
                function after1(result__) {
                  var tmp71 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onclick.get()(event, after1);if(result__ !== undefined) after1(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val17 !== null) {
  subs__.addSub(mobl.domBind(sp, 'touchup', val17));
}

var val18 = function(event, callback) {
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
if(val18 !== null) {
  subs__.addSub(mobl.domBind(sp, 'mouseout', val18));
}

var ref26 = text;
sp.text(""+ref26.get());
var ignore4 = false;
subs__.addSub(ref26.addEventListener('change', function(_, ref, val) {
  if(ignore4) return;
  sp.text(""+val);
}));
subs__.addSub(ref26.rebind());


root44.append(sp);
callback(root44); return subs__;

return subs__;
};
mobl.ui.generic.sideButtonStyle = 'mobl__ui__generic__sideButtonStyle';
mobl.ui.generic.sideButtonPushedStyle = 'mobl__ui__generic__sideButtonPushedStyle';

mobl.ui.generic.sideButton = function(text, style, pushedStyle, onclick, elements, callback) {
var root45 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes27 = $("<span>");
root45.append(nodes27);
subs__.addSub((mobl.ui.generic.button)(text, style, pushedStyle, onclick, function(_, callback) {
  var root46 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root46); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes27;
  nodes27 = node.contents();
  oldNodes.replaceWith(nodes27);
}));
callback(root45); return subs__;

return subs__;
};
mobl.ui.generic.backButtonStyle = 'mobl__ui__generic__backButtonStyle';
mobl.ui.generic.backButtonPushedStyle = 'mobl__ui__generic__backButtonPushedStyle';
mobl.ui.generic.backButtonStyle = 'mobl__ui__generic__backButtonStyle';
mobl.ui.generic.backButtonPushedStyle = 'mobl__ui__generic__backButtonPushedStyle';

mobl.ui.generic.backButton = function(text, style, pushedStyle, onclick, elements, callback) {
var root47 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes28 = $("<span>");
root47.append(nodes28);
subs__.addSub((mobl.ui.generic.button)(text, style, pushedStyle, onclick, function(_, callback) {
  var root48 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root48); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes28;
  nodes28 = node.contents();
  oldNodes.replaceWith(nodes28);
}));
callback(root47); return subs__;

return subs__;
};
mobl.ui.generic.groupStyle = 'mobl__ui__generic__groupStyle';

mobl.ui.generic.group = function(elements, callback) {
var root49 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node22 = $("<ul>");

var ref27 = mobl.ref(mobl.ui.generic.groupStyle);
if(ref27.get() !== null) {
  node22.attr('class', ref27.get());
  subs__.addSub(ref27.addEventListener('change', function(_, ref, val) {
    node22.attr('class', val);
  }));
  
}
subs__.addSub(ref27.rebind());

var nodes29 = $("<span>");
node22.append(nodes29);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl8();
}));

function renderControl8() {
  subs__.addSub((elements)(function(elements, callback) {
    var root50 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root50); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes29;
    nodes29 = node.contents();
    oldNodes.replaceWith(nodes29);
  }));
}
renderControl8();
root49.append(node22);
callback(root49); return subs__;


return subs__;
};

mobl.ui.generic.image = function(url, width, height, onclick, style, valign, align, elements, callback) {
var root51 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node23 = $("<img>");

var ref28 = url;
if(ref28.get() !== null) {
  node23.attr('src', ref28.get());
  subs__.addSub(ref28.addEventListener('change', function(_, ref, val) {
    node23.attr('src', val);
  }));
  
}
subs__.addSub(ref28.rebind());

var ref29 = width;
if(ref29.get() !== null) {
  node23.attr('width', ref29.get());
  subs__.addSub(ref29.addEventListener('change', function(_, ref, val) {
    node23.attr('width', val);
  }));
  
}
subs__.addSub(ref29.rebind());

var ref30 = height;
if(ref30.get() !== null) {
  node23.attr('height', ref30.get());
  subs__.addSub(ref30.addEventListener('change', function(_, ref, val) {
    node23.attr('height', val);
  }));
  
}
subs__.addSub(ref30.rebind());

var ref31 = style;
if(ref31.get() !== null) {
  node23.attr('class', ref31.get());
  subs__.addSub(ref31.addEventListener('change', function(_, ref, val) {
    node23.attr('class', val);
  }));
  
}
subs__.addSub(ref31.rebind());

var val19 = onclick.get();
if(val19 !== null) {
  subs__.addSub(mobl.domBind(node23, 'tap', val19));
}

var ref32 = valign;
if(ref32.get() !== null) {
  node23.attr('valign', ref32.get());
  subs__.addSub(ref32.addEventListener('change', function(_, ref, val) {
    node23.attr('valign', val);
  }));
  
}
subs__.addSub(ref32.rebind());

var ref33 = align;
if(ref33.get() !== null) {
  node23.attr('align', ref33.get());
  subs__.addSub(ref33.addEventListener('change', function(_, ref, val) {
    node23.attr('align', val);
  }));
  
}
subs__.addSub(ref33.rebind());

root51.append(node23);
callback(root51); return subs__;

return subs__;
};
mobl.ui.generic.itemStyle = 'mobl__ui__generic__itemStyle';
mobl.ui.generic.itemPushedStyle = 'mobl__ui__generic__itemPushedStyle';
mobl.ui.generic.itemArrowStyle = 'mobl__ui__generic__itemArrowStyle';
mobl.ui.generic.itemDownArrowStyle = 'mobl__ui__generic__itemDownArrowStyle';

mobl.ui.generic.item = function(style, pushedStyle, onclick, onswipe, hideArrow, elements, callback) {
var root52 = $("<span>");
var subs__ = new mobl.CompSubscription();

var pushed = mobl.ref(false);

var el = $("<li>");

var ref34 = mobl.ref(mobl.ui.generic.itemStyle);
if(ref34.get() !== null) {
  el.attr('class', ref34.get());
  subs__.addSub(ref34.addEventListener('change', function(_, ref, val) {
    el.attr('class', val);
  }));
  
}
subs__.addSub(ref34.rebind());

var ref35 = mobl.ref(onclick.get() && hideArrow.get() == false ? mobl.mergeStyles([pushed.get() ? pushedStyle.get() : style.get(), mobl.ui.generic.itemArrowStyle]) : (pushed.get() ? pushedStyle.get() : style.get()));
if(ref35.get() !== null) {
  el.attr('class', ref35.get());
  subs__.addSub(ref35.addEventListener('change', function(_, ref, val) {
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
subs__.addSub(ref35.rebind());

var val20 = onswipe.get();
if(val20 !== null) {
  subs__.addSub(mobl.domBind(el, 'swipe', val20));
}

var val21 = onclick.get() ? function(event, callback) {
                                       if(event && event.stopPropagation) event.stopPropagation();
                                       var result__ = true;
                                       pushed.set(result__);
                                       mobl.sleep(100, function(result__) {
                                         var tmp72 = result__;
                                         function after2(result__) {
                                           var tmp73 = result__;
                                           
                                         }
                                         var result__ = onclick.get()(event, after2);if(result__ !== undefined) after2(result__);
                                         mobl.sleep(200, function(result__) {
                                           var tmp74 = result__;
                                           var result__ = false;
                                           pushed.set(result__);
                                           if(callback && callback.apply) callback(); return;
                                         });
                                         
                                       });
                                     } : null;
if(val21 !== null) {
  subs__.addSub(mobl.domBind(el, 'tap', val21));
}

var nodes30 = $("<span>");
el.append(nodes30);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl9();
}));

function renderControl9() {
  subs__.addSub((elements)(function(elements, callback) {
    var root53 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root53); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes30;
    nodes30 = node.contents();
    oldNodes.replaceWith(nodes30);
  }));
}
renderControl9();
root52.append(el);
callback(root52); return subs__;


return subs__;
};

mobl.ui.generic.checkBox = function(b, label, onchange, elements, callback) {
var root54 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node24 = $("<input>");
node24.attr('type', "checkbox");

var ref37 = b;
node24.attr('checked', !!ref37.get());
subs__.addSub(ref37.addEventListener('change', function(_, ref, val) {
  if(ref === ref37) node24.attr('checked', !!val);
}));
subs__.addSub(mobl.domBind(node24, 'change', function() {
  b.set(!!node24.attr('checked'));
}));

var val23 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              if(callback && callback.apply) callback(); return;
            };
if(val23 !== null) {
  subs__.addSub(mobl.domBind(node24, 'tap', val23));
}

var val24 = onchange.get();
if(val24 !== null) {
  subs__.addSub(mobl.domBind(node24, 'change', val24));
}

root54.append(node24);

root54.append(" ");

var node25 = $("<span>");

var ref36 = label;
node25.text(""+ref36.get());
var ignore5 = false;
subs__.addSub(ref36.addEventListener('change', function(_, ref, val) {
  if(ignore5) return;
  node25.text(""+val);
}));
subs__.addSub(ref36.rebind());


var val22 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = !b.get();
              b.set(result__);
              var result__ = onchange.get();
              if(result__) {
                function after3(result__) {
                  var tmp75 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onchange.get()(null, after3);if(result__ !== undefined) after3(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val22 !== null) {
  subs__.addSub(mobl.domBind(node25, 'tap', val22));
}

root54.append(node25);
callback(root54); return subs__;


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
var root55 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node26 = $("<span>");
root55.append(node26);
var condSubs3 = new mobl.CompSubscription();
subs__.addSub(condSubs3);
var oldValue3;
var renderCond3 = function() {
  var value13 = label.get();
  if(oldValue3 === value13) return;
  oldValue3 = value13;
  var subs__ = condSubs3;
  subs__.unsubscribe();
  node26.empty();
  if(value13) {
    var nodes31 = $("<span>");
    node26.append(nodes31);
    subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
      var root56 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root56); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes31;
      nodes31 = node.contents();
      oldNodes.replaceWith(nodes31);
    }));
    
    
  } else {
    
  }
};
renderCond3();
subs__.addSub(label.addEventListener('change', function() {
  renderCond3();
}));


var node27 = $("<span>");
root55.append(node27);
var condSubs4 = new mobl.CompSubscription();
subs__.addSub(condSubs4);
var oldValue4;
var renderCond4 = function() {
  var value14 = validator.get();
  if(oldValue4 === value14) return;
  oldValue4 = value14;
  var subs__ = condSubs4;
  subs__.unsubscribe();
  node27.empty();
  if(value14) {
    
    var temp = mobl.ref(s.get());
    
    var identifier = mobl.ref(mobl.random(999));
    function after7(result__) {
      var tmp76 = result__;
      var validationMessage = mobl.ref(result__);
      mobl.sleep(200, function(result__) {
        var tmp77 = result__;
        var result__ = mobl.setValidationError(identifier.get(), !validationMessage.get());
        
      });
      
      var node28 = $("<input>");
      
      var ref38 = inputType;
      if(ref38.get() !== null) {
        node28.attr('type', ref38.get());
        subs__.addSub(ref38.addEventListener('change', function(_, ref, val) {
          node28.attr('type', val);
        }));
        
      }
      subs__.addSub(ref38.rebind());
      
      var ref39 = mobl.ref(validationMessage.get() ? invalidStyle.get() : style.get());
      if(ref39.get() !== null) {
        node28.attr('class', ref39.get());
        subs__.addSub(ref39.addEventListener('change', function(_, ref, val) {
          node28.attr('class', val);
        }));
        subs__.addSub(validationMessage.addEventListener('change', function() {
          node28.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(invalidStyle.addEventListener('change', function() {
          node28.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(style.addEventListener('change', function() {
          node28.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        
      }
      subs__.addSub(ref39.rebind());
      
      var ref40 = placeholder;
      if(ref40.get() !== null) {
        node28.attr('placeholder', ref40.get());
        subs__.addSub(ref40.addEventListener('change', function(_, ref, val) {
          node28.attr('placeholder', val);
        }));
        
      }
      subs__.addSub(ref40.rebind());
      
      var ref41 = temp;
      node28.val(""+ref41.get());
      var ignore6 = false;
      subs__.addSub(ref41.addEventListener('change', function(_, ref, val) {
        if(ignore6) return;
        node28.val(""+val);
      }));
      subs__.addSub(ref41.rebind());
      
      subs__.addSub(mobl.domBind(node28, 'keyup change', function() {
        ignore6 = true;
        temp.set(mobl.stringTomobl__String(node28.val()));
        ignore6 = false;
      }));
      
      
      var val25 = onchange.get();
      if(val25 !== null) {
        subs__.addSub(mobl.domBind(node28, 'change', val25));
      }
      
      var val26 = function(event, callback) {
                    if(event && event.stopPropagation) event.stopPropagation();
                    var result__ = onkeyup.get();
                    if(result__) {
                      function after4(result__) {
                        var tmp78 = result__;
                        function after5(result__) {
                          var tmp79 = result__;
                          var result__ = tmp79;
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
                        var result__ = validator.get()(temp.get(), after5);if(result__ !== undefined) after5(result__);
                      }
                      var result__ = onkeyup.get()(event, after4);if(result__ !== undefined) after4(result__);
                    } else {
                      {
                        function after6(result__) {
                          var tmp79 = result__;
                          var result__ = tmp79;
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
                        var result__ = validator.get()(temp.get(), after6);if(result__ !== undefined) after6(result__);
                      }
                    }
                  };
      if(val26 !== null) {
        subs__.addSub(mobl.domBind(node28, 'keyup', val26));
      }
      
      var ref42 = autofocus;
      if(ref42.get() !== null) {
        node28.attr('autofocus', ref42.get());
        subs__.addSub(ref42.addEventListener('change', function(_, ref, val) {
          node28.attr('autofocus', val);
        }));
        
      }
      subs__.addSub(ref42.rebind());
      
      var ref43 = autocorrect;
      if(ref43.get() !== null) {
        node28.attr('autocorrect', ref43.get());
        subs__.addSub(ref43.addEventListener('change', function(_, ref, val) {
          node28.attr('autocorrect', val);
        }));
        
      }
      subs__.addSub(ref43.rebind());
      
      var ref44 = autocapitalize;
      if(ref44.get() !== null) {
        node28.attr('autocapitalize', ref44.get());
        subs__.addSub(ref44.addEventListener('change', function(_, ref, val) {
          node28.attr('autocapitalize', val);
        }));
        
      }
      subs__.addSub(ref44.rebind());
      
      var ref45 = autocomplete;
      if(ref45.get() !== null) {
        node28.attr('autocomplete', ref45.get());
        subs__.addSub(ref45.addEventListener('change', function(_, ref, val) {
          node28.attr('autocomplete', val);
        }));
        
      }
      subs__.addSub(ref45.rebind());
      
      node27.append(node28);
      var nodes32 = $("<span>");
      node27.append(nodes32);
      subs__.addSub((mobl.label)(validationMessage, mobl.ref(mobl.ui.generic.validationMessageStyle), mobl.ref(null), function(_, callback) {
        var root57 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root57); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes32;
        nodes32 = node.contents();
        oldNodes.replaceWith(nodes32);
      }));
      
      
      
      
    }
    var result__ = validator.get()(s.get(), after7);if(result__ !== undefined) after7(result__);
  } else {
    
    var node29 = $("<input>");
    
    var ref46 = inputType;
    if(ref46.get() !== null) {
      node29.attr('type', ref46.get());
      subs__.addSub(ref46.addEventListener('change', function(_, ref, val) {
        node29.attr('type', val);
      }));
      
    }
    subs__.addSub(ref46.rebind());
    
    var ref47 = style;
    if(ref47.get() !== null) {
      node29.attr('class', ref47.get());
      subs__.addSub(ref47.addEventListener('change', function(_, ref, val) {
        node29.attr('class', val);
      }));
      
    }
    subs__.addSub(ref47.rebind());
    
    var ref48 = placeholder;
    if(ref48.get() !== null) {
      node29.attr('placeholder', ref48.get());
      subs__.addSub(ref48.addEventListener('change', function(_, ref, val) {
        node29.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref48.rebind());
    
    var ref49 = s;
    node29.val(""+ref49.get());
    var ignore7 = false;
    subs__.addSub(ref49.addEventListener('change', function(_, ref, val) {
      if(ignore7) return;
      node29.val(""+val);
    }));
    subs__.addSub(ref49.rebind());
    
    subs__.addSub(mobl.domBind(node29, 'keyup change', function() {
      ignore7 = true;
      s.set(mobl.stringTomobl__String(node29.val()));
      ignore7 = false;
    }));
    
    
    var val27 = onchange.get();
    if(val27 !== null) {
      subs__.addSub(mobl.domBind(node29, 'change', val27));
    }
    
    var val28 = onkeyup.get();
    if(val28 !== null) {
      subs__.addSub(mobl.domBind(node29, 'keyup', val28));
    }
    
    var ref50 = autofocus;
    if(ref50.get() !== null) {
      node29.attr('autofocus', ref50.get());
      subs__.addSub(ref50.addEventListener('change', function(_, ref, val) {
        node29.attr('autofocus', val);
      }));
      
    }
    subs__.addSub(ref50.rebind());
    
    var ref51 = autocorrect;
    if(ref51.get() !== null) {
      node29.attr('autocorrect', ref51.get());
      subs__.addSub(ref51.addEventListener('change', function(_, ref, val) {
        node29.attr('autocorrect', val);
      }));
      
    }
    subs__.addSub(ref51.rebind());
    
    var ref52 = autocapitalize;
    if(ref52.get() !== null) {
      node29.attr('autocapitalize', ref52.get());
      subs__.addSub(ref52.addEventListener('change', function(_, ref, val) {
        node29.attr('autocapitalize', val);
      }));
      
    }
    subs__.addSub(ref52.rebind());
    
    var ref53 = autocomplete;
    if(ref53.get() !== null) {
      node29.attr('autocomplete', ref53.get());
      subs__.addSub(ref53.addEventListener('change', function(_, ref, val) {
        node29.attr('autocomplete', val);
      }));
      
    }
    subs__.addSub(ref53.rebind());
    
    node27.append(node29);
    
    
  }
};
renderCond4();
subs__.addSub(validator.addEventListener('change', function() {
  renderCond4();
}));

callback(root55); return subs__;


return subs__;
};

mobl.ui.generic.emailField = function(s, placeholder, label, validator, style, invalidStyle, autofocus, onchange, onkeyup, elements, callback) {
var root58 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes33 = $("<span>");
root58.append(nodes33);
subs__.addSub((mobl.ui.generic.textField)(s, placeholder, label, mobl.ref("email"), validator, style, invalidStyle, autofocus, mobl.ref(false), mobl.ref(false), mobl.ref(false), onchange, onkeyup, function(_, callback) {
  var root59 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root59); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes33;
  nodes33 = node.contents();
  oldNodes.replaceWith(nodes33);
}));
callback(root58); return subs__;

return subs__;
};

mobl.ui.generic.telField = function(phoneNumber, placeholder, label, validator, style, invalidStyle, autofocus, onchange, onkeyup, elements, callback) {
var root60 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes34 = $("<span>");
root60.append(nodes34);
subs__.addSub((mobl.ui.generic.textField)(phoneNumber, placeholder, label, mobl.ref("tel"), validator, style, invalidStyle, autofocus, mobl.ref(false), mobl.ref(false), mobl.ref(false), onchange, onkeyup, function(_, callback) {
  var root61 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root61); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes34;
  nodes34 = node.contents();
  oldNodes.replaceWith(nodes34);
}));
callback(root60); return subs__;

return subs__;
};

mobl.ui.generic.rangeField = function(n, min, max, step, placeholder, label, onchange, onkeyup, elements, callback) {
var root62 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node30 = $("<span>");
root62.append(node30);
var condSubs5 = new mobl.CompSubscription();
subs__.addSub(condSubs5);
var oldValue5;
var renderCond5 = function() {
  var value15 = label.get();
  if(oldValue5 === value15) return;
  oldValue5 = value15;
  var subs__ = condSubs5;
  subs__.unsubscribe();
  node30.empty();
  if(value15) {
    var nodes35 = $("<span>");
    node30.append(nodes35);
    subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
      var root63 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root63); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes35;
      nodes35 = node.contents();
      oldNodes.replaceWith(nodes35);
    }));
    
    
  } else {
    
  }
};
renderCond5();
subs__.addSub(label.addEventListener('change', function() {
  renderCond5();
}));


var node31 = $("<input>");
node31.attr('type', "range");

var ref54 = n;
node31.val(""+ref54.get());
var ignore8 = false;
subs__.addSub(ref54.addEventListener('change', function(_, ref, val) {
  if(ignore8) return;
  node31.val(""+val);
}));
subs__.addSub(ref54.rebind());

subs__.addSub(mobl.domBind(node31, 'keyup change', function() {
  ignore8 = true;
  n.set(mobl.stringTomobl__Num(node31.val()));
  ignore8 = false;
}));


var ref55 = min;
if(ref55.get() !== null) {
  node31.attr('min', ref55.get());
  subs__.addSub(ref55.addEventListener('change', function(_, ref, val) {
    node31.attr('min', val);
  }));
  
}
subs__.addSub(ref55.rebind());

var ref56 = max;
if(ref56.get() !== null) {
  node31.attr('max', ref56.get());
  subs__.addSub(ref56.addEventListener('change', function(_, ref, val) {
    node31.attr('max', val);
  }));
  
}
subs__.addSub(ref56.rebind());

var ref57 = step;
if(ref57.get() !== null) {
  node31.attr('step', ref57.get());
  subs__.addSub(ref57.addEventListener('change', function(_, ref, val) {
    node31.attr('step', val);
  }));
  
}
subs__.addSub(ref57.rebind());
node31.attr('style', "width: 99%;");

var val29 = onchange.get();
if(val29 !== null) {
  subs__.addSub(mobl.domBind(node31, 'change', val29));
}

var val30 = onkeyup.get();
if(val30 !== null) {
  subs__.addSub(mobl.domBind(node31, 'keyup', val30));
}

var ref58 = placeholder;
if(ref58.get() !== null) {
  node31.attr('placeholder', ref58.get());
  subs__.addSub(ref58.addEventListener('change', function(_, ref, val) {
    node31.attr('placeholder', val);
  }));
  
}
subs__.addSub(ref58.rebind());

root62.append(node31);
callback(root62); return subs__;


return subs__;
};

mobl.ui.generic.numField = function(n, label, placeholder, validator, style, invalidStyle, autofocus, step, min, max, onchange, onkeyup, elements, callback) {
var root64 = $("<span>");
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
  function after10(result__) {
    var tmp81 = result__;
    var validationMessage = mobl.ref(result__);
    
    var node32 = $("<span>");
    root64.append(node32);
    var condSubs6 = new mobl.CompSubscription();
    subs__.addSub(condSubs6);
    var oldValue6;
    var renderCond6 = function() {
      var value16 = label.get();
      if(oldValue6 === value16) return;
      oldValue6 = value16;
      var subs__ = condSubs6;
      subs__.unsubscribe();
      node32.empty();
      if(value16) {
        var nodes36 = $("<span>");
        node32.append(nodes36);
        subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
          var root65 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root65); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes36;
          nodes36 = node.contents();
          oldNodes.replaceWith(nodes36);
        }));
        
        
      } else {
        
      }
    };
    renderCond6();
    subs__.addSub(label.addEventListener('change', function() {
      renderCond6();
    }));
    
    
    var node33 = $("<input>");
    node33.attr('type', "number");
    
    var ref59 = mobl.ref(validationMessage.get() ? invalidStyle.get() : style.get());
    if(ref59.get() !== null) {
      node33.attr('class', ref59.get());
      subs__.addSub(ref59.addEventListener('change', function(_, ref, val) {
        node33.attr('class', val);
      }));
      subs__.addSub(validationMessage.addEventListener('change', function() {
        node33.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
      }));
      subs__.addSub(invalidStyle.addEventListener('change', function() {
        node33.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
      }));
      subs__.addSub(style.addEventListener('change', function() {
        node33.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
      }));
      
    }
    subs__.addSub(ref59.rebind());
    
    var ref60 = placeholder;
    if(ref60.get() !== null) {
      node33.attr('placeholder', ref60.get());
      subs__.addSub(ref60.addEventListener('change', function(_, ref, val) {
        node33.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref60.rebind());
    
    var ref61 = n;
    node33.val(""+ref61.get());
    var ignore9 = false;
    subs__.addSub(ref61.addEventListener('change', function(_, ref, val) {
      if(ignore9) return;
      node33.val(""+val);
    }));
    subs__.addSub(ref61.rebind());
    
    subs__.addSub(mobl.domBind(node33, 'keyup change', function() {
      ignore9 = true;
      n.set(mobl.stringTomobl__Num(node33.val()));
      ignore9 = false;
    }));
    
    
    var val31 = onchange.get();
    if(val31 !== null) {
      subs__.addSub(mobl.domBind(node33, 'change', val31));
    }
    
    var val32 = function(event, callback) {
                  if(event && event.stopPropagation) event.stopPropagation();
                  function after8(result__) {
                    var tmp82 = result__;
                    var result__ = tmp82;
                    validationMessage.set(result__);
                    var result__ = onkeyup.get();
                    if(result__) {
                      function after9(result__) {
                        var tmp83 = result__;
                        if(callback && callback.apply) callback(); return;
                      }
                      var result__ = onkeyup.get()(event, after9);if(result__ !== undefined) after9(result__);
                    } else {
                      {
                        if(callback && callback.apply) callback(); return;
                      }
                    }
                  }
                  var result__ = validator.get()(n.get(), after8);if(result__ !== undefined) after8(result__);
                };
    if(val32 !== null) {
      subs__.addSub(mobl.domBind(node33, 'keyup', val32));
    }
    
    var ref62 = autofocus;
    if(ref62.get() !== null) {
      node33.attr('autofocus', ref62.get());
      subs__.addSub(ref62.addEventListener('change', function(_, ref, val) {
        node33.attr('autofocus', val);
      }));
      
    }
    subs__.addSub(ref62.rebind());
    
    var ref63 = step;
    if(ref63.get() !== null) {
      node33.attr('step', ref63.get());
      subs__.addSub(ref63.addEventListener('change', function(_, ref, val) {
        node33.attr('step', val);
      }));
      
    }
    subs__.addSub(ref63.rebind());
    
    var ref64 = min;
    if(ref64.get() !== null) {
      node33.attr('min', ref64.get());
      subs__.addSub(ref64.addEventListener('change', function(_, ref, val) {
        node33.attr('min', val);
      }));
      
    }
    subs__.addSub(ref64.rebind());
    
    var ref65 = max;
    if(ref65.get() !== null) {
      node33.attr('max', ref65.get());
      subs__.addSub(ref65.addEventListener('change', function(_, ref, val) {
        node33.attr('max', val);
      }));
      
    }
    subs__.addSub(ref65.rebind());
    
    root64.append(node33);
    var nodes37 = $("<span>");
    root64.append(nodes37);
    subs__.addSub((mobl.label)(validationMessage, mobl.ref(mobl.ui.generic.validationMessageStyle), mobl.ref(null), function(_, callback) {
      var root66 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root66); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes37;
      nodes37 = node.contents();
      oldNodes.replaceWith(nodes37);
    }));
    callback(root64); return subs__;
    
    
    
  }
  var result__ = validator.get()(n.get(), after10);if(result__ !== undefined) after10(result__);
} else {
  {
    function after10(result__) {
      var tmp81 = result__;
      var validationMessage = mobl.ref(result__);
      
      var node32 = $("<span>");
      root64.append(node32);
      var condSubs6 = new mobl.CompSubscription();
      subs__.addSub(condSubs6);
      var oldValue6;
      var renderCond6 = function() {
        var value16 = label.get();
        if(oldValue6 === value16) return;
        oldValue6 = value16;
        var subs__ = condSubs6;
        subs__.unsubscribe();
        node32.empty();
        if(value16) {
          var nodes36 = $("<span>");
          node32.append(nodes36);
          subs__.addSub((mobl.label)(label, mobl.ref(mobl.ui.generic.textFieldLabelStyle), mobl.ref(null), function(_, callback) {
            var root65 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            callback(root65); return subs__;
            return subs__;
          }, function(node) {
            var oldNodes = nodes36;
            nodes36 = node.contents();
            oldNodes.replaceWith(nodes36);
          }));
          
          
        } else {
          
        }
      };
      renderCond6();
      subs__.addSub(label.addEventListener('change', function() {
        renderCond6();
      }));
      
      
      var node33 = $("<input>");
      node33.attr('type', "number");
      
      var ref59 = mobl.ref(validationMessage.get() ? invalidStyle.get() : style.get());
      if(ref59.get() !== null) {
        node33.attr('class', ref59.get());
        subs__.addSub(ref59.addEventListener('change', function(_, ref, val) {
          node33.attr('class', val);
        }));
        subs__.addSub(validationMessage.addEventListener('change', function() {
          node33.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(invalidStyle.addEventListener('change', function() {
          node33.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        subs__.addSub(style.addEventListener('change', function() {
          node33.attr('class', validationMessage.get() ? invalidStyle.get() : style.get());
        }));
        
      }
      subs__.addSub(ref59.rebind());
      
      var ref60 = placeholder;
      if(ref60.get() !== null) {
        node33.attr('placeholder', ref60.get());
        subs__.addSub(ref60.addEventListener('change', function(_, ref, val) {
          node33.attr('placeholder', val);
        }));
        
      }
      subs__.addSub(ref60.rebind());
      
      var ref61 = n;
      node33.val(""+ref61.get());
      var ignore9 = false;
      subs__.addSub(ref61.addEventListener('change', function(_, ref, val) {
        if(ignore9) return;
        node33.val(""+val);
      }));
      subs__.addSub(ref61.rebind());
      
      subs__.addSub(mobl.domBind(node33, 'keyup change', function() {
        ignore9 = true;
        n.set(mobl.stringTomobl__Num(node33.val()));
        ignore9 = false;
      }));
      
      
      var val31 = onchange.get();
      if(val31 !== null) {
        subs__.addSub(mobl.domBind(node33, 'change', val31));
      }
      
      var val32 = function(event, callback) {
                    if(event && event.stopPropagation) event.stopPropagation();
                    function after8(result__) {
                      var tmp82 = result__;
                      var result__ = tmp82;
                      validationMessage.set(result__);
                      var result__ = onkeyup.get();
                      if(result__) {
                        function after9(result__) {
                          var tmp83 = result__;
                          if(callback && callback.apply) callback(); return;
                        }
                        var result__ = onkeyup.get()(event, after9);if(result__ !== undefined) after9(result__);
                      } else {
                        {
                          if(callback && callback.apply) callback(); return;
                        }
                      }
                    }
                    var result__ = validator.get()(n.get(), after8);if(result__ !== undefined) after8(result__);
                  };
      if(val32 !== null) {
        subs__.addSub(mobl.domBind(node33, 'keyup', val32));
      }
      
      var ref62 = autofocus;
      if(ref62.get() !== null) {
        node33.attr('autofocus', ref62.get());
        subs__.addSub(ref62.addEventListener('change', function(_, ref, val) {
          node33.attr('autofocus', val);
        }));
        
      }
      subs__.addSub(ref62.rebind());
      
      var ref63 = step;
      if(ref63.get() !== null) {
        node33.attr('step', ref63.get());
        subs__.addSub(ref63.addEventListener('change', function(_, ref, val) {
          node33.attr('step', val);
        }));
        
      }
      subs__.addSub(ref63.rebind());
      
      var ref64 = min;
      if(ref64.get() !== null) {
        node33.attr('min', ref64.get());
        subs__.addSub(ref64.addEventListener('change', function(_, ref, val) {
          node33.attr('min', val);
        }));
        
      }
      subs__.addSub(ref64.rebind());
      
      var ref65 = max;
      if(ref65.get() !== null) {
        node33.attr('max', ref65.get());
        subs__.addSub(ref65.addEventListener('change', function(_, ref, val) {
          node33.attr('max', val);
        }));
        
      }
      subs__.addSub(ref65.rebind());
      
      root64.append(node33);
      var nodes37 = $("<span>");
      root64.append(nodes37);
      subs__.addSub((mobl.label)(validationMessage, mobl.ref(mobl.ui.generic.validationMessageStyle), mobl.ref(null), function(_, callback) {
        var root66 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root66); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes37;
        nodes37 = node.contents();
        oldNodes.replaceWith(nodes37);
      }));
      callback(root64); return subs__;
      
      
      
    }
    var result__ = validator.get()(n.get(), after10);if(result__ !== undefined) after10(result__);
  }
}
return subs__;
};

mobl.ui.generic.passwordField = function(s, placeholder, label, style, onchange, onkeyup, elements, callback) {
var root67 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node34 = $("<span>");
root67.append(node34);
var condSubs7 = new mobl.CompSubscription();
subs__.addSub(condSubs7);
var oldValue7;
var renderCond7 = function() {
  var value17 = label.get();
  if(oldValue7 === value17) return;
  oldValue7 = value17;
  var subs__ = condSubs7;
  subs__.unsubscribe();
  node34.empty();
  if(value17) {
    
    var node35 = $("<span>");
    node35.attr('style', "float: left; margin-top: 0.2em; width: 5em; color: #666;");
    
    var ref69 = label;
    node35.text(""+ref69.get());
    var ignore11 = false;
    subs__.addSub(ref69.addEventListener('change', function(_, ref, val) {
      if(ignore11) return;
      node35.text(""+val);
    }));
    subs__.addSub(ref69.rebind());
    
    
    node34.append(node35);
    
    var node36 = $("<span>");
    node36.attr('style', "float: left");
    
    
    var node37 = $("<input>");
    node37.attr('type', "password");
    
    var ref66 = style;
    if(ref66.get() !== null) {
      node37.attr('class', ref66.get());
      subs__.addSub(ref66.addEventListener('change', function(_, ref, val) {
        node37.attr('class', val);
      }));
      
    }
    subs__.addSub(ref66.rebind());
    
    var ref67 = placeholder;
    if(ref67.get() !== null) {
      node37.attr('placeholder', ref67.get());
      subs__.addSub(ref67.addEventListener('change', function(_, ref, val) {
        node37.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref67.rebind());
    
    var ref68 = s;
    node37.val(""+ref68.get());
    var ignore10 = false;
    subs__.addSub(ref68.addEventListener('change', function(_, ref, val) {
      if(ignore10) return;
      node37.val(""+val);
    }));
    subs__.addSub(ref68.rebind());
    
    subs__.addSub(mobl.domBind(node37, 'keyup change', function() {
      ignore10 = true;
      s.set(mobl.stringTomobl__String(node37.val()));
      ignore10 = false;
    }));
    
    
    var val33 = onchange.get();
    if(val33 !== null) {
      subs__.addSub(mobl.domBind(node37, 'change', val33));
    }
    
    var val34 = onkeyup.get();
    if(val34 !== null) {
      subs__.addSub(mobl.domBind(node37, 'keyup', val34));
    }
    
    var val35 = function(event, callback) {
                  if(event && event.stopPropagation) event.stopPropagation();
                  var result__ = mobl.ui.generic.scrollUp();
                  if(callback && callback.apply) callback(); return;
                };
    if(val35 !== null) {
      subs__.addSub(mobl.domBind(node37, 'blur', val35));
    }
    
    node36.append(node37);
    node34.append(node36);
    
    
    
    
  } else {
    
    var node38 = $("<input>");
    node38.attr('type', "password");
    
    var ref70 = style;
    if(ref70.get() !== null) {
      node38.attr('class', ref70.get());
      subs__.addSub(ref70.addEventListener('change', function(_, ref, val) {
        node38.attr('class', val);
      }));
      
    }
    subs__.addSub(ref70.rebind());
    
    var ref71 = placeholder;
    if(ref71.get() !== null) {
      node38.attr('placeholder', ref71.get());
      subs__.addSub(ref71.addEventListener('change', function(_, ref, val) {
        node38.attr('placeholder', val);
      }));
      
    }
    subs__.addSub(ref71.rebind());
    
    var ref72 = s;
    node38.val(""+ref72.get());
    var ignore12 = false;
    subs__.addSub(ref72.addEventListener('change', function(_, ref, val) {
      if(ignore12) return;
      node38.val(""+val);
    }));
    subs__.addSub(ref72.rebind());
    
    subs__.addSub(mobl.domBind(node38, 'keyup change', function() {
      ignore12 = true;
      s.set(mobl.stringTomobl__String(node38.val()));
      ignore12 = false;
    }));
    
    
    var val36 = onchange.get();
    if(val36 !== null) {
      subs__.addSub(mobl.domBind(node38, 'change', val36));
    }
    
    var val37 = onkeyup.get();
    if(val37 !== null) {
      subs__.addSub(mobl.domBind(node38, 'keyup', val37));
    }
    
    var val38 = function(event, callback) {
                  if(event && event.stopPropagation) event.stopPropagation();
                  var result__ = mobl.ui.generic.scrollUp();
                  if(callback && callback.apply) callback(); return;
                };
    if(val38 !== null) {
      subs__.addSub(mobl.domBind(node38, 'blur', val38));
    }
    
    node34.append(node38);
    
    
  }
};
renderCond7();
subs__.addSub(label.addEventListener('change', function() {
  renderCond7();
}));

callback(root67); return subs__;

return subs__;
};
mobl.ui.generic.selectFieldStyle = 'mobl__ui__generic__selectFieldStyle';

mobl.ui.generic.selectField = function(value, options, onchange, style, optionStyle, elements, callback) {
var root68 = $("<span>");
var subs__ = new mobl.CompSubscription();

var sel = $("<select>");

var ref77 = style;
if(ref77.get() !== null) {
  sel.attr('class', ref77.get());
  subs__.addSub(ref77.addEventListener('change', function(_, ref, val) {
    sel.attr('class', val);
  }));
  
}
subs__.addSub(ref77.rebind());

var val39 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = sel.val();
              value.set(result__);
              var result__ = onchange.get();
              if(result__) {
                function after11(result__) {
                  var tmp85 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onchange.get()(event, after11);if(result__ !== undefined) after11(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val39 !== null) {
  subs__.addSub(mobl.domBind(sel, 'change', val39));
}


var node39 = mobl.loadingSpan();
sel.append(node39);
var list158;
var listSubs2 = new mobl.CompSubscription();
subs__.addSub(listSubs2);
var renderList2 = function() {
  var subs__ = listSubs2;
  list158 = options.get();
  list158.list(function(results2) {
    node39.empty();
    for(var i2 = 0; i2 < results2.length; i2++) {
      (function() {
        var iternode2 = $("<span>");
        node39.append(iternode2);
        var optionValue;var optionDescription;
        optionValue = mobl.ref(mobl.ref(mobl.ref(results2), i2), "_1");optionDescription = mobl.ref(mobl.ref(mobl.ref(results2), i2), "_2");
        
        var node40 = $("<option>");
        
        var ref73 = optionDescription;
        node40.text(""+ref73.get());
        var ignore13 = false;
        subs__.addSub(ref73.addEventListener('change', function(_, ref, val) {
          if(ignore13) return;
          node40.text(""+val);
        }));
        subs__.addSub(ref73.rebind());
        
        
        var ref74 = optionStyle;
        if(ref74.get() !== null) {
          node40.attr('class', ref74.get());
          subs__.addSub(ref74.addEventListener('change', function(_, ref, val) {
            node40.attr('class', val);
          }));
          
        }
        subs__.addSub(ref74.rebind());
        
        var ref75 = optionValue;
        if(ref75.get() !== null) {
          node40.attr('value', ref75.get());
          subs__.addSub(ref75.addEventListener('change', function(_, ref, val) {
            node40.attr('value', val);
          }));
          
        }
        subs__.addSub(ref75.rebind());
        
        var ref76 = mobl.ref(value.get() == optionValue.get() ? "selected" : "");
        if(ref76.get() !== null) {
          node40.attr('selected', ref76.get());
          subs__.addSub(ref76.addEventListener('change', function(_, ref, val) {
            node40.attr('selected', val);
          }));
          subs__.addSub(value.addEventListener('change', function() {
            node40.attr('selected', value.get() == optionValue.get() ? "selected" : "");
          }));
          subs__.addSub(optionValue.addEventListener('change', function() {
            node40.attr('selected', value.get() == optionValue.get() ? "selected" : "");
          }));
          
        }
        subs__.addSub(ref76.rebind());
        
        iternode2.append(node40);
        
        var oldNodes = iternode2;
        iternode2 = iternode2.contents();
        oldNodes.replaceWith(iternode2);
        
        
      }());
    }
    mobl.delayedUpdateScrollers();
    subs__.addSub(list158.addEventListener('change', function() { listSubs2.unsubscribe(); renderList2(true); }));
    subs__.addSub(options.addEventListener('change', function() { listSubs2.unsubscribe(); renderList2(true); }));
  });
};
renderList2();

root68.append(sel);
var result__ = sel.append(sel.children().eq(0).children());
callback(root68); return subs__;


return subs__;
};
mobl.ui.generic.tabbarStyle = 'mobl__ui__generic__tabbarStyle';
mobl.ui.generic.inActiveTabButtonStyle = 'mobl__ui__generic__inActiveTabButtonStyle';
mobl.ui.generic.activeTabButtonStyle = 'mobl__ui__generic__activeTabButtonStyle';
mobl.ui.generic.inActiveTabStyle = 'mobl__ui__generic__inActiveTabStyle';
mobl.ui.generic.activeTabStyle = 'mobl__ui__generic__activeTabStyle';

mobl.ui.generic.tabSet = function(tabs, activeTab, screenContextId, elements, callback) {
var root69 = $("<span>");
var subs__ = new mobl.CompSubscription();
var result__ = activeTab.get() == null;
if(result__) {
  var result__ = tabs.get().get(0)._1;
  activeTab.set(result__);
  
  var s = mobl.ref("");
  var nodes38 = $("<span>");
  root69.append(nodes38);
  subs__.addSub((mobl.block)(mobl.ref(mobl.ui.generic.tabbarStyle), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root70 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    var node41 = mobl.loadingSpan();
    root70.append(node41);
    var list159;
    var listSubs3 = new mobl.CompSubscription();
    subs__.addSub(listSubs3);
    var renderList3 = function() {
      var subs__ = listSubs3;
      list159 = tabs.get();
      list159.list(function(results3) {
        node41.empty();
        for(var i3 = 0; i3 < results3.length; i3++) {
          (function() {
            var iternode3 = $("<span>");
            node41.append(iternode3);
            var tabName;var tabIcon;var tabControl;
            tabName = mobl.ref(mobl.ref(mobl.ref(results3), i3), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results3), i3), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results3), i3), "_3");
            var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle;
            var tmp46 = mobl.ref(result__);
            subs__.addSub(activeTab.addEventListener('change', function() {
              tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            subs__.addSub(tabName.addEventListener('change', function() {
              tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.activeTabButtonStyle).addEventListener('change', function() {
              tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabButtonStyle).addEventListener('change', function() {
              tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
            }));
            
            var result__ = function(event, callback) {
                             if(event && event.stopPropagation) event.stopPropagation();
                             var result__ = tabName.get();
                             activeTab.set(result__);
                             if(callback && callback.apply) callback(); return;
                           };
            var tmp45 = mobl.ref(result__);
            
            var nodes39 = $("<span>");
            iternode3.append(nodes39);
            subs__.addSub((mobl.span)(tmp46, mobl.ref(null), tmp45, mobl.ref(null), function(_, callback) {
              var root71 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var nodes40 = $("<span>");
              root71.append(nodes40);
              subs__.addSub((mobl.label)(tabName, mobl.ref(null), mobl.ref(null), function(_, callback) {
                var root72 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                callback(root72); return subs__;
                return subs__;
              }, function(node) {
                var oldNodes = nodes40;
                nodes40 = node.contents();
                oldNodes.replaceWith(nodes40);
              }));
              callback(root71); return subs__;
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes39;
              nodes39 = node.contents();
              oldNodes.replaceWith(nodes39);
            }));
            
            var oldNodes = iternode3;
            iternode3 = iternode3.contents();
            oldNodes.replaceWith(iternode3);
            
            
          }());
        }
        mobl.delayedUpdateScrollers();
        subs__.addSub(list159.addEventListener('change', function() { listSubs3.unsubscribe(); renderList3(true); }));
        subs__.addSub(tabs.addEventListener('change', function() { listSubs3.unsubscribe(); renderList3(true); }));
      });
    };
    renderList3();
    
    callback(root70); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes38;
    nodes38 = node.contents();
    oldNodes.replaceWith(nodes38);
  }));
  
  var node42 = mobl.loadingSpan();
  root69.append(node42);
  var list160;
  var listSubs4 = new mobl.CompSubscription();
  subs__.addSub(listSubs4);
  var renderList4 = function() {
    var subs__ = listSubs4;
    list160 = tabs.get();
    list160.list(function(results4) {
      node42.empty();
      for(var i4 = 0; i4 < results4.length; i4++) {
        (function() {
          var iternode4 = $("<span>");
          node42.append(iternode4);
          var tabName;var tabIcon;var tabControl;
          tabName = mobl.ref(mobl.ref(mobl.ref(results4), i4), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results4), i4), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results4), i4), "_3");
          var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle;
          var tmp47 = mobl.ref(result__);
          subs__.addSub(activeTab.addEventListener('change', function() {
            tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          subs__.addSub(tabName.addEventListener('change', function() {
            tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.activeTabStyle).addEventListener('change', function() {
            tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabStyle).addEventListener('change', function() {
            tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
          }));
          
          var nodes41 = $("<span>");
          iternode4.append(nodes41);
          subs__.addSub((mobl.block)(tmp47, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
            var root73 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes42 = $("<span>");
            root73.append(nodes42);
            subs__.addSub((mobl.screenContext)(screenContextId, function(_, callback) {
              var root74 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var nodes43 = $("<span>");
              root74.append(nodes43);
              subs__.addSub(tabControl.addEventListener('change', function() {
                renderControl10();
              }));
              
              function renderControl10() {
                subs__.addSub((tabControl.get())(function(elements, callback) {
                  var root75 = $("<span>");
                  var subs__ = new mobl.CompSubscription();
                  callback(root75); return subs__;
                  return subs__;
                }, function(node) {
                  var oldNodes = nodes43;
                  nodes43 = node.contents();
                  oldNodes.replaceWith(nodes43);
                }));
              }
              renderControl10();
              callback(root74); return subs__;
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes42;
              nodes42 = node.contents();
              oldNodes.replaceWith(nodes42);
            }));
            callback(root73); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes41;
            nodes41 = node.contents();
            oldNodes.replaceWith(nodes41);
          }));
          
          var oldNodes = iternode4;
          iternode4 = iternode4.contents();
          oldNodes.replaceWith(iternode4);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list160.addEventListener('change', function() { listSubs4.unsubscribe(); renderList4(true); }));
      subs__.addSub(tabs.addEventListener('change', function() { listSubs4.unsubscribe(); renderList4(true); }));
    });
  };
  renderList4();
  
  callback(root69); return subs__;
  
  
} else {
  {
    
    var s = mobl.ref("");
    var nodes38 = $("<span>");
    root69.append(nodes38);
    subs__.addSub((mobl.block)(mobl.ref(mobl.ui.generic.tabbarStyle), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root70 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      var node41 = mobl.loadingSpan();
      root70.append(node41);
      var list159;
      var listSubs3 = new mobl.CompSubscription();
      subs__.addSub(listSubs3);
      var renderList3 = function() {
        var subs__ = listSubs3;
        list159 = tabs.get();
        list159.list(function(results3) {
          node41.empty();
          for(var i3 = 0; i3 < results3.length; i3++) {
            (function() {
              var iternode3 = $("<span>");
              node41.append(iternode3);
              var tabName;var tabIcon;var tabControl;
              tabName = mobl.ref(mobl.ref(mobl.ref(results3), i3), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results3), i3), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results3), i3), "_3");
              var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle;
              var tmp46 = mobl.ref(result__);
              subs__.addSub(activeTab.addEventListener('change', function() {
                tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              subs__.addSub(tabName.addEventListener('change', function() {
                tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              subs__.addSub(mobl.ref(mobl.ui.generic.activeTabButtonStyle).addEventListener('change', function() {
                tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabButtonStyle).addEventListener('change', function() {
                tmp46.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabButtonStyle : mobl.ui.generic.inActiveTabButtonStyle);
              }));
              
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               var result__ = tabName.get();
                               activeTab.set(result__);
                               if(callback && callback.apply) callback(); return;
                             };
              var tmp45 = mobl.ref(result__);
              
              var nodes39 = $("<span>");
              iternode3.append(nodes39);
              subs__.addSub((mobl.span)(tmp46, mobl.ref(null), tmp45, mobl.ref(null), function(_, callback) {
                var root71 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes40 = $("<span>");
                root71.append(nodes40);
                subs__.addSub((mobl.label)(tabName, mobl.ref(null), mobl.ref(null), function(_, callback) {
                  var root72 = $("<span>");
                  var subs__ = new mobl.CompSubscription();
                  callback(root72); return subs__;
                  return subs__;
                }, function(node) {
                  var oldNodes = nodes40;
                  nodes40 = node.contents();
                  oldNodes.replaceWith(nodes40);
                }));
                callback(root71); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes39;
                nodes39 = node.contents();
                oldNodes.replaceWith(nodes39);
              }));
              
              var oldNodes = iternode3;
              iternode3 = iternode3.contents();
              oldNodes.replaceWith(iternode3);
              
              
            }());
          }
          mobl.delayedUpdateScrollers();
          subs__.addSub(list159.addEventListener('change', function() { listSubs3.unsubscribe(); renderList3(true); }));
          subs__.addSub(tabs.addEventListener('change', function() { listSubs3.unsubscribe(); renderList3(true); }));
        });
      };
      renderList3();
      
      callback(root70); return subs__;
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes38;
      nodes38 = node.contents();
      oldNodes.replaceWith(nodes38);
    }));
    
    var node42 = mobl.loadingSpan();
    root69.append(node42);
    var list160;
    var listSubs4 = new mobl.CompSubscription();
    subs__.addSub(listSubs4);
    var renderList4 = function() {
      var subs__ = listSubs4;
      list160 = tabs.get();
      list160.list(function(results4) {
        node42.empty();
        for(var i4 = 0; i4 < results4.length; i4++) {
          (function() {
            var iternode4 = $("<span>");
            node42.append(iternode4);
            var tabName;var tabIcon;var tabControl;
            tabName = mobl.ref(mobl.ref(mobl.ref(results4), i4), "_1");tabIcon = mobl.ref(mobl.ref(mobl.ref(results4), i4), "_2");tabControl = mobl.ref(mobl.ref(mobl.ref(results4), i4), "_3");
            var result__ = activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle;
            var tmp47 = mobl.ref(result__);
            subs__.addSub(activeTab.addEventListener('change', function() {
              tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            subs__.addSub(tabName.addEventListener('change', function() {
              tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.activeTabStyle).addEventListener('change', function() {
              tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            subs__.addSub(mobl.ref(mobl.ui.generic.inActiveTabStyle).addEventListener('change', function() {
              tmp47.set(activeTab.get() == tabName.get() ? mobl.ui.generic.activeTabStyle : mobl.ui.generic.inActiveTabStyle);
            }));
            
            var nodes41 = $("<span>");
            iternode4.append(nodes41);
            subs__.addSub((mobl.block)(tmp47, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
              var root73 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              var nodes42 = $("<span>");
              root73.append(nodes42);
              subs__.addSub((mobl.screenContext)(screenContextId, function(_, callback) {
                var root74 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes43 = $("<span>");
                root74.append(nodes43);
                subs__.addSub(tabControl.addEventListener('change', function() {
                  renderControl10();
                }));
                
                function renderControl10() {
                  subs__.addSub((tabControl.get())(function(elements, callback) {
                    var root75 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root75); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes43;
                    nodes43 = node.contents();
                    oldNodes.replaceWith(nodes43);
                  }));
                }
                renderControl10();
                callback(root74); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes42;
                nodes42 = node.contents();
                oldNodes.replaceWith(nodes42);
              }));
              callback(root73); return subs__;
              
              return subs__;
            }, function(node) {
              var oldNodes = nodes41;
              nodes41 = node.contents();
              oldNodes.replaceWith(nodes41);
            }));
            
            var oldNodes = iternode4;
            iternode4 = iternode4.contents();
            oldNodes.replaceWith(iternode4);
            
            
          }());
        }
        mobl.delayedUpdateScrollers();
        subs__.addSub(list160.addEventListener('change', function() { listSubs4.unsubscribe(); renderList4(true); }));
        subs__.addSub(tabs.addEventListener('change', function() { listSubs4.unsubscribe(); renderList4(true); }));
      });
    };
    renderList4();
    
    callback(root69); return subs__;
    
    
  }
}
return subs__;
};
mobl.ui.generic.searchboxStyle = 'mobl__ui__generic__searchboxStyle';
mobl.ui.generic.searchBoxInputStyle = 'mobl__ui__generic__searchBoxInputStyle';

mobl.ui.generic.searchBox = function(s, placeholder, onsearch, onkeyup, elements, callback) {
var root76 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node43 = $("<div>");

var ref81 = mobl.ref(mobl.ui.generic.searchboxStyle);
if(ref81.get() !== null) {
  node43.attr('class', ref81.get());
  subs__.addSub(ref81.addEventListener('change', function(_, ref, val) {
    node43.attr('class', val);
  }));
  
}
subs__.addSub(ref81.rebind());


var node44 = $("<input>");
node44.attr('type', "search");

var ref78 = mobl.ref(mobl.ui.generic.searchBoxInputStyle);
if(ref78.get() !== null) {
  node44.attr('class', ref78.get());
  subs__.addSub(ref78.addEventListener('change', function(_, ref, val) {
    node44.attr('class', val);
  }));
  
}
subs__.addSub(ref78.rebind());

var ref79 = placeholder;
if(ref79.get() !== null) {
  node44.attr('placeholder', ref79.get());
  subs__.addSub(ref79.addEventListener('change', function(_, ref, val) {
    node44.attr('placeholder', val);
  }));
  
}
subs__.addSub(ref79.rebind());

var ref80 = s;
node44.val(""+ref80.get());
var ignore14 = false;
subs__.addSub(ref80.addEventListener('change', function(_, ref, val) {
  if(ignore14) return;
  node44.val(""+val);
}));
subs__.addSub(ref80.rebind());

subs__.addSub(mobl.domBind(node44, 'keyup change', function() {
  ignore14 = true;
  s.set(mobl.stringTomobl__String(node44.val()));
  ignore14 = false;
}));


var val40 = onsearch.get();
if(val40 !== null) {
  subs__.addSub(mobl.domBind(node44, 'change', val40));
}

var val41 = onkeyup.get();
if(val41 !== null) {
  subs__.addSub(mobl.domBind(node44, 'keyup', val41));
}
node44.attr('autocorrect', false);
node44.attr('autocapitalize', false);
node44.attr('autocomplete', false);

node43.append(node44);
root76.append(node43);
callback(root76); return subs__;


return subs__;
};
mobl.ui.generic.contextMenuStyle = 'mobl__ui__generic__contextMenuStyle';
mobl.ui.generic.buttonStyle = 'mobl__ui__generic__buttonStyle';
mobl.ui.generic.buttonPushedStyle = 'mobl__ui__generic__buttonPushedStyle';

mobl.ui.generic.contextMenu = function(elements, callback) {
var root77 = $("<span>");
var subs__ = new mobl.CompSubscription();

var menu = $("<div>");

var ref82 = mobl.ref(mobl.ui.generic.contextMenuStyle);
if(ref82.get() !== null) {
  menu.attr('class', ref82.get());
  subs__.addSub(ref82.addEventListener('change', function(_, ref, val) {
    menu.attr('class', val);
  }));
  
}
subs__.addSub(ref82.rebind());

var nodes44 = $("<span>");
menu.append(nodes44);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl11();
}));

function renderControl11() {
  subs__.addSub((elements)(function(elements, callback) {
    var root78 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root78); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes44;
    nodes44 = node.contents();
    oldNodes.replaceWith(nodes44);
  }));
}
renderControl11();
root77.append(menu);
var result__ = menu.hide();

var img = $("<img>");
img.attr('src', "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABIAAAASCAYAAABWzo5XAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAA0AAAANABeWPPlAAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAEuSURBVDiNrdSrTkNBEMbx35aLIhUNEl4CsCSkmgfBoOoJz0B4BhSSBEcQSMA3GBJE34Br6CA6heWUA4huMuLszvc/c9stEaG5Sil97GADm7l9g1tcRsTFjCgiPg09nCDSxhimjav9E/S+aSvINkbpeIU+utV5N/eu0meE7W+gjGSEFwzQqf/WiLqTPi+p6dWgaTqDNsAPwME0zWmd+1U6rZG0RDZNs9/J7sBBRIxnutGy0vcgP3cWTVocuC6lLGD9H5z3iHjAdWo3ZMGGVchHvtrcZnuV/zAZM6CCUzz9AHjGYaNWn6Azk2GrZ2YJlw3YI44bkG5qzzomY1+wVRXyDbu4w2sCz7HfqNVWam/5pf1YxX2eLf/W/j8HEmtY+XMg53pF5nZp5/GMlHk9bB8Ws56C3JDK8wAAAABJRU5ErkJggg==");
img.attr('style', "float: right;");

var val42 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = img.parent();
              var target = result__;
              var result__ = target.css("position", "relative");
              var result__ = img.hide();
              var result__ = menu.css("right", "5px");
              var result__ = menu.css("top", "5px");
              var result__ = menu.show();
              mobl.sleep(500, function(result__) {
                var tmp88 = result__;
                var result__ = mobl.$("body").bind("tap", removeMenu);
                if(callback && callback.apply) callback(); return;
              });
            };
if(val42 !== null) {
  subs__.addSub(mobl.domBind(img, 'tap', val42));
}

root77.append(img);

var removeMenu = function(evt) {
   var __this = this;
  menu.hide();
  img.show();
  mobl.$("body").unbind("tap", removeMenu);
};


callback(root77); return subs__;



return subs__;
};

mobl.ui.generic.masterDetail = function(items, masterItem, detail, elements, callback) {
var root79 = $("<span>");
var subs__ = new mobl.CompSubscription();
var result__ = mobl.window.get().innerWidth > 500;
var tmp69 = mobl.ref(result__);
subs__.addSub(mobl.ref(mobl.window, 'innerWidth').addEventListener('change', function() {
  tmp69.set(mobl.window.get().innerWidth > 500);
}));


var node45 = $("<span>");
root79.append(node45);
var condSubs8 = new mobl.CompSubscription();
subs__.addSub(condSubs8);
var oldValue8;
var renderCond8 = function() {
  var value18 = tmp69.get();
  if(oldValue8 === value18) return;
  oldValue8 = value18;
  var subs__ = condSubs8;
  subs__.unsubscribe();
  node45.empty();
  if(value18) {
    items.get().one(function(result__) {
      var tmp89 = result__;
      var current = mobl.ref(result__);
      
      var node46 = $("<div>");
      node46.attr('width', "100%");
      
      
      var node47 = $("<div>");
      node47.attr('style', "float:left; width:33%; position:relative; border-right: solid 1px #cccccc;");
      
      var nodes47 = $("<span>");
      node47.append(nodes47);
      subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
        var root82 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        
        var node50 = mobl.loadingSpan();
        root82.append(node50);
        var list161;
        var listSubs5 = new mobl.CompSubscription();
        subs__.addSub(listSubs5);
        var renderList5 = function() {
          var subs__ = listSubs5;
          list161 = items.get();
          list161.list(function(results5) {
            node50.empty();
            for(var i5 = 0; i5 < results5.length; i5++) {
              (function() {
                var iternode5 = $("<span>");
                node50.append(iternode5);
                var it;
                it = mobl.ref(mobl.ref(results5), i5);
                var result__ = it.get() == current.get();
                var tmp54 = mobl.ref(result__);
                subs__.addSub(it.addEventListener('change', function() {
                  tmp54.set(it.get() == current.get());
                }));
                subs__.addSub(current.addEventListener('change', function() {
                  tmp54.set(it.get() == current.get());
                }));
                
                
                var node51 = $("<span>");
                iternode5.append(node51);
                var condSubs10 = new mobl.CompSubscription();
                subs__.addSub(condSubs10);
                var oldValue10;
                var renderCond10 = function() {
                  var value20 = tmp54.get();
                  if(oldValue10 === value20) return;
                  oldValue10 = value20;
                  var subs__ = condSubs10;
                  subs__.unsubscribe();
                  node51.empty();
                  if(value20) {
                    var nodes48 = $("<span>");
                    node51.append(nodes48);
                    subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.selectedItemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
                      var root83 = $("<span>");
                      var subs__ = new mobl.CompSubscription();
                      var nodes49 = $("<span>");
                      root83.append(nodes49);
                      subs__.addSub(masterItem.addEventListener('change', function() {
                        renderControl13();
                      }));
                      
                      function renderControl13() {
                        subs__.addSub((masterItem.get())(it, function(elements, callback) {
                          var root84 = $("<span>");
                          var subs__ = new mobl.CompSubscription();
                          callback(root84); return subs__;
                          return subs__;
                        }, function(node) {
                          var oldNodes = nodes49;
                          nodes49 = node.contents();
                          oldNodes.replaceWith(nodes49);
                        }));
                      }
                      renderControl13();
                      callback(root83); return subs__;
                      
                      return subs__;
                    }, function(node) {
                      var oldNodes = nodes48;
                      nodes48 = node.contents();
                      oldNodes.replaceWith(nodes48);
                    }));
                    
                    
                  } else {
                    var result__ = function(event, callback) {
                                     if(event && event.stopPropagation) event.stopPropagation();
                                     var result__ = it.get();
                                     current.set(result__);
                                     var result__ = mobl.ui.generic.scrollUp();
                                     if(callback && callback.apply) callback(); return;
                                   };
                    var tmp53 = mobl.ref(result__);
                    
                    var nodes50 = $("<span>");
                    node51.append(nodes50);
                    subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp53, mobl.ref(null), mobl.ref(true), function(_, callback) {
                      var root85 = $("<span>");
                      var subs__ = new mobl.CompSubscription();
                      var nodes51 = $("<span>");
                      root85.append(nodes51);
                      subs__.addSub(masterItem.addEventListener('change', function() {
                        renderControl14();
                      }));
                      
                      function renderControl14() {
                        subs__.addSub((masterItem.get())(it, function(elements, callback) {
                          var root86 = $("<span>");
                          var subs__ = new mobl.CompSubscription();
                          callback(root86); return subs__;
                          return subs__;
                        }, function(node) {
                          var oldNodes = nodes51;
                          nodes51 = node.contents();
                          oldNodes.replaceWith(nodes51);
                        }));
                      }
                      renderControl14();
                      callback(root85); return subs__;
                      
                      return subs__;
                    }, function(node) {
                      var oldNodes = nodes50;
                      nodes50 = node.contents();
                      oldNodes.replaceWith(nodes50);
                    }));
                    
                    
                  }
                };
                renderCond10();
                subs__.addSub(tmp54.addEventListener('change', function() {
                  renderCond10();
                }));
                
                
                var oldNodes = iternode5;
                iternode5 = iternode5.contents();
                oldNodes.replaceWith(iternode5);
                
                
              }());
            }
            mobl.delayedUpdateScrollers();
            subs__.addSub(list161.addEventListener('change', function() { listSubs5.unsubscribe(); renderList5(true); }));
            subs__.addSub(items.addEventListener('change', function() { listSubs5.unsubscribe(); renderList5(true); }));
          });
        };
        renderList5();
        
        callback(root82); return subs__;
        
        return subs__;
      }, function(node) {
        var oldNodes = nodes47;
        nodes47 = node.contents();
        oldNodes.replaceWith(nodes47);
      }));
      node46.append(node47);
      
      var node48 = $("<div>");
      node48.attr('style', "float:left; width:66.5%; position:relative; margin-left: 0.5%;");
      
      
      var node49 = $("<span>");
      node48.append(node49);
      var condSubs9 = new mobl.CompSubscription();
      subs__.addSub(condSubs9);
      var oldValue9;
      var renderCond9 = function() {
        var value19 = current.get();
        if(oldValue9 === value19) return;
        oldValue9 = value19;
        var subs__ = condSubs9;
        subs__.unsubscribe();
        node49.empty();
        if(value19) {
          var nodes45 = $("<span>");
          node49.append(nodes45);
          subs__.addSub(detail.addEventListener('change', function() {
            renderControl12();
          }));
          
          function renderControl12() {
            subs__.addSub((detail.get())(current, function(elements, callback) {
              var root80 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root80); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes45;
              nodes45 = node.contents();
              oldNodes.replaceWith(nodes45);
            }));
          }
          renderControl12();
          
          
        } else {
          var result__ = mobl._("Select an item on the left", []);
          var tmp55 = mobl.ref(result__);
          
          var nodes46 = $("<span>");
          node49.append(nodes46);
          subs__.addSub((mobl.label)(tmp55, mobl.ref(null), mobl.ref(null), function(_, callback) {
            var root81 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            callback(root81); return subs__;
            return subs__;
          }, function(node) {
            var oldNodes = nodes46;
            nodes46 = node.contents();
            oldNodes.replaceWith(nodes46);
          }));
          
          
        }
      };
      renderCond9();
      subs__.addSub(current.addEventListener('change', function() {
        renderCond9();
      }));
      
      node46.append(node48);
      node45.append(node46);
      
      
      
      
      
      
    });
  } else {
    var nodes52 = $("<span>");
    node45.append(nodes52);
    subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
      var root87 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      var node52 = mobl.loadingSpan();
      root87.append(node52);
      var list162;
      var listSubs6 = new mobl.CompSubscription();
      subs__.addSub(listSubs6);
      var renderList6 = function() {
        var subs__ = listSubs6;
        list162 = items.get();
        list162.list(function(results6) {
          node52.empty();
          for(var i6 = 0; i6 < results6.length; i6++) {
            (function() {
              var iternode6 = $("<span>");
              node52.append(iternode6);
              var it;
              it = mobl.ref(mobl.ref(results6), i6);
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               mobl.call('mobl.ui.generic.detailScreen', [it, detail, mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                               var tmp91 = result__;
                               if(callback && callback.apply) callback(); return;
                               });
                             };
              var tmp48 = mobl.ref(result__);
              
              var nodes53 = $("<span>");
              iternode6.append(nodes53);
              subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp48, mobl.ref(null), mobl.ref(false), function(_, callback) {
                var root88 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes54 = $("<span>");
                root88.append(nodes54);
                subs__.addSub(masterItem.addEventListener('change', function() {
                  renderControl15();
                }));
                
                function renderControl15() {
                  subs__.addSub((masterItem.get())(it, function(elements, callback) {
                    var root89 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root89); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes54;
                    nodes54 = node.contents();
                    oldNodes.replaceWith(nodes54);
                  }));
                }
                renderControl15();
                callback(root88); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes53;
                nodes53 = node.contents();
                oldNodes.replaceWith(nodes53);
              }));
              
              var oldNodes = iternode6;
              iternode6 = iternode6.contents();
              oldNodes.replaceWith(iternode6);
              
              
            }());
          }
          mobl.delayedUpdateScrollers();
          subs__.addSub(list162.addEventListener('change', function() { listSubs6.unsubscribe(); renderList6(true); }));
          subs__.addSub(items.addEventListener('change', function() { listSubs6.unsubscribe(); renderList6(true); }));
        });
      };
      renderList6();
      
      callback(root87); return subs__;
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes52;
      nodes52 = node.contents();
      oldNodes.replaceWith(nodes52);
    }));
    
    
  }
};
renderCond8();
subs__.addSub(tmp69.addEventListener('change', function() {
  renderCond8();
}));

callback(root79); return subs__;

return subs__;
};

mobl.ui.generic.detailScreen = function(it, detail, callback, screenCallback) {
var root90 = $("<div>");
var subs__ = new mobl.CompSubscription();
var result__ = mobl._("Detail", []);
var tmp52 = mobl.ref(result__);

var nodes55 = $("<span>");
root90.append(nodes55);
subs__.addSub((mobl.ui.generic.header)(tmp52, mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root91 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp51 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp49 = mobl.ref(result__);
  
  var nodes56 = $("<span>");
  root91.append(nodes56);
  subs__.addSub((mobl.ui.generic.backButton)(tmp49, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp51, function(_, callback) {
    var root92 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root92); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes56;
    nodes56 = node.contents();
    oldNodes.replaceWith(nodes56);
  }));
  callback(root91); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes55;
  nodes55 = node.contents();
  oldNodes.replaceWith(nodes55);
}));
var nodes57 = $("<span>");
root90.append(nodes57);
subs__.addSub(detail.addEventListener('change', function() {
  renderControl16();
}));

function renderControl16() {
  subs__.addSub((detail.get())(it, function(elements, callback) {
    var root93 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root93); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes57;
    nodes57 = node.contents();
    oldNodes.replaceWith(nodes57);
  }));
}
renderControl16();
callback(root90); return subs__;


return subs__;
};
mobl.ui.generic.selectedItemStyle = 'mobl__ui__generic__selectedItemStyle';

mobl.ui.generic.zoomList = function(coll, listCtrl, zoomCtrl, elements, callback) {
var root94 = $("<span>");
var subs__ = new mobl.CompSubscription();

var selected = mobl.ref(null);
var nodes58 = $("<span>");
root94.append(nodes58);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root95 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node53 = mobl.loadingSpan();
  root95.append(node53);
  var list163;
  var listSubs7 = new mobl.CompSubscription();
  subs__.addSub(listSubs7);
  var renderList7 = function() {
    var subs__ = listSubs7;
    list163 = coll.get();
    list163.list(function(results7) {
      node53.empty();
      for(var i7 = 0; i7 < results7.length; i7++) {
        (function() {
          var iternode7 = $("<span>");
          node53.append(iternode7);
          var it;
          it = mobl.ref(mobl.ref(results7), i7);
          var result__ = it.get() == selected.get();
          var tmp57 = mobl.ref(result__);
          subs__.addSub(it.addEventListener('change', function() {
            tmp57.set(it.get() == selected.get());
          }));
          subs__.addSub(selected.addEventListener('change', function() {
            tmp57.set(it.get() == selected.get());
          }));
          
          
          var node54 = $("<span>");
          iternode7.append(node54);
          var condSubs11 = new mobl.CompSubscription();
          subs__.addSub(condSubs11);
          var oldValue11;
          var renderCond11 = function() {
            var value21 = tmp57.get();
            if(oldValue11 === value21) return;
            oldValue11 = value21;
            var subs__ = condSubs11;
            subs__.unsubscribe();
            node54.empty();
            if(value21) {
              var nodes59 = $("<span>");
              node54.append(nodes59);
              subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
                var root96 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes60 = $("<span>");
                root96.append(nodes60);
                subs__.addSub(zoomCtrl.addEventListener('change', function() {
                  renderControl17();
                }));
                
                function renderControl17() {
                  subs__.addSub((zoomCtrl.get())(it, function(elements, callback) {
                    var root97 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root97); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes60;
                    nodes60 = node.contents();
                    oldNodes.replaceWith(nodes60);
                  }));
                }
                renderControl17();
                callback(root96); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes59;
                nodes59 = node.contents();
                oldNodes.replaceWith(nodes59);
              }));
              
              
            } else {
              var result__ = function(event, callback) {
                               if(event && event.stopPropagation) event.stopPropagation();
                               var result__ = it.get();
                               selected.set(result__);
                               if(callback && callback.apply) callback(); return;
                             };
              var tmp56 = mobl.ref(result__);
              
              var nodes61 = $("<span>");
              node54.append(nodes61);
              subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp56, mobl.ref(null), mobl.ref(true), function(_, callback) {
                var root98 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                var nodes62 = $("<span>");
                root98.append(nodes62);
                subs__.addSub(listCtrl.addEventListener('change', function() {
                  renderControl18();
                }));
                
                function renderControl18() {
                  subs__.addSub((listCtrl.get())(it, function(elements, callback) {
                    var root99 = $("<span>");
                    var subs__ = new mobl.CompSubscription();
                    callback(root99); return subs__;
                    return subs__;
                  }, function(node) {
                    var oldNodes = nodes62;
                    nodes62 = node.contents();
                    oldNodes.replaceWith(nodes62);
                  }));
                }
                renderControl18();
                callback(root98); return subs__;
                
                return subs__;
              }, function(node) {
                var oldNodes = nodes61;
                nodes61 = node.contents();
                oldNodes.replaceWith(nodes61);
              }));
              
              
            }
          };
          renderCond11();
          subs__.addSub(tmp57.addEventListener('change', function() {
            renderCond11();
          }));
          
          
          var oldNodes = iternode7;
          iternode7 = iternode7.contents();
          oldNodes.replaceWith(iternode7);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list163.addEventListener('change', function() { listSubs7.unsubscribe(); renderList7(true); }));
      subs__.addSub(coll.addEventListener('change', function() { listSubs7.unsubscribe(); renderList7(true); }));
    });
  };
  renderList7();
  
  callback(root95); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes58;
  nodes58 = node.contents();
  oldNodes.replaceWith(nodes58);
}));
callback(root94); return subs__;

return subs__;
};
mobl.ui.generic.loadMoreStyle = 'mobl__ui__generic__loadMoreStyle';

mobl.ui.generic.stagedList = function(coll, listCtrl, initialItems, step, moreLabel, moreStyle, elements, callback) {
var root100 = $("<span>");
var subs__ = new mobl.CompSubscription();

var n = mobl.ref(initialItems.get());
coll.get().count(function(result__) {
  var tmp92 = result__;
  var total = mobl.ref(result__);
  var result__ = coll.get().limit(n.get());
  var tmp58 = mobl.ref(result__);
  subs__.addSub(mobl.ref(coll.get().limit(n.get())).addEventListener('change', function() {
    tmp58.set(coll.get().limit(n.get()));
  }));
  subs__.addSub(coll.addEventListener('change', function() {
    tmp58.set(coll.get().limit(n.get()));
  }));
  subs__.addSub(n.addEventListener('change', function() {
    tmp58.set(coll.get().limit(n.get()));
  }));
  
  
  var node55 = mobl.loadingSpan();
  root100.append(node55);
  var list164;
  var listSubs8 = new mobl.CompSubscription();
  subs__.addSub(listSubs8);
  var renderList8 = function() {
    var subs__ = listSubs8;
    list164 = tmp58.get();
    list164.list(function(results8) {
      node55.empty();
      for(var i8 = 0; i8 < results8.length; i8++) {
        (function() {
          var iternode8 = $("<span>");
          node55.append(iternode8);
          var it;
          it = mobl.ref(mobl.ref(results8), i8);
          var nodes63 = $("<span>");
          iternode8.append(nodes63);
          subs__.addSub(listCtrl.addEventListener('change', function() {
            renderControl19();
          }));
          
          function renderControl19() {
            subs__.addSub((listCtrl.get())(it, function(elements, callback) {
              var root101 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root101); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes63;
              nodes63 = node.contents();
              oldNodes.replaceWith(nodes63);
            }));
          }
          renderControl19();
          
          var oldNodes = iternode8;
          iternode8 = iternode8.contents();
          oldNodes.replaceWith(iternode8);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list164.addEventListener('change', function() { listSubs8.unsubscribe(); renderList8(true); }));
      subs__.addSub(tmp58.addEventListener('change', function() { listSubs8.unsubscribe(); renderList8(true); }));
    });
  };
  renderList8();
  
  var result__ = n.get() < total.get();
  var tmp61 = mobl.ref(result__);
  subs__.addSub(n.addEventListener('change', function() {
    tmp61.set(n.get() < total.get());
  }));
  subs__.addSub(total.addEventListener('change', function() {
    tmp61.set(n.get() < total.get());
  }));
  
  
  var node56 = $("<span>");
  root100.append(node56);
  var condSubs12 = new mobl.CompSubscription();
  subs__.addSub(condSubs12);
  var oldValue12;
  var renderCond12 = function() {
    var value22 = tmp61.get();
    if(oldValue12 === value22) return;
    oldValue12 = value22;
    var subs__ = condSubs12;
    subs__.unsubscribe();
    node56.empty();
    if(value22) {
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = n.get() + step.get();
                       n.set(result__);
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp59 = mobl.ref(result__);
      
      var nodes64 = $("<span>");
      node56.append(nodes64);
      subs__.addSub((mobl.block)(moreStyle, mobl.ref(null), tmp59, mobl.ref(null), function(_, callback) {
        var root102 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        var nodes65 = $("<span>");
        root102.append(nodes65);
        subs__.addSub((mobl.label)(moreLabel, mobl.ref(null), mobl.ref(null), function(_, callback) {
          var root103 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root103); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes65;
          nodes65 = node.contents();
          oldNodes.replaceWith(nodes65);
        }));
        callback(root102); return subs__;
        
        return subs__;
      }, function(node) {
        var oldNodes = nodes64;
        nodes64 = node.contents();
        oldNodes.replaceWith(nodes64);
      }));
      
      
    } else {
      
    }
  };
  renderCond12();
  subs__.addSub(tmp61.addEventListener('change', function() {
    renderCond12();
  }));
  
  callback(root100); return subs__;
  
  
});
return subs__;
};

mobl.ui.generic.markableList = function(items, elements, callback) {
var root104 = $("<span>");
var subs__ = new mobl.CompSubscription();
var nodes66 = $("<span>");
root104.append(nodes66);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root105 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node57 = mobl.loadingSpan();
  root105.append(node57);
  var list165;
  var listSubs9 = new mobl.CompSubscription();
  subs__.addSub(listSubs9);
  var renderList9 = function() {
    var subs__ = listSubs9;
    list165 = items.get();
    list165.list(function(results9) {
      node57.empty();
      for(var i9 = 0; i9 < results9.length; i9++) {
        (function() {
          var iternode9 = $("<span>");
          node57.append(iternode9);
          var checked;var it;
          checked = mobl.ref(mobl.ref(mobl.ref(results9), i9), "_1");it = mobl.ref(mobl.ref(mobl.ref(results9), i9), "_2");
          var nodes67 = $("<span>");
          iternode9.append(nodes67);
          subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
            var root106 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes68 = $("<span>");
            root106.append(nodes68);
            subs__.addSub((mobl.ui.generic.checkBox)(checked, it, mobl.ref(null), function(_, callback) {
              var root107 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root107); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes68;
              nodes68 = node.contents();
              oldNodes.replaceWith(nodes68);
            }));
            callback(root106); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes67;
            nodes67 = node.contents();
            oldNodes.replaceWith(nodes67);
          }));
          
          var oldNodes = iternode9;
          iternode9 = iternode9.contents();
          oldNodes.replaceWith(iternode9);
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list165.addEventListener('change', function() { listSubs9.unsubscribe(); renderList9(true); }));
      subs__.addSub(items.addEventListener('change', function() { listSubs9.unsubscribe(); renderList9(true); }));
    });
  };
  renderList9();
  
  callback(root105); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes66;
  nodes66 = node.contents();
  oldNodes.replaceWith(nodes66);
}));
callback(root104); return subs__;

return subs__;
};

mobl.ui.generic.selectList = function(title, coll, doneButtonLabel, callback, screenCallback) {
var root108 = $("<div>");
var subs__ = new mobl.CompSubscription();

var items = mobl.ref([]);
var result__ = coll.get();
coll.get().list(function(coll16) {
  coll16 = coll16.reverse();
  function processOne1() {
    var it;
    it = coll16.pop();
    var result__ = items.get().push(new mobl.Tuple(false, it));
    
    if(coll16.length > 0) processOne1(); else rest1();
    
  }
  function rest1() {
    var nodes69 = $("<span>");
    root108.append(nodes69);
    subs__.addSub((mobl.ui.generic.header)(title, mobl.ref(false), mobl.ref(null), function(_, callback) {
      var root109 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = null;
                       if(callback && callback.apply) callback(result__);
                       return;
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp62 = mobl.ref(result__);
      
      var result__ = mobl._("Back", []);
      var tmp63 = mobl.ref(result__);
      
      var nodes70 = $("<span>");
      root109.append(nodes70);
      subs__.addSub((mobl.ui.generic.backButton)(tmp63, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp62, function(_, callback) {
        var root110 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root110); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes70;
        nodes70 = node.contents();
        oldNodes.replaceWith(nodes70);
      }));
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = [];
                       var selected = result__;
                       var result__ = items.get();
                       items.get().list(function(coll15) {
                         coll15 = coll15.reverse();
                         function processOne0() {
                           var checked;var it;
                           var tmp94 = coll15.pop();
                           checked = tmp94._1;it = tmp94._2;
                           var result__ = checked;
                           if(result__) {
                             var result__ = selected.push(it);
                             
                             if(coll15.length > 0) processOne0(); else rest0();
                             
                           } else {
                             {
                               
                               if(coll15.length > 0) processOne0(); else rest0();
                               
                             }
                           }
                         }
                         function rest0() {
                           var result__ = selected;
                           if(screenCallback) screenCallback(result__);
                           return;
                           if(callback && callback.apply) callback(); return;
                         }
                         if(coll15.length > 0) processOne0(); else rest0();
                       });
                       
                     };
      var tmp64 = mobl.ref(result__);
      
      var nodes71 = $("<span>");
      root109.append(nodes71);
      subs__.addSub((mobl.ui.generic.button)(doneButtonLabel, mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp64, function(_, callback) {
        var root111 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root111); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes71;
        nodes71 = node.contents();
        oldNodes.replaceWith(nodes71);
      }));
      callback(root109); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes69;
      nodes69 = node.contents();
      oldNodes.replaceWith(nodes69);
    }));
    var nodes72 = $("<span>");
    root108.append(nodes72);
    subs__.addSub((mobl.ui.generic.markableList)(items, function(_, callback) {
      var root112 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root112); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes72;
      nodes72 = node.contents();
      oldNodes.replaceWith(nodes72);
    }));
    callback(root108); return subs__;
    
    
  }
  if(coll16.length > 0) processOne1(); else rest1();
});

return subs__;
};

mobl.ui.generic.searchList = function(Ent, masterItem, detailItem, resultLimit, searchTermPlaceholder, elements, callback) {
var root113 = $("<span>");
var subs__ = new mobl.CompSubscription();

var phrase = mobl.ref("");
var nodes73 = $("<span>");
root113.append(nodes73);
subs__.addSub((mobl.ui.generic.searchBox)(phrase, searchTermPlaceholder, mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root114 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root114); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes73;
  nodes73 = node.contents();
  oldNodes.replaceWith(nodes73);
}));
var result__ = Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get());
var tmp65 = mobl.ref(result__);
subs__.addSub(mobl.ref(Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get())).addEventListener('change', function() {
  tmp65.set(Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get()));
}));
subs__.addSub(mobl.ref(Ent.get().searchPrefix(phrase.get())).addEventListener('change', function() {
  tmp65.set(Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get()));
}));
subs__.addSub(Ent.addEventListener('change', function() {
  tmp65.set(Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get()));
}));
subs__.addSub(phrase.addEventListener('change', function() {
  tmp65.set(Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get()));
}));
subs__.addSub(resultLimit.addEventListener('change', function() {
  tmp65.set(Ent.get().searchPrefix(phrase.get()).limit(resultLimit.get()));
}));

var nodes74 = $("<span>");
root113.append(nodes74);
subs__.addSub((mobl.ui.generic.masterDetail)(tmp65, masterItem, detailItem, function(_, callback) {
  var root115 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root115); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes74;
  nodes74 = node.contents();
  oldNodes.replaceWith(nodes74);
}));
callback(root113); return subs__;


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
__ns.floatBox = function(top, right, bottom, left, elements, callback) {
                  var root928 = $("<span>");
                  var node280 = $("<div style=\"position: absolute;\">");
                  var nodes681 = $("<span>");
                  node280.append(nodes681);
                  mobl.ref(elements).addEventListener('change', function() {
                                                                  renderControl102();
                                                                });
                  function renderControl102 ( ) {
                    (elements)(function(elements, callback) {
                                 var root929 = $("<span>");
                                 callback(root929);
                                 return;
                               }, function(node) {
                                    var oldNodes = nodes681;
                                    nodes681 = node.contents();
                                    oldNodes.replaceWith(nodes681);
                                  });
                  }
                  renderControl102();
                  root928.append(node280);
                  var box = node280;
                  if(top.get() !== null)
                  box.css("top", "" + top.get() + "px");
                  if(right.get() !== null)
                  box.css("right", "" + right.get() + "px");
                  if(bottom.get() !== null)
                  box.css("top", "" + ( window.pageYOffset + window.innerHeight - box.outerHeight() - bottom.get() ) + "px");
                  if(left.get() !== null)
                  box.css("left", "" + left.get() + "px");
                  function updateLocation ( ) {
                    if(top.get() !== null)
                    {
                      box.css("top", "" + ( window.pageYOffset + top.get() ) + "px");
                    }
                    if(bottom.get() !== null)
                    {
                      box.css("top", "" + ( window.pageYOffset + window.innerHeight - box.outerHeight() - bottom.get() ) + "px");
                    }
                  }
                  $(window).bind('scroll', updateLocation);
                  $(window).bind('resize', updateLocation);
                  callback(root928);
                  return;
                };
}(mobl.ui.generic));mobl.ui.generic.accordionStyle = 'mobl__ui__generic__accordionStyle';
mobl.ui.generic.activeSectionHeaderStyle = 'mobl__ui__generic__activeSectionHeaderStyle';
mobl.ui.generic.inActiveSectionHeaderStyle = 'mobl__ui__generic__inActiveSectionHeaderStyle';
mobl.ui.generic.activeSectionHeaderStyle = 'mobl__ui__generic__activeSectionHeaderStyle';
mobl.ui.generic.inActiveSectionHeaderStyle = 'mobl__ui__generic__inActiveSectionHeaderStyle';
mobl.ui.generic.inActiveSectionStyle = 'mobl__ui__generic__inActiveSectionStyle';
mobl.ui.generic.activeSectionStyle = 'mobl__ui__generic__activeSectionStyle';

mobl.ui.generic.accordion = function(sections, activeSection, elements, callback) {
var root116 = $("<span>");
var subs__ = new mobl.CompSubscription();

var activeSection = mobl.ref(activeSection.get() ? activeSection.get() : sections.get().get(0)._1);
var nodes75 = $("<span>");
root116.append(nodes75);
subs__.addSub((mobl.block)(mobl.ref(mobl.ui.generic.accordionStyle), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root117 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  var node58 = mobl.loadingSpan();
  root117.append(node58);
  var list166;
  var listSubs10 = new mobl.CompSubscription();
  subs__.addSub(listSubs10);
  var renderList10 = function() {
    var subs__ = listSubs10;
    list166 = sections.get();
    list166.list(function(results10) {
      node58.empty();
      for(var i10 = 0; i10 < results10.length; i10++) {
        (function() {
          var iternode10 = $("<span>");
          node58.append(iternode10);
          var sectionName;var sectionControl;
          sectionName = mobl.ref(mobl.ref(mobl.ref(results10), i10), "_1");sectionControl = mobl.ref(mobl.ref(mobl.ref(results10), i10), "_2");
          var result__ = activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle;
          var tmp67 = mobl.ref(result__);
          subs__.addSub(activeSection.addEventListener('change', function() {
            tmp67.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          subs__.addSub(sectionName.addEventListener('change', function() {
            tmp67.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.activeSectionHeaderStyle).addEventListener('change', function() {
            tmp67.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.inActiveSectionHeaderStyle).addEventListener('change', function() {
            tmp67.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionHeaderStyle : mobl.ui.generic.inActiveSectionHeaderStyle);
          }));
          
          var result__ = function(event, callback) {
                           if(event && event.stopPropagation) event.stopPropagation();
                           var result__ = sectionName.get();
                           activeSection.set(result__);
                           if(callback && callback.apply) callback(); return;
                         };
          var tmp66 = mobl.ref(result__);
          
          var nodes76 = $("<span>");
          iternode10.append(nodes76);
          subs__.addSub((mobl.span)(tmp67, mobl.ref(null), tmp66, mobl.ref(null), function(_, callback) {
            var root118 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes77 = $("<span>");
            root118.append(nodes77);
            subs__.addSub((mobl.label)(sectionName, mobl.ref(null), mobl.ref(null), function(_, callback) {
              var root119 = $("<span>");
              var subs__ = new mobl.CompSubscription();
              callback(root119); return subs__;
              return subs__;
            }, function(node) {
              var oldNodes = nodes77;
              nodes77 = node.contents();
              oldNodes.replaceWith(nodes77);
            }));
            callback(root118); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes76;
            nodes76 = node.contents();
            oldNodes.replaceWith(nodes76);
          }));
          var result__ = activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle;
          var tmp68 = mobl.ref(result__);
          subs__.addSub(activeSection.addEventListener('change', function() {
            tmp68.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          subs__.addSub(sectionName.addEventListener('change', function() {
            tmp68.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.activeSectionStyle).addEventListener('change', function() {
            tmp68.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          subs__.addSub(mobl.ref(mobl.ui.generic.inActiveSectionStyle).addEventListener('change', function() {
            tmp68.set(activeSection.get() == sectionName.get() ? mobl.ui.generic.activeSectionStyle : mobl.ui.generic.inActiveSectionStyle);
          }));
          
          var nodes78 = $("<span>");
          iternode10.append(nodes78);
          subs__.addSub((mobl.block)(tmp68, mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
            var root120 = $("<span>");
            var subs__ = new mobl.CompSubscription();
            var nodes79 = $("<span>");
            root120.append(nodes79);
            subs__.addSub(sectionControl.addEventListener('change', function() {
              renderControl20();
            }));
            
            function renderControl20() {
              subs__.addSub((sectionControl.get())(function(elements, callback) {
                var root121 = $("<span>");
                var subs__ = new mobl.CompSubscription();
                callback(root121); return subs__;
                return subs__;
              }, function(node) {
                var oldNodes = nodes79;
                nodes79 = node.contents();
                oldNodes.replaceWith(nodes79);
              }));
            }
            renderControl20();
            callback(root120); return subs__;
            
            return subs__;
          }, function(node) {
            var oldNodes = nodes78;
            nodes78 = node.contents();
            oldNodes.replaceWith(nodes78);
          }));
          
          var oldNodes = iternode10;
          iternode10 = iternode10.contents();
          oldNodes.replaceWith(iternode10);
          
          
          
        }());
      }
      mobl.delayedUpdateScrollers();
      subs__.addSub(list166.addEventListener('change', function() { listSubs10.unsubscribe(); renderList10(true); }));
      subs__.addSub(sections.addEventListener('change', function() { listSubs10.unsubscribe(); renderList10(true); }));
    });
  };
  renderList10();
  
  callback(root117); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes75;
  nodes75 = node.contents();
  oldNodes.replaceWith(nodes75);
}));
callback(root116); return subs__;

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
var root122 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node59 = $("<table>");

var ref83 = style;
if(ref83.get() !== null) {
  node59.attr('class', ref83.get());
  subs__.addSub(ref83.addEventListener('change', function(_, ref, val) {
    node59.attr('class', val);
  }));
  
}
subs__.addSub(ref83.rebind());

var nodes80 = $("<span>");
node59.append(nodes80);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl21();
}));

function renderControl21() {
  subs__.addSub((elements)(function(elements, callback) {
    var root123 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root123); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes80;
    nodes80 = node.contents();
    oldNodes.replaceWith(nodes80);
  }));
}
renderControl21();
root122.append(node59);
callback(root122); return subs__;


return subs__;
};

mobl.ui.generic.row = function(style, elements, callback) {
var root124 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node60 = $("<tr>");

var ref84 = style;
if(ref84.get() !== null) {
  node60.attr('class', ref84.get());
  subs__.addSub(ref84.addEventListener('change', function(_, ref, val) {
    node60.attr('class', val);
  }));
  
}
subs__.addSub(ref84.rebind());

var nodes81 = $("<span>");
node60.append(nodes81);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl22();
}));

function renderControl22() {
  subs__.addSub((elements)(function(elements, callback) {
    var root125 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root125); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes81;
    nodes81 = node.contents();
    oldNodes.replaceWith(nodes81);
  }));
}
renderControl22();
root124.append(node60);
callback(root124); return subs__;


return subs__;
};

mobl.ui.generic.cell = function(width, style, elements, callback) {
var root126 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node61 = $("<td>");

var ref85 = width;
if(ref85.get() !== null) {
  node61.attr('width', ref85.get());
  subs__.addSub(ref85.addEventListener('change', function(_, ref, val) {
    node61.attr('width', val);
  }));
  
}
subs__.addSub(ref85.rebind());

var ref86 = style;
if(ref86.get() !== null) {
  node61.attr('class', ref86.get());
  subs__.addSub(ref86.addEventListener('change', function(_, ref, val) {
    node61.attr('class', val);
  }));
  
}
subs__.addSub(ref86.rebind());

var nodes82 = $("<span>");
node61.append(nodes82);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl23();
}));

function renderControl23() {
  subs__.addSub((elements)(function(elements, callback) {
    var root127 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root127); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes82;
    nodes82 = node.contents();
    oldNodes.replaceWith(nodes82);
  }));
}
renderControl23();
root126.append(node61);
callback(root126); return subs__;


return subs__;
};

mobl.ui.generic.col = function(width, style, elements, callback) {
var root128 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node62 = $("<td>");

var ref87 = width;
if(ref87.get() !== null) {
  node62.attr('width', ref87.get());
  subs__.addSub(ref87.addEventListener('change', function(_, ref, val) {
    node62.attr('width', val);
  }));
  
}
subs__.addSub(ref87.rebind());

var ref88 = style;
if(ref88.get() !== null) {
  node62.attr('class', ref88.get());
  subs__.addSub(ref88.addEventListener('change', function(_, ref, val) {
    node62.attr('class', val);
  }));
  
}
subs__.addSub(ref88.rebind());

var nodes83 = $("<span>");
node62.append(nodes83);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl24();
}));

function renderControl24() {
  subs__.addSub((elements)(function(elements, callback) {
    var root129 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root129); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes83;
    nodes83 = node.contents();
    oldNodes.replaceWith(nodes83);
  }));
}
renderControl24();
root128.append(node62);
callback(root128); return subs__;


return subs__;
};

mobl.ui.generic.headerCol = function(width, style, elements, callback) {
var root130 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node63 = $("<td>");

var ref89 = width;
if(ref89.get() !== null) {
  node63.attr('width', ref89.get());
  subs__.addSub(ref89.addEventListener('change', function(_, ref, val) {
    node63.attr('width', val);
  }));
  
}
subs__.addSub(ref89.rebind());

var ref90 = style;
if(ref90.get() !== null) {
  node63.attr('class', ref90.get());
  subs__.addSub(ref90.addEventListener('change', function(_, ref, val) {
    node63.attr('class', val);
  }));
  
}
subs__.addSub(ref90.rebind());


var node64 = $("<strong>");

var nodes84 = $("<span>");
node64.append(nodes84);
subs__.addSub(mobl.ref(elements).addEventListener('change', function() {
  renderControl25();
}));

function renderControl25() {
  subs__.addSub((elements)(function(elements, callback) {
    var root131 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root131); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes84;
    nodes84 = node.contents();
    oldNodes.replaceWith(nodes84);
  }));
}
renderControl25();
node63.append(node64);
root130.append(node63);
callback(root130); return subs__;



return subs__;
};
(function(__ns) {
setTimeout(function() {
             scrollTo(0, -1);
           }, 250);
__ns.scrollUp = function() {
                  scrollTo(0, 0);
                };
__ns.setupScrollers = function() {
                        setTimeout(function() {
                                     var allScrollers = $("div.scroller");
                                     for(var i = 0; i < allScrollers.length; i++)
                                     {
                                       var scroller = allScrollers.eq(i);
                                       if(!scroller.data("scroller"))
                                       {
                                         scroller.data("scroller", new TouchScroll(scroller[0],{
                                                                                                 elastic: true
                                                                                               }));
                                       }
                                     }
                                   }, 250);
                      };
}(mobl.ui.generic));