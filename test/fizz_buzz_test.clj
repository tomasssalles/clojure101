(ns fizz-buzz-test
  (:require
    [clojure.test :refer :all]
    [fizz-buzz :refer :all]))

(deftest returns_sequence
  (let [lazy_result (fizz_buzz)]
    (is (sequential? lazy_result))
    (let [vec_result (vec lazy_result)]
      (is (= (count vec_result) 100))
      (is (= (first vec_result) "1")))))
