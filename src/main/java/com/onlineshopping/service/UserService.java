package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;
import com.onlineshopping.po.UserNum;

public interface UserService {
	public User userLogin(User user);
	public boolean addRegisterInfo(User user) throws Exception;		//����ע����Ϣ
	public List<Goods> commodityInformation(int li);					//��ҳ��ѯ��Ʒ
	public List<UserNum> getGoodsNum();
}