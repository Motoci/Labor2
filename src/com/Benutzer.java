package com;

import java.util.List;

public class Benutzer implements Sport {
    private String firstName;
    private String lastName;
    private List<Sport> sportList;

    public String getLastName() { return lastName; }
    public void setLastName(String _lastName) { lastName = _lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String _firstName) { firstName = _firstName; }

    public List<Sport> getSportList() { return sportList; }
    public void setSportList(List<Sport> _sportList) { sportList = _sportList; }

    public double calculateTime() {
        int minutes = 0;
        for (Sport i : sportList) {
            minutes += i.calculateTime();
        }
        return minutes;
    }

    public double calculateTime(Sport _s) {
        double specificTypeOfSport = 0;
        for (Sport i : sportList) {
            if (_s.calculateTime() == i.calculateTime())
                specificTypeOfSport += _s.calculateTime();
        }
        return specificTypeOfSport;
    }

    public double calculateAverageTime() {
        return calculateTime()/sportList.size();
    }
}
