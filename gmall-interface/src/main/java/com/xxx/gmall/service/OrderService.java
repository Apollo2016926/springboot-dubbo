package com.xxx.gmall.service;

import java.util.List;

import com.xxx.gmall.bean.UserAddress;

public interface OrderService {

	public List<UserAddress> intOrder(String userId);
}
