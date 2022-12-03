import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when;  


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FacturaTest {
	  @Test
	  public void testCalculoDelIva() {
	    //beste iruzkin bat
		  //alperrikako iruzkinak
	    LineaFactura l1= new LineaFactura(1,"tablet",200);
	    LineaFactura l2= new LineaFactura(2,"lampara",20);
	  
	    List<LineaFactura> lineas= Arrays.asList(l1,l2);
	    Factura f= new Factura(1,"compra online",lineas);
	    
	    assertEquals(264,f.getImporteConIVA(),0);
	    
	  }
	  
	  @Test
	  public void testCalculoDelIva2() {
	    //bi lerro sortu mockitoren bidez
	    LineaFactura l1= mock(LineaFactura.class);
	    LineaFactura l2= mock(LineaFactura.class);
	    when (l1.getImporteConIVA()).thenReturn(25.5);
	    when (l2.getImporteConIVA()).thenReturn(30.3);
	    
	    List<LineaFactura> lineas= Arrays.asList(l1,l2);
	    Factura f= new Factura(1,"compra online",lineas);
	    
	    assertEquals(55.8,f.getImporteConIVA(),0);
	    
	  }
	  
	  @Test
	  public void testCalculoDelIva3() {
	    //bi lerro sortu mockitoren bidez
	    LineaFactura l1= mock(LineaFactura.class);
	    LineaFactura l2= mock(LineaFactura.class);
	    when (l1.getImporteConIVA()).thenReturn(25.5);
	    when (l2.getImporteConIVA()).thenReturn(30.3);
	    
	    List<LineaFactura> lineas= Arrays.asList(l1,l2);
	    Factura f= new Factura(1,"compra online",lineas);
	    
	    assertEquals(true, false);
	    
	  }
}
