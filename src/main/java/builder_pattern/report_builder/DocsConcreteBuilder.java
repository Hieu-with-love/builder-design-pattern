package builder_pattern.report_builder;

public class DocsConcreteBuilder extends ReportBuilder {
    @Override
    public void buildTitle(String title) {
        report.setTitle(title);
    }

    @Override
    public void buildContent(String content) {
        report.setContent(content);
    }

    @Override
    public void buildFormat() {
        report.setFormat("DOCS");
    }

}
