package entidad;

public class Palabra {
private String palabra;
private String informal;
private String formal;
public Palabra() {
	super();
}
public Palabra(String palabra, String informal, String formal) {
	super();
	this.palabra = palabra;
	this.informal = informal;
	this.formal = formal;
}
public String getPalabra() {
	return palabra;
}
public void setPalabra(String palabra) {
	this.palabra = palabra;
}
public String getInformal() {
	return informal;
}
public void setInformal(String informal) {
	this.informal = informal;
}
public String getFormal() {
	return formal;
}
public void setFormal(String formal) {
	this.formal = formal;
}
@Override
public String toString() {
	return "Palabra [palabra=" + palabra + ", informal=" + informal + ", formal=" + formal + "]";
}

}
