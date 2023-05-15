package jp.or.projectnumber.site.col.model;

@Deprecated
public enum EnumCharaFeature {
	
	BADLUCK("悪運"),
	SADISM("サディズム"),
	MASOCHISM("マゾヒズム"),
	CLOWN("道化師"),
	STRATEGIST("軍師"),
	PURSUER("追及者"),
	BATTLE_SENSE("戦闘センス"),
	RELATED_TO_GOD("神に連なるもの"),
	GLUTTON("食いしん坊"),
	INDOMITABLE("不撓不屈"),
	INSTANT_FOOT("瞬足"),
	AVENGER("復讐者"),
	FIGHTING_SPIRIT("逆境闘志"),
	CLUMSY_PERSON("ドジっ子"),
	WILD_PERSON("野生児"),
	WEAPON_USER("武器使い"),
	RIVALRY("群雄割拠"),
	HEAVY_BLOW("重い一撃"),
	SUCCESSOR("伝承者"),
	GROWTH_PERIOD("成長期"),
	SUPERNATURAL_PERSON("異能者");
	
	private String value;
	
	private EnumCharaFeature(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
