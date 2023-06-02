package com.skmns.infra.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skmns.infra.vo.UserVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "데모", description = "swagger 데모 api 입니다.")
@RestController
@RequestMapping("/api")
public class ApiController {
    
    @Operation(summary = "demo 조회", description = "demo 조회 메서드입니다.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "조회 성공", content = @Content(schema = @Schema(implementation = UserVO.class))),
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = Error.class)))
    })
    @GetMapping("/test.json")
    public ResponseEntity<UserVO> getTest(@Parameter(description = "사용자 id")String userId){
        return ResponseEntity.ok(UserVO.builder()
                .userId("user1")
                .userNm("홍길동")
                .age(20).build()
        );
    }
}
