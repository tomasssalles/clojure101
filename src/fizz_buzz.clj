(ns fizz-buzz)

(defn fizz_buzz []
  (for [x (range 1 101)]
    (condp #(zero? (rem %2 %1)) x
      15 "FizzBuzz"
      3 "Fizz"
      5 "Buzz"
      (str x))))

(defn -main []
  (dorun (map println (fizz_buzz))))
