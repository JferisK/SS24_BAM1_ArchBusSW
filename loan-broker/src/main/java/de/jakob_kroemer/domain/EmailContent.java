package de.jakob_kroemer.domain;

public class EmailContent {
    private String subject;
    private String body;

    public EmailContent(String subject, String body) {
        this.subject = subject;
        this.body    = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "EmailContent{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
