// SignupRequest.java
package quantly.finance.simulator.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String password;
    private String nickname;
}