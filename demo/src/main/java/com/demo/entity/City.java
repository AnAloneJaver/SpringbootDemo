package com.demo.entity;

public class City {
    private Long id;

    private String nameTest;

    private String state;

    private String test;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", nameTest='" + nameTest + '\'' +
                ", state='" + state + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
