package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产详情
 *
 * @author auto create
 * @since 1.0, 2020-09-29 16:37:15
 */
public class AssetsDetailParams extends AlipayObject {

	private static final long serialVersionUID = 3894688517786398697L;

	/**
	 * 资产是否准入
	 */
	@ApiField("admit")
	private String admit;

	/**
	 * 免息券信息
	 */
	@ApiField("int_free_info")
	private String intFreeInfo;

	public String getAdmit() {
		return this.admit;
	}
	public void setAdmit(String admit) {
		this.admit = admit;
	}

	public String getIntFreeInfo() {
		return this.intFreeInfo;
	}
	public void setIntFreeInfo(String intFreeInfo) {
		this.intFreeInfo = intFreeInfo;
	}

}