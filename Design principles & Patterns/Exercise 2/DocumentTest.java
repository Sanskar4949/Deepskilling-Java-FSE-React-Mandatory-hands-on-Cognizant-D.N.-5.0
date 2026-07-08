public class DocumentTest {

    public static void main(String[] args) {

        System.out.println("Document Management System");
        System.out.println();

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();
        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();
        System.out.println();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
        System.out.println();

        System.out.println("..Factory Method Pattern Working Correctly..");

    }

}
