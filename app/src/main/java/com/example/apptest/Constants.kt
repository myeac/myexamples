package com.example.apptest

import android.view.View

fun View.makeItVisible() {
    this.visibility = View.VISIBLE
}

fun View.makeItInvisible() {
    this.visibility = View.INVISIBLE
}

fun View.makeItGone() {
    this.visibility = View.GONE
}