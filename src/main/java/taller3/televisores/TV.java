package taller3.televisores;

public class TV {
	Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	Control control;
	private int numTv;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTv ++;
		}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca nuevaMarca) {
		marca=nuevaMarca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int nuevoCanal) {
		if(nuevoCanal<=120 && nuevoCanal>=1) {
			canal=nuevoCanal;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int nuevoPrecio) {
		precio=nuevoPrecio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int nuevoVolumen) {
		if(nuevoVolumen<=7 && nuevoVolumen>=0) {
			volumen=nuevoVolumen;
		}	
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control nuevoControl){
		control=nuevoControl;
	}
	public int getNumTV() {
		return numTv;
	}
	public void setNumTv(int nuevoNumero) {
		numTv=nuevoNumero;
	} 
	
	public void turnOn() {
		 estado=true;
	}
	public void turnOff(){
		estado=false;
	}
	public boolean getEstado(){
		return estado;
	}
	public void canalUp() {
		canal++;
	}
	public void canalDawn() {
		canal--;
	}
	public void volumenUp() {
		volumen++;
	}
	public void volumenDown() {
		volumen--;
	}
}