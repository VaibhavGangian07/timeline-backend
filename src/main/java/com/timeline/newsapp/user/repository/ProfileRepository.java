package com.timeline.newsapp.user.repository;

import com.timeline.newsapp.user.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

    Optional<Profile> findByEmail(String email);

    Optional<Profile> findByGoogleSub(String googleSub);
}