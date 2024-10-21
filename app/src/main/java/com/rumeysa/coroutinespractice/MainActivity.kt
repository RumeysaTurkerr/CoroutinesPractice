package com.rumeysa.coroutinespractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rumeysa.coroutinespractice.ui.theme.CoroutinesPracticeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //light Weightness

        /*GlobalScope.launch{
            repeat(100000){
                launch{
                    println("android")
                }
            }
        }*/

        //Scope
        //runblocking
  /*      println("run blocking start");
        runBlocking {
          launch{
              delay(5000)
              println("run blocking")
          }
        }
        println("run blocking end");

        //Global Scope
        //bloklamaz
        println("global scope start");
        GlobalScope.launch{
                           delay(5000)
                           println("global scope")

               }
        println("global scope end");
*/

        //Coroutine Scope--thread'a kadar seçilebiliyor
      /*  println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")
  */
       /* runBlocking {
            launch(Dispatchers.Main) {
                println("Main Thread:${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread:${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("Default Thread:${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) {
                println("Unconfined Thread:${Thread.currentThread().name}")
            }
        }*/

    }

}
