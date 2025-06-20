package com.deeptruth.deeptruth.base.dto.deepfake;

import com.deeptruth.deeptruth.base.Enum.DeepfakeResult;
import com.deeptruth.deeptruth.entity.DeepfakeDetection;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class DeepfakeDetectionDTO {
    private Long id;
    private String filePath;
    private DeepfakeResult result;
    private Float averageConfidence;
    private Float maxConfidence;
    private LocalDateTime createdAt;

    public static DeepfakeDetectionDTO fromEntity(DeepfakeDetection entity) {
        return DeepfakeDetectionDTO.builder()
                .id(entity.getDeepfakeDetectionId())
                .filePath(entity.getFilePath())
                .result(entity.getResult())
                .averageConfidence(entity.getAverageConfidence())
                .maxConfidence(entity.getMaxConfidence())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
