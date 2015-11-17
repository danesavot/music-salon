package mum.edu.repository.impl;

import org.springframework.stereotype.Repository;

import mum.edu.domain.Member;
import mum.edu.repository.MemberRepository;

@Repository
public class MemberRepositoryImpl extends BaseRepositoryImpl<Member> implements MemberRepository {

}
