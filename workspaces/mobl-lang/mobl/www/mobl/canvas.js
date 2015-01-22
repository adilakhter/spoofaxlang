mobl.provides('mobl.canvas');
mobl.provides('mobl.canvas');
mobl.provides('mobl');
(function(__ns) {
mobl.canvas.canvas = function(g, width, height, ontouchstart, ontouchmove, ontouchend, onkeyup, elements, callback) {
                       var root408 = $("<span>");
                       var node232 = $("<canvas >");
                       g.set(node232[0].getContext('2d'));
                       var ref121 = width;
                       if(ref121.get() !== null)
                       {
                         node232.attr('width', ref121.get());
                         ref121.addEventListener('change', function(_, ref, val) {
                                                             if(ref === ref121)
                                                             {
                                                               node232.attr('width', val);
                                                             }
                                                             else
                                                             {
                                                               console.log("Garbage!");
                                                             }
                                                           });
                       }
                       ref121.rebind();
                       var ref122 = height;
                       if(ref122.get() !== null)
                       {
                         node232.attr('height', ref122.get());
                         ref122.addEventListener('change', function(_, ref, val) {
                                                             if(ref === ref122)
                                                             {
                                                               node232.attr('height', val);
                                                             }
                                                             else
                                                             {
                                                               console.log("Garbage!");
                                                             }
                                                           });
                       }
                       ref122.rebind();
                       var val92 = ontouchstart.get();
                       if(val92 !== null)
                       {
                         node232.bind('touchdown', val92);
                       }
                       var val93 = ontouchmove.get();
                       if(val93 !== null)
                       {
                         node232.bind('touchdrag', val93);
                       }
                       var val94 = ontouchend.get();
                       if(val94 !== null)
                       {
                         node232.bind('touchup', val94);
                       }
                       var val95 = onkeyup.get();
                       if(val95 !== null)
                       {
                         node232.bind('keyup', val95);
                       }
                       root408.append(node232);
                       callback(root408);
                       return;
                     };
mobl.canvas.loadImage = function(url) {
                          var img = new Image();
                          img.src = url;
                          return img;
                        };
}(mobl.canvas));