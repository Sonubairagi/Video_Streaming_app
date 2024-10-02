package com.VideoStreaming.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoDTO {

  private String videoId;

  private String title;

  private String description;

  private String contantType;

  private String videoFilePath;
}
