package com.bcefit.projet.infrastructure;

import com.bcefit.projet.domain.WishEpisodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishEpisodeJpaRepository extends JpaRepository<WishEpisodeEntity, String> {
}
