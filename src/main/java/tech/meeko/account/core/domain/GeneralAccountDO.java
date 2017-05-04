package tech.meeko.account.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 总账账户数据对象（TODO 考虑是否真的需要总账账户？？）
 *
 * @version 3.2.0
 */
public class GeneralAccountDO   implements Serializable {
    private static final long serialVersionUID = 4874599840441969939L;
    private String accountNo;
    private Long balance;
    private String accountName;
    private String lastModifyOperator;
    private Date gmtModified;

    public void setAccountNo(String obj) {
        this.accountNo = obj;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setBalance(Long obj) {
        this.balance = obj;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setAccountName(String obj) {
        this.accountName = obj;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setLastModifyOperator(String obj) {
        this.lastModifyOperator = obj;
    }

    public String getLastModifyOperator() {
        return this.lastModifyOperator;
    }

    public void setGmtModified(Date obj) {
        this.gmtModified = obj;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

}