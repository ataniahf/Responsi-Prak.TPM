package com.example.kasuscovid_19.model.kasus_harian;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("metadata")
	private Metadata metadata;

	@SerializedName("content")
	private ArrayList<KasusHarianDataItem> content;

	public Metadata getMetadata(){
		return metadata;
	}

	public ArrayList<KasusHarianDataItem> getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"metadata = '" + metadata + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}