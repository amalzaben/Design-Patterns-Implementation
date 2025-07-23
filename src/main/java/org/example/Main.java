package org.example;

public class Main {
    public static void main(String[] args) {
        ReportManager manager = ReportManager.getInstance();

        //CSV
        DataSourceAdapter csvAdapter = new CSVAdapter();
        Report csvReport = manager.generateReport(csvAdapter);
        System.out.println("CSV Report:\n" + csvReport);

        System.out.println("-----------------------------");

        //JSON
        DataSourceAdapter jsonAdapter = new JSONAdapter();
        Report jsonReport = manager.generateReport(jsonAdapter);
        System.out.println("JSON Report:\n" + jsonReport);
    }
}
