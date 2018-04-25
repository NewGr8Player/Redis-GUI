package com.xavier.service;

public interface LoginService {

	/**
	 * <p>连接Redis</p>
	 *
	 * @param host
	 * @param account
	 * @param password
	 * @param port
	 * @return
	 */
	boolean login(String host, String account, String password, String port);
}
