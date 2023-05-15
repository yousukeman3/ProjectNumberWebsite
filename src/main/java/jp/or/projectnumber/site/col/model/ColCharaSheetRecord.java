package jp.or.projectnumber.site.col.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ColCharaSheetRecord implements Serializable{
	private int charaId;
	private String acsessToken;
	private int accountId;
	private boolean softDeleteFlag;
	private String picturePath;
	private String protection;
	private ColCharaFlavorRecord colCharaFlavorRecord;

}
