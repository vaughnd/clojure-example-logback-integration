# clojure-example-logback-integration

Example of how to integrate logback [http://logback.qos.ch] into clojure.tools.logging [https://github.com/clojure/tools.logging]. Also uses a log ns to delegate calls via macros so you can switch in timbre, etc.

Logback is powerful and configurable, and integrates well with a lot of existing Java frameworks, so it makes the ideal logging library for Clojure. 

Important parts are in project.clj, src/logback.xml, and log.clj. Project.clj needs to include the right dependencies. Logback.xml must be on your classpath, which means src/ or resources/ with lein.

## Usage

Test with 'lein run'

## License

Copyright © 2012 Vaughn Dickson

Distributed under the Eclipse Public License, the same as Clojure.
