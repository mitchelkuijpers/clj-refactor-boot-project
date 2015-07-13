(ns test.core
  (:require [test.bar :as foo]))

(defn add [a b] (foo/plus a b))
