package com.xxx.gmall.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xxx.gmall.bean.UserAddress;
import com.xxx.gmall.service.OrderService;
import com.xxx.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {
	@Reference
	UserService userService;

	public List<UserAddress> intOrder(String userId) {
		System.out.println(userId);
		List<UserAddress> userAddressList = userService
				.getUserAddressList(userId);
		return userAddressList;
	}

}
