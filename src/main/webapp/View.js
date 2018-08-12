if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'View'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'View'.");
}
var View = function (_, Kotlin) {
  'use strict';
  var throwCCE = Kotlin.throwCCE;
  function initCanvas() {
    var tmp$, tmp$_0;
    var canvas = Kotlin.isType(tmp$ = document.getElementById('mainCanvas'), HTMLCanvasElement) ? tmp$ : throwCCE();
    var context = Kotlin.isType(tmp$_0 = canvas.getContext('2d'), CanvasRenderingContext2D) ? tmp$_0 : throwCCE();
    return canvas;
  }
  function setBackground() {
    var tmp$, tmp$_0;
    var canvas = Kotlin.isType(tmp$ = document.getElementById('mainCanvas'), HTMLCanvasElement) ? tmp$ : throwCCE();
    var context = Kotlin.isType(tmp$_0 = canvas.getContext('2d'), CanvasRenderingContext2D) ? tmp$_0 : throwCCE();
    context.save();
    context.fillStyle = '#5C7EED';
    context.fillRect(0.0, 0.0, 100.0, 100.0);
    context.restore();
  }
  _.initCanvas = initCanvas;
  _.setBackground = setBackground;
  Kotlin.defineModule('View', _);
  return _;
}(typeof View === 'undefined' ? {} : View, kotlin);
