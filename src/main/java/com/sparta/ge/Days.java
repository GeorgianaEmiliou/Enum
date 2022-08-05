package com.sparta.ge;

//enum is a class. there is a limit to the types
//Enums cannot extend other classes because they already have one parent

public enum Days {
    MONDAY("Monday", 0),
    TUESDAY("Tuesday", 1),
    WEDNESDAY("Wednesday", 2),
    THURSDAY("Tuesday", 3),
    FRIDAY("Friday", 4),
    SATURDAY("Saturday", 5),
    SUNDAY("Sunday", 6);

    private String name;
    private int dayOfWeek;

    Days(String name, int dayOfWeek) {
        this.name = name;
        this.dayOfWeek = dayOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
