(ns clj_ring.core
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  (let [result {:status 200
                :headers {"Content-Type" "text/plain"}
                :body "Hello World"}]
    result))


(jetty/run-jetty handler {:port 3000})