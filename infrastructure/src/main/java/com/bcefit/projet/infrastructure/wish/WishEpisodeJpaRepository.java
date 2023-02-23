package com.bcefit.projet.infrastructure.wish;

import com.bcefit.projet.domain.wish.WishEpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WishEpisodeJpaRepository extends JpaRepository<WishEpisodeEntity, UUID> {
}
