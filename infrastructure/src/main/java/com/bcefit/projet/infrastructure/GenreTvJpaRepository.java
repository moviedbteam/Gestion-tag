package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.GenreTvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreTvJpaRepository extends JpaRepository<GenreTvEntity, String> {
}