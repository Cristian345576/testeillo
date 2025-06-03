package formas;

public class Circulo {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String color;
	@Override
	public String toString() {
		return "Circulo [id=" + id + ", color=" + color + ", radio=" + radio + ", nombre=" + nombre + "]";
	}
	private double radio;
	private String nombre;

}
