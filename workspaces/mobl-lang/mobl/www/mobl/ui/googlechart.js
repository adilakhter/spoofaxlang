mobl.provides('mobl.ui.googlechart');
mobl.provides('mobl.ui.googlechart');
mobl.provides('mobl');
mobl.ui.googlechart.googleChartUrl = function(type, data, title, size, barWidth, seriesColors, permittedValues, visibleAxes, axisRanges, fills, labels, extraAttrs) {
   var __this = this;
  var url = "empty.png";
  
  var base = "http://chart.apis.google.com/chart?";
  
  var params = [];
  
  params.push(new mobl.Tuple("cht", type));
  params.push(new mobl.Tuple("chtt", title));
  params.push(new mobl.Tuple("chs", "" + size._1 + "x" + size._2));
  var _data = [];
  
  var coll29 = data;
  var length0 = coll29.length;
  for(var i29 = 0; i29 < length0; i29++) {
    var serie;
    serie = coll29.get(i29);
    _data.push(mobl.ui.googlechart.separateby(",", serie));
  }
  params.push(new mobl.Tuple("chd", "t:" + mobl.ui.googlechart.separateby("|", _data)));
  if(seriesColors != null) {
    var _seriesColors = [];
    
    var coll30 = seriesColors;
    var length1 = coll30.length;
    for(var i30 = 0; i30 < length1; i30++) {
      var seriesColor;
      seriesColor = coll30.get(i30);
      _seriesColors.push(mobl.ui.googlechart.separateby("|", seriesColor));
    }
    params.push(new mobl.Tuple("chco", mobl.ui.googlechart.separateby(",", _seriesColors)));
  } else {
    
  }
  if(permittedValues == null) {
    permittedValues = [];
    var i = 0;
    
    var coll31 = data;
    var length2 = coll31.length;
    for(var i31 = 0; i31 < length2; i31++) {
      var serie;
      serie = coll31.get(i31);
      var min = null;
      
      var max = null;
      
      var tmp146 = mobl.ui.googlechart.minmax(serie);
      
      min = tmp146._1;
      max = tmp146._2;
      if(min > 0) {
        min = 0;
      } else {
        
      }
      permittedValues.push(new mobl.Tuple(min, max));
      i = i + 1;
    }
  } else {
    
  }
  var _permittedValues = [];
  
  var coll32 = permittedValues;
  var length3 = coll32.length;
  for(var i32 = 0; i32 < length3; i32++) {
    var permittedValue;
    permittedValue = coll32.get(i32);
    _permittedValues.push("" + permittedValue._1 + "," + permittedValue._2);
  }
  params.push(new mobl.Tuple("chds", mobl.ui.googlechart.separateby(",", _permittedValues)));
  if(barWidth != null) {
    params.push(new mobl.Tuple("chbh", barWidth._1 + "," + barWidth._2 + "," + barWidth._3));
  } else {
    params.push(new mobl.Tuple("chbh", "a"));
  }
  if(visibleAxes != null) {
    params.push(new mobl.Tuple("chxt", mobl.ui.googlechart.separateby("|", visibleAxes)));
  } else {
    
  }
  if(axisRanges == null) {
    axisRanges = [];
    var i = 0;
    
    var coll33 = data;
    var length4 = coll33.length;
    for(var i33 = 0; i33 < length4; i33++) {
      var serie;
      serie = coll33.get(i33);
      var min = null;
      
      var max = null;
      
      var tmp147 = mobl.ui.googlechart.minmax(serie);
      
      min = tmp147._1;
      max = tmp147._2;
      if(min > 0) {
        min = 0;
      } else {
        
      }
      axisRanges.push(new mobl.Tuple(i, min, max, null));
      i = i + 1;
    }
  } else {
    
  }
  var _axisRanges = [];
  
  var coll34 = axisRanges;
  var length5 = coll34.length;
  for(var i34 = 0; i34 < length5; i34++) {
    var axisRange;
    axisRange = coll34.get(i34);
    _axisRanges.push("" + axisRange._1 + "," + axisRange._2 + "," + axisRange._3 + (axisRange._4 == null ? "" : "," + axisRange._4));
  }
  params.push(new mobl.Tuple("chxr", mobl.ui.googlechart.separateby("|", _axisRanges)));
  if(fills != null) {
    var _fills = [];
    
    var coll35 = fills;
    var length6 = coll35.length;
    for(var i35 = 0; i35 < length6; i35++) {
      var fill;
      fill = coll35.get(i35);
      _fills.push(fill._1 + "," + fill._2 + "," + fill._3);
    }
    params.push(new mobl.Tuple("chf", mobl.ui.googlechart.separateby("|", _fills)));
  } else {
    
  }
  if(labels != null) {
    var _labels = [];
    
    var coll36 = labels;
    var length7 = coll36.length;
    for(var i36 = 0; i36 < length7; i36++) {
      var index;var lbls;
      var tmp148 = coll36.get(i36);
      index = tmp148._1;lbls = tmp148._2;
      _labels.push("" + index + ":|" + mobl.ui.googlechart.separateby("|", lbls));
    }
    params.push(new mobl.Tuple("chxl", mobl.ui.googlechart.separateby("|", _labels)));
  } else {
    
  }
  if(extraAttrs != null) {
    var coll37 = extraAttrs;
    var length8 = coll37.length;
    for(var i37 = 0; i37 < length8; i37++) {
      var attr;
      attr = coll37.get(i37);
      params.push(attr);
    }
  } else {
    
  }
  var paramlist = [];
  
  var coll38 = params;
  var length9 = coll38.length;
  for(var i38 = 0; i38 < length9; i38++) {
    var param;
    param = coll38.get(i38);
    paramlist.push(param._1 + "=" + param._2);
  }
  url = base + mobl.ui.googlechart.separateby("&", paramlist);
  return url;
};

mobl.ui.googlechart.separateby = function(sep, arr) {
   var __this = this;
  var result = "";
  
  var coll39 = arr;
  var length10 = coll39.length;
  for(var i39 = 0; i39 < length10; i39++) {
    var s;
    s = coll39.get(i39);
    result = result + s + sep;
  }
  return result.slice(0, -1 * sep.length);
};

mobl.ui.googlechart.minmax = function(data) {
   var __this = this;
  var max = null;
  
  var min = null;
  
  var coll40 = data;
  var length11 = coll40.length;
  for(var i40 = 0; i40 < length11; i40++) {
    var value;
    value = coll40.get(i40);
    max = (max == null || value > max) ? value : max;
    min = (min == null || value < min) ? value : min;
  }
  return new mobl.Tuple(min, max);
};

