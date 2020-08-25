package com.createsapp.mvvmnewsapp.repository

import com.createsapp.mvvmnewsapp.api.RetrofitInstance
import com.createsapp.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBrakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}