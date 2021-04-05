(ns fizz-buzz)

(defn fizz_buzz []
  (for [x (range 1 101)]
    (case [(zero? (rem x 3)) (zero? (rem x 5))]
      [true true] "FizzBuzz"
      [true false] "Fizz"
      [false true] "Buzz"
      (str x))))

(defn -main []
  (dorun (map println (fizz_buzz))))
