package builder_pattern.report_builder;

public class ReportDirector {
    public Report buildReport(ReportBuilder builder, String title, String content){
        builder.buildTitle(title);
        builder.buildContent(content);
        builder.buildFormat();
        return builder.getReport();
    }
}
