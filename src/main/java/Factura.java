

import java.util.ArrayList;
import java.util.List;
/*
 * ejemplo de aqui
 * https://www.arquitecturajava.com/mockito-stub-test-y-aislamiento/
 */
public class Factura {

  private int numero;
  private String concepto;
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