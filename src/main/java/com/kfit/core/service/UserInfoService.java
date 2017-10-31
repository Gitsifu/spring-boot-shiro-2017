package com.kfit.core.service;

import com.kfit.core.bean.UserInfo;

public interface UserInfoService {
	
	public UserInfo findByUsername(String name);
	
}
