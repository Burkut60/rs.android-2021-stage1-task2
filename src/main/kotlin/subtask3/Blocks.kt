package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    private var intElement = 0
    private var stringElement: String = ""
    private val myPattern = DateTimeFormatter.ofPattern("dd.MM.yyyy")
    private var date = LocalDate.parse("0001-01-01")

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        if (blockB == Int::class) {
            for (element in blockA) {
                if (element is Int) {
                    intElement += element
                }
            }
        }

        if (blockB == String::class) {
            for (element in blockA) {
                if (element is String) {
                    stringElement += element
                }
            }
        }

        if (blockB == LocalDate::class) {
            blockA.forEach { any:Any? ->
                when (any) {
                    is LocalDate -> if (any.isAfter(date)) date = any
                }
            }
        }

        return when (blockB) {
            Int::class -> intElement
            String::class -> stringElement
            LocalDate::class -> date.format(myPattern)
            else -> "incur losses"
        }
    }
}














