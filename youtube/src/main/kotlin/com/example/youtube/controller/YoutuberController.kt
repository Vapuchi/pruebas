package com.example.youtube.controller

import com.example.youtube.model.Youtuber
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
@RequestMapping("/youtuber")
class YoutuberController {
    @Autowired
    lateinit var youtuberService: YoutuberService

    @GetMapping
    fun list():ResponseEntity<*>{
        return ResponseEntity(youtuberService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Validated youtuber: Youtuber): ResponseEntity<Youtuber>{
        return ResponseEntity(youtuberService.save(youtuber), HttpStatus.OK)    }

    @PutMapping
    fun update (@RequestBody youtuber: Youtuber):ResponseEntity<Youtuber>{
        return ResponseEntity(youtuberService.update(youtuber), HttpStatus.OK)
    }



}