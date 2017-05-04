package tech.meeko.account.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *  账务日志数据对象
 *
 */
public class AccountLogDO implements Serializable {
    private static final long serialVersionUID = -1177505130088858291L;

    private Long              id;
    private Long              transLogId;
    private String            transDate;
    private String            outDate;
    private Date              transDt;
    private String            transCode;
    private String            subTransCode;
    private Long              transAmount;
    private long              balance;
    private Long              freezeBalance;
    private int               accountType;
    private String            transAccount;
    private int               otherAccountType;
    private String            otherAccount;
    private String            transInstitution;
    private String            transOutOrderNo;
    private String            bankType;
    private String            cardType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransLogId() {
        return transLogId;
    }

    public void setTransLogId(Long transLogId) {
        this.transLogId = transLogId;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public Date getTransDt() {
        return transDt;
    }

    public void setTransDt(Date transDt) {
        this.transDt = transDt;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getSubTransCode() {
        return subTransCode;
    }

    public void setSubTransCode(String subTransCode) {
        this.subTransCode = subTransCode;
    }

    public Long getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(Long transAmount) {
        this.transAmount = transAmount;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Long getFreezeBalance() {
        return freezeBalance;
    }

    public void setFreezeBalance(Long freezeBalance) {
        this.freezeBalance = freezeBalance;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getTransAccount() {
        return transAccount;
    }

    public void setTransAccount(String transAccount) {
        this.transAccount = transAccount;
    }

    public int getOtherAccountType() {
        return otherAccountType;
    }

    public void setOtherAccountType(int otherAccountType) {
        this.otherAccountType = otherAccountType;
    }

    public String getOtherAccount() {
        return otherAccount;
    }

    public void setOtherAccount(String otherAccount) {
        this.otherAccount = otherAccount;
    }

    public String getTransInstitution() {
        return transInstitution;
    }

    public void setTransInstitution(String transInstitution) {
        this.transInstitution = transInstitution;
    }

    public String getTransOutOrderNo() {
        return transOutOrderNo;
    }

    public void setTransOutOrderNo(String transOutOrderNo) {
        this.transOutOrderNo = transOutOrderNo;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getTransMemo() {
        return transMemo;
    }

    public void setTransMemo(String transMemo) {
        this.transMemo = transMemo;
    }

    public String getTransOperator() {
        return transOperator;
    }

    public void setTransOperator(String transOperator) {
        this.transOperator = transOperator;
    }

    public String getTransTerminal() {
        return transTerminal;
    }

    public void setTransTerminal(String transTerminal) {
        this.transTerminal = transTerminal;
    }

    private String            transMemo;
    private String            transOperator;
    private String            transTerminal;


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountLogDO)) {
            return false;
        }
        final AccountLogDO accountlog = (AccountLogDO) o;
        return this.hashCode() == accountlog.hashCode();
    }


}
