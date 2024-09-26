(ns workshop.core)

(defn my-func [a b]
    (print a (my-func b a) "\n")
    (print b (my-func a b) "\n"))

(my-func a b)