import java.time.LocalDate;
import java.util.ArrayList;

public class Zebra implements Animal {
    public String name;
    public boolean sick;
    public Sex sex;
    public ArrayList<Feeding> feedings = new ArrayList<>();

    public Zebra(String name, Sex sex, boolean sick) {
        this.name = name;
        this.sex = sex;
        this.sick = sick;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isSick() {
        return sick;
    }

    @Override
    public void setSick(boolean sick) {
        this.sick = sick;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public void feed(int foodAmount, boolean isLiquid) {
        if (sex == Sex.Male) {
            if (isSick()) {
                if (foodAmount > 40 || isLiquid) {
                    try {
                        throw new Exception("Cannot give this food");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                if (foodAmount > 25 || !isLiquid) {
                    try {
                        throw new Exception("Cannot give this food");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } else {
            if (isSick()) {
                if (foodAmount > 30 || isLiquid) {
                    try {
                        throw new Exception("Cannot give this food");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                if (foodAmount > 20 || !isLiquid) {
                    try {
                        throw new Exception("Cannot give this food");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        Feeding feeding = new Feeding(LocalDate.now(), foodAmount, isLiquid);

        feedings.add(feeding);
    }
}