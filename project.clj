(defproject exoscale/clj-yaml "0.5.6"
  :description "YAML encoding and decoding for Clojure using SnakeYAML"
  :url "https://github.com/exoscale/clj-yaml"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :plugins [[lein-ancient "0.6.15"]]
  :dependencies
  [[org.clojure/clojure "1.9.0"]
   [org.yaml/snakeyaml "1.19"]
   [org.flatland/ordered "1.5.6"]]
  :global-vars {*warn-on-reflection* true})
