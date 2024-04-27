(ns ssfmt.fmt
  (:require [clojure.string :as string]
            [clojure.pprint :refer [pprint]]))

(def  BOLD   "\033[1m")
(def  ITAL   "\033[3m")
(def  BLUE   "\033[0;34m")
(def  RED    "\033[0;31m")
(def  GREEN  "\033[0;32m")
(def  ORANGE "\033[0;33m")
(def  PURPLE "\033[0;35m")
(def  CYAN   "\033[0;36m")
(def  NC     "\033[0m")

(defn make-prefix
  [typ]
  (case typ
    :debug   (str PURPLE "[DEBUG]"   NC)
    :error   (str RED    "[ERROR]"   NC)
    :help    (str GREEN  "[HELP]"    NC)
    :hint    (str CYAN   "[HINT]"    NC)
    :info    (str BLUE   "[INFO]"    NC)
    :success (str GREEN  "[SUCCESS]" NC)
    :warn    (str RED    "[WARN]"    NC)
    (str NC)))

(defn spaces
  [n]
  (apply str (repeat n \space)))

(defn echo
  [typ & xs]
  (let [prefix (make-prefix typ)]
    (println (str prefix " " (string/join " " xs)))))

(defn pretty-clj
  [x]
  (with-out-str (pprint x)))
