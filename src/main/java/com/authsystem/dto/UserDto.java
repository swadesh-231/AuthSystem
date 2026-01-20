package com.authsystem.dto;

import com.authsystem.entity.enums.Provider;
import lombok.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private String password;
    private String image;
    private boolean enable = true;
    private Instant createdAt = Instant.now();
    private Instant updatedAt = Instant.now();
    private Provider provider = Provider.LOCAL;
    private Set<RoleDto> roles = new HashSet<>();
}
