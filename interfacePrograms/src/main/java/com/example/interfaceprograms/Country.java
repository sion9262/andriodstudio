package com.example.interfaceprograms;

public class Country  implements Meaurable {

    private double area;
    private String country;

    public void setArea(double area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Country(){

    }

    public Country(String country, double area){
        this.country = country;
        this.area = area;

    }

    public double getArea(){
        return area;
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
