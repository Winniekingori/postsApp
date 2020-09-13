package com.example.postsapp.repository

import com.example.postsapp.Api.ApiClient
import com.example.postsapp.Api.ApiInterface
import kotlinx.coroutines.withContext

class PostRepository {
    suspend fun get Posts():Response <List<Post>> = withContext(Dispatches IO){
        val ApiInterface=ApiClient.buildService(ApiInterface::class.java)
        val response = ApiClient, getPosts()
        return@ withContext(context = response))
    }
}