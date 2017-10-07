package com.rozkmin.foodtrack.service

import com.rozkmin.foodtrack.auth.SecurityContextService
import com.rozkmin.foodtrack.domain.User
import org.springframework.security.access.AccessDeniedException

interface WithCurrentUser {

    val securityContextService: SecurityContextService

    fun currentUser(): User? =
        securityContextService.currentUser()

    fun currentUserOrThrow(): User =
        securityContextService.currentUser() ?: throw AccessDeniedException("")
}