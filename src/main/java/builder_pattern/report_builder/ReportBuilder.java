package builder_pattern.report_builder;

public abstract class ReportBuilder {
    protected Report report = new Report();
    public abstract void buildTitle(String title);
    public abstract void buildContent(String content);
    public abstract void buildFormat();
    public Report getReport(){
        return report;
    };
}
