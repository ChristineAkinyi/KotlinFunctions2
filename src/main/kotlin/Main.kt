fun main() {
    printString("Barnie bakes brown bagels and buns")
    isPalindrome("Racecar")
    calculateVolume(7)
    doMath(arrayOf(1,2,3,4,5,6))
}

fun printString(sentence:String){
   var sentence = "Barnie bakes brown bagels and buns"
    println(listOf(sentence))

    }
//    var findChar =

//
//    sentence.forEach { x in sentence
//    }
//    var newSentence = sentence.split(",")

}

fun doMath(numbers:Array<Int>):Int{
    var numbers = arrayOf(1,2,3,4,5,6,)
    var a = numbers[0]
    var b = numbers[1]
    var c = numbers[2]
    var d = numbers[3]
    var e = numbers[4]
    var f = numbers[5]
    var sum = a+b+c+d+e+f
    return sum

    var numbersLength = numbers.count()
    return numbersLength

    var avgNumbers = sum/numbersLength
    return avgNumbers

}

fun calculateVolume(radius:Int){
    var volumeSphere = 4/3 * 3.14159 * (radius*radius*radius)
    println(volumeSphere)
}

fun isPalindrome(word:String):Boolean{
    var word="racecar"
    var newWord = word.reversed()
    if (word == newWord){
        return true
    } else    {
        return false
    }
}