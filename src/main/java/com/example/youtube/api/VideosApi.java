/*
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.youtube.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.youtube.api.model.ErrorResponse;
import com.example.youtube.api.model.Video;

public interface VideosApi extends BaseApi {

  @RequestMapping(
    value = "/v1/videos",
    produces = {"application/json"},
    method = RequestMethod.GET
  )
  default ResponseEntity<List<Video>> getVideosResource() {
    return this.getVideos();
  }

  ResponseEntity<List<Video>> getVideos();


}
