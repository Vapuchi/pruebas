package com.example.youtube.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.jetbrains.annotations.NotNull

@Entity
@Table(name="youtuber")
class Youtuber {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column(updatable =false)

var id: Long? =null

@NotNull()
var channel: String?= null
var monetize: Boolean = false




}