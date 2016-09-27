package com.ai.ch.user.api.defaultlog.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 扣款记录服务
 * Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Path("/defaultlogservice")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IDefaultLogSV {
	
	/**
	 * 新增违约扣款记录
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0006
	 * @RestRelativeURL defaultlogservice/insertDefaultLog
	 */
	@POST
	@Path("/insertDefaultLog")
	public BaseResponse insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException;
	
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0012
	 * @RestRelativeURL defaultlogservice/queryDefaultLog
	 */
	@POST
	@Path("/queryDefaultLog")
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException;
	
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00018
	 * @RestRelativeURL defaultlogservice/paymentNotifications
	 */
	@POST
	@Path("/paymentNotifications")
	public String paymentNotifications(String msgHeader,String xmlBody,String signMsg)
			throws SystemException, BusinessException;
}
