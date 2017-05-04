package tech.meeko.account.core.domain;

import tech.meeko.account.core.Enums.AccountEnableStatusEnums;
import tech.meeko.account.core.Enums.AccountSubTypeEnum;
import tech.meeko.account.core.Enums.AccountTypeEnum;
import tech.meeko.account.core.Enums.CurrencyEnum;

import java.util.Date;

/**
 *
 * 账户数据存储对象
 *
 * (TODO 需要测试数据对象字段多与少，处理性能上差异多少？
 *  TODO 需要考虑是否要将更新信息与非更新信息拆成两个对象，然后分别存储？)
 *
 * @author sam.zhang
 *
 */
public class AccountDO {

    /** 账户号 */
    private String            accountNo;
    
    /** 1:对私,2:对公,3:内部账户,6:中间账户,8:总账账户 */
    private AccountTypeEnum accountType;

    /** 01:业务类型：0001：现金账户、0002：积分账户、0003：投资类账户、0004：收益账户、0005：活动账户、0006：红包账户 */
    private AccountSubTypeEnum accountSubType;

    /**
     * 期初余额
     */
    private Long initialBalance;
    
    /** 账户余额 */
    private long              balance;

    /** 冻结金额 */
    private long              freezeAmount;

    /**
     * 可取余额
     */
    private Long drawableBalance;
    
    /** 币种 */
    private CurrencyEnum currency = CurrencyEnum.RMB;
    
    /** 用户状态枚举(T-正常状态,B-账户被冻结,C-账户被注销,R-账户被重新打开,L-账户被临时锁定) */
    private AccountEnableStatusEnums  enabledStatus = AccountEnableStatusEnums.Trading;

    /** 账户创建时间 */
    private Date              gmtCreate;

    /** 最后修改时间 */
    private Date              gmtModified;

    /** 账户创建者 */
    private String            creator;

    /** 最后修改者 */
    private String            modifier;

    /** 账户备注 */
    private String            remark;

    /** 余额加密串 */
    private String            checkSign;
    
    /**
     * 版本号
     */
    private String versionNo;

	public void setAccountNo(String obj) {
        this.accountNo = obj;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setAccountType(AccountTypeEnum obj) {
        this.accountType = obj;
    }

    public AccountTypeEnum getAccountType() {
        return this.accountType;
    }

    public void setAccountSubType(AccountSubTypeEnum obj) {
        this.accountSubType = obj;
    }

    public AccountSubTypeEnum getAccountSubType() {
        return this.accountSubType;
    }

    public void setBalance(long obj) {
        this.balance = obj;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setFreezeAmount(long obj) {
        this.freezeAmount = obj;
    }

    public long getFreezeAmount() {
        return this.freezeAmount;
    }

    public void setEnabledStatus(AccountEnableStatusEnums obj) {
        this.enabledStatus = obj;
    }

    public AccountEnableStatusEnums getEnabledStatus() {
        return this.enabledStatus;
    }

    public void setGmtCreate(Date obj) {
        this.gmtCreate = obj;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtModified(Date obj) {
        this.gmtModified = obj;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setCreator(String obj) {
        this.creator = obj;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setModifier(String obj) {
        this.modifier = obj;
    }

    public String getModifier() {
        return this.modifier;
    }

    public String getCheckSign() {
        return checkSign;
    }

    public void setCheckSign(String checkSign) {
        this.checkSign = checkSign;
    }

	public Long getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(Long initialBalance) {
		this.initialBalance = initialBalance;
	}

	public Long getDrawableBalance() {
		return drawableBalance;
	}

	public void setDrawableBalance(Long drawableBalance) {
		this.drawableBalance = drawableBalance;
	}

	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
