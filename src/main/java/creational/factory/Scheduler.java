package creational.factory;

import java.util.Date;

public abstract class Scheduler {
    private Calendar calendar;

    public Calendar getCalendar() {
        if (this.calendar != null) {
            return this.calendar;
        }
        this.calendar = this.createCalendar();

        return this.calendar;
    }
    protected abstract Calendar createCalendar();

    public void schedule(Event event) {
        Calendar calendar = this.getCalendar();
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
