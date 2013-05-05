(ns {{ns-name}}.core-test
  (:use cascalog.api
        cascalog_cdh.core
        [midje sweet cascalog]))

(let [src [["truth"]]]
  (fact?<- "Sayings need a little juice to become wisdom."
           [["truth be here!"]]
           [?wisdom]
           (src ?saying)
           (str ?saying " be here!" :> ?wisdom)))

;; See https://github.com/sritchie/midje-cascalog for more information
;; on how to write tests for Cascalog jobs and modules.

