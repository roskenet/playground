package eachcons

import "fmt"

// https://www.codewars.com/kata/545af3d185166a3dec001190/train/go
// https://www.codewars.com/kata/545af3d185166a3dec001190/solutions/go

func RunEachConsTest() {
	fmt.Println("EachCons")
	arr := []int{3, 5, 8, 13, 16}

	res := EachCons(arr, 3)

	fmt.Println(res)
}

func EachCons(arr []int, n int) [][]int {

	outerArr := [][]int{}

	for idx := 0; idx < len(arr); idx++ {
		if len(arr)-idx >= n {
			innerArr := []int{}
			for idx2 := 0; idx2 < n; idx2++ {
				innerArr = append(innerArr, arr[idx+idx2])
			}
			outerArr = append(outerArr, innerArr)
		}
	}

	return outerArr
}
