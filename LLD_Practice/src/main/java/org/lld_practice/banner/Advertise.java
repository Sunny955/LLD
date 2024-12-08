package org.lld_practice.banner;

import java.util.Date;

public class Advertise {
    String company;
    Date from;
    Date to;
    String content;

    public Advertise(String company, Date from, Date to, String content) {
        this.company = company;
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Advertise [company=" + company + ", from=" + from + ", to=" + to + ", content=" + content + "]";
    }

}
