/**
 * 
 */
package javaMockitoFacturas.pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * @author Eñaut Agirre
 *iturriak https://www.baeldung.com/java-pdf-creation
 */
public class CrearPDF {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws URISyntaxException 
	 * @throws DocumentException 
	 */
	public static void main(String[] args) throws URISyntaxException, IOException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("resources/iTextTable.pdf"));

		document.open();

		PdfPTable table = new PdfPTable(3);
		addTableHeader(table);
		addRows(table);
		addCustomRows(table);

		document.add(table);
		document.close();
	}
	
	private static void addTableHeader(PdfPTable table) {
	    Stream.of("column header 1", "column header 2", "column header 3")
	      .forEach(columnTitle -> {
	        PdfPCell header = new PdfPCell();
	        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        header.setBorderWidth(2);
	        header.setPhrase(new Phrase(columnTitle));
	        table.addCell(header);
	    });
	}
	
	private static void addRows(PdfPTable table) {
	    table.addCell("row 1, col 1");
	    table.addCell("row 1, col 2");
	    table.addCell("row 1, col 3");
	}
	
	private static void addCustomRows(PdfPTable table) 
			  throws URISyntaxException, BadElementException, IOException {
//			    Path path = Paths.get(ClassLoader.getSystemResource("/home/ikaslea/eclipse-workspace/javaMockitoFacturas/src/main/java/javaMockitoFacturas/pdf/Javalogo.png").toURI());
//			    Image img = Image.getInstance("/home/ikaslea/eclipse-workspace/javaMockitoFacturas/src/main/java/javaMockitoFacturas/pdf/Javalogo.png");
			    Image img = Image.getInstance("resources/Javalogo.png");
			    img.scalePercent(10);

			    PdfPCell imageCell = new PdfPCell(img);
			    table.addCell(imageCell);

			    PdfPCell horizontalAlignCell = new PdfPCell(new Phrase("row 2, col 2"));
			    horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
			    table.addCell(horizontalAlignCell);

			    PdfPCell verticalAlignCell = new PdfPCell(new Phrase("row 2, col 3"));
			    verticalAlignCell.setVerticalAlignment(Element.ALIGN_BOTTOM);
			    table.addCell(verticalAlignCell);
			}

}
