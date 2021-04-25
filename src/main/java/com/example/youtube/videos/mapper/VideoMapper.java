package com.example.youtube.videos.mapper;

import com.example.youtube.api.model.Video;
import org.springframework.stereotype.Component;

@Component("Mapper")
public class VideoMapper {




    public Video map(com.example.youtube.repository.model.Video video){

        return new Video()
                .id(video.getId())
                .description(video.getDescription())
                .title(video.getTitle())
                .publishingDate(video.getPublishingDate())
                .thumbnailURI(video.getThumbnailURI());

    }
}
