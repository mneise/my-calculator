(ns my-calculator.core
  (:require [my.calc]))

(enable-console-print!)

(println (my.calc/add 5 5))
(println (my.calc/subtract 5 5))
