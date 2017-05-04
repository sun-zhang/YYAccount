package tech.meeko.account.core;

import tech.meeko.account.core.account.IAccount;

/**
 * 账户查询类
 * 复杂各种类型的账户查询
 * Created by Sam on 4/28/17.
 */
public interface IQueryAccount {

    public IAccount queryAccountByID();
}
