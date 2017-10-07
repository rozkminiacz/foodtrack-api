package com.rozkmin.foodtrack.service

import com.rozkmin.foodtrack.domain.Day
import com.rozkmin.foodtrack.domain.Foodtrack
import com.rozkmin.foodtrack.domain.FoodtrackUpdateParams
import com.rozkmin.foodtrack.domain.MenuEntry
import com.rozkmin.foodtrack.repository.FoodtrackRepository
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface FoodtrackService{
    fun getAll() : List<Foodtrack>
    fun update(updateParams: FoodtrackUpdateParams)
    fun create(foodtrack: Foodtrack) : Foodtrack
    fun delete(foodtrack: Foodtrack)
    fun getById(id: String): Foodtrack
    fun getByDay(day: Day): List<Foodtrack>
}


@Service
@Transactional
class FoodtrackServiceImpl(val foodtrackRepository: FoodtrackRepository) : FoodtrackService{
    override fun getAll() = foodtrackRepository.findAll().toList()

    override fun getById(id: String): Foodtrack = foodtrackRepository.findOne(id)

    override fun getByDay(day: Day): List<Foodtrack> =
            foodtrackRepository.findAll().filter { !it.menus.filter { it.day==day }.isEmpty() }

    override fun update(updateParams: FoodtrackUpdateParams) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(foodtrack: Foodtrack): Foodtrack = foodtrackRepository.save(foodtrack)

    override fun delete(foodtrack: Foodtrack) = foodtrackRepository.delete(foodtrack)

}