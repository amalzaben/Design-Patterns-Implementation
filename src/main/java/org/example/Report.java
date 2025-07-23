package org.example;

public class Report {
    private String title;
    private String data;
    private String footer;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return title + "\n" + data + "\n" + footer;
    }
}
