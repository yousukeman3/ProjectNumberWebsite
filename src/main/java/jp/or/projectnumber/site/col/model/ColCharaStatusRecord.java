package jp.or.projectnumber.site.col.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColCharaStatusRecord implements Serializable {
	
	private Integer deadlySin;
	private Integer charaFeature;
	private Integer abilityStyle;
	
	private List<ColCommonSkillRecord> commonSkillRecordList;
	
	private Integer contractLevel;
	
	private Integer initalExp;
	
	private Integer reactionUsedExp;
	private Integer effectUsedExp;
	private Integer physicalUsedExp;
	private Integer mentalUsedExp;
	
	private Integer[] engravingNums;
	private Integer demonGateNum;
	
	private String triggerName;
	private String triggerDirection;
	
	

}
