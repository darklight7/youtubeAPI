package com.example.youtube.videos;

import com.example.youtube.api.VideosApi;
import com.example.youtube.api.model.Video;
import com.example.youtube.videos.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class VideoController implements VideosApi {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }


    @Override
    public ResponseEntity<List<Video>> getVideos() {

    return ResponseEntity.ok(videoService.getVideos());

    }
}
