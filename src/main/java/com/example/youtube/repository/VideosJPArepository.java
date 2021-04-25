package com.example.youtube.repository;


import com.example.youtube.repository.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("videoRepo")
public interface VideosJPArepository extends JpaRepository<Video,String> , JpaSpecificationExecutor<Video> {

    List<Video> findAll();
}
