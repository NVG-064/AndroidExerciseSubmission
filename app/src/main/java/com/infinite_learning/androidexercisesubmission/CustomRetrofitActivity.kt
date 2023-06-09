package com.infinite_learning.androidexercisesubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.infinite_learning.androidexercisesubmission.customretrofit.QuotesApi
import com.infinite_learning.androidexercisesubmission.customretrofit.RetrofitHelper
import com.infinite_learning.androidexercisesubmission.databinding.ActivityCustomRetrofitBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CustomRetrofitActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCustomRetrofitBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCustomRetrofitBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)

    GlobalScope.launch {
      val result = quotesApi.getQuotes()
      if (result != null) {
        Log.d("Retrofit", result.body().toString())
      }
    }
  }
}