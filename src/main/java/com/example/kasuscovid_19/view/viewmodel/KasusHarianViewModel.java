package com.example.kasuscovid_19.view.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kasuscovid_19.model.kasus_harian.KasusHarianDataItem;
import com.example.kasuscovid_19.model.kasus_harian.KasusHarianResponse;
import com.example.kasuscovid_19.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class KasusHarianViewModel extends ViewModel {
    //mengatur tampilan data api yang ada di layar dari kasus harian covid
    private ApiMain apiMain;
    private MutableLiveData<ArrayList<KasusHarianDataItem>> listKasusHarian = new MutableLiveData<>();

    public void setKasusHarianDiscover() {
        if(this.apiMain==null){
            apiMain = new ApiMain();
        }

        apiMain.getApiKasusHarian().getKasusHarian().enqueue(new Callback<KasusHarianResponse>() {
            @Override
            public void onResponse(Call<KasusHarianResponse> call, Response<KasusHarianResponse> response) {
                KasusHarianResponse kasusHarianRespone = response.body();
                if(kasusHarianRespone != null && kasusHarianRespone.getData() != null){
                    ArrayList<KasusHarianDataItem> kasusharianItem = kasusHarianRespone.getData().getContent();
                    listKasusHarian.postValue(kasusharianItem);
                }
            }

            @Override
            public void onFailure(Call<KasusHarianResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<KasusHarianDataItem>> getKasusHarianDiscover(){
        return listKasusHarian;
    }
}
