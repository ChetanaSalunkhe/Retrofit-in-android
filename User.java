package com.chetana.paginationassignment.Class;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class User extends Observable {
    @SerializedName("page")
    public Integer page;
    @SerializedName("per_page")
    public Integer per_page;
    @SerializedName("total")
    public Integer total;
    @SerializedName("total_pages")
    public Integer total_pages;
    @SerializedName("data")
    public List<Data> data = new ArrayList();

    public static class Data {

        @SerializedName("id")
        public Integer id;
        @SerializedName("first_name")
        public String first_name;
        @SerializedName("last_name")
        public String last_name;
        @SerializedName("email")
        public String email;
        @SerializedName("avatar")
        public String avatar;

        public Data(Integer id, String first_name, String last_name, String email, String avatar) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.email = email;
            this.avatar = avatar;
        }

        public Integer getId() {
            return id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getEmail() {
            return email;
        }

        public String getAvatar() {
            return avatar;
        }
    }

    public User(Integer page, Integer per_page, Integer total, Integer total_pages, List<Data> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }


}
