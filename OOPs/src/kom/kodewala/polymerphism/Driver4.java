package kom.kodewala.polymerphism;

class Document {
    void open() {
        System.out.println("Opening document");
    }
}

class PdfDocument extends Document {
    void pdfFeatures() {
        System.out.println("PDF specific features");
    }
}

class WordDocument extends Document {
    void wordFeatures() {
        System.out.println("Word specific features");
    }
}

// Parent class
class DocumentGenerator {
    Document generate() {
        System.out.println("Generating document");
        return new Document();
    }
}

// Child class – covariant return
class PdfGenerator extends DocumentGenerator {
    @Override
    PdfDocument generate() {
        System.out.println("Generating PDF document");
        return new PdfDocument();
    }
}

// Child class – covariant return
class WordGenerator extends DocumentGenerator {
    @Override
    WordDocument generate() {
        System.out.println("Generating Word document");
        return new WordDocument();
    }
}

// Driver class
public class Driver4 {
    public static void main(String[] args) {

        DocumentGenerator gen = new PdfGenerator();
        Document doc = gen.generate();   // actually PdfDocument
        doc.open();

        PdfDocument pdf = (PdfDocument) doc;
        pdf.pdfFeatures();

        System.out.println("--------------");

        gen = new WordGenerator();
        Document doc2 = gen.generate();  // actually WordDocument
        doc2.open();

        WordDocument word = (WordDocument) doc2;
        word.wordFeatures();
    }
}
