import models.Animal
import models.Enclosure
import models.Staff
import repos.AnimalRepo


val animalRepo = AnimalRepo(mutableListOf())
val staffRepo = AnimalRepo(mutableListOf())
val enclosureRepo = AnimalRepo(mutableListOf())


fun main() {

    menu()


}


fun menu() {


    while (true) {
        println(
            """
        Press 1 to add an animal
        Press 2 to delete an animal
        Press 3 to view animals in an enclosure
        Press 4 to exit
        
    """.trimIndent()
        )

        val userInput = readln()

        when (userInput.trim()) {
            "1" -> addAnimal()
            "2" -> deleteAnimal()
            "3" -> viewAnimalsInAnEnclosure()
            "4" -> break
        }
    }

}


fun addAnimal() {
    //would be implemented
}


fun deleteAnimal() {
    //would be implemented
}


fun viewAnimalsInAnEnclosure() {
    //would be implemented
}