package com.example.kasuscovid_19.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiMain {
    private Retrofit retrofit;

    //mengambil data api berisi fasilitas kesehatan berupa alamat rumah sakit
    public FasilitasKesehatanRepository getApiFasilitasKesehatan(){
        String BASE_URL = "https://covid19-public.digitalservice.id/api/v1/";
        if(retrofit==null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(FasilitasKesehatanRepository.class);
    }

    //mengambil data api berisi kasus harian covid di jawa barat
    public KasusHarianRepository getApiKasusHarian(){
        String BASE_URL = "https://covid19-public.digitalservice.id/api/v1/";
        if(retrofit==null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(KasusHarianRepository.class);
    }
}
