package com.example.JavaSpringSecurity.dto.request;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class AuthenticationRequest {
    String username;
    String password;
}
