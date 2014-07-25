mobl.provides('demo');
mobl.provides('mobl.ui');
mobl.provides('mobl.ui.generic.datepicker');
mobl.provides('mobl.ui.googlechart');
mobl.provides('demo');
mobl.provides('mobl.location');
mobl.provides('mobl.ui.generic');
mobl.provides('mobl.ui.googlemap');
mobl.provides('mobl');
persistence.debug = false;
demo.root = function(callback, screenCallback) {
var root311 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes230 = $("<span>");
root311.append(nodes230);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("A header"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root312 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root312); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes230;
  nodes230 = node.contents();
  oldNodes.replaceWith(nodes230);
}));
var nodes231 = $("<span>");
root311.append(nodes231);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root313 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.buttons', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp288 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp222 = mobl.ref(result__);
  
  var nodes232 = $("<span>");
  root313.append(nodes232);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp222, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root314 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root314.append("Buttons");
    callback(root314); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes232;
    nodes232 = node.contents();
    oldNodes.replaceWith(nodes232);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.lists', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp287 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp223 = mobl.ref(result__);
  
  var nodes233 = $("<span>");
  root313.append(nodes233);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp223, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root315 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root315.append("Lists/tables");
    callback(root315); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes233;
    nodes233 = node.contents();
    oldNodes.replaceWith(nodes233);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.forms', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp286 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp224 = mobl.ref(result__);
  
  var nodes234 = $("<span>");
  root313.append(nodes234);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp224, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root316 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root316.append("Forms");
    callback(root316); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes234;
    nodes234 = node.contents();
    oldNodes.replaceWith(nodes234);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.tabs', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp285 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp225 = mobl.ref(result__);
  
  var nodes235 = $("<span>");
  root313.append(nodes235);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp225, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root317 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root317.append("Tabs");
    callback(root317); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes235;
    nodes235 = node.contents();
    oldNodes.replaceWith(nodes235);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.accordion', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp284 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp226 = mobl.ref(result__);
  
  var nodes236 = $("<span>");
  root313.append(nodes236);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp226, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root318 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root318.append("Accordion");
    callback(root318); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes236;
    nodes236 = node.contents();
    oldNodes.replaceWith(nodes236);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.master', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp283 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp227 = mobl.ref(result__);
  
  var nodes237 = $("<span>");
  root313.append(nodes237);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp227, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root319 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root319.append("Master detail");
    callback(root319); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes237;
    nodes237 = node.contents();
    oldNodes.replaceWith(nodes237);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.zoom', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp282 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp228 = mobl.ref(result__);
  
  var nodes238 = $("<span>");
  root313.append(nodes238);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp228, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root320 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root320.append("Zoom list");
    callback(root320); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes238;
    nodes238 = node.contents();
    oldNodes.replaceWith(nodes238);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.staged', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp281 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp229 = mobl.ref(result__);
  
  var nodes239 = $("<span>");
  root313.append(nodes239);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp229, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root321 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root321.append("Staged list");
    callback(root321); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes239;
    nodes239 = node.contents();
    oldNodes.replaceWith(nodes239);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('mobl.ui.generic.selectList', [mobl.ref("Select items"), mobl.ref(new persistence.LocalQueryCollection([new demo.Person({'name': "Zef"}), new demo.Person({'name': "Eelco"}), new demo.Person({'name': "Danny"})])), mobl.ref(mobl._("Done", [])), mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp280 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp230 = mobl.ref(result__);
  
  var nodes240 = $("<span>");
  root313.append(nodes240);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp230, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root322 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root322.append("Markable list");
    callback(root322); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes240;
    nodes240 = node.contents();
    oldNodes.replaceWith(nodes240);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.charts', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp279 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp231 = mobl.ref(result__);
  
  var nodes241 = $("<span>");
  root313.append(nodes241);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp231, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root323 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root323.append("Charts");
    callback(root323); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes241;
    nodes241 = node.contents();
    oldNodes.replaceWith(nodes241);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.maps', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp278 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp232 = mobl.ref(result__);
  
  var nodes242 = $("<span>");
  root313.append(nodes242);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp232, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root324 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root324.append("Maps");
    callback(root324); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes242;
    nodes242 = node.contents();
    oldNodes.replaceWith(nodes242);
  }));
  callback(root313); return subs__;
  
  
  
  
  
  
  
  
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes231;
  nodes231 = node.contents();
  oldNodes.replaceWith(nodes231);
}));
callback(root311); return subs__;


return subs__;
};

demo.buttons = function(callback, screenCallback) {
var root325 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes243 = $("<span>");
root325.append(nodes243);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Buttons"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root326 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp234 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp233 = mobl.ref(result__);
  
  var nodes244 = $("<span>");
  root326.append(nodes244);
  subs__.addSub((mobl.ui.generic.backButton)(tmp233, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp234, function(_, callback) {
    var root327 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root327); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes244;
    nodes244 = node.contents();
    oldNodes.replaceWith(nodes244);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   var result__ = mobl.alert("Click!");
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp235 = mobl.ref(result__);
  
  var nodes245 = $("<span>");
  root326.append(nodes245);
  subs__.addSub((mobl.ui.generic.button)(mobl.ref("Button"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp235, function(_, callback) {
    var root328 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root328); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes245;
    nodes245 = node.contents();
    oldNodes.replaceWith(nodes245);
  }));
  callback(root326); return subs__;
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes243;
  nodes243 = node.contents();
  oldNodes.replaceWith(nodes243);
}));
var nodes246 = $("<span>");
root325.append(nodes246);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root329 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes247 = $("<span>");
  root329.append(nodes247);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root330 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root330.append("Some item");
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp236 = mobl.ref(result__);
    
    var nodes248 = $("<span>");
    root330.append(nodes248);
    subs__.addSub((mobl.ui.generic.sideButton)(mobl.ref("Side button"), mobl.ref(mobl.ui.generic.sideButtonStyle), mobl.ref(mobl.ui.generic.sideButtonPushedStyle), tmp236, function(_, callback) {
      var root331 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root331); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes248;
      nodes248 = node.contents();
      oldNodes.replaceWith(nodes248);
    }));
    callback(root330); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes247;
    nodes247 = node.contents();
    oldNodes.replaceWith(nodes247);
  }));
  var nodes249 = $("<span>");
  root329.append(nodes249);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root332 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root332.append("Context menu");
    var nodes250 = $("<span>");
    root332.append(nodes250);
    subs__.addSub((mobl.ui.generic.contextMenu)(function(_, callback) {
      var root333 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp237 = mobl.ref(result__);
      
      var nodes251 = $("<span>");
      root333.append(nodes251);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("Option 1"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp237, function(_, callback) {
        var root334 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root334); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes251;
        nodes251 = node.contents();
        oldNodes.replaceWith(nodes251);
      }));
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp238 = mobl.ref(result__);
      
      var nodes252 = $("<span>");
      root333.append(nodes252);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("Option 2"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp238, function(_, callback) {
        var root335 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root335); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes252;
        nodes252 = node.contents();
        oldNodes.replaceWith(nodes252);
      }));
      callback(root333); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes250;
      nodes250 = node.contents();
      oldNodes.replaceWith(nodes250);
    }));
    callback(root332); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes249;
    nodes249 = node.contents();
    oldNodes.replaceWith(nodes249);
  }));
  callback(root329); return subs__;
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes246;
  nodes246 = node.contents();
  oldNodes.replaceWith(nodes246);
}));
var result__ = function(event, callback) {
                 if(event && event.stopPropagation) event.stopPropagation();
                 if(callback && callback.apply) callback(); return;
               };
var tmp239 = mobl.ref(result__);

var nodes253 = $("<span>");
root325.append(nodes253);
subs__.addSub((mobl.ui.generic.button)(mobl.ref("Usual button"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp239, function(_, callback) {
  var root336 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root336); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes253;
  nodes253 = node.contents();
  oldNodes.replaceWith(nodes253);
}));
callback(root325); return subs__;



return subs__;
};

demo.lists = function(callback, screenCallback) {
var root337 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes254 = $("<span>");
root337.append(nodes254);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Lists"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root338 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp241 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp240 = mobl.ref(result__);
  
  var nodes255 = $("<span>");
  root338.append(nodes255);
  subs__.addSub((mobl.ui.generic.backButton)(tmp240, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp241, function(_, callback) {
    var root339 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root339); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes255;
    nodes255 = node.contents();
    oldNodes.replaceWith(nodes255);
  }));
  callback(root338); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes254;
  nodes254 = node.contents();
  oldNodes.replaceWith(nodes254);
}));
var nodes256 = $("<span>");
root337.append(nodes256);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root340 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes257 = $("<span>");
  root340.append(nodes257);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root341 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root341.append("Group item");
    callback(root341); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes257;
    nodes257 = node.contents();
    oldNodes.replaceWith(nodes257);
  }));
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   mobl.call('demo.clickedArrow', [mobl.ref(false), mobl.ref("slide"), mobl.ref(null)], function(result__) {
                   var tmp289 = result__;
                   if(callback && callback.apply) callback(); return;
                   });
                 };
  var tmp242 = mobl.ref(result__);
  
  var nodes258 = $("<span>");
  root340.append(nodes258);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), tmp242, mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root342 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root342.append("Arrowed group item");
    callback(root342); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes258;
    nodes258 = node.contents();
    oldNodes.replaceWith(nodes258);
  }));
  var nodes259 = $("<span>");
  root340.append(nodes259);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root343 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    
    root343.append("Group item with context");
    var nodes260 = $("<span>");
    root343.append(nodes260);
    subs__.addSub((mobl.ui.generic.contextMenu)(function(_, callback) {
      var root344 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var result__ = function(event, callback) {
                       if(event && event.stopPropagation) event.stopPropagation();
                       if(callback && callback.apply) callback(); return;
                     };
      var tmp243 = mobl.ref(result__);
      
      var nodes261 = $("<span>");
      root344.append(nodes261);
      subs__.addSub((mobl.ui.generic.button)(mobl.ref("Option"), mobl.ref(mobl.ui.generic.buttonStyle), mobl.ref(mobl.ui.generic.buttonPushedStyle), tmp243, function(_, callback) {
        var root345 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        callback(root345); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes261;
        nodes261 = node.contents();
        oldNodes.replaceWith(nodes261);
      }));
      callback(root344); return subs__;
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes260;
      nodes260 = node.contents();
      oldNodes.replaceWith(nodes260);
    }));
    callback(root343); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes259;
    nodes259 = node.contents();
    oldNodes.replaceWith(nodes259);
  }));
  var nodes262 = $("<span>");
  root340.append(nodes262);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root346 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes263 = $("<span>");
    root346.append(nodes263);
    subs__.addSub((mobl.ui.generic.floatBox)(mobl.ref(null), mobl.ref(10), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root347 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root347.append("Float to right");
      callback(root347); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes263;
      nodes263 = node.contents();
      oldNodes.replaceWith(nodes263);
    }));
    
    root346.append("Content");
    callback(root346); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes262;
    nodes262 = node.contents();
    oldNodes.replaceWith(nodes262);
  }));
  callback(root340); return subs__;
  
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes256;
  nodes256 = node.contents();
  oldNodes.replaceWith(nodes256);
}));
var nodes264 = $("<span>");
root337.append(nodes264);
subs__.addSub((mobl.ui.generic.table)(mobl.ref(mobl.ui.generic.tableStyle), function(_, callback) {
  var root348 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes265 = $("<span>");
  root348.append(nodes265);
  subs__.addSub((mobl.ui.generic.row)(mobl.ref(mobl.ui.generic.trStyle), function(_, callback) {
    var root349 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes266 = $("<span>");
    root349.append(nodes266);
    subs__.addSub((mobl.ui.generic.headerCol)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root350 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root350.append("Header");
      callback(root350); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes266;
      nodes266 = node.contents();
      oldNodes.replaceWith(nodes266);
    }));
    var nodes267 = $("<span>");
    root349.append(nodes267);
    subs__.addSub((mobl.ui.generic.headerCol)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root351 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root351.append("Header 2");
      callback(root351); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes267;
      nodes267 = node.contents();
      oldNodes.replaceWith(nodes267);
    }));
    callback(root349); return subs__;
    
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes265;
    nodes265 = node.contents();
    oldNodes.replaceWith(nodes265);
  }));
  var nodes268 = $("<span>");
  root348.append(nodes268);
  subs__.addSub((mobl.ui.generic.row)(mobl.ref(mobl.ui.generic.trStyle), function(_, callback) {
    var root352 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes269 = $("<span>");
    root352.append(nodes269);
    subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root353 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root353.append("Data");
      callback(root353); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes269;
      nodes269 = node.contents();
      oldNodes.replaceWith(nodes269);
    }));
    var nodes270 = $("<span>");
    root352.append(nodes270);
    subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root354 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root354.append("Data");
      callback(root354); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes270;
      nodes270 = node.contents();
      oldNodes.replaceWith(nodes270);
    }));
    callback(root352); return subs__;
    
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes268;
    nodes268 = node.contents();
    oldNodes.replaceWith(nodes268);
  }));
  var nodes271 = $("<span>");
  root348.append(nodes271);
  subs__.addSub((mobl.ui.generic.row)(mobl.ref(mobl.ui.generic.trStyle), function(_, callback) {
    var root355 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes272 = $("<span>");
    root355.append(nodes272);
    subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root356 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root356.append("Data");
      callback(root356); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes272;
      nodes272 = node.contents();
      oldNodes.replaceWith(nodes272);
    }));
    var nodes273 = $("<span>");
    root355.append(nodes273);
    subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root357 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root357.append("Data");
      callback(root357); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes273;
      nodes273 = node.contents();
      oldNodes.replaceWith(nodes273);
    }));
    callback(root355); return subs__;
    
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes271;
    nodes271 = node.contents();
    oldNodes.replaceWith(nodes271);
  }));
  var nodes274 = $("<span>");
  root348.append(nodes274);
  subs__.addSub((mobl.ui.generic.row)(mobl.ref(mobl.ui.generic.trStyle), function(_, callback) {
    var root358 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes275 = $("<span>");
    root358.append(nodes275);
    subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root359 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root359.append("Data");
      callback(root359); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes275;
      nodes275 = node.contents();
      oldNodes.replaceWith(nodes275);
    }));
    var nodes276 = $("<span>");
    root358.append(nodes276);
    subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
      var root360 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      
      root360.append("Data");
      callback(root360); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes276;
      nodes276 = node.contents();
      oldNodes.replaceWith(nodes276);
    }));
    callback(root358); return subs__;
    
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes274;
    nodes274 = node.contents();
    oldNodes.replaceWith(nodes274);
  }));
  callback(root348); return subs__;
  
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes264;
  nodes264 = node.contents();
  oldNodes.replaceWith(nodes264);
}));
callback(root337); return subs__;



return subs__;
};

demo.clickedArrow = function(callback, screenCallback) {
var root361 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes277 = $("<span>");
root361.append(nodes277);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Waddup!?"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root362 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp245 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp244 = mobl.ref(result__);
  
  var nodes278 = $("<span>");
  root362.append(nodes278);
  subs__.addSub((mobl.ui.generic.backButton)(tmp244, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp245, function(_, callback) {
    var root363 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root363); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes278;
    nodes278 = node.contents();
    oldNodes.replaceWith(nodes278);
  }));
  callback(root362); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes277;
  nodes277 = node.contents();
  oldNodes.replaceWith(nodes277);
}));
callback(root361); return subs__;

return subs__;
};

demo.forms = function(callback, screenCallback) {
var root364 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes279 = $("<span>");
root364.append(nodes279);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Forms"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root365 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp247 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp246 = mobl.ref(result__);
  
  var nodes280 = $("<span>");
  root365.append(nodes280);
  subs__.addSub((mobl.ui.generic.backButton)(tmp246, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp247, function(_, callback) {
    var root366 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root366); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes280;
    nodes280 = node.contents();
    oldNodes.replaceWith(nodes280);
  }));
  callback(root365); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes279;
  nodes279 = node.contents();
  oldNodes.replaceWith(nodes279);
}));
var nodes281 = $("<span>");
root364.append(nodes281);
subs__.addSub((mobl.ui.generic.group)(function(_, callback) {
  var root367 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes282 = $("<span>");
  root367.append(nodes282);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root368 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes283 = $("<span>");
    root368.append(nodes283);
    subs__.addSub((mobl.ui.generic.textField)(mobl.ref(""), mobl.ref("Textfield placeholder"), mobl.ref(null), mobl.ref("text"), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(true), mobl.ref(true), mobl.ref(true), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root369 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root369); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes283;
      nodes283 = node.contents();
      oldNodes.replaceWith(nodes283);
    }));
    callback(root368); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes282;
    nodes282 = node.contents();
    oldNodes.replaceWith(nodes282);
  }));
  var nodes284 = $("<span>");
  root367.append(nodes284);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root370 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes285 = $("<span>");
    root370.append(nodes285);
    subs__.addSub((mobl.ui.generic.textField)(mobl.ref(""), mobl.ref(null), mobl.ref("with label"), mobl.ref("text"), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(true), mobl.ref(true), mobl.ref(true), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root371 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root371); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes285;
      nodes285 = node.contents();
      oldNodes.replaceWith(nodes285);
    }));
    callback(root370); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes284;
    nodes284 = node.contents();
    oldNodes.replaceWith(nodes284);
  }));
  var nodes286 = $("<span>");
  root367.append(nodes286);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root372 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var result__ = [new mobl.Tuple("en", "English"), new mobl.Tuple("nl", "Dutch")];
    var tmp248 = mobl.ref(result__);
    
    var nodes287 = $("<span>");
    root372.append(nodes287);
    subs__.addSub((mobl.ui.generic.selectField)(mobl.ref("en"), tmp248, mobl.ref(null), mobl.ref(mobl.ui.generic.selectFieldStyle), mobl.ref(null), function(_, callback) {
      var root373 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root373); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes287;
      nodes287 = node.contents();
      oldNodes.replaceWith(nodes287);
    }));
    callback(root372); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes286;
    nodes286 = node.contents();
    oldNodes.replaceWith(nodes286);
  }));
  var nodes288 = $("<span>");
  root367.append(nodes288);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root374 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes289 = $("<span>");
    root374.append(nodes289);
    subs__.addSub((mobl.ui.generic.numField)(mobl.ref(7), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(mobl.ui.generic.textFieldStyle), mobl.ref(mobl.ui.generic.textFieldInvalidStyle), mobl.ref(false), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root375 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root375); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes289;
      nodes289 = node.contents();
      oldNodes.replaceWith(nodes289);
    }));
    callback(root374); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes288;
    nodes288 = node.contents();
    oldNodes.replaceWith(nodes288);
  }));
  var nodes290 = $("<span>");
  root367.append(nodes290);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root376 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var result__ = mobl.now();
    var tmp249 = mobl.ref(result__);
    
    var nodes291 = $("<span>");
    root376.append(nodes291);
    subs__.addSub((mobl.ui.generic.datepicker.datePicker)(tmp249, mobl.ref(null), function(_, callback) {
      var root377 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root377); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes291;
      nodes291 = node.contents();
      oldNodes.replaceWith(nodes291);
    }));
    callback(root376); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes290;
    nodes290 = node.contents();
    oldNodes.replaceWith(nodes290);
  }));
  var nodes292 = $("<span>");
  root367.append(nodes292);
  subs__.addSub((mobl.ui.generic.item)(mobl.ref(mobl.ui.generic.itemStyle), mobl.ref(mobl.ui.generic.itemPushedStyle), mobl.ref(null), mobl.ref(null), mobl.ref(false), function(_, callback) {
    var root378 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes293 = $("<span>");
    root378.append(nodes293);
    subs__.addSub((mobl.ui.generic.checkBox)(mobl.ref(true), mobl.ref("A label"), mobl.ref(null), function(_, callback) {
      var root379 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root379); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes293;
      nodes293 = node.contents();
      oldNodes.replaceWith(nodes293);
    }));
    callback(root378); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes292;
    nodes292 = node.contents();
    oldNodes.replaceWith(nodes292);
  }));
  callback(root367); return subs__;
  
  
  
  
  
  
  return subs__;
}, function(node) {
  var oldNodes = nodes281;
  nodes281 = node.contents();
  oldNodes.replaceWith(nodes281);
}));
callback(root364); return subs__;


return subs__;
};

demo.tabs = function(callback, screenCallback) {
var root380 = $("<div>");
var subs__ = new mobl.CompSubscription();

var tab1 = function(elements, callback) {
  var root381 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes294 = $("<span>");
  root381.append(nodes294);
  subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tab 1"), mobl.ref(false), mobl.ref(null), function(_, callback) {
    var root382 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     if(screenCallback) screenCallback();
                     return;
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp251 = mobl.ref(result__);
    
    var result__ = mobl._("Back", []);
    var tmp250 = mobl.ref(result__);
    
    var nodes295 = $("<span>");
    root382.append(nodes295);
    subs__.addSub((mobl.ui.generic.backButton)(tmp250, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp251, function(_, callback) {
      var root383 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root383); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes295;
      nodes295 = node.contents();
      oldNodes.replaceWith(nodes295);
    }));
    callback(root382); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes294;
    nodes294 = node.contents();
    oldNodes.replaceWith(nodes294);
  }));
  
  root381.append("This is the first tab");
  callback(root381); return subs__;
  
  return subs__;
};

var tab2 = function(elements, callback) {
  var root384 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes296 = $("<span>");
  root384.append(nodes296);
  subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tab 2"), mobl.ref(false), mobl.ref(null), function(_, callback) {
    var root385 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     if(screenCallback) screenCallback();
                     return;
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp253 = mobl.ref(result__);
    
    var result__ = mobl._("Back", []);
    var tmp252 = mobl.ref(result__);
    
    var nodes297 = $("<span>");
    root385.append(nodes297);
    subs__.addSub((mobl.ui.generic.backButton)(tmp252, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp253, function(_, callback) {
      var root386 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root386); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes297;
      nodes297 = node.contents();
      oldNodes.replaceWith(nodes297);
    }));
    callback(root385); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes296;
    nodes296 = node.contents();
    oldNodes.replaceWith(nodes296);
  }));
  
  root384.append("This is the second tab");
  callback(root384); return subs__;
  
  return subs__;
};

var tab3 = function(elements, callback) {
  var root387 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes298 = $("<span>");
  root387.append(nodes298);
  subs__.addSub((mobl.ui.generic.header)(mobl.ref("Tab 3"), mobl.ref(false), mobl.ref(null), function(_, callback) {
    var root388 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     if(screenCallback) screenCallback();
                     return;
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp255 = mobl.ref(result__);
    
    var result__ = mobl._("Back", []);
    var tmp254 = mobl.ref(result__);
    
    var nodes299 = $("<span>");
    root388.append(nodes299);
    subs__.addSub((mobl.ui.generic.backButton)(tmp254, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp255, function(_, callback) {
      var root389 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root389); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes299;
      nodes299 = node.contents();
      oldNodes.replaceWith(nodes299);
    }));
    callback(root388); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes298;
    nodes298 = node.contents();
    oldNodes.replaceWith(nodes298);
  }));
  
  root387.append("This is the third tab");
  callback(root387); return subs__;
  
  return subs__;
};
var result__ = [new mobl.Tuple("One", "", tab1), new mobl.Tuple("Two", "", tab2), new mobl.Tuple("Three", "", tab3)];
var tmp256 = mobl.ref(result__);
subs__.addSub(mobl.ref(tab1).addEventListener('change', function() {
  tmp256.set([new mobl.Tuple("One", "", tab1), new mobl.Tuple("Two", "", tab2), new mobl.Tuple("Three", "", tab3)]);
}));
subs__.addSub(mobl.ref(tab2).addEventListener('change', function() {
  tmp256.set([new mobl.Tuple("One", "", tab1), new mobl.Tuple("Two", "", tab2), new mobl.Tuple("Three", "", tab3)]);
}));
subs__.addSub(mobl.ref(tab3).addEventListener('change', function() {
  tmp256.set([new mobl.Tuple("One", "", tab1), new mobl.Tuple("Two", "", tab2), new mobl.Tuple("Three", "", tab3)]);
}));

var nodes300 = $("<span>");
root380.append(nodes300);
subs__.addSub((mobl.ui.generic.tabSet)(tmp256, mobl.ref(null), mobl.ref("tabSetContext"), function(_, callback) {
  var root390 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root390); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes300;
  nodes300 = node.contents();
  oldNodes.replaceWith(nodes300);
}));
callback(root380); return subs__;




return subs__;
};

demo.accordion = function(callback, screenCallback) {
var root391 = $("<div>");
var subs__ = new mobl.CompSubscription();

var section1 = function(elements, callback) {
  var root392 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  root392.append("This is the first section");
  callback(root392); return subs__;
  return subs__;
};

var section2 = function(elements, callback) {
  var root393 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  root393.append("This is the second section");
  callback(root393); return subs__;
  return subs__;
};

var section3 = function(elements, callback) {
  var root394 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  root394.append("This is the third section");
  callback(root394); return subs__;
  return subs__;
};
var nodes301 = $("<span>");
root391.append(nodes301);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Accordion"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root395 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp258 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp257 = mobl.ref(result__);
  
  var nodes302 = $("<span>");
  root395.append(nodes302);
  subs__.addSub((mobl.ui.generic.backButton)(tmp257, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp258, function(_, callback) {
    var root396 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root396); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes302;
    nodes302 = node.contents();
    oldNodes.replaceWith(nodes302);
  }));
  callback(root395); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes301;
  nodes301 = node.contents();
  oldNodes.replaceWith(nodes301);
}));
var result__ = [new mobl.Tuple("One", section1), new mobl.Tuple("Two", section2), new mobl.Tuple("Three", section3)];
var tmp259 = mobl.ref(result__);
subs__.addSub(mobl.ref(section1).addEventListener('change', function() {
  tmp259.set([new mobl.Tuple("One", section1), new mobl.Tuple("Two", section2), new mobl.Tuple("Three", section3)]);
}));
subs__.addSub(mobl.ref(section2).addEventListener('change', function() {
  tmp259.set([new mobl.Tuple("One", section1), new mobl.Tuple("Two", section2), new mobl.Tuple("Three", section3)]);
}));
subs__.addSub(mobl.ref(section3).addEventListener('change', function() {
  tmp259.set([new mobl.Tuple("One", section1), new mobl.Tuple("Two", section2), new mobl.Tuple("Three", section3)]);
}));

var nodes303 = $("<span>");
root391.append(nodes303);
subs__.addSub((mobl.ui.generic.accordion)(tmp259, mobl.ref(null), function(_, callback) {
  var root397 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root397); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes303;
  nodes303 = node.contents();
  oldNodes.replaceWith(nodes303);
}));
callback(root391); return subs__;





return subs__;
};

demo.master = function(callback, screenCallback) {
var root398 = $("<div>");
var subs__ = new mobl.CompSubscription();

var items = mobl.ref(new persistence.LocalQueryCollection(["Item 1", "Item 2"]));

var detail = function(item, elements, callback) {
  var root399 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  
  root399.append("This shows details about ");
  var nodes304 = $("<span>");
  root399.append(nodes304);
  subs__.addSub((mobl.label)(item, mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root400 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root400); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes304;
    nodes304 = node.contents();
    oldNodes.replaceWith(nodes304);
  }));
  
  root399.append(". For instance, it has length: ");
  var nodes305 = $("<span>");
  root399.append(nodes305);
  subs__.addSub((mobl.label)(mobl.ref(item, 'length'), mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root401 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root401); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes305;
    nodes305 = node.contents();
    oldNodes.replaceWith(nodes305);
  }));
  callback(root399); return subs__;
  
  
  return subs__;
};

var masterItem = function(item, elements, callback) {
  var root402 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes306 = $("<span>");
  root402.append(nodes306);
  subs__.addSub((mobl.label)(item, mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root403 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root403); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes306;
    nodes306 = node.contents();
    oldNodes.replaceWith(nodes306);
  }));
  callback(root402); return subs__;
  
  return subs__;
};
var nodes307 = $("<span>");
root398.append(nodes307);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Master/detail"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root404 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp261 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp260 = mobl.ref(result__);
  
  var nodes308 = $("<span>");
  root404.append(nodes308);
  subs__.addSub((mobl.ui.generic.backButton)(tmp260, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp261, function(_, callback) {
    var root405 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root405); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes308;
    nodes308 = node.contents();
    oldNodes.replaceWith(nodes308);
  }));
  callback(root404); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes307;
  nodes307 = node.contents();
  oldNodes.replaceWith(nodes307);
}));
var nodes309 = $("<span>");
root398.append(nodes309);
subs__.addSub((mobl.ui.generic.masterDetail)(items, mobl.ref(masterItem), mobl.ref(detail), function(_, callback) {
  var root406 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root406); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes309;
  nodes309 = node.contents();
  oldNodes.replaceWith(nodes309);
}));
callback(root398); return subs__;




return subs__;
};
demo.createBigList = function() {
   var __this = this;
  var lst = new persistence.LocalQueryCollection([]);
  
  var coll52 = mobl.range(0, 40);
  var length13 = coll52.length;
  for(var i46 = 0; i46 < length13; i46++) {
    var i;
    i = coll52.get(i46);
    lst.add(new demo.Person({'name': "Person " + i, 'age': i}));
  }
  mobl.log(lst);
  return lst;
};


demo.staged = function(callback, screenCallback) {
var root407 = $("<div>");
var subs__ = new mobl.CompSubscription();

var coll = mobl.ref(demo.createBigList());
var nodes310 = $("<span>");
root407.append(nodes310);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Staged list"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root408 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp263 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp262 = mobl.ref(result__);
  
  var nodes311 = $("<span>");
  root408.append(nodes311);
  subs__.addSub((mobl.ui.generic.backButton)(tmp262, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp263, function(_, callback) {
    var root409 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root409); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes311;
    nodes311 = node.contents();
    oldNodes.replaceWith(nodes311);
  }));
  callback(root408); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes310;
  nodes310 = node.contents();
  oldNodes.replaceWith(nodes310);
}));

var listCtrl = function(p, elements, callback) {
  var root410 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes312 = $("<span>");
  root410.append(nodes312);
  subs__.addSub((mobl.block)(mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root411 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes313 = $("<span>");
    root411.append(nodes313);
    subs__.addSub((mobl.label)(mobl.ref(p, 'name'), mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root412 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root412); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes313;
      nodes313 = node.contents();
      oldNodes.replaceWith(nodes313);
    }));
    callback(root411); return subs__;
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes312;
    nodes312 = node.contents();
    oldNodes.replaceWith(nodes312);
  }));
  callback(root410); return subs__;
  
  return subs__;
};
var result__ = coll.get().order("age", true);
var tmp264 = mobl.ref(result__);
subs__.addSub(mobl.ref(coll.get().order("age", true)).addEventListener('change', function() {
  tmp264.set(coll.get().order("age", true));
}));
subs__.addSub(coll.addEventListener('change', function() {
  tmp264.set(coll.get().order("age", true));
}));

var result__ = mobl._("More", []);
var tmp265 = mobl.ref(result__);

var nodes314 = $("<span>");
root407.append(nodes314);
subs__.addSub((mobl.ui.generic.stagedList)(tmp264, mobl.ref(listCtrl), mobl.ref(10), mobl.ref(10), tmp265, mobl.ref(mobl.ui.generic.loadMoreStyle), function(_, callback) {
  var root413 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root413); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes314;
  nodes314 = node.contents();
  oldNodes.replaceWith(nodes314);
}));
callback(root407); return subs__;



return subs__;
};

demo.zoom = function(callback, screenCallback) {
var root414 = $("<div>");
var subs__ = new mobl.CompSubscription();

var coll = mobl.ref(new persistence.LocalQueryCollection([new demo.Person({'name': "John", 'age': 22}), new demo.Person({'name': "Hank", 'age': 35}), new demo.Person({'name': "Joey", 'age': 17})]));
var nodes315 = $("<span>");
root414.append(nodes315);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Zoom list"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root415 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp267 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp266 = mobl.ref(result__);
  
  var nodes316 = $("<span>");
  root415.append(nodes316);
  subs__.addSub((mobl.ui.generic.backButton)(tmp266, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp267, function(_, callback) {
    var root416 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root416); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes316;
    nodes316 = node.contents();
    oldNodes.replaceWith(nodes316);
  }));
  callback(root415); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes315;
  nodes315 = node.contents();
  oldNodes.replaceWith(nodes315);
}));

var listCtrl = function(p, elements, callback) {
  var root417 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes317 = $("<span>");
  root417.append(nodes317);
  subs__.addSub((mobl.label)(mobl.ref(p, 'name'), mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root418 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root418); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes317;
    nodes317 = node.contents();
    oldNodes.replaceWith(nodes317);
  }));
  callback(root417); return subs__;
  
  return subs__;
};

var zoomCtrl = function(p, elements, callback) {
  var root419 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var nodes318 = $("<span>");
  root419.append(nodes318);
  subs__.addSub((mobl.label)(mobl.ref(p, 'name'), mobl.ref(null), mobl.ref(null), function(_, callback) {
    var root420 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root420); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes318;
    nodes318 = node.contents();
    oldNodes.replaceWith(nodes318);
  }));
  var nodes319 = $("<span>");
  root419.append(nodes319);
  subs__.addSub((mobl.ui.generic.table)(mobl.ref(mobl.ui.generic.tableStyle), function(_, callback) {
    var root421 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    var nodes320 = $("<span>");
    root421.append(nodes320);
    subs__.addSub((mobl.ui.generic.row)(mobl.ref(mobl.ui.generic.trStyle), function(_, callback) {
      var root422 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var nodes321 = $("<span>");
      root422.append(nodes321);
      subs__.addSub((mobl.ui.generic.headerCol)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
        var root423 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        
        root423.append("Age: ");
        callback(root423); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes321;
        nodes321 = node.contents();
        oldNodes.replaceWith(nodes321);
      }));
      var nodes322 = $("<span>");
      root422.append(nodes322);
      subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
        var root424 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        var nodes323 = $("<span>");
        root424.append(nodes323);
        subs__.addSub((mobl.label)(mobl.ref(p, 'age'), mobl.ref(null), mobl.ref(null), function(_, callback) {
          var root425 = $("<span>");
          var subs__ = new mobl.CompSubscription();
          callback(root425); return subs__;
          return subs__;
        }, function(node) {
          var oldNodes = nodes323;
          nodes323 = node.contents();
          oldNodes.replaceWith(nodes323);
        }));
        callback(root424); return subs__;
        
        return subs__;
      }, function(node) {
        var oldNodes = nodes322;
        nodes322 = node.contents();
        oldNodes.replaceWith(nodes322);
      }));
      callback(root422); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes320;
      nodes320 = node.contents();
      oldNodes.replaceWith(nodes320);
    }));
    var nodes324 = $("<span>");
    root421.append(nodes324);
    subs__.addSub((mobl.ui.generic.row)(mobl.ref(mobl.ui.generic.trStyle), function(_, callback) {
      var root426 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      var nodes325 = $("<span>");
      root426.append(nodes325);
      subs__.addSub((mobl.ui.generic.headerCol)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
        var root427 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        
        root427.append("Gender: ");
        callback(root427); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes325;
        nodes325 = node.contents();
        oldNodes.replaceWith(nodes325);
      }));
      var nodes326 = $("<span>");
      root426.append(nodes326);
      subs__.addSub((mobl.ui.generic.col)(mobl.ref(null), mobl.ref(mobl.ui.generic.tdStyle), function(_, callback) {
        var root428 = $("<span>");
        var subs__ = new mobl.CompSubscription();
        
        root428.append("Male");
        callback(root428); return subs__;
        return subs__;
      }, function(node) {
        var oldNodes = nodes326;
        nodes326 = node.contents();
        oldNodes.replaceWith(nodes326);
      }));
      callback(root426); return subs__;
      
      
      return subs__;
    }, function(node) {
      var oldNodes = nodes324;
      nodes324 = node.contents();
      oldNodes.replaceWith(nodes324);
    }));
    callback(root421); return subs__;
    
    
    return subs__;
  }, function(node) {
    var oldNodes = nodes319;
    nodes319 = node.contents();
    oldNodes.replaceWith(nodes319);
  }));
  callback(root419); return subs__;
  
  
  return subs__;
};
var nodes327 = $("<span>");
root414.append(nodes327);
subs__.addSub((mobl.ui.generic.zoomList)(coll, mobl.ref(listCtrl), mobl.ref(zoomCtrl), function(_, callback) {
  var root429 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root429); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes327;
  nodes327 = node.contents();
  oldNodes.replaceWith(nodes327);
}));
callback(root414); return subs__;




return subs__;
};

demo.charts = function(callback, screenCallback) {
var root430 = $("<div>");
var subs__ = new mobl.CompSubscription();
var nodes328 = $("<span>");
root430.append(nodes328);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Chart"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root431 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp269 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp268 = mobl.ref(result__);
  
  var nodes329 = $("<span>");
  root431.append(nodes329);
  subs__.addSub((mobl.ui.generic.backButton)(tmp268, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp269, function(_, callback) {
    var root432 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root432); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes329;
    nodes329 = node.contents();
    oldNodes.replaceWith(nodes329);
  }));
  callback(root431); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes328;
  nodes328 = node.contents();
  oldNodes.replaceWith(nodes328);
}));
var result__ = mobl.ui.googlechart.googleChartUrl("bvg", [[1, 2, 3, 4, 5, 4, 3, 2, 1]], "Beautiful bar chart", new mobl.Tuple(300, 100), null, null, null, null, null, null, null, null);
var tmp270 = mobl.ref(result__);

var nodes330 = $("<span>");
root430.append(nodes330);
subs__.addSub((mobl.ui.generic.image)(tmp270, mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), mobl.ref(null), function(_, callback) {
  var root433 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  callback(root433); return subs__;
  return subs__;
}, function(node) {
  var oldNodes = nodes330;
  nodes330 = node.contents();
  oldNodes.replaceWith(nodes330);
}));
callback(root430); return subs__;


return subs__;
};

demo.maps = function(callback, screenCallback) {
var root434 = $("<div>");
var subs__ = new mobl.CompSubscription();

var position = mobl.ref(null);
mobl.location.getPosition(false, function(result__) {
  var tmp290 = result__;
  var result__ = tmp290;
  position.set(result__);
  
});
var nodes331 = $("<span>");
root434.append(nodes331);
subs__.addSub((mobl.ui.generic.header)(mobl.ref("Your location"), mobl.ref(false), mobl.ref(null), function(_, callback) {
  var root435 = $("<span>");
  var subs__ = new mobl.CompSubscription();
  var result__ = function(event, callback) {
                   if(event && event.stopPropagation) event.stopPropagation();
                   if(screenCallback) screenCallback();
                   return;
                   if(callback && callback.apply) callback(); return;
                 };
  var tmp272 = mobl.ref(result__);
  
  var result__ = mobl._("Back", []);
  var tmp271 = mobl.ref(result__);
  
  var nodes332 = $("<span>");
  root435.append(nodes332);
  subs__.addSub((mobl.ui.generic.backButton)(tmp271, mobl.ref(mobl.ui.generic.backButtonStyle), mobl.ref(mobl.ui.generic.backButtonPushedStyle), tmp272, function(_, callback) {
    var root436 = $("<span>");
    var subs__ = new mobl.CompSubscription();
    callback(root436); return subs__;
    return subs__;
  }, function(node) {
    var oldNodes = nodes332;
    nodes332 = node.contents();
    oldNodes.replaceWith(nodes332);
  }));
  callback(root435); return subs__;
  
  return subs__;
}, function(node) {
  var oldNodes = nodes331;
  nodes331 = node.contents();
  oldNodes.replaceWith(nodes331);
}));
var result__ = position.get() != null;
var tmp277 = mobl.ref(result__);
subs__.addSub(position.addEventListener('change', function() {
  tmp277.set(position.get() != null);
}));


var node94 = $("<span>");
root434.append(node94);
var condSubs16 = new mobl.CompSubscription();
subs__.addSub(condSubs16);
var oldValue16;
var renderCond16 = function() {
  var value30 = tmp277.get();
  if(oldValue16 === value30) return;
  oldValue16 = value30;
  var subs__ = condSubs16;
  subs__.unsubscribe();
  node94.empty();
  if(value30) {
    var result__ = "Position: " + position.get().latitude + ", " + position.get().longitude;
    var tmp273 = mobl.ref(result__);
    subs__.addSub(mobl.ref(position, 'latitude').addEventListener('change', function() {
      tmp273.set("Position: " + position.get().latitude + ", " + position.get().longitude);
    }));
    subs__.addSub(mobl.ref(position, 'longitude').addEventListener('change', function() {
      tmp273.set("Position: " + position.get().latitude + ", " + position.get().longitude);
    }));
    
    var nodes333 = $("<span>");
    node94.append(nodes333);
    subs__.addSub((mobl.label)(tmp273, mobl.ref(null), mobl.ref(null), function(_, callback) {
      var root437 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root437); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes333;
      nodes333 = node.contents();
      oldNodes.replaceWith(nodes333);
    }));
    var result__ = mobl.window.get().innerHeight - 120;
    var tmp274 = mobl.ref(result__);
    subs__.addSub(mobl.ref(mobl.window, 'innerHeight').addEventListener('change', function() {
      tmp274.set(mobl.window.get().innerHeight - 120);
    }));
    
    var result__ = function(event, callback) {
                     if(event && event.stopPropagation) event.stopPropagation();
                     if(callback && callback.apply) callback(); return;
                   };
    var tmp276 = mobl.ref(result__);
    
    var result__ = new persistence.LocalQueryCollection([]);
    var tmp275 = mobl.ref(result__);
    
    var nodes334 = $("<span>");
    node94.append(nodes334);
    subs__.addSub((mobl.ui.googlemap.googleMap)(position, tmp275, mobl.ref(null), tmp274, mobl.ref(15), tmp276, function(_, callback) {
      var root438 = $("<span>");
      var subs__ = new mobl.CompSubscription();
      callback(root438); return subs__;
      return subs__;
    }, function(node) {
      var oldNodes = nodes334;
      nodes334 = node.contents();
      oldNodes.replaceWith(nodes334);
    }));
    
    
    
  } else {
    
    node94.append("Determining current location... (requires recent webkit or Firefox)");
    
  }
};
renderCond16();
subs__.addSub(tmp277.addEventListener('change', function() {
  renderCond16();
}));

callback(root434); return subs__;



return subs__;
};

demo.Person = persistence.define('demo__Person', {
'name': 'VARCHAR(255)',
'age': 'INT'
});

demo.Person.prototype.toString = function() {
                                     var __this = this;
                                    return __this.name;
                                  };
