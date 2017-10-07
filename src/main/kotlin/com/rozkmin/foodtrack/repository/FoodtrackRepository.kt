package com.rozkmin.foodtrack.repository

import com.rozkmin.foodtrack.domain.Foodtrack
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FoodtrackRepository : MongoRepository<Foodtrack, String>