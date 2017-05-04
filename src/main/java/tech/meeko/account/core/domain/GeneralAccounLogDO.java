package tech.meeko.account.core.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * 总账账户日志数据对象
 *
 * @version 3.2.0
 */
public class GeneralAccounLogDO implements Serializable {
    private static final long serialVersionUID = -4747717195275504768L;
    private Long              id;
    private String            accountNo;
    private String            transDate;
    private Long              balance;
    private Date              gmtModified;
    private Date              gmtCreate;

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

    public void setTransDate(String obj) {
        this.transDate = obj;
    }

    public String getTransDate() {
        return this.transDate;
    }

    public void setBalance(Long obj) {
        this.balance = obj;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setGmtModified(Date obj) {
        this.gmtModified = obj;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtCreate(Date obj) {
        this.gmtCreate = obj;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

}
