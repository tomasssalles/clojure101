(ns revstr_test
  (:require
    [clojure.test :refer :all]
    [revstr :refer :all]))

(deftest test_revstr
  (is (= "" (revstr "")))
  (is (= "abba" (revstr "abba")))
  (is (= "cba" (revstr "abc")))
  (is (= "éñ ädöbßaü" (revstr "üaßbödä ñé"))))
