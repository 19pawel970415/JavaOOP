public class Printer {

    private String name;
    private int guaranteeYears;

    public Printer(String name, int guaranteeYears) {
        this.name = name;
        this.guaranteeYears = guaranteeYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuaranteeYears() {
        return guaranteeYears;
    }

    public void setGuaranteeYears(int guaranteeYears) {
        this.guaranteeYears = guaranteeYears;
    }
}
