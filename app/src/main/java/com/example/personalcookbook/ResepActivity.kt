package com.example.personalcookbook

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.resep_makanan.*

class ResepActivity: AppCompatActivity() {

    companion object {
        const val EXTRA_NAME: String = "extra_name"
        const val EXTRA_DETAIL: String = "extra_detail"
        const val EXTRA_INGREDIENTS: String = "extra_ingredients"
        const val EXTRA_RESEP: String = "extra_resep"
        const val EXTRA_PHOTO = "foto"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.resep_makanan)

        val actionBar = supportActionBar
        actionBar!!.title = "Recipe"
        actionBar.setDisplayHomeAsUpEnabled(true)

        showResep()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showResep(){
        val tv_nama: TextView = findViewById(R.id.tv_food_nama)
        val tv_detail: TextView = findViewById(R.id.tv_detail)
        val tv_ingredients: TextView = findViewById(R.id.tv_ingredients)
        val tv_recipe: TextView = findViewById(R.id.tv_recipe)
        val tv_photo: ImageView = findViewById(R.id.image)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
        val resep = intent.getStringExtra(EXTRA_RESEP)
        val photo: Int = intent.getIntExtra(EXTRA_PHOTO, 0)

        tv_nama.text = name
        tv_detail.text = detail
        tv_ingredients.text = ingredients
        tv_recipe.text = resep
        tv_photo.setImageResource(photo)
    }
}