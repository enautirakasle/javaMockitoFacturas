package inpresorara;

import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class Main {

	public static void main(String[] args)  {
		PrinterJob job = PrinterJob.getPrinterJob();
		job.setPrintable( new MiPrintable());
		try 
		{
		   job.print();
		} 
		catch (PrinterException e) 
		{
		   e.printStackTrace();
		}
		
		// Diálogo para elegir el formato de impresión
		PageFormat pageFormat = new PageFormat();
		pageFormat=job.pageDialog(pageFormat);

		// Diálogo para confirmar impresion.
		// Devuelve true si el usuario decide imprimir.
		if (job.printDialog())
			try {
				job.print();
			} catch (PrinterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
