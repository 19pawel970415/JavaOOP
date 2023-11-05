public class Monitor {

    private String name;
    private int inches;

    public Monitor(String name, int inches) {
        this.name = name;
        this.inches = inches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
}
