package practico6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


import org.junit.experimental.theories.ParametersSuppliedBy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(SSSLinkedListGenSupplier.class)
public @interface SSSLinkedListGen {
}


