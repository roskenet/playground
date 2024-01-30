package main

import (
	"fmt"
	"myapp.roskenet.de/subdir"
)

func main() {

	elvis := new(subdir.Singer)
	//elvis.Name = "Elvis Presley"
	elvis.Song = "Jailhouse Rock"

	fmt.Printf("%s sings %s", elvis.Name, elvis.Song)

}
