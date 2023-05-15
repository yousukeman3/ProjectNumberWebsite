package jp.or.projectnumber.site.col.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColDeadlySinSkillRecord implements Serializable {
	private Integer skillId;
	private String defaultSkillNameString;
	private Integer DeadlySinId;
	private String skillName;
	private String timing;
	private String cost;
	private String numOfUses;
	private String target;
	private String mainJudge;
	private String skillEffect;
	private String direction;

}
