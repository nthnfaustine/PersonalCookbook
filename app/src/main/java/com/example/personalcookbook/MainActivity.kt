package com.example.personalcookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    private lateinit var listFoodAdapter: ListFoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_makanan)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()
        setListClickAction()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.profile){
            val profileIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(profileIntent)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList(){
        rvFood.layoutManager = LinearLayoutManager(this)
        listFoodAdapter = ListFoodAdapter(list)
        rvFood.adapter = listFoodAdapter
    }

    private fun setListClickAction() {
        listFoodAdapter.setOnItemClickCallBack(object: ListFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Food) {
                val manageDetailIntent = Intent(this@MainActivity,ResepActivity::class.java).apply {
                    putExtra(ResepActivity.EXTRA_NAME, data.name)
                    putExtra(ResepActivity.EXTRA_DETAIL, data.detail)
                    putExtra(ResepActivity.EXTRA_INGREDIENTS, data.ingredients)
                    putExtra(ResepActivity.EXTRA_RESEP, data.recipe)
                    putExtra(ResepActivity.EXTRA_PHOTO, data.photo)
                }
                startActivity(manageDetailIntent)
            }
        })
    }

}
