package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	fmt.Printf("Hello World!")

	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter text: ")
	text, _ := reader.ReadString('\n')
	fmt.Println(text)
}
