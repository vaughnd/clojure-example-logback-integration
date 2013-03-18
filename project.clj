(defproject clojure-example-logback-integration "0.1.0-SNAPSHOT"
  :description "Simple integration of logback into clojure.tools.logging with macro-ed logs to swap in other logging libs"
  :url "http://github.com/vaughnd/clojure-example-logback-integration"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ch.qos.logback/logback-classic "1.0.9"]

                 ;; If you're using datomic or another library that
                 ;; pulls in other logging crud, you'll probably have
                 ;; to experiment with exclusions to get the behaviour
                 ;; you expect.
                 ;;
                 ;; This example gets the Datomic peer to use logback.
                 ;; See: http://docs.datomic.com/configuring-logging.html
                 ;;
                 ;; [com.datomic/datomic-free "0.8.3848" :exclusions [org.slf4j/slf4j-nop
                 ;;                                                   org.slf4j/slf4j-log4j12]]
                 ]
  :main clojure-example-logback-integration.core)
