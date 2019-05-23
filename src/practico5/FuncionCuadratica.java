package practico5;

import randoop.*;
/**
 * Clase que representa funciones polinmicas de grado 2, es decir, funciones
 * cuadraticas. Estas funciones cuadrticas son mutables, es decir, su estado
 * puede ser alterado una vez creado un objeto. 
 */
public class FuncionCuadratica {
    private float a; // coheficiente cuadrtico del polinomio
    private float b; // coheficiente lineal del polinomio
    private float c; // termino independiente del polinomio

    /**
     * ...
     * 
     * @pre. 
     * @post. 
     */
    public FuncionCuadratica() {
    	a=1;
    }

    /**
     * ...
     * @param a es el coheficiente cuadrático usado para crear la función. 
     * @param b es el coheficiente lineal usado para crear la función. 
     * @param c es el término independiente usado para crear la función.
     * @pre. 
     * @post. 
     */
    public FuncionCuadratica(float a, float b, float c) {
        if(a!=0) {
        	this.a = a;	
        }else {
        	this.a=1;
        }
        this.b = b;
        this.c = c;
    }


    /**
     * ...
     * @pre. 
     * @post. this.a = a.
     */
    public void setA(float a) {
    	if (a!=0) {
    		this.a = a;	
    	}

    }

    /**
     * Permite obtener el valor del coheficiente cuadrático de esta función 
     * cuadrática.
     * @return el valor del coheficiente cuadrático de esta función.
     * @pre. true
     * @post. return = a.
     */
    public float getA() {
        return a;
    }

    /**
     * Permite cambiar el coheficiente lineal de esta función cuadrática.
     * @param b es el nuevo coheficiente lineal para esta función. 
     * @pre. true
     * @post. this.b = b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Permite obtener el valor del coheficiente lineal de esta función 
     * cuadrática.
     * @return el valor del coheficiente lineal de esta función.
     * @pre. true
     * @post. return = b.
     */
    public float getB() {
        return b;
    }

    /**
     * Permite cambiar el término independiente de esta función cuadrática.
     * @param c es el nuevo término lineal para esta función. 
     * @pre. true
     * @post. this.c = c.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Permite obtener el valor del término independiente de esta función 
     * cuadrática.
     * @return el valor del término independiente de esta función.
     * @pre. true
     * @post. return = c.
     */
    public float getC() {
        return c;
    }

    /**
     * Evalúa esta función cuadrática en un valor real determinado.
     * @param x es el valor de tipo float en que se evalúa la función.
     * @return la imagen, según la función, del valor x. 
     * @pre. true
     * @post. return = a*x*x + b*x + c.
     */
    public float eval(float x) {
        return (a*x*x + b*x + c);
    }

    /**
     * Calcula el determinante de una función cuadrática.
     * @return el valor del determinante de la función cuadrática.
     * @pre. true
     * @post. return = b*b - 4*a*c.
     */
    public float determinante() {
        return (b*b - 4*a*c);
    }

    /**
     * Calcula el número de raíces reales de una función cuadrática.
     * @return el número de raíces de la función cuadrática.
     * @pre. true
     * @post. return = número de raíces de este polinomio (valor entre 0 y 2).
     */
    public int numRaices() {
        float determinante = determinante();
        if (determinante>0) {
            return 2;
        }
        else if (determinante==0) {
            return 1;
        }
	else {
            return 0;
        }
    }

    /**
     * Calcula las raíces reales de una función cuadrática. Si la función no
     * tiene raíces reales, entonces se lanza una excepción de tipo
     * PolinomioException.
     * @return las raíces reales del polinomio. Si el mismo tiene dos raíces
     * reales, la función las retorna en un objeto de tipo Pair<Float,Float>.
     * Si el polinomio tiene sólo una raíz, se retorna la misma como un 
     * objeto de tipo Float.
     * @see Pair
     * @see java.lang.Float
     * @throws PolinomioException cuando esta función no tiene raíces reales.
     * @pre. determinante()>=0
     * @post. return = raíces de este polinomio (un par de Float, o un Float).
     * Si la precondición no se satisface, se lanza una excepción de tipo
     * PolinomioException.
     */
    public Object raices() throws PolinomioException {
    	if(this.determinante()<0) {
    		throw new PolinomioException("El determinante es negativo");
    	}
    	
    	
    	if (this.numRaices()==1) {
    		 
    		return new Float((-b)/(2*a));
    	}else {
    		Float first = new Float((-b+determinante())/(2*a));
    		Float second = new Float((-b-determinante())/(2*a));
    		return new Pair<Float, Float>(first, second); 
    	}

    }

    /**
     * Genera una representación textual del estado de esta función. 
     * @return una cadena de caracteres conteniendo la representación textual 
     * del estado de esta función.
     * @pre. true
     * @post. return = representación textual del estado de esta función
     * cuadrática.
     */
    public String toString() {
        String resultado = a + "x^2";
        if (b!=0.0) resultado = resultado + "+"+b+"x";
        if (c!=0.0) resultado = resultado + "+"+c;
        return resultado;
    }

    /**
     * Indica si esta función cuadrática es internamente consistente. En este
     * caso, la función es internamiente consistente si y sólo si el 
     * coheficiente cuadrático de la función es distinto de cero. 
     * @return true si y sólo si el coheficiente cuadrático de la función
     * cuadrática es distinto de cero.
     * @pre. true
     * @post. return = (a!=0.0)
     */
@CheckRep
    public boolean repOk() {
        return (a!=0.0);
    }

    /**
     * Indica si esta función cuadrática es igual a la pasado como parámetro.
     * @param other es la función cuadrática con la que se comparará esta 
     * función. 
     * @return true si y sólo si esta función y la pasada como parámetro 
     * representan la misma función cuadrática. 
     * @pre. true
     * @post. return = a==other.getA() && b==other.getB() && c==other.getC()
     */
    public boolean equals(FuncionCuadratica other) {
        return (a==other.getA() && b==other.getB() && c==other.getC());
    }

}    
