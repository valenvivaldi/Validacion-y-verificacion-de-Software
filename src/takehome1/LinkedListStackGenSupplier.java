package takehome1;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import takehome1.PilaSobreListasEnlazadasTest.LinkedListStackGen;

public class LinkedListStackGenSupplier extends ParameterSupplier{

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
		List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
		LinkedListStackGen annotation = sig.getAnnotation(LinkedListStackGen.class);
		
		Random randInts = new Random();
		Random randLenght = new Random();
		
		
		/////////////
		PilaSobreListasEnlazadas s;
		int length;
		for(int i=0; i<annotation.amount();i++) {
			length=randLenght.nextInt(annotation.maxLength());
			s= new PilaSobreListasEnlazadas();
			for(int l=0;l<length;l++) {
				s.push(randInts.nextInt());
			}
			values.add (PotentialAssignment.forValue("pila n°:"+i, s));
			
		}
		return values;
	}
	
	

}
