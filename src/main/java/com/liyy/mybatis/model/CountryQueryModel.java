package com.liyy.mybatis.model;

public class CountryQueryModel extends QueryModel {

    private Country country;

    public CountryQueryModel() {
        this(new Country());
    }

    public CountryQueryModel(Country country) {
        this.country = country;
    }

    public Integer getId() {
        return country.getId();
    }

    public void setId(Integer id) {
        country.setId(id);
    }

    public String getCountrycode() {
        return country.getCountryCode();
    }

    public void setCountryCode(String countryCode) {
        country.setCountryCode(countryCode);
    }

    public String getCountryName() {
        return country.getCountryName();
    }

    public void setCountryName(String countryName) {
        country.setCountryName(countryName);
    }
}