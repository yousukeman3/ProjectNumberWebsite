package jp.or.projectnumber.site.col.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColCommonSkillRecord implements Serializable {
	
	private Integer skillId;
	private String defaultSkillNameString;
	private String skillName;
	private String timing;
	private String cost;
	private String skillEffect;
	private String direction;

}
