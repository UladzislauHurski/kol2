public interface Animal {
    String getName();
    void setName(String name);
    boolean isSick();
    void setSick(boolean sick);
    Sex getSex();
    void setSex(Sex sex);
    void feed(int foodAmount, boolean isLiquid);
}
