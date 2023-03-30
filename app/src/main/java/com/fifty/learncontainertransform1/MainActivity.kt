package com.fifty.learncontainertransform1

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback

class MainActivity : AppCompatActivity() {

    private lateinit var buttonGo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        config()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGo = findViewById(R.id.button_go)
    }

    private fun config() {
        setExitSharedElementCallback(MaterialContainerTransformSharedElementCallback())
        window.sharedElementsUseOverlay = false
    }

    fun goToNextActivity(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        val bundle = ActivityOptions.makeSceneTransitionAnimation(
            this,
            buttonGo, "go"
        ).toBundle()
        startActivity(intent, bundle)
    }
}