(ns clojure-example-logback-integration.core
  (:require [clojure-example-logback-integration.log :as log]))

(defn -main
  [& args]
  (log/debug "Test debug log")
  (log/info "Test info log")
  (log/error "Test error log")
  (try (throw (Exception. "Error, error"))
       (catch Exception e (log/error e "Test exception logging")))
  (println "Check your logs!"))
