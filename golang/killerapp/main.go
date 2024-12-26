package main

import "killerapp/superservice"

type MyInterface interface {
	DoPrint()
}

func main() {
	superservice.Doprint()
	println("Hello World")

	// a slice:
	myNumbers := []int{1, 2, 3}
	myNumbers = append(myNumbers, 4)

	for _, n := range myNumbers {
		println(n)
	}
}
