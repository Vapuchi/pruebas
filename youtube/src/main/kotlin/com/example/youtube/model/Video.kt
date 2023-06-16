package com.example.youtube.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.jetbrains.annotations.NotNull

@Entity
@Table(name="video")
class Video {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column(updatable =false)

var id: Long? =null

@NotNull()
    var title: String?= null

    var duration: Int? = null
    @Column(name="youtuber_id")
    var youtuberId: Long? = null


}