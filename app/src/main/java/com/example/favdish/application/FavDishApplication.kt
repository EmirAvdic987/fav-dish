package com.example.favdish.application

import android.app.Application
import com.example.favdish.model.database.FavDishRepository
import com.example.favdish.model.database.FavDishRoomDatabase

class FavDishApplication : Application() {
    // We don't want the database to be loaded straight away when the application is started, but only once it's needed.
    private val database by lazy {
        FavDishRoomDatabase.getDatabase(this@FavDishApplication)
    }
    val repository by lazy {
        FavDishRepository(database.favDishDao())
    }
}