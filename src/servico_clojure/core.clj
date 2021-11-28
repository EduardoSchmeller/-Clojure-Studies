(ns servico-clojure.core
  (:require
    [clojure.data.json :as json])
  (:gen-class))

;;Codigo desenvolvido em jornada de aprendizado Clojure
;; Executar as funcoes inviduais para teste.


(defn funcao-cep-full
  [full]
  (json/read-json (slurp "https://api.findcep.com/v1/cep/" full ".json")))


(defn get-rua-from-cep
  [logradouro]
  (def logradouro-data
    (json/read-json (slurp (str "https://api.findcep.com/v1/cep/" logradouro ".json"))))
      (str (get logradouro-data :logradouro)))


(defn get-bairro-from-cep
  [bairro]
  (def bairro-data
    (json/read-json
      (slurp (str "https://api.findcep.com/v1/cep/" bairro ".json"))))
         (str (get bairro-data :bairro)))

(defn get-cidade-from-cep
  [cidade]
  (def cidade-data
    (json/read-json
      (slurp (str "https://api.findcep.com/v1/cep/" cidade ".json"))))
        (str (get cidade-data :cidade)))

(defn get-tipo-from-cep
  [tipo]
  (def tipo-data
    (json/read-json (slurp (str "https://api.findcep.com/v1/cep/" tipo ".json"))))
      (str (get tipo-data :tipo)))

(defn get-codigo-ibje-from-cep
  [codigo-ibje]
  (def ibje-data
    (json/read-json (slurp (str "https://api.findcep.com/v1/cep/" codigo-ibje ".json"))))
      (str (get ibje-data :codigo_ibje)))

(defn get-uf-from-cep
  [uf]
  (def uf-data
    (json/read-json (slurp (str "https://api.findcep.com/v1/cep/" uf ".json"))))
      (str (get uf-data :uf)))


;; area de invocacao das funcoes
;; insira cep para teste


(println (funcao-cep-full "83055020"))
(println (get-rua-from-cep "83065020"))
(println (get-bairro-from-cep "83065290"))
(println (get-cidade-from-cep "83065290"))
(println (get-tipo-from-cep "83065290"))
(println (get-codigo-ibje-from-cep "83065290"))
(println (get-uf-from-cep "83065290"))





