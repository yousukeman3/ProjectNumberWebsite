package jp.or.projectnumber.site.col.model;

@Deprecated
public enum EnumTypeOfContract {
	HEAVEN("天界"),
	HELL("魔界"),
	FALL("堕天");
	
	private EnumTypeOfContract(String value) {
		this.value = value;
	}
	
	private String value;

	public String getValue() {
		return value;
	}
}
