package com.example.petshop

class Sad(date: String): Mood(date) {

    override fun display_mood(): String {
        return "Sad :("
    }
}