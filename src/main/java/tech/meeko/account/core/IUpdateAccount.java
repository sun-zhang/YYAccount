package tech.meeko.account.core;

import tech.meeko.account.core.account.IAccount;

/**
 *
 * 更新账户操作接口
 *
 * Created by Sam on 4/28/17.
 */
public interface IUpdateAccount {

    /**
     * 设置帐务相关的账户（TODO 需要考虑相关账户问题，是否有必要？）
     * @param otherAccount
     */
    public void setOtherAccount(IAccount otherAccount);

    /**
     * 获取相关账户
     * @return account
     */
    public IAccount getOtherAccount();

}
