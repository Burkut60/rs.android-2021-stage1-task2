package subtask2

import java.lang.StringBuilder

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {

        val strUpper = a.toUpperCase()
        val strToArrayA = strUpper.toCharArray()
        val strToArrayB = b.toCharArray()

        val listResult = arrayListOf<String>()

        for (i in strToArrayA) {
            for (j in strToArrayB) {
                if (i == j) {
                    listResult.add(i.toString())
                }
            }
        }
        val builder = StringBuilder()
        for (a in listResult) {
            builder.append(a)
        }
        return if (builder.toString() == b) {
            "YES"
        } else {
            "NO"
        }
    }
}
