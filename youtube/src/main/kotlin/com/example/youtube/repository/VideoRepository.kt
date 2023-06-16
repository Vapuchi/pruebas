package com.example.youtube.repository

import com.example.youtube.model.Video
import com.example.youtube.model.Youtuber
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface VideoRepository: JpaRepository<Video, Long> {
    fun findById(id: Long?):Video?

//@Query(nativeQuery = true)


}