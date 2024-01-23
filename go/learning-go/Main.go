package main

import "fmt"

func main() {

	var x = -3
	var isOdd = x%2 == 1

	fmt.Println("isOdd ist: ", isOdd)

	// The % operator is defined as:
	// A a elem Z, A b elem N
	// (a / b) * b + (a % b) == a
}
