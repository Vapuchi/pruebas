package com.example.youtube.controller

import com.example.youtube.model.Video
import com.example.youtube.model.Youtuber
import com.example.youtube.service.VideoService
import com.example.youtube.service.YoutuberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/video")
class VideoController {
    @Autowired
    lateinit var videoService: VideoService

    @GetMapping
    fun list():ResponseEntity<*>{
        return ResponseEntity(videoService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody video: Video): ResponseEntity<Video>{
        return ResponseEntity(videoService.save(video), HttpStatus.OK)    }

    @PutMapping
    fun update (@RequestBody video: Video):ResponseEntity<Video>{
        return ResponseEntity(videoService.update(video), HttpStatus.OK)
    }



}