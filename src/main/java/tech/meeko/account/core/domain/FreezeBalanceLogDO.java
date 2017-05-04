package tech.meeko.account.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 余额冻结日志数据对象
 *
 * @version 3.2.0
 */
public class FreezeBalanceLogDO implements Serializable {
    private static final long serialVersionUID = -4419389398311196785L;
    /** 记录唯一编号 */
    private Long              id;
    /** 账号 */
    private String            accountNo;
    /** 冻结行为类型 */
    private String            actionType;
    /** 冻结金额 */
    private Long              freezeAmount;
    /** 冻结后余额 */
    private Long              balance;
    /** 被冻结余额 */
    private Long              freezeBalance;
    /** 冻结行为原因 */
    private String            actionReason;
    /** 冻结操作人 */
    private String            operator;
    /** 创建时间 */
    private Date              gmtCreate;
    /** 备注 */
    private String            freezeRemark;
    /** 变化余额 */
    private Long            changeBalance;
    /** 变化冻结金额  */
    private Long            changeFreezeBalance;
    /** 外部订单号 */
    private String          transOutOrderNo;
    /** 关联交易日志 */
    private long              relatedTransLog;
    
	public Long getChangeBalance() {
		return changeBalance;
	}

	public void setChangeBalance(Long changeBalance) {
		this.changeBalance = changeBalance;
	}

	public Long getChangeFreezeBalance() {
		return changeFreezeBalance;
	}

	public void setChangeFreezeBalance(Long changeFreezeBalance) {
		this.changeFreezeBalance = changeFreezeBalance;
	}

	public String getTransOutOrderNo() {
		return transOutOrderNo;
	}

	public void setTransOutOrderNo(String transOutOrderNo) {
		this.transOutOrderNo = transOutOrderNo;
	}

    public void setId(Long obj) {
        this.id = obj;
    }

    public Long getId() {
        return this.id;
    }

    public void setAccountNo(String obj) {
        this.accountNo = obj;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setActionType(String obj) {
        this.actionType = obj;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setFreezeAmount(Long obj) {
        this.freezeAmount = obj;
    }

    public Long getFreezeAmount() {
        return this.freezeAmount;
    }

    public void setBalance(Long obj) {
        this.balance = obj;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setFreezeBalance(Long obj) {
        this.freezeBalance = obj;
    }

    public Long getFreezeBalance() {
        return this.freezeBalance;
    }

    public void setActionReason(String obj) {
        this.actionReason = obj;
    }

    public String getActionReason() {
        return this.actionReason;
    }

    public void setOperator(String obj) {
        this.operator = obj;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setGmtCreate(Date obj) {
        this.gmtCreate = obj;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setFreezeMemo(String obj) {
        this.freezeRemark = obj;
    }

    public String getFreezeMemo() {
        return this.freezeRemark;
    }
    
    public long getRelatedTransLog() {
        return relatedTransLog;
    }

    public void setRelatedTransLog(long relatedTransLog) {
        this.relatedTransLog = relatedTransLog;
    }

}
