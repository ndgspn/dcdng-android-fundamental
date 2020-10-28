package com.example.githubuser.model

data class User(
    var avatar: Int = 0,
    var username: String = "",
    var name: String = "",
    var location: String = "",
    var repository: String = "",
    var company: String = "",
    var followers: String = "",
    var following: String = ""
)

