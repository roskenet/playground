package eachcons

import "fmt"

// https://www.codewars.com/kata/545af3d185166a3dec001190/train/go

func RunEachConsTest() {
	fmt.Println("EachCons")
	arr := []int{3, 5, 8, 13}

	res := EachCons(arr, 1)

	fmt.Println(res)
}

func EachCons(arr []int, n int) [][]int {

	for k, v := range arr {
		a1 := make([]int, n)
	}

	return [][]int{}
}
