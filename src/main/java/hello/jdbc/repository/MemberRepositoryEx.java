package hello.jdbc.repository;

import hello.jdbc.domain.Member;

public interface MemberRepositoryEx {

    Member save(Member member) throws Exception;
    Member findById(String memberId) throws Exception;
    Member update(String memberId, int money) throws Exception;
    void delete(String memberId) throws Exception;

}
