package com.bcefit.projet.infrastructure.user;


import com.bcefit.projet.domain.user.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountJpaRepository extends JpaRepository<UserAccountEntity, String> {


}
