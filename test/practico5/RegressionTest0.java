package practico5;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) (-1L));
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        funcionCuadratica3.setC((float) ' ');
        float float7 = funcionCuadratica3.eval((float) 100L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100032.0f + "'", float7 == 100032.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        boolean boolean10 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica7.eval(10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10035.0f + "'", float10 == 10035.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.getB();
        float float13 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (short) 0);
        float float9 = funcionCuadratica3.getC();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj15 = funcionCuadratica14.raices();
        float float16 = funcionCuadratica14.getC();
        boolean boolean17 = funcionCuadratica7.equals(funcionCuadratica14);
        boolean boolean18 = funcionCuadratica14.repOk();
        float float19 = funcionCuadratica14.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        funcionCuadratica3.setB((float) 1L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, 10035.0f, (float) 10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) (-1));
        funcionCuadratica15.setA((float) 1);
        int int29 = funcionCuadratica15.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str10.equals("0.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        funcionCuadratica7.setC((-14000.0f));
        java.lang.String str18 = funcionCuadratica7.toString();
        int int19 = funcionCuadratica7.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0.0x^2+-14000.0" + "'", str18.equals("0.0x^2+-14000.0"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean9 = funcionCuadratica4.equals(funcionCuadratica8);
        java.lang.Object obj10 = funcionCuadratica8.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica8);
        java.lang.Class<?> wildcardClass12 = funcionCuadratica8.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, 0.0f, (float) 1);
        float float5 = funcionCuadratica3.eval((float) ' ');
        funcionCuadratica3.setA((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10241.0f + "'", float5 == 10241.0f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        funcionCuadratica7.setC((-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        float float28 = funcionCuadratica21.eval((float) (short) 1);
        float float29 = funcionCuadratica21.getC();
        float float30 = funcionCuadratica21.getC();
        boolean boolean31 = funcionCuadratica7.equals(funcionCuadratica21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 130.0f + "'", float28 == 130.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 97.0f + "'", float29 == 97.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 97.0f + "'", float30 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) (-1));
        int int27 = funcionCuadratica15.numRaices();
        float float28 = funcionCuadratica15.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 97.0f + "'", float28 == 97.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        int int14 = funcionCuadratica7.numRaices();
        funcionCuadratica7.setA((-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica7.getClass();
        float float14 = funcionCuadratica7.getC();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica3.setA((-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 97.0f + "'", float14 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        float float16 = funcionCuadratica11.getB();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setC((float) (byte) 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setB(10035.0f);
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float11 = funcionCuadratica7.getA();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.eval((float) (-1L));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        funcionCuadratica7.setA(12135.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "32.0x^2+1.0x+97.0" + "'", str11.equals("32.0x^2+1.0x+97.0"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float26 = funcionCuadratica15.eval(435.0f);
        java.lang.Object obj27 = funcionCuadratica15.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 6055732.0f + "'", float26 == 6055732.0f);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(0.0f);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean25 = funcionCuadratica20.equals(funcionCuadratica24);
        java.lang.Object obj26 = funcionCuadratica24.raices();
        boolean boolean27 = funcionCuadratica24.repOk();
        boolean boolean28 = funcionCuadratica24.repOk();
        float float29 = funcionCuadratica24.getC();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica12.equals(funcionCuadratica24);
        int int32 = funcionCuadratica24.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 35.0f + "'", float29 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (short) -1);
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        funcionCuadratica7.setC((-14000.0f));
        funcionCuadratica7.setA(100.0f);
        float float20 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100.0f, 435.0f, (float) (short) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        boolean boolean7 = funcionCuadratica3.repOk();
        funcionCuadratica3.setB((-11.0f));
        float float10 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean9 = funcionCuadratica4.equals(funcionCuadratica8);
        java.lang.Object obj10 = funcionCuadratica8.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Object obj21 = funcionCuadratica19.raices();
        float float22 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica();
        boolean boolean24 = funcionCuadratica19.equals(funcionCuadratica23);
        boolean boolean25 = funcionCuadratica8.equals(funcionCuadratica23);
        java.lang.String str26 = funcionCuadratica23.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "0.0x^2" + "'", str26.equals("0.0x^2"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC(135.0f);
        funcionCuadratica3.setB((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        boolean boolean4 = funcionCuadratica3.repOk();
        funcionCuadratica3.setA((float) (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        float float26 = funcionCuadratica15.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-12415.0f) + "'", float26 == (-12415.0f));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str7 = funcionCuadratica3.toString();
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+35.0" + "'", str7.equals("-1.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1.0x^2+35.0" + "'", str8.equals("-1.0x^2+35.0"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, 97.0f, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3391.0f) + "'", float4 == (-3391.0f));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica7.getClass();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        java.lang.Object obj27 = funcionCuadratica25.raices();
        java.lang.String str28 = funcionCuadratica25.toString();
        float float29 = funcionCuadratica25.determinante();
        boolean boolean30 = funcionCuadratica7.equals(funcionCuadratica25);
        float float31 = funcionCuadratica25.getA();
        boolean boolean32 = funcionCuadratica25.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+35.0" + "'", str28.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-14000.0f) + "'", float29 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) (-1));
        funcionCuadratica15.setA((float) 1);
        boolean boolean29 = funcionCuadratica15.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 'a', 10.0f, 1.0f);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, (float) 'a', 0.0f);
        boolean boolean4 = funcionCuadratica3.repOk();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean13 = funcionCuadratica8.equals(funcionCuadratica12);
        java.lang.Object obj14 = funcionCuadratica12.raices();
        float float15 = funcionCuadratica12.determinante();
        java.lang.String str16 = funcionCuadratica12.toString();
        float float17 = funcionCuadratica12.determinante();
        java.lang.Object obj18 = funcionCuadratica12.raices();
        funcionCuadratica12.setA((float) 0);
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica12);
        float float22 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-14000.0f) + "'", float15 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-14000.0f) + "'", float17 == (-14000.0f));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.0f + "'", float22 == 2.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Object obj11 = funcionCuadratica7.raices();
        float float12 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        float float22 = funcionCuadratica18.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean31 = funcionCuadratica26.equals(funcionCuadratica30);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica26.getClass();
        boolean boolean33 = funcionCuadratica18.equals(funcionCuadratica26);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica18.getClass();
        boolean boolean35 = funcionCuadratica3.equals(funcionCuadratica18);
        funcionCuadratica3.setA((float) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, (float) 'a', 0.0f);
        boolean boolean4 = funcionCuadratica3.repOk();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+1.0x+100.0" + "'", str4.equals("10.0x^2+1.0x+100.0"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 0, 1.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (short) 0);
        funcionCuadratica3.setB((float) (-1L));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) -1, 122535.0f, (float) '4');
        funcionCuadratica3.setA(1.0f);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Object obj16 = funcionCuadratica3.raices();
        float float17 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        float float26 = funcionCuadratica24.getB();
        float float27 = funcionCuadratica24.getB();
        boolean boolean28 = funcionCuadratica15.equals(funcionCuadratica24);
        java.lang.String str29 = funcionCuadratica24.toString();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica7.equals(funcionCuadratica24);
        float float32 = funcionCuadratica24.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str29.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        boolean boolean4 = funcionCuadratica3.repOk();
        float float5 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (-1.0f), 32.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float5 = funcionCuadratica3.eval((float) '4');
        float float7 = funcionCuadratica3.eval(132.0f);
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2752.0f + "'", float5 == 2752.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 17392.0f + "'", float7 == 17392.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        boolean boolean6 = funcionCuadratica3.repOk();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float12 = funcionCuadratica3.eval(2752.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.42354976E8f + "'", float12 == 2.42354976E8f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        funcionCuadratica0.setA(102.0f);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        funcionCuadratica3.setA(0.0f);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float5 = funcionCuadratica3.eval((float) '4');
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2752.0f + "'", float5 == 2752.0f);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        java.lang.Class<?> wildcardClass12 = funcionCuadratica7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(100.0f);
        float float7 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        funcionCuadratica7.setB((-12415.0f));
        float float12 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-12415.0f) + "'", float12 == (-12415.0f));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        funcionCuadratica16.setA(2752.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-12415.0f) + "'", float12 == (-12415.0f));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        float float12 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        boolean boolean10 = funcionCuadratica7.repOk();
        funcionCuadratica7.setA(135.0f);
        float float13 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 135.0f + "'", float13 == 135.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        funcionCuadratica0.setB((float) 1);
        int int3 = funcionCuadratica0.numRaices();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        java.lang.String str13 = funcionCuadratica3.toString();
        boolean boolean14 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32.0x^2+1.0x" + "'", str13.equals("32.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setC((float) (byte) -1);
        funcionCuadratica7.setB(10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        float float11 = funcionCuadratica7.determinante();
        float float12 = funcionCuadratica7.getB();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-14000.0f) + "'", float11 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        java.lang.String str2 = funcionCuadratica0.toString();
        java.lang.Class<?> wildcardClass3 = funcionCuadratica0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0x^2" + "'", str2.equals("0.0x^2"));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((float) 0);
        funcionCuadratica3.setB((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        java.lang.Class<?> wildcardClass1 = funcionCuadratica0.getClass();
        float float2 = funcionCuadratica0.determinante();
        funcionCuadratica0.setB(10.0f);
        float float5 = funcionCuadratica0.getA();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        java.lang.String str12 = funcionCuadratica7.toString();
        float float13 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "100.0x^2+35.0" + "'", str12.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        java.lang.Object obj26 = funcionCuadratica15.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        float float4 = funcionCuadratica3.getB();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0x^2+1.0x+97.0" + "'", str5.equals("32.0x^2+1.0x+97.0"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        funcionCuadratica3.setC(0.0f);
        float float6 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        funcionCuadratica3.setA((float) 100L);
        funcionCuadratica3.setA(12135.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float9 = funcionCuadratica3.getA();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.String str7 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str7.equals("0.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, 97.0f, (float) (short) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(2.42354976E8f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0x^2+97.0x+100.0" + "'", str4.equals("32.0x^2+97.0x+100.0"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.eval((-1.0f));
        funcionCuadratica3.setA(435.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100L, 10.0f, (-33.0f));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica18);
        float float23 = funcionCuadratica18.eval((-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean32 = funcionCuadratica27.equals(funcionCuadratica31);
        java.lang.Object obj33 = funcionCuadratica31.raices();
        java.lang.String str34 = funcionCuadratica31.toString();
        float float35 = funcionCuadratica31.determinante();
        float float37 = funcionCuadratica31.eval(0.0f);
        int int38 = funcionCuadratica31.numRaices();
        boolean boolean39 = funcionCuadratica18.equals(funcionCuadratica31);
        float float40 = funcionCuadratica18.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.9599999E10f + "'", float23 == 1.9599999E10f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "100.0x^2+35.0" + "'", str34.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-14000.0f) + "'", float35 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 35.0f + "'", float37 == 35.0f);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        float float2 = funcionCuadratica0.getB();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica11.getClass();
        java.lang.String str14 = funcionCuadratica11.toString();
        boolean boolean15 = funcionCuadratica11.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0.0x^2" + "'", str14.equals("0.0x^2"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        float float14 = funcionCuadratica7.eval((float) (byte) -1);
        float float16 = funcionCuadratica7.eval(10035.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 135.0f + "'", float14 == 135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.00701225E10f + "'", float16 == 1.00701225E10f);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        float float6 = funcionCuadratica4.getC();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean30 = funcionCuadratica25.equals(funcionCuadratica29);
        float float32 = funcionCuadratica25.eval((float) (short) 1);
        float float33 = funcionCuadratica25.getC();
        float float34 = funcionCuadratica25.getC();
        boolean boolean35 = funcionCuadratica7.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean44 = funcionCuadratica39.equals(funcionCuadratica43);
        java.lang.Object obj45 = funcionCuadratica43.raices();
        funcionCuadratica43.setB((-12415.0f));
        boolean boolean48 = funcionCuadratica43.repOk();
        boolean boolean49 = funcionCuadratica7.equals(funcionCuadratica43);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 130.0f + "'", float32 == 130.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 97.0f + "'", float33 == 97.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 97.0f + "'", float34 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        funcionCuadratica7.setC((-14000.0f));
        funcionCuadratica7.setA((float) (byte) -1);
        java.lang.String str20 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-1.0x^2+-14000.0" + "'", str20.equals("-1.0x^2+-14000.0"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean25 = funcionCuadratica20.equals(funcionCuadratica24);
        java.lang.Object obj26 = funcionCuadratica24.raices();
        boolean boolean27 = funcionCuadratica24.repOk();
        boolean boolean28 = funcionCuadratica24.repOk();
        float float29 = funcionCuadratica24.getC();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica12.equals(funcionCuadratica24);
        int int32 = funcionCuadratica12.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 35.0f + "'", float29 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        funcionCuadratica11.setC((float) 'a');
        float float17 = funcionCuadratica11.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica10 = null;
        try {
            boolean boolean11 = funcionCuadratica7.equals(funcionCuadratica10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (short) -1);
        funcionCuadratica3.setA((float) (-1L));
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setB(100032.0f);
        funcionCuadratica3.setB((-11.0f));
        java.lang.Object obj20 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        boolean boolean13 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        int int5 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        funcionCuadratica7.setC((float) '#');
        java.lang.String str14 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "100.0x^2+35.0" + "'", str14.equals("100.0x^2+35.0"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        java.lang.Class<?> wildcardClass1 = funcionCuadratica0.getClass();
        float float2 = funcionCuadratica0.determinante();
        practico5.FuncionCuadratica funcionCuadratica6 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj7 = funcionCuadratica6.raices();
        float float8 = funcionCuadratica6.getB();
        int int9 = funcionCuadratica6.numRaices();
        boolean boolean10 = funcionCuadratica0.equals(funcionCuadratica6);
        float float11 = funcionCuadratica6.getB();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        boolean boolean4 = funcionCuadratica3.repOk();
        funcionCuadratica3.setA((-101.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        java.lang.String str23 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "100.0x^2+35.0" + "'", str23.equals("100.0x^2+35.0"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        boolean boolean4 = funcionCuadratica3.repOk();
        float float5 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setC((float) '#');
        float float27 = funcionCuadratica15.getB();
        float float28 = funcionCuadratica15.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-4479.0f) + "'", float28 == (-4479.0f));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        float float13 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        java.lang.String str12 = funcionCuadratica7.toString();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
        java.lang.Object obj23 = funcionCuadratica21.raices();
        boolean boolean24 = funcionCuadratica16.equals(funcionCuadratica21);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean33 = funcionCuadratica28.equals(funcionCuadratica32);
        java.lang.Object obj34 = funcionCuadratica32.raices();
        float float35 = funcionCuadratica32.getC();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica();
        boolean boolean37 = funcionCuadratica32.equals(funcionCuadratica36);
        boolean boolean38 = funcionCuadratica21.equals(funcionCuadratica36);
        boolean boolean39 = funcionCuadratica7.equals(funcionCuadratica36);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "100.0x^2+35.0" + "'", str12.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 35.0f + "'", float35 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        boolean boolean7 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10241.0f, 1.0f, (float) (byte) 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setA((float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getC();
        float float14 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 97.0f + "'", float13 == 97.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0, (float) (byte) 100, (float) ' ');
        funcionCuadratica3.setA((float) 'a');
        funcionCuadratica3.setB((float) 1L);
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(102.0f, 102.0f, 0.0f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(102.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        funcionCuadratica7.setC((-14000.0f));
        java.lang.String str18 = funcionCuadratica7.toString();
        java.lang.Object obj19 = funcionCuadratica7.raices();
        java.lang.Object obj20 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0.0x^2+-14000.0" + "'", str18.equals("0.0x^2+-14000.0"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.eval((float) (short) 10);
        float float8 = funcionCuadratica3.eval((float) (byte) 100);
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-11.0f) + "'", float6 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-101.0f) + "'", float8 == (-101.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        float float22 = funcionCuadratica18.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean31 = funcionCuadratica26.equals(funcionCuadratica30);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica26.getClass();
        boolean boolean33 = funcionCuadratica18.equals(funcionCuadratica26);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica18.getClass();
        boolean boolean35 = funcionCuadratica3.equals(funcionCuadratica18);
        funcionCuadratica3.setA(12135.0f);
        funcionCuadratica3.setC((-38800.0f));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean25 = funcionCuadratica20.equals(funcionCuadratica24);
        java.lang.Object obj26 = funcionCuadratica24.raices();
        boolean boolean27 = funcionCuadratica24.repOk();
        boolean boolean28 = funcionCuadratica24.repOk();
        float float29 = funcionCuadratica24.getC();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica12.equals(funcionCuadratica24);
        float float32 = funcionCuadratica24.getB();
        float float33 = funcionCuadratica24.determinante();
        float float34 = funcionCuadratica24.getA();
        funcionCuadratica24.setC(135.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 35.0f + "'", float29 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-14000.0f) + "'", float33 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10241.0f, (float) (short) 10, 10.0f);
        float float4 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.eval(6055732.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 6.0557318E8f + "'", float6 == 6.0557318E8f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (short) -1);
        float float7 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float9 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(100.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((-3999.0f));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.String str16 = funcionCuadratica11.toString();
        float float17 = funcionCuadratica11.determinante();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-14000.0f) + "'", float17 == (-14000.0f));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, (float) 'a', 0.0f);
        boolean boolean4 = funcionCuadratica3.repOk();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean13 = funcionCuadratica8.equals(funcionCuadratica12);
        java.lang.Object obj14 = funcionCuadratica12.raices();
        float float15 = funcionCuadratica12.determinante();
        java.lang.String str16 = funcionCuadratica12.toString();
        float float17 = funcionCuadratica12.determinante();
        java.lang.Object obj18 = funcionCuadratica12.raices();
        funcionCuadratica12.setA((float) 0);
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica12);
        float float22 = funcionCuadratica12.getB();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-14000.0f) + "'", float15 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-14000.0f) + "'", float17 == (-14000.0f));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean30 = funcionCuadratica25.equals(funcionCuadratica29);
        float float32 = funcionCuadratica25.eval((float) (short) 1);
        float float33 = funcionCuadratica25.getC();
        float float34 = funcionCuadratica25.getC();
        boolean boolean35 = funcionCuadratica7.equals(funcionCuadratica25);
        float float36 = funcionCuadratica25.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 130.0f + "'", float32 == 130.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 97.0f + "'", float33 == 97.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 97.0f + "'", float34 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 97.0f + "'", float36 == 97.0f);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        float float22 = funcionCuadratica18.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean31 = funcionCuadratica26.equals(funcionCuadratica30);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica26.getClass();
        boolean boolean33 = funcionCuadratica18.equals(funcionCuadratica26);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica18.getClass();
        boolean boolean35 = funcionCuadratica3.equals(funcionCuadratica18);
        java.lang.Object obj36 = funcionCuadratica18.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        funcionCuadratica3.setB((float) (-1L));
        funcionCuadratica3.setB((float) 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(130.0f);
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 541027.0f + "'", float15 == 541027.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        java.lang.String str2 = funcionCuadratica0.toString();
        float float3 = funcionCuadratica0.getB();
        float float4 = funcionCuadratica0.getC();
        funcionCuadratica0.setA((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0x^2" + "'", str2.equals("0.0x^2"));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval((float) (byte) 0);
        float float16 = funcionCuadratica3.getA();
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        java.lang.Object obj16 = funcionCuadratica7.raices();
        boolean boolean17 = funcionCuadratica7.repOk();
        float float18 = funcionCuadratica7.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean18 = funcionCuadratica13.equals(funcionCuadratica17);
        java.lang.Object obj19 = funcionCuadratica17.raices();
        funcionCuadratica17.setC((float) 'a');
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica17);
        boolean boolean23 = funcionCuadratica7.repOk();
        java.lang.String str24 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "100.0x^2+35.0" + "'", str24.equals("100.0x^2+35.0"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean25 = funcionCuadratica20.equals(funcionCuadratica24);
        java.lang.Object obj26 = funcionCuadratica24.raices();
        boolean boolean27 = funcionCuadratica24.repOk();
        boolean boolean28 = funcionCuadratica24.repOk();
        float float29 = funcionCuadratica24.getC();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica12.equals(funcionCuadratica24);
        float float32 = funcionCuadratica24.getB();
        float float33 = funcionCuadratica24.determinante();
        funcionCuadratica24.setB(12135.0f);
        funcionCuadratica24.setA(10241.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 35.0f + "'", float29 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-14000.0f) + "'", float33 == (-14000.0f));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, 100032.0f, 10241.0f);
        funcionCuadratica3.setB((float) '#');
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100.0f, (float) (short) 100, (-11.0f));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (short) -1);
        float float7 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        boolean boolean9 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(435.0f, 10241.0f, 6055732.0f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, (float) 1, (float) (byte) 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) (byte) -1);
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        funcionCuadratica7.setB((-12415.0f));
        boolean boolean12 = funcionCuadratica7.repOk();
        float float14 = funcionCuadratica7.eval((float) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12550.0f + "'", float14 == 12550.0f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica18);
        float float23 = funcionCuadratica18.eval((-14000.0f));
        float float24 = funcionCuadratica18.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.9599999E10f + "'", float23 == 1.9599999E10f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setC((float) (short) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        java.lang.Object obj16 = funcionCuadratica7.raices();
        int int17 = funcionCuadratica7.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj15 = funcionCuadratica14.raices();
        float float16 = funcionCuadratica14.getC();
        boolean boolean17 = funcionCuadratica7.equals(funcionCuadratica14);
        funcionCuadratica7.setB((float) '#');
        float float20 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 35.0f + "'", float20 == 35.0f);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        funcionCuadratica11.setB(10.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica11.getClass();
        float float17 = funcionCuadratica11.eval(132.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1320.0f + "'", float17 == 1320.0f);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean9 = funcionCuadratica4.equals(funcionCuadratica8);
        java.lang.Object obj10 = funcionCuadratica8.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Object obj21 = funcionCuadratica19.raices();
        float float22 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica();
        boolean boolean24 = funcionCuadratica19.equals(funcionCuadratica23);
        boolean boolean25 = funcionCuadratica8.equals(funcionCuadratica23);
        float float26 = funcionCuadratica23.getA();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) -1, 122535.0f, (float) '4');
        funcionCuadratica3.setA((-12415.0f));
        funcionCuadratica3.setC(2752.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setC(1092.0f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean18 = funcionCuadratica13.equals(funcionCuadratica17);
        java.lang.Object obj19 = funcionCuadratica17.raices();
        java.lang.String str20 = funcionCuadratica17.toString();
        funcionCuadratica17.setC((float) (byte) 10);
        boolean boolean23 = funcionCuadratica7.equals(funcionCuadratica17);
        boolean boolean24 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "100.0x^2+35.0" + "'", str20.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        funcionCuadratica15.setC((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (-33.0f), 400.0f);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, 400.0f, 35.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        boolean boolean5 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+400.0x+35.0" + "'", str4.equals("0.0x^2+400.0x+35.0"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        java.lang.String str2 = funcionCuadratica0.toString();
        java.lang.String str3 = funcionCuadratica0.toString();
        float float4 = funcionCuadratica0.getA();
        float float5 = funcionCuadratica0.getC();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0x^2" + "'", str2.equals("0.0x^2"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0x^2" + "'", str3.equals("0.0x^2"));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica11.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0x^2+35.0" + "'", str4.equals("100.0x^2+35.0"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica7.getClass();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        java.lang.Object obj27 = funcionCuadratica25.raices();
        java.lang.String str28 = funcionCuadratica25.toString();
        float float29 = funcionCuadratica25.determinante();
        boolean boolean30 = funcionCuadratica7.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean39 = funcionCuadratica34.equals(funcionCuadratica38);
        java.lang.Object obj40 = funcionCuadratica38.raices();
        float float41 = funcionCuadratica38.determinante();
        java.lang.String str42 = funcionCuadratica38.toString();
        float float43 = funcionCuadratica38.determinante();
        java.lang.Object obj44 = funcionCuadratica38.raices();
        funcionCuadratica38.setA((float) 0);
        float float47 = funcionCuadratica38.getA();
        boolean boolean48 = funcionCuadratica25.equals(funcionCuadratica38);
        float float49 = funcionCuadratica38.getC();
        java.lang.Class<?> wildcardClass50 = funcionCuadratica38.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+35.0" + "'", str28.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-14000.0f) + "'", float29 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-14000.0f) + "'", float41 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "100.0x^2+35.0" + "'", str42.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-14000.0f) + "'", float43 == (-14000.0f));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 35.0f + "'", float49 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setB(100.0f);
        int int12 = funcionCuadratica7.numRaices();
        float float13 = funcionCuadratica7.getC();
        float float15 = funcionCuadratica7.eval((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 35.0f + "'", float15 == 35.0f);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.determinante();
        float float22 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica0.raices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) (-1));
        funcionCuadratica15.setB(32.0f);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean37 = funcionCuadratica32.equals(funcionCuadratica36);
        java.lang.Object obj38 = funcionCuadratica36.raices();
        float float39 = funcionCuadratica36.determinante();
        java.lang.String str40 = funcionCuadratica36.toString();
        float float41 = funcionCuadratica36.determinante();
        java.lang.Object obj42 = funcionCuadratica36.raices();
        funcionCuadratica36.setA((float) 0);
        java.lang.Object obj45 = funcionCuadratica36.raices();
        boolean boolean46 = funcionCuadratica15.equals(funcionCuadratica36);
        float float48 = funcionCuadratica36.eval((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-14000.0f) + "'", float39 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "100.0x^2+35.0" + "'", str40.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-14000.0f) + "'", float41 == (-14000.0f));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 35.0f + "'", float48 == 35.0f);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean18 = funcionCuadratica13.equals(funcionCuadratica17);
        java.lang.Object obj19 = funcionCuadratica17.raices();
        funcionCuadratica17.setC((float) 'a');
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica17);
        int int23 = funcionCuadratica17.numRaices();
        java.lang.Class<?> wildcardClass24 = funcionCuadratica17.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        float float10 = funcionCuadratica7.getA();
        float float11 = funcionCuadratica7.determinante();
        java.lang.String str12 = funcionCuadratica7.toString();
        java.lang.String str13 = funcionCuadratica7.toString();
        boolean boolean14 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-14000.0f) + "'", float11 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "100.0x^2+35.0" + "'", str12.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "100.0x^2+35.0" + "'", str13.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        java.lang.Object obj20 = funcionCuadratica18.raices();
        float float21 = funcionCuadratica18.determinante();
        java.lang.String str22 = funcionCuadratica18.toString();
        float float23 = funcionCuadratica18.determinante();
        java.lang.Class<?> wildcardClass24 = funcionCuadratica18.getClass();
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "100.0x^2+35.0" + "'", str22.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-14000.0f) + "'", float23 == (-14000.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10035.0f, 6055732.0f, (float) (short) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float6 = funcionCuadratica3.eval((-33.0f));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10035.0x^2+6055732.0x+100.0" + "'", str4.equals("10035.0x^2+6055732.0x+100.0"));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.88910944E8f) + "'", float6 == (-1.88910944E8f));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        java.lang.Class<?> wildcardClass1 = funcionCuadratica0.getClass();
        float float2 = funcionCuadratica0.determinante();
        practico5.FuncionCuadratica funcionCuadratica6 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj7 = funcionCuadratica6.raices();
        float float8 = funcionCuadratica6.getB();
        int int9 = funcionCuadratica6.numRaices();
        boolean boolean10 = funcionCuadratica0.equals(funcionCuadratica6);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica0.getClass();
        java.lang.Class<?> wildcardClass12 = funcionCuadratica0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (short) -1);
        funcionCuadratica3.setA((float) (-1L));
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setB(100032.0f);
        float float19 = funcionCuadratica3.eval(2.42354976E8f);
        float float20 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-5.8711688E16f) + "'", float19 == (-5.8711688E16f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 97.0f + "'", float20 == 97.0f);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        float float26 = funcionCuadratica24.getB();
        float float27 = funcionCuadratica24.getB();
        boolean boolean28 = funcionCuadratica15.equals(funcionCuadratica24);
        java.lang.String str29 = funcionCuadratica24.toString();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica7.equals(funcionCuadratica24);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica24.getClass();
        funcionCuadratica24.setA(1.54128224E8f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str29.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        funcionCuadratica7.setC((-14000.0f));
        java.lang.String str18 = funcionCuadratica7.toString();
        boolean boolean19 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0.0x^2+-14000.0" + "'", str18.equals("0.0x^2+-14000.0"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        funcionCuadratica3.setB(102.0f);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10404.0f + "'", float9 == 10404.0f);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean34 = funcionCuadratica29.equals(funcionCuadratica33);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj39 = funcionCuadratica38.raices();
        float float40 = funcionCuadratica38.getB();
        float float41 = funcionCuadratica38.getB();
        boolean boolean42 = funcionCuadratica29.equals(funcionCuadratica38);
        java.lang.String str43 = funcionCuadratica38.toString();
        java.lang.Class<?> wildcardClass44 = funcionCuadratica38.getClass();
        boolean boolean45 = funcionCuadratica15.equals(funcionCuadratica38);
        java.lang.String str46 = funcionCuadratica15.toString();
        int int47 = funcionCuadratica15.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str43.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "32.0x^2+1.0x+97.0" + "'", str46.equals("32.0x^2+1.0x+97.0"));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float11 = funcionCuadratica7.getA();
        funcionCuadratica7.setA((-1.0f));
        float float14 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        float float12 = funcionCuadratica3.getC();
        boolean boolean13 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        java.lang.String str13 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        funcionCuadratica3.setA((-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32.0x^2+1.0x" + "'", str13.equals("32.0x^2+1.0x"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        funcionCuadratica7.setB(10241.0f);
        float float19 = funcionCuadratica7.getB();
        funcionCuadratica7.setA(2752.0f);
        funcionCuadratica7.setC(0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10241.0f + "'", float19 == 10241.0f);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10035.0f, 6055732.0f, (float) (short) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10035.0x^2+6055732.0x+100.0" + "'", str4.equals("10035.0x^2+6055732.0x+100.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.6671886E13f + "'", float5 == 3.6671886E13f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setB((float) (byte) 1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((-12415.0f));
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.54128224E8f + "'", float7 == 1.54128224E8f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        funcionCuadratica3.setA((float) ' ');
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean15 = funcionCuadratica10.equals(funcionCuadratica14);
        java.lang.Object obj16 = funcionCuadratica14.raices();
        funcionCuadratica14.setB((-12415.0f));
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica14);
        int int20 = funcionCuadratica14.numRaices();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(17392.0f, (-12415.0f), (-14000.0f));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(435.0f);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 2, (float) 'a', 0.0f);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica19);
        float float21 = funcionCuadratica19.determinante();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 9409.0f + "'", float21 == 9409.0f);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean13 = funcionCuadratica8.equals(funcionCuadratica12);
        float float15 = funcionCuadratica8.eval((float) (short) 1);
        float float16 = funcionCuadratica8.getC();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica8);
        boolean boolean18 = funcionCuadratica3.repOk();
        float float19 = funcionCuadratica3.getA();
        float float20 = funcionCuadratica3.getB();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 130.0f + "'", float15 == 130.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 97.0f + "'", float16 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.String str16 = funcionCuadratica11.toString();
        float float18 = funcionCuadratica11.eval(35.0f);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean27 = funcionCuadratica22.equals(funcionCuadratica26);
        java.lang.Object obj28 = funcionCuadratica26.raices();
        boolean boolean29 = funcionCuadratica26.repOk();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean38 = funcionCuadratica33.equals(funcionCuadratica37);
        float float39 = funcionCuadratica37.getB();
        boolean boolean40 = funcionCuadratica26.equals(funcionCuadratica37);
        boolean boolean41 = funcionCuadratica11.equals(funcionCuadratica37);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 122535.0f + "'", float18 == 122535.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, 122535.0f, (-11.0f));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((-11.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1347775.0f) + "'", float10 == (-1347775.0f));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval((float) (byte) 0);
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 97.0f + "'", float16 == 97.0f);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float4 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.eval(32.0f);
        funcionCuadratica3.setA(102.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1092.0f + "'", float6 == 1092.0f);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        int int12 = funcionCuadratica7.numRaices();
        boolean boolean13 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        java.lang.String str13 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float16 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "32.0x^2+1.0x" + "'", str13.equals("32.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) -1, 122535.0f, (float) '4');
        funcionCuadratica3.setA((-12415.0f));
        float float6 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 122535.0f + "'", float6 == 122535.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.String str16 = funcionCuadratica11.toString();
        float float18 = funcionCuadratica11.eval(35.0f);
        int int19 = funcionCuadratica11.numRaices();
        java.lang.Object obj20 = funcionCuadratica11.raices();
        float float21 = funcionCuadratica11.determinante();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 122535.0f + "'", float18 == 122535.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, 400.0f, 35.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((float) (byte) 100);
        int int8 = funcionCuadratica3.numRaices();
        float float9 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.eval(130.0f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+400.0x+35.0" + "'", str4.equals("0.0x^2+400.0x+35.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 400.0f + "'", float5 == 400.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1742035.0f + "'", float11 == 1742035.0f);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str4.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str5.equals("0.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        float float7 = funcionCuadratica4.getC();
        funcionCuadratica4.setB((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        int int4 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        int int7 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean16 = funcionCuadratica11.equals(funcionCuadratica15);
        java.lang.Object obj17 = funcionCuadratica15.raices();
        float float18 = funcionCuadratica15.determinante();
        java.lang.String str19 = funcionCuadratica15.toString();
        float float20 = funcionCuadratica15.determinante();
        java.lang.Object obj21 = funcionCuadratica15.raices();
        funcionCuadratica15.setA((float) 0);
        java.lang.Object obj24 = funcionCuadratica15.raices();
        boolean boolean25 = funcionCuadratica15.repOk();
        funcionCuadratica15.setA(100.0f);
        java.lang.Object obj28 = funcionCuadratica15.raices();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica15);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-14000.0f) + "'", float18 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "100.0x^2+35.0" + "'", str19.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-14000.0f) + "'", float20 == (-14000.0f));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj15 = funcionCuadratica14.raices();
        float float16 = funcionCuadratica14.getC();
        boolean boolean17 = funcionCuadratica7.equals(funcionCuadratica14);
        boolean boolean18 = funcionCuadratica14.repOk();
        funcionCuadratica14.setC((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        float float6 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float12 = funcionCuadratica7.eval((float) 2);
        float float14 = funcionCuadratica7.eval(2752.0f);
        float float15 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 435.0f + "'", float12 == 435.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 7.5735046E8f + "'", float14 == 7.5735046E8f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        boolean boolean13 = funcionCuadratica7.repOk();
        float float15 = funcionCuadratica7.eval((-11.0f));
        float float16 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 12135.0f + "'", float15 == 12135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        float float10 = funcionCuadratica7.getA();
        java.lang.Object obj11 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) -1, 122535.0f, (float) '4');
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        float float17 = funcionCuadratica12.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (short) -1);
        funcionCuadratica3.setA((float) (-1L));
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setB(100032.0f);
        int int18 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean18 = funcionCuadratica13.equals(funcionCuadratica17);
        java.lang.Object obj19 = funcionCuadratica17.raices();
        java.lang.String str20 = funcionCuadratica17.toString();
        funcionCuadratica17.setC((float) (byte) 10);
        boolean boolean23 = funcionCuadratica7.equals(funcionCuadratica17);
        float float24 = funcionCuadratica17.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "100.0x^2+35.0" + "'", str20.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, 100032.0f, 10241.0f);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        float float7 = funcionCuadratica4.getB();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        java.lang.Class<?> wildcardClass23 = funcionCuadratica7.getClass();
        float float24 = funcionCuadratica7.getB();
        java.lang.Object obj25 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        float float12 = funcionCuadratica7.getC();
        boolean boolean13 = funcionCuadratica7.repOk();
        boolean boolean14 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        funcionCuadratica7.setB(10241.0f);
        float float19 = funcionCuadratica7.determinante();
        java.lang.String str20 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0487808E8f + "'", float19 == 1.0487808E8f);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0.0x^2+10241.0x+35.0" + "'", str20.equals("0.0x^2+10241.0x+35.0"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setB((-3999.0f));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        funcionCuadratica11.setC((float) 'a');
        java.lang.Class<?> wildcardClass17 = funcionCuadratica11.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        funcionCuadratica3.setB(102.0f);
        boolean boolean8 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        funcionCuadratica7.setA((float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
        float float24 = funcionCuadratica17.eval((float) (short) 1);
        funcionCuadratica17.setC(0.0f);
        funcionCuadratica17.setC((float) 0);
        float float29 = funcionCuadratica17.determinante();
        java.lang.String str30 = funcionCuadratica17.toString();
        boolean boolean31 = funcionCuadratica7.equals(funcionCuadratica17);
        float float32 = funcionCuadratica17.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 130.0f + "'", float24 == 130.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "32.0x^2+1.0x" + "'", str30.equals("32.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float5 = funcionCuadratica3.eval((float) '4');
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2752.0f + "'", float5 == 2752.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setA(122535.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.String str15 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "122535.0x^2+100.0x+97.0" + "'", str15.equals("122535.0x^2+100.0x+97.0"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(135.0f, 0.0f, 1.00701225E10f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        java.lang.Object obj16 = funcionCuadratica7.raices();
        float float17 = funcionCuadratica7.getA();
        funcionCuadratica7.setC(320235.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, 97.0f, (float) (short) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((-5.8711688E16f));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0x^2+97.0x+100.0" + "'", str4.equals("32.0x^2+97.0x+100.0"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0x^2+35.0" + "'", str5.equals("100.0x^2+35.0"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-3999.0f) + "'", float4 == (-3999.0f));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj15 = funcionCuadratica14.raices();
        float float16 = funcionCuadratica14.getC();
        boolean boolean17 = funcionCuadratica7.equals(funcionCuadratica14);
        float float18 = funcionCuadratica14.determinante();
        float float19 = funcionCuadratica14.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        java.lang.String str17 = funcionCuadratica12.toString();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica12.getClass();
        boolean boolean19 = funcionCuadratica12.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str17.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean9 = funcionCuadratica4.equals(funcionCuadratica8);
        java.lang.Object obj10 = funcionCuadratica8.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Object obj21 = funcionCuadratica19.raices();
        float float22 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica();
        boolean boolean24 = funcionCuadratica19.equals(funcionCuadratica23);
        boolean boolean25 = funcionCuadratica8.equals(funcionCuadratica23);
        float float26 = funcionCuadratica23.determinante();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean25 = funcionCuadratica20.equals(funcionCuadratica24);
        java.lang.Object obj26 = funcionCuadratica24.raices();
        boolean boolean27 = funcionCuadratica24.repOk();
        boolean boolean28 = funcionCuadratica24.repOk();
        float float29 = funcionCuadratica24.getC();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica12.equals(funcionCuadratica24);
        float float33 = funcionCuadratica24.eval(1092.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 35.0f + "'", float29 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.19246432E8f + "'", float33 == 1.19246432E8f);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float4 = funcionCuadratica3.getB();
        boolean boolean5 = funcionCuadratica3.repOk();
        funcionCuadratica3.setC(97.0f);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        java.lang.Class<?> wildcardClass1 = funcionCuadratica0.getClass();
        float float2 = funcionCuadratica0.determinante();
        practico5.FuncionCuadratica funcionCuadratica6 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj7 = funcionCuadratica6.raices();
        float float8 = funcionCuadratica6.getB();
        int int9 = funcionCuadratica6.numRaices();
        boolean boolean10 = funcionCuadratica0.equals(funcionCuadratica6);
        java.lang.Object obj11 = funcionCuadratica6.raices();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(10241.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10404.0f, 0.0f, 0.0f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, 400.0f, 10241.0f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        float float14 = funcionCuadratica11.getC();
        boolean boolean15 = funcionCuadratica11.repOk();
        int int16 = funcionCuadratica11.numRaices();
        float float17 = funcionCuadratica11.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        funcionCuadratica3.setB((float) (-1L));
        funcionCuadratica3.setA(6956799.0f);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean13 = funcionCuadratica8.equals(funcionCuadratica12);
        float float15 = funcionCuadratica8.eval((float) (short) 1);
        float float16 = funcionCuadratica8.getC();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica8);
        boolean boolean18 = funcionCuadratica3.repOk();
        boolean boolean19 = funcionCuadratica3.repOk();
        float float20 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 130.0f + "'", float15 == 130.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 97.0f + "'", float16 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean30 = funcionCuadratica25.equals(funcionCuadratica29);
        float float32 = funcionCuadratica25.eval((float) (short) 1);
        float float33 = funcionCuadratica25.getC();
        float float34 = funcionCuadratica25.getC();
        boolean boolean35 = funcionCuadratica7.equals(funcionCuadratica25);
        float float36 = funcionCuadratica25.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 130.0f + "'", float32 == 130.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 97.0f + "'", float33 == 97.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 97.0f + "'", float34 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-12415.0f) + "'", float36 == (-12415.0f));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        boolean boolean7 = funcionCuadratica3.repOk();
        funcionCuadratica3.setA(1.9599999E10f);
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.getB();
        float float12 = funcionCuadratica3.getC();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        float float11 = funcionCuadratica7.determinante();
        float float13 = funcionCuadratica7.eval(0.0f);
        funcionCuadratica7.setC((float) 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-14000.0f) + "'", float11 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, 0.0f, (float) 2);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "97.0x^2+2.0" + "'", str5.equals("97.0x^2+2.0"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setC((float) '#');
        float float27 = funcionCuadratica15.getB();
        float float28 = funcionCuadratica15.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 35.0f + "'", float28 == 35.0f);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(35.0f);
        funcionCuadratica3.setB(1.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.eval((float) (short) 10);
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-11.0f) + "'", float6 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        int int15 = funcionCuadratica11.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float4 = funcionCuadratica3.getB();
        boolean boolean5 = funcionCuadratica3.repOk();
        funcionCuadratica3.setC(97.0f);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (byte) -1, (-4479.0f));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, 135.0f, (float) (short) 10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((float) (byte) -1);
        int int13 = funcionCuadratica3.numRaices();
        float float14 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        boolean boolean7 = funcionCuadratica3.repOk();
        funcionCuadratica3.setB((-11.0f));
        boolean boolean10 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, 100032.0f, 10241.0f);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        float float7 = funcionCuadratica4.getC();
        funcionCuadratica4.setB(0.0f);
        java.lang.String str10 = funcionCuadratica4.toString();
        float float11 = funcionCuadratica4.determinante();
        java.lang.Class<?> wildcardClass12 = funcionCuadratica4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2" + "'", str10.equals("1.0x^2"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float12 = funcionCuadratica7.eval((float) 2);
        float float13 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 435.0f + "'", float12 == 435.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval((float) (byte) 0);
        float float16 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica3.getClass();
        java.lang.String str18 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "32.0x^2+1.0x+97.0" + "'", str18.equals("32.0x^2+1.0x+97.0"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        funcionCuadratica4.setA(135.0f);
        int int8 = funcionCuadratica4.numRaices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, 400.0f, 35.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean13 = funcionCuadratica8.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        float float19 = funcionCuadratica17.getB();
        float float20 = funcionCuadratica17.getB();
        boolean boolean21 = funcionCuadratica8.equals(funcionCuadratica17);
        java.lang.String str22 = funcionCuadratica17.toString();
        java.lang.Class<?> wildcardClass23 = funcionCuadratica17.getClass();
        boolean boolean24 = funcionCuadratica3.equals(funcionCuadratica17);
        funcionCuadratica3.setA((float) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+400.0x+35.0" + "'", str4.equals("0.0x^2+400.0x+35.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str22.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.getB();
        java.lang.Class<?> wildcardClass22 = funcionCuadratica7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.eval((-1.0f));
        java.lang.Object obj16 = funcionCuadratica3.raices();
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Object obj11 = funcionCuadratica7.raices();
        boolean boolean12 = funcionCuadratica7.repOk();
        funcionCuadratica7.setC(132.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6956799.0f, 0.0f, 1.0f);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (short) -1);
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-1.0x^2+1.0x+97.0" + "'", str12.equals("-1.0x^2+1.0x+97.0"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1347775.0f), (float) (-1L), 1.54128224E8f);
        float float5 = funcionCuadratica3.eval(400.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-2.15489888E11f) + "'", float5 == (-2.15489888E11f));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        funcionCuadratica3.setB(102.0f);
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10404.0f + "'", float8 == 10404.0f);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.getC();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Object obj21 = funcionCuadratica19.raices();
        float float22 = funcionCuadratica19.determinante();
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica19);
        boolean boolean24 = funcionCuadratica19.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-14000.0f) + "'", float22 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica(10241.0f, (float) (short) 10, 10.0f);
        float float15 = funcionCuadratica14.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica14);
        float float17 = funcionCuadratica3.getB();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10241.0f + "'", float15 == 10241.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        float float14 = funcionCuadratica11.getC();
        boolean boolean15 = funcionCuadratica11.repOk();
        int int16 = funcionCuadratica11.numRaices();
        java.lang.Object obj17 = funcionCuadratica11.raices();
        float float18 = funcionCuadratica11.getA();
        funcionCuadratica11.setC((float) 100L);
        float float21 = funcionCuadratica11.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        float float6 = funcionCuadratica0.getB();
        funcionCuadratica0.setB((float) (-1));
        funcionCuadratica0.setC((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        funcionCuadratica11.setC((float) 'a');
        funcionCuadratica11.setC(1092.0f);
        float float19 = funcionCuadratica11.getA();
        float float20 = funcionCuadratica11.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1092.0f + "'", float20 == 1092.0f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean18 = funcionCuadratica13.equals(funcionCuadratica17);
        java.lang.Object obj19 = funcionCuadratica17.raices();
        funcionCuadratica17.setC((float) 'a');
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica17);
        funcionCuadratica7.setA((float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(10035.0f);
        boolean boolean7 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((-12415.0f));
        java.lang.String str7 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+-12415.0x+100.0" + "'", str7.equals("10.0x^2+-12415.0x+100.0"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica7.getClass();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        java.lang.Object obj27 = funcionCuadratica25.raices();
        java.lang.String str28 = funcionCuadratica25.toString();
        float float29 = funcionCuadratica25.determinante();
        boolean boolean30 = funcionCuadratica7.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean39 = funcionCuadratica34.equals(funcionCuadratica38);
        java.lang.Object obj40 = funcionCuadratica38.raices();
        float float41 = funcionCuadratica38.determinante();
        java.lang.String str42 = funcionCuadratica38.toString();
        float float43 = funcionCuadratica38.determinante();
        java.lang.Object obj44 = funcionCuadratica38.raices();
        funcionCuadratica38.setA((float) 0);
        float float47 = funcionCuadratica38.getA();
        boolean boolean48 = funcionCuadratica25.equals(funcionCuadratica38);
        float float49 = funcionCuadratica25.determinante();
        int int50 = funcionCuadratica25.numRaices();
        funcionCuadratica25.setA(100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+35.0" + "'", str28.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-14000.0f) + "'", float29 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-14000.0f) + "'", float41 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "100.0x^2+35.0" + "'", str42.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-14000.0f) + "'", float43 == (-14000.0f));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-14000.0f) + "'", float49 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        float float22 = funcionCuadratica18.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean31 = funcionCuadratica26.equals(funcionCuadratica30);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica26.getClass();
        boolean boolean33 = funcionCuadratica18.equals(funcionCuadratica26);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica18.getClass();
        boolean boolean35 = funcionCuadratica3.equals(funcionCuadratica18);
        funcionCuadratica3.setA(12135.0f);
        float float38 = funcionCuadratica3.getC();
        float float39 = funcionCuadratica3.getB();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+35.0" + "'", str7.equals("-1.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        funcionCuadratica7.setA(400.0f);
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) (short) -1, 122535.0f, (float) '4');
        funcionCuadratica16.setA((-12415.0f));
        boolean boolean19 = funcionCuadratica7.equals(funcionCuadratica16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        float float26 = funcionCuadratica15.getA();
        float float27 = funcionCuadratica15.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 32.0f + "'", float26 == 32.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 32.0f + "'", float27 == 32.0f);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        float float14 = funcionCuadratica11.getC();
        boolean boolean15 = funcionCuadratica11.repOk();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica11.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        funcionCuadratica3.setA((float) ' ');
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean15 = funcionCuadratica10.equals(funcionCuadratica14);
        java.lang.Object obj16 = funcionCuadratica14.raices();
        funcionCuadratica14.setB((-12415.0f));
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica14);
        java.lang.Object obj20 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.String str16 = funcionCuadratica11.toString();
        float float18 = funcionCuadratica11.eval(35.0f);
        int int19 = funcionCuadratica11.numRaices();
        java.lang.Object obj20 = funcionCuadratica11.raices();
        funcionCuadratica11.setA((float) (byte) 100);
        float float24 = funcionCuadratica11.eval(541027.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 122535.0f + "'", float18 == 122535.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 2.92710221E13f + "'", float24 == 2.92710221E13f);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(435.0f);
        float float7 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str4.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        float float6 = funcionCuadratica0.getB();
        java.lang.Object obj7 = funcionCuadratica0.raices();
        float float9 = funcionCuadratica0.eval((-3391.0f));
        int int10 = funcionCuadratica0.numRaices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        float float7 = funcionCuadratica4.getC();
        funcionCuadratica4.setB(0.0f);
        java.lang.String str10 = funcionCuadratica4.toString();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        java.lang.Object obj20 = funcionCuadratica18.raices();
        float float21 = funcionCuadratica18.determinante();
        java.lang.String str22 = funcionCuadratica18.toString();
        float float23 = funcionCuadratica18.determinante();
        boolean boolean24 = funcionCuadratica18.repOk();
        java.lang.Object obj25 = funcionCuadratica18.raices();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica18.getClass();
        boolean boolean27 = funcionCuadratica4.equals(funcionCuadratica18);
        float float28 = funcionCuadratica18.determinante();
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float33 = funcionCuadratica32.getC();
        funcionCuadratica32.setC((float) (short) -1);
        float float36 = funcionCuadratica32.getC();
        float float37 = funcionCuadratica32.determinante();
        float float38 = funcionCuadratica32.determinante();
        boolean boolean39 = funcionCuadratica18.equals(funcionCuadratica32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2" + "'", str10.equals("1.0x^2"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "100.0x^2+35.0" + "'", str22.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-14000.0f) + "'", float23 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-14000.0f) + "'", float28 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 35.0f + "'", float33 == 35.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 400.0f + "'", float37 == 400.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 400.0f + "'", float38 == 400.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        float float12 = funcionCuadratica7.eval((float) 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 135.0f + "'", float12 == 135.0f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '#', (float) (short) 10, (-14000.0f));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        float float26 = funcionCuadratica15.getA();
        java.lang.String str27 = funcionCuadratica15.toString();
        java.lang.Object obj28 = funcionCuadratica15.raices();
        int int29 = funcionCuadratica15.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 32.0f + "'", float26 == 32.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "32.0x^2+1.0x+97.0" + "'", str27.equals("32.0x^2+1.0x+97.0"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((float) (byte) -1);
        int int13 = funcionCuadratica3.numRaices();
        java.lang.String str14 = funcionCuadratica3.toString();
        java.lang.Object obj15 = funcionCuadratica3.raices();
        boolean boolean16 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "32.0x^2+1.0x+-1.0" + "'", str14.equals("32.0x^2+1.0x+-1.0"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        java.lang.Class<?> wildcardClass23 = funcionCuadratica7.getClass();
        float float24 = funcionCuadratica7.getB();
        int int25 = funcionCuadratica7.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        funcionCuadratica3.setA(10035.0f);
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        float float11 = funcionCuadratica9.getB();
        int int12 = funcionCuadratica9.numRaices();
        boolean boolean13 = funcionCuadratica9.repOk();
        funcionCuadratica9.setB((-11.0f));
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica9);
        boolean boolean17 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(1092.0f);
        float float14 = funcionCuadratica3.eval((-3391.0f));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.25567816E10f + "'", float14 == 1.25567816E10f);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10241.0f, (float) (short) 10, 10.0f);
        float float4 = funcionCuadratica3.getA();
        float float5 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10241.0f + "'", float4 == 10241.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setB(10035.0f);
        java.lang.String str8 = funcionCuadratica3.toString();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1.0x^2+10035.0x" + "'", str8.equals("-1.0x^2+10035.0x"));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float5 = funcionCuadratica3.eval((float) '4');
        funcionCuadratica3.setB((-1.00701225E10f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2752.0f + "'", float5 == 2752.0f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        float float6 = funcionCuadratica0.getB();
        funcionCuadratica0.setB((float) (-1));
        funcionCuadratica0.setC((-4479.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        float float14 = funcionCuadratica11.getC();
        boolean boolean15 = funcionCuadratica11.repOk();
        funcionCuadratica11.setA(1.9599999E10f);
        funcionCuadratica11.setB(122535.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        funcionCuadratica3.setA((float) 100L);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10035.0f, 2.42354976E8f, (float) (short) 0);
        funcionCuadratica3.setC((float) 2);
        funcionCuadratica3.setA((-1347775.0f));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        float float14 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((-33.0f));
        funcionCuadratica3.setB(400.0f);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean27 = funcionCuadratica22.equals(funcionCuadratica26);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        float float33 = funcionCuadratica31.getB();
        float float34 = funcionCuadratica31.getB();
        boolean boolean35 = funcionCuadratica22.equals(funcionCuadratica31);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean44 = funcionCuadratica39.equals(funcionCuadratica43);
        java.lang.Object obj45 = funcionCuadratica43.raices();
        float float46 = funcionCuadratica43.determinante();
        java.lang.String str47 = funcionCuadratica43.toString();
        float float48 = funcionCuadratica43.determinante();
        java.lang.Object obj49 = funcionCuadratica43.raices();
        funcionCuadratica43.setA((float) 0);
        funcionCuadratica43.setC((-14000.0f));
        java.lang.String str54 = funcionCuadratica43.toString();
        java.lang.Object obj55 = funcionCuadratica43.raices();
        boolean boolean56 = funcionCuadratica31.equals(funcionCuadratica43);
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica43);
        java.lang.String str58 = funcionCuadratica43.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 97.0f + "'", float14 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-14000.0f) + "'", float46 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "100.0x^2+35.0" + "'", str47.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-14000.0f) + "'", float48 == (-14000.0f));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "0.0x^2+-14000.0" + "'", str54.equals("0.0x^2+-14000.0"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "0.0x^2+-14000.0" + "'", str58.equals("0.0x^2+-14000.0"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        float float12 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica13 = null;
        try {
            boolean boolean14 = funcionCuadratica7.equals(funcionCuadratica13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        funcionCuadratica7.setA(400.0f);
        float float13 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, 6.0557318E8f, 132.0f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) (-1));
        funcionCuadratica15.setA((float) 1);
        float float29 = funcionCuadratica15.getC();
        float float30 = funcionCuadratica15.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 97.0f + "'", float29 == 97.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-387.0f) + "'", float30 == (-387.0f));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        int int7 = funcionCuadratica3.numRaices();
        boolean boolean8 = funcionCuadratica3.repOk();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 6956799.0f, 6055732.0f);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 35.0f, 35.0f);
        funcionCuadratica3.setA(0.0f);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) 10L);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-3879.0f) + "'", float13 == (-3879.0f));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (short) -1);
        funcionCuadratica3.setB((float) '4');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1), (float) (short) 1, (float) (byte) 100);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        funcionCuadratica11.setB(10.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica11.getClass();
        java.lang.String str16 = funcionCuadratica11.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0.0x^2+10.0x" + "'", str16.equals("0.0x^2+10.0x"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.eval((float) (byte) 1);
        float float16 = funcionCuadratica7.getC();
        float float17 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 135.0f + "'", float15 == 135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 35.0f + "'", float17 == 35.0f);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica7.getClass();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        java.lang.Object obj27 = funcionCuadratica25.raices();
        java.lang.String str28 = funcionCuadratica25.toString();
        float float29 = funcionCuadratica25.determinante();
        boolean boolean30 = funcionCuadratica7.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean39 = funcionCuadratica34.equals(funcionCuadratica38);
        java.lang.Object obj40 = funcionCuadratica38.raices();
        float float41 = funcionCuadratica38.determinante();
        java.lang.String str42 = funcionCuadratica38.toString();
        float float43 = funcionCuadratica38.determinante();
        java.lang.Object obj44 = funcionCuadratica38.raices();
        funcionCuadratica38.setA((float) 0);
        float float47 = funcionCuadratica38.getA();
        boolean boolean48 = funcionCuadratica25.equals(funcionCuadratica38);
        java.lang.Object obj49 = funcionCuadratica38.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+35.0" + "'", str28.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-14000.0f) + "'", float29 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-14000.0f) + "'", float41 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "100.0x^2+35.0" + "'", str42.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-14000.0f) + "'", float43 == (-14000.0f));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.eval((float) (byte) 1);
        float float16 = funcionCuadratica7.getC();
        funcionCuadratica7.setC((float) '4');
        funcionCuadratica7.setA((-1.00701225E10f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 135.0f + "'", float15 == 135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (-33.0f), 1.00701225E10f);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100, (float) 0L, 2752.0f);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean34 = funcionCuadratica29.equals(funcionCuadratica33);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj39 = funcionCuadratica38.raices();
        float float40 = funcionCuadratica38.getB();
        float float41 = funcionCuadratica38.getB();
        boolean boolean42 = funcionCuadratica29.equals(funcionCuadratica38);
        java.lang.String str43 = funcionCuadratica38.toString();
        java.lang.Class<?> wildcardClass44 = funcionCuadratica38.getClass();
        boolean boolean45 = funcionCuadratica15.equals(funcionCuadratica38);
        boolean boolean46 = funcionCuadratica15.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str43.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, 400.0f, 35.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6956799.0f, (float) (-1L), 6055732.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica7.getClass();
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica7.getClass();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica7.getClass();
        float float14 = funcionCuadratica7.determinante();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        funcionCuadratica3.setC((float) ' ');
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean14 = funcionCuadratica9.equals(funcionCuadratica13);
        java.lang.Object obj15 = funcionCuadratica13.raices();
        funcionCuadratica13.setC((float) 'a');
        float float18 = funcionCuadratica13.determinante();
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica13);
        boolean boolean20 = funcionCuadratica13.repOk();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-38800.0f) + "'", float18 == (-38800.0f));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) (-1));
        funcionCuadratica15.setB(32.0f);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean37 = funcionCuadratica32.equals(funcionCuadratica36);
        java.lang.Object obj38 = funcionCuadratica36.raices();
        float float39 = funcionCuadratica36.determinante();
        java.lang.String str40 = funcionCuadratica36.toString();
        float float41 = funcionCuadratica36.determinante();
        java.lang.Object obj42 = funcionCuadratica36.raices();
        funcionCuadratica36.setA((float) 0);
        java.lang.Object obj45 = funcionCuadratica36.raices();
        boolean boolean46 = funcionCuadratica15.equals(funcionCuadratica36);
        float float48 = funcionCuadratica15.eval(12135.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-14000.0f) + "'", float39 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "100.0x^2+35.0" + "'", str40.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-14000.0f) + "'", float41 == (-14000.0f));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 4.7126513E9f + "'", float48 == 4.7126513E9f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(1.0487808E8f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str4.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (short) -1);
        boolean boolean12 = funcionCuadratica3.repOk();
        funcionCuadratica3.setB(1.0487808E8f);
        java.lang.String str15 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0.0x^2+1.0487808E8x+-1.0" + "'", str15.equals("0.0x^2+1.0487808E8x+-1.0"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        float float21 = funcionCuadratica19.getB();
        float float23 = funcionCuadratica19.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean32 = funcionCuadratica27.equals(funcionCuadratica31);
        java.lang.Class<?> wildcardClass33 = funcionCuadratica27.getClass();
        boolean boolean34 = funcionCuadratica19.equals(funcionCuadratica27);
        float float35 = funcionCuadratica27.getA();
        float float36 = funcionCuadratica27.determinante();
        boolean boolean37 = funcionCuadratica7.equals(funcionCuadratica27);
        float float38 = funcionCuadratica7.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 35.0f + "'", float23 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 32.0f + "'", float35 == 32.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-12415.0f) + "'", float36 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-14000.0f) + "'", float38 == (-14000.0f));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        funcionCuadratica11.setB(3.6671886E13f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 0, 0.0f, (float) (short) 10);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica11.getClass();
        java.lang.String str14 = funcionCuadratica11.toString();
        float float15 = funcionCuadratica11.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0.0x^2" + "'", str14.equals("0.0x^2"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100.0f, (-3879.0f), 102.0f);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(130.0f, 320235.0f, (-1347775.0f));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-12415.0f), 32.0f, 132.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-12415.0x^2+32.0x+132.0" + "'", str4.equals("-12415.0x^2+32.0x+132.0"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.eval((float) (byte) 1);
        float float16 = funcionCuadratica7.getC();
        funcionCuadratica7.setC((float) '4');
        float float19 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 135.0f + "'", float15 == 135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 52.0f + "'", float19 == 52.0f);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC(135.0f);
        float float16 = funcionCuadratica3.eval((float) 100);
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 320235.0f + "'", float16 == 320235.0f);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        funcionCuadratica3.setC((float) ' ');
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(100.0f);
        float float11 = funcionCuadratica3.eval((float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float16 = funcionCuadratica15.getC();
        funcionCuadratica15.setC((float) (short) -1);
        float float19 = funcionCuadratica15.getC();
        float float20 = funcionCuadratica15.determinante();
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica15);
        funcionCuadratica15.setB(0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 132.0f + "'", float11 == 132.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 400.0f + "'", float20 == 400.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
        java.lang.Object obj23 = funcionCuadratica21.raices();
        funcionCuadratica21.setB((-12415.0f));
        boolean boolean26 = funcionCuadratica21.repOk();
        boolean boolean27 = funcionCuadratica7.equals(funcionCuadratica21);
        java.lang.String str28 = funcionCuadratica21.toString();
        funcionCuadratica21.setC(1742035.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+-12415.0x+35.0" + "'", str28.equals("100.0x^2+-12415.0x+35.0"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        float float5 = funcionCuadratica3.determinante();
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-14000.0f) + "'", float5 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.getA();
        boolean boolean25 = funcionCuadratica15.repOk();
        funcionCuadratica15.setB((float) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 32.0f + "'", float24 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        java.lang.Class<?> wildcardClass23 = funcionCuadratica7.getClass();
        float float24 = funcionCuadratica7.determinante();
        funcionCuadratica7.setB((float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-14000.0f) + "'", float24 == (-14000.0f));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica12);
        float float14 = funcionCuadratica3.getA();
        float float15 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-3999.0f) + "'", float8 == (-3999.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.determinante();
        float float17 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        float float13 = funcionCuadratica7.getA();
        float float14 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (-33.0f), 400.0f);
        float float5 = funcionCuadratica3.eval((float) 0L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 400.0f + "'", float5 == 400.0f);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        boolean boolean13 = funcionCuadratica7.repOk();
        java.lang.Object obj14 = funcionCuadratica7.raices();
        funcionCuadratica7.setC(102.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica7.getClass();
        funcionCuadratica7.setB((float) (byte) 0);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica(135.0f, 0.0f, 1.00701225E10f);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica20.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica20);
        funcionCuadratica7.setC(10241.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.eval((float) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str4.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-36.0f) + "'", float7 == (-36.0f));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        java.lang.String str2 = funcionCuadratica0.toString();
        java.lang.String str3 = funcionCuadratica0.toString();
        java.lang.Class<?> wildcardClass4 = funcionCuadratica0.getClass();
        java.lang.Object obj5 = funcionCuadratica0.raices();
        funcionCuadratica0.setB((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0x^2" + "'", str2.equals("0.0x^2"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0x^2" + "'", str3.equals("0.0x^2"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica7.getClass();
        java.lang.Object obj15 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        int int17 = funcionCuadratica12.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float12 = funcionCuadratica7.eval((float) 2);
        float float13 = funcionCuadratica7.getB();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
        java.lang.Object obj23 = funcionCuadratica21.raices();
        float float24 = funcionCuadratica21.determinante();
        java.lang.String str25 = funcionCuadratica21.toString();
        float float26 = funcionCuadratica21.determinante();
        boolean boolean27 = funcionCuadratica21.repOk();
        java.lang.Object obj28 = funcionCuadratica21.raices();
        boolean boolean29 = funcionCuadratica7.equals(funcionCuadratica21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 435.0f + "'", float12 == 435.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-14000.0f) + "'", float24 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "100.0x^2+35.0" + "'", str25.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-14000.0f) + "'", float26 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        float float18 = funcionCuadratica7.eval((float) (short) 1);
        funcionCuadratica7.setA(100032.0f);
        java.lang.String str21 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 35.0f + "'", float18 == 35.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "100032.0x^2+35.0" + "'", str21.equals("100032.0x^2+35.0"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 1, (float) (byte) 1);
        funcionCuadratica3.setA((float) (short) 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float12 = funcionCuadratica7.eval((float) 2);
        float float13 = funcionCuadratica7.getB();
        float float15 = funcionCuadratica7.eval((-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float20 = funcionCuadratica19.getB();
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica19);
        funcionCuadratica7.setC(0.0f);
        float float24 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 435.0f + "'", float12 == 435.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.9599999E10f + "'", float15 == 1.9599999E10f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        java.lang.Class<?> wildcardClass1 = funcionCuadratica0.getClass();
        float float3 = funcionCuadratica0.eval((-33.0f));
        funcionCuadratica0.setA(2.42354976E8f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(435.0f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        float float7 = funcionCuadratica4.getC();
        funcionCuadratica4.setB(0.0f);
        java.lang.String str10 = funcionCuadratica4.toString();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        java.lang.Object obj20 = funcionCuadratica18.raices();
        float float21 = funcionCuadratica18.determinante();
        java.lang.String str22 = funcionCuadratica18.toString();
        float float23 = funcionCuadratica18.determinante();
        boolean boolean24 = funcionCuadratica18.repOk();
        java.lang.Object obj25 = funcionCuadratica18.raices();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica18.getClass();
        boolean boolean27 = funcionCuadratica4.equals(funcionCuadratica18);
        float float28 = funcionCuadratica18.determinante();
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean37 = funcionCuadratica32.equals(funcionCuadratica36);
        float float39 = funcionCuadratica32.eval((float) (short) 1);
        funcionCuadratica32.setC(0.0f);
        funcionCuadratica32.setC(135.0f);
        float float45 = funcionCuadratica32.eval((float) 100);
        funcionCuadratica32.setC((float) (short) 0);
        boolean boolean48 = funcionCuadratica18.equals(funcionCuadratica32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2" + "'", str10.equals("1.0x^2"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "100.0x^2+35.0" + "'", str22.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-14000.0f) + "'", float23 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-14000.0f) + "'", float28 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 130.0f + "'", float39 == 130.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 320235.0f + "'", float45 == 320235.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (short) -1);
        funcionCuadratica3.setA((-387.0f));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        funcionCuadratica7.setC((float) 'a');
        funcionCuadratica7.setC(10035.0f);
        float float14 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean23 = funcionCuadratica18.equals(funcionCuadratica22);
        java.lang.Object obj24 = funcionCuadratica22.raices();
        boolean boolean25 = funcionCuadratica22.repOk();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean34 = funcionCuadratica29.equals(funcionCuadratica33);
        float float35 = funcionCuadratica33.getB();
        boolean boolean36 = funcionCuadratica22.equals(funcionCuadratica33);
        float float38 = funcionCuadratica33.eval((-14000.0f));
        boolean boolean39 = funcionCuadratica7.equals(funcionCuadratica33);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10035.0f + "'", float14 == 10035.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.9599999E10f + "'", float38 == 1.9599999E10f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.eval((float) (byte) 1);
        float float16 = funcionCuadratica7.getC();
        float float17 = funcionCuadratica7.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 135.0f + "'", float15 == 135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-14000.0f) + "'", float17 == (-14000.0f));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean9 = funcionCuadratica4.equals(funcionCuadratica8);
        java.lang.Object obj10 = funcionCuadratica8.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Object obj21 = funcionCuadratica19.raices();
        float float22 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica();
        boolean boolean24 = funcionCuadratica19.equals(funcionCuadratica23);
        boolean boolean25 = funcionCuadratica8.equals(funcionCuadratica23);
        java.lang.Object obj26 = funcionCuadratica8.raices();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str10.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str11.equals("0.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.eval((float) (byte) 1);
        float float16 = funcionCuadratica7.getC();
        float float18 = funcionCuadratica7.eval((-5.8711688E16f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 135.0f + "'", float15 == 135.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 3.4470625E35f + "'", float18 == 3.4470625E35f);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        float float21 = funcionCuadratica19.getB();
        float float23 = funcionCuadratica19.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean32 = funcionCuadratica27.equals(funcionCuadratica31);
        java.lang.Class<?> wildcardClass33 = funcionCuadratica27.getClass();
        boolean boolean34 = funcionCuadratica19.equals(funcionCuadratica27);
        float float35 = funcionCuadratica27.getA();
        float float36 = funcionCuadratica27.determinante();
        boolean boolean37 = funcionCuadratica3.equals(funcionCuadratica27);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 35.0f + "'", float23 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 32.0f + "'", float35 == 32.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-12415.0f) + "'", float36 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setC((float) (byte) -1);
        float float12 = funcionCuadratica7.getC();
        funcionCuadratica7.setC(102.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 97.0f + "'", float24 == 97.0f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        boolean boolean6 = funcionCuadratica4.repOk();
        float float7 = funcionCuadratica4.getA();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-3391.0f), 1.9599999E10f, 0.0f);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(130.0f, (-101.0f), 2.0f);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        java.lang.String str12 = funcionCuadratica7.toString();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean21 = funcionCuadratica16.equals(funcionCuadratica20);
        float float23 = funcionCuadratica16.eval((float) (short) 1);
        float float24 = funcionCuadratica16.getC();
        float float25 = funcionCuadratica16.getC();
        boolean boolean26 = funcionCuadratica7.equals(funcionCuadratica16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "100.0x^2+35.0" + "'", str12.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 130.0f + "'", float23 == 130.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 97.0f + "'", float24 == 97.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 97.0f + "'", float25 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        boolean boolean13 = funcionCuadratica11.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, 10035.0f, 12135.0f);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        funcionCuadratica7.setA(9409.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(122535.0f, 320235.0f, (float) (short) 100);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-12415.0f), 32.0f, 132.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        float float6 = funcionCuadratica0.getB();
        java.lang.Object obj7 = funcionCuadratica0.raices();
        funcionCuadratica0.setA((float) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        float float22 = funcionCuadratica18.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean31 = funcionCuadratica26.equals(funcionCuadratica30);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica26.getClass();
        boolean boolean33 = funcionCuadratica18.equals(funcionCuadratica26);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica18.getClass();
        boolean boolean35 = funcionCuadratica3.equals(funcionCuadratica18);
        float float36 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass37 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.0f + "'", float22 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica7.getClass();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        java.lang.Object obj27 = funcionCuadratica25.raices();
        java.lang.String str28 = funcionCuadratica25.toString();
        float float29 = funcionCuadratica25.determinante();
        boolean boolean30 = funcionCuadratica7.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean39 = funcionCuadratica34.equals(funcionCuadratica38);
        java.lang.Object obj40 = funcionCuadratica38.raices();
        float float41 = funcionCuadratica38.determinante();
        java.lang.String str42 = funcionCuadratica38.toString();
        float float43 = funcionCuadratica38.determinante();
        java.lang.Object obj44 = funcionCuadratica38.raices();
        funcionCuadratica38.setA((float) 0);
        float float47 = funcionCuadratica38.getA();
        boolean boolean48 = funcionCuadratica25.equals(funcionCuadratica38);
        float float49 = funcionCuadratica38.getC();
        funcionCuadratica38.setB(9.6794307E9f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+35.0" + "'", str28.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-14000.0f) + "'", float29 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-14000.0f) + "'", float41 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "100.0x^2+35.0" + "'", str42.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-14000.0f) + "'", float43 == (-14000.0f));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 35.0f + "'", float49 == 35.0f);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval((float) (byte) 0);
        float float16 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(400.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean13 = funcionCuadratica8.equals(funcionCuadratica12);
        float float15 = funcionCuadratica8.eval((float) (short) 1);
        float float16 = funcionCuadratica8.getC();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica8);
        float float18 = funcionCuadratica3.getA();
        float float19 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(0.0f);
        float float22 = funcionCuadratica3.getC();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 130.0f + "'", float15 == 130.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 97.0f + "'", float16 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        boolean boolean13 = funcionCuadratica7.repOk();
        java.lang.Object obj14 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.getA();
        float float16 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(130.0f);
        float float17 = funcionCuadratica3.eval(1320.0f);
        funcionCuadratica3.setC(10404.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 541027.0f + "'", float15 == 541027.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 5.5758216E7f + "'", float17 == 5.5758216E7f);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        float float14 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((-33.0f));
        float float17 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 97.0f + "'", float14 == 97.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-11327.0f) + "'", float17 == (-11327.0f));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-14000.0f), (float) (byte) -1, 122535.0f);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        float float14 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((-33.0f));
        funcionCuadratica3.setB(400.0f);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean27 = funcionCuadratica22.equals(funcionCuadratica26);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        float float33 = funcionCuadratica31.getB();
        float float34 = funcionCuadratica31.getB();
        boolean boolean35 = funcionCuadratica22.equals(funcionCuadratica31);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean44 = funcionCuadratica39.equals(funcionCuadratica43);
        java.lang.Object obj45 = funcionCuadratica43.raices();
        float float46 = funcionCuadratica43.determinante();
        java.lang.String str47 = funcionCuadratica43.toString();
        float float48 = funcionCuadratica43.determinante();
        java.lang.Object obj49 = funcionCuadratica43.raices();
        funcionCuadratica43.setA((float) 0);
        funcionCuadratica43.setC((-14000.0f));
        java.lang.String str54 = funcionCuadratica43.toString();
        java.lang.Object obj55 = funcionCuadratica43.raices();
        boolean boolean56 = funcionCuadratica31.equals(funcionCuadratica43);
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica43);
        float float58 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 97.0f + "'", float14 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-14000.0f) + "'", float46 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "100.0x^2+35.0" + "'", str47.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-14000.0f) + "'", float48 == (-14000.0f));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "0.0x^2+-14000.0" + "'", str54.equals("0.0x^2+-14000.0"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 400.0f + "'", float58 == 400.0f);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        funcionCuadratica7.setC((float) 100);
        boolean boolean19 = funcionCuadratica7.repOk();
        int int20 = funcionCuadratica7.numRaices();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean26 = funcionCuadratica21.equals(funcionCuadratica25);
        java.lang.Object obj27 = funcionCuadratica25.raices();
        float float28 = funcionCuadratica25.getC();
        funcionCuadratica25.setB(0.0f);
        java.lang.String str31 = funcionCuadratica25.toString();
        float float32 = funcionCuadratica25.determinante();
        boolean boolean33 = funcionCuadratica7.equals(funcionCuadratica25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "1.0x^2" + "'", str31.equals("1.0x^2"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, 10241.0f, (float) (short) 100);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        float float11 = funcionCuadratica7.determinante();
        float float13 = funcionCuadratica7.eval(12550.0f);
        funcionCuadratica7.setA((float) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-14000.0f) + "'", float11 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.57502505E10f + "'", float13 == 1.57502505E10f);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.eval((-36.0f));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(10404.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.eval((float) (short) 10);
        float float8 = funcionCuadratica3.eval((float) (byte) 100);
        java.lang.Object obj9 = funcionCuadratica3.raices();
        float float11 = funcionCuadratica3.eval(1.00701225E10f);
        float float12 = funcionCuadratica3.getA();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-11.0f) + "'", float6 == (-11.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-101.0f) + "'", float8 == (-101.0f));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.00701225E10f) + "'", float11 == (-1.00701225E10f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setA((float) (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(17392.0f);
        float float16 = funcionCuadratica3.eval(400.0f);
        funcionCuadratica3.setC(0.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 6956799.0f + "'", float16 == 6956799.0f);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        java.lang.Class<?> wildcardClass1 = funcionCuadratica0.getClass();
        float float2 = funcionCuadratica0.determinante();
        practico5.FuncionCuadratica funcionCuadratica6 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj7 = funcionCuadratica6.raices();
        float float8 = funcionCuadratica6.getB();
        int int9 = funcionCuadratica6.numRaices();
        boolean boolean10 = funcionCuadratica0.equals(funcionCuadratica6);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica0.getClass();
        float float12 = funcionCuadratica0.getC();
        float float13 = funcionCuadratica0.getC();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean30 = funcionCuadratica25.equals(funcionCuadratica29);
        float float32 = funcionCuadratica25.eval((float) (short) 1);
        float float33 = funcionCuadratica25.getC();
        float float34 = funcionCuadratica25.getC();
        boolean boolean35 = funcionCuadratica7.equals(funcionCuadratica25);
        float float36 = funcionCuadratica25.getB();
        java.lang.Object obj37 = funcionCuadratica25.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-14000.0f) + "'", float21 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 130.0f + "'", float32 == 130.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 97.0f + "'", float33 == 97.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 97.0f + "'", float34 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        float float26 = funcionCuadratica24.getB();
        float float27 = funcionCuadratica24.getB();
        boolean boolean28 = funcionCuadratica15.equals(funcionCuadratica24);
        java.lang.String str29 = funcionCuadratica24.toString();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        boolean boolean31 = funcionCuadratica7.equals(funcionCuadratica24);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica24.getClass();
        java.lang.Class<?> wildcardClass33 = funcionCuadratica24.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str29.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) (short) 0, 2.92710221E13f);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (float) (short) 10, 100032.0f);
        funcionCuadratica3.setB((float) (-1L));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean21 = funcionCuadratica16.equals(funcionCuadratica20);
        java.lang.Object obj22 = funcionCuadratica20.raices();
        float float23 = funcionCuadratica20.determinante();
        java.lang.String str24 = funcionCuadratica20.toString();
        float float25 = funcionCuadratica20.determinante();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica20.getClass();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        funcionCuadratica20.setC(541027.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-14000.0f) + "'", float23 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "100.0x^2+35.0" + "'", str24.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-14000.0f) + "'", float25 == (-14000.0f));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean34 = funcionCuadratica29.equals(funcionCuadratica33);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj39 = funcionCuadratica38.raices();
        float float40 = funcionCuadratica38.getB();
        float float41 = funcionCuadratica38.getB();
        boolean boolean42 = funcionCuadratica29.equals(funcionCuadratica38);
        java.lang.String str43 = funcionCuadratica38.toString();
        java.lang.Class<?> wildcardClass44 = funcionCuadratica38.getClass();
        boolean boolean45 = funcionCuadratica15.equals(funcionCuadratica38);
        float float46 = funcionCuadratica38.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str43.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        funcionCuadratica3.setC(10.0f);
        boolean boolean11 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        boolean boolean4 = funcionCuadratica3.repOk();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj9 = funcionCuadratica8.raices();
        funcionCuadratica8.setB((float) (byte) 0);
        funcionCuadratica8.setB((float) 0L);
        float float14 = funcionCuadratica8.getA();
        float float15 = funcionCuadratica8.determinante();
        float float16 = funcionCuadratica8.determinante();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getB();
        boolean boolean6 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        boolean boolean11 = funcionCuadratica7.repOk();
        boolean boolean12 = funcionCuadratica7.repOk();
        java.lang.String str13 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "100.0x^2+35.0" + "'", str13.equals("100.0x^2+35.0"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.String str16 = funcionCuadratica11.toString();
        float float18 = funcionCuadratica11.eval(35.0f);
        float float19 = funcionCuadratica11.getC();
        int int20 = funcionCuadratica11.numRaices();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "100.0x^2+35.0" + "'", str16.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 122535.0f + "'", float18 == 122535.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 35.0f + "'", float19 == 35.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        boolean boolean7 = funcionCuadratica3.repOk();
        funcionCuadratica3.setA((-101.0f));
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-101.0x^2+-1.0x+-1.0" + "'", str10.equals("-101.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        float float4 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.eval(32.0f);
        float float8 = funcionCuadratica3.eval((float) (short) -1);
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1092.0f + "'", float6 == 1092.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 102.0f + "'", float8 == 102.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-399.0f) + "'", float9 == (-399.0f));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-12415.0f) + "'", float11 == (-12415.0f));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(17392.0f);
        float float8 = funcionCuadratica3.eval((float) 10L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str4.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 17382.0f + "'", float8 == 17382.0f);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float9 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = null;
        try {
            boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.7126513E9f, (-387.0f), 122535.0f);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        java.lang.String str17 = funcionCuadratica12.toString();
        funcionCuadratica12.setA(400.0f);
        float float20 = funcionCuadratica12.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str17.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 400.0f + "'", float20 == 400.0f);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        funcionCuadratica3.setC(0.0f);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        funcionCuadratica11.setC((float) 'a');
        funcionCuadratica11.setC(1092.0f);
        float float19 = funcionCuadratica11.getA();
        int int20 = funcionCuadratica11.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        java.lang.Object obj2 = funcionCuadratica0.raices();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.00701225E10f), (-387.0f), 10404.0f);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean21 = funcionCuadratica16.equals(funcionCuadratica20);
        java.lang.Object obj22 = funcionCuadratica20.raices();
        float float23 = funcionCuadratica20.determinante();
        java.lang.String str24 = funcionCuadratica20.toString();
        float float25 = funcionCuadratica20.determinante();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica20.getClass();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica3.getClass();
        java.lang.Object obj29 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-14000.0f) + "'", float23 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "100.0x^2+35.0" + "'", str24.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-14000.0f) + "'", float25 == (-14000.0f));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(52.0f, 0.0f, (-12415.0f));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(12550.0f, (-1.00701225E10f), (float) 1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        java.lang.Object obj14 = funcionCuadratica11.raices();
        funcionCuadratica11.setC((float) 'a');
        funcionCuadratica11.setC(1092.0f);
        float float19 = funcionCuadratica11.getA();
        float float20 = funcionCuadratica11.getA();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean29 = funcionCuadratica24.equals(funcionCuadratica28);
        java.lang.Class<?> wildcardClass30 = funcionCuadratica24.getClass();
        funcionCuadratica24.setA((float) 10L);
        boolean boolean33 = funcionCuadratica11.equals(funcionCuadratica24);
        int int34 = funcionCuadratica11.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(12135.0f, 1.00701225E10f, (float) 2);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10035.0f, 6055732.0f, (float) (short) 100);
        funcionCuadratica3.setB(400.0f);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, (float) 'a', 0.0f);
        funcionCuadratica3.setC((float) 100L);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        funcionCuadratica3.setB(102.0f);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean18 = funcionCuadratica13.equals(funcionCuadratica17);
        java.lang.Object obj19 = funcionCuadratica17.raices();
        float float20 = funcionCuadratica17.determinante();
        java.lang.String str21 = funcionCuadratica17.toString();
        float float22 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 'a');
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica17);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 102.0f + "'", float8 == 102.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0x^2+102.0x" + "'", str9.equals("1.0x^2+102.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-14000.0f) + "'", float20 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "100.0x^2+35.0" + "'", str21.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-14000.0f) + "'", float22 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(100.0f);
        float float8 = funcionCuadratica3.getA();
        boolean boolean9 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, 122535.0f, (-11.0f));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.String str9 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-33.0x^2+100.0x+1.0" + "'", str9.equals("-33.0x^2+100.0x+1.0"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, 0.0f, (float) 2);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str12.equals("0.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.25567816E10f, 0.0f, 10404.0f);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0, (float) (byte) 100, (float) ' ');
        funcionCuadratica3.setA((float) 'a');
        int int6 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, 10035.0f, (-33.0f));
        float float5 = funcionCuadratica3.eval((-3879.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 4.4256672E8f + "'", float5 == 4.4256672E8f);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        float float6 = funcionCuadratica0.getB();
        int int7 = funcionCuadratica0.numRaices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        funcionCuadratica3.setB(102.0f);
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(12135.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 102.0f + "'", float8 == 102.0f);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100032.0f, (float) '4', (-36.0f));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((-12415.0f));
        float float7 = funcionCuadratica3.getC();
        boolean boolean8 = funcionCuadratica3.repOk();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10404.0f, 35.0f, (float) (byte) 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica18);
        float float22 = funcionCuadratica18.determinante();
        boolean boolean23 = funcionCuadratica18.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-14000.0f) + "'", float22 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean14 = funcionCuadratica9.equals(funcionCuadratica13);
        java.lang.Object obj15 = funcionCuadratica13.raices();
        boolean boolean16 = funcionCuadratica8.equals(funcionCuadratica13);
        funcionCuadratica8.setB((-11.0f));
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica8.setA((float) 0L);
        funcionCuadratica8.setC((-36.0f));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica9);
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        float float14 = funcionCuadratica11.getC();
        boolean boolean15 = funcionCuadratica11.repOk();
        int int16 = funcionCuadratica11.numRaices();
        java.lang.Object obj17 = funcionCuadratica11.raices();
        float float18 = funcionCuadratica11.getA();
        funcionCuadratica11.setC((float) 100L);
        boolean boolean21 = funcionCuadratica11.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica11.determinante();
        float float14 = funcionCuadratica11.getC();
        boolean boolean15 = funcionCuadratica11.repOk();
        int int16 = funcionCuadratica11.numRaices();
        java.lang.Object obj17 = funcionCuadratica11.raices();
        float float18 = funcionCuadratica11.getA();
        funcionCuadratica11.setC((float) 100L);
        java.lang.String str21 = funcionCuadratica11.toString();
        boolean boolean22 = funcionCuadratica11.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "0.0x^2+100.0" + "'", str21.equals("0.0x^2+100.0"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        funcionCuadratica7.setA((float) 'a');
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
        float float24 = funcionCuadratica17.eval((float) (short) 1);
        funcionCuadratica17.setC(0.0f);
        funcionCuadratica17.setC((float) 0);
        float float29 = funcionCuadratica17.determinante();
        java.lang.String str30 = funcionCuadratica17.toString();
        boolean boolean31 = funcionCuadratica7.equals(funcionCuadratica17);
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj36 = funcionCuadratica35.raices();
        float float37 = funcionCuadratica35.getB();
        int int38 = funcionCuadratica35.numRaices();
        boolean boolean39 = funcionCuadratica35.repOk();
        funcionCuadratica35.setB((-11.0f));
        boolean boolean42 = funcionCuadratica17.equals(funcionCuadratica35);
        funcionCuadratica17.setA(5.5758216E7f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 130.0f + "'", float24 == 130.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "32.0x^2+1.0x" + "'", str30.equals("32.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setB(100.0f);
        int int12 = funcionCuadratica7.numRaices();
        float float13 = funcionCuadratica7.getC();
        boolean boolean14 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getB();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        float float21 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 35.0f + "'", float21 == 35.0f);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval(5.5758216E7f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 3.10897874E17f + "'", float11 == 3.10897874E17f);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, 100032.0f, 10241.0f);
        funcionCuadratica3.setC(9409.0f);
        float float7 = funcionCuadratica3.eval((-3879.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.11664947E9f + "'", float7 == 1.11664947E9f);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        float float16 = funcionCuadratica7.getA();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica7.getClass();
        float float18 = funcionCuadratica7.getB();
        float float19 = funcionCuadratica7.getC();
        float float20 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 35.0f + "'", float19 == 35.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval(1.00701225E10f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.00701225E10f) + "'", float8 == (-1.00701225E10f));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        funcionCuadratica7.setA((float) 0);
        java.lang.Object obj16 = funcionCuadratica7.raices();
        boolean boolean17 = funcionCuadratica7.repOk();
        float float18 = funcionCuadratica7.getA();
        int int19 = funcionCuadratica7.numRaices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        funcionCuadratica7.setC((float) 'a');
        float float12 = funcionCuadratica7.determinante();
        funcionCuadratica7.setC(2752.0f);
        funcionCuadratica7.setC((-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-38800.0f) + "'", float12 == (-38800.0f));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean19 = funcionCuadratica14.equals(funcionCuadratica18);
        float float20 = funcionCuadratica18.getB();
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica18);
        funcionCuadratica7.setA((-101.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        funcionCuadratica3.setA((float) ' ');
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean15 = funcionCuadratica10.equals(funcionCuadratica14);
        java.lang.Object obj16 = funcionCuadratica14.raices();
        funcionCuadratica14.setB((-12415.0f));
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica14);
        float float20 = funcionCuadratica3.getC();
        float float22 = funcionCuadratica3.eval(3.6671886E13f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 4.3034472E28f + "'", float22 == 4.3034472E28f);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, 6956799.0f, (-33.0f));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        boolean boolean10 = funcionCuadratica7.repOk();
        boolean boolean11 = funcionCuadratica7.repOk();
        float float12 = funcionCuadratica7.getC();
        boolean boolean13 = funcionCuadratica7.repOk();
        java.lang.Object obj14 = funcionCuadratica7.raices();
        java.lang.Object obj15 = funcionCuadratica7.raices();
        float float17 = funcionCuadratica7.eval(1.54128224E8f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.37555095E18f + "'", float17 == 2.37555095E18f);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(100.0f);
        float float8 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        funcionCuadratica4.setA(135.0f);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean16 = funcionCuadratica11.equals(funcionCuadratica15);
        java.lang.Class<?> wildcardClass17 = funcionCuadratica11.getClass();
        funcionCuadratica11.setA((float) (short) -1);
        funcionCuadratica11.setA((float) (-1L));
        funcionCuadratica11.setB((float) 10L);
        funcionCuadratica11.setB((float) (short) 10);
        java.lang.String str26 = funcionCuadratica11.toString();
        boolean boolean27 = funcionCuadratica4.equals(funcionCuadratica11);
        funcionCuadratica4.setC((float) 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-1.0x^2+10.0x+97.0" + "'", str26.equals("-1.0x^2+10.0x+97.0"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        float float4 = funcionCuadratica3.getB();
        boolean boolean5 = funcionCuadratica3.repOk();
        float float6 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92710221E13f, 10404.0f, 2752.0f);
        boolean boolean4 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(32.0f, (-14000.0f), (float) (byte) -1);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.96000128E8f + "'", float4 == 1.96000128E8f);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean20 = funcionCuadratica15.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica15.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        float float23 = funcionCuadratica15.getA();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.determinante();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean34 = funcionCuadratica29.equals(funcionCuadratica33);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj39 = funcionCuadratica38.raices();
        float float40 = funcionCuadratica38.getB();
        float float41 = funcionCuadratica38.getB();
        boolean boolean42 = funcionCuadratica29.equals(funcionCuadratica38);
        java.lang.String str43 = funcionCuadratica38.toString();
        java.lang.Class<?> wildcardClass44 = funcionCuadratica38.getClass();
        boolean boolean45 = funcionCuadratica15.equals(funcionCuadratica38);
        funcionCuadratica38.setB(1320.0f);
        java.lang.Class<?> wildcardClass48 = funcionCuadratica38.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-12415.0f) + "'", float25 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "0.0x^2+-1.0x+-1.0" + "'", str43.equals("0.0x^2+-1.0x+-1.0"));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean9 = funcionCuadratica4.equals(funcionCuadratica8);
        java.lang.Object obj10 = funcionCuadratica8.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica3.setB((-11.0f));
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
        java.lang.Class<?> wildcardClass23 = funcionCuadratica17.getClass();
        funcionCuadratica17.setA((float) (short) -1);
        funcionCuadratica17.setA((float) (-1L));
        boolean boolean28 = funcionCuadratica3.equals(funcionCuadratica17);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica7.getClass();
        funcionCuadratica7.setB((float) (byte) 0);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica(135.0f, 0.0f, 1.00701225E10f);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica20.getClass();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica20);
        float float23 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        java.lang.Object obj12 = funcionCuadratica7.raices();
        float float14 = funcionCuadratica7.eval((float) (byte) -1);
        float float15 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 135.0f + "'", float14 == 135.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10241.0f, (float) (short) 10, 10.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean14 = funcionCuadratica9.equals(funcionCuadratica13);
        java.lang.Object obj15 = funcionCuadratica13.raices();
        boolean boolean16 = funcionCuadratica13.repOk();
        boolean boolean17 = funcionCuadratica13.repOk();
        float float18 = funcionCuadratica13.getC();
        boolean boolean19 = funcionCuadratica13.repOk();
        java.lang.Object obj20 = funcionCuadratica13.raices();
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica13);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 35.0f + "'", float18 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        funcionCuadratica3.setC((float) ' ');
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        practico5.FuncionCuadratica funcionCuadratica4 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        boolean boolean5 = funcionCuadratica0.equals(funcionCuadratica4);
        java.lang.Object obj6 = funcionCuadratica4.raices();
        java.lang.String str7 = funcionCuadratica4.toString();
        java.lang.Object obj8 = funcionCuadratica4.raices();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.0x^2+1.0x" + "'", str7.equals("1.0x^2+1.0x"));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) -1, (float) 1L);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Object obj11 = funcionCuadratica7.raices();
        java.lang.String str12 = funcionCuadratica7.toString();
        float float13 = funcionCuadratica7.determinante();
        boolean boolean14 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "100.0x^2+35.0" + "'", str12.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-14000.0f) + "'", float13 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, 6055732.0f, 10241.0f);
        funcionCuadratica3.setA((float) (byte) 1);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) 100, 1.0f);
        funcionCuadratica3.setC(52.0f);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC((float) 0);
        float float15 = funcionCuadratica3.determinante();
        java.lang.String str16 = funcionCuadratica3.toString();
        int int17 = funcionCuadratica3.numRaices();
        float float19 = funcionCuadratica3.eval(17392.0f);
        float float20 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "32.0x^2+1.0x" + "'", str16.equals("32.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 9.6794307E9f + "'", float19 == 9.6794307E9f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setB(10035.0f);
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica();
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        float float13 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        funcionCuadratica0.setB((float) 1);
        java.lang.Class<?> wildcardClass3 = funcionCuadratica0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

