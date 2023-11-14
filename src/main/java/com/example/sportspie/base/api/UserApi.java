package com.example.sportspie.base.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sportspie.bounded_context.auth.entity.User;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/api/user")
@Tag(name = "Auth", description = "사용자 인증 관련 API")
public interface UserApi {
	@GetMapping("/me")
	@Operation(summary = "사용자 본인 정보 조회 메서드", description = "사용자가 본인의 정보를 조회하기 위한 메서드입니다.")
	ResponseEntity<User> read(HttpServletRequest request);
}
