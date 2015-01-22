mobl.provides('mobl.ui.generic.datepicker');
mobl.provides('mobl.ui');
mobl.provides('mobl');
mobl.provides('mobl.ui.generic.datepicker');
mobl.provides('mobl.ui.generic');
mobl.ui.generic.datepicker.getMonthName = function(m) {
   var __this = this;
  var months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
  
  return months.get(m);
};

mobl.ui.generic.datepicker.narrowNumFieldStyle = 'mobl__ui__generic__datepicker__narrowNumFieldStyle';
mobl.ui.generic.datepicker.monthStyle = 'mobl__ui__generic__datepicker__monthStyle';

mobl.ui.generic.datepicker.narrowNumField = function(n, onchange, elements, callback) {
var root161 = $("<span>");
var subs__ = new mobl.CompSubscription();

var node71 = $("<input>");
node71.attr('type', "text");

var ref93 = n;
node71.val(""+ref93.get());
var ignore15 = false;
subs__.addSub(ref93.addEventListener('change', function(_, ref, val) {
  if(ignore15) return;
  node71.val(""+val);
}));
subs__.addSub(ref93.rebind());

subs__.addSub(mobl.domBind(node71, 'keyup change', function() {
  ignore15 = true;
  n.set(mobl.stringTomobl__Num(node71.val()));
  ignore15 = false;
}));


var val45 = function(event, callback) {
              if(event && event.stopPropagation) event.stopPropagation();
              var result__ = !mobl.Math.isNaN(n.get());
              if(result__) {
                function after12(result__) {
                  var tmp131 = result__;
                  if(callback && callback.apply) callback(); return;
                }
                var result__ = onchange.get()(null, after12);if(result__ !== undefined) after12(result__);
              } else {
                {
                  if(callback && callback.apply) callback(); return;
                }
              }
            };
if(val45 !== null) {
  subs__.addSub(mobl.domBind(node71, 'keyup', val45));
}

var ref94 = mobl.ref(mobl.ui.generic.datepicker.narrowNumFieldStyle);
if(ref94.get() !== null) {
  node71.attr('class', ref94.get());
  subs__.addSub(ref94.addEventListener('change', function(_, ref, val) {
    node71.attr('class', val);
  }));
  
}
subs__.addSub(ref94.rebind());

root161.append(node71);
callback(root161); return subs__;

return subs__;
};

mobl.ui.generic.datepicker.datePicker = function(d, onchange, elements, callback) {
var root162 = $("<span>");
var subs__ = new mobl.CompSubscription();
var result__ = d.get() == null;
if(result__) {
  var result__ = mobl.now();
  d.set(result__);
  
  var visible = mobl.ref(false);
  
  var day = mobl.ref(d.get().getDate());
  
  var year = mobl.ref(d.get().getFullYear());
  
  var updates = function(callback) {
    var __this = this;
    var result__ = d.get().getFullYear();
    year.set(result__);
    var result__ = d.get().getDate();
    day.set(result__);
    var result__ = d.get();
    d.set(result__);
    var result__ = onchange.get();
    if(result__) {
      function after13(result__) {
        var tmp132 = result__;
        if(callback && callback.apply) callback(); return;
      }
      var result__ = onchange.get()(d.get(), after13);if(result__ !== undefined) after13(result__);
    } else {
      {
        if(callback && callback.apply) callback(); return;
      }
    }
  };
  
  
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   var result__ = visible.get() ? false : true;
                   visible.set(result__);
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp113 = mobl.ref(result__);
  
  var result__ = d.get().toDateString();
  var tmp112 = mobl.ref(result__);
  subs__.addSub(d.addEventListener('change', function() {
    tmp112.set(d.get().toDateString());
  }));
  
  var nodes108 = $("<span>");
  root162.append(nodes108);
  subs__.addSub((mobl.label)(tmp112, mobl.ref(null), tmp113, function(_, callback) {
    var root163 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root163); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes108;
    nodes108 = node.contents();
    oldNodes.replaceWith(nodes108);
  }));
  
  var node72 = $("<div>");
  
  
  var node73 = $("<span>");
  node72.append(node73);
  var condSubs13 = new mobl.CompSubscription();
  subs__.addSub(condSubs13);
  var oldValue13;
  var renderCond13 = function() {
    var value25 = visible.get();
    if(oldValue13 === value25) return;
    oldValue13 = value25;
    var subs__ = condSubs13;
    subs__.unsubscribe();
    node73.empty();
    if(value25) {
      
      var node74 = $("<div>");
      node74.attr('style', "float: left; text-align: center;");
      
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setDate(d.get().getDate() + 1);
                       updates(function(result__) {
                         var tmp138 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp114 = mobl.ref(result__);
      
      var nodes115 = $("<span>");
      node74.append(nodes115);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp114, function(_, callback) {
        var root170 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root170); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes115;
        nodes115 = node.contents();
        oldNodes.replaceWith(nodes115);
      }));
      
      var node81 = $("<br>");
      
      node74.append(node81);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setDate(day.get());
                       var result__ = d.get();
                       d.set(result__);
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp115 = mobl.ref(result__);
      
      var nodes116 = $("<span>");
      node74.append(nodes116);
      subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(day, tmp115, function(_, callback) {
        var root171 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root171); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes116;
        nodes116 = node.contents();
        oldNodes.replaceWith(nodes116);
      }));
      
      var node82 = $("<br>");
      
      node74.append(node82);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setDate(d.get().getDate() - 1);
                       updates(function(result__) {
                         var tmp137 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp116 = mobl.ref(result__);
      
      var nodes117 = $("<span>");
      node74.append(nodes117);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp116, function(_, callback) {
        var root172 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root172); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes117;
        nodes117 = node.contents();
        oldNodes.replaceWith(nodes117);
      }));
      node73.append(node74);
      
      var node75 = $("<div>");
      node75.attr('style', "float: left; text-align: center;");
      
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setMonth(d.get().getMonth() + 1);
                       updates(function(result__) {
                         var tmp136 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp117 = mobl.ref(result__);
      
      var nodes112 = $("<span>");
      node75.append(nodes112);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp117, function(_, callback) {
        var root167 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root167); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes112;
        nodes112 = node.contents();
        oldNodes.replaceWith(nodes112);
      }));
      
      var node79 = $("<br>");
      
      node75.append(node79);
      var result__ = mobl.ui.generic.datepicker.getMonthName(d.get().getMonth());
      var tmp118 = mobl.ref(result__);
      subs__.addSub(d.addEventListener('change', function() {
        tmp118.set(mobl.ui.generic.datepicker.getMonthName(d.get().getMonth()));
      }));
      
      var nodes113 = $("<span>");
      node75.append(nodes113);
      subs__.addSub((mobl.label)(tmp118, mobl.ref(mobl.ui.generic.datepicker.monthStyle), mobl.ref(null), function(_, callback) {
        var root168 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root168); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes113;
        nodes113 = node.contents();
        oldNodes.replaceWith(nodes113);
      }));
      
      var node80 = $("<br>");
      
      node75.append(node80);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setMonth(d.get().getMonth() - 1);
                       updates(function(result__) {
                         var tmp135 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp119 = mobl.ref(result__);
      
      var nodes114 = $("<span>");
      node75.append(nodes114);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp119, function(_, callback) {
        var root169 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root169); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes114;
        nodes114 = node.contents();
        oldNodes.replaceWith(nodes114);
      }));
      node73.append(node75);
      
      var node76 = $("<div>");
      node76.attr('style', "float: left; text-align: center;");
      
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setFullYear(d.get().getFullYear() + 1);
                       updates(function(result__) {
                         var tmp134 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp120 = mobl.ref(result__);
      
      var nodes109 = $("<span>");
      node76.append(nodes109);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp120, function(_, callback) {
        var root164 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root164); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes109;
        nodes109 = node.contents();
        oldNodes.replaceWith(nodes109);
      }));
      
      var node77 = $("<br>");
      
      node76.append(node77);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setFullYear(year.get());
                       var result__ = d.get();
                       d.set(result__);
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp121 = mobl.ref(result__);
      
      var nodes110 = $("<span>");
      node76.append(nodes110);
      subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(year, tmp121, function(_, callback) {
        var root165 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root165); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes110;
        nodes110 = node.contents();
        oldNodes.replaceWith(nodes110);
      }));
      
      var node78 = $("<br>");
      
      node76.append(node78);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setFullYear(d.get().getFullYear() - 1);
                       updates(function(result__) {
                         var tmp133 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp122 = mobl.ref(result__);
      
      var nodes111 = $("<span>");
      node76.append(nodes111);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp122, function(_, callback) {
        var root166 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root166); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes111;
        nodes111 = node.contents();
        oldNodes.replaceWith(nodes111);
      }));
      node73.append(node76);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    } else {
      
    }
  };
  renderCond13();
  subs__.addSub(visible.addEventListener('change', function() {
    renderCond13();
  }));
  
  
  var node83 = $("<div>");
  node83.attr('style', "clear: both");
  
  node72.append(node83);
  root162.append(node72);
  callback(root162); return subs__;
  
  
  
  
} else {
  {
    
    var visible = mobl.ref(false);
    
    var day = mobl.ref(d.get().getDate());
    
    var year = mobl.ref(d.get().getFullYear());
    
    var updates = function(callback) {
      var __this = this;
      var result__ = d.get().getFullYear();
      year.set(result__);
      var result__ = d.get().getDate();
      day.set(result__);
      var result__ = d.get();
      d.set(result__);
      var result__ = onchange.get();
      if(result__) {
        function after13(result__) {
          var tmp132 = result__;
          if(callback && callback.apply) callback(); return;
        }
        var result__ = onchange.get()(d.get(), after13);if(result__ !== undefined) after13(result__);
      } else {
        {
          if(callback && callback.apply) callback(); return;
        }
      }
    };
    
    
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     var result__ = visible.get() ? false : true;
                     visible.set(result__);
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp113 = mobl.ref(result__);
    
    var result__ = d.get().toDateString();
    var tmp112 = mobl.ref(result__);
    subs__.addSub(d.addEventListener('change', function() {
      tmp112.set(d.get().toDateString());
    }));
    
    var nodes108 = $("<span>");
    root162.append(nodes108);
    subs__.addSub((mobl.label)(tmp112, mobl.ref(null), tmp113, function(_, callback) {
      var root163 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root163); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes108;
      nodes108 = node.contents();
      oldNodes.replaceWith(nodes108);
    }));
    
    var node72 = $("<div>");
    
    
    var node73 = $("<span>");
    node72.append(node73);
    var condSubs13 = new mobl.CompSubscription();
    subs__.addSub(condSubs13);
    var oldValue13;
    var renderCond13 = function() {
      var value25 = visible.get();
      if(oldValue13 === value25) return;
      oldValue13 = value25;
      var subs__ = condSubs13;
      subs__.unsubscribe();
      node73.empty();
      if(value25) {
        
        var node74 = $("<div>");
        node74.attr('style', "float: left; text-align: center;");
        
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setDate(d.get().getDate() + 1);
                         updates(function(result__) {
                           var tmp138 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp114 = mobl.ref(result__);
        
        var nodes115 = $("<span>");
        node74.append(nodes115);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp114, function(_, callback) {
          var root170 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root170); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes115;
          nodes115 = node.contents();
          oldNodes.replaceWith(nodes115);
        }));
        
        var node81 = $("<br>");
        
        node74.append(node81);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setDate(day.get());
                         var result__ = d.get();
                         d.set(result__);
                         if(callback && callback.apply) callback(); return;
                       };
        var tmp115 = mobl.ref(result__);
        
        var nodes116 = $("<span>");
        node74.append(nodes116);
        subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(day, tmp115, function(_, callback) {
          var root171 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root171); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes116;
          nodes116 = node.contents();
          oldNodes.replaceWith(nodes116);
        }));
        
        var node82 = $("<br>");
        
        node74.append(node82);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setDate(d.get().getDate() - 1);
                         updates(function(result__) {
                           var tmp137 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp116 = mobl.ref(result__);
        
        var nodes117 = $("<span>");
        node74.append(nodes117);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp116, function(_, callback) {
          var root172 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root172); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes117;
          nodes117 = node.contents();
          oldNodes.replaceWith(nodes117);
        }));
        node73.append(node74);
        
        var node75 = $("<div>");
        node75.attr('style', "float: left; text-align: center;");
        
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setMonth(d.get().getMonth() + 1);
                         updates(function(result__) {
                           var tmp136 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp117 = mobl.ref(result__);
        
        var nodes112 = $("<span>");
        node75.append(nodes112);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp117, function(_, callback) {
          var root167 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root167); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes112;
          nodes112 = node.contents();
          oldNodes.replaceWith(nodes112);
        }));
        
        var node79 = $("<br>");
        
        node75.append(node79);
        var result__ = mobl.ui.generic.datepicker.getMonthName(d.get().getMonth());
        var tmp118 = mobl.ref(result__);
        subs__.addSub(d.addEventListener('change', function() {
          tmp118.set(mobl.ui.generic.datepicker.getMonthName(d.get().getMonth()));
        }));
        
        var nodes113 = $("<span>");
        node75.append(nodes113);
        subs__.addSub((mobl.label)(tmp118, mobl.ref(mobl.ui.generic.datepicker.monthStyle), mobl.ref(null), function(_, callback) {
          var root168 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root168); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes113;
          nodes113 = node.contents();
          oldNodes.replaceWith(nodes113);
        }));
        
        var node80 = $("<br>");
        
        node75.append(node80);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setMonth(d.get().getMonth() - 1);
                         updates(function(result__) {
                           var tmp135 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp119 = mobl.ref(result__);
        
        var nodes114 = $("<span>");
        node75.append(nodes114);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp119, function(_, callback) {
          var root169 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root169); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes114;
          nodes114 = node.contents();
          oldNodes.replaceWith(nodes114);
        }));
        node73.append(node75);
        
        var node76 = $("<div>");
        node76.attr('style', "float: left; text-align: center;");
        
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setFullYear(d.get().getFullYear() + 1);
                         updates(function(result__) {
                           var tmp134 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp120 = mobl.ref(result__);
        
        var nodes109 = $("<span>");
        node76.append(nodes109);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp120, function(_, callback) {
          var root164 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root164); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes109;
          nodes109 = node.contents();
          oldNodes.replaceWith(nodes109);
        }));
        
        var node77 = $("<br>");
        
        node76.append(node77);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setFullYear(year.get());
                         var result__ = d.get();
                         d.set(result__);
                         if(callback && callback.apply) callback(); return;
                       };
        var tmp121 = mobl.ref(result__);
        
        var nodes110 = $("<span>");
        node76.append(nodes110);
        subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(year, tmp121, function(_, callback) {
          var root165 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root165); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes110;
          nodes110 = node.contents();
          oldNodes.replaceWith(nodes110);
        }));
        
        var node78 = $("<br>");
        
        node76.append(node78);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setFullYear(d.get().getFullYear() - 1);
                         updates(function(result__) {
                           var tmp133 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp122 = mobl.ref(result__);
        
        var nodes111 = $("<span>");
        node76.append(nodes111);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp122, function(_, callback) {
          var root166 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root166); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes111;
          nodes111 = node.contents();
          oldNodes.replaceWith(nodes111);
        }));
        node73.append(node76);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      } else {
        
      }
    };
    renderCond13();
    subs__.addSub(visible.addEventListener('change', function() {
      renderCond13();
    }));
    
    
    var node83 = $("<div>");
    node83.attr('style', "clear: both");
    
    node72.append(node83);
    root162.append(node72);
    callback(root162); return subs__;
    
    
    
    
  }
}
return subs__;
};

mobl.ui.generic.datepicker.timePicker = function(d, onchange, elements, callback) {
var root173 = $("<span>");
var subs__ = new mobl.CompSubscription();
var result__ = d.get() == null;
if(result__) {
  var result__ = mobl.now();
  d.set(result__);
  
  var visible = mobl.ref(false);
  
  var hours = mobl.ref(d.get().getHours());
  
  var minutes = mobl.ref(d.get().getMinutes());
  
  var updates = function(callback) {
    var __this = this;
    var result__ = d.get().getHours();
    hours.set(result__);
    var result__ = d.get().getMinutes();
    minutes.set(result__);
    var result__ = d.get();
    d.set(result__);
    var result__ = onchange.get();
    if(result__) {
      function after14(result__) {
        var tmp139 = result__;
        if(callback && callback.apply) callback(); return;
      }
      var result__ = onchange.get()(d.get(), after14);if(result__ !== undefined) after14(result__);
    } else {
      {
        if(callback && callback.apply) callback(); return;
      }
    }
  };
  
  
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   var result__ = visible.get() ? false : true;
                   visible.set(result__);
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp124 = mobl.ref(result__);
  
  var result__ = (hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString();
  var tmp123 = mobl.ref(result__);
  subs__.addSub(mobl.ref(mobl.ref(hours.get().toString()), 'length').addEventListener('change', function() {
    tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
  }));
  subs__.addSub(hours.addEventListener('change', function() {
    tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
  }));
  subs__.addSub(mobl.ref(mobl.ref(minutes.get().toString()), 'length').addEventListener('change', function() {
    tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
  }));
  subs__.addSub(minutes.addEventListener('change', function() {
    tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
  }));
  
  var nodes118 = $("<span>");
  root173.append(nodes118);
  subs__.addSub((mobl.label)(tmp123, mobl.ref(null), tmp124, function(_, callback) {
    var root174 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root174); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes118;
    nodes118 = node.contents();
    oldNodes.replaceWith(nodes118);
  }));
  
  var node84 = $("<div>");
  
  
  var node85 = $("<span>");
  node84.append(node85);
  var condSubs14 = new mobl.CompSubscription();
  subs__.addSub(condSubs14);
  var oldValue14;
  var renderCond14 = function() {
    var value26 = visible.get();
    if(oldValue14 === value26) return;
    oldValue14 = value26;
    var subs__ = condSubs14;
    subs__.unsubscribe();
    node85.empty();
    if(value26) {
      
      var node86 = $("<div>");
      node86.attr('style', "float: left; text-align: center;");
      
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setHours(d.get().getHours() + 1);
                       updates(function(result__) {
                         var tmp145 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp125 = mobl.ref(result__);
      
      var nodes122 = $("<span>");
      node86.append(nodes122);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp125, function(_, callback) {
        var root178 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root178); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes122;
        nodes122 = node.contents();
        oldNodes.replaceWith(nodes122);
      }));
      
      var node90 = $("<br>");
      
      node86.append(node90);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setHours(hours.get());
                       updates(function(result__) {
                         var tmp144 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp126 = mobl.ref(result__);
      
      var nodes123 = $("<span>");
      node86.append(nodes123);
      subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(hours, tmp126, function(_, callback) {
        var root179 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root179); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes123;
        nodes123 = node.contents();
        oldNodes.replaceWith(nodes123);
      }));
      
      var node91 = $("<br>");
      
      node86.append(node91);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setHours(d.get().getHours() - 1);
                       updates(function(result__) {
                         var tmp143 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp127 = mobl.ref(result__);
      
      var nodes124 = $("<span>");
      node86.append(nodes124);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp127, function(_, callback) {
        var root180 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root180); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes124;
        nodes124 = node.contents();
        oldNodes.replaceWith(nodes124);
      }));
      node85.append(node86);
      
      var node87 = $("<div>");
      node87.attr('style', "float: left; text-align: center;");
      
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setMinutes(d.get().getMinutes() + 1);
                       updates(function(result__) {
                         var tmp142 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp128 = mobl.ref(result__);
      
      var nodes119 = $("<span>");
      node87.append(nodes119);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp128, function(_, callback) {
        var root175 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root175); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes119;
        nodes119 = node.contents();
        oldNodes.replaceWith(nodes119);
      }));
      
      var node88 = $("<br>");
      
      node87.append(node88);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setMinutes(minutes.get());
                       updates(function(result__) {
                         var tmp141 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp129 = mobl.ref(result__);
      
      var nodes120 = $("<span>");
      node87.append(nodes120);
      subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(minutes, tmp129, function(_, callback) {
        var root176 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root176); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes120;
        nodes120 = node.contents();
        oldNodes.replaceWith(nodes120);
      }));
      
      var node89 = $("<br>");
      
      node87.append(node89);
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       var result__ = d.get().setMinutes(d.get().getMinutes() - 1);
                       updates(function(result__) {
                         var tmp140 = result__;
                         if(callback && callback.apply) callback(); return;
                       });
                     };
      var tmp130 = mobl.ref(result__);
      
      var nodes121 = $("<span>");
      node87.append(nodes121);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp130, function(_, callback) {
        var root177 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root177); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes121;
        nodes121 = node.contents();
        oldNodes.replaceWith(nodes121);
      }));
      node85.append(node87);
      
      
      
      
      
      
      
      
      
      
      
      
      
    } else {
      
    }
  };
  renderCond14();
  subs__.addSub(visible.addEventListener('change', function() {
    renderCond14();
  }));
  
  
  var node92 = $("<div>");
  node92.attr('style', "clear: both");
  
  node84.append(node92);
  root173.append(node84);
  callback(root173); return subs__;
  
  
  
  
} else {
  {
    
    var visible = mobl.ref(false);
    
    var hours = mobl.ref(d.get().getHours());
    
    var minutes = mobl.ref(d.get().getMinutes());
    
    var updates = function(callback) {
      var __this = this;
      var result__ = d.get().getHours();
      hours.set(result__);
      var result__ = d.get().getMinutes();
      minutes.set(result__);
      var result__ = d.get();
      d.set(result__);
      var result__ = onchange.get();
      if(result__) {
        function after14(result__) {
          var tmp139 = result__;
          if(callback && callback.apply) callback(); return;
        }
        var result__ = onchange.get()(d.get(), after14);if(result__ !== undefined) after14(result__);
      } else {
        {
          if(callback && callback.apply) callback(); return;
        }
      }
    };
    
    
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     var result__ = visible.get() ? false : true;
                     visible.set(result__);
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp124 = mobl.ref(result__);
    
    var result__ = (hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString();
    var tmp123 = mobl.ref(result__);
    subs__.addSub(mobl.ref(mobl.ref(hours.get().toString()), 'length').addEventListener('change', function() {
      tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
    }));
    subs__.addSub(hours.addEventListener('change', function() {
      tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
    }));
    subs__.addSub(mobl.ref(mobl.ref(minutes.get().toString()), 'length').addEventListener('change', function() {
      tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
    }));
    subs__.addSub(minutes.addEventListener('change', function() {
      tmp123.set((hours.get().toString().length == 1 ? "0" : "") + hours.get().toString() + ":" + (minutes.get().toString().length == 1 ? "0" : "") + minutes.get().toString());
    }));
    
    var nodes118 = $("<span>");
    root173.append(nodes118);
    subs__.addSub((mobl.label)(tmp123, mobl.ref(null), tmp124, function(_, callback) {
      var root174 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root174); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes118;
      nodes118 = node.contents();
      oldNodes.replaceWith(nodes118);
    }));
    
    var node84 = $("<div>");
    
    
    var node85 = $("<span>");
    node84.append(node85);
    var condSubs14 = new mobl.CompSubscription();
    subs__.addSub(condSubs14);
    var oldValue14;
    var renderCond14 = function() {
      var value26 = visible.get();
      if(oldValue14 === value26) return;
      oldValue14 = value26;
      var subs__ = condSubs14;
      subs__.unsubscribe();
      node85.empty();
      if(value26) {
        
        var node86 = $("<div>");
        node86.attr('style', "float: left; text-align: center;");
        
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setHours(d.get().getHours() + 1);
                         updates(function(result__) {
                           var tmp145 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp125 = mobl.ref(result__);
        
        var nodes122 = $("<span>");
        node86.append(nodes122);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp125, function(_, callback) {
          var root178 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root178); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes122;
          nodes122 = node.contents();
          oldNodes.replaceWith(nodes122);
        }));
        
        var node90 = $("<br>");
        
        node86.append(node90);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setHours(hours.get());
                         updates(function(result__) {
                           var tmp144 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp126 = mobl.ref(result__);
        
        var nodes123 = $("<span>");
        node86.append(nodes123);
        subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(hours, tmp126, function(_, callback) {
          var root179 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root179); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes123;
          nodes123 = node.contents();
          oldNodes.replaceWith(nodes123);
        }));
        
        var node91 = $("<br>");
        
        node86.append(node91);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setHours(d.get().getHours() - 1);
                         updates(function(result__) {
                           var tmp143 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp127 = mobl.ref(result__);
        
        var nodes124 = $("<span>");
        node86.append(nodes124);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp127, function(_, callback) {
          var root180 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root180); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes124;
          nodes124 = node.contents();
          oldNodes.replaceWith(nodes124);
        }));
        node85.append(node86);
        
        var node87 = $("<div>");
        node87.attr('style', "float: left; text-align: center;");
        
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setMinutes(d.get().getMinutes() + 1);
                         updates(function(result__) {
                           var tmp142 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp128 = mobl.ref(result__);
        
        var nodes119 = $("<span>");
        node87.append(nodes119);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("+"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp128, function(_, callback) {
          var root175 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root175); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes119;
          nodes119 = node.contents();
          oldNodes.replaceWith(nodes119);
        }));
        
        var node88 = $("<br>");
        
        node87.append(node88);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setMinutes(minutes.get());
                         updates(function(result__) {
                           var tmp141 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp129 = mobl.ref(result__);
        
        var nodes120 = $("<span>");
        node87.append(nodes120);
        subs__.addSub((mobl.ui.generic.datepicker.narrowNumField)(minutes, tmp129, function(_, callback) {
          var root176 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root176); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes120;
          nodes120 = node.contents();
          oldNodes.replaceWith(nodes120);
        }));
        
        var node89 = $("<br>");
        
        node87.append(node89);
        var result__ = function(event, callback) {
                         if(event && event.stopPropagation) event.stopPropagation();
                         var result__ = d.get().setMinutes(d.get().getMinutes() - 1);
                         updates(function(result__) {
                           var tmp140 = result__;
                           if(callback && callback.apply) callback(); return;
                         });
                       };
        var tmp130 = mobl.ref(result__);
        
        var nodes121 = $("<span>");
        node87.append(nodes121);
        subs__.addSub((mobl.ui.generic.button)(mobl.ref("-"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp130, function(_, callback) {
          var root177 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root177); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes121;
          nodes121 = node.contents();
          oldNodes.replaceWith(nodes121);
        }));
        node85.append(node87);
        
        
        
        
        
        
        
        
        
        
        
        
        
      } else {
        
      }
    };
    renderCond14();
    subs__.addSub(visible.addEventListener('change', function() {
      renderCond14();
    }));
    
    
    var node92 = $("<div>");
    node92.attr('style', "clear: both");
    
    node84.append(node92);
    root173.append(node84);
    callback(root173); return subs__;
    
    
    
    
  }
}
return subs__;
};
