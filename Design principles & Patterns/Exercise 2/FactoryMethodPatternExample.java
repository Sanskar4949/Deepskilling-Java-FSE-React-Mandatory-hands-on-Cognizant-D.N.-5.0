interface Document {
    void open();
    String getType();
}

class WordDocument implements Document {

    @Override
    public void open() { System.out.println("Opening a Word Document (.docx)..."); }

    @Override
    public String getType() {
        return "Word Document";
    }
}

class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening a PDF Document (.pdf)...");
    }

    @Override
    public String getType() {
        return "PDF Document";
    }
}

class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening an Excel Document (.xlsx)...");
    }

    @Override
    public String getType() { return "Excel Document"; }
}

abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        System.out.println("Created: " + doc.getType());
        doc.open();
    }
}

class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
