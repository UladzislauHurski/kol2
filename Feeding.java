import java.time.LocalDate;
import java.util.Date;

public class Feeding {
    public LocalDate date;
    public double foodAmount;
    public boolean isLiquid;

    public Feeding(LocalDate now, int foodAmount, boolean isLiquid) {
        date = now;
        this.foodAmount = foodAmount;
        this.isLiquid = isLiquid;
    }
}
