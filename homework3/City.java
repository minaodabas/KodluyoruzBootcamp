import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.TimeZone;

public class City implements Clock,Comparable<City>{

    public String CityName;

    public String CityCode;

    public String Gmt;


    public City(String CityName, String CityCode, String Gmt) {
        this.CityName = CityName;
        this.CityCode = CityCode;
        this.Gmt = Gmt;
    }

    public City() {

    }

    public String getCityCode() {
        return CityCode;
    }

    public void setCityCode(String cityCode) {
        this.CityCode = CityCode;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getGmt() {
        return Gmt;
    }

    public void setGmt(String gmt) {
        Gmt = gmt;
    }

    @Override
    public void showTime() {

        SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        sd.setTimeZone(TimeZone.getTimeZone(Gmt));
        System.out.println(getCityName() + " : " + sd.format(time));




    }

    @Override
    public int compareTo(City c) {
        char thiscityname = this.getCityName().charAt(0);
        char ccityname =c.getCityName().charAt(0);
        if(thiscityname > ccityname){
            return 1;
        }
        else if(thiscityname < ccityname){
            return -1;
        }



        return 0;

    }













    }



