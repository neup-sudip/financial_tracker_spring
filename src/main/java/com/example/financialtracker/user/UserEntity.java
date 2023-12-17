package com.example.financialtracker.user;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name =  "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;


    public UserEntity(UserRegisterDto userRegisterDto) {
        this.username = userRegisterDto.getUsername();
        this.password = userRegisterDto.getPassword();
        this.fullName = userRegisterDto.getFullName();
        this.email = userRegisterDto.getEmail();
    }
}
