package googlemap.bhavik.git.com.logansquarecustomparsing.model;

import com.google.gson.annotations.SerializedName;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class BVODeviceTypeListItem{

	@SerializedName("GeraeettypID")
	@JsonField(name ="GeraeettypID")
	private String geraeettypID;

	@SerializedName("Hoehengruppe")
	@JsonField(name ="Hoehengruppe")
	private String hoehengruppe;

	@SerializedName("arbeitshoehe")
	@JsonField(name ="arbeitshoehe")
	private String arbeitshoehe;

	@SerializedName("Bezeichnung")
	@JsonField(name ="Bezeichnung")
	private String bezeichnung;

	public void setGeraeettypID(String geraeettypID){
		this.geraeettypID = geraeettypID;
	}

	public String getGeraeettypID(){
		return geraeettypID;
	}

	public void setHoehengruppe(String hoehengruppe){
		this.hoehengruppe = hoehengruppe;
	}

	public String getHoehengruppe(){
		return hoehengruppe;
	}

	public void setArbeitshoehe(String arbeitshoehe){
		this.arbeitshoehe = arbeitshoehe;
	}

	public String getArbeitshoehe(){
		return arbeitshoehe;
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
			"BVODeviceTypeListItem{" + 
			"geraeettypID = '" + geraeettypID + '\'' + 
			",hoehengruppe = '" + hoehengruppe + '\'' + 
			",arbeitshoehe = '" + arbeitshoehe + '\'' + 
			",bezeichnung = '" + bezeichnung + '\'' + 
			"}";
		}
}