(require 'cljs.build.api)

(cljs.build.api/watch "."
  {:main 'hello-world.core
   :output-to "out/main.js"})