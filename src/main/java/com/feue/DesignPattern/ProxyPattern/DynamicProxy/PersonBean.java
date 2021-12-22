package com.feue.DesignPattern.ProxyPattern.DynamicProxy;

/**
 * @author Feue
 * @create 2021-12-22 12:13
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    String fun();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interest);
    void setHotOrNotRating(int rating);
}
