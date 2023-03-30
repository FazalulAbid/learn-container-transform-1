package com.fifty.learncontainertransform1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.transition.platform.MaterialContainerTransform
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        config()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    private fun config() {
        (findViewById<View>(android.R.id.content)).transitionName = "go"
        setEnterSharedElementCallback(MaterialContainerTransformSharedElementCallback())

        val transform = MaterialContainerTransform()
        transform.addTarget(android.R.id.content)
        transform.duration = 500

        window.sharedElementEnterTransition = transform
        window.sharedElementReturnTransition = transform
    }
}