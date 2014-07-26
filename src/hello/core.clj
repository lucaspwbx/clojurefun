(ns hello.core)

(defn -main
  "This should be prety simple."
  []
  (println "Hello World"))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn hello
  "Gives greetings."
  [who]
  (str "Hello, " who "!"))

(defn square
  "Square."
  [number]
  (* number number))

(defn average
  "Average."
  [x, y]
  (quot (* x y) 2))

(foo "bar")
(hello "teste")
(square 9)
(square 10)
(average 10 3)
