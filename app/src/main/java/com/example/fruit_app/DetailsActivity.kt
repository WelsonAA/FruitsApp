package com.example.fruit_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val fruit = intent.getParcelableExtra<Fruit>("Food")
        if(fruit!=null){


            val textView : TextView = findViewById(R.id.fruitLabelDetailed)
            val imageView  : ImageView = findViewById(R.id.fruitImage)
            val descView : TextView = findViewById(R.id.fruitDesc)
            textView.text= fruit.Name
            descView.text = fruit.Desc
            imageView.setImageResource(fruit.Image)
        }
    }
}