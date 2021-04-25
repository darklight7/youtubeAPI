package com.example.youtube.videos;

import com.example.youtube.api.VideosApi;
import com.example.youtube.api.model.Video;
import com.example.youtube.videos.mapper.VideoMapper;
import com.example.youtube.videos.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Controller
public class VideoController implements VideosApi {

    private final VideoService videoService;
    private final VideoMapper videoMapper;

    @Autowired
    public VideoController(VideoService videoService, VideoMapper videoMapper) {
        this.videoService = videoService;
        this.videoMapper = videoMapper;
    }


    @Override
    public ResponseEntity<List<Video>> getVideos() {

    return ResponseEntity.ok(videoService.getVideos().stream().map(videoMapper::map)
    .collect(toList()));

    }
}
