package com.example.android.ice_breaker_v2;

public class User {

    private int mUser_img = NO_IMAGE;
    private String mUser_fname, mUser_lname;
    private static final int NO_IMAGE = -1;
    private int mUser_age;
    private String mUser_city;

    public User(String fn, String ln, int age, String city){
        mUser_age = age;
        mUser_city = city;
        mUser_lname = ln;
        mUser_fname = fn;
    }

    public User(String fn, int age, String city){
        mUser_age = age;
        mUser_city = city;
        mUser_fname = fn;
    }


    public User(String fn, String ln, int age, String city, int image){
        mUser_age = age;
        mUser_city = city;
        mUser_lname = ln;
        mUser_fname = fn;
        mUser_img = image;
    }

    public int getmUser_img() {
        return mUser_img;
    }

    public String getmUser_fname() {
        return mUser_fname;
    }

    public String getmUser_lname() {
        return mUser_lname;
    }

    public int getmUser_age() {
        return mUser_age;
    }

    public String getmUser_city() {
        return mUser_city;
    }

    public boolean hasImage(){
        return mUser_img != NO_IMAGE;
    }
}
