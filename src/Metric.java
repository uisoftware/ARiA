import com.sun.javafx.font.FontStrike;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by tanhaei on 15/6/2 AD.
 */
public class Metric {
    public String ID;
    public String name;
    public MetricType type;
    public Float sourceValue;
    public Float targetValue;

    public Metric(String id) {
        this.ID = id;
    }


    private static List<Metric> Metrics = new ArrayList<Metric>();

    public static Metric searchById(String id) {
        if (Metrics == null) return null;
        Iterator<Metric> it = Metrics.iterator();
        while (it.hasNext()) {
            Metric metric = it.next();
            if (metric.ID.equals(id)) {
                return metric;
            }
        }
        return null;
    }

    public static void addToMetrics(Metric g) {
        Metrics.add(g);
    }
}
