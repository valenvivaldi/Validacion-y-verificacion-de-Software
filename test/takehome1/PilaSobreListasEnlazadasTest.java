package takehome1;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.*;

@RunWith(Theories.class )
public class PilaSobreListasEnlazadasTest {



@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(LinkedListStackGenSupplier.class )
public @interface LinkedListStackGen {
        int amount();
        int maxLength();
}

@Theory
public void lengthPlus(@LinkedListStackGen(amount = 100, maxLength = 10 ) PilaSobreListasEnlazadas s) {
        assumeNotNull(s);
        Random r = new Random();
        int oldsize =s.length();
        s.push(r.nextInt());
        assertTrue(s.length()==oldsize+1);
}
@Theory
public void lengthLess(@LinkedListStackGen(amount = 100, maxLength = 10 ) PilaSobreListasEnlazadas s) {
        assumeTrue(s!=null && !s.isEmpty());
        int oldsize =s.length();
        s.pop();
        assertTrue(s.length()==oldsize-1);
}

@Theory
public void lengthEqual(@LinkedListStackGen(amount = 100, maxLength = 10 ) PilaSobreListasEnlazadas s) {
        assumeTrue(s!=null);
        Random r = new Random();
        int oldsize =s.length();
        Integer oldtop;
        boolean checktop;
        try {
                oldtop = s.top();
        }catch (Exception e) {
                oldtop=null;
        }

        s.push(r.nextInt());
        s.pop();

        try{
                checktop = s.top().equals(oldtop);
        }catch (Exception e) {
                checktop= (null == oldtop);
        }




        assertTrue(s.length()==oldsize && checktop);
}

// tests para mejorar cobertura
@Test(expected=PilaException.class)
public void testExceptionPop() {
	PilaSobreListasEnlazadas s = new PilaSobreListasEnlazadas();
	s.pop();
}

@Test
public void testClean() {
	PilaSobreListasEnlazadas s = new PilaSobreListasEnlazadas();
	for(int i=0; i< 120;i++) {
		s.push(new Integer(i));
	}
	s.clean();
	assertTrue(s.isEmpty());
}
@Test(expected=PilaException.class)
public void testExceptionClean2() {
	PilaSobreListasEnlazadas s = new PilaSobreListasEnlazadas();
	for(int i=0; i< 120;i++) {
		s.push(new Integer(i));
	}
	s.clean();
	s.top();
}

//ejercicio3 PREGUNTAR SI ES NECESARIO TESTEAR OPERACIONES QUE NO MODIFICAN LA PILA
@Test
public void consistentTestConstructor() {
	PilaSobreListasEnlazadas s = new PilaSobreListasEnlazadas();
	assertTrue(s.isConsistent());
}
@Theory
public void consistentTestPlus(@LinkedListStackGen(amount = 100, maxLength = 10 ) PilaSobreListasEnlazadas s) {
        assumeTrue(s!=null && s.isConsistent() );
        Random r = new Random();
        s.push(r.nextInt());
        assertTrue(s.isConsistent());
}
@Theory
public void consistentTestLess(@LinkedListStackGen(amount = 100, maxLength = 10 ) PilaSobreListasEnlazadas s) {
        assumeTrue(s!=null &&(!s.isEmpty()) && s.isConsistent());
        s.pop();
        assertTrue(s.isConsistent());
}







}
