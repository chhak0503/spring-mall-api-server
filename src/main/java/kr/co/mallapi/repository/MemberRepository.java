package kr.co.mallapi.repository;

import kr.co.mallapi.domain.Member;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;


public interface MemberRepository extends JpaRepository<Member, String> {

    @EntityGraph(attributePaths = {"memberRoleList"})
    @Query("select m from Member m where m.email = :email")
    Member getWithRoles(@Param("email") String email);

}
