package com.example.favdish.model.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.favdish.model.entities.FavDish
import kotlinx.coroutines.flow.Flow

@Dao
interface FavDishDao {
    @Insert
    suspend fun insertFavDishDetails(favDish: FavDish) // suspend is similar to async in C#

    @Query("SELECT * FROM FAV_DISHES_TABLE ORDER BY ID")
    fun getAllDishesList(): Flow<List<FavDish>> // To observe data changes we use Flow and room takes care of updating flow when data is updated. Flow is async sequence of values. It produces values one at a time instead of all at once, and that can generate values from async operations.
}