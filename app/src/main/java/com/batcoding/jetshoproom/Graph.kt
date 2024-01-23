package com.batcoding.jetshoppingroom

import android.content.Context
import com.batcoding.jetshoppingroom.data.room.ShoppingListDatabase
import com.batcoding.jetshoppingroom.ui.repository.Repository

object Graph {
    lateinit var db:ShoppingListDatabase
        private set
    val repository by lazy {
        Repository(
            listDao = db.listDao(),
            storeDao = db.storeDao(),
            itemDao = db.itemDao()
        )
    }

    fun provide(context: Context){
        db = ShoppingListDatabase.getDatabase(context)
    }

}