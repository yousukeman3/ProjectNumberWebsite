package jp.or.projectnumber.site.col.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColCharaFlavorRecord implements Serializable {
	private String charaName;
	private String gender;
	private String age;
	private String desire;
	private String fictionName;
	private Integer typeOfContract;
	private String engravingSpot;
	private String powerName;
	private Integer affliation;
	private String independentOrg;
	private int classNumber;
	private String[] career = new String[3];
	

}
