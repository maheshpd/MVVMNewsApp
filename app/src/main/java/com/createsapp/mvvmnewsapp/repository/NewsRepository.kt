package com.createsapp.mvvmnewsapp.repository

import com.createsapp.mvvmnewsapp.api.RetrofitInstance
import com.createsapp.mvvmnewsapp.db.ArticleDatabase
import com.createsapp.mvvmnewsapp.models.Article

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBrakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticel(article: Article) = db.getArticleDao().deleteArticle(article)
}

