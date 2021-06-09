package Interfaces;

import Classes.Document;

import java.util.Calendar;
import java.util.List;

public interface Administrator {
    void deleteDocuments(Document document, List<Document> documentList);
    Document createDocument(String text,String docName,String author,Calendar date);
    void moveDocument(List<Document> documentList, Document document,List<Document> newDirectory );

}
