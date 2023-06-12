package com.infinite_learning.androidexercisesubmission

import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {
  var num = 0

  fun increment(): Int = num++
}