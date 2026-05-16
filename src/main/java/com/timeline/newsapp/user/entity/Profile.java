package com.timeline.newsapp.user.entity;

import com.timeline.newsapp.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {

    @Id
    private UUID id;

    @Column(name = "google_sub", unique = true)
    private String googleSub;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    private String name;

    @Column(name = "last_login_at")
    private LocalDateTime lastLoginAt;
}