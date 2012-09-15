# hello-cljs-svg-raphael

This is my second SVG program.
It draws a circle by calling Raphael library functions from ClojureScript.
It is set up as a leiningen and Counterclockwise project (see @cemerick's video: http://www.youtube.com/watch?v=VVd4ow-ZcX0)

## Usage

Build: from a shell prompt anywhere within the project:

% lein repl

user=> (require 'cljs.closure)

user=> (cljs.closure/build "src/cljs"
       {:output-to "resources/public/hello.js"
       :optimizations :advanced
       :externs ["resources/jslib/raphael-externs.js"]})
       
Note that the externs file specifies the variable names that are not to be munged
by the Google Closure minification invoked by advanced optimization.
It gives them default definitions (not the real ones!).
       
View: open resources/public/hello.html in a browser.


## License

Distributed under the Eclipse Public License, the same as Clojure.
