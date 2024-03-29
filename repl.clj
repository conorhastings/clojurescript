(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.browser)

(cljs.build.api/build "."
  {:main 'hello-world.core
   :output-to "out/main.js"
   :verbose true})

(cljs.repl/repl (cljs.repl.browser/repl-env)
  :watch "."
  :output-dir "out")