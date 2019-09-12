package com.versilistyson.module1week6_assignment.mockdata

import com.versilistyson.module1week6_assignment.R
import com.versilistyson.module1week6_assignment.model.BoardGameShoppingItem
import com.versilistyson.module1week6_assignment.model.ClothingShoppingItem
import com.versilistyson.module1week6_assignment.model.GroceryShoppingItem
import com.versilistyson.module1week6_assignment.model.ShoppingItem

object ShoppingItemMockData {
    val mockShoppingItem = listOf<ShoppingItem>(
        GroceryShoppingItem(
            productName = "Apple",
            price = 2,
            imageFileName = R.drawable.apple,
            groceryType = GroceryShoppingItem.GroceryType.Fruits
            ),
        GroceryShoppingItem(
            productName = "Asparagus",
            price = 3,
            imageFileName = R.drawable.asparagus,
            groceryType = GroceryShoppingItem.GroceryType.Veggies
        ),
        ClothingShoppingItem(
            productName = "KhakiPants",
            price = 20,
            imageFileName = R.drawable.khakipants,
            clothingType = ClothingShoppingItem.ClothingType.Pants
        ),
        ClothingShoppingItem(
            productName = "Tshirt",
            price = 20,
            imageFileName = R.drawable.hmtshirt,
            clothingType = ClothingShoppingItem.ClothingType.Tops
        ),
        BoardGameShoppingItem(
            productName = "Scrabble",
            price = 10,
            imageFileName = R.drawable.scrabble,
            boardGameType = BoardGameShoppingItem.BoardGameType.Multiplayer
        ),
        BoardGameShoppingItem(
            productName = "Katamino",
            price = 15,
            imageFileName = R.drawable.kataminopuzzle,
            boardGameType = BoardGameShoppingItem.BoardGameType.Puzzle
        )

    )
}