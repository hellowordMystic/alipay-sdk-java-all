package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在配送公司的门店状态
 *
 * @author auto create
 * @since 1.0, 2020-09-27 19:18:02
 */
public class LogisticsShopStatusDTO extends AlipayObject {

	private static final long serialVersionUID = 5819841697429182436L;

	/**
	 * 商家在配送公司的账户的审核说明.
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/**
	 * 配送公司物流编码。
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 配送公司名称。
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 门店状态，AUDITING:审核中，CREATE_FAILED:创建失败，AUDIT_REJECT:审核驳回，IN_FORCE:已生效，NOT_SUPPORT:不支持配送
	 */
	@ApiField("status")
	private String status;

	public String getAuditDesc() {
		return this.auditDesc;
	}
	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
