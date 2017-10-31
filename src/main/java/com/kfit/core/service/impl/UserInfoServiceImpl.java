package com.kfit.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfit.core.bean.UserInfo;
import com.kfit.core.repository.UserInfoRepository;
import com.kfit.core.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserInfo findByUsername(String name) {
		return userInfoRepository.findByUsername(name);
	}

}
