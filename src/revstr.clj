(ns revstr)

(defn revstr [s]
  (apply str (reverse s)))
