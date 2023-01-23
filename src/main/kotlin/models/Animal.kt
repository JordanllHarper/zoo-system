package models

import java.time.LocalDateTime

data class Animal(
    val genderString: String,
    val birthDate: LocalDateTime,
    val species: String,
    val typeString: String,
    val mother: Animal?,
    val father: Animal?,
    val children: MutableList<Animal>,
    val feedingRecords: MutableList<FeedingRecord>
) {

    val type = AnimalType.UNKNOWN
        get() {
            when (typeString.lowercase()) {
                "mammal" -> AnimalType.MAMMAL
                "reptile" -> AnimalType.REPTILE
                "bird" -> AnimalType.BIRD

            }

            return field
        }


    val gender = AnimalGender.UNKNOWN
        get() {


            when (genderString.lowercase()) {
                "male" -> AnimalGender.MALE
                "female" -> AnimalGender.FEMALE
            }
            return field
        }


}