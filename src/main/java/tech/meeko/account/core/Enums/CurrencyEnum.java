/**
 * 
 */
package tech.meeko.account.core.Enums;

/**
 * 币种枚举
 * @author sun.zhang
 *
 */
public enum CurrencyEnum {

	RMB("01", "人民币");

    private String code;

    private String name;

    CurrencyEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getValue() {
        return this.name;
    }
    
    public static CurrencyEnum getByKey(String code) {
        for (CurrencyEnum type : values()) {
            if (type.getCode().equals(code))
                return type;
        }
        return null;
    }
}
