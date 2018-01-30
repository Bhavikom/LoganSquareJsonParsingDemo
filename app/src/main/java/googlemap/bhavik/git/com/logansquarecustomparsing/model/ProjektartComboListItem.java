package googlemap.bhavik.git.com.logansquarecustomparsing.model;


import com.google.gson.annotations.SerializedName;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class ProjektartComboListItem{

	@SerializedName("Objektart")
	@JsonField(name ="Objektart")
	private String objektart;

	@SerializedName("Bezeichnung")
	@JsonField(name ="Bezeichnung")
	private String bezeichnung;

	public void setObjektart(String objektart){
		this.objektart = objektart;
	}

	public String getObjektart(){
		return objektart;
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
			"ProjektartComboListItem{" + 
			"objektart = '" + objektart + '\'' + 
			",bezeichnung = '" + bezeichnung + '\'' + 
			"}";
		}
}