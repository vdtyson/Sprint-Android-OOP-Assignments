package com.versilistyson.module1week6_assignment.model

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.net.Uri

open class ShoppingItem(var color: String,var productName: String, var price: Int, var imageFileName: Int) {
    open fun getDisplayName(): String {
        return productName
    }
    fun getPrice(): String {
        val priceDisplayed = price.toString()
        return priceDisplayed
    }
}

class ClothingShoppingItem(
    color: String = "#EDD9A3",
    productName: String,
    price: Int,
    imageFileName: Int,
    val clothingType: ClothingType

): ShoppingItem(color,productName, price, imageFileName) {
    enum class ClothingType(type: String) {
        Pants("Pants"),
        Tops("Tops"),
        Shoes("Shoes"),
        Headwear("Headwear"),
        Accessories("Accessories")
    }

    override fun getDisplayName(): String {
        val clothingDisplayName = "$clothingType: $productName"
        return clothingDisplayName
    }
}

class GroceryShoppingItem(
    color: String = "#E2E8CO",
    productName: String,
    price: Int,
    imageFileName: Int,
    val groceryType: GroceryType
): ShoppingItem(color, productName, price, imageFileName) {

    enum class GroceryType(type: String) {
        Fruits("Fruits"),
        Veggies("Veggies"),
        Meat("Meat"),
        Drinks("Drinks")
    }

    override fun getDisplayName(): String {
        val groceryDisplayName = "$groceryType: $productName"
        return groceryDisplayName
    }
}

class BoardGameShoppingItem(
    color: String = "#887F86",
    productName: String,
    price: Int,
    imageFileName: Int,
    val boardGameType:BoardGameType
) : ShoppingItem(color, productName, price, imageFileName) {

    enum class BoardGameType(type: String) {
        Puzzle("Puzzle"),
        Multiplayer("MultiPlayer"),
        SinglePlayer("SinglePlayer")
    }

    override fun getDisplayName(): String {
        val boardGameDisplayName = "$boardGameType: $productName"
        return productName
    }
}