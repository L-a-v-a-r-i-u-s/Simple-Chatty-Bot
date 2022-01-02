package bot

import java.util.Scanner


val scanner = Scanner(System.`in`)

fun main() {
    greet("LinDifUr", "2021")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    val question = "What is my favorite game?"
    val answers = mapOf("1. Warcraft" to 1, "2. Heroes of the storm" to 2, "3. Diablo 3" to 3, "4. Gwent" to 4)
    println(question)
    answers.forEach { println(it.key) }
    while (true){
        val answer = scanner.nextInt()
        if (answer == answers["1. Warcraft"]) break
        else println("Please, try again.")
    }
}

fun end() {
    println("Congratulations, have a nice day!")
}
