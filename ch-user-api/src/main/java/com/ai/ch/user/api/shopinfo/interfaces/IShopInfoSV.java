package com.ai.ch.user.api.shopinfo.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoByIdRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.SaveShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopBalanceRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatusRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 店铺服务
 * Date: 2016年8月23日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Path("/shopinfoservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IShopInfoSV {

	/**
	 * 查询店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_01
	 * @RestRelativeURL shopinfoservice/queryShopInfo
	 */
	@POST
	@Path("/queryShopInfo")
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request)
			throws BusinessException, SystemException;
	
	
	/**
	 * 设置商户附加资质信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0000001
	 * @RestRelativeURL shopinfoservice/insertShopInfo
	 */
	@POST
	@Path("/insertShopInfo")
	public BaseResponse insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException;
	
	/**
	 * 更新店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0020
	 * @RestRelativeURL shopinfoservice/updateShopInfo
	 */
	@POST
	@Path("/updateShopInfo")
	public BaseResponse updateShopInfo(UpdateShopInfoRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询默认保证金
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-04
	 * @RestRelativeURL shopinfoservice/queryDepositRule
	 */
	@POST
	@Path("/queryDepositRule")
	public QueryDepositRuleResponse queryDepositRule(QueryDepositRuleRequest request)throws BusinessException,SystemException;
	
	
	/**
	 * 查询店铺信息日志
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-06
	 * @RestRelativeURL shopinfoservice/queryShopInfoLog
	 */
	@POST
	@Path("/queryShopInfoLog")
	public QueryShopInfoLogResponse queryShopInfoLog(QueryShopInfoLogRequest request)throws BusinessException,SystemException;
	
	/**
	 * 店铺评级规则
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0007
	 * @RestRelativeURL shopinfoservice/queryShopScoreKpi
	 */
	@POST
	@Path("/queryShopScoreKpi")
	public QueryShopScoreKpiResponse queryShopScoreKpi(QueryShopScoreKpiRequest request) throws BusinessException,SystemException;
	
	/**
	 * 保存店铺评级统计数据
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-08
	 * @RestRelativeURL shopinfoservice/insertShopStatData
	 */
	@POST
	@Path("/insertShopStatData")
	public BaseResponse insertShopStatData(InsertShopStatDataRequest request)throws BusinessException,SystemException;
	
	/**
	 * 更新店铺评级统计数据
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-09
	 * @RestRelativeURL shopinfoservice/updateShopStatData
	 */
	@POST
	@Path("/updateShopStatData")
	public BaseResponse updateShopStatData(UpdateShopStatDataRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询店铺评级统计数据
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-10
	 * @RestRelativeURL shopinfoservice/queryShopInfoLog
	 */
	@POST
	@Path("/queryShopStatData")
	public QueryShopStatDataResponse queryShopStatData(QueryShopStatDataRequest request)throws BusinessException,SystemException;
	
	/**
	 * 查询店铺评级
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-11
	 * @RestRelativeURL shopinfoservice/queryShopRank
	 */
	@POST
	@Path("/queryShopRank")
	public QueryShopRankResponse queryShopRank(QueryShopRankRequest request)throws BusinessException,SystemException;
	
	/**
	 * 店铺应缴保证金查询
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0015
	 * @RestRelativeURL shopinfoservice/queryShopDeposit
	 */
	@POST
	@Path("/queryShopDeposit")
	public QueryShopDepositResponse queryShopDeposit(QueryShopDepositRequest request) throws BusinessException,SystemException;
	
	/**
	 * 查询批量店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChUser-013
	 * @RestRelativeURL shopinfoservice/queryShopInfoBatch
	 */
	@POST
	@Path("/queryShopInfoBatch")
	public QueryShopInfoBatchResponse queryShopInfoBatch(QueryShopInfoBatchRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 校验店铺名称的唯一性
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangyuehong
	 * @ApiCode COMM_TENANT_0023
	 * @RestRelativeURL shopinfoservice/checkShopNameOnly
	 */
	@POST
	@Path("/checkShopNameOnly")
	public BaseResponse checkShopNameOnly(QueryShopInfoRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 保存商户资质信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0005
	 * @RestRelativeURL shopinfoservice/saveShopAuditInfo
	 */
	@POST
	@Path("/saveShopAuditInfo")
	public BaseResponse saveShopAuditInfo(SaveShopAuditInfoRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 更新商户资质信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00051
	 * @RestRelativeURL shopinfoservice/updateShopAuditInfo
	 */
	@POST
	@Path("/updateShopAuditInfo")
	public BaseResponse updateShopAuditInfo(UpdateShopAuditInfoRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 更新店铺状态
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0021
	 * @RestRelativeURL shopinfoservice/updateShopStatus
	 */
	@POST
	@Path("/updateShopStatus")
	public BaseResponse updateShopStatus(UpdateShopStatusRequest request)
			throws BusinessException, SystemException;
	
	
	/**
	 * 根据id查询店铺信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0010
	 * @RestRelativeURL shopinfoservice/queryShopInfoById
	 */
	@POST
	@Path("/queryShopInfoById")
	public QueryShopInfoResponse queryShopInfoById(QueryShopInfoByIdRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 设置店铺应缴纳保证金
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0004
	 * @RestRelativeURL shopinfoservice/setShopDeposit
	 */
	@POST
	@Path("/setShopDeposit")
	public BaseResponse setShopDeposit(SetShopDepositRequest request)
			throws BusinessException, SystemException;
	

	/**
	 * 结算费率设置
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0008
	 * @RestRelativeURL shopinfoservice/setShopDeposit
	 */
	@POST
	@Path("/setShopDeposit")
	public BaseResponse setShopBalance(SetShopBalanceRequest request)
			throws BusinessException, SystemException;
	
	/**
	 * 查询店铺考核参数
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_001000
	 * @RestRelativeURL shopinfoservice/queryShopKpi
	 */
	@POST
	@Path("/queryShopKpi")
	public QueryShopKpiResponse queryShopKpi(QueryShopKpiRequest request)
			throws BusinessException, SystemException;
}
