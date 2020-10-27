package com.example.githubuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.githubuser.adapter.UserAdapter
import com.example.githubuser.model.User
import com.example.githubuser.model.UsersData
import com.example.githubuser.model.UsersData.listData
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private var list: ArrayList<User> = arrayListOf()
    private lateinit var listUserAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        rv_users.setHasFixedSize(true)
        list.addAll(UsersData.listData)
        showRecyclerList()
        setListClickAction()
    }

    private fun showRecyclerList() {
        rv_users.layoutManager = LinearLayoutManager(this)
        listUserAdapter = UserAdapter(list)
        rv_users.adapter = listUserAdapter
    }

    private fun setListClickAction() {
        listUserAdapter.setOnItemClickCallback(object : UserAdapter.OnItemClickCallback {
            override fun onItemClicked(data: User) {
                val detailIntent = Intent(this@HomeActivity, DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DETAIL_AVATAR, data.avatar)
                    putExtra(DetailActivity.EXTRA_DETAIL_NAME, data.name)
                    putExtra(DetailActivity.EXTRA_DETAIL_USERNAME, data.username)
                    putExtra(DetailActivity.EXTRA_DETAIL_TOTAL_FOLLOWERS, data.followers)
                    putExtra(DetailActivity.EXTRA_DETAIL_TOTAL_FOLLOWING, data.following)
                    putExtra(DetailActivity.EXTRA_DETAIL_REPOSITORY, data.repository)
                    putExtra(DetailActivity.EXTRA_DETAIL_LOCATION, data.location)
                    putExtra(DetailActivity.EXTRA_DETAIL_COMPANY, data.company)
                }

                startActivity(detailIntent)
            }
        })
    }
}