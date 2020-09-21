package com.anwesh.uiprojects.linkedrotmagnifyingglassview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.anwesh.uiprojects.barsidenavview.BarSideNavView

//import com.anwesh.uiprojects.rotmagnifyingglassview.RotMagnifyingGlassView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //RotMagnifyingGlassView.create(this)
        BarSideNavView.create(this)
        fullScreen()
    }
}

fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}
