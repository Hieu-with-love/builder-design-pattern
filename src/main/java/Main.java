import builder_pattern.house_construction.*;
import builder_pattern.report_builder.*;

public class Main {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        // Create a ReportDirector to connect to the ReportBuilder
        Report docsReport = director.buildReport(new DocsConcreteBuilder(),
                "Anunal Report using Docs", "This is the content of the report");
        docsReport.showReportDetails();

        // Create excel report
        Report excelReport = director.buildReport(new ExcelConcreteBuilder(),
                    "Sales Report using Excel", "This is the content of the report"
                );
        excelReport.showReportDetails();
    }
}
