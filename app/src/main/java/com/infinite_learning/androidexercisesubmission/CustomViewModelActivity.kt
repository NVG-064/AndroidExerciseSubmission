package com.infinite_learning.androidexercisesubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.infinite_learning.androidexercisesubmission.databinding.ActivityCustomViewModelBinding

class CustomViewModelActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCustomViewModelBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCustomViewModelBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val viewModel = ViewModelProvider(this).get(CustomViewModel::class.java)

    binding.outputTextView.text = viewModel.num.toString()

    binding.counterButton.setOnClickListener {
      viewModel.increment()
      binding.outputTextView.text = viewModel.num.toString()
    }
  }
}