package mum.edu.repository;


import mum.edu.domain.Credentials;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

	/**
	 * @author M Samy
	 *
	 */
	@Repository
	public interface CredentialsRepository extends  CrudRepository<Credentials, String> 
	{
  	}

