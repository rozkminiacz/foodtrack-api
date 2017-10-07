package com.rozkmin.foodtrack.repository.exception

import org.springframework.dao.DataIntegrityViolationException

class RecordInvalidException(msg: String) : DataIntegrityViolationException(msg)