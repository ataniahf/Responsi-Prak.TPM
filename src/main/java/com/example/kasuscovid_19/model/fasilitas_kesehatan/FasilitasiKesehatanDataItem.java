package com.example.kasuscovid_19.model.fasilitas_kesehatan;

import com.google.gson.annotations.SerializedName;

public class FasilitasiKesehatanDataItem {
//mendeklarasikan nama yang terdapat di data API
	@SerializedName("rujukan")
	private Object rujukan;

	public void setRujukan(Object rujukan){
		this.rujukan = rujukan;
	}

	public Object getRujukan(){
		return rujukan;
	}

	@SerializedName("nama")
	private String nama;

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	@SerializedName("tipe_faskes")
	private int tipeFaskes;

	public void setTipeFaskes(int tipeFaskes){
		this.tipeFaskes = tipeFaskes;
	}

	public int getTipeFaskes(){
		return tipeFaskes;
	}


	@SerializedName("latitude")
	private double latitude;


	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	@SerializedName("telepon")
	private String telepon;

	public void setTelepon(String telepon){
		this.telepon = telepon;
	}

	public String getTelepon(){
		return telepon;
	}

	@SerializedName("kode_kemkes")
	private Object kodeKemkes;

	public void setKodeKemkes(Object kodeKemkes){
		this.kodeKemkes = kodeKemkes;
	}

	public Object getKodeKemkes(){
		return kodeKemkes;
	}

	@SerializedName("url")
	private Object url;

	public void setUrl(Object url){
		this.url = url;
	}

	public Object getUrl(){
		return url;
	}

	@SerializedName("alamat")
	private String alamat;

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	@SerializedName("longitude")
	private double longitude;

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	@SerializedName("nomor_rujukan")
	private int nomorRujukan;

	public void setNomorRujukan(int nomorRujukan){
		this.nomorRujukan = nomorRujukan;
	}

	public int getNomorRujukan(){
		return nomorRujukan;
	}
}