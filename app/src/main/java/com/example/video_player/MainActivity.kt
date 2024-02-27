package com.example.video_player
import android.widget.MediaController
import android.widget.VideoView
import android.net.Uri
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity



import com.example.video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // specify the location of the video file
        setContentView(R.layout.activity_main)

//Find the VideoView class by its id

        val videoView = findViewById<VideoView>(binding.testView.id)

//Creating MediaController

        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)

//specify the location of media file

        val uri:Uri = Uri.parse(
            "android.resource://" + packageName
                    + "/raw/aqua"
        )

//Setting MediaController and URI, then starting the videoView

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}