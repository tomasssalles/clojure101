(ns fizz-buzz)

(defn fizz_buzz [] (map str (range 1 101)))

(defn -main []
  (dorun (map println (fizz_buzz))))
