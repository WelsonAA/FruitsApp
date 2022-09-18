package com.example.fruit_app
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class Adapter(private val fruitList: List<Fruit>) : RecyclerView.Adapter<Adapter.FruitViewHolder>() {
    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.fruit_name)
        val imageView : ImageView = itemView.findViewById(R.id.fruit_image)
    }
    var onItemClick: ((Fruit) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return FruitViewHolder(itemFruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit = fruitList[position]
        holder.imageView.setImageResource(currentFruit.Image)
        holder.textView.text=currentFruit.Name
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(currentFruit)
        }
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}