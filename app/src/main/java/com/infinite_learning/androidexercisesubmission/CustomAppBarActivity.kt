package com.infinite_learning.androidexercisesubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.infinite_learning.androidexercisesubmission.databinding.ActivityCustomAppBarBinding

class CustomAppBarActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCustomAppBarBinding
  private lateinit var toolbar: Toolbar

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCustomAppBarBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.toolbarToolbar.title = ""
    setSupportActionBar(binding.toolbarToolbar)
  }
}