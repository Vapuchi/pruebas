package com.example.youtube.service

import com.example.youtube.model.Video
import com.example.youtube.model.Youtuber
import com.example.youtube.repository.VideoRepository
import com.example.youtube.repository.YoutuberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class VideoService {
    @Autowired
lateinit var VideoRepository: VideoRepository

fun list():List<Video>{
return VideoRepository.findAll()
}
    fun save(video: Video): Video{
    return VideoRepository.save(video)
    }

fun update (video: Video):Video{
try {
    VideoRepository.findById(video.id)
            ?:throw Exception("id no existe")
return VideoRepository.save(video)
    }
catch (ex:Exception){
throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
}
}


}