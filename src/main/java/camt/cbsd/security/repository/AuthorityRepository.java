package camt.cbsd.security.repository;

import camt.cbsd.entity.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by CAMT on 4/21/2017.
 */
public interface AuthorityRepository extends JpaRepository<Authority,Long> {
}
