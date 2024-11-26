package kata.revrot

import jdk.internal.joptsimple.internal.Strings
import kotlin.test.Test
import kotlin.test.assertEquals

// https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/train/kotlin
// The input is a string str of digits.
// Cut the string into chunks (a chunk here is a substring of the initial string)
// of size sz (ignore the last chunk if its size is less than sz).

// If the sum of a chunk's digits is divisible by 2,
// reverse that chunk; otherwise rotate it to the left by one position.
// Put together these modified chunks and return the result as a string.

fun revRot(nums: String, sz: Int): String {

//        var s = "733049910872815764"
    var accu = ""
    nums.chunked(sz) {
        if (it.map { it.toInt() }.sum() % 2 == 0) {
            accu += it.reversed()
        }
        else {
            accu = accu.plus(it.subSequence(0, it.length -1)) + it[it.length -1]
        }
//            accu = accu.plus(it.subSequence(0, it.length - 1)).plus(it.get(it.length - 1))
    }

    return accu
}

class revrotMainTest {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test1() {
        println("Fixed Tests: revRot")
        var s = "733049910872815764"
        testing(revRot(s, 5), "330479108928157")
        s = "73304991087281576455176044327690580265896"
        testing(revRot(s, 8), "1994033775182780067155464327690480265895")
        s = "73304991087281576455176044327690580265896896028"
        testing(revRot(s, 8), "1994033775182780067155464327690480265895")
    }
}
