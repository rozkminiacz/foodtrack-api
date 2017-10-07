package com.rozkmin.foodtrack.service

import com.rozkmin.foodtrack.domain.UserDetailsImpl
import com.rozkmin.foodtrack.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AccountStatusUserDetailsChecker
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service


@Service
class UserDetailsServiceImpl() : UserDetailsService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun loadUserByUsername(username: String): UserDetailsImpl =
            userRepository
                    .findOneByUsername(username)
                    ?.let(::UserDetailsImpl)
                    ?.apply {
                        AccountStatusUserDetailsChecker().check(this)
                    }

}

