package com.rumeysa.coroutinespractice

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    var userName=""
    var userAge=0
    runBlocking {
      val downloadedName=async {
          downloadName()
      }
        val downloadedAge=async{
            downloadAge()
        }
        userName=downloadedName.await()
        userAge=downloadedAge.await()

        println("${userName} ${userAge}")

    }
}

suspend fun downloadName() :String{
delay(2000)
    val userName="Rumeysa: "
    println("username download")
    return userName
}
suspend fun downloadAge() :Int{
    delay(4000)
    val userAge= 28
    println("userAge download")
    return userAge
}