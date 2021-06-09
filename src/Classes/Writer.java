package Classes;

import java.util.Calendar;

public class Writer implements Interfaces.Writer {
   private Calendar currentDate;
   private  String author;

    public Writer(String name,String text,String author) {
        this.author=author;
        this.currentDate=Calendar.getInstance();
    }

    @Override
    public synchronized Document createDocument(String docName, String text) {
        Document document=new Document(docName,text,author,currentDate);
        return document;
    }

    @Override
    public synchronized void updateDocument(String docName, String text,Document document) {
        document.setDocName(docName);
        document.setText(text);
    }
}
