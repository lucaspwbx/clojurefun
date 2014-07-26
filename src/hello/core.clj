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

(defn teen?
  "Between 13 and 19"
  [x]
  (< 12 x 20))

(foo "bar")
(hello "teste")
(square 9)
(square 10)
(average 10 3)

(if "foo" "truthy" "falsey")
(if 0 "truthy" "falsey")
(if [] "truthy" "falsey")
(if false "truthy" "falsey")
(if nil "truthy" "falsey")

(boolean "foo")
(boolean nil)

(= "foo" "foo")
(= "foo" "bar")

(== 42 42)
(== 5.0 5)
(= 5.0 5)

(< 1 2)
(> 1 2)
(<= 52 2)

(teen? 12)
(teen? 13)
(teen? 15)
(teen? 19)
(teen? 20)

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(sign 2)
(sign -2)
(sign 0)

(defn divides? [x,y]
  (if (== 0 (quot x y))
    true
    false))

(divides? 2 4)
(divides? 4 2)
(divides? 5 10)
(divides? 2 5)

(defn super-sign [number]
  (cond
       (neg? number) "negative"
       (pos? number) "positive"
       :else         "zero"))

(super-sign 13)
(super-sign 0)
(super-sign -5)

(defn fizzbuzz [number]
  (cond
       (== 0 (mod number 15)) "gotcha!"
       (== 0 (mod number 3)) "fizz"
       (== 0 (mod number 5)) "buzz"
       :else ""))

(fizzbuzz 2)
(fizzbuzz 45)
(fizzbuzz 48)
(fizzbuzz 70)

(defn generic-doublificate [x]
  (cond
       (number? x) (* x 2)
       (empty? x) nil
       (or (list? x) (vector? x)) (* (count x) 2)
       :else true))

(generic-doublificate 1)
(generic-doublificate [1 2])
(generic-doublificate '(65 21))
(generic-doublificate {})
(generic-doublificate [])
(generic-doublificate {:a 1})

(and true true)
(and true false)

(or true false)
(or false false)

(not true)
(not false)

(let [x 42]
  (+ x x))

(defn hipotenusa [x y]
  (let [xx (* x x)
        yy (* y y)]
    (Math/sqrt (+ xx yy))))

(hipotenusa 2 10)

(Math/sqrt (+ 2 4))

(defn do-a-thing [x]
  (Math/pow (+ x x) (+ x x)))

(defn do-a-thing-dois [x]
  (let [xx (+ x x)]
  (Math/pow xx xx)))

(do-a-thing-dois 6)

(let [a 10
      b (+ a 8)]
  (+ a b))

[1 2 3]
[:foo 42 "bar" (+ 2 3)]

(get [:a :b :c] 1)

(let [a [1 2 3]]
      (count a))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(spiff [1 2 3])
(spiff [1 2 3 4 5 6])
(spiff [1 2])
(spiff [])

(defn spiff2 [v]
  (cond
       (> (count v) 2) (+ (get v 0) (get v 2))
       :else 0))

(spiff2 [1 2 3])
(spiff2 [1 2 3 4 5 6])
(spiff2 [1 2])
(spiff2 [])
