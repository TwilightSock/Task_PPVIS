package Interfaces;

import Classes.Document;

public interface Writer {
    Document createDocument(String docName, String text);
    void updateDocument(String docName,String text,Document document);
}
