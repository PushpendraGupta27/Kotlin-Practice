// Check if a number is even or odd
private fun evenOrOdd() {
    print("Input: ")
    val num = readln().toInt()
    when {
        num % 2 == 0 -> print("Number is even")
        else -> print("Number is odd")
    }
}

// Determine if a given year is a leap year
private fun leapYear() {
    print("Input: ")
    val num = readln().toInt()
    when {
        num % 4 == 0 && num % 100 != 0 || num % 400 == 0 -> print("Is a leaf year")
        else -> print("Is not a leaf year")
    }
}

// Check if a number is positive, negative, or zero
private fun checkNum() {
    print("Input: ")
    val num = readln().toInt()
    when {
        num > 0 -> print("Positive number.")
        num < 0 -> print("Negative number.")
        else -> print("Number is zero")
    }
}

// Find the greatest of three numbers
private fun greatestOfThree() {
    print("Enter first num: ")
    val num1 = readln().toInt()
    print("Enter second num: ")
    val num2 = readln().toInt()
    print("Enter third num: ")
    val num3 = readln().toInt()
    when {
        num1 > num2 && num1 > num3 -> print("$num1 is greater than $num2 and $num3")
        num2 > num1 && num2 > num3 -> print("$num2 is greater than $num1 and $num3")
        num3 > num2 && num3 > num1 -> print("$num3 is greater than $num1 and $num2")
    }
}

// Check if a triangle is equilateral, isosceles, or scalene
private fun checkTriangle() {
    print("Enter first side: ")
    val side1 = readln().toInt()
    print("Enter second side: ")
    val side2 = readln().toInt()
    print("Enter third side: ")
    val side3 = readln().toInt()
    when {
        side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 -> print("Not a Triangle")
        side1 == side2 && side2 == side3 -> print("Triangle is Equilateral.")
        side1 == side2 || side2 == side3 || side1 == side3 -> print("Triangle is Isosceles.")
        else -> print("Triangle is Scalene.")
    }
}

// Check if a number is prime
private fun checkPrime() {
    print("Enter a number: ")
    val num = readln().toInt()
    var isPrime = true

    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2..<num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime)
        print("$num is a Prime number")
    else
        print("$num is not a Prime number")
}

// Find the factorial of a number
private fun checkFactorial() {
    print("Enter a number: ")
    val num = readln().toInt()
}


fun main() {
//    evenOrOdd()
//    leapYear()
//    checkNum()
//    greatestOfThree()
//    checkTriangle()
//    checkPrime()
}