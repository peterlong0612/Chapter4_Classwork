package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("id")
    String id;
    @SerializedName("url")
    String url;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }


    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
