package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        val days = day.toInt()
        val months = month.toInt()
        val years = year.toInt()

        val formatPattern = DateTimeFormatter.ofPattern("dd MMMM, eeee")
            .withLocale(Locale.forLanguageTag("Ru"))
        return try {
            LocalDate.of(years, months, days).format(formatPattern)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
    }

