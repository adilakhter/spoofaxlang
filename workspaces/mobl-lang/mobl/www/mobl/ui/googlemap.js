mobl.provides('mobl.ui.googlemap');
mobl.provides('mobl.ui.googlemap');
mobl.provides('mobl.location');
mobl.provides('mobl');
mobl.provides('mobl.ui');
mobl.ui.googlemap.waitUntilVisible = function(el, callback) {
  var __this = this;
  var result__ = !el.is(":visible");
  function oneIteration0() {
    mobl.sleep(200, function(result__) {
      
      if(!el.is(":visible")) oneIteration0(); else rest2();
      
    });
  }
  function rest2() {
    if(callback && callback.apply) callback(); return;
  }
  if(!el.is(":visible")) oneIteration0(); else rest2();
  
};


mobl.ui.googlemap.googleMap = function(coords, markers, width, height, zoom, onready, elements, callback) {
var root181 = $("<span>");
var subs__ = new mobl.CompSubscription();

var div = $("<div>");

var ref95 = mobl.ref((width.get() ? "width: " + width.get() + "px;" : "") + " height: " + height.get() + "px;");
if(ref95.get() !== null) {
  div.attr('style', ref95.get());
  subs__.addSub(ref95.addEventListener('change', function(_, ref, val) {
    div.attr('style', val);
  }));
  subs__.addSub(width.addEventListener('change', function() {
    div.attr('style', (width.get() ? "width: " + width.get() + "px;" : "") + " height: " + height.get() + "px;");
  }));
  subs__.addSub(height.addEventListener('change', function() {
    div.attr('style', (width.get() ? "width: " + width.get() + "px;" : "") + " height: " + height.get() + "px;");
  }));
  
}
subs__.addSub(ref95.rebind());

root181.append(div);

var map = mobl.ref(null);

var addMarkers = function(callback) {
  var __this = this;
  var result__ = [];
  map.get()._markers = result__;
  var result__ = markers.get();
  markers.get().list(function(coll41) {
    coll41 = coll41.reverse();
    function processOne2() {
      var marker;
      marker = coll41.pop();
      var result__ = map.get()._markers.push(map.get().addMarker(marker));
      
      if(coll41.length > 0) processOne2(); else rest3();
      
    }
    function rest3() {
      if(callback && callback.apply) callback(); return;
    }
    if(coll41.length > 0) processOne2(); else rest3();
  });
  
};


mobl.ui.googlemap.waitUntilVisible(div, function(result__) {
  var tmp149 = result__;
  var result__ = mobl.ui.googlemap.createMap(div, coords.get(), zoom.get());
  map.set(result__);
  addMarkers(function(result__) {
    var tmp150 = result__;
    var result__ = mobl.dyn(markers.get()).addEventListener("change", function(event, callback) {
                              if(event && event.stopPropagation) event.stopPropagation();
                              var result__ = map.get()._markers;
                              map.get()._markers.list(function(coll42) {
                                coll42 = coll42.reverse();
                                function processOne3() {
                                  var marker;
                                  marker = coll42.pop();
                                  var result__ = marker.setMap(null);
                                  
                                  if(coll42.length > 0) processOne3(); else rest4();
                                  
                                }
                                function rest4() {
                                  addMarkers(function(result__) {
                                    var tmp152 = result__;
                                    if(callback && callback.apply) callback(); return;
                                  });
                                }
                                if(coll42.length > 0) processOne3(); else rest4();
                              });
                              
                            });
    function after15(result__) {
      var tmp151 = result__;
      
    }
    var result__ = onready.get()(null, after15);if(result__ !== undefined) after15(result__);
  });
});
callback(root181); return subs__;


return subs__;
};
mobl.ui.googlemap.MapMarker = mobl.defineType('mobl.ui.googlemap.MapMarker', null, {coords: null,title: null,infoHtml: null,onclick: null});

(function(__ns) {
__ns.createMap = function(div, coords, zoom) {
                   var latlng = new google.maps.LatLng(coords.latitude,coords.longitude);
                   var myOptions = {
                                     zoom: zoom,
                                     center: latlng,
                                     mapTypeId: google.maps.MapTypeId.ROADMAP
                                   };
                   var map = new google.maps.Map(div[0],myOptions);
                   return map;
                 };
__ns.showMarkerInfo = function(html, map, marker) {
                      };
google.maps.Map.prototype.addMarker = function(m) {
                                        var that = this;
                                        var marker = new google.maps.Marker({
                                                                              position: new google.maps.LatLng(m.coords.latitude,m.coords.longitude),
                                                                              title: m.title,
                                                                              map: this
                                                                            });
                                        if(m.infoHtml)
                                        {
                                          google.maps.event.addListener(marker, 'click', function() {
                                                                                           var infowindow = new google.maps.InfoWindow({
                                                                                                                                         content: m.infoHtml
                                                                                                                                       });
                                                                                           infowindow.open(that, marker);
                                                                                         });
                                        }
                                        else
                                        {
                                          if(m.onclick)
                                          {
                                            google.maps.event.addListener(marker, 'click', m.onclick);
                                          }
                                        }
                                        return marker;
                                      };
}(mobl.ui.googlemap));