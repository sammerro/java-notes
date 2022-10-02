package behavioral_test.observer;

import java.util.HashMap;
import java.util.Map;

public class Plot implements Subscriber {

    private StockPrice dataSource;

    private Map<Long, Double> points = new HashMap<>();
    private String color = "#000";
    private String background = "#FFF";


    public Plot(StockPrice dataSource) {
        this.dataSource = dataSource;
    }

    public void render() {
        System.out.println(this);
    }


    @Override
    public void reactToChange() {
        long l = System.currentTimeMillis();
        points.put(l, dataSource.getPrice());
        render();
    }

    @Override
    public String toString() {
        return "Plot{" +
                "dataSource=" + dataSource +
                ", points=" + points +
                ", color='" + color + '\'' +
                ", background='" + background + '\'' +
                '}';
    }
}
