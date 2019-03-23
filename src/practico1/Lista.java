package practico1;
/**
 * Interface que especifica los servicios básicos e indispensables del
 * TAD Lista. Esta interface corresponde a implementaciones polimórficas
 * de listas.
 * @author Nazareno Aguirre
 * @version 0.3 17/9/2009
 */

public interface Lista {
	
	/** 
	 * Indica si la lista es vacía o no.
	 * @return true ssi la lista no tiene elemento
	 * @pre. true.
	 * @post. Retorna true ssi la lista no tiene elementos
	 */
	public boolean esVacia();
	
	/** 
	 * Elimina todos los elementos de la lista.
	 * @pre. true.
	 * @post. elimina todos los elementos de la lista.
	 */
	public void vaciar();
	
	/** 
	 * Retorna la cantidad de elementos de la lista.
	 * @return retorna la cantidad de elementos de la lista.
	 * @pre. true.
	 * @post. retorna la cantidad de elementos de la lista.
	 */
	public int longitud();

	/** 
	 * inserta item en la posición index de la lista.
	 * @param index es el índice en el cual se inserta el elemento.
	 * @param item es el objeto a insertar en la lista.
	 * @pre. 0<=index<=longitud()  
	 * @post. Si index es una posición válida, inserta item en esa posición.
	 * Si index es una posición inválida, lanza una excepción de tipo
	 * IndexOutOfBoundsException. Si la inserción falla por otro motivo, lanza
	 * una excepción de tipo RunTimeException.
	 */
	public void insertar(int index, Object item) throws RuntimeException, IndexOutOfBoundsException; 
	
	/** 
	 * elimina el elemento en la posición index de la lista.
	 * @param index es el índice del elemento a eliminar.
	 * @pre. 0<=index<=longitud()-1  
	 * @post. si index es una posición válida, se elimina el item de esa posición.
	 *  Si index es una posición inválida, lanza una excepción de tipo
	 * IndexOutOfBoundsException. 
	 */
	public void eliminar(int index) throws IndexOutOfBoundsException;
	
	/** 
	 * retorna el elemento en la posición index de la lista. 
	 * @param index es el índice del elemento a retornar.
	 * @return el elemento en la lista en la posición index.
	 * @pre. 0<=index<=longitud()-1  
	 * @post. si index es una posición válida, se retorna el item de esa posición.
	 *  Si index es una posición inválida, lanza una excepción de tipo
	 * IndexOutOfBoundsException. 
	 */
	public Object obtener(int index) throws IndexOutOfBoundsException;
	
	/**
     * Indica si la representación de la lista es internamente consistente.  
     * @return true si y sólo si la representación de la lista es internamente 
     * consistente.
     * @pre. true
     * @post. retornar true si y sólo si la representación de la lista es internamente
	 * consistente.
     */
    public boolean repOk();
	
}
