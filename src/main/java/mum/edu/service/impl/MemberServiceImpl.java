package mum.edu.service.impl;

import java.util.List;

import mum.edu.domain.Member;
import mum.edu.repository.MemberRepository;
import mum.edu.service.CredentialsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Eugene
 *
 */
@Service
@Transactional 
public class MemberServiceImpl implements mum.edu.service.MemberService {
	
 	@Autowired
	private MemberRepository memberRepository;

 	@Autowired
 	CredentialsService credentialsService;
  	
  	/* (non-Javadoc)
  	 * @see mum.edu.service.MemberService#save(mum.edu.domain.Member)
  	 */
  	public void save( Member member) {  		
  		memberRepository.save(member);
 	}
  	
  	
	/* (non-Javadoc)
	 * @see mum.edu.service.MemberService#findAll()
	 */
	public List<Member> findAll() {
		return (List< Member>)memberRepository.findAll();
	}


}
