package com.ai.ch.user.defaultManager.impl.test;


import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.alibaba.fastjson.JSON;
import com.ylink.upp.base.oxm.util.OxmHandler;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml"})
public class defaultManagerSVImpl {

	@Autowired
	private IDefaultLogSV defaultLogSV;
	
	@Autowired
	private OxmHandler oxmHandler;
	
	@Test
	public void insertDetaultInfoTest(){
		InsertDefaultLogRequest request = new InsertDefaultLogRequest();
		request.setUserId("10");
		request.setDefaultReason("ccccc");
		request.setDeductBalance(111111111111D);
		request.setDeductDate(new Timestamp(new Date().getTime()));
		request.setOperId(1L);
		defaultLogSV.insertDefaultLog(request);
	}
	
	
	@Test
	public void queryDetaultInfoListTest(){
		QueryDefaultLogRequest defaultLogRequest = new QueryDefaultLogRequest();
		//defaultLogRequest.setTenantId("ch");
		//defaultLogRequest.setUserId("1");
		
		defaultLogRequest.setPageNo(1);
		defaultLogRequest.setPageSize(5);
		
		QueryDefaultLogResponse defaultLogResponse = defaultLogSV.queryDefaultLog(defaultLogRequest);
		System.out.println(JSON.toJSONString(defaultLogResponse.getPageInfo()));
	}
	
	@Test
	public void queryFullDetaultInfoListTest(){
		QueryFullDefaultLogRequest defaultLogRequest = new QueryFullDefaultLogRequest();
		//defaultLogRequest.setUserId("1erteryrtyh");
		//defaultLogRequest.setBeginTime("2016-07-28 00:00:00");
		//defaultLogRequest.setEndTime("2016-11-28 00:00:00");
		defaultLogRequest.setPageNo(4444);
		defaultLogRequest.setPageSize(554545);
		
		System.out.println(JSON.toJSONString(defaultLogSV.queryFullDefaultLog(defaultLogRequest)));
	}
}
