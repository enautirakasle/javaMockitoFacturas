

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
 * ejemplo de aqui
 * https://www.arquitecturajava.com/mockito-stub-test-y-aislamiento/
 */
public class Factura {

  private int numero;
  private String concepto;
  private Date fecha;
  /**
 * @return the fecha
 */
public Date getFecha() {
	return fecha;
}
/**
 * @param fecha the fecha to set
 */
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
/**
 * @return the lineas
 */
public List<LineaFactura> getLineas() {
	return lineas;
}
/**
 * @param lineas the lineas to set
 */
public void setLineas(List<LineaFactura> lineas) {
	this.lineas = lineas;
}

private List<LineaFactura> lineas= new ArrayList<LineaFactura>();
  
  
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public String getConcepto() {
    return concepto;
  }
  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }
  
  public void addLinea(LineaFactura lf) {
    this.lineas.add(lf);
  }
  
  public void removeLinea(LineaFactura lf) {
    this.lineas.remove(lf);
  }
  public Factura(int numero, String concepto, List<LineaFactura> lineas) {
    super();
    this.numero = numero;
    this.concepto = concepto;
    this.lineas = lineas;
  }
  public Factura(int numero, String concepto) {
    super();
    this.numero = numero;
    this.concepto = concepto;
    
  }
  
  public double getImporteConIVA() {
    
    double total=0;
    for (LineaFactura l:lineas) {
      
      total+=l.getImporteConIVA();
    }
    return total;
  }
}