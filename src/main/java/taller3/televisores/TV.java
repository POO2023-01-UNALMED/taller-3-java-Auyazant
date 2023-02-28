package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal = 1;
	int precio = 500;
	int volumen = 1;
	boolean estado;
	Control control;
	public static int numTV;
	
	public TV(Marca marca,boolean estado){
		this.marca = marca;
		this.estado = estado;
		}
	public TV(){
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	 public int TvFabricados() {
		 	numTV++;
			return numTV;
	
	}
	public boolean getEstado () {
		return estado;
		
	}
	public boolean turnOn () {
		if (estado==false) {
			estado=true;
			return estado;
		}
		else {return estado;}
		
	}
	public boolean turnOff () {
		if (estado==true) {
			estado=false;
			return estado;
		}
		else {return estado;}
	}
	public int canalUp () {
		if(turnOn()==true) {
		for(int canal=1; canal<120;canal++) {
		}
		return canal;
		}
		else {return canal;}
		}
		
	public int canalDown () {
		if(turnOn()==true) {
			for(int canal=1; canal<120;canal--) {
			}
			return canal;
			}
			else {return canal;}
			}
	
	public int volumenUp () {
		if(turnOn()==true) {
			for(int volumen=1; volumen<7;volumen++) {
			}
			return volumen;
			}
			else {return volumen;}
			}
				
	public int volumenDown () {
		if(turnOn()==true) {
			for(int volumen=1; volumen<7;volumen--) {
			}
			return volumen;
			}
			else {return volumen;}
			}
	
	
		
		}

	
