package mum.edu.service;

import java.util.List;

import mum.edu.domain.Credentials;
 
/**
 * @author Eugene
 */
public interface CredentialsService {

	/**
	 * @param credentials
	 * Credential is a model where we have username and password
	 */
	public void save(Credentials credentials);
	/**
	 * @return
	 * Return all the credentials from DB
	 */
	public List<Credentials> findAll();
 }
