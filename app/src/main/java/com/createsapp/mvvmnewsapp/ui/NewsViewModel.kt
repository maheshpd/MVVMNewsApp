package com.createsapp.mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import com.createsapp.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(val newsRepository: NewsRepository) : ViewModel()