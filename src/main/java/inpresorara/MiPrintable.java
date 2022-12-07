package inpresorara;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class MiPrintable implements Printable 
{

@Override
public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
    if (pageIndex == 0) 
    {
       // Imprime "Hola mundo" en la primera pagina, en la posicion 100,100
    	graphics.drawString("Hola mundo", 100,100);
       return PAGE_EXISTS;
    }
    else
       return NO_SUCH_PAGE;
}
}