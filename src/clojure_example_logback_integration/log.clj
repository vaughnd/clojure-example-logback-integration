(ns clojure-example-logback-integration.log
  (:require [clojure.tools.logging :as log]))

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

