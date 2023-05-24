public class Program {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.print();
        report.printAll();
        report.saveToFile();
    }
}