package main

import "killerapp/superservice"

type MyInterface interface {
	DoPrint()
	DoSomethingElse()
}

type MyOwnInt int

func (m MyOwnInt) DoPrint() {
	println(m)
}

func (m MyOwnInt) DoSomethingElse() {
	println(m)
}

func experiment(i MyInterface) {
	i.DoPrint()
}

func playWithTypes() error {
	var i any
	println(i)

	//var myChar = i.(byte)

	return nil
}

func main() {
	superservice.Doprint()

	var myOwnInt MyOwnInt = 42
	var myOwnInt2 MyOwnInt = 43

	myOwnInt.DoPrint()

	ownInt := myOwnInt + myOwnInt2

	println(ownInt)

	// MyOwnInt implements DoPrint:
	experiment(myOwnInt)

	println("Hello World")

	// a slice:
	myNumbers := []int{1, 2, 3}
	myOtherNumbers := []int{42}
	myNumbers = append(myNumbers, myOtherNumbers...)

	for _, n := range myNumbers {
		println(n)
	}
}
