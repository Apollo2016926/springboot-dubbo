package com.xxx.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.gmall.bean.UserAddress;
import com.xxx.gmall.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService OrderService;

	
	@RequestMapping("/initOrder")
	public @ResponseBody List<UserAddress> intOrder(@RequestParam("uid") String userId) {
		return OrderService.intOrder(userId);
	}
}
