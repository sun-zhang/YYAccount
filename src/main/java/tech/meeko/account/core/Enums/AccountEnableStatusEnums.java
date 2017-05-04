package tech.meeko.account.core.Enums;

/**
 * 账户有效状态枚举类
 *
 * T-可交易状态,F-账户被冻结,C-账户被注销,R-账户被重新打开,L-账户被临时锁定
 *
 * Created by Sam on 4/28/17.
 */
public enum AccountEnableStatusEnums {

    Trading("T","可交易"),
    Frozen("F","冻结"),
    Canceled("C","注销"),
    Reset("R","重新打开"),
    Locked("L","临时锁定");


    AccountEnableStatusEnums(String code, String name){
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static AccountEnableStatusEnums getByCode(String code) {
        for (AccountEnableStatusEnums type : values()) {
            if (type.getCode().equals(code))
                return type;
        }
        return null;
    }
}
