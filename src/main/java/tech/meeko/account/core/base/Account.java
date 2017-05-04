package tech.meeko.account.core.base;

import tech.meeko.account.core.Enums.AccountEnableStatusEnums;
import tech.meeko.account.core.Enums.AccountTypeEnum;
import tech.meeko.account.core.Enums.CurrencyEnum;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * 基础账户实现类
 *
 * Created by Sam on 5/3/17.
 */
public class Account{

    /**
     * 账户号
     */
    private long accountNo;

    /**
     * 帐户总余额
     */
    private AtomicLong balance ;

    /**
     * 可用余额（TODO 确认是否有存在的必要，如果存在性能影响多大？）
     *
     * 测试结果：
     *  如果存在）在更新balance的同时更新availableBalance性能下降50%，因此暂时不启用此字段
     */
    private AtomicLong availableBalance;

    /**
     * 冻结余额
     */
    private AtomicLong frozenBalance;

    /**
     * 账户状态
     */
    private AccountEnableStatusEnums accountEnableStatusEnums = AccountEnableStatusEnums.Trading;

    /**
     * 账户类型
     */
    private AccountTypeEnum accountType = AccountTypeEnum.PRIVATE_ACCOUNT;

    /**
     * 币种
     */
    private CurrencyEnum currency = CurrencyEnum.RMB;

    public Account() {
        this.accountNo = -1L;
        this.balance = new AtomicLong(0);
        this.availableBalance = new AtomicLong(0);
        this.frozenBalance = new AtomicLong(0);
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public AtomicLong getBalance() {
        return balance;
    }

    /**
     * 直接设置账户余额到指定金额
     * 如果只是正常的余额变动不应直接设置账户金额，
     * 应该使用@increaseBalance和@reduceBalance方法
     *
     * @param balance
     */
    public void resetBalance(Long balance) {
        this.balance = new AtomicLong(balance);
    }

    /**
     * 直接设置账户余额到0元0分
     * 如果只是正常的余额变动不应直接设置账户金额，
     * 应该使用@increaseBalance和@reduceBalance方法
     *
     */
    public void resetBalance() {
        this.resetBalance(0L);
    }

    public AtomicLong getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(AtomicLong frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public AccountEnableStatusEnums getAccountEnableStatusEnums() {
        return accountEnableStatusEnums;
    }

    public void setAccountEnableStatusEnums(AccountEnableStatusEnums accountEnableStatusEnums) {
        this.accountEnableStatusEnums = accountEnableStatusEnums;
    }

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

}
