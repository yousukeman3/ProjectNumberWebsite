package jp.or.projectnumber.site.col.model;

@Deprecated
public enum EnumAffliation {
	ODD("ODD"),
	EVEN("EVEN"),
	CERBERUS("ケルベロス"),
	INDEPENDENT("無所属");
	
	private String value;
	
	private EnumAffliation(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}


}
