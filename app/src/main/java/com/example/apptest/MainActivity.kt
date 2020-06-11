package com.example.apptest

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.apptest.collapseexpand.ExpandCollapseActivity
import com.example.apptest.collapseexpand.ExpandWithBackgroundActivity
import com.example.apptest.collapseexpand.OverImagedActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        btn_expand_collapse.setOnClickListener {
            startActivity(Intent(this, ExpandCollapseActivity::class.java))
        }
        btn_expand_linear.setOnClickListener {
            startActivity(Intent(this, OverImagedActivity::class.java))
        }
        btn_expand_real.setOnClickListener {
            startActivity(Intent(this, ExpandWithBackgroundActivity::class.java))
        }
        setUpTextColor()
    }

    private fun setUpTextColor() {
        val colorString = "#" + parseIntegerToString(R.color.deepSeaBlue).fillWithZeros()
        val colorStringGris = "#" + parseIntegerToString(R.color.filters_grey).fillWithZeros()
        val colorStringNaranja = "#" + parseIntegerToString(R.color.tangerine).fillWithZeros()
        val colorStringNegro = "#" + parseIntegerToString(R.color.unregistered_dialog).fillWithZeros()
        tv_texto_parse_color.setTextColor(Color.parseColor(colorString))
    }

    private fun parseIntegerToString(color: Int): String =
        Integer.toHexString(
            ContextCompat.getColor(applicationContext, color) and 0x00ffffff
        )

    fun String.fillWithZeros(): String {
        var send = this
        while (send.length < 6) {
            send = "0$send"
        }
        return send
    }

}
