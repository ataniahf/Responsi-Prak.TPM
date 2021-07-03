package com.example.kasuscovid_19.service;

import com.example.kasuscovid_19.model.fasilitas_kesehatan.FasilitasKesehatanResponse;

import com.example.kasuscovid_19.model.kasus_harian.KasusHarianResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface KasusHarianRepository {
    //mengambil get api
    @GET("rekapitulasi_v2/jabar/kumulatif")
    Call<KasusHarianResponse> getKasusHarian();

}
