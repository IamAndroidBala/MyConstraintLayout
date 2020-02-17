package com.android.myconstraintlayout.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class HomeScreenActivity : AppCompatActivity(){

    var mLayout = "activity_home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setView(mLayout)

    }

    fun onClickShow(view : View) {
        mLayout = view.tag.toString()
        setView(mLayout)
    }

    private fun setView(tag : String) {
        val id = resources.getIdentifier(tag, "layout", packageName)
        setContentView(id)
    }

    override fun onBackPressed() {
        if(mLayout!= "activity_home"){
            setView("activity_home")
        } else {
            super.onBackPressed()
        }
    }

}