package com.infinite_learning.androidexercisesubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.infinite_learning.androidexercisesubmission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)

    setContentView(binding.root)

    binding.sectionOneMaterialButton.setOnClickListener {
      startActivity(Intent(this, CustomAppBarActivity::class.java))
    }

    binding.sectionSixMaterialButton.setOnClickListener {
      startActivity(Intent(this, CustomRetrofitActivity::class.java))
    }
  }
}