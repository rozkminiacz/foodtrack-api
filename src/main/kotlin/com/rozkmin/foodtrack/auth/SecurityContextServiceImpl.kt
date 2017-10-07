package com.rozkmin.foodtrack.auth

import com.rozkmin.foodtrack.domain.User
import com.rozkmin.foodtrack.domain.UserDetailsImpl
import org.slf4j.LoggerFactory
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service

@Service
class SecurityContextServiceImpl : SecurityContextService {

    @Suppress("unused")
    private val logger = LoggerFactory.getLogger(SecurityContextServiceImpl::class.java)

    override fun currentUser(): User? {
        return SecurityContextHolder
            .getContext()
            .authentication
            .principal
            .let {
                when (it) {
                    is UserDetailsImpl -> it.user
                    else -> null
                }
            }
    }

}
