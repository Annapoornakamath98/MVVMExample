package com.yml.retrofitexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception


private lateinit var btnPost: Button
private lateinit var btnUsers: Button
private lateinit var btnComments:Button
private lateinit var btnTodos: Button
private lateinit var btnCategories: Button
private lateinit var btnProducts: Button
private lateinit var btnProductCategories : Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPost = findViewById(R.id.post)
        btnUsers = findViewById(R.id.users)
        btnComments=findViewById(R.id.comment)
        btnTodos=findViewById(R.id.todos)
        btnCategories=findViewById(R.id.categories)
        btnProducts=findViewById(R.id.products)
        btnProductCategories=findViewById(R.id.productCategory)
        val firstFragment = PostFragment()
        val secondFragment = UsersFragment()
        val thirdFragment = CommentsFragment()
        val fourFragment = TodosFragment()
        val fiveFragment = CategoriesFragment()
        val sixFragment = ProductsFragment()
        val sevenFragment = ProductCategoryFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, firstFragment)
            .addToBackStack(null).commit()
        btnPost.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, firstFragment)
                .addToBackStack(null).commit()
        }
        btnUsers.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, secondFragment)
                .addToBackStack(null).commit()
        }
        btnComments.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, thirdFragment)
                .addToBackStack(null).commit()
        }
        btnTodos.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fourFragment)
                .addToBackStack(null).commit()
        }
        btnCategories.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fiveFragment)
                .addToBackStack(null).commit()
        }
        btnProducts.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, sixFragment)
                .addToBackStack(null).commit()
        }
        btnProductCategories.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, sevenFragment)
                .addToBackStack(null).commit()
        }


    }
}