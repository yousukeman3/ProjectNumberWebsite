package jp.or.projectnumber.site.col.model;

@Deprecated
public enum EnumAbilityStyle {
	COMBAT_TYPE("戦闘型"),
	NEGOTIATION_TYPE("交渉型"),
	VERSATILE("万能型"),
	EXPLORATORY("探索型"),
	STEALTH_TYPE("隠密型"),
	GENIUS_TYPE_SEARCH("奇才型(探索フェイズ)"),
	GENIUS_TUPE_CLIMAX("奇才型(クライマックス)");
	
	private String value;
	
	private EnumAbilityStyle(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}