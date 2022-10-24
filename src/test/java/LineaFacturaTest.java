import static org.junit.Assert.assertEquals;

import org.junit.Test;  


public class LineaFacturaTest {

  @Test
  public void testCalcularIVA() {
    
    LineaFactura linea1= new LineaFactura(1,"lampara",30);
    
    assertEquals(36,linea1.getImporteConIVA(),0);    
  }
}