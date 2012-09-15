(ns hello-cljs-svg-raphael.core)

(.write js/document "<h1>My second SVG</h1>")

(let [paper (js/Raphael. 10 50 200 200)
      circle (. paper (circle 100 50 40))]
  (. circle (attr "stroke" "black"))
  (. circle (attr "stroke-width" 2))
  (. circle (attr "fill" "red")))