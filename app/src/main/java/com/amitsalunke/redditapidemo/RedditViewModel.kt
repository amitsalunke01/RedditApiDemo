package com.amitsalunke.redditapidemo

import androidx.lifecycle.*
import com.amitsalunke.redditapidemo.data.model.RedditData
import com.amitsalunke.redditapidemo.util.Dataset
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class RedditViewModel(
    private val redditRepository: RedditRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private var data: MutableLiveData<Dataset<List<RedditData>>> = MutableLiveData()

    fun getRedditData(): LiveData<Dataset<List<RedditData>>> {
        viewModelScope.launch {
            redditRepository.getRedditData()
                .onEach { it -> data.value = it }
                .launchIn(viewModelScope)
        }
        return data
    }


}