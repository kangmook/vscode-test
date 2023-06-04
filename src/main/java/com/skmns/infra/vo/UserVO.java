package com.skmns.infra.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@Builder
@Schema(description = "사용자 DTO")
public class UserVO {
    @Schema(description = "사용자 ID", nullable = false, example = "user1")
    private String userId;

    @Schema(description = "사용자 이름", nullable = false, example = "홍길동")
    private String userNm;

    @Schema(description = "사용자 나이", example = "20")
    private int age;

    @Schema(description = "사용여부", defaultValue = "Y", allowableValues = {"Y", "N"})
    private String useYn;
}
