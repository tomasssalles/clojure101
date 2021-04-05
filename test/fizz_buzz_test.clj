(ns fizz-buzz-test
  (:require
    [clojure.test :refer :all]
    [fizz-buzz :refer :all]))

(deftest test_fizz_buzz
  (let [lazy_result (fizz_buzz)]
    (is (sequential? lazy_result))
    (let [vec_result (vec lazy_result)]
      (is (= 100 (count vec_result)))
      (dorun
        (for [
              n (range 15 101 15)
              :let [i (dec n)]]
          (is (= "FizzBuzz" (get vec_result i)) n)))
      (dorun
        (for [
              n (range 3 101 3)
              :let [i (dec n)]
              :when (not (zero? (rem n 5)))]
          (is (= "Fizz" (get vec_result i)) n)))
      (dorun
        (for [
              n (range 5 101 5)
              :let [i (dec n)]
              :when (not (zero? (rem n 3)))]
          (is (= "Buzz" (get vec_result i)) n)))
      (dorun
        (for [
              n (range 1 101)
              :let [i (dec n)]
              :when (not (or (zero? (rem n 3)) (zero? (rem n 5))))]
          (is (= (str n) (get vec_result i)) n))))))
