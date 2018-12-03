package com.anwesh.uiprojects.brokenrotsquareview

/**
 * Created by anweshmishra on 03/12/18.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val nodes : Int = 5
val bars : Int = 2
val color : Int = Color.parseColor("#4CAF50")
val sizeFactor : Int = 3
val strokeFactor : Int = 90
val scDiv : Double = 0.51
val scGap : Float = 0.05f
