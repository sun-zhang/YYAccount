/**
 * 
 */
package tech.meeko.account.core.Enums;

/**
 *
 * 账户类型枚举类
 *
 * 1:对私,2:对公,3:内部账户,6:中间账户,8:总账账户
 * 
 * @author sam.zhang
 *
 */
public enum AccountTypeEnum {
	
	PRIVATE_ACCOUNT(1,"对私账户"),
	PUBLIC_ACCOUNT(2,"对公账户"),
	INNER_ACCOUNT(3,"内部账户"),
	MIDDLE_ACCOUNT(6,"中间账户"),
	GENERAL_ACCOUNT(8,"总账账户");
	
	AccountTypeEnum(int code, String name){
		this.code = code;
		this.name = name;
	}
	
	private int code;
	private String name;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 public static AccountTypeEnum getByCode(int code) {
        for (AccountTypeEnum type : values()) {
            if (type.getCode()==code)
                return type;
        }
        return null;
    }
	
}
