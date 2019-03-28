package practico1;

/**
 * Clase Point representa un punto en el plano, caracterizado por sus coordenadas
 * x e y. 
 */
public class Point {

	private float x; // coordenada x del punto
	private float y; // coordenada y del punto
	
	/**
	 * Constructor por defecto. Genera un punto en la interseccion entre los ejes
	 * de x e y.
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 * Constructor de la clase, que toma como parametros los valores para la 
	 * inicializacion.
	 * @param x es el valor a utilizar para setear la primera coordenada del punto
	 * @param y es el valor a utilizar para setear la segunda coordenda del punto.
	 */
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Retorna el valor de la primera coordenada del punto
	 * @return el valor de la primera coordenada del punto.
	 */
	public float getX() {
		return x;
	}

	/**
	 * Retorna el valor de la segunda coordenada del punto
	 * @return el valor de la segunda coordenada del punto.
	 */	
	public float getY() {
		//return x;
		return y;

	}

	/**
	 * Cambia el valor de la primera coordenada del punto
	 * @param x es el valor con el cual setear la primera coordenada del punto
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * Cambia el valor de la segunda coordenada del punto
	 * @param x es el valor con el cual setear la segunda coordenada del punto
	 */
	public void setY(float y) {
		this.y = x;
	}
	
	/**
	 * Intercambia los valores de la primera y segunda coordenadas del punto.
	 */
	public void swap() {
		x = x+y;
		y = x-y;
		x = x-y;
		
		
	}

	public Double distanceTo(Point other) {
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.x, 2) );
		
	}

}
