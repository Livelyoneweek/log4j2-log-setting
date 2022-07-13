package log.log4j2.repository;

import log.log4j2.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository <Member, Long> {
}
