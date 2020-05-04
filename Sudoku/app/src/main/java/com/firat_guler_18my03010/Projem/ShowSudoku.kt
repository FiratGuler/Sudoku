package com.firat_guler_18my03010.Projem


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class ShowSudoku : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displaySudoku()
    }

    private fun displaySudoku() {
        val sudoku = Sudoku_algoritma(this)
        val myCanvas = Arayuz(this, sudoku)
        myCanvas.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        myCanvas.contentDescription = getString(R.string.description)
        setContentView(myCanvas)
    }
}
