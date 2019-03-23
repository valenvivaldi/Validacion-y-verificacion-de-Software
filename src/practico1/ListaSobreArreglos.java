package practico1;
/**
 * Implementacion del TAD Lista, usando un arreglo de objetos con tamaño 
 * máximo MAX_LIST.
 * Esta clase implementa los métodos abstractos declarados en Lista.
 * @author Nazareno Aguirre
 * @version 0.2 16/9/2009
 */

public class ListaSobreArreglos implements Lista {
	
    private static final int MAX_LIST = 100; // numero máximo de items en la 
	                                         // lista. 
    private Object items[];                  // arreglo usado para almacenar
	                                         // los elementos de la lista.
    private int numItems;                    // entero que indica el número
	                                         // de elementos en la lista, y
                                             // el ``fin'' de la lista en
	                                         // items.
	
	/** 
	 * Constructor de la clase ListaSobreArreglos.   
	 * @pre. true.
	 * @post. Se crea un arreglo de objetos de tamaño MAX_LIST, y se
	 * inicializa numItems en 0.  
	 */
    public ListaSobreArreglos() {		
        items = new Object[MAX_LIST];
		numItems = 0;		
    } 
    
	
	/** 
	 * Indica si la lista es vacía o no.
	 * @return true ssi la lista no tiene elemento
	 * @pre. true.
	 * @post. Retorna true ssi la lista no tiene elementos
	 */	
    public boolean esVacia() {
        return (numItems == 0);
    } 
	
	/** 
	 * Retorna la cantidad de elementos de la lista.
	 * @return retorna la cantidad de elementos de la lista.
	 * @pre. true.
	 * @post. retorna la cantidad de elementos de la lista.
	 */
	public int longitud() {
        return numItems;
    } 
	
	/** 
	 * Elimina todos los elementos de la lista.
	 * @pre. true.
	 * @post. elimina todos los elementos de la lista.
	 */
    public void vaciar() {
        numItems = 0;
    } 
	
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
    public void insertar(int index, Object item) throws RuntimeException, IndexOutOfBoundsException {    
      	if (numItems == MAX_LIST) {
				throw new RuntimeException("ListaSobreArreglos.insertar: Lista llena");
			}
			else {
				if ((index<0) || (index>numItems)) {
					throw new IndexOutOfBoundsException("ListaSobreArreglos.insertar: índice inválido");
				}
				else {
					if (index == numItems) {
						// insertar item en la última posición
						items[index] = item;
						numItems = numItems + 1;
					}
					else {
						Object temp = items[index];
						//item.toString();
						items[index] = item;
						
						insertar(index+1, temp);
						
					}
				}
			}
    }
    
    public String toString(){
    	String res = "[";
    	for(int i=0; i<this.longitud();i++){
    		if (i==(this.longitud()-1)){
    			res=res + obtener(i).toString();
    		}else{
    			res=res + obtener(i).toString() + ",";
    		}
    			
    	}		
    	res = res + "]";
    	return res;
    }

    /** 
	 * elimina el elemento en la posición index de la lista.
	 * @param index es el índice del elemento a eliminar.
	 * @pre. 0<=index<=longitud()-1  
	 * @post. si index es una posición válida, se elimina el item de esa posición.
	 *  Si index es una posición inválida, lanza una excepción de tipo
	 * IndexOutOfBoundsException. 
	 */
    public void eliminar(int index) throws IndexOutOfBoundsException {
		
        if ((index<0) || (index>=numItems)) {
			throw new IndexOutOfBoundsException("ListSobreArreglos.eliminar: indice inválido");
		}
		else {
			if (index == numItems-1) {
				// eliminar el item en la ultima posicion
				numItems = numItems - 1;
			}
			else {
				items[index] = items[index+1];
				eliminar(index+1);
			}
        }
    }  
		
	/** 
	 * retorna el elemento en la posición index de la lista. 
	 * @param index es el índice del elemento a retornar.
	 * @return el elemento en la lista en la posición index.
	 * @pre. 0<=index<=longitud()-1  
	 * @post. si index es una posición válida, se retorna el item de esa posición.
	 *  Si index es una posición inválida, lanza una excepción de tipo
	 * IndexOutOfBoundsException. 
	 */	
    public Object obtener(int index) throws IndexOutOfBoundsException {
        if ((index<0) || (index>=numItems)) {
			throw new IndexOutOfBoundsException("ListaSobreArreglos: índice inválido");
		}
		else {
			return (items[index]);
        }
    } 
	
	/**
     * Indica si la representación de la lista es internamente consistente.  
     * @return true si y sólo si la representación de la lista es internamente 
     * consistente.
     * @pre. true
     * @post. retornar true si y sólo si la representación de la lista es internamente
	 * consistente, es decir, si 0<=numItems<=MAX_LIST.
     */
    public boolean repOk() {
		return (0<=numItems && numItems<=MAX_LIST);
	}
		
} 
