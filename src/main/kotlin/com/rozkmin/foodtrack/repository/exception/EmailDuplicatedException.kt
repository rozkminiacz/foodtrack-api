package com.rozkmin.foodtrack.repository.exception

import org.springframework.dao.DuplicateKeyException

class EmailDuplicatedException(msg: String) : DuplicateKeyException(msg)
