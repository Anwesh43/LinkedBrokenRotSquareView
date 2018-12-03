package com.anwesh.uiprojects.linkedbrokenrotsquareview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.brokenrotsquareview.BrokenRotSquareView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BrokenRotSquareView.create(this)
    }
}
