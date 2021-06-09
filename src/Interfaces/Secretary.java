package Interfaces;

import Classes.Document;

import java.util.List;

public interface Secretary {
    void addDocument(List<Document> catalogueList,Document document);
    Document findDocument(String authorOrDocName);

}
