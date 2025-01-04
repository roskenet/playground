package eachcons

import "fmt"

func RunEachConsTest() {
	fmt.Println("EachCons")
	arr := []int{3, 5, 8, 13}

	res := EachCons(arr, 1)

	fmt.Println(res)
}

func EachCons(arr []int, n int) [][]int {
	return [][]int{}
}
