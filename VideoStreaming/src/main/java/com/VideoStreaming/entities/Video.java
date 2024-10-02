package com.VideoStreaming.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name = "videos")
@Entity
public class Video {

  @Id
  private String videoId;

  private String title;

  private String description;

  private String contantType;

  private String videoFilePath;

  // @ManyToOne
  // private Course courses;

}
