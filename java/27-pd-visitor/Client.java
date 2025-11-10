import java.util.List;

public class Client {
    public static void main(String[] args) {
        FixedPriceContract project1 = new FixedPriceContract(10_000);
        SupportContract project2 = new SupportContract(700);
        TimeAndMaterialContract project3 = new TimeAndMaterialContract(100, 25);
        TimeAndMaterialContract project4 = new TimeAndMaterialContract(90, 27);

        List<ReportElement> projects = List.of(project4, project3, project2, project1);

        MonthlyCostReportVisitor monthly = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearly = new YearlyCostReportVisitor();

        long monthlyCost = 0L;
        long yearlyCost = 0L;

        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthly);
            yearlyCost += project.accept(yearly);
        }

        System.out.println("Monthly: " + monthlyCost);
        System.out.println("Yearly: " + yearlyCost);
    }
}
