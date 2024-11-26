package main

import "killerapp/superservice"

type MyInterface interface {
	DoPrint()
}

func main() {
	superservice.Doprint()
	println("Hello World")

	myNumbers := []int{1, 2, 3}

	for _, n := range myNumbers {
		println(n)
	}
}
