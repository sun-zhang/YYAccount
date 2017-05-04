package tech.meeko.account.core.Enums;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * 账户子类型枚举类
 *
 * 业务类型：0001：现金账户、0002：积分账户、0003：投资类账户、0004：收益账户、0005：活动账户、0006：红包账户
 * 
 * @author sam.zhang
 *
 */
public enum AccountSubTypeEnum {
	
	CACHE("0001", "现金账户"), 
	POINT("0002", "积分账户"), 
	INVESTMENT("0003", "投资理财账户"), 
    INCOME("0004", "收益账户"), 
    ACTIVITY("0005", "活动账户"),
    RED_PACKET("0006", "红包账户"),
    FEE_CODE("0007","保证金账户"),
	TRADE("0008","交易账户"),
	BAIL_CODE("0009","手续费账户"),
	PROVISIONS("0010","备付金账户"),
	SAFE("0011","安全账户");

    private String code;

    private String name;

    AccountSubTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
    
    public static AccountSubTypeEnum getByCode(String code) {
        for (AccountSubTypeEnum type : values()) {
            if (type.getCode().equals(code))
                return type;
        }
        return null;
    }
    public static Map<String,String> toMap() {
	       Map<String,String> map = new HashMap<String,String>();
	       for (AccountSubTypeEnum item : AccountSubTypeEnum.values()) {
	           map.put(item.getCode(), item.getName());
	       }
	       return map;
	   }
}
