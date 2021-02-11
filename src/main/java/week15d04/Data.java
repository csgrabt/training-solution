package week15d04;

import java.time.LocalDate;
import java.util.Locale;

public class Data {
    private LocalDate date;
    private Week week;
    private int casesWeekly;
    private int deathsWeekly;
    private String countriesAndTerritories;
    private String geiId;
    private String countryTerritoryCode;
    private double popData2019;
    private String continentExp; //lehetne enum is
    private int notificationRatePer100000Population14Days;
    private String comment;

    public Data(String comment) {
        this.comment = comment;
    }

    public Data(LocalDate date, Week week, int casesWeekly, int deathsWeekly, String countriesAndTerritories) {
        this.date = date;
        this.week = week;
        this.casesWeekly = casesWeekly;
        this.deathsWeekly = deathsWeekly;
        this.countriesAndTerritories = countriesAndTerritories;
    }

    public Data(LocalDate date, Week week, int casesWeekly, int deathsWeekly, String countriesAndTerritories, String geiId, String countryTerritoryCode, double popData2019, String continentExp) {
        this.date = date;
        this.week = week;
        this.casesWeekly = casesWeekly;
        this.deathsWeekly = deathsWeekly;
        this.countriesAndTerritories = countriesAndTerritories.toUpperCase();
        this.geiId = geiId;
        this.countryTerritoryCode = countryTerritoryCode;
        this.popData2019 = popData2019;
        this.continentExp = continentExp;

    }


    public LocalDate getDate() {
        return date;
    }

    public Week getWeek() {
        return week;
    }

    public int getCasesWeekly() {
        return casesWeekly;
    }

    public int getDeathsWeekly() {
        return deathsWeekly;
    }

    public String getCountriesAndTerritories() {
        return countriesAndTerritories;
    }

    public String getGeiId() {
        return geiId;
    }

    public String getCountryTerritoryCode() {
        return countryTerritoryCode;
    }

    public double getPopData2019() {
        return popData2019;
    }

    public String getContinentExp() {
        return continentExp;
    }

    public int getNotificationRatePer100000Population14Days() {
        return notificationRatePer100000Population14Days;
    }

    @Override
    public String toString() {
        return
                date + "," +
                        week + "," +
                        casesWeekly + "," +
                        deathsWeekly + "," +
                        countriesAndTerritories

                ;
    }
}
