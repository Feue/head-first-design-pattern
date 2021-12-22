package com.feue.DesignPattern.ProxyPattern.DynamicProxy;

/**
 * @author Feue
 * @create 2021-12-22 12:15
 */
public class Person implements PersonBean {
    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        return ratingCount == 0 ? 0 : rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }

    public String fun() {
        return "Hello";
    }
}
