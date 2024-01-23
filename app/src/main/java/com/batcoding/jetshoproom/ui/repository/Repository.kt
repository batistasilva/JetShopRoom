package com.batcoding.jetshoppingroom.ui.repository

import com.batcoding.jetshoppingroom.data.room.ItemDao
import com.batcoding.jetshoppingroom.data.room.ListDao
import com.batcoding.jetshoppingroom.data.room.StoreDao
import com.batcoding.jetshoppingroom.data.room.models.Item
import com.batcoding.jetshoppingroom.data.room.models.ShoppingList
import com.batcoding.jetshoppingroom.data.room.models.Store

class Repository(
    private val listDao: ListDao,
    private val storeDao: StoreDao,
    private val itemDao: ItemDao
) {
    val store = storeDao.getAllStores()
    val getItemsWithListAndStore = listDao.getItemsWithStoreAndList()

    fun getItemWithStoreAndList(id: Int) =
        listDao.getItemsWithStoreAndListFilteredById(id)

    fun getItemWithStoreAndListFilteredById(id: Int) =
        listDao.getItemsWithStoreAndListFilteredById(id)

    suspend fun insertList(shoppingList: ShoppingList) {
        listDao.insertShoppingList(shoppingList)
    }

    suspend fun insertStore(store: Store) {
        storeDao.insert(store)
    }

    suspend fun insertItem(item: Item) {
        itemDao.insert(item)
    }

    suspend fun deleteItem(item: Item) {
        itemDao.delete(item)
    }

    suspend fun updateItem(item: Item) {
        itemDao.update(item)
    }

}