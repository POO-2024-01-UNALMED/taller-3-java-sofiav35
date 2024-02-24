package taller3.televisores;

public class TV {
	Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV ++;
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
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTv(int nuevoNumero) {
		TV.numTV=nuevoNumero;
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
		if(canal<120 && estado) {
			canal++;
		}
	}
	public void canalDown() {
		if(canal<1 && estado) {
			canal--;
		}
	}
	public void volumenUp() {
		if(volumen<7 && estado) {
			volumen++;
		}
	}
	public void volumenDown() {
		if(volumen>1 && estado) {
			volumen--;
		}
	}
}