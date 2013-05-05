(ns leiningen.new.cascalog-cdh
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "cascalog-cdh"))

(defn cascalog-cdh
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["project.clj" (render "project.clj" data)]
["README.md" (render "README.md" data)]
[".gitignore" (render "gitignore" data)]
["test/clj/{{sanitized}}/test.clj" (render "test.clj" data)]
["src/clj/{{sanitized}}/core.clj" (render "core.clj" data)]
)))
