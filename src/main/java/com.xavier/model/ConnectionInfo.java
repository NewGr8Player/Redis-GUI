package com.xavier.model;

/**
 * <p>连接Redis信息</p>
 *
 * @author Xavier
 */
public class ConnectionInfo {

	private String host;/* 地址 */
	private String account;/* 账号 */
	private String passowrd;/* 密码 */
	private Integer port;/* 端口 */

	/**
	 * <p>全参构造器</p>
	 *
	 * @param host
	 * @param account
	 * @param passowrd
	 * @param port
	 */
	public ConnectionInfo(String host, String account, String passowrd, Integer port) {
		this.host = host;
		this.account = account;
		this.passowrd = passowrd;
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ConnectionInfo{" +
				"host='" + host + '\'' +
				", account='" + account + '\'' +
				", passowrd='" + passowrd + '\'' +
				", port=" + port +
				'}';
	}
}
