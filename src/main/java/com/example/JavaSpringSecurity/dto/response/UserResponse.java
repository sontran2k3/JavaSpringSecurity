package com.example.JavaSpringSecurity.dto.response;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserResponse {
    @jakarta.persistence.Id

    UUID id;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate birthDate;

    @ElementCollection
    Set<String> roles;
}
