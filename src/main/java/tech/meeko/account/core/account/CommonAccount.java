package tech.meeko.account.core.account;

import tech.meeko.account.core.base.Account;

/**
 * Created by Sam on 5/3/17.
 */
public class CommonAccount {

    /**
     * 账户基础信息
     */
    private Account account;

    public CommonAccount(Account account) {
        this.account = account;
    }

    /**
     * 获取账户余额
     *
     * @return
     */
    public Long getBalance(){
        return this.account.getBalance().longValue();
    }

    /**
     * 获取账户可用余额
     *
     * @return
     */
    public Long getAvailableBalance(){
        if (this.account.getBalance().longValue()>this.getFrozenBalance().longValue()){
            return this.account.getBalance().longValue()-this.account.getFrozenBalance().longValue();
        }else{
            return 0L;
        }
    }

    /**
     * 获取账户冻结余额
     *
     * @return
     */
    public Long getFrozenBalance(){
        return this.account.getFrozenBalance().longValue();
    }

    /**
     * 增加账户余额
     *
     * @param amount
     * @return
     */
    public void increaseBalance(Long amount){
        this.account.getBalance().addAndGet(amount);
    }


    /**
     * 减少账户余额
     *
     * @param amount
     * @return
     */
    public void reduceBalance(Long amount){
        if (amount>0){
            amount = -amount;
        }
        increaseBalance(amount);
    }



}
