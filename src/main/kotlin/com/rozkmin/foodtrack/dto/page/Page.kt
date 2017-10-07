package com.rozkmin.foodtrack.dto.page

interface Page<out T> {
    val totalPages: Int
    val content: List<T>
}