package com.amitsalunke.redditapidemo.util


import java.lang.Exception

sealed class Dataset<out T> {
    data class Success<out R>(val data: R) : Dataset<R>()
    data class Error(val exception: Exception) : Dataset<Nothing>()
    object Loading : Dataset<Nothing>()
}