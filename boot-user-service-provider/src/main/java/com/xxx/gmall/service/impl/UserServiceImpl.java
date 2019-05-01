package com.xxx.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.xxx.gmall.bean.UserAddress;
import com.xxx.gmall.service.UserService;

/**
 *1�������ṩ��ע�ᵽע������
 *	1.1����dubbo����������zookeeper�Ŀͻ���curator
 *  1.2���÷����ṩ��
 *2��������ȥע�����Ķ��ķ����ṩ�ߵĵ�ַ
 * @author gexx
 *
 */
@Service
@Component
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "�����в�ƽ���긣�Ƽ�԰�ۺ�¥3��", "1", "����ʦ", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "�����б�����������ȴ���B��3�㣨���ڷ�У��", "1", "����ʦ", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return Arrays.asList(address1,address2);
	}

}
