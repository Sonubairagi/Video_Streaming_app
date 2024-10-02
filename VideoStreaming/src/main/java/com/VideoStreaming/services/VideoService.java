package com.VideoStreaming.services;

import java.util.List;

import com.VideoStreaming.dtos.VideoDTO;

public interface VideoService {

  VideoDTO save(VideoDTO videoDTO);

  List<VideoDTO> savaAll(List<VideoDTO> videoDTOs);

  VideoDTO get(String id);

  List<VideoDTO> getAll();

  VideoDTO update(VideoDTO videoDTO);

  List<VideoDTO> updateAll(List<VideoDTO> videoDTOs);

  void delete(String id);

}
