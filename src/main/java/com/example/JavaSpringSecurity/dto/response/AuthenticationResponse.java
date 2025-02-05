package com.example.JavaSpringSecurity.dto.response;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class AuthenticationResponse {
    String token;
    boolean authenticated;
}
