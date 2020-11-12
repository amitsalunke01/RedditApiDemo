package com.amitsalunke.redditapidemo

import android.util.Log
import com.amitsalunke.redditapidemo.cache.RedditDao
import com.amitsalunke.redditapidemo.cache.RedditDataCacheMapper
import com.amitsalunke.redditapidemo.data.model.RedditData
import com.amitsalunke.redditapidemo.data.networkEntity.RedditResponse
import com.amitsalunke.redditapidemo.data.networkEntity.children.Children
import com.amitsalunke.redditapidemo.data.networkEntity.children.Data
import com.amitsalunke.redditapidemo.network.RedditAPIRequest
import com.amitsalunke.redditapidemo.network.RedditDataNetworkMapper
import com.amitsalunke.redditapidemo.util.Dataset
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RedditRepository(
    private val redditDao: RedditDao,
    private val redditDataCacheMapper: RedditDataCacheMapper,
    private val redditAPIRequest: RedditAPIRequest,
    private val redditDataNetworkMapper: RedditDataNetworkMapper
) {

    suspend fun getRedditData(): Flow<Dataset<List<RedditData>>> = flow {
        emit(Dataset.Loading)
        try {
            val redditNetworkEntities: RedditResponse = redditAPIRequest.getRedditAPIList();
            val listData: ArrayList<Data>?  = ArrayList()
            for (data in redditNetworkEntities.data.children){
                //val redditData = redditDataNetworkMapper.mapEntityToDomainList(data.data)
                //val
                listData?.add(data.data)
            }
            val redditData = listData?.let { redditDataNetworkMapper.mapEntityToDomainList(it) }

        } catch (exe: Exception) {
            Log.e("Rep", "Exeception occured  $exe ")
            emit(Dataset.Error(exe))
        }
    }
}