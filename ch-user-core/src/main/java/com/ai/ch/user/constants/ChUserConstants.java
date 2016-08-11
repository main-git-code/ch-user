package com.ai.ch.user.constants;

/**
 * 商户域返回报文 Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public final class ChUserConstants {

	public final static class SupplierScore {
		private SupplierScore(){}
		/**
		 * 成功，成功时取返回报文体
		 */
		public static final String SUCCESS = "000000";

		/**
		 * 没有找到供应商评分
		 */
		public static final String NOTFOUND = "000001";

		/**
		 * 失败
		 */
		public static final String Fail = "999999";
	}

}
