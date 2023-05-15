package jp.or.projectnumber.site.col.model;

@Deprecated
public enum EnumDeadlySin {
	GLUTONNY("暴食"),
	LUST("色欲"),
	GREED("強欲"),
	WRATH("憤怒"),
	SLOTH("怠惰"),
	PRIDE("傲慢"),
	ENVY("嫉妬");
	
	private String value;
	
	private EnumDeadlySin(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
