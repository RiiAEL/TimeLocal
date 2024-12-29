import java.time.LocalDateTime
import java.time.LocalTime

fun main() {
  val timeLocalandDate = LocalDateTime.now()
  println ("Current Date and Time is : $timeLocalandDate")
  
  val timeLocal = LocalTime.now()
  println ("Current Time is : $timeLocal")
}