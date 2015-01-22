mobl.provides('mobl.location');
mobl.provides('mobl.location');
mobl.provides('mobl');
mobl.location.Coordinates = mobl.defineType('mobl.location.Coordinates', null, {latitude: null,longitude: null,accuracy: null});

(function(__ns) {
__ns.isLocationSupported = function() {
                             return !!navigator.geolocation;
                           };
__ns.getPosition = function(highAccuracy, callback) {
                     if(navigator.geolocation)
                     {
                       navigator.geolocation.getCurrentPosition(function(position) {
                                                                  callback({
                                                                             latitude: position.coords.latitude,
                                                                             longitude: position.coords.longitude,
                                                                             accuracy: position.coords.accuracy
                                                                           });
                                                                }, function() {
                                                                     callback(null);
                                                                   }, {
                                                                        enableHighAccuracy: highAccuracy
                                                                      });
                     }
                     else
                     {
                       callback(null);
                     }
                   };
}(mobl.location));