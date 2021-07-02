package models;

import enums.UserRole;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public abstract class User {
    private Long id;
    private String name;
    private UserRole role;
}
