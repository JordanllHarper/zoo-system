package models

import java.time.LocalDateTime

data class FeedingRecord(val dateTimeOfFeeding: LocalDateTime, val staffWhoFed : MutableList<Staff>) {

}