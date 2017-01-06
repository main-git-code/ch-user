package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IShopInfoLogBusiSV {

	/**
	 *保存店铺日志信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public int insertShopInfoLog(InsertShopInfoLogRequest request) throws BusinessException, SystemException;
	
	/**
	 * 获取店铺日志信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryShopInfoLogResponse queryShopInfoLog(QueryShopInfoLogRequest request)
			throws BusinessException, SystemException;
}
