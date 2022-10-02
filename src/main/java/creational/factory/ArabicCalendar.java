package creational.factory;

import java.util.Date;

public class ArabicCalendar implements Calendar{

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given Arabic date.");
    }
}
