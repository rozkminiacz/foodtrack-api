package com.rozkmin.foodtrack.domain

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.Id

class Foodtrack {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    var id: String = UUID.randomUUID().toString()

    constructor()

    var name: String = ""

    var phone: String = ""

    var menus: List<MenuEntry> = listOf<MenuEntry>()
}

class MenuEntry {
    constructor()

    var day: Day = Day.MONDAY
    var menu: Menu = Menu()
}

class Menu {
    constructor()

    var name: String = ""
    var prize: Double = 0.0
    var ingredients: List<String> = listOf()
}

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class FoodtrackUpdateParams {

}
