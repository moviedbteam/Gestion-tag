package com.bcefit.projet.infrastructure.user;

import com.bcefit.projet.domain.user.GenreTvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreTvJpaRepository extends JpaRepository<GenreTvEntity, String> {
}