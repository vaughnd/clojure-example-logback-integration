(defproject clojure-example-logback-integration "0.1.0-SNAPSHOT"
  :description "Simple integration of logback into clojure.tools.logging with macro-ed logs to swap in other logging libs"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.logging "0.2.4"]
                 [ch.qos.logback/logback-classic "1.0.7"]]
  :main clojure-example-logback-integration.core)
