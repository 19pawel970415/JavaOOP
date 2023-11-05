public class Processor {

    private String name;
    private int cores;

    public Processor() {
    }

    public Processor(String name, int cores) {
        this.name = name;
        this.cores = cores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                '}';
    }


}
