package com.ai.ch.user.contract.impl.test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.contract.interfaces.IContractSV;
import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContractInfoResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class ContractSVImplTest {
	@Autowired
	private IContractSV contractSV;
	
	@Test
	public void insertContractInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setContractCode("店铺code3");
		contactInfoRequest.setContractName("店铺test3");
		contactInfoRequest.setContractType("2");
		contactInfoRequest.setTenantId("changhong");
		contactInfoRequest.setUserId("e01977b835034f5d");
		contactInfoRequest.setActiveTime(new Timestamp(11111111111L));
		contactInfoRequest.setInactiveTime(new Timestamp(222222222L));
		contactInfoRequest.setContractAmount(new BigDecimal(99999999.99D));
		contractSV.insertContractInfo(contactInfoRequest);
	}
	@Test
	public void queryContractInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setTenantId("changhong");
		contactInfoRequest.setContractType("2");
		//contactInfoRequest.setContractName("1234577");
		contactInfoRequest.setUserId("e01977b835034f5d");
		ContractInfoResponse response = contractSV.queryContractInfo(contactInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
	
	@Test
	public void queryContractAllInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setTenantId("changhong");
		List<ContractInfoResponse> response = contractSV.queryAllContractInfo(contactInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
	
	
}
