package takehome1;
/**
 * Interface que especifica las operaciones básicas del
 * TAD Pila. Esta interface corresponde a implementaciones de pilas.de enteros
 */

public interface Stack {
	
	/** 
	 * Indica si la pila es vacía o no.
	 * @return true ssi la pila no tiene elemento
	 * @pre. true.
	 * @post. Retorna true ssi la pila no tiene elementos
	 */
	public boolean isEmpty();
	
	/** 
	 * Elimina todos los elementos de la pila.
	 * @pre. true.
	 * @post. elimina todos los elementos de la pila.
	 */
	public void clean();
	
	/** 
	 * Retorna la cantidad de elementos de la pila.
	 * @return retorna la cantidad de elementos de la pila.
	 * @pre. true.
	 * @post. retorna la cantidad de elementos de la pila.
	 */
	public int length();

	/** 
	 * inserta item al tope de la pila de elementos.
	 * @param item es el objeto a insertar en la pila.
	 * @pre. true  
	 * @post. Si la estructura subyacente a la pila no está agotada en espacio,
	 * se inserta item al tope de la pila. Si la inserción falla por algún
	 * motivo, lanza una excepción de tipo PilaException.
	 */
	public void push(Integer item) throws PilaException; 
	
	/** 
	 * elimina el elemento al tope de la pila.
	 * @pre. longitud()>0 
	 * @post. si la pila es no vacía, elimina el elemento del tope
	 *  Si la pila está vacía, lanza una excepción de tipo
	 * PilaException. 
	 */
	public void pop() throws PilaException;
	
	/** 
	 * retorna el elemento al tope de la pila. 
	 * @return el elemento al tope de la pila.
	 * @pre.longitud()>0 
	 * @post. si la pila es no vacía, se retorna el item del tope.
	 *  Si la pila está vacía, se lanza una excepción de tipo
	 * PilaException. 
	 */
	public Integer top() throws PilaException;
	
	/**
     * Indica si la representación de la pila es internamente consistente.  
     * @return true si y sólo si la representación de la pila es internamente 
     * consistente.
     * @pre. true
     * @post. retornar true si y sólo si la representación de la pila es internamente
	 * consistente.
     */
    public boolean isConsistent();
	
}
