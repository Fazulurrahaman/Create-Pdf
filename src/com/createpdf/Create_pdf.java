package com.createpdf;



import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Create_pdf {

	public static void main(String[] args) {
		String FILE_NAME = "E:\\createpdf\\First.pdf";
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
			document.open();
			Paragraph p = new Paragraph();
			p.add("Welcome to Harris InfoTech");
			p.setAlignment(Element.ALIGN_CENTER);
			document.add(p);
			
			Font f = new Font();
			f.setStyle(Font.BOLD);
			f.setStyle(8);
			
			document.add(Image.getInstance("E:\\Certificate image\\certificate.png"));
			document.close();
			System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
