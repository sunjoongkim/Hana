package com.example.hana.data


data class Transaction(
    val date: String,
    val category: String,
    val client: String,
    val transaction: String,
    val balance: String,
)