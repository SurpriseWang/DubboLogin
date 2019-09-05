package com.wang.service;

import java.util.List;

import com.wang.pojo.Admin;

/**
 * @author SurpriseWang
 * @date 2019年9月3日上午9:02:05
 */
public interface AdminService {
	List<Admin> queryAllAdmin();
	Boolean queryAdmin(String adminname,String password);
}
