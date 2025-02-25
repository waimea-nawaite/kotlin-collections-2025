/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList")
    println()

    // Create our list
    val snacks = mutableListOf<String>()

    //show it
    println(snacks)

    //add in some things
    snacks.add("Chocolate")
    snacks.add("MarshMallows")
    snacks.add("Maccas")
    snacks.add("Skittles")
    snacks.add("Moro Gold")
    println(snacks)

    //show specific items
    println(snacks[0])
    //println(snacks[3]) This would be out of bounds

    //change a value
    snacks[1] = "Cream"
    println(snacks)

    //Remove and item
    snacks.removeAt(2)
    println(snacks)

    //Add in new items in specific places
    snacks.add(1,"Mars Bar")

    //sort the list
    snacks.sort()
    println(snacks)

    //Shuffle the list (randomise it)
    snacks.shuffle()
    println(snacks)

    //Get a random item from list
    val item = snacks.random()
    println(item)

    //searching for an item
    println("Skittles is in the list: ${snacks.contains("Skittles")}")
    println("Moro Gold is in the list: ${snacks.contains("Moro Gold")}")

    //Getting index of an item
    println("Skittles index: ${snacks.indexOf("Skittles")}")
    println("Moro Gold index: ${snacks.indexOf("Moro Gold")}")

    //loop through the list
    for (snack in snacks) {
        println(snack)
    }

    //loop using an index
    for(i in 0..< snacks.size) {
        println("$i: ${snacks[i]} ")
    }
    //loop getting index and values
    for((i,snack) in snacks.withIndex()) {
        println("$i: $snack")
    }
}

