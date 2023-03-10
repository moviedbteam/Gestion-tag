package com.bcefit.projet.infrastructure.wish;

import com.bcefit.projet.domain.wish.WishMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishMovieJpaRepository extends JpaRepository<WishMovieEntity, String> {
}
