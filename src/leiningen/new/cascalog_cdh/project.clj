(defproject {{ns-name}} "0.1.0"
  :description "TODO: Project Description."
  :source-paths ["src/clj"]
  :jvm-opts ["-Xmx768m" "-server"]
  :aot :all
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cascalog "1.10.2-mr1-cdh4.3.0"]]
  :profiles {:dev {:dependencies [[lein-midje "3.0.1"]
                                  [cascalog/midje-cascalog "1.10.2-mr1-cdh4.3.0"]]}
             :provided {:dependencies [[org.apache.hadoop/hadoop-core "2.0.0-mr1-cdh4.3.0"]]}}
  :repositories {"conjars.org" "http://conjars.org/repo"
                 "cloudera-releases" "https://repository.cloudera.com/artifactory/cloudera-repos"}
  )
