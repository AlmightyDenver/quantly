// AuthController.java
package quantly.finance.simulator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quantly.finance.simulator.dto.LoginRequest;
import quantly.finance.simulator.dto.SignupRequest;
import quantly.finance.simulator.service.AuthService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignupRequest request) {
        authService.signup(request);
        return ResponseEntity.ok("회원가입 완료");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        authService.login(request);
        return ResponseEntity.ok("로그인 성공 (JWT 발급 예정)");
    }
}
