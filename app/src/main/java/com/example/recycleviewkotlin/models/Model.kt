package com.example.recycleviewkotlin.models

//compare data Type
data class Hobby(var title: String)

//use Singleton Create Data
object Supplier {
    val hobbies = listOf(
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("walking"),
        Hobby("Sleeping"),
        Hobby("Swimming"),
        Hobby("walking"),
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("Swimming"),
        Hobby("Sleeping"),
        Hobby("walking")

    )
}