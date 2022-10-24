import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FacturaTest {
	  @Test
	  public void testCalculoDelIva() {
	    
	    LineaFactura l1= new LineaFactura(1,"tablet",200);
	    LineaFactura l2= new LineaFactura(2,"lampara",20);
	  
	    List<LineaFactura> lineas= Arrays.asList(l1,l2);
	    Factura f= new Factura(1,"compra online",lineas);
	    
	    assertEquals(264,f.getImporteConIVA(),0);
	    
	  }
}
