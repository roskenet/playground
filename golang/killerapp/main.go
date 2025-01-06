package main

import "killerapp/superservice"

type MyInterface interface {
	DoPrint()
}

func main() {
	superservice.Doprint()
	println("Hello World")

	funWithSlices()
	funWithMaps()

	type myStruct struct {
		a string
		b int
	}

	myStructInstance := myStruct{
		a: "",
		b: 0,
	}

	println(myStructInstance.a)
}

func funWithMaps() {
	myMap := map[string][]string{}

	for k, v := range myMap {
		println(k, v)
	}
}

func funWithSlices() {
	// a slice:
	myNumbers := []int{1, 2, 3}
	myOtherNumbers := []int{42}

	myNumbers = append(myNumbers, myOtherNumbers...)
	myNumbers = append(myNumbers, len(myNumbers))

	for _, n := range myNumbers {
		println(n)
	}
}
