package com.VideoStreaming.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "courses")
@Entity
public class Course {

  @Id
  private String courseId;

  private String title;

  private String description;

  // @OneToMany(mappedBy = "course")
  // private List<Video> videos = new ArrayList<>();

}
