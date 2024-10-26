package com.group.libraryapp.domain.user

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class User (

        var name: String,

        val age: Int?

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
){
}