(ns clojure-example-logback-integration.log
  (:require [clojure.tools.logging :as log]))

(defn set-log-level!
  "Pass keyword :error :info :debug"
  [level]
  (let [logger (logimpl/get-logger log/*logger-factory* "clojure-example-logback-integration")]
    (case level
      :debug (.setLevel logger Level/DEBUG)
      :info (.setLevel logger Level/INFO)
      :error (.setLevel logger Level/ERROR))))

(defmacro debug [& args]
  `(log/debug (str ~@args)))

(defmacro info [& args]
  `(log/info (str ~@args)))

(defmacro warn [e & args]
  `(log/warn (str ~@args) ~e))

(defmacro warn [& args]
  `(log/warn (str ~@args)))

(defmacro error [& args]
  `(log/error (str ~@args)))

(defmacro error [e & args]
  `(log/error ~e (str ~@args)))

