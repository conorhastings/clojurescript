(require 'cljs.build.api)

(cljs.build.api/build "."
  {:main 'hello-world.core
   :output-to "out/main.js"})