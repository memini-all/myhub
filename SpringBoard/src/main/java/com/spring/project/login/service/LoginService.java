package com.spring.project.login.service;

import java.util.Map;

import com.spring.project.login.dto.LoginVO;

public interface LoginService {
	
	/**
	 * 로그인 체크
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> login(LoginVO loginVO) throws Exception;
	
	
	/**
	 * 로그인/로그아웃 기록을 저장한다.
	 * @param loginMap - 사용자번호, ip, 상태(로그인/로그아웃) 
	 * @throws Exception
	 */
	public void insertLoginHistory(Map<String,Object> loginMap) throws Exception;

}
