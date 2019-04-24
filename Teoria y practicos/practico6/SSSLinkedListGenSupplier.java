package practico6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;



public class SSSLinkedListGenSupplier extends ParameterSupplier {
	
	private static ObjectInputStream ois;
	private static FileInputStream fileTestUnit;
	
	private final static String currentUsersHomeDir = System.getProperty("user.home");
	private final static String yourPath= "<yourpath>/<yourfile>";
	private final static String testFile=  currentUsersHomeDir + "/" + yourPath;
	
	
	private static Object nextObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		try {
			return ois.readObject();
		} catch (EOFException eof) {
			return null;
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}
	
	
	
	@Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
    	List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
    	
		//HACER
	    return values;
    }
}
	
	
