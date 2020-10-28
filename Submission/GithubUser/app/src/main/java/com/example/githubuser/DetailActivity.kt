package com.example.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAIL_NAME = "extra_name"
        const val EXTRA_DETAIL_USERNAME = "extra_username"
        const val EXTRA_DETAIL_TOTAL_FOLLOWERS = "extra_followers"
        const val EXTRA_DETAIL_TOTAL_FOLLOWING = "extra_following"
        const val EXTRA_DETAIL_REPOSITORY = "extra_respository"
        const val EXTRA_DETAIL_LOCATION = "extra_location"
        const val EXTRA_DETAIL_COMPANY = "extra_company"
        const val EXTRA_DETAIL_AVATAR = "extra_avatar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.hide()

        showUserDetail()
        btn_follow.setOnClickListener { follow() }
    }

    private fun showUserDetail() {
        tv_detail_username.setText(intent.getStringExtra(EXTRA_DETAIL_USERNAME))
        tv_detail_name.setText(intent.getStringExtra(EXTRA_DETAIL_NAME))
        tv_detail_total_followers.setText(intent.getStringExtra(EXTRA_DETAIL_TOTAL_FOLLOWERS))
        tv_detail_total_following.setText(intent.getStringExtra(EXTRA_DETAIL_TOTAL_FOLLOWING))
        tv_detail_repository.setText(intent.getStringExtra(EXTRA_DETAIL_REPOSITORY))
        tv_detail_location.setText(intent.getStringExtra(EXTRA_DETAIL_LOCATION))
        tv_detail_company.setText(intent.getStringExtra(EXTRA_DETAIL_COMPANY))

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_DETAIL_AVATAR, 0))
            .into(img_detail_avatar)
    }

    private fun follow() {
        Toast.makeText(applicationContext, "Your are now a follower from ${intent.getStringExtra(EXTRA_DETAIL_USERNAME)}", Toast.LENGTH_SHORT).show()
    }

}