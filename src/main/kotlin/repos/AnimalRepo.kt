package repos

import models.Animal
import models.AnimalType

data class AnimalRepo(val animalList: MutableList<Animal>) {


    fun getAmountOfAnimals() = animalList.size
    fun getAmountOfMammals(animalType: AnimalType): Int {

        var counter = 0

        animalList.forEach { animal ->

            if (animal.type == animalType) {
                counter++
            }
        }

        return counter
    }
}