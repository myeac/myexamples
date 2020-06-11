package com.example.apptest.collapseexpand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.apptest.R
import kotlinx.android.synthetic.main.activity_over_imaged.*

class OverImagedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_imaged)

        btn_color_azul.setOnClickListener { image_azul.changeVisibility() }

        btn_color_verde.setOnClickListener { image_verde.changeVisibility() }

        btn_color_rojo.setOnClickListener { image_rojo.changeVisibility() }

        btn_color_negro.setOnClickListener { image_negro.changeVisibility() }
    }

    fun View.changeVisibility() {
        if (this.visibility == View.VISIBLE)
            this.visibility = View.GONE
        else
            this.visibility = View.VISIBLE
    }

}