package com.VideoStreaming.daos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VideoStreaming.entities.Video;

public interface VideoRepository extends JpaRepository<Video, String> {

  Optional<Video> findByTitle(String title);

}
