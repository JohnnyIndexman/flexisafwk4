class Week {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public void printDay() {
        System.out.println("Days of The Week:");

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}