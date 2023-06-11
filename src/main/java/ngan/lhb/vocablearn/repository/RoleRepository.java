package ngan.lhb.vocablearn.repository;

import ngan.lhb.vocablearn.entity.Role;
import ngan.lhb.vocablearn.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
