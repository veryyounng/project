package com.gym.payment.DAO;

import com.gym.domain.UserVO;
import com.gym.payment.vo.PreReadyVO;

public interface PreReadyDAO {

	// 상품정보 가져오기
	public PreReadyVO getProduct(String proNum) throws Exception;
	
	public void upDate(String userId, Integer month) throws Exception;

	public UserVO updateloginUser(String userid);
	
}
