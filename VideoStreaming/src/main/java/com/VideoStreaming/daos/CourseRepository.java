package com.VideoStreaming.daos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VideoStreaming.entities.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

  Optional<Course> findByTitle(String title);

}
