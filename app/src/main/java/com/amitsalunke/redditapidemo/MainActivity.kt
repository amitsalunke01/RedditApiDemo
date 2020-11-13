package com.amitsalunke.redditapidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelStore
import com.amitsalunke.redditapidemo.data.model.RedditData
import com.amitsalunke.redditapidemo.util.Dataset
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private val viewModel: RedditViewModel by viewModels();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadRedditData()
    }

    private fun loadRedditData() {
        viewModel.getRedditData().observe(this, Observer {
            it
            when (it) {
                is Dataset.Success<List<RedditData>> -> {
                    for (d in it.data.indices) {
                        Log.e(
                            TAG,
                            "Value author full name $d  and value is ${it.data[d].author_fullname}"
                        )
                        Log.e(TAG, "Value title $d  and value is ${it.data[d].title}")
                        Log.e(TAG, "Value name $d  and value is ${it.data[d].name}")
                        Log.e(
                            TAG,
                            "Value total awards received $d  and value is ${it.data[d].total_awards_received}"
                        )
                        Log.e(
                            TAG,
                            "-----------------------------------------------------------------------------"
                        )
                    }
                }

                is Dataset.Error -> {
                    Log.e(TAG, "value error " + it.exception)
                }

                is Dataset.Loading -> {
                    Log.e(TAG, "Loading ")
                }
            }

        })
    }
}