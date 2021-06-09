package Classes;

import java.util.Calendar;
import java.util.List;

public class Administrator implements Interfaces.Administrator {



    @Override
    public synchronized void deleteDocuments(Document document, List<Document> documentList) {
         documentList.remove(document);
    }

    @Override
    public synchronized Document createDocument(String text, String docName, String author, Calendar date) {
        Document document =new Document( text,docName,author,date);
            return document;
    }

    @Override
    public synchronized void moveDocument(List<Document> documentList, Document document, List<Document> newDirectory) {
            documentList.remove(document);
            newDirectory.add(document);
    }
}
