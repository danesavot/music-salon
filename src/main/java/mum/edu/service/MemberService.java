package mum.edu.service;

import java.util.List;

import mum.edu.domain.Member;
 
/**
 * @author Dane
 *
 */
public interface MemberService {

	/**
	 * @param member
	 * Save to DB Member model
	 */
	public void add(Member member);
	/**
	 * @return
	 * Return all the credentials from DB
	 */
	public List<Member> getAll();
		
}
