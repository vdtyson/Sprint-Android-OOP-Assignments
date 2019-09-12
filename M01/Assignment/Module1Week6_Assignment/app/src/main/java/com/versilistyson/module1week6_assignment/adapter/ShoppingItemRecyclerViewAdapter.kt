package com.versilistyson.module1week6_assignment.adapter

import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.versilistyson.module1week6_assignment.R
import com.versilistyson.module1week6_assignment.model.ShoppingItem
import kotlinx.android.synthetic.main.shopping_item_cv.view.*

class ShoppingItemRecyclerViewAdapter(var items: List<ShoppingItem>): RecyclerView.Adapter<ShoppingItemRecyclerViewAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var cardViewConstraintLayout = view.shopping_item_cv_constraintlayout as ConstraintLayout
        var cardView = view.cv as CardView
        var shoppingItemNameTextView = view.shopping_item_cv_item_name_tv as TextView
        var shoppingItemPriceTextView = view.shopping_item_cv_item_price_tv as TextView
        var shoppingItemImageView = view.shopping_item_cv_imageview as ImageView
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.shopping_item_cv, parent, false)
        val holder = ViewHolder(viewGroup)
        return holder
    }
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ShoppingItemRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.cardViewConstraintLayout.setBackgroundColor(items[position].color)
        holder.shoppingItemNameTextView.text = items[position].getDisplayName()
        holder.shoppingItemPriceTextView.text = items[position].getPrice()
        holder.shoppingItemImageView.setImageResource(items[position].imageFileName)
    }
}