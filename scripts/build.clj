(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'my-calculator.core
     :output-to "out/my_calculator.js"
     :output-dir "out"
     :foreign-libs [{:file "resources/libs/calculator.js"
                     :provides ["my.calc"]
                     :module-type :commonjs}]})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


