package com.rozkmin.foodtrack.repository

import com.rozkmin.foodtrack.domain.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, String> {
    fun findOneByUsername(username: String): User
    fun findByUsername(name: String): MutableIterable<User>
    fun findByUsernameContaining(phrase: String): MutableIterable<User>
}