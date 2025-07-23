package org.example;

public class ReportBuilder {
    private Report report;

    public ReportBuilder() {
        report = new Report();
    }

    public ReportBuilder setTitle(String title) {
        report.setTitle(title);
        return this;
    }

    public ReportBuilder addData(String data) {
        report.setData(data);
        return this;
    }

    public ReportBuilder setFooter(String footer) {
        report.setFooter(footer);
        return this;
    }

    public Report build() {
        return report;
    }
}
