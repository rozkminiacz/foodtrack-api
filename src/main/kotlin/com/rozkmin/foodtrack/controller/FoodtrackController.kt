package com.rozkmin.foodtrack.controller

import com.rozkmin.foodtrack.domain.Day
import com.rozkmin.foodtrack.domain.Foodtrack
import com.rozkmin.foodtrack.service.FoodtrackService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class FoodtrackController(val foodtrackService: FoodtrackService) {

    @GetMapping("/foodtrack")
    fun getAll() = foodtrackService.getAll()

    //    @GetMapping("/foodtrack/{id}")
//    fun getById(@Param("id") id: String) = foodtrackService.getById(id)

    @GetMapping("/foodtrack/{day}")
    fun getByDay(@PathVariable("day") day: Day) = foodtrackService.getByDay(day)

    @PostMapping("/foodtrack")
    fun create(@RequestBody foodtrack: Foodtrack) = foodtrackService.create(foodtrack)
}