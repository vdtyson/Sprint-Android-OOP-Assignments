package com.versilistyson.module1week6_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.versilistyson.module1week6_assignment.adapter.ShoppingItemRecyclerViewAdapter
import com.versilistyson.module1week6_assignment.mockdata.ShoppingItemMockData
import com.versilistyson.module1week6_assignment.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView(ShoppingItemMockData.mockShoppingItem)
    }
    fun initRecyclerView(shoppingItemList: List<ShoppingItem>) {
        shopping_item_rv.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            val shoppingItemListAdapter = ShoppingItemRecyclerViewAdapter(shoppingItemList)
            adapter = shoppingItemListAdapter
        }
    }
}
