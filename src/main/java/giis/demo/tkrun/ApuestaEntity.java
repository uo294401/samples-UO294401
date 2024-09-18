package giis.demo.tkrun;

/**
 * 
 * @author UO295528
 * Apuesta class for tkrun package
 */
public class ApuestaEntity {
	private String id; 
	private String fecha; 
	private double premio;

	public String getId() { return this.id; }
	public String getFecha() { return this.fecha; }
	public double getPremio() { return this.premio; }
	public void setId(String value) { this.id=value; }
	public void setFecha(String value) { this.fecha=value; }
	public void setPremio(double value) { this.premio=premio; }
}
