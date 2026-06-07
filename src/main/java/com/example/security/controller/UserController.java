package com.example.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user/info")
    public Map<String, String> userInfo() {
        return Map.of("message", "普通用户和管理员都可以访问该接口");
    }

    @GetMapping("/admin/info")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, String> adminInfo() {
        return Map.of("message", "只有管理员可以访问该接口");
    }
}
