(defproject org.iplantc/mescal "0.1.1"
  :description "A Clojure client library for the Agave API."
  :url "https://github.com/iPlantCollaborativeOpenSource/mescal"
  :license {:name "BSD Standard License"
            :url "http://www.iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :scm {:connection "scm:git:git@github.com:iPlantCollaborativeOpenSource/kameleon.git"
        :developerConnection "scm:git:git@github.com:iPlantCollaborativeOpenSource/kameleon.git"
        :url "git@github.com:iPlantCollaborativeOpenSource/kameleon.git"}
  :pom-addition [:developers
                 [:developer
                  [:url "https://github.com/orgs/iPlantCollaborativeOpenSource/teams/iplant-devs"]]]
  :classifiers [["javadoc" :javadoc]
                ["sources" :sources]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.3.1"]
                 [clj-http "0.9.1"]
                 [com.cemerick/url "0.1.1"]]
  :repositories [["sonatype-nexus-snapshots"
                  {:url "https://oss.sonatype.org/content/repositories/snapshots"}]]
  :deploy-repositories [["sonatype-nexus-staging"
                         {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"}]])
