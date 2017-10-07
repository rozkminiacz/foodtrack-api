package com.rozkmin.foodtrack.auth

import com.rozkmin.foodtrack.domain.User

interface SecurityContextService {
    fun currentUser(): User?
}
