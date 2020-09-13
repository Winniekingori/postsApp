package com.example.postsapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.postsapp.repository.PostRepository
import java.lang.IllegalArgumentException

class postViewModelFactory ( val PostsRepository:PostRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostsViewModel::class.java)){
            return PostsViewModel(PostsRepository)as T
        }
        throw IllegalArgumentException("Unknown viewmodel class")
    }
}
