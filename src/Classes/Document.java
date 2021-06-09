package Classes;

import java.util.Calendar;

public class Document {
    private String text;
    private String docName;
    private String author;
    private Calendar date;

    public Document(String text, String docName, String author, Calendar date) {
        this.text = text;
        this.docName = docName;
        this.author = author;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public String getDocName() {
        return docName;
    }

    public String getAuthor() {
        return author;
    }

    public Calendar getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
