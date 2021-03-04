package com.example.doubletapp1

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private val counterTextView: TextView by lazy { findViewById(R.id.counter) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView.text = counter.toString()

        Log.d(TAG, "$localClassName onCreate")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "$localClassName onRestart")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "$localClassName onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counter = savedInstanceState.getInt("counter")
        counter++

        counterTextView.text = counter.toString()

        Log.d(TAG, "$localClassName onRestoreInstantState")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "$localClassName onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "$localClassName onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "$localClassName onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("counter", counter)

        Log.d(TAG, "$localClassName onSaveInstanceState")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        Log.d(TAG, "$localClassName onConfigChanged")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "$localClassName onDestroy")
    }

    fun onSquareButtonClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("counter", counter)
        startActivity(intent)
    }

    companion object {
        const val TAG = "lifecycle"
    }
}