package com.example.youtube.videos.service;

import com.example.youtube.repository.VideosJPArepository;
import com.example.youtube.repository.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("videoService")
public class VideoService {


public final VideosJPArepository videosJPArepository;
@Autowired
    public VideoService(VideosJPArepository videosJPArepository) {
        this.videosJPArepository = videosJPArepository;
    }


    public List<Video> getVideos(){

        return videosJPArepository.findAll();

    }
}
