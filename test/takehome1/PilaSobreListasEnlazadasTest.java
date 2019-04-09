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



}
