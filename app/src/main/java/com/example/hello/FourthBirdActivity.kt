package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFourthBirdBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.parrot.setOnClickListener {
            finish()
        }
        binding.btnNext4.setOnClickListener {
            val intent= Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/474x/45/b9/7e/45b97e421e26f33740607013469b9bd8.jpg").fit().into(binding.imageView5)
    }
}