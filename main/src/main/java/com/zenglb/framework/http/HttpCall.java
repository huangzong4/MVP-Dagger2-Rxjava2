package com.zenglb.framework.http;

/**
 * Api service
 *
 * Created by zlb on 2017/12/26.
 */
@Deprecated
public class HttpCall {

    public static ApiService apiService;

    /**
     * 获取Service
     * @return
     */
    @Deprecated
    public static ApiService getApiService() {
        if(apiService==null){
            apiService=HttpRetrofit.getRetrofit(null,null).create(ApiService.class);
        }

        return apiService;
    }

}
