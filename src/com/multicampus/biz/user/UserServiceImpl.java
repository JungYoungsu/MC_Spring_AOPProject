package com.multicampus.biz.user;

import java.util.List;

import org.springframework.stereotype.Service;

// 4. Service 구현 클래스
@Service
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}

	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	public List<UserVO> getUserList(UserVO vo) {
		return userDAO.getUserList(vo);
	}

}
