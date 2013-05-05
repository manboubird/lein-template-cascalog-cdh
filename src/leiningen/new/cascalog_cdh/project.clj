(defproject {{ns-name}} "0.1.0"
  :description "TODO: Project Description."
  :source-paths ["src/clj"]
  :jvm-opts ["-Xmx768m" "-server"]
  :aot :all
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cascalog "1.10.1"]]
  :profiles {:dev {:dependencies [[lein-midje "3.0.1"]
                                  [cascalog/midje-cascalog "1.10.1"]]}
             :provided {:dependencies [[org.apache.hadoop/hadoop-core "0.20.2-cdh3u2"]]}}
  :repositories [["conjars.org" "http://conjars.org/repo"]
                 ["cloudera" "https://repository.cloudera.com/content/groups/public/"]]
  )
