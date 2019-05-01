package com.xxx.gmall.service;

import java.util.List;

import com.xxx.gmall.bean.UserAddress;

public interface UserService {
	public List<UserAddress> getUserAddressList(String userId);
}
