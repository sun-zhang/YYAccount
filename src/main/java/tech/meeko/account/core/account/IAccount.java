package tech.meeko.account.core.account;


import tech.meeko.account.core.Enums.AccountEnableStatusEnums;
import tech.meeko.account.core.Enums.AccountSubTypeEnum;
import tech.meeko.account.core.Enums.AccountTypeEnum;
import tech.meeko.account.core.money.Money;

/**
 * 账户接口抽象
 *
 * @author sam.zhang
 *
 */
public interface IAccount {

    /**
     * 账户号
     * @return string
     */
    public String getAccountNo();


    /**
     * 账户类型
     * @return AccountTypeEnum
     */
    public AccountTypeEnum getAccountType();


    /**
     * 账户总余额
     * @return money
     */
    public Money getBalance();

    /**
     * 账户冻结余额
     * @return money
     */
    public Money getFreezeAmount();

    /**
     * 账户状态
     * @return AccountEnableStatusEnums
     */
    public AccountEnableStatusEnums getEnabledStatus();


    /**
     * 二级业务类型
     * @return
     */
    public AccountSubTypeEnum getAccountSubType();
    

    /**
     * 修改余额
     * @param transAmount
     */
    public void modifyBalace(Money transAmount);

    /**
     * 修改冻结余额
     * @param freezeAmount
     */
    public void modifyFreezeBalace(Money freezeAmount);

    /**
     * 获取账户余额加密串
     * @return string
     */
    public String getCheckSign();

    
    /**
     * 账户可取余额
     * @return money
     */
    public Money getDrawableBalance();
    
    /**
     * 修改可取余额
     * @param transAmount
     */
	public void modifyDrawableBalance(Money transAmount);

    /**
     * 备注
     * @return string
     */
    public String getRemark();

}
