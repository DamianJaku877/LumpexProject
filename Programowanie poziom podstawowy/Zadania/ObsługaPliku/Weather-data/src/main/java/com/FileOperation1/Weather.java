package com.FileOperation1;

import java.util.Date;


public class Weather {
    private Date date;
    private int max_temp;
    private int mean_temp;
    private int min_temp;

    public Weather(Date date, int max_temp, int mean_temp, int min_temp) {
        this.date = date;
        this.max_temp = max_temp;
        this.mean_temp = mean_temp;
        this.min_temp = min_temp;
    }

    public Date getDate() {
        return date;
    }

    public int getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(int max_temp) {
        this.max_temp = max_temp;
    }

    public int getMean_temp() {
        return mean_temp;
    }

    public void setMean_temp(int mean_temp) {
        this.mean_temp = mean_temp;
    }

    public int getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(int min_temp) {
        this.min_temp = min_temp;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date=" + date +
                ", max_temp=" + max_temp +
                ", mean_temp=" + mean_temp +
                ", min_temp=" + min_temp +
                '}';
    }
}
