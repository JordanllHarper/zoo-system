package models

import java.time.LocalDateTime

data class CleaningRecord(val dataTime: LocalDateTime, val staffWhoCleaned : MutableList<Staff>) {

}
