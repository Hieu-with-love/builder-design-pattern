package builder_pattern.report_builder;

public class Report {
    private String title;
    private String content;
    private String format;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void showReportDetails() {
        System.out.println("📄 Report (" + format + ")");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println();
    }
}
