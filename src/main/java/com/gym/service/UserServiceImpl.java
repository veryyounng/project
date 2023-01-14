package com.gym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.dao.UserDAO;
import com.gym.domain.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO udao;

//  회원가입
	@Override
	public int join(UserVO vo) throws Exception {
		return udao.join(vo);
	}

//  id 중복 체크
	@Override
	public int idchk(String userid) throws Exception {
		return udao.idchk(userid);
	}

//  회원정보 불러오기
	@Override
	public void userlist(String userid) throws Exception {
		udao.userlist(userid);
	}
	
//	회원정보 수정하기
	@Override
	public int profile_modify(UserVO vo) throws Exception {
		return udao.profile_modify(vo);
	}
	
//	비밀번호 수정하기
	@Override
	public int pw_modify(UserVO vo) throws Exception {
		return udao.pw_modify(vo);
	}
	
//	회원 탈퇴
	@Override
	public int delete_user(UserVO vo) throws Exception {
		return udao.delete_user(vo);
	}
}











