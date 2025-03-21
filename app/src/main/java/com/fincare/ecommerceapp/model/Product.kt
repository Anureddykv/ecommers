package com.fincare.ecommerceapp.model

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val image: String,
    val category: String,
    val price: Double,
    val rating: Rating,
    val isPopular: Boolean

    )

data class Rating(
    val rate: Double?,
    val count: Int
)
