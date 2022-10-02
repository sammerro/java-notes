package creational.factory;

public class ArabicScheduler extends Scheduler {

    @Override
    protected Calendar createCalendar() {
        return new ArabicCalendar();
    }
}
