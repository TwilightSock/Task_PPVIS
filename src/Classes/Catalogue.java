package Classes;

import java.util.List;
import java.util.Vector;

public class Catalogue {
    private static final Catalogue mainCatalogue = new Catalogue();
    private String catalogueName;
    private List<Catalogue> catalogueList;
    private List<Document> documentList;
    private Document document;

    private Catalogue(){
        createCatalogue();
    }

    public Catalogue(String catalogueName) {
        this.catalogueName = catalogueName;
        createCatalogue();
    }

    private void createCatalogue(){
        catalogueList = new Vector<Catalogue>();
        documentList = new Vector<Document>();
    }


    public void  setDocumentList(List<Document> documentList) {
        try {
            if(isHeaderExsits(document,documentList)){
                throw new Exception();
            }
            this.documentList.add(document);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    private  boolean isHeaderExsits(Document document, List<Document> documentList){
        for(Document doc:documentList) {
            if (doc.equals(document.getDocName())){
                return  true;
            }
        }
        return false;
    }
}
