
package com.example.fakecamera

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val videoView = VideoView(this)
        setContentView(videoView)

        val videoUri = Uri.parse("android.resource://${packageName}/${R.raw.facevideo}")
        videoView.setVideoURI(videoUri)

        videoView.setOnPreparedListener {
            it.isLooping = true
            videoView.start()
        }
    }
}
