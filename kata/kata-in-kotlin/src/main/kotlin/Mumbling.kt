package kata.accum

import kotlin.test.Test
import kotlin.test.assertEquals

// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/kotlin

fun accum(s:String):String {
    return ""
}

class AccumulTest {

    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        println("Fixed Tests accum")
        testing(accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
        testing(accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")

    }
}
