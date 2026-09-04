package com.example.petshop

class Happy(date: String): Mood(date) {

    override fun display_mood(): String {
        return "Happy :)"
    }
}