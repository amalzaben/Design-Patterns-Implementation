package org.example;

public class ReportManager {
    private static ReportManager instance;

    private ReportManager() {}

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    public Report generateReport(DataSourceAdapter adapter) {
        String data = adapter.fetchData();
        ReportBuilder rb=new ReportBuilder();
             return rb.setTitle("=====Students Report====="+"\n")
                    .addData(data)
                    .setFooter("Generated by ReportManager :)")
                    .build();
    }
}

