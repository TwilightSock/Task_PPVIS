package Classes;

import java.util.List;

public class Secretary implements Interfaces.Secretary {
    private List<Document>  documentList;
    private Document document;

    public Secretary(List<Document> documentList, Document document) {
        this.documentList=documentList;
        this.document = document;
    }

    @Override
    public synchronized void addDocument(List<Document> catalogueList,Document document) {
        catalogueList.add(document);
    }

    @Override
    public synchronized Document findDocument(String authorOrDocName) {
        for(Document doc:documentList){
            if(doc.getAuthor().equals(authorOrDocName)){
                return doc;
            }

            if(doc.getDocName().equals(authorOrDocName)){
                return  doc;
            }
        }
        return null;
    }
}
