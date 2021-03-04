package com.example.doubletapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val number = intent.extras?.getInt("counter") ?: 0
        findViewById<TextView>(R.id.squareNumber).apply {
            text = (number * number).toString()
        }

        Log.d(MainActivity.TAG, "$localClassName onCreate")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(MainActivity.TAG, "$localClassName onRestart")
    }

    override fun onStart() {
        super.onStart()

        Log.d(MainActivity.TAG, "$localClassName onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d(MainActivity.TAG, "$localClassName onRestoreInstantState")
    }

    override fun onResume() {
        super.onResume()

        Log.d(MainActivity.TAG, "$localClassName onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(MainActivity.TAG, "$localClassName onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(MainActivity.TAG, "$localClassName onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d(MainActivity.TAG, "$localClassName onSaveInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(MainActivity.TAG, "$localClassName onDestroy")
    }
}