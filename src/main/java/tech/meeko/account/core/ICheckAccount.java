package tech.meeko.account.core;

import tech.meeko.account.core.money.Money;

/**
 *
 * 检查账户是否满足要求查询接口
 *
 * Created by Sam on 4/28/17.
 */
public interface ICheckAccount {


    /**
     * 检查账户状态是否正常
     * @return true or false
     */
    public boolean checkEnableStatus();


    /**
     * 检查余额是否足够
     * @param transAmount
     * @return true or false
     */
    public boolean checkBalance(Money transAmount);

    /**
     * 检查可取余额是否足够
     * @param amount
     * @return
     */
    public boolean checkDrawableBalance(Money amount);


    /**
     * 检查冻结金额是否足够
     * @param amount
     * @return
     */
    public boolean checkFreezeBalance(Money amount);


    /**
     * 校验账户余额是否满足交易金额
     * @param transAmount
     * @return
     */
    public boolean checkAccountBalance(Money transAmount);

}
