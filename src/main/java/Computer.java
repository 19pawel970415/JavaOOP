import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Computer {

    private String motherboard;
    private Processor processor;
    private RAM[] ramSlots = new RAM[4];

    private int hd;
    private Monitor monitor;
    private Printer printer;

    public Computer(String motherboard, Processor processor, RAM ram, int hd, Monitor monitor, Printer printer) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ramSlots[0] = ram;
        this.hd = hd;
        this.monitor = monitor;
        this.printer = printer;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM[] getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(RAM[] ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String toString() {
        String ramSlotNames = Arrays.stream(ramSlots)
                .filter(Objects::nonNull)
                .map(ram -> ram.getName())
                .collect(Collectors.joining(", "));

        String monitorName = monitor != null ? monitor.getName() : "No Monitor";
        String printerName = printer != null ? printer.getName() : "No Printer";

        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", processor=" + processor +
                ", ramSlots=[" + ramSlotNames + "]" +
                ", hd=" + hd +
                ", monitor='" + monitorName + '\'' +
                ", printer='" + printerName + '\'' +
                '}';
    }

    public void addRam(RAM ram) {
        for (int i = 0; i < ramSlots.length; i++) {
            if (ramSlots[i] == null) {
                ramSlots[i] = ram;
                return;
            }
        }
        int min = ramSlots[0].getSize();
        for (int i = 0; i < ramSlots.length; i++) {
            if (ramSlots[i].getSize() < min) {
                min = ramSlots[i].getSize();
            }
        }
        for (int i = 0; i < ramSlots.length; i++) {
            if (ramSlots[i].getSize() == min) {
                ramSlots[i] = ram;
            }
        }
    }

    public void compareComputers(Computer computer) {
        int points = 0;
        int points1 = 0;

        points += this.processor.getCores() * 3;
        points1 += computer.getProcessor().getCores() * 3;

        RAM[] rams = computer.getRamSlots();

        for (int i = 0; i < ramSlots.length; i++) {
            if (ramSlots[i] != null) {
                points += ramSlots[i].getSize() * 1.25;
            }
            if (rams[i] != null) {
                points1 += rams[i].getSize() * 1.25;
            }
        }
        points += monitor.getInches();
        points1 += computer.getMonitor().getInches();

        points += printer.getGuaranteeYears();
        points1 += computer.getPrinter().getGuaranteeYears();

        if (points > points1) {
            System.out.println("Your computer has " + points + " points and the other one has " + points1 + " points. Your computer is better.");
        } else if (points == points1){
            System.out.println("Your computer has " + points + " points and the other one has " + points1 + " points. Your computer is equally good.");
        } else {
            System.out.println("Your computer has " + points + " points and the other one has " + points1 + " points. Your computer is worse.");
        }
    }
}
