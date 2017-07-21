package com.spring.project.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.spring.project.common.util.Criteria;
import com.spring.project.login.dto.LoginVO;
import com.spring.project.user.dto.UserVO;

public interface UserService {

	/**
	 * 회원정보 저장
	 * @param userVO
	 * @throws Exception
	 */
	public void insertUser(UserVO userVO, HttpServletRequest request) throws Exception;
	
	/**
	 * 사용자 아이디 조회 - 아이디 중복체크
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public int selectUserId(String userid) throws Exception;
	
	/**
	 * 프로필 이미지 조회
	 * @param userno
	 * @return
	 * @throws Exception
	 */
	public String selectProfileImg(int userno) throws Exception;
	
	/**
	 * 해당유저의 로그인기록을 조회한다.
	 * @param userno
	 * @throws Exception
	 */
	public List<LoginVO> selectLoginHistoryList(Criteria cri, int userno) throws Exception;
	
	/**
	 * 로그인 기록 횟수를 조회한다.
	 * @param userno
	 * @return
	 * @throws Exception
	 */
	public int selectLoginCount(int userno) throws Exception;
}
