package googlemap.bhavik.git.com.logansquarecustomparsing.model;

import com.google.gson.annotations.SerializedName;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;


@JsonObject
public class CustomerRechtsFormComboListItem{

	@SerializedName("RECHTSFORM")
	@JsonField(name ="RECHTSFORM")
	private String rECHTSFORM;

	@SerializedName("Bezeichnung")
	@JsonField(name ="Bezeichnung")
	private String bezeichnung;

	public void setRECHTSFORM(String rECHTSFORM){
		this.rECHTSFORM = rECHTSFORM;
	}

	public String getRECHTSFORM(){
		return rECHTSFORM;
	}

	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung(){
		return bezeichnung;
	}

	@Override
 	public String toString(){
		return 
			"CustomerRechtsFormComboListItem{" + 
			"rECHTSFORM = '" + rECHTSFORM + '\'' + 
			",bezeichnung = '" + bezeichnung + '\'' + 
			"}";
		}
}