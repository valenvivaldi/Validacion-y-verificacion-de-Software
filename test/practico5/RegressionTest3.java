package practico5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 10);
        float float16 = funcionCuadratica3.determinante();
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 104.0f + "'", float16 == 104.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        java.lang.Object obj12 = funcionCuadratica10.raices();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        boolean boolean18 = funcionCuadratica10.equals(funcionCuadratica16);
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica16);
        java.lang.Object obj20 = funcionCuadratica16.raices();
        float float22 = funcionCuadratica16.eval((float) (short) -1);
        java.lang.Object obj23 = funcionCuadratica16.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-90.0f) + "'", float22 == (-90.0f));
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 10004.0f, 2.0032112E38f);
        float float4 = funcionCuadratica3.determinante();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + Float.NEGATIVE_INFINITY + "'", float4 == Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.0x^2+10004.0x+2.0032112E38" + "'", str5.equals("2.0x^2+10004.0x+2.0032112E38"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        float float27 = funcionCuadratica20.getA();
        float float28 = funcionCuadratica20.getA();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica20);
        funcionCuadratica20.setA((float) ' ');
        int int32 = funcionCuadratica20.numRaices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getA();
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+97.0" + "'", str9.equals("10.0x^2+100.0x+97.0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x+97.0" + "'", str10.equals("10.0x^2+100.0x+97.0"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(199.0f);
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        float float21 = funcionCuadratica3.eval((-2.99996037E10f));
        int int22 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.7909528E23f + "'", float21 == 1.7909528E23f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float14 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) (short) 0);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        java.lang.String str27 = funcionCuadratica20.toString();
        funcionCuadratica20.setC((float) (byte) 100);
        funcionCuadratica20.setC((float) 1L);
        funcionCuadratica20.setC((float) 10);
        float float34 = funcionCuadratica20.getA();
        java.lang.String str35 = funcionCuadratica20.toString();
        boolean boolean36 = funcionCuadratica3.equals(funcionCuadratica20);
        funcionCuadratica3.setB((-6900.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str27.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str35.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        float float16 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getB();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        funcionCuadratica3.setB(100000.0f);
        float float31 = funcionCuadratica3.eval(110.0f);
        funcionCuadratica3.setB(9.999992E7f);
        int int34 = funcionCuadratica3.numRaices();
        float float35 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.1121001E7f + "'", float31 == 1.1121001E7f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 9.9999842E15f + "'", float35 == 9.9999842E15f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.determinante();
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 157.0f + "'", float13 == 157.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 157.0f + "'", float14 == 157.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        float float22 = funcionCuadratica15.eval(1.0f);
        funcionCuadratica15.setA((-39.0f));
        funcionCuadratica15.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float31 = funcionCuadratica30.getB();
        java.lang.Object obj32 = funcionCuadratica30.raices();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj37 = funcionCuadratica36.raices();
        boolean boolean38 = funcionCuadratica30.equals(funcionCuadratica36);
        java.lang.String str39 = funcionCuadratica30.toString();
        funcionCuadratica30.setB(0.0f);
        float float42 = funcionCuadratica30.determinante();
        java.lang.Class<?> wildcardClass43 = funcionCuadratica30.getClass();
        boolean boolean44 = funcionCuadratica15.equals(funcionCuadratica30);
        practico5.FuncionCuadratica funcionCuadratica48 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float50 = funcionCuadratica48.eval((-11424.0f));
        float float51 = funcionCuadratica48.determinante();
        float float52 = funcionCuadratica48.getC();
        float float54 = funcionCuadratica48.eval(0.0f);
        boolean boolean55 = funcionCuadratica15.equals(funcionCuadratica48);
        boolean boolean56 = funcionCuadratica3.equals(funcionCuadratica48);
        float float57 = funcionCuadratica48.determinante();
        java.lang.Class<?> wildcardClass58 = funcionCuadratica48.getClass();
        java.lang.Object obj59 = funcionCuadratica48.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "10.0x^2+100.0x" + "'", str39.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.30393536E8f + "'", float50 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        funcionCuadratica19.setB((float) (byte) -1);
        funcionCuadratica19.setC((float) (byte) 1);
        float float26 = funcionCuadratica19.eval(1.0f);
        funcionCuadratica19.setA((-39.0f));
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass30 = funcionCuadratica19.getClass();
        funcionCuadratica19.setB(1.00360449E17f);
        float float33 = funcionCuadratica19.getC();
        int int34 = funcionCuadratica19.numRaices();
        funcionCuadratica19.setA(1.0002001E18f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        float float27 = funcionCuadratica20.getA();
        float float28 = funcionCuadratica20.getA();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica20);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        float float35 = funcionCuadratica33.getC();
        int int36 = funcionCuadratica33.numRaices();
        float float37 = funcionCuadratica33.getA();
        boolean boolean38 = funcionCuadratica12.equals(funcionCuadratica33);
        float float40 = funcionCuadratica33.eval(104.0f);
        float float41 = funcionCuadratica33.getB();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 118560.0f + "'", float40 == 118560.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.eval((float) 2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 60.0f + "'", float7 == 60.0f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.62324675E10f, 1015697.0f, 6000.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        java.lang.Object obj15 = funcionCuadratica13.raices();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        boolean boolean21 = funcionCuadratica13.equals(funcionCuadratica19);
        java.lang.String str22 = funcionCuadratica13.toString();
        funcionCuadratica13.setB(0.0f);
        java.lang.Class<?> wildcardClass25 = funcionCuadratica13.getClass();
        float float27 = funcionCuadratica13.eval((float) 100);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica13.getClass();
        float float29 = funcionCuadratica13.determinante();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica13);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica34.setB((float) (byte) 0);
        float float37 = funcionCuadratica34.getA();
        int int38 = funcionCuadratica34.numRaices();
        float float39 = funcionCuadratica34.getA();
        boolean boolean40 = funcionCuadratica13.equals(funcionCuadratica34);
        float float41 = funcionCuadratica34.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x" + "'", str22.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100000.0f + "'", float27 == 100000.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.0f + "'", float39 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.eval(8.0206513E16f);
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.62048E8f + "'", float4 == 1.62048E8f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10128.0f + "'", float5 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-2.5732339E37f) + "'", float7 == (-2.5732339E37f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-4000.0f) + "'", float8 == (-4000.0f));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        float float23 = funcionCuadratica17.getC();
        float float24 = funcionCuadratica17.getC();
        float float25 = funcionCuadratica17.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float6 = funcionCuadratica3.getB();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(232.0f);
        funcionCuadratica3.setC(2.94671647E10f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((float) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Object obj20 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        boolean boolean26 = funcionCuadratica18.equals(funcionCuadratica24);
        java.lang.String str27 = funcionCuadratica18.toString();
        funcionCuadratica18.setB(0.0f);
        float float30 = funcionCuadratica18.determinante();
        java.lang.Class<?> wildcardClass31 = funcionCuadratica18.getClass();
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica18);
        float float33 = funcionCuadratica18.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.8616672E8f, 999899.0f, (float) (-1L));
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.00334266E12f + "'", float4 == 1.00334266E12f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 2.92205049E12f, 8.747702E27f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        float float17 = funcionCuadratica12.determinante();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        float float23 = funcionCuadratica21.getC();
        float float24 = funcionCuadratica21.getC();
        java.lang.Object obj25 = funcionCuadratica21.raices();
        float float26 = funcionCuadratica21.getC();
        float float27 = funcionCuadratica21.getC();
        boolean boolean28 = funcionCuadratica12.equals(funcionCuadratica21);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10000.0f + "'", float17 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.46409882E11f, 8.9558088E7f, 2.5758312E33f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        float float19 = funcionCuadratica11.determinante();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica3.toString();
        java.lang.Object obj27 = funcionCuadratica3.raices();
        java.lang.String str28 = funcionCuadratica3.toString();
        float float29 = funcionCuadratica3.getC();
        float float30 = funcionCuadratica3.determinante();
        float float31 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(0.0f);
        float float34 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(9.996025E28f);
        funcionCuadratica3.setB(9.999801E18f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+10.0x" + "'", str28.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.40742095E16f, 10128.0f, 8.747702E27f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) 100, (float) (byte) 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica22.getA();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        java.lang.Object obj33 = funcionCuadratica31.raices();
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj38 = funcionCuadratica37.raices();
        boolean boolean39 = funcionCuadratica31.equals(funcionCuadratica37);
        java.lang.String str40 = funcionCuadratica31.toString();
        float float42 = funcionCuadratica31.eval(1.30393536E8f);
        java.lang.Object obj43 = funcionCuadratica31.raices();
        boolean boolean44 = funcionCuadratica22.equals(funcionCuadratica31);
        java.lang.Object obj45 = funcionCuadratica22.raices();
        java.lang.String str46 = funcionCuadratica22.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "10.0x^2+100.0x" + "'", str40.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.70024767E17f + "'", float42 == 1.70024767E17f);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "10.0x^2+100.0x" + "'", str46.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.7757429E22f), 118560.0f, 1.31438331E14f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        int int10 = funcionCuadratica3.numRaices();
        int int11 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-90.0f), 1.7632299E10f, 2.56012813E17f);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica10.setC((float) 'a');
        float float16 = funcionCuadratica10.eval(56143.0f);
        int int17 = funcionCuadratica10.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 3.15259781E10f + "'", float16 == 3.15259781E10f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica13.setB((float) 0L);
        funcionCuadratica13.setA(232.0f);
        funcionCuadratica13.setA(262190.0f);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica13);
        java.lang.Object obj21 = funcionCuadratica3.raices();
        float float22 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 6120.0f + "'", float22 == 6120.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(9.9979908E12f);
        float float9 = funcionCuadratica3.eval(1.31380265E14f);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        float float19 = funcionCuadratica3.getB();
        float float20 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        java.lang.String str8 = funcionCuadratica3.toString();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x" + "'", str7.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((-11424.0f));
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setB((-1599983.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 9413.0f + "'", float16 == 9413.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.29399648E8f + "'", float18 == 1.29399648E8f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, (-4000.0f), (float) ' ');
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(4.22409984E8f);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4000.0f) + "'", float4 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.5999872E7f + "'", float5 == 1.5999872E7f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (short) 1, 1.62048E8f);
        int int4 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.getC();
        float float12 = funcionCuadratica9.getC();
        float float13 = funcionCuadratica9.getB();
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica9.getClass();
        funcionCuadratica9.setC(9.999801E18f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((float) (byte) 1);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.eval((float) (byte) 0);
        funcionCuadratica3.setB((float) '#');
        java.lang.Object obj24 = funcionCuadratica3.raices();
        float float25 = funcionCuadratica3.getC();
        java.lang.String str26 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "32.0x^2+35.0x+-1.0" + "'", str26.equals("32.0x^2+35.0x+-1.0"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA((-1.0f));
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        float float33 = funcionCuadratica31.determinante();
        funcionCuadratica31.setB((float) 10L);
        funcionCuadratica31.setA((float) 1);
        funcionCuadratica31.setC((float) (byte) -1);
        float float40 = funcionCuadratica31.getC();
        java.lang.Class<?> wildcardClass41 = funcionCuadratica31.getClass();
        float float42 = funcionCuadratica31.getC();
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica31);
        funcionCuadratica3.setC(2.92205652E12f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10000.0f + "'", float33 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((float) (byte) 1);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.eval((float) (byte) 0);
        funcionCuadratica3.setB((float) '#');
        funcionCuadratica3.setA(157.0f);
        int int26 = funcionCuadratica3.numRaices();
        float float27 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(1001097.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 157.0f + "'", float27 == 157.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4.159E7f), 1.74240006E11f, 191.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica10.getClass();
        int int15 = funcionCuadratica10.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        int int14 = funcionCuadratica10.numRaices();
        float float15 = funcionCuadratica10.getB();
        float float16 = funcionCuadratica10.getA();
        funcionCuadratica10.setC(0.0f);
        float float20 = funcionCuadratica10.eval(1.40576604E11f);
        float float22 = funcionCuadratica10.eval(8.8604582E8f);
        float float23 = funcionCuadratica10.getC();
        int int24 = funcionCuadratica10.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.9761783E23f + "'", float20 == 1.9761783E23f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 7.850772E18f + "'", float22 == 7.850772E18f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(1000.0f);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float20 = funcionCuadratica19.getB();
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica19);
        float float22 = funcionCuadratica19.getB();
        funcionCuadratica19.setC(97.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        java.lang.Object obj14 = funcionCuadratica3.raices();
        float float15 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int20 = funcionCuadratica19.numRaices();
        float float21 = funcionCuadratica19.getB();
        float float22 = funcionCuadratica19.getA();
        float float24 = funcionCuadratica19.eval((float) 1);
        float float25 = funcionCuadratica19.getB();
        float float26 = funcionCuadratica19.determinante();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica19);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10004.0f + "'", float26 == 10004.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 12216.0f, 2.55992969E13f);
        try {
            java.lang.Object obj4 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.getC();
        float float12 = funcionCuadratica9.getC();
        float float13 = funcionCuadratica9.getB();
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica9);
        int int15 = funcionCuadratica3.numRaices();
        float float16 = funcionCuadratica3.getA();
        int int17 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(199.0f, (float) (short) -1, (float) 1L);
        float float4 = funcionCuadratica3.getB();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "199.0x^2+-1.0x+1.0" + "'", str5.equals("199.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(15610.0f);
        java.lang.String str20 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+-1.0x+15610.0" + "'", str20.equals("10.0x^2+-1.0x+15610.0"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        java.lang.Object obj14 = funcionCuadratica12.raices();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj19 = funcionCuadratica18.raices();
        boolean boolean20 = funcionCuadratica12.equals(funcionCuadratica18);
        java.lang.String str21 = funcionCuadratica12.toString();
        float float23 = funcionCuadratica12.eval(1.30393536E8f);
        java.lang.Object obj24 = funcionCuadratica12.raices();
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        float float30 = funcionCuadratica28.determinante();
        funcionCuadratica28.setB((float) 10L);
        funcionCuadratica28.setA((float) 1);
        funcionCuadratica28.setC((float) (byte) -1);
        float float37 = funcionCuadratica28.getC();
        float float38 = funcionCuadratica28.getA();
        funcionCuadratica28.setB((float) (short) -1);
        funcionCuadratica28.setB((float) 1L);
        funcionCuadratica28.setC((float) 0L);
        boolean boolean45 = funcionCuadratica12.equals(funcionCuadratica28);
        funcionCuadratica28.setA(1.00009997E9f);
        practico5.FuncionCuadratica funcionCuadratica51 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica51.setA((float) (byte) -1);
        funcionCuadratica51.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica59 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float60 = funcionCuadratica59.getB();
        funcionCuadratica59.setB((float) (byte) -1);
        funcionCuadratica59.setC((float) (byte) 1);
        boolean boolean65 = funcionCuadratica51.equals(funcionCuadratica59);
        funcionCuadratica51.setA((-68.0f));
        boolean boolean68 = funcionCuadratica28.equals(funcionCuadratica51);
        boolean boolean69 = funcionCuadratica3.equals(funcionCuadratica28);
        funcionCuadratica28.setA(100000.0f);
        funcionCuadratica28.setA(6.9643198E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+100.0x" + "'", str21.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.70024767E17f + "'", float23 == 1.70024767E17f);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10000.0f + "'", float30 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        java.lang.Object obj9 = funcionCuadratica7.raices();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj14 = funcionCuadratica13.raices();
        boolean boolean15 = funcionCuadratica7.equals(funcionCuadratica13);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        float float21 = funcionCuadratica19.getC();
        float float22 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        float float28 = funcionCuadratica26.determinante();
        boolean boolean29 = funcionCuadratica19.equals(funcionCuadratica26);
        boolean boolean30 = funcionCuadratica7.equals(funcionCuadratica26);
        float float31 = funcionCuadratica26.getA();
        java.lang.Object obj32 = funcionCuadratica26.raices();
        java.lang.String str33 = funcionCuadratica26.toString();
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica26);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica38.setA((float) (byte) -1);
        java.lang.String str41 = funcionCuadratica38.toString();
        java.lang.String str42 = funcionCuadratica38.toString();
        boolean boolean43 = funcionCuadratica26.equals(funcionCuadratica38);
        int int44 = funcionCuadratica26.numRaices();
        java.lang.Object obj45 = funcionCuadratica26.raices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+100.0x" + "'", str33.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-1.0x^2+100.0x" + "'", str41.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-1.0x^2+100.0x" + "'", str42.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        java.lang.Object obj17 = funcionCuadratica15.raices();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj22 = funcionCuadratica21.raices();
        boolean boolean23 = funcionCuadratica15.equals(funcionCuadratica21);
        funcionCuadratica15.setA((float) ' ');
        funcionCuadratica15.setC((float) (short) -1);
        float float28 = funcionCuadratica15.determinante();
        float float30 = funcionCuadratica15.eval((float) (byte) 1);
        java.lang.Object obj31 = funcionCuadratica15.raices();
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        funcionCuadratica35.setB((float) (byte) -1);
        funcionCuadratica35.setC((float) (byte) 1);
        float float41 = funcionCuadratica35.getA();
        boolean boolean42 = funcionCuadratica15.equals(funcionCuadratica35);
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica15);
        int int44 = funcionCuadratica15.numRaices();
        java.lang.String str45 = funcionCuadratica15.toString();
        funcionCuadratica15.setB(104.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10128.0f + "'", float28 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 131.0f + "'", float30 == 131.0f);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str45.equals("32.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(232.0f, (float) 1, 540560.0f);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-5.0163968E8f) + "'", float4 == (-5.0163968E8f));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(191.0f, (-1.9457676E20f), 9.9980119E13f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getB();
        float float17 = funcionCuadratica3.getC();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        float float19 = funcionCuadratica3.determinante();
        float float20 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-0.0f) + "'", obj18.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        java.lang.String str27 = funcionCuadratica20.toString();
        funcionCuadratica20.setC((float) (byte) 100);
        funcionCuadratica20.setC((float) 1L);
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica20);
        java.lang.Object obj33 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (-1));
        float float36 = funcionCuadratica3.getC();
        float float37 = funcionCuadratica3.getC();
        float float38 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str27.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        int int16 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB((float) (short) 10);
        int int19 = funcionCuadratica3.numRaices();
        java.lang.Object obj20 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.getB();
        java.lang.Object obj22 = funcionCuadratica3.raices();
        float float23 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((-1.00019989E18f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-2.04805018E10f), 0.0f, (-1.74107996E10f));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, (-4000.0f), (-399996.0f));
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4000.0f) + "'", float4 == (-4000.0f));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        float float14 = funcionCuadratica3.determinante();
        float float15 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.getB();
        float float18 = funcionCuadratica3.eval(2.92205101E12f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 8.538382E25f + "'", float18 == 8.538382E25f);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.determinante();
        int int18 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.String str23 = funcionCuadratica7.toString();
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean28 = funcionCuadratica7.equals(funcionCuadratica27);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float33 = funcionCuadratica32.getB();
        float float34 = funcionCuadratica32.getC();
        float float35 = funcionCuadratica32.getC();
        float float36 = funcionCuadratica32.getB();
        int int37 = funcionCuadratica32.numRaices();
        funcionCuadratica32.setB(5.2230605E9f);
        boolean boolean40 = funcionCuadratica7.equals(funcionCuadratica32);
        java.lang.String str41 = funcionCuadratica32.toString();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "10.0x^2+5.2230605E9x" + "'", str41.equals("10.0x^2+5.2230605E9x"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.String str8 = funcionCuadratica3.toString();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        java.lang.Object obj16 = funcionCuadratica14.raices();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj21 = funcionCuadratica20.raices();
        boolean boolean22 = funcionCuadratica14.equals(funcionCuadratica20);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        float float28 = funcionCuadratica26.getC();
        float float29 = funcionCuadratica26.getC();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        float float35 = funcionCuadratica33.determinante();
        boolean boolean36 = funcionCuadratica26.equals(funcionCuadratica33);
        boolean boolean37 = funcionCuadratica14.equals(funcionCuadratica33);
        float float38 = funcionCuadratica33.getA();
        practico5.FuncionCuadratica funcionCuadratica42 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float43 = funcionCuadratica42.getB();
        java.lang.Object obj44 = funcionCuadratica42.raices();
        practico5.FuncionCuadratica funcionCuadratica48 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj49 = funcionCuadratica48.raices();
        boolean boolean50 = funcionCuadratica42.equals(funcionCuadratica48);
        java.lang.String str51 = funcionCuadratica42.toString();
        float float53 = funcionCuadratica42.eval(1.30393536E8f);
        java.lang.Object obj54 = funcionCuadratica42.raices();
        boolean boolean55 = funcionCuadratica33.equals(funcionCuadratica42);
        float float56 = funcionCuadratica33.getC();
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica33);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "232.0x^2" + "'", str8.equals("232.0x^2"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10000.0f + "'", float35 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 10.0f + "'", float38 == 10.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "10.0x^2+100.0x" + "'", str51.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.70024767E17f + "'", float53 == 1.70024767E17f);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setA((-68.0f));
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-68.0x^2+-1.0" + "'", str6.equals("-68.0x^2+-1.0"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float31 = funcionCuadratica3.eval((float) (-1L));
        float float33 = funcionCuadratica3.eval(131.0f);
        float float35 = funcionCuadratica3.eval(1.00360441E17f);
        float float36 = funcionCuadratica3.getC();
        float float37 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 171610.0f + "'", float33 == 171610.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0072218E35f + "'", float35 == 1.0072218E35f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(100000.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) 'a', (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int8 = funcionCuadratica7.numRaices();
        float float9 = funcionCuadratica7.determinante();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica7);
        float float11 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10004.0f + "'", float9 == 10004.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica(157.0f, 999899.0f, 999899.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setC(171610.0f);
        int int15 = funcionCuadratica11.numRaices();
        float float16 = funcionCuadratica11.determinante();
        int int17 = funcionCuadratica11.numRaices();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 999899.0f + "'", float12 == 999899.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 9.9969027E11f + "'", float16 == 9.9969027E11f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        java.lang.String str14 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica18.getClass();
        float float21 = funcionCuadratica18.determinante();
        float float22 = funcionCuadratica18.determinante();
        java.lang.String str23 = funcionCuadratica18.toString();
        boolean boolean24 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+401.0x+1.0" + "'", str14.equals("10.0x^2+401.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+10.0x" + "'", str23.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getB();
        float float9 = funcionCuadratica3.getB();
        float float10 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.eval((float) 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 110.0f + "'", float12 == 110.0f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((float) (byte) 1);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.eval((float) (byte) 0);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float26 = funcionCuadratica25.getB();
        funcionCuadratica25.setA(999899.0f);
        float float29 = funcionCuadratica25.determinante();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica25);
        float float32 = funcionCuadratica25.eval(100000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 2.0f + "'", float26 == 2.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-3.9995961E10f) + "'", float29 == (-3.9995961E10f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 9.9989899E15f + "'", float32 == 9.9989899E15f);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.eval((-1.0003998E36f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica(2.5758312E33f, 3.2012794E37f, 97.0f);
        float float14 = funcionCuadratica12.eval(401.0f);
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-399996.0f) + "'", float6 == (-399996.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + Float.POSITIVE_INFINITY + "'", float8 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + Float.POSITIVE_INFINITY + "'", float14 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2000.0f, (-38864.0f), 97329.0f);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-52300.0f), 9.998104E14f, (-11424.0f));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float30 = funcionCuadratica18.getA();
        float float31 = funcionCuadratica18.getC();
        funcionCuadratica18.setA(191.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.eval(5.6987436E7f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 3.24756785E15f + "'", float7 == 3.24756785E15f);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.eval((float) 100);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        funcionCuadratica21.setB((float) (byte) -1);
        funcionCuadratica21.setC((float) (byte) 1);
        float float27 = funcionCuadratica21.getA();
        java.lang.String str28 = funcionCuadratica21.toString();
        float float29 = funcionCuadratica21.getC();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        funcionCuadratica33.setA((float) ' ');
        funcionCuadratica33.setC((float) (short) -1);
        float float46 = funcionCuadratica33.determinante();
        float float48 = funcionCuadratica33.eval((float) (byte) 1);
        java.lang.Object obj49 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica53 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float54 = funcionCuadratica53.getB();
        funcionCuadratica53.setB((float) (byte) -1);
        funcionCuadratica53.setC((float) (byte) 1);
        float float59 = funcionCuadratica53.getA();
        boolean boolean60 = funcionCuadratica33.equals(funcionCuadratica53);
        boolean boolean61 = funcionCuadratica21.equals(funcionCuadratica33);
        funcionCuadratica21.setC(1233649.0f);
        boolean boolean64 = funcionCuadratica3.equals(funcionCuadratica21);
        funcionCuadratica3.setA(1.1121001E7f);
        float float67 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str28.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10128.0f + "'", float46 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 131.0f + "'", float48 == 131.0f);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 100.0f + "'", float54 == 100.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 10.0f + "'", float59 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(132000.0f, 100.0f, (-800.0f));
        boolean boolean9 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica8.setA((float) 100);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.8908421E35f, 1.6003198E20f, 2.2661277E21f);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        float float6 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica(121000.0f, 5.6987436E7f, 131.0f);
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica12);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 1015697.0f, 9600.0f);
        float float5 = funcionCuadratica3.eval(8.674031E23f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + Float.POSITIVE_INFINITY + "'", float5 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.getC();
        java.lang.Object obj17 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-6.163462E37f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        float float4 = funcionCuadratica3.getA();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.30393536E8f + "'", float4 == 1.30393536E8f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1276.0f), 1.00219519E12f, (-4.00039987E9f));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float5 = funcionCuadratica3.eval(9413.0f);
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.8604582E8f + "'", float5 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10.0x^2+100.0" + "'", str6.equals("10.0x^2+100.0"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        float float13 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setC((float) 10);
        float float17 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj23 = funcionCuadratica22.raices();
        float float24 = funcionCuadratica22.getC();
        float float25 = funcionCuadratica22.getB();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica29.setA((float) (byte) -1);
        funcionCuadratica29.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float38 = funcionCuadratica37.getB();
        funcionCuadratica37.setB((float) (byte) -1);
        funcionCuadratica37.setC((float) (byte) 1);
        boolean boolean43 = funcionCuadratica29.equals(funcionCuadratica37);
        boolean boolean44 = funcionCuadratica22.equals(funcionCuadratica29);
        java.lang.String str45 = funcionCuadratica22.toString();
        java.lang.Object obj46 = funcionCuadratica22.raices();
        float float47 = funcionCuadratica22.getB();
        float float48 = funcionCuadratica22.determinante();
        practico5.FuncionCuadratica funcionCuadratica52 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float53 = funcionCuadratica52.getB();
        funcionCuadratica52.setB((float) (byte) -1);
        funcionCuadratica52.setC((float) (byte) 1);
        float float58 = funcionCuadratica52.getA();
        java.lang.String str59 = funcionCuadratica52.toString();
        float float60 = funcionCuadratica52.getC();
        float float61 = funcionCuadratica52.getB();
        float float63 = funcionCuadratica52.eval((float) '#');
        float float64 = funcionCuadratica52.determinante();
        funcionCuadratica52.setB((float) 2);
        java.lang.Class<?> wildcardClass67 = funcionCuadratica52.getClass();
        boolean boolean68 = funcionCuadratica22.equals(funcionCuadratica52);
        funcionCuadratica52.setA(1.31438331E14f);
        boolean boolean71 = funcionCuadratica3.equals(funcionCuadratica52);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "10.0x^2+10.0x" + "'", str45.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 10.0f + "'", float47 == 10.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 10.0f + "'", float58 == 10.0f);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str59.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 1.0f + "'", float60 == 1.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.0f) + "'", float61 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 12216.0f + "'", float63 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-39.0f) + "'", float64 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getC();
        float float8 = funcionCuadratica3.getB();
        int int9 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC((float) '4');
        float float12 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 52.0f + "'", float12 == 52.0f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2000.0f, 5.0f, 0.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        funcionCuadratica7.setB((float) (byte) -1);
        funcionCuadratica7.setC((float) (byte) 1);
        float float13 = funcionCuadratica7.getA();
        java.lang.String str14 = funcionCuadratica7.toString();
        float float15 = funcionCuadratica7.getA();
        funcionCuadratica7.setB(2.0f);
        float float18 = funcionCuadratica7.getB();
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica7);
        float float20 = funcionCuadratica7.getB();
        float float21 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str14.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 2.0f + "'", float20 == 2.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica16.setA((float) (byte) -1);
        funcionCuadratica16.setC((float) 0);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica16.getClass();
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica16);
        java.lang.Class<?> wildcardClass23 = funcionCuadratica3.getClass();
        float float25 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float31 = funcionCuadratica3.eval((float) (short) 10);
        funcionCuadratica3.setA(1.31380265E14f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1000.0f + "'", float31 == 1000.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.determinante();
        java.lang.String str7 = funcionCuadratica3.toString();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+100.0x" + "'", str7.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+100.0x" + "'", str8.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(157.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(210.0f);
        funcionCuadratica3.setC(1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.getC();
        java.lang.String str18 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str18.equals("10.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-6.163462E37f), 1.1496289E29f, 1.02576384E8f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.1496289E29f + "'", float4 == 1.1496289E29f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.1496289E29f + "'", float5 == 1.1496289E29f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        funcionCuadratica17.setB((float) (byte) -1);
        funcionCuadratica17.setC((float) (byte) 1);
        float float23 = funcionCuadratica17.getA();
        java.lang.String str24 = funcionCuadratica17.toString();
        boolean boolean25 = funcionCuadratica9.equals(funcionCuadratica17);
        float float26 = funcionCuadratica9.getA();
        funcionCuadratica9.setA(97.0f);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float33 = funcionCuadratica32.getB();
        funcionCuadratica32.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica32.equals(funcionCuadratica39);
        java.lang.Class<?> wildcardClass42 = funcionCuadratica32.getClass();
        boolean boolean43 = funcionCuadratica9.equals(funcionCuadratica32);
        funcionCuadratica9.setB(1.46410004E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str24.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getC();
        float float8 = funcionCuadratica3.getB();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica10.setC(0.0f);
        float float25 = funcionCuadratica10.getB();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica10.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((-39.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.40576604E11f, 1.74240006E11f, (-39.0f));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        java.lang.Object obj13 = funcionCuadratica11.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        boolean boolean19 = funcionCuadratica11.equals(funcionCuadratica17);
        funcionCuadratica11.setA((float) ' ');
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica11);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setB(1.00180056E8f);
        java.lang.Class<?> wildcardClass31 = funcionCuadratica3.getClass();
        float float32 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(52.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        float float16 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getB();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        float float28 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        float float14 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(191.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(5.2230605E9f);
        float float12 = funcionCuadratica3.eval((-0.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.eval(1.1121001E7f);
        float float18 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.23676657E15f + "'", float17 == 1.23676657E15f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float17 = funcionCuadratica16.getB();
        java.lang.Object obj18 = funcionCuadratica16.raices();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj23 = funcionCuadratica22.raices();
        boolean boolean24 = funcionCuadratica16.equals(funcionCuadratica22);
        funcionCuadratica16.setA((float) ' ');
        funcionCuadratica16.setC((float) (short) -1);
        float float29 = funcionCuadratica16.determinante();
        float float31 = funcionCuadratica16.eval((float) (byte) 1);
        java.lang.Object obj32 = funcionCuadratica16.raices();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float37 = funcionCuadratica36.getB();
        funcionCuadratica36.setB((float) (byte) -1);
        funcionCuadratica36.setC((float) (byte) 1);
        float float42 = funcionCuadratica36.getA();
        boolean boolean43 = funcionCuadratica16.equals(funcionCuadratica36);
        float float44 = funcionCuadratica16.getC();
        funcionCuadratica16.setC(2.43670528E9f);
        boolean boolean47 = funcionCuadratica3.equals(funcionCuadratica16);
        float float49 = funcionCuadratica3.eval(2.8908413E34f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10128.0f + "'", float29 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 131.0f + "'", float31 == 131.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + Float.POSITIVE_INFINITY + "'", float49 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(1.00360449E17f);
        funcionCuadratica3.setB(2.512247E19f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        funcionCuadratica22.setC(104.0f);
        float float29 = funcionCuadratica22.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 104.0f + "'", float29 == 104.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica3.setA((-68.0f));
        float float20 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        int int22 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        float float14 = funcionCuadratica9.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10);
        float float21 = funcionCuadratica3.getA();
        java.lang.Object obj22 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-68.0f));
        java.lang.Object obj25 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(9413.0f);
        float float28 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(99901.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.55992969E13f, 2.92205652E12f, 1.29399648E8f);
        float float5 = funcionCuadratica3.eval(1.2054106E25f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + Float.POSITIVE_INFINITY + "'", float5 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB(1.52190226E13f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj19 = funcionCuadratica18.raices();
        java.lang.String str20 = funcionCuadratica18.toString();
        funcionCuadratica18.setC((float) 'a');
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica18);
        funcionCuadratica18.setA((float) 10L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+100.0x" + "'", str20.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica13.setB((float) 0L);
        funcionCuadratica13.setA(232.0f);
        funcionCuadratica13.setA(262190.0f);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica13);
        float float21 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 10);
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.getB();
        int int9 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x+10.0" + "'", str7.equals("10.0x^2+10.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        float float27 = funcionCuadratica20.getA();
        float float28 = funcionCuadratica20.getA();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica20);
        float float30 = funcionCuadratica20.determinante();
        float float31 = funcionCuadratica20.determinante();
        funcionCuadratica20.setB(1.0072218E35f);
        funcionCuadratica20.setC(1.00360037E17f);
        float float37 = funcionCuadratica20.eval(121000.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-39.0f) + "'", float30 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-39.0f) + "'", float31 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + Float.POSITIVE_INFINITY + "'", float37 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((-9.997902E13f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica10.setB(104.0f);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        java.lang.Object obj30 = funcionCuadratica28.raices();
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica28.equals(funcionCuadratica34);
        java.lang.String str37 = funcionCuadratica28.toString();
        float float39 = funcionCuadratica28.eval(1.30393536E8f);
        boolean boolean40 = funcionCuadratica10.equals(funcionCuadratica28);
        int int41 = funcionCuadratica10.numRaices();
        float float42 = funcionCuadratica10.determinante();
        java.lang.Class<?> wildcardClass43 = funcionCuadratica10.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "10.0x^2+100.0x" + "'", str37.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.70024767E17f + "'", float39 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10816.0f + "'", float42 == 10816.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        java.lang.String str27 = funcionCuadratica20.toString();
        funcionCuadratica20.setC((float) (byte) 100);
        funcionCuadratica20.setC((float) 1L);
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica20);
        float float33 = funcionCuadratica20.determinante();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str27.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-39.0f) + "'", float33 == (-39.0f));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float24 = funcionCuadratica22.eval(0.0f);
        funcionCuadratica22.setB((float) 100L);
        funcionCuadratica22.setC((float) 1);
        funcionCuadratica22.setA(1.1121001E7f);
        boolean boolean31 = funcionCuadratica11.equals(funcionCuadratica22);
        float float32 = funcionCuadratica22.getA();
        float float33 = funcionCuadratica22.determinante();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.1121001E7f + "'", float32 == 1.1121001E7f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-4.4474004E7f) + "'", float33 == (-4.4474004E7f));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.00009997E9f);
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6000.0f, 8.538379E25f, (float) 2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.eval(1.30393536E8f);
        float float11 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(0.0f);
        float float14 = funcionCuadratica3.getA();
        float float15 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.eval((float) (byte) 10);
        float float13 = funcionCuadratica3.eval(110.0f);
        funcionCuadratica3.setA(4.22409984E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2000.0f + "'", float11 == 2000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 132000.0f + "'", float13 == 132000.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(132000.0f, 12216.0f, 131.0f);
        funcionCuadratica3.setB(100000.0f);
        funcionCuadratica3.setC(99.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-3.0f), (float) 0L, 9.9969027E11f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, 1.62048E8f, 97.0f);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((float) 10L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 110.0f + "'", float4 == 110.0f);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        funcionCuadratica3.setB((float) 0L);
        float float30 = funcionCuadratica3.eval((float) (byte) 0);
        funcionCuadratica3.setC(2.5758312E33f);
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj37 = funcionCuadratica36.raices();
        float float38 = funcionCuadratica36.getC();
        float float39 = funcionCuadratica36.getB();
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica43.setA((float) (byte) -1);
        funcionCuadratica43.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica51 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float52 = funcionCuadratica51.getB();
        funcionCuadratica51.setB((float) (byte) -1);
        funcionCuadratica51.setC((float) (byte) 1);
        boolean boolean57 = funcionCuadratica43.equals(funcionCuadratica51);
        boolean boolean58 = funcionCuadratica36.equals(funcionCuadratica43);
        java.lang.String str59 = funcionCuadratica36.toString();
        java.lang.Object obj60 = funcionCuadratica36.raices();
        java.lang.String str61 = funcionCuadratica36.toString();
        float float62 = funcionCuadratica36.getC();
        float float63 = funcionCuadratica36.determinante();
        float float64 = funcionCuadratica36.getC();
        funcionCuadratica36.setB(0.0f);
        float float67 = funcionCuadratica36.determinante();
        funcionCuadratica36.setA(9.996025E28f);
        boolean boolean70 = funcionCuadratica3.equals(funcionCuadratica36);
        funcionCuadratica36.setA(2.3367358E36f);
        java.lang.String str73 = funcionCuadratica36.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.0f + "'", float39 == 10.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "10.0x^2+10.0x" + "'", str59.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "10.0x^2+10.0x" + "'", str61.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 100.0f + "'", float63 == 100.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "2.3367358E36x^2" + "'", str73.equals("2.3367358E36x^2"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        funcionCuadratica3.setB((float) 0L);
        java.lang.Object obj29 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((-2.890842E34f));
        float float32 = funcionCuadratica3.getB();
        float float33 = funcionCuadratica3.determinante();
        float float34 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-0.0f) + "'", obj29.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-2.890842E34f) + "'", float32 == (-2.890842E34f));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + Float.POSITIVE_INFINITY + "'", float33 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-2.890842E34f) + "'", float34 == (-2.890842E34f));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(5.2230605E9f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        float float12 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(199.0f);
        float float9 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(4.0f);
        float float13 = funcionCuadratica3.eval(1.46422108E10f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 4.2664473E22f + "'", float13 == 4.2664473E22f);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.getB();
        float float11 = funcionCuadratica3.eval(1.0002001E18f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "232.0x^2" + "'", str8.equals("232.0x^2"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.3209285E38f + "'", float11 == 2.3209285E38f);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        java.lang.Object obj14 = funcionCuadratica3.raices();
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getB();
        float float18 = funcionCuadratica3.eval(2.512247E19f);
        funcionCuadratica3.setA(9413.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 104.0f + "'", float15 == 104.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + Float.POSITIVE_INFINITY + "'", float18 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        java.lang.String str13 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+100.0x" + "'", str13.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.String str23 = funcionCuadratica7.toString();
        float float24 = funcionCuadratica7.getC();
        float float26 = funcionCuadratica7.eval(132000.0f);
        java.lang.Class<?> wildcardClass27 = funcionCuadratica7.getClass();
        java.lang.Class<?> wildcardClass28 = funcionCuadratica7.getClass();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.74107996E10f) + "'", float26 == (-1.74107996E10f));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica22.getA();
        float float28 = funcionCuadratica22.determinante();
        int int29 = funcionCuadratica22.numRaices();
        java.lang.String str30 = funcionCuadratica22.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10.0x^2+100.0x" + "'", str30.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 0.0f, 2.8908421E35f);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 100L);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        java.lang.Object obj14 = funcionCuadratica3.raices();
        java.lang.Object obj15 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        java.lang.Object obj15 = funcionCuadratica13.raices();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        boolean boolean21 = funcionCuadratica13.equals(funcionCuadratica19);
        java.lang.String str22 = funcionCuadratica13.toString();
        funcionCuadratica13.setB(0.0f);
        java.lang.Class<?> wildcardClass25 = funcionCuadratica13.getClass();
        float float27 = funcionCuadratica13.eval((float) 100);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica13.getClass();
        float float29 = funcionCuadratica13.determinante();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica13);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica34.setB((float) (byte) 0);
        float float37 = funcionCuadratica34.getA();
        int int38 = funcionCuadratica34.numRaices();
        float float39 = funcionCuadratica34.getA();
        boolean boolean40 = funcionCuadratica13.equals(funcionCuadratica34);
        funcionCuadratica34.setA(160001.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x" + "'", str22.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100000.0f + "'", float27 == 100000.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.0f + "'", float39 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, (float) (short) 1, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        float float6 = funcionCuadratica3.eval(443100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-38799.0f) + "'", float4 == (-38799.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.9044749E13f + "'", float6 == 1.9044749E13f);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-38799.0f), 1000.0f, 1.1121001E7f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-38799.0x^2+1000.0x+1.1121001E7" + "'", str4.equals("-38799.0x^2+1000.0x+1.1121001E7"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Object obj20 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        boolean boolean26 = funcionCuadratica18.equals(funcionCuadratica24);
        java.lang.String str27 = funcionCuadratica18.toString();
        funcionCuadratica18.setB(0.0f);
        float float30 = funcionCuadratica18.determinante();
        java.lang.Class<?> wildcardClass31 = funcionCuadratica18.getClass();
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica18);
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float38 = funcionCuadratica36.eval((-11424.0f));
        float float39 = funcionCuadratica36.determinante();
        float float40 = funcionCuadratica36.getC();
        float float42 = funcionCuadratica36.eval(0.0f);
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica36);
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float48 = funcionCuadratica47.getB();
        java.lang.Object obj49 = funcionCuadratica47.raices();
        practico5.FuncionCuadratica funcionCuadratica53 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj54 = funcionCuadratica53.raices();
        boolean boolean55 = funcionCuadratica47.equals(funcionCuadratica53);
        funcionCuadratica47.setA((float) ' ');
        funcionCuadratica47.setC((float) (short) -1);
        float float60 = funcionCuadratica47.determinante();
        float float62 = funcionCuadratica47.eval((float) (byte) 1);
        java.lang.Object obj63 = funcionCuadratica47.raices();
        practico5.FuncionCuadratica funcionCuadratica67 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float68 = funcionCuadratica67.determinante();
        float float69 = funcionCuadratica67.getA();
        boolean boolean70 = funcionCuadratica47.equals(funcionCuadratica67);
        float float71 = funcionCuadratica47.getB();
        boolean boolean72 = funcionCuadratica3.equals(funcionCuadratica47);
        funcionCuadratica3.setC(1.31380265E14f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.30393536E8f + "'", float38 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 10128.0f + "'", float60 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 131.0f + "'", float62 == 131.0f);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 401.0f + "'", float68 == 401.0f);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 100.0f + "'", float69 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 100.0f + "'", float71 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, 4.1945094E21f, (-2.99996037E10f));
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + Float.POSITIVE_INFINITY + "'", float4 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica3.toString();
        float float27 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((-387.0f));
        funcionCuadratica3.setB(0.0f);
        funcionCuadratica3.setA((float) (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        float float16 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getB();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        funcionCuadratica3.setB(100000.0f);
        float float31 = funcionCuadratica3.eval(110.0f);
        funcionCuadratica3.setB(9.999992E7f);
        funcionCuadratica3.setC((-4000.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.1121001E7f + "'", float31 == 1.1121001E7f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(157.0f);
        float float16 = funcionCuadratica3.eval(1.0354983E7f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.68344314E16f + "'", float16 == 1.68344314E16f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        funcionCuadratica10.setB((float) 10L);
        funcionCuadratica10.setA((float) 1);
        funcionCuadratica10.setC((float) (byte) -1);
        float float19 = funcionCuadratica10.getC();
        funcionCuadratica10.setB((float) 'a');
        float float22 = funcionCuadratica10.getB();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        float float33 = funcionCuadratica26.eval(1.0f);
        funcionCuadratica26.setA((-39.0f));
        boolean boolean36 = funcionCuadratica10.equals(funcionCuadratica26);
        java.lang.Object obj37 = funcionCuadratica10.raices();
        int int38 = funcionCuadratica10.numRaices();
        float float39 = funcionCuadratica10.getA();
        float float40 = funcionCuadratica10.getB();
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica10);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 97.0f + "'", float22 == 97.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 97.0f + "'", float40 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(9.9999002E8f);
        float float10 = funcionCuadratica3.eval(1.70024767E17f);
        float float11 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.8908421E35f + "'", float10 == 2.8908421E35f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        float float21 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        float float27 = funcionCuadratica25.getC();
        float float28 = funcionCuadratica25.getC();
        float float29 = funcionCuadratica25.getB();
        boolean boolean30 = funcionCuadratica19.equals(funcionCuadratica25);
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica19);
        funcionCuadratica19.setB((-1.78430156E17f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica22.getA();
        funcionCuadratica22.setA((-68.0f));
        java.lang.Object obj30 = funcionCuadratica22.raices();
        funcionCuadratica22.setC(10128.0f);
        java.lang.String str33 = funcionCuadratica22.toString();
        float float34 = funcionCuadratica22.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-68.0x^2+100.0x+10128.0" + "'", str33.equals("-68.0x^2+100.0x+10128.0"));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 2);
        float float18 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(6120.0f);
        float float21 = funcionCuadratica3.getC();
        int int22 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.determinante();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00219518E13f, 1.70024741E16f, 10305.0f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100L, 3.2012794E37f, (-2.890842E34f));
        funcionCuadratica3.setC((float) (-1L));
        funcionCuadratica3.setC((-5.089792E9f));
        funcionCuadratica3.setC(155211.0f);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(199.0f, 2.8908421E35f, (-1276.0f));
        funcionCuadratica3.setB((float) (byte) 1);
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(1001097.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 199.0f + "'", float6 == 199.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica21);
        float float24 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 32.0f + "'", float17 == 32.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) 2);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        float float16 = funcionCuadratica3.eval((-38799.0f));
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica20.setA((float) (byte) -1);
        java.lang.Object obj23 = funcionCuadratica20.raices();
        int int24 = funcionCuadratica20.numRaices();
        float float26 = funcionCuadratica20.eval((float) (short) 1);
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        int int28 = funcionCuadratica20.numRaices();
        float float29 = funcionCuadratica20.getC();
        float float31 = funcionCuadratica20.eval(2.3367358E36f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.50536632E10f + "'", float16 == 1.50536632E10f);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 99.0f + "'", float26 == 99.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + Float.NEGATIVE_INFINITY + "'", float31 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(1.30507776E8f);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica22.getA();
        float float28 = funcionCuadratica22.determinante();
        int int29 = funcionCuadratica22.numRaices();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica22.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        java.lang.String str28 = funcionCuadratica19.toString();
        float float30 = funcionCuadratica19.eval(1.30393536E8f);
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica19);
        funcionCuadratica3.setB(9413.0f);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass35 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        float float41 = funcionCuadratica39.eval(1.23676657E15f);
        java.lang.String str42 = funcionCuadratica39.toString();
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica39);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+100.0x" + "'", str28.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.70024767E17f + "'", float30 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.5295915E31f + "'", float41 == 1.5295915E31f);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x+131.0" + "'", str42.equals("10.0x^2+100.0x+131.0"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(2.92205652E12f);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica17);
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        float float16 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getB();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        funcionCuadratica3.setB(100000.0f);
        float float31 = funcionCuadratica3.eval(110.0f);
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float37 = funcionCuadratica36.getB();
        float float38 = funcionCuadratica36.getC();
        float float39 = funcionCuadratica36.getC();
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float44 = funcionCuadratica43.getB();
        float float45 = funcionCuadratica43.determinante();
        boolean boolean46 = funcionCuadratica36.equals(funcionCuadratica43);
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        float float52 = funcionCuadratica50.determinante();
        funcionCuadratica50.setB((float) 10L);
        boolean boolean55 = funcionCuadratica43.equals(funcionCuadratica50);
        funcionCuadratica43.setB(104.0f);
        java.lang.String str58 = funcionCuadratica43.toString();
        float float59 = funcionCuadratica43.getB();
        boolean boolean60 = funcionCuadratica3.equals(funcionCuadratica43);
        java.lang.Class<?> wildcardClass61 = funcionCuadratica43.getClass();
        funcionCuadratica43.setB(1021.0f);
        funcionCuadratica43.setB((-4000.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.1121001E7f + "'", float31 == 1.1121001E7f);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10000.0f + "'", float45 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10000.0f + "'", float52 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "10.0x^2+104.0x" + "'", str58.equals("10.0x^2+104.0x"));
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 104.0f + "'", float59 == 104.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (float) (byte) -1, (float) 100L);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+-1.0x+100.0" + "'", str6.equals("-1.0x^2+-1.0x+100.0"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.eval(1.46422108E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.1439432E21f + "'", float11 == 2.1439432E21f);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        float float27 = funcionCuadratica3.eval(10000.0f);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        java.lang.Object obj33 = funcionCuadratica31.raices();
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj38 = funcionCuadratica37.raices();
        boolean boolean39 = funcionCuadratica31.equals(funcionCuadratica37);
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float44 = funcionCuadratica43.getB();
        float float45 = funcionCuadratica43.getC();
        float float46 = funcionCuadratica43.getC();
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        float float52 = funcionCuadratica50.determinante();
        boolean boolean53 = funcionCuadratica43.equals(funcionCuadratica50);
        boolean boolean54 = funcionCuadratica31.equals(funcionCuadratica50);
        funcionCuadratica50.setC(104.0f);
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica50);
        int int58 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica62 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float63 = funcionCuadratica62.getB();
        float float64 = funcionCuadratica62.getC();
        float float65 = funcionCuadratica62.getC();
        practico5.FuncionCuadratica funcionCuadratica69 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float70 = funcionCuadratica69.getB();
        float float71 = funcionCuadratica69.determinante();
        boolean boolean72 = funcionCuadratica62.equals(funcionCuadratica69);
        practico5.FuncionCuadratica funcionCuadratica76 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float77 = funcionCuadratica76.getB();
        float float78 = funcionCuadratica76.determinante();
        funcionCuadratica76.setB((float) 10L);
        boolean boolean81 = funcionCuadratica69.equals(funcionCuadratica76);
        funcionCuadratica69.setB(104.0f);
        java.lang.String str84 = funcionCuadratica69.toString();
        float float85 = funcionCuadratica69.getB();
        funcionCuadratica69.setA(10004.0f);
        float float88 = funcionCuadratica69.getA();
        boolean boolean89 = funcionCuadratica3.equals(funcionCuadratica69);
        java.lang.Object obj90 = funcionCuadratica69.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.00009997E9f + "'", float27 == 1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10000.0f + "'", float52 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 100.0f + "'", float63 == 100.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 100.0f + "'", float70 == 100.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 10000.0f + "'", float71 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 100.0f + "'", float77 == 100.0f);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 10000.0f + "'", float78 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "10.0x^2+104.0x" + "'", str84.equals("10.0x^2+104.0x"));
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 104.0f + "'", float85 == 104.0f);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 10004.0f + "'", float88 == 10004.0f);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(obj90);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float31 = funcionCuadratica3.eval((float) (-1L));
        float float33 = funcionCuadratica3.eval(131.0f);
        float float34 = funcionCuadratica3.getC();
        float float35 = funcionCuadratica3.determinante();
        float float37 = funcionCuadratica3.eval((-1276.0f));
        funcionCuadratica3.setC(1.46401772E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 171610.0f + "'", float33 == 171610.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.628176E7f + "'", float37 == 1.628176E7f);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        int int14 = funcionCuadratica10.numRaices();
        float float15 = funcionCuadratica10.getB();
        float float16 = funcionCuadratica10.getA();
        funcionCuadratica10.setC(0.0f);
        funcionCuadratica10.setA(11310.0f);
        java.lang.String str21 = funcionCuadratica10.toString();
        float float22 = funcionCuadratica10.determinante();
        int int23 = funcionCuadratica10.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "11310.0x^2+10.0x" + "'", str21.equals("11310.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.getC();
        java.lang.String str16 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(2.94767698E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+100.0x" + "'", str16.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float17 = funcionCuadratica11.eval((-39.0f));
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica3.setA(104.0f);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        float float22 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 11310.0f + "'", float17 == 11310.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10000.0f + "'", float22 == 10000.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        funcionCuadratica3.setC(99901.0f);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass23 = funcionCuadratica7.getClass();
        funcionCuadratica7.setB((float) (-1L));
        int int26 = funcionCuadratica7.numRaices();
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica(10.0f, (float) (-1), (float) 10L);
        float float31 = funcionCuadratica30.determinante();
        boolean boolean32 = funcionCuadratica7.equals(funcionCuadratica30);
        try {
            java.lang.Object obj33 = funcionCuadratica30.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-399.0f) + "'", float31 == (-399.0f));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        float float4 = funcionCuadratica3.getA();
        java.lang.String str5 = funcionCuadratica3.toString();
        float float6 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(3.0360044E23f);
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.30393536E8f + "'", float4 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str5.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 5.21574144E8f + "'", float6 == 5.21574144E8f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.5835014E32f) + "'", float9 == (-1.5835014E32f));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(1.62048E8f);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        float float13 = funcionCuadratica3.eval((-1.74107996E10f));
        funcionCuadratica3.setC(2.59004996E17f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 3.0313594E21f + "'", float13 == 3.0313594E21f);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        float float14 = funcionCuadratica10.determinante();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Object obj20 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        boolean boolean26 = funcionCuadratica18.equals(funcionCuadratica24);
        java.lang.String str27 = funcionCuadratica18.toString();
        funcionCuadratica18.setB(0.0f);
        int int30 = funcionCuadratica18.numRaices();
        java.lang.Class<?> wildcardClass31 = funcionCuadratica18.getClass();
        float float32 = funcionCuadratica18.getA();
        float float33 = funcionCuadratica18.getB();
        int int34 = funcionCuadratica18.numRaices();
        boolean boolean35 = funcionCuadratica10.equals(funcionCuadratica18);
        float float36 = funcionCuadratica10.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB((float) (-1L));
        float float13 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(1.62048E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        funcionCuadratica3.setC((float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        float float16 = funcionCuadratica14.getC();
        float float17 = funcionCuadratica14.getA();
        float float18 = funcionCuadratica14.getB();
        float float19 = funcionCuadratica14.getC();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica14);
        funcionCuadratica3.setC(9.9979908E12f);
        float float24 = funcionCuadratica3.eval(1.46401772E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 7.501718E23f + "'", float24 == 7.501718E23f);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float18 = funcionCuadratica3.eval((-1.26785096E8f));
        java.lang.String str19 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.60744614E17f + "'", float18 == 1.60744614E17f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+-1.0x" + "'", str19.equals("10.0x^2+-1.0x"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC((float) 1);
        int int19 = funcionCuadratica3.numRaices();
        float float20 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 9872.0f + "'", float20 == 9872.0f);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getB();
        float float17 = funcionCuadratica3.getC();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        float float19 = funcionCuadratica3.determinante();
        float float21 = funcionCuadratica3.eval(Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-0.0f) + "'", obj18.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertEquals((float) float21, Float.NaN, 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC((-399996.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(9.9999002E8f);
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        java.lang.String str27 = funcionCuadratica20.toString();
        funcionCuadratica20.setC((float) (byte) 100);
        funcionCuadratica20.setC((float) 1L);
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica20);
        java.lang.Class<?> wildcardClass33 = funcionCuadratica3.getClass();
        float float34 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str27.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.eval(3.7515608E7f);
        funcionCuadratica3.setA(1.1121001E7f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.40742095E16f + "'", float8 == 1.40742095E16f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, 2.9451708E11f, 210.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int8 = funcionCuadratica7.numRaices();
        float float9 = funcionCuadratica7.getB();
        float float10 = funcionCuadratica7.getA();
        float float12 = funcionCuadratica7.eval((float) 1);
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int18 = funcionCuadratica17.numRaices();
        float float19 = funcionCuadratica17.getC();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica17.getClass();
        float float21 = funcionCuadratica17.getB();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        float float27 = funcionCuadratica25.getC();
        float float28 = funcionCuadratica25.getB();
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica32.setA((float) (byte) -1);
        funcionCuadratica32.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        funcionCuadratica40.setB((float) (byte) -1);
        funcionCuadratica40.setC((float) (byte) 1);
        boolean boolean46 = funcionCuadratica32.equals(funcionCuadratica40);
        boolean boolean47 = funcionCuadratica25.equals(funcionCuadratica32);
        java.lang.String str48 = funcionCuadratica25.toString();
        java.lang.Object obj49 = funcionCuadratica25.raices();
        java.lang.String str50 = funcionCuadratica25.toString();
        float float51 = funcionCuadratica25.determinante();
        float float52 = funcionCuadratica25.getC();
        boolean boolean53 = funcionCuadratica17.equals(funcionCuadratica25);
        boolean boolean54 = funcionCuadratica3.equals(funcionCuadratica25);
        funcionCuadratica25.setC(5.21574144E8f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "10.0x^2+10.0x" + "'", str48.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "10.0x^2+10.0x" + "'", str50.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.eval(2.92205049E12f);
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 8.538379E25f + "'", float7 == 8.538379E25f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Object obj14 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        java.lang.String str16 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+-1.0x" + "'", str16.equals("10.0x^2+-1.0x"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 2);
        funcionCuadratica3.setC((float) 1L);
        float float14 = funcionCuadratica3.getC();
        float float15 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 35.0f + "'", float15 == 35.0f);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setC((float) 10);
        float float17 = funcionCuadratica3.getC();
        java.lang.String str18 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica22);
        float float24 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((-68.0f));
        float float14 = funcionCuadratica3.getC();
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-68.0f) + "'", float15 == (-68.0f));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.eval(8.0206513E16f);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.62048E8f + "'", float4 == 1.62048E8f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10128.0f + "'", float5 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-2.5732339E37f) + "'", float7 == (-2.5732339E37f));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        float float15 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) (-1L));
        float float19 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 5.0f + "'", float19 == 5.0f);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.5916843E10f, 34.0f, (float) 100L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(121000.0f);
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((float) (byte) 1);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.eval((float) (byte) 0);
        funcionCuadratica3.setB((float) '#');
        java.lang.Class<?> wildcardClass24 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        float float30 = funcionCuadratica28.determinante();
        funcionCuadratica28.setB((float) 10L);
        funcionCuadratica28.setA((float) 1);
        funcionCuadratica28.setC((float) (byte) -1);
        float float37 = funcionCuadratica28.getC();
        float float38 = funcionCuadratica28.getA();
        java.lang.Object obj39 = funcionCuadratica28.raices();
        float float40 = funcionCuadratica28.getC();
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica28);
        float float42 = funcionCuadratica28.getC();
        java.lang.Object obj43 = funcionCuadratica28.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10000.0f + "'", float30 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.eval((-1599983.0f));
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica11.setA((float) (byte) -1);
        java.lang.String str14 = funcionCuadratica11.toString();
        float float16 = funcionCuadratica11.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj21 = funcionCuadratica20.raices();
        float float22 = funcionCuadratica20.getC();
        float float23 = funcionCuadratica20.getA();
        boolean boolean24 = funcionCuadratica11.equals(funcionCuadratica20);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        float float34 = funcionCuadratica28.getA();
        java.lang.String str35 = funcionCuadratica28.toString();
        funcionCuadratica28.setC((float) (byte) 100);
        funcionCuadratica28.setC((float) 1L);
        boolean boolean40 = funcionCuadratica11.equals(funcionCuadratica28);
        funcionCuadratica11.setC(0.0f);
        java.lang.String str43 = funcionCuadratica11.toString();
        boolean boolean44 = funcionCuadratica3.equals(funcionCuadratica11);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.55992969E13f + "'", float6 == 2.55992969E13f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-1.0x^2+100.0x" + "'", str14.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-11424.0f) + "'", float16 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str35.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-1.0x^2+100.0x" + "'", str43.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (float) (byte) -1, (float) 100L);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        java.lang.Object obj14 = funcionCuadratica12.raices();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj19 = funcionCuadratica18.raices();
        boolean boolean20 = funcionCuadratica12.equals(funcionCuadratica18);
        float float21 = funcionCuadratica18.getB();
        java.lang.Object obj22 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        float float32 = funcionCuadratica26.getA();
        java.lang.String str33 = funcionCuadratica26.toString();
        boolean boolean34 = funcionCuadratica18.equals(funcionCuadratica26);
        int int35 = funcionCuadratica18.numRaices();
        boolean boolean36 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 401.0f + "'", float6 == 401.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str33.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5.0f, 2.56012813E17f, 9.9979908E12f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+10.0x" + "'", str10.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(1.9761783E23f);
        funcionCuadratica3.setC(2.92205652E12f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.8604696E7f, 1.62048E8f, 97329.0f);
        float float5 = funcionCuadratica3.eval(32.0f);
        float float6 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.5916843E10f + "'", float5 == 9.5916843E10f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.62250596E16f + "'", float6 == 2.62250596E16f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.eval((float) 1);
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.37487188E11f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica10.toString();
        java.lang.Class<?> wildcardClass27 = funcionCuadratica10.getClass();
        float float29 = funcionCuadratica10.eval(1.70024767E17f);
        float float30 = funcionCuadratica10.getB();
        funcionCuadratica10.setA((float) (short) -1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-1.0x^2+100.0x" + "'", str26.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-2.890842E34f) + "'", float29 == (-2.890842E34f));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        practico5.FuncionCuadratica funcionCuadratica4 = null;
        try {
            boolean boolean5 = funcionCuadratica3.equals(funcionCuadratica4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (byte) 10);
        java.lang.Object obj9 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 1.70024741E16f, 1.04000002E12f);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        int int13 = funcionCuadratica3.numRaices();
        float float15 = funcionCuadratica3.eval((float) 100L);
        float float16 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float21 = funcionCuadratica20.determinante();
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica20);
        try {
            java.lang.Object obj23 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 99901.0f + "'", float15 == 99901.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 401.0f + "'", float21 == 401.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(262190.0f, 10040.0f, 9.998104E14f);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica10.setC((float) 'a');
        float float15 = funcionCuadratica10.getC();
        funcionCuadratica10.setA(1.3661462E29f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica10.setB(104.0f);
        funcionCuadratica10.setC((float) (-1));
        float float27 = funcionCuadratica10.getA();
        funcionCuadratica10.setA(1141477.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.9451708E11f, 999899.0f, 2000.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(9.9999002E8f);
        funcionCuadratica3.setB(100000.0f);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        float float12 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 9.9999002E8f + "'", float12 == 9.9999002E8f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        java.lang.Object obj13 = funcionCuadratica11.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        boolean boolean19 = funcionCuadratica11.equals(funcionCuadratica17);
        float float20 = funcionCuadratica17.getB();
        funcionCuadratica17.setC(10.0f);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica17);
        float float24 = funcionCuadratica17.getC();
        float float25 = funcionCuadratica17.determinante();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica17.getClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 9600.0f + "'", float25 == 9600.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test224");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        funcionCuadratica19.setB((float) (byte) -1);
        funcionCuadratica19.setC((float) (byte) 1);
        float float26 = funcionCuadratica19.eval(1.0f);
        funcionCuadratica19.setA((-39.0f));
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica19);
        float float30 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 97.0f + "'", float30 == 97.0f);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        float float27 = funcionCuadratica3.eval(10000.0f);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        java.lang.Object obj33 = funcionCuadratica31.raices();
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj38 = funcionCuadratica37.raices();
        boolean boolean39 = funcionCuadratica31.equals(funcionCuadratica37);
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float44 = funcionCuadratica43.getB();
        float float45 = funcionCuadratica43.getC();
        float float46 = funcionCuadratica43.getC();
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        float float52 = funcionCuadratica50.determinante();
        boolean boolean53 = funcionCuadratica43.equals(funcionCuadratica50);
        boolean boolean54 = funcionCuadratica31.equals(funcionCuadratica50);
        funcionCuadratica50.setC(104.0f);
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica50);
        int int58 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica62 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float63 = funcionCuadratica62.getB();
        float float64 = funcionCuadratica62.getC();
        float float65 = funcionCuadratica62.getC();
        practico5.FuncionCuadratica funcionCuadratica69 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float70 = funcionCuadratica69.getB();
        float float71 = funcionCuadratica69.determinante();
        boolean boolean72 = funcionCuadratica62.equals(funcionCuadratica69);
        practico5.FuncionCuadratica funcionCuadratica76 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float77 = funcionCuadratica76.getB();
        float float78 = funcionCuadratica76.determinante();
        funcionCuadratica76.setB((float) 10L);
        boolean boolean81 = funcionCuadratica69.equals(funcionCuadratica76);
        funcionCuadratica69.setB(104.0f);
        java.lang.String str84 = funcionCuadratica69.toString();
        float float85 = funcionCuadratica69.getB();
        funcionCuadratica69.setA(10004.0f);
        float float88 = funcionCuadratica69.getA();
        boolean boolean89 = funcionCuadratica3.equals(funcionCuadratica69);
        float float90 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((-1.0f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.00009997E9f + "'", float27 == 1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10000.0f + "'", float52 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 100.0f + "'", float63 == 100.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 100.0f + "'", float70 == 100.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 10000.0f + "'", float71 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 100.0f + "'", float77 == 100.0f);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 10000.0f + "'", float78 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "10.0x^2+104.0x" + "'", str84.equals("10.0x^2+104.0x"));
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 104.0f + "'", float85 == 104.0f);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 10004.0f + "'", float88 == 10004.0f);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + 0.0f + "'", float90 == 0.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        java.lang.String str15 = funcionCuadratica3.toString();
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+2.0x" + "'", str15.equals("10.0x^2+2.0x"));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-38799.0f), 1000.0f, 1.1121001E7f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        java.lang.String str10 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getC();
        float float19 = funcionCuadratica16.getA();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica16.getClass();
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica16);
        funcionCuadratica3.setC((-39.0f));
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj29 = funcionCuadratica28.raices();
        funcionCuadratica28.setA((-11424.0f));
        java.lang.Class<?> wildcardClass32 = funcionCuadratica28.getClass();
        float float33 = funcionCuadratica28.getB();
        float float35 = funcionCuadratica28.eval(1.30507776E8f);
        float float36 = funcionCuadratica28.getB();
        boolean boolean37 = funcionCuadratica3.equals(funcionCuadratica28);
        funcionCuadratica28.setA(5.9375326E19f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1.0x^2+100.0x" + "'", str10.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-11424.0f) + "'", float12 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.9457676E20f) + "'", float35 == (-1.9457676E20f));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-1276.0f));
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1276.0f) + "'", float9 == (-1276.0f));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test229");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getB();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.2791497E9f, (-9.2799074E11f), (-4.00039987E9f));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        int int12 = funcionCuadratica3.numRaices();
        float float13 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC((-2.5732339E37f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        java.lang.String str27 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.74107996E10f), 1000.0f, 110.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        float float19 = funcionCuadratica17.getC();
        float float20 = funcionCuadratica17.getA();
        boolean boolean21 = funcionCuadratica8.equals(funcionCuadratica17);
        java.lang.Class<?> wildcardClass22 = funcionCuadratica17.getClass();
        float float23 = funcionCuadratica17.getC();
        float float24 = funcionCuadratica17.getB();
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica17);
        funcionCuadratica17.setB(4.00079956E18f);
        int int28 = funcionCuadratica17.numRaices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.74107996E10x^2+1000.0x+110.0" + "'", str4.equals("-1.74107996E10x^2+1000.0x+110.0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        float float10 = funcionCuadratica3.eval(2.2778125E19f);
        funcionCuadratica3.setA(1.58886003E9f);
        int int13 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + Float.POSITIVE_INFINITY + "'", float10 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        java.lang.Object obj13 = funcionCuadratica11.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        boolean boolean19 = funcionCuadratica11.equals(funcionCuadratica17);
        float float20 = funcionCuadratica17.getB();
        funcionCuadratica17.setC(10.0f);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica17);
        java.lang.Class<?> wildcardClass24 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float29 = funcionCuadratica28.getB();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica33.setA((float) (byte) -1);
        java.lang.String str36 = funcionCuadratica33.toString();
        float float38 = funcionCuadratica33.eval((-68.0f));
        boolean boolean39 = funcionCuadratica28.equals(funcionCuadratica33);
        boolean boolean40 = funcionCuadratica3.equals(funcionCuadratica33);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 2.0f + "'", float29 == 2.0f);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-1.0x^2+100.0x" + "'", str36.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-11424.0f) + "'", float38 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test236");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        int int16 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB((float) (short) 10);
        int int19 = funcionCuadratica3.numRaices();
        java.lang.String str20 = funcionCuadratica3.toString();
        java.lang.Object obj21 = funcionCuadratica3.raices();
        float float22 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str20.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        java.lang.Object obj14 = funcionCuadratica3.raices();
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getB();
        float float18 = funcionCuadratica3.eval(2.512247E19f);
        float float20 = funcionCuadratica3.eval((-5.0163968E8f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 104.0f + "'", float15 == 104.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + Float.POSITIVE_INFINITY + "'", float18 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 2.51642374E17f + "'", float20 == 2.51642374E17f);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test238");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) -1);
        funcionCuadratica3.setB((float) 1L);
        funcionCuadratica3.setC((float) 'a');
        float float21 = funcionCuadratica3.eval(1000.0f);
        float float22 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1001097.0f + "'", float21 == 1001097.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-387.0f) + "'", float22 == (-387.0f));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((-68.0f));
        java.lang.Object obj14 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float16 = funcionCuadratica3.getA();
        java.lang.String str17 = funcionCuadratica3.toString();
        int int18 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica(131.0f, 12216.0f, (float) (byte) 100);
        funcionCuadratica22.setB((float) 10);
        float float26 = funcionCuadratica22.eval(97.0f);
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica22);
        float float28 = funcionCuadratica22.determinante();
        float float29 = funcionCuadratica22.getA();
        float float30 = funcionCuadratica22.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+-68.0x+1.0" + "'", str17.equals("10.0x^2+-68.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1233649.0f + "'", float26 == 1233649.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-52300.0f) + "'", float28 == (-52300.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 131.0f + "'", float29 == 131.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (float) (byte) -1, (float) 100L);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((-399996.0f));
        float float8 = funcionCuadratica3.eval(7.850772E18f);
        try {
            java.lang.Object obj9 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-6.163462E37f) + "'", float8 == (-6.163462E37f));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test241");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        float float15 = funcionCuadratica8.getA();
        funcionCuadratica8.setC(121000.0f);
        int int18 = funcionCuadratica8.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0726502E36f, 10272.0f, 80232.0f);
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10272.0f + "'", float4 == 10272.0f);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test244");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        funcionCuadratica22.setB((float) (byte) -1);
        funcionCuadratica22.setC((float) (byte) 1);
        float float28 = funcionCuadratica22.getA();
        java.lang.String str29 = funcionCuadratica22.toString();
        float float30 = funcionCuadratica22.getC();
        float float31 = funcionCuadratica22.getB();
        float float33 = funcionCuadratica22.eval((float) '#');
        float float34 = funcionCuadratica22.determinante();
        funcionCuadratica22.setA((-39.0f));
        java.lang.String str37 = funcionCuadratica22.toString();
        boolean boolean38 = funcionCuadratica11.equals(funcionCuadratica22);
        float float40 = funcionCuadratica11.eval(132000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str29.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 12216.0f + "'", float33 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-39.0f) + "'", float34 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-39.0x^2+-1.0x+1.0" + "'", str37.equals("-39.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.74253212E11f + "'", float40 == 1.74253212E11f);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        java.lang.Object obj14 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(100000.0f);
        float float17 = funcionCuadratica3.getC();
        int int18 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB((-3.99876109E12f));
        float float21 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.599009E25f + "'", float21 == 1.599009E25f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(23.0f, 10000.0f, 10305.0f);
        funcionCuadratica3.setB(2765440.0f);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test247");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float4 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 1L, 32.0f, (float) 0);
        boolean boolean9 = funcionCuadratica3.equals(funcionCuadratica8);
        java.lang.String str10 = funcionCuadratica8.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2+32.0x" + "'", str10.equals("1.0x^2+32.0x"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(8.8604582E8f);
        java.lang.String str21 = funcionCuadratica3.toString();
        java.lang.String str22 = funcionCuadratica3.toString();
        float float23 = funcionCuadratica3.getC();
        try {
            java.lang.Object obj24 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+-1.0x+8.8604582E8" + "'", str21.equals("10.0x^2+-1.0x+8.8604582E8"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+-1.0x+8.8604582E8" + "'", str22.equals("10.0x^2+-1.0x+8.8604582E8"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 8.8604582E8f + "'", float23 == 8.8604582E8f);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getB();
        float float10 = funcionCuadratica3.eval(1.30507776E8f);
        float float11 = funcionCuadratica3.getA();
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.9457676E20f) + "'", float10 == (-1.9457676E20f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-11424.0f) + "'", float11 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-11424.0x^2+10.0x" + "'", str12.equals("-11424.0x^2+10.0x"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        java.lang.String str19 = funcionCuadratica3.toString();
        float float20 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-1.0x^2+100.0x" + "'", str19.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        funcionCuadratica22.setB((float) (byte) -1);
        funcionCuadratica22.setC((float) (byte) 1);
        float float28 = funcionCuadratica22.getA();
        java.lang.String str29 = funcionCuadratica22.toString();
        float float30 = funcionCuadratica22.getC();
        float float31 = funcionCuadratica22.getB();
        float float33 = funcionCuadratica22.eval((float) '#');
        float float34 = funcionCuadratica22.determinante();
        funcionCuadratica22.setA((-39.0f));
        java.lang.String str37 = funcionCuadratica22.toString();
        boolean boolean38 = funcionCuadratica11.equals(funcionCuadratica22);
        float float39 = funcionCuadratica22.getA();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str29.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 12216.0f + "'", float33 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-39.0f) + "'", float34 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-39.0x^2+-1.0x+1.0" + "'", str37.equals("-39.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-39.0f) + "'", float39 == (-39.0f));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test252");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float5 = funcionCuadratica3.eval(9413.0f);
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((-0.0f));
        funcionCuadratica3.setB(1.46410004E10f);
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.8604582E8f + "'", float5 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-0.0f) + "'", float11 == (-0.0f));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float24 = funcionCuadratica22.eval(0.0f);
        funcionCuadratica22.setB((float) 100L);
        funcionCuadratica22.setC((float) 1);
        funcionCuadratica22.setA(1.1121001E7f);
        boolean boolean31 = funcionCuadratica11.equals(funcionCuadratica22);
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        funcionCuadratica35.setB((float) (byte) -1);
        funcionCuadratica35.setC((float) (byte) 1);
        float float41 = funcionCuadratica35.getA();
        java.lang.String str42 = funcionCuadratica35.toString();
        float float43 = funcionCuadratica35.getC();
        float float44 = funcionCuadratica35.getB();
        float float46 = funcionCuadratica35.eval((float) '#');
        float float47 = funcionCuadratica35.determinante();
        funcionCuadratica35.setA((-39.0f));
        funcionCuadratica35.setB(9.998104E14f);
        boolean boolean52 = funcionCuadratica11.equals(funcionCuadratica35);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str42.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 12216.0f + "'", float46 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-39.0f) + "'", float47 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test255");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica22.getA();
        funcionCuadratica22.setA((-68.0f));
        funcionCuadratica22.setB((-1.0f));
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj36 = funcionCuadratica35.raices();
        float float37 = funcionCuadratica35.getC();
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float42 = funcionCuadratica41.getB();
        float float43 = funcionCuadratica41.getC();
        float float44 = funcionCuadratica41.getC();
        float float45 = funcionCuadratica41.getB();
        boolean boolean46 = funcionCuadratica35.equals(funcionCuadratica41);
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        funcionCuadratica50.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica57 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj58 = funcionCuadratica57.raices();
        boolean boolean59 = funcionCuadratica50.equals(funcionCuadratica57);
        float float60 = funcionCuadratica57.getA();
        boolean boolean61 = funcionCuadratica41.equals(funcionCuadratica57);
        funcionCuadratica57.setB(56143.0f);
        float float64 = funcionCuadratica57.getB();
        boolean boolean65 = funcionCuadratica22.equals(funcionCuadratica57);
        java.lang.Object obj66 = funcionCuadratica22.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 10.0f + "'", float60 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 56143.0f + "'", float64 == 56143.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test256");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10000.0f, 56143.0f, 561440.0f);
        funcionCuadratica3.setB(99.0f);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.getC();
        java.lang.String str19 = funcionCuadratica3.toString();
        float float20 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str19.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-39.0f) + "'", float20 == (-39.0f));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test258");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        funcionCuadratica17.setB((float) (byte) -1);
        funcionCuadratica17.setC((float) (byte) 1);
        float float23 = funcionCuadratica17.getA();
        java.lang.String str24 = funcionCuadratica17.toString();
        boolean boolean25 = funcionCuadratica9.equals(funcionCuadratica17);
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float30 = funcionCuadratica29.getB();
        funcionCuadratica29.setB((float) (byte) -1);
        funcionCuadratica29.setC((float) (byte) 1);
        float float36 = funcionCuadratica29.eval(1.0f);
        funcionCuadratica29.setA((-39.0f));
        funcionCuadratica29.setC((float) 1);
        funcionCuadratica29.setC(110.0f);
        boolean boolean43 = funcionCuadratica17.equals(funcionCuadratica29);
        int int44 = funcionCuadratica17.numRaices();
        float float45 = funcionCuadratica17.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str24.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test259");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj12 = funcionCuadratica11.raices();
        float float13 = funcionCuadratica11.getC();
        float float14 = funcionCuadratica11.getB();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica18.setA((float) (byte) -1);
        funcionCuadratica18.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        boolean boolean32 = funcionCuadratica18.equals(funcionCuadratica26);
        boolean boolean33 = funcionCuadratica11.equals(funcionCuadratica18);
        java.lang.String str34 = funcionCuadratica11.toString();
        java.lang.Object obj35 = funcionCuadratica11.raices();
        java.lang.String str36 = funcionCuadratica11.toString();
        float float37 = funcionCuadratica11.determinante();
        float float38 = funcionCuadratica11.getC();
        boolean boolean39 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica11.setC(10004.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+10.0x" + "'", str34.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "10.0x^2+10.0x" + "'", str36.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) 2);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test261");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(1000.0f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(540560.0f);
        float float20 = funcionCuadratica3.eval(2.56012813E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + Float.POSITIVE_INFINITY + "'", float20 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(99901.0f, 3.24756785E15f, 160761.0f);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(23.0f);
        funcionCuadratica3.setB(10040.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10.0x^2+10.0x" + "'", str6.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test265");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 104.0f, 171610.0f);
        practico5.FuncionCuadratica funcionCuadratica4 = null;
        try {
            boolean boolean5 = funcionCuadratica3.equals(funcionCuadratica4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        funcionCuadratica3.setA(121000.0f);
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        int int8 = funcionCuadratica3.numRaices();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "121000.0x^2+2.0x+10128.0" + "'", str7.equals("121000.0x^2+2.0x+10128.0"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-4.901952E9f) + "'", float9 == (-4.901952E9f));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1015697.0f, 11310.0f, 10272.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1015697.0f + "'", float4 == 1015697.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10272.0f + "'", float6 == 10272.0f);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test268");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, 232.0f, 2.56012813E17f);
        float float4 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, 1.62048E8f, 97.0f);
        funcionCuadratica3.setB(1.7909528E23f);
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "110.0x^2+1.7909528E23x+97.0" + "'", str6.equals("110.0x^2+1.7909528E23x+97.0"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test270");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-152.0f), (-9.997902E13f), (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float17 = funcionCuadratica15.eval(0.0f);
        funcionCuadratica15.setB((float) 100L);
        float float20 = funcionCuadratica15.getB();
        java.lang.String str21 = funcionCuadratica15.toString();
        boolean boolean22 = funcionCuadratica7.equals(funcionCuadratica15);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        float float32 = funcionCuadratica26.getA();
        java.lang.String str33 = funcionCuadratica26.toString();
        float float34 = funcionCuadratica26.getC();
        float float35 = funcionCuadratica26.getB();
        float float37 = funcionCuadratica26.eval((float) '#');
        float float38 = funcionCuadratica26.determinante();
        funcionCuadratica26.setA((-39.0f));
        java.lang.String str41 = funcionCuadratica26.toString();
        boolean boolean42 = funcionCuadratica15.equals(funcionCuadratica26);
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica26);
        java.lang.Class<?> wildcardClass44 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+100.0x" + "'", str21.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str33.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 12216.0f + "'", float37 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-39.0f) + "'", float38 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-39.0x^2+-1.0x+1.0" + "'", str41.equals("-39.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (short) 1, 1.62048E8f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(6.8743594E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        java.lang.Object obj11 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj16 = funcionCuadratica15.raices();
        boolean boolean17 = funcionCuadratica9.equals(funcionCuadratica15);
        int int18 = funcionCuadratica9.numRaices();
        float float19 = funcionCuadratica9.determinante();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        float float23 = funcionCuadratica3.eval(1.00360441E17f);
        float float24 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.00722185E36f + "'", float23 == 1.00722185E36f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399.0f), 1.6003198E20f, 1.02677664E9f);
        float float5 = funcionCuadratica3.eval(561440.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.984835E25f + "'", float5 == 8.984835E25f);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        java.lang.String str42 = funcionCuadratica33.toString();
        funcionCuadratica33.setB(0.0f);
        float float45 = funcionCuadratica33.determinante();
        boolean boolean46 = funcionCuadratica3.equals(funcionCuadratica33);
        float float48 = funcionCuadratica3.eval((float) (short) 0);
        java.lang.String str49 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x" + "'", str42.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "10.0x^2" + "'", str49.equals("10.0x^2"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test275");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1233649.0f, 7.501718E23f, (-52300.0f));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        funcionCuadratica3.setA(1.30507776E8f);
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        java.lang.String str27 = funcionCuadratica20.toString();
        funcionCuadratica20.setC((float) (byte) 100);
        funcionCuadratica20.setC((float) 1L);
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica20);
        java.lang.Class<?> wildcardClass33 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass34 = funcionCuadratica3.getClass();
        int int35 = funcionCuadratica3.numRaices();
        float float36 = funcionCuadratica3.getC();
        java.lang.String str37 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str27.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-1.0x^2+100.0x" + "'", str37.equals("-1.0x^2+100.0x"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test278");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        float float15 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(401.0f);
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        java.lang.Object obj25 = funcionCuadratica23.raices();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj30 = funcionCuadratica29.raices();
        boolean boolean31 = funcionCuadratica23.equals(funcionCuadratica29);
        funcionCuadratica23.setA((float) ' ');
        funcionCuadratica23.setC((float) (short) -1);
        float float36 = funcionCuadratica23.determinante();
        float float38 = funcionCuadratica23.eval((float) (byte) 1);
        java.lang.Object obj39 = funcionCuadratica23.raices();
        boolean boolean40 = funcionCuadratica3.equals(funcionCuadratica23);
        float float41 = funcionCuadratica23.getA();
        java.lang.Object obj42 = funcionCuadratica23.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10128.0f + "'", float36 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 131.0f + "'", float38 == 131.0f);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 32.0f + "'", float41 == 32.0f);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test279");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float17 = funcionCuadratica16.getB();
        java.lang.Object obj18 = funcionCuadratica16.raices();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj23 = funcionCuadratica22.raices();
        boolean boolean24 = funcionCuadratica16.equals(funcionCuadratica22);
        funcionCuadratica16.setA((float) ' ');
        funcionCuadratica16.setC((float) (short) -1);
        float float29 = funcionCuadratica16.determinante();
        float float31 = funcionCuadratica16.eval((float) (byte) 1);
        java.lang.Object obj32 = funcionCuadratica16.raices();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float37 = funcionCuadratica36.getB();
        funcionCuadratica36.setB((float) (byte) -1);
        funcionCuadratica36.setC((float) (byte) 1);
        float float42 = funcionCuadratica36.getA();
        boolean boolean43 = funcionCuadratica16.equals(funcionCuadratica36);
        float float44 = funcionCuadratica16.getC();
        funcionCuadratica16.setC(2.43670528E9f);
        boolean boolean47 = funcionCuadratica3.equals(funcionCuadratica16);
        float float48 = funcionCuadratica16.getA();
        funcionCuadratica16.setB(2.43828192E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10128.0f + "'", float29 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 131.0f + "'", float31 == 131.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 32.0f + "'", float48 == 32.0f);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        funcionCuadratica9.setC((float) '#');
        java.lang.Object obj16 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) '#', (-1.0f), (-4000.0f));
        funcionCuadratica20.setA(5.3940816E16f);
        boolean boolean23 = funcionCuadratica9.equals(funcionCuadratica20);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((-68.0f));
        java.lang.Object obj14 = funcionCuadratica3.raices();
        float float15 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(1.0072218E35f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test282");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 1.9199824E8f, 12216.0f);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test283");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test284");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        float float27 = funcionCuadratica3.eval(10000.0f);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        java.lang.Object obj33 = funcionCuadratica31.raices();
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj38 = funcionCuadratica37.raices();
        boolean boolean39 = funcionCuadratica31.equals(funcionCuadratica37);
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float44 = funcionCuadratica43.getB();
        float float45 = funcionCuadratica43.getC();
        float float46 = funcionCuadratica43.getC();
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        float float52 = funcionCuadratica50.determinante();
        boolean boolean53 = funcionCuadratica43.equals(funcionCuadratica50);
        boolean boolean54 = funcionCuadratica31.equals(funcionCuadratica50);
        funcionCuadratica50.setC(104.0f);
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica50);
        float float59 = funcionCuadratica50.eval(1.70024767E17f);
        java.lang.Class<?> wildcardClass60 = funcionCuadratica50.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.00009997E9f + "'", float27 == 1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10000.0f + "'", float52 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 2.8908421E35f + "'", float59 == 2.8908421E35f);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        int int14 = funcionCuadratica3.numRaices();
        float float15 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(1.51930253E9f);
        funcionCuadratica3.setA(10272.0f);
        float float20 = funcionCuadratica3.getA();
        java.lang.String str21 = funcionCuadratica3.toString();
        float float22 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10272.0f + "'", float20 == 10272.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10272.0x^2+1.51930253E9x" + "'", str21.equals("10272.0x^2+1.51930253E9x"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.51930253E9f + "'", float22 == 1.51930253E9f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test286");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getC();
        java.lang.Object obj16 = funcionCuadratica12.raices();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica12);
        funcionCuadratica12.setA(56143.0f);
        float float21 = funcionCuadratica12.eval(7.4079805E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 3.0810254E26f + "'", float21 == 3.0810254E26f);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test287");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        java.lang.String str28 = funcionCuadratica19.toString();
        float float30 = funcionCuadratica19.eval(1.30393536E8f);
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica19);
        funcionCuadratica3.setB(9413.0f);
        float float34 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float40 = funcionCuadratica38.eval(0.0f);
        int int41 = funcionCuadratica38.numRaices();
        float float42 = funcionCuadratica38.getC();
        java.lang.String str43 = funcionCuadratica38.toString();
        float float44 = funcionCuadratica38.getA();
        boolean boolean45 = funcionCuadratica3.equals(funcionCuadratica38);
        java.lang.Object obj46 = funcionCuadratica38.raices();
        int int47 = funcionCuadratica38.numRaices();
        float float48 = funcionCuadratica38.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+100.0x" + "'", str28.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.70024767E17f + "'", float30 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 32.0f + "'", float34 == 32.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "10.0x^2+10.0x" + "'", str43.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 10.0f + "'", float48 == 10.0f);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test288");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        java.lang.Object obj13 = funcionCuadratica11.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        boolean boolean19 = funcionCuadratica11.equals(funcionCuadratica17);
        funcionCuadratica11.setA((float) ' ');
        funcionCuadratica11.setC((float) (short) -1);
        float float24 = funcionCuadratica11.determinante();
        float float26 = funcionCuadratica11.eval((float) (byte) 1);
        java.lang.Object obj27 = funcionCuadratica11.raices();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        funcionCuadratica31.setB((float) (byte) -1);
        funcionCuadratica31.setC((float) (byte) 1);
        float float37 = funcionCuadratica31.getA();
        boolean boolean38 = funcionCuadratica11.equals(funcionCuadratica31);
        java.lang.String str39 = funcionCuadratica11.toString();
        int int40 = funcionCuadratica11.numRaices();
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica3.setB((float) 1);
        float float44 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10128.0f + "'", float24 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 131.0f + "'", float26 == 131.0f);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str39.equals("32.0x^2+100.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((float) (byte) 1);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.eval((float) (byte) 0);
        funcionCuadratica3.setB((float) '#');
        funcionCuadratica3.setA(157.0f);
        int int26 = funcionCuadratica3.numRaices();
        float float27 = funcionCuadratica3.getA();
        int int28 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 157.0f + "'", float27 == 157.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.eval((float) 100);
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        float float19 = funcionCuadratica3.determinante();
        float float21 = funcionCuadratica3.eval(3.27513384E17f);
        float float23 = funcionCuadratica3.eval(1.46409882E11f);
        funcionCuadratica3.setC(1.6003198E20f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0726502E36f + "'", float21 == 1.0726502E36f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 2.1435855E23f + "'", float23 == 2.1435855E23f);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test291");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getB();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        funcionCuadratica19.setA((float) ' ');
        funcionCuadratica19.setC((float) (short) -1);
        float float32 = funcionCuadratica19.determinante();
        float float34 = funcionCuadratica19.eval((float) (byte) 1);
        java.lang.Object obj35 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float40 = funcionCuadratica39.determinante();
        float float41 = funcionCuadratica39.getA();
        boolean boolean42 = funcionCuadratica19.equals(funcionCuadratica39);
        funcionCuadratica19.setB((float) (short) 1);
        boolean boolean45 = funcionCuadratica12.equals(funcionCuadratica19);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10128.0f + "'", float32 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 131.0f + "'", float34 == 131.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 401.0f + "'", float40 == 401.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        funcionCuadratica12.setA(199.0f);
        float float19 = funcionCuadratica12.getA();
        funcionCuadratica12.setC(1.628176E7f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 199.0f + "'", float19 == 199.0f);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((-68.0f));
        java.lang.Object obj14 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float21 = funcionCuadratica19.eval(0.0f);
        int int22 = funcionCuadratica19.numRaices();
        float float23 = funcionCuadratica19.getC();
        java.lang.String str24 = funcionCuadratica19.toString();
        java.lang.Object obj25 = funcionCuadratica19.raices();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica19);
        float float27 = funcionCuadratica3.getC();
        int int28 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10.0x^2+10.0x" + "'", str24.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        funcionCuadratica12.setB((float) (byte) -1);
        funcionCuadratica12.setC((float) (byte) 1);
        float float18 = funcionCuadratica12.getA();
        java.lang.String str19 = funcionCuadratica12.toString();
        float float20 = funcionCuadratica12.getC();
        float float21 = funcionCuadratica12.getB();
        float float23 = funcionCuadratica12.eval((float) '#');
        float float24 = funcionCuadratica12.determinante();
        float float25 = funcionCuadratica12.determinante();
        float float26 = funcionCuadratica12.determinante();
        float float27 = funcionCuadratica12.getC();
        funcionCuadratica12.setA(9.999801E18f);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        funcionCuadratica33.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj41 = funcionCuadratica40.raices();
        boolean boolean42 = funcionCuadratica33.equals(funcionCuadratica40);
        java.lang.Object obj43 = funcionCuadratica33.raices();
        funcionCuadratica33.setC(0.0f);
        float float47 = funcionCuadratica33.eval(2.43670528E9f);
        boolean boolean48 = funcionCuadratica12.equals(funcionCuadratica33);
        boolean boolean49 = funcionCuadratica3.equals(funcionCuadratica33);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str19.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 12216.0f + "'", float23 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-39.0f) + "'", float24 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-39.0f) + "'", float25 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-39.0f) + "'", float26 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 5.9375326E19f + "'", float47 == 5.9375326E19f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test296");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float14 = funcionCuadratica3.getC();
        float float16 = funcionCuadratica3.eval((-4000.0f));
        float float17 = funcionCuadratica3.getC();
        float float18 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(2.56012813E17f);
        float float21 = funcionCuadratica3.getC();
        float float23 = funcionCuadratica3.eval(1.8902726E23f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.60004E8f + "'", float16 == 1.60004E8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + Float.POSITIVE_INFINITY + "'", float23 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.70024767E17f, 1.74241333E11f, 2.43670528E9f);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test298");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.eval(7.850772E18f);
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(3.24756785E15f);
        funcionCuadratica3.setA(1.59996412E11f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+10.0x" + "'", str4.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.5758312E33f, 3.2012794E37f, 97.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 3.2012794E37f + "'", float4 == 3.2012794E37f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5758312E33f + "'", float5 == 2.5758312E33f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10);
        float float21 = funcionCuadratica3.getA();
        java.lang.Object obj22 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        float float32 = funcionCuadratica26.getA();
        java.lang.String str33 = funcionCuadratica26.toString();
        funcionCuadratica26.setC((float) (byte) 100);
        funcionCuadratica26.setC((float) 1L);
        funcionCuadratica26.setC((float) 10);
        float float40 = funcionCuadratica26.getC();
        java.lang.String str41 = funcionCuadratica26.toString();
        practico5.FuncionCuadratica funcionCuadratica45 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        boolean boolean46 = funcionCuadratica26.equals(funcionCuadratica45);
        int int47 = funcionCuadratica26.numRaices();
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica26);
        float float50 = funcionCuadratica26.eval(3.0810254E26f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str33.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str41.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + Float.POSITIVE_INFINITY + "'", float50 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test301");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        java.lang.Object obj13 = funcionCuadratica11.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj18 = funcionCuadratica17.raices();
        boolean boolean19 = funcionCuadratica11.equals(funcionCuadratica17);
        float float20 = funcionCuadratica17.getB();
        funcionCuadratica17.setC(10.0f);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica17);
        float float24 = funcionCuadratica17.getC();
        float float25 = funcionCuadratica17.determinante();
        float float26 = funcionCuadratica17.determinante();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 9600.0f + "'", float25 == 9600.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 9600.0f + "'", float26 == 9600.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test302");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica21);
        float float24 = funcionCuadratica21.getB();
        float float25 = funcionCuadratica21.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 32.0f + "'", float17 == 32.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10000.0f + "'", float25 == 10000.0f);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-152.0f), (-9.997902E13f), (float) (-1L));
        funcionCuadratica3.setA(4.9065876E9f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) 1L);
        float float14 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.8902726E23f);
        funcionCuadratica3.setB(9506.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test306");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica13.setB((float) 0L);
        funcionCuadratica13.setA(232.0f);
        funcionCuadratica13.setA(262190.0f);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica13);
        java.lang.Object obj21 = funcionCuadratica3.raices();
        java.lang.String str22 = funcionCuadratica3.toString();
        float float23 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass24 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x+97.0" + "'", str22.equals("10.0x^2+100.0x+97.0"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test307");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str13 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+-1.0x" + "'", str13.equals("10.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test308");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float17 = funcionCuadratica11.eval((-39.0f));
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        float float19 = funcionCuadratica11.getC();
        float float20 = funcionCuadratica11.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 11310.0f + "'", float17 == 11310.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getC();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.00360037E17f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test310");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        float float20 = funcionCuadratica3.eval(157.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-8949.0f) + "'", float20 == (-8949.0f));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test311");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(99.0f);
        java.lang.Object obj7 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test312");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.eval(0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.72027206E11f, (-90.0f), 1.40742095E16f);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test314");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica10.setB(104.0f);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        java.lang.Object obj30 = funcionCuadratica28.raices();
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica28.equals(funcionCuadratica34);
        java.lang.String str37 = funcionCuadratica28.toString();
        float float39 = funcionCuadratica28.eval(1.30393536E8f);
        boolean boolean40 = funcionCuadratica10.equals(funcionCuadratica28);
        int int41 = funcionCuadratica10.numRaices();
        funcionCuadratica10.setA((float) 100L);
        float float44 = funcionCuadratica10.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "10.0x^2+100.0x" + "'", str37.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.70024767E17f + "'", float39 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10816.0f + "'", float44 == 10816.0f);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test315");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setC((float) 10);
        float float17 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        funcionCuadratica21.setB((float) (byte) -1);
        funcionCuadratica21.setC((float) (byte) 1);
        float float27 = funcionCuadratica21.getA();
        java.lang.String str28 = funcionCuadratica21.toString();
        float float29 = funcionCuadratica21.getC();
        float float30 = funcionCuadratica21.getB();
        float float32 = funcionCuadratica21.eval((float) '#');
        float float33 = funcionCuadratica21.determinante();
        float float34 = funcionCuadratica21.determinante();
        funcionCuadratica21.setA(199.0f);
        java.lang.Class<?> wildcardClass37 = funcionCuadratica21.getClass();
        boolean boolean38 = funcionCuadratica3.equals(funcionCuadratica21);
        int int39 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str28.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 12216.0f + "'", float32 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-39.0f) + "'", float33 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-39.0f) + "'", float34 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        float float27 = funcionCuadratica20.getA();
        float float28 = funcionCuadratica20.getA();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica20);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        float float35 = funcionCuadratica33.getC();
        int int36 = funcionCuadratica33.numRaices();
        float float37 = funcionCuadratica33.getA();
        boolean boolean38 = funcionCuadratica12.equals(funcionCuadratica33);
        float float40 = funcionCuadratica33.eval(104.0f);
        float float41 = funcionCuadratica33.getA();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 118560.0f + "'", float40 == 118560.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(1.7632299E10f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test318");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(999899.0f);
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-3.9995961E10f) + "'", float7 == (-3.9995961E10f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test319");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(3.24756785E15f, 2.9451708E11f, (float) (byte) 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.9457676E20f), (-38799.0f), 8.9558088E7f);
        int int4 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.eval(2000.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-7.78307E26f) + "'", float6 == (-7.78307E26f));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test321");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float14 = funcionCuadratica3.getC();
        float float16 = funcionCuadratica3.eval((-4000.0f));
        float float17 = funcionCuadratica3.getC();
        float float18 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(2.56012813E17f);
        funcionCuadratica3.setA((-2.890842E34f));
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        float float28 = funcionCuadratica26.determinante();
        funcionCuadratica26.setB((float) 10L);
        funcionCuadratica26.setA((float) 1);
        funcionCuadratica26.setC((float) (byte) -1);
        float float35 = funcionCuadratica26.getC();
        funcionCuadratica26.setB((float) 'a');
        float float38 = funcionCuadratica26.getB();
        int int39 = funcionCuadratica26.numRaices();
        funcionCuadratica26.setB((float) (short) 10);
        int int42 = funcionCuadratica26.numRaices();
        java.lang.String str43 = funcionCuadratica26.toString();
        funcionCuadratica26.setC((float) 10);
        float float47 = funcionCuadratica26.eval(0.0f);
        java.lang.Object obj48 = funcionCuadratica26.raices();
        boolean boolean49 = funcionCuadratica3.equals(funcionCuadratica26);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.60004E8f + "'", float16 == 1.60004E8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 97.0f + "'", float38 == 97.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str43.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 10.0f + "'", float47 == 10.0f);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test322");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica3.toString();
        java.lang.Object obj27 = funcionCuadratica3.raices();
        float float28 = funcionCuadratica3.getB();
        float float29 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        funcionCuadratica33.setB((float) (byte) -1);
        funcionCuadratica33.setC((float) (byte) 1);
        float float39 = funcionCuadratica33.getA();
        java.lang.String str40 = funcionCuadratica33.toString();
        float float41 = funcionCuadratica33.getC();
        float float42 = funcionCuadratica33.getB();
        float float44 = funcionCuadratica33.eval((float) '#');
        float float45 = funcionCuadratica33.determinante();
        funcionCuadratica33.setB((float) 2);
        java.lang.Class<?> wildcardClass48 = funcionCuadratica33.getClass();
        boolean boolean49 = funcionCuadratica3.equals(funcionCuadratica33);
        float float51 = funcionCuadratica33.eval(2.94517084E10f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.0f + "'", float39 == 10.0f);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str40.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 12216.0f + "'", float44 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-39.0f) + "'", float45 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 8.6740314E21f + "'", float51 == 8.6740314E21f);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float13 = funcionCuadratica3.eval(232.0f);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        java.lang.Object obj19 = funcionCuadratica17.raices();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj24 = funcionCuadratica23.raices();
        boolean boolean25 = funcionCuadratica17.equals(funcionCuadratica23);
        java.lang.String str26 = funcionCuadratica17.toString();
        funcionCuadratica17.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float33 = funcionCuadratica32.getB();
        funcionCuadratica32.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica32.equals(funcionCuadratica39);
        java.lang.Class<?> wildcardClass42 = funcionCuadratica32.getClass();
        boolean boolean43 = funcionCuadratica17.equals(funcionCuadratica32);
        float float45 = funcionCuadratica17.eval((float) (-1L));
        float float47 = funcionCuadratica17.eval(131.0f);
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica17);
        java.lang.String str49 = funcionCuadratica17.toString();
        java.lang.Object obj50 = funcionCuadratica17.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 56143.0f + "'", float13 == 56143.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+100.0x" + "'", str26.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 171610.0f + "'", float47 == 171610.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "10.0x^2" + "'", str49.equals("10.0x^2"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (-0.0f) + "'", obj50.equals((-0.0f)));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test324");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        float float15 = funcionCuadratica3.eval((float) (short) -1);
        float float17 = funcionCuadratica3.eval(8.8604582E8f);
        funcionCuadratica3.setC(1.51930253E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-68.0f) + "'", float15 == (-68.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.512247E19f + "'", float17 == 2.512247E19f);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test325");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1), (-68.0f), (float) 10);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '#', 12.0f, 8.674031E23f);
        funcionCuadratica3.setC(443100.0f);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, 1.0f, 11310.0f);
        funcionCuadratica3.setB(6.8743594E11f);
        float float7 = funcionCuadratica3.eval(60.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 4.1246156E13f + "'", float7 == 4.1246156E13f);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.7757429E22f), 35.0f, 1.57933088E8f);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test329");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) 10);
        funcionCuadratica3.setA(1000.0f);
        java.lang.String str9 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.eval((-2.99996037E10f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1000.0x^2+10.0x+100.0" + "'", str9.equals("1000.0x^2+10.0x+100.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 8.999762E23f + "'", float11 == 8.999762E23f);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) '4');
        funcionCuadratica3.setA(100000.0f);
        funcionCuadratica3.setA(1.7909528E23f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test331");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-5.0163968E8f), 8.6488737E11f, (-224571.0f));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.40576604E11f, (float) 'a', 1.51930253E9f);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-8.543136E20f) + "'", float4 == (-8.543136E20f));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-5.0163968E8f), 6120.0f, 0.0f);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test334");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setA((float) '#');
        float float17 = funcionCuadratica11.getB();
        int int18 = funcionCuadratica11.numRaices();
        funcionCuadratica11.setB((float) (-1L));
        float float21 = funcionCuadratica11.determinante();
        funcionCuadratica11.setB(1.60004E8f);
        boolean boolean24 = funcionCuadratica3.equals(funcionCuadratica11);
        float float25 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(1021.0f);
        try {
            java.lang.Object obj28 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        float float27 = funcionCuadratica20.getA();
        float float28 = funcionCuadratica20.getA();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica20);
        float float30 = funcionCuadratica20.determinante();
        float float31 = funcionCuadratica20.getB();
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica(131.0f, 9999001.0f, (float) '4');
        boolean boolean36 = funcionCuadratica20.equals(funcionCuadratica35);
        float float38 = funcionCuadratica35.eval(9.998104E14f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-39.0f) + "'", float30 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.3095033E32f + "'", float38 == 1.3095033E32f);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test336");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(7.4079805E10f);
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test337");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, (-4000.0f), (-399996.0f));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.9199824E8f + "'", float6 == 1.9199824E8f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.9199824E8f + "'", float7 == 1.9199824E8f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test338");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int15 = funcionCuadratica14.numRaices();
        float float16 = funcionCuadratica14.getB();
        float float17 = funcionCuadratica14.getA();
        float float19 = funcionCuadratica14.eval((float) 1);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica14);
        java.lang.Object obj21 = funcionCuadratica14.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str9.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test340");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5648.0f, 4.0f, (-9.2799074E11f));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.eval(4.1246156E13f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.7012454E28f + "'", float7 == 1.7012454E28f);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (short) 1, 1.62048E8f);
        funcionCuadratica3.setC(10816.0f);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test343");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setC((float) 10);
        float float17 = funcionCuadratica3.getC();
        java.lang.String str18 = funcionCuadratica3.toString();
        float float19 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-1.0303324E35f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(1000.0f);
        funcionCuadratica3.setB(Float.POSITIVE_INFINITY);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        java.lang.Object obj23 = funcionCuadratica21.raices();
        float float24 = funcionCuadratica21.getA();
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        java.lang.Object obj30 = funcionCuadratica28.raices();
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica28.equals(funcionCuadratica34);
        boolean boolean37 = funcionCuadratica21.equals(funcionCuadratica34);
        java.lang.Class<?> wildcardClass38 = funcionCuadratica21.getClass();
        int int39 = funcionCuadratica21.numRaices();
        funcionCuadratica21.setB(100.0f);
        float float42 = funcionCuadratica21.getA();
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica21);
        funcionCuadratica3.setB((-399.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10);
        float float21 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC(34.0f);
        float float17 = funcionCuadratica3.eval(4.538622E37f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + Float.POSITIVE_INFINITY + "'", float17 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, (float) (byte) 100, 2.56012813E17f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(401.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test348");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.String str23 = funcionCuadratica7.toString();
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean28 = funcionCuadratica7.equals(funcionCuadratica27);
        funcionCuadratica27.setB(999899.0f);
        java.lang.String str31 = funcionCuadratica27.toString();
        float float32 = funcionCuadratica27.determinante();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "100.0x^2+999899.0x+10.0" + "'", str31.equals("100.0x^2+999899.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 9.9979801E11f + "'", float32 == 9.9979801E11f);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test349");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getB();
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(52.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test350");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(99901.0f, 1.0354983E7f, 12321.0f);
        float float4 = funcionCuadratica3.determinante();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.07220746E14f + "'", float4 == 1.07220746E14f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "99901.0x^2+1.0354983E7x+12321.0" + "'", str5.equals("99901.0x^2+1.0354983E7x+12321.0"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test351");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.5598853E23f, 0.0f, (-3.9995961E10f));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test352");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(1.0726502E36f);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test353");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        int int14 = funcionCuadratica3.numRaices();
        float float15 = funcionCuadratica3.getB();
        try {
            java.lang.Object obj16 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test354");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica3.setA((-68.0f));
        float float20 = funcionCuadratica3.getC();
        java.lang.Object obj21 = funcionCuadratica3.raices();
        float float22 = funcionCuadratica3.getB();
        float float23 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(210.0f);
        java.lang.Class<?> wildcardClass26 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((-0.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test356");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA((-1.0f));
        float float28 = funcionCuadratica3.getB();
        float float29 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test358");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.String str23 = funcionCuadratica7.toString();
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean28 = funcionCuadratica7.equals(funcionCuadratica27);
        float float30 = funcionCuadratica7.eval((-38799.0f));
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        funcionCuadratica34.setC((float) (byte) 1);
        float float40 = funcionCuadratica34.getA();
        float float41 = funcionCuadratica34.getC();
        java.lang.String str42 = funcionCuadratica34.toString();
        float float43 = funcionCuadratica34.determinante();
        java.lang.Class<?> wildcardClass44 = funcionCuadratica34.getClass();
        float float45 = funcionCuadratica34.getC();
        float float47 = funcionCuadratica34.eval((-4000.0f));
        funcionCuadratica34.setA(100.0f);
        boolean boolean50 = funcionCuadratica7.equals(funcionCuadratica34);
        java.lang.Object obj51 = funcionCuadratica7.raices();
        float float52 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.50924237E9f) + "'", float30 == (-1.50924237E9f));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str42.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-39.0f) + "'", float43 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.60004E8f + "'", float47 == 1.60004E8f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test359");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        funcionCuadratica19.setB((float) (byte) -1);
        funcionCuadratica19.setC((float) (byte) 1);
        float float26 = funcionCuadratica19.eval(1.0f);
        funcionCuadratica19.setA((-39.0f));
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass30 = funcionCuadratica19.getClass();
        funcionCuadratica19.setB(1.00360449E17f);
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float37 = funcionCuadratica36.getB();
        java.lang.Object obj38 = funcionCuadratica36.raices();
        practico5.FuncionCuadratica funcionCuadratica42 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj43 = funcionCuadratica42.raices();
        boolean boolean44 = funcionCuadratica36.equals(funcionCuadratica42);
        java.lang.String str45 = funcionCuadratica36.toString();
        float float46 = funcionCuadratica36.getA();
        int int47 = funcionCuadratica36.numRaices();
        float float48 = funcionCuadratica36.determinante();
        funcionCuadratica36.setB(1.51930253E9f);
        boolean boolean51 = funcionCuadratica19.equals(funcionCuadratica36);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "10.0x^2+100.0x" + "'", str45.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 10000.0f + "'", float48 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-38799.0f), 1000.0f, 1.1121001E7f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.1121001E7f + "'", float4 == 1.1121001E7f);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((-3.0f));
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.62048E8f + "'", float4 == 1.62048E8f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10128.0f + "'", float5 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-4000.0f) + "'", float8 == (-4000.0f));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test362");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getB();
        float float10 = funcionCuadratica3.eval(1.30507776E8f);
        float float11 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((-39.0f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.9457676E20f) + "'", float10 == (-1.9457676E20f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int9 = funcionCuadratica8.numRaices();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica8);
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 10);
        float float17 = funcionCuadratica3.eval(Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals((float) float17, Float.NaN, 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test365");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 2);
        funcionCuadratica3.setC((float) 1L);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float18 = funcionCuadratica17.getB();
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica17);
        funcionCuadratica17.setA(1.9044749E13f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float19 = funcionCuadratica18.determinante();
        float float20 = funcionCuadratica18.getA();
        float float21 = funcionCuadratica18.determinante();
        java.lang.Object obj22 = funcionCuadratica18.raices();
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 401.0f + "'", float19 == 401.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 401.0f + "'", float21 == 401.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 2);
        float float12 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(1.59996412E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test368");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(1.49230656E9f);
        float float18 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test369");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) 10);
        float float19 = funcionCuadratica3.determinante();
        java.lang.String str20 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1276.0f) + "'", float19 == (-1276.0f));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "32.0x^2+2.0x+10.0" + "'", str20.equals("32.0x^2+2.0x+10.0"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test370");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.eval(7.850772E18f);
        funcionCuadratica3.setB(0.0f);
        funcionCuadratica3.setC(1.00219519E12f);
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+10.0x" + "'", str4.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+1.00219519E12" + "'", str12.equals("10.0x^2+1.00219519E12"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getA();
        float float27 = funcionCuadratica20.getA();
        float float28 = funcionCuadratica20.getA();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica20);
        float float30 = funcionCuadratica20.determinante();
        float float31 = funcionCuadratica20.getC();
        int int32 = funcionCuadratica20.numRaices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-39.0f) + "'", float30 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10004.0f, 3.2012794E37f, (float) (-1));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test373");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) 2);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        float float16 = funcionCuadratica3.eval((-38799.0f));
        funcionCuadratica3.setA((-39.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.50536632E10f + "'", float16 == 1.50536632E10f);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test374");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        funcionCuadratica3.setA(121000.0f);
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(3.2012794E37f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "121000.0x^2+2.0x+10128.0" + "'", str7.equals("121000.0x^2+2.0x+10128.0"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test375");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC(999899.0f);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj22 = funcionCuadratica21.raices();
        funcionCuadratica21.setA((-11424.0f));
        java.lang.Class<?> wildcardClass25 = funcionCuadratica21.getClass();
        float float26 = funcionCuadratica21.getB();
        funcionCuadratica21.setA(1141477.0f);
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica21);
        float float30 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 999899.0f + "'", float30 == 999899.0f);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica17.setA(5.0f);
        float float25 = funcionCuadratica17.determinante();
        float float26 = funcionCuadratica17.getB();
        java.lang.Class<?> wildcardClass27 = funcionCuadratica17.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float5 = funcionCuadratica3.eval(9413.0f);
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((-0.0f));
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.8604582E8f + "'", float5 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.70024767E17f, (-4000.0f), 2.0f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test379");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float31 = funcionCuadratica3.eval((float) (-1L));
        float float33 = funcionCuadratica3.eval(131.0f);
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((-4000.0f), 1.60004E8f, (float) (byte) -1);
        boolean boolean38 = funcionCuadratica3.equals(funcionCuadratica37);
        float float39 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(1.60004E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 171610.0f + "'", float33 == 171610.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((-1599983.0f));
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        funcionCuadratica14.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj22 = funcionCuadratica21.raices();
        boolean boolean23 = funcionCuadratica14.equals(funcionCuadratica21);
        float float24 = funcionCuadratica21.getA();
        funcionCuadratica21.setB((-11424.0f));
        float float27 = funcionCuadratica21.getA();
        boolean boolean28 = funcionCuadratica3.equals(funcionCuadratica21);
        float float29 = funcionCuadratica21.getC();
        funcionCuadratica21.setA(5.3940816E16f);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-0.0f) + "'", obj8.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test381");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.eval(9413.0f);
        float float10 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 12216.0f + "'", float7 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 8.9558088E7f + "'", float9 == 8.9558088E7f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 12216.0f + "'", float10 == 12216.0f);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(110.0f);
        float float7 = funcionCuadratica3.getA();
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1.0x^2+2.0x+110.0" + "'", str8.equals("-1.0x^2+2.0x+110.0"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test383");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        int int7 = funcionCuadratica3.numRaices();
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setC(10000.0f);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(6.8743594E11f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test385");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.689414E23f, 1.46422104E11f, 100.0f);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica(1.70024767E17f, (-4000.0f), 2.0f);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.getC();
        float float25 = funcionCuadratica22.getC();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float30 = funcionCuadratica29.getB();
        float float31 = funcionCuadratica29.determinante();
        boolean boolean32 = funcionCuadratica22.equals(funcionCuadratica29);
        boolean boolean33 = funcionCuadratica18.equals(funcionCuadratica29);
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica29);
        java.lang.String str35 = funcionCuadratica29.toString();
        float float36 = funcionCuadratica29.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10000.0f + "'", float31 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10.0x^2+100.0x" + "'", str35.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10000.0f + "'", float36 == 10000.0f);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica3.toString();
        java.lang.Object obj27 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(1.9761783E23f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test388");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.1121001E7f, 1.0072218E35f, 1.007222E34f);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test389");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test390");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(11310.0f, 32.0f, (-68.0f));
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((-1.74107996E10f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-68.0f) + "'", float4 == (-68.0f));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test391");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(34.0f);
        funcionCuadratica3.setB(60.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        float float27 = funcionCuadratica3.eval(10000.0f);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        java.lang.Object obj33 = funcionCuadratica31.raices();
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj38 = funcionCuadratica37.raices();
        boolean boolean39 = funcionCuadratica31.equals(funcionCuadratica37);
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float44 = funcionCuadratica43.getB();
        float float45 = funcionCuadratica43.getC();
        float float46 = funcionCuadratica43.getC();
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        float float52 = funcionCuadratica50.determinante();
        boolean boolean53 = funcionCuadratica43.equals(funcionCuadratica50);
        boolean boolean54 = funcionCuadratica31.equals(funcionCuadratica50);
        funcionCuadratica50.setC(104.0f);
        boolean boolean57 = funcionCuadratica3.equals(funcionCuadratica50);
        float float58 = funcionCuadratica3.determinante();
        float float59 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.00009997E9f + "'", float27 == 1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10000.0f + "'", float52 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test393");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getB();
        float float12 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(1.04000002E12f);
        funcionCuadratica3.setB(1.04000002E12f);
        funcionCuadratica3.setB(3.27513384E17f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 9600.0f + "'", float12 == 9600.0f);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test394");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float17 = funcionCuadratica16.getB();
        float float18 = funcionCuadratica16.getC();
        float float19 = funcionCuadratica16.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        float float25 = funcionCuadratica23.determinante();
        boolean boolean26 = funcionCuadratica16.equals(funcionCuadratica23);
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica16);
        float float28 = funcionCuadratica16.getC();
        java.lang.Class<?> wildcardClass29 = funcionCuadratica16.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10000.0f + "'", float25 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica10.getClass();
        funcionCuadratica10.setC(1.628176E7f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) 1L);
        float float14 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.8902726E23f);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica(10.0f, (float) (-1), (float) 10L);
        funcionCuadratica20.setA(100.0f);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica20);
        float float25 = funcionCuadratica3.eval(2.62250596E16f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + Float.POSITIVE_INFINITY + "'", float25 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getA();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        float float12 = funcionCuadratica3.determinante();
        float float13 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6120.0f + "'", float10 == 6120.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 6120.0f + "'", float12 == 6120.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(3.0313594E21f, 9.999992E7f, 104.0f);
        funcionCuadratica3.setB(9.996025E28f);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test399");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 10);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        funcionCuadratica10.setB((float) 10L);
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str16 = funcionCuadratica10.toString();
        funcionCuadratica10.setA((float) 100L);
        int int19 = funcionCuadratica10.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+10.0x" + "'", str16.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        float float10 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        funcionCuadratica14.setB((float) (byte) -1);
        funcionCuadratica14.setC((float) (byte) 1);
        float float20 = funcionCuadratica14.getA();
        java.lang.String str21 = funcionCuadratica14.toString();
        float float22 = funcionCuadratica14.getC();
        float float23 = funcionCuadratica14.getB();
        float float25 = funcionCuadratica14.eval((float) '#');
        float float26 = funcionCuadratica14.determinante();
        funcionCuadratica14.setB((float) 2);
        float float29 = funcionCuadratica14.getC();
        java.lang.String str30 = funcionCuadratica14.toString();
        float float32 = funcionCuadratica14.eval(1.00180056E8f);
        boolean boolean33 = funcionCuadratica3.equals(funcionCuadratica14);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str21.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 12216.0f + "'", float25 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-39.0f) + "'", float26 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str30.equals("10.0x^2+2.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.00360441E17f + "'", float32 == 1.00360441E17f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test401");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(262190.0f, (-152.0f), 32.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        funcionCuadratica7.setB((float) (byte) -1);
        funcionCuadratica7.setC((float) (byte) 1);
        float float13 = funcionCuadratica7.getA();
        java.lang.String str14 = funcionCuadratica7.toString();
        float float15 = funcionCuadratica7.getC();
        float float16 = funcionCuadratica7.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica20.setA((float) (byte) -1);
        funcionCuadratica20.setC((float) 0);
        java.lang.Class<?> wildcardClass25 = funcionCuadratica20.getClass();
        boolean boolean26 = funcionCuadratica7.equals(funcionCuadratica20);
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica7);
        float float29 = funcionCuadratica3.eval((float) 1);
        funcionCuadratica3.setA((-11424.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str14.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 262070.0f + "'", float29 == 262070.0f);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test402");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(10816.0f);
        funcionCuadratica3.setA(10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.getB();
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(443100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(11310.0f, 32.0f, (-68.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "11310.0x^2+32.0x+-68.0" + "'", str4.equals("11310.0x^2+32.0x+-68.0"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test405");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getA();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) (short) -1);
        float float14 = funcionCuadratica3.eval(4.22409984E8f);
        float float15 = funcionCuadratica3.getC();
        int int16 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.78430156E17f) + "'", float14 == (-1.78430156E17f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        float float13 = funcionCuadratica10.getA();
        float float14 = funcionCuadratica10.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test407");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float31 = funcionCuadratica3.eval((float) (-1L));
        funcionCuadratica3.setA(10004.0f);
        funcionCuadratica3.setB(1.0002001E18f);
        funcionCuadratica3.setC(6.554256E34f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test408");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = null;
        try {
            boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test409");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(131.0f);
        float float10 = funcionCuadratica3.eval(10000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.00100013E9f + "'", float10 == 1.00100013E9f);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test410");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float28 = funcionCuadratica3.eval(10128.0f);
        java.lang.Object obj29 = funcionCuadratica3.raices();
        float float30 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.02677664E9f + "'", float28 == 1.02677664E9f);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test411");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        java.lang.Object obj16 = funcionCuadratica3.raices();
        int int17 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(110.0f);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test413");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        float float23 = funcionCuadratica17.getC();
        float float24 = funcionCuadratica17.getC();
        java.lang.Object obj25 = funcionCuadratica17.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        funcionCuadratica3.setC(2.5758312E33f);
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        funcionCuadratica35.setB((float) (byte) -1);
        funcionCuadratica35.setC((float) (byte) 1);
        float float41 = funcionCuadratica35.getA();
        float float42 = funcionCuadratica35.getC();
        java.lang.String str43 = funcionCuadratica35.toString();
        float float44 = funcionCuadratica35.determinante();
        funcionCuadratica35.setB((-1.0f));
        java.lang.String str47 = funcionCuadratica35.toString();
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica35);
        float float50 = funcionCuadratica35.eval(12321.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str43.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-39.0f) + "'", float44 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str47.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.51805811E9f + "'", float50 == 1.51805811E9f);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, 2.9451708E11f, 210.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int8 = funcionCuadratica7.numRaices();
        float float9 = funcionCuadratica7.getB();
        float float10 = funcionCuadratica7.getA();
        float float12 = funcionCuadratica7.eval((float) 1);
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int18 = funcionCuadratica17.numRaices();
        float float19 = funcionCuadratica17.getC();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica17.getClass();
        float float21 = funcionCuadratica17.getB();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        float float27 = funcionCuadratica25.getC();
        float float28 = funcionCuadratica25.getB();
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica32.setA((float) (byte) -1);
        funcionCuadratica32.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        funcionCuadratica40.setB((float) (byte) -1);
        funcionCuadratica40.setC((float) (byte) 1);
        boolean boolean46 = funcionCuadratica32.equals(funcionCuadratica40);
        boolean boolean47 = funcionCuadratica25.equals(funcionCuadratica32);
        java.lang.String str48 = funcionCuadratica25.toString();
        java.lang.Object obj49 = funcionCuadratica25.raices();
        java.lang.String str50 = funcionCuadratica25.toString();
        float float51 = funcionCuadratica25.determinante();
        float float52 = funcionCuadratica25.getC();
        boolean boolean53 = funcionCuadratica17.equals(funcionCuadratica25);
        boolean boolean54 = funcionCuadratica3.equals(funcionCuadratica25);
        int int55 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "10.0x^2+10.0x" + "'", str48.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "10.0x^2+10.0x" + "'", str50.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test418");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Class<?> wildcardClass9 = obj7.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(2.5598853E23f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test420");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(199.0f, 2.8908421E35f, (-1276.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(4.9065876E9f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "199.0x^2+2.8908421E35x+-1276.0" + "'", str4.equals("199.0x^2+2.8908421E35x+-1276.0"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test421");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        float float9 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.getB();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        float float12 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test422");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica3.toString();
        java.lang.Object obj27 = funcionCuadratica3.raices();
        java.lang.String str28 = funcionCuadratica3.toString();
        float float29 = funcionCuadratica3.getC();
        float float30 = funcionCuadratica3.determinante();
        float float31 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(0.0f);
        float float34 = funcionCuadratica3.getB();
        java.lang.String str35 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+10.0x" + "'", str28.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10.0x^2" + "'", str35.equals("10.0x^2"));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getA();
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+100.0x" + "'", str8.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-68.0f), (float) (byte) 100, Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0726502E36f, 1.5295916E32f, 0.0f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        float float21 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        float float27 = funcionCuadratica25.getC();
        float float28 = funcionCuadratica25.getC();
        float float29 = funcionCuadratica25.getB();
        boolean boolean30 = funcionCuadratica19.equals(funcionCuadratica25);
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        funcionCuadratica35.setB((float) (byte) -1);
        funcionCuadratica35.setC((float) (byte) 1);
        float float42 = funcionCuadratica35.eval(1.0f);
        funcionCuadratica35.setA((-39.0f));
        funcionCuadratica35.setC((float) 1);
        float float47 = funcionCuadratica35.determinante();
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica35);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 157.0f + "'", float47 == 157.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test427");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getB();
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(9.9969027E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str12 = funcionCuadratica11.toString();
        float float13 = funcionCuadratica11.getA();
        int int14 = funcionCuadratica11.numRaices();
        int int15 = funcionCuadratica11.numRaices();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str12.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica10.setB(104.0f);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        java.lang.Object obj30 = funcionCuadratica28.raices();
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica28.equals(funcionCuadratica34);
        java.lang.String str37 = funcionCuadratica28.toString();
        float float39 = funcionCuadratica28.eval(1.30393536E8f);
        boolean boolean40 = funcionCuadratica10.equals(funcionCuadratica28);
        int int41 = funcionCuadratica10.numRaices();
        funcionCuadratica10.setA((float) 100L);
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float48 = funcionCuadratica47.getB();
        float float49 = funcionCuadratica47.getC();
        float float50 = funcionCuadratica47.getA();
        practico5.FuncionCuadratica funcionCuadratica54 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj55 = funcionCuadratica54.raices();
        boolean boolean56 = funcionCuadratica47.equals(funcionCuadratica54);
        java.lang.Class<?> wildcardClass57 = funcionCuadratica54.getClass();
        int int58 = funcionCuadratica54.numRaices();
        float float59 = funcionCuadratica54.getB();
        float float60 = funcionCuadratica54.getA();
        float float61 = funcionCuadratica54.getA();
        boolean boolean62 = funcionCuadratica10.equals(funcionCuadratica54);
        float float64 = funcionCuadratica10.eval((-4.159E7f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "10.0x^2+100.0x" + "'", str37.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.70024767E17f + "'", float39 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 10.0f + "'", float50 == 10.0f);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 10.0f + "'", float59 == 10.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 10.0f + "'", float60 == 10.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 10.0f + "'", float61 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 1.72972816E17f + "'", float64 == 1.72972816E17f);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        float float31 = funcionCuadratica3.eval((float) (-1L));
        float float32 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass33 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        int int16 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB((float) (short) 10);
        int int19 = funcionCuadratica3.numRaices();
        java.lang.Object obj20 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.getB();
        java.lang.Object obj22 = funcionCuadratica3.raices();
        int int23 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        java.lang.String str14 = funcionCuadratica3.toString();
        float float15 = funcionCuadratica3.getC();
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+401.0x+1.0" + "'", str14.equals("10.0x^2+401.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 401.0f + "'", float16 == 401.0f);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test433");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.1121001E7f, 2.0f, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica(5.0f, 2.56012813E17f, 9.9979908E12f);
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica13);
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test435");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (short) 1, 1.62048E8f);
        int int4 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        funcionCuadratica8.setC((float) 0);
        java.lang.Object obj13 = funcionCuadratica8.raices();
        java.lang.Object obj14 = funcionCuadratica8.raices();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica8);
        java.lang.String str16 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+1.0x+1.62048E8" + "'", str16.equals("10.0x^2+1.0x+1.62048E8"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.7012454E28f, 52.0f, 15610.0f);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.String str23 = funcionCuadratica7.toString();
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean28 = funcionCuadratica7.equals(funcionCuadratica27);
        float float29 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+100.0x" + "'", str7.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getB();
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (short) 10);
        int int15 = funcionCuadratica3.numRaices();
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35.0x^2+-1.0x" + "'", str12.equals("35.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        funcionCuadratica17.setB((float) (byte) -1);
        funcionCuadratica17.setC((float) (byte) 1);
        float float23 = funcionCuadratica17.getA();
        java.lang.String str24 = funcionCuadratica17.toString();
        boolean boolean25 = funcionCuadratica9.equals(funcionCuadratica17);
        funcionCuadratica17.setB(1.30393536E8f);
        float float28 = funcionCuadratica17.determinante();
        float float29 = funcionCuadratica17.determinante();
        float float30 = funcionCuadratica17.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str24.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.70024741E16f + "'", float28 == 1.70024741E16f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.70024741E16f + "'", float29 == 1.70024741E16f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getB();
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (short) 10);
        int int15 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(1.46410004E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35.0x^2+-1.0x" + "'", str12.equals("35.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 2);
        float float18 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(6120.0f);
        float float22 = funcionCuadratica3.eval(1.52190226E13f);
        java.lang.String str23 = funcionCuadratica3.toString();
        float float24 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.3161865E27f + "'", float22 == 2.3161865E27f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+6120.0x+1.0" + "'", str23.equals("10.0x^2+6120.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 6120.0f + "'", float24 == 6120.0f);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test444");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100.0f, (float) (short) 0, (float) '4');
        funcionCuadratica3.setB((float) (short) 1);
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100.0x^2+1.0x+52.0" + "'", str6.equals("100.0x^2+1.0x+52.0"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getC();
        java.lang.String str8 = funcionCuadratica3.toString();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        int int11 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setC((float) 10);
        float float17 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) 'a');
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((-1.16882259E14f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica22.getA();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        java.lang.Object obj33 = funcionCuadratica31.raices();
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj38 = funcionCuadratica37.raices();
        boolean boolean39 = funcionCuadratica31.equals(funcionCuadratica37);
        java.lang.String str40 = funcionCuadratica31.toString();
        float float42 = funcionCuadratica31.eval(1.30393536E8f);
        java.lang.Object obj43 = funcionCuadratica31.raices();
        boolean boolean44 = funcionCuadratica22.equals(funcionCuadratica31);
        float float45 = funcionCuadratica22.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "10.0x^2+100.0x" + "'", str40.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.70024767E17f + "'", float42 == 1.70024767E17f);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA((-1.0f));
        float float12 = funcionCuadratica3.getC();
        java.lang.Object obj13 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399996.0f), 5.9375327E18f, 12321.0f);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(23.0f);
        funcionCuadratica3.setA(99901.0f);
        float float13 = funcionCuadratica3.getC();
        float float14 = funcionCuadratica3.getA();
        java.lang.String str15 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 99901.0f + "'", float14 == 99901.0f);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "99901.0x^2+23.0x" + "'", str15.equals("99901.0x^2+23.0x"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test451");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        int int15 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.getB();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-0.0f) + "'", obj18.equals((-0.0f)));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test452");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float11 = funcionCuadratica9.eval(0.0f);
        funcionCuadratica9.setB((float) 100L);
        funcionCuadratica9.setC((float) 1);
        java.lang.Object obj16 = funcionCuadratica9.raices();
        java.lang.String str17 = funcionCuadratica9.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica9);
        float float19 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 401.0f + "'", float5 == 401.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x+1.0" + "'", str17.equals("10.0x^2+100.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 401.0f + "'", float19 == 401.0f);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        funcionCuadratica17.setB((float) (byte) -1);
        funcionCuadratica17.setC((float) (byte) 1);
        float float23 = funcionCuadratica17.getA();
        java.lang.String str24 = funcionCuadratica17.toString();
        boolean boolean25 = funcionCuadratica9.equals(funcionCuadratica17);
        float float26 = funcionCuadratica9.getA();
        float float27 = funcionCuadratica9.getB();
        float float29 = funcionCuadratica9.eval(2.56012813E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str24.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 6.5542563E35f + "'", float29 == 6.5542563E35f);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test454");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        int int14 = funcionCuadratica10.numRaices();
        float float15 = funcionCuadratica10.getB();
        float float16 = funcionCuadratica10.getA();
        funcionCuadratica10.setC(0.0f);
        funcionCuadratica10.setA(11310.0f);
        funcionCuadratica10.setC(110.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        float float28 = funcionCuadratica26.determinante();
        funcionCuadratica26.setB((float) 10L);
        funcionCuadratica26.setA((float) 1);
        funcionCuadratica26.setC((float) (byte) -1);
        float float35 = funcionCuadratica26.getC();
        java.lang.Class<?> wildcardClass36 = funcionCuadratica26.getClass();
        boolean boolean37 = funcionCuadratica7.equals(funcionCuadratica26);
        java.lang.String str38 = funcionCuadratica26.toString();
        funcionCuadratica26.setC(5.6987436E7f);
        funcionCuadratica26.setA(1.46422104E11f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str38.equals("1.0x^2+10.0x+-1.0"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.eval(262190.0f);
        float float11 = funcionCuadratica3.eval(1.0072218E35f);
        java.lang.Object obj12 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 6.8743594E11f + "'", float9 == 6.8743594E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + Float.POSITIVE_INFINITY + "'", float11 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-0.0f) + "'", obj12.equals((-0.0f)));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test457");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(97.0f);
        int int18 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(1.00219518E13f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test458");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test459");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA((-152.0f));
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.eval(1.30393536E8f);
        float float11 = funcionCuadratica3.determinante();
        float float12 = funcionCuadratica3.getB();
        java.lang.String str13 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(10128.0f);
        float float16 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+100.0x" + "'", str13.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test461");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        float float14 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA((-1.0f));
        float float17 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(1.04000002E12f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test462");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.eval(1.30393536E8f);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        float float21 = funcionCuadratica19.determinante();
        funcionCuadratica19.setB((float) 10L);
        funcionCuadratica19.setA((float) 1);
        funcionCuadratica19.setC((float) (byte) -1);
        float float28 = funcionCuadratica19.getC();
        float float29 = funcionCuadratica19.getA();
        funcionCuadratica19.setB((float) (short) -1);
        funcionCuadratica19.setB((float) 1L);
        funcionCuadratica19.setC((float) 0L);
        boolean boolean36 = funcionCuadratica3.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj41 = funcionCuadratica40.raices();
        java.lang.String str42 = funcionCuadratica40.toString();
        java.lang.Object obj43 = funcionCuadratica40.raices();
        funcionCuadratica40.setC(97.0f);
        float float46 = funcionCuadratica40.getB();
        float float48 = funcionCuadratica40.eval(9.9980119E13f);
        boolean boolean49 = funcionCuadratica3.equals(funcionCuadratica40);
        practico5.FuncionCuadratica funcionCuadratica53 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float54 = funcionCuadratica53.getB();
        float float55 = funcionCuadratica53.getC();
        float float56 = funcionCuadratica53.getC();
        practico5.FuncionCuadratica funcionCuadratica60 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float61 = funcionCuadratica60.getB();
        float float62 = funcionCuadratica60.determinante();
        boolean boolean63 = funcionCuadratica53.equals(funcionCuadratica60);
        practico5.FuncionCuadratica funcionCuadratica67 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float68 = funcionCuadratica67.getB();
        float float69 = funcionCuadratica67.determinante();
        funcionCuadratica67.setB((float) 10L);
        boolean boolean72 = funcionCuadratica60.equals(funcionCuadratica67);
        funcionCuadratica60.setB(104.0f);
        practico5.FuncionCuadratica funcionCuadratica78 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float79 = funcionCuadratica78.getB();
        java.lang.Object obj80 = funcionCuadratica78.raices();
        practico5.FuncionCuadratica funcionCuadratica84 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj85 = funcionCuadratica84.raices();
        boolean boolean86 = funcionCuadratica78.equals(funcionCuadratica84);
        java.lang.String str87 = funcionCuadratica78.toString();
        float float89 = funcionCuadratica78.eval(1.30393536E8f);
        boolean boolean90 = funcionCuadratica60.equals(funcionCuadratica78);
        int int91 = funcionCuadratica78.numRaices();
        boolean boolean92 = funcionCuadratica40.equals(funcionCuadratica78);
        funcionCuadratica78.setA(2.92205652E12f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.70024767E17f + "'", float14 == 1.70024767E17f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10000.0f + "'", float21 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x" + "'", str42.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 9.996025E28f + "'", float48 == 9.996025E28f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 100.0f + "'", float54 == 100.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 10000.0f + "'", float62 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 100.0f + "'", float68 == 100.0f);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 10000.0f + "'", float69 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 100.0f + "'", float79 == 100.0f);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "10.0x^2+100.0x" + "'", str87.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 1.70024767E17f + "'", float89 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 5.3940816E16f, 1.51930253E9f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.51930253E9f + "'", float4 == 1.51930253E9f);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test464");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica15);
        int int17 = funcionCuadratica3.numRaices();
        float float18 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 104.0f + "'", float18 == 104.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        float float19 = funcionCuadratica17.determinante();
        funcionCuadratica17.setB((float) 10L);
        boolean boolean22 = funcionCuadratica10.equals(funcionCuadratica17);
        funcionCuadratica10.setB(104.0f);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        java.lang.Object obj30 = funcionCuadratica28.raices();
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica28.equals(funcionCuadratica34);
        java.lang.String str37 = funcionCuadratica28.toString();
        float float39 = funcionCuadratica28.eval(1.30393536E8f);
        boolean boolean40 = funcionCuadratica10.equals(funcionCuadratica28);
        int int41 = funcionCuadratica28.numRaices();
        float float42 = funcionCuadratica28.getC();
        java.lang.Class<?> wildcardClass43 = funcionCuadratica28.getClass();
        funcionCuadratica28.setC((-1.26785096E8f));
        java.lang.String str46 = funcionCuadratica28.toString();
        funcionCuadratica28.setC((-11424.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "10.0x^2+100.0x" + "'", str37.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.70024767E17f + "'", float39 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "10.0x^2+100.0x+-1.26785096E8" + "'", str46.equals("10.0x^2+100.0x+-1.26785096E8"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.getC();
        float float18 = funcionCuadratica15.getC();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica22);
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setB(1.00180056E8f);
        java.lang.Class<?> wildcardClass31 = funcionCuadratica3.getClass();
        float float32 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.00360436E16f + "'", float32 == 1.00360436E16f);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float5 = funcionCuadratica3.eval((float) 0);
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((-399996.0f));
        float float9 = funcionCuadratica3.getC();
        try {
            java.lang.Object obj10 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test468");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(157.0f, 34.0f, (float) (short) 1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test469");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj12 = funcionCuadratica11.raices();
        float float13 = funcionCuadratica11.getC();
        float float14 = funcionCuadratica11.getB();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica18.setA((float) (byte) -1);
        funcionCuadratica18.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        boolean boolean32 = funcionCuadratica18.equals(funcionCuadratica26);
        boolean boolean33 = funcionCuadratica11.equals(funcionCuadratica18);
        float float35 = funcionCuadratica11.eval(10000.0f);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float40 = funcionCuadratica39.getB();
        java.lang.Object obj41 = funcionCuadratica39.raices();
        practico5.FuncionCuadratica funcionCuadratica45 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj46 = funcionCuadratica45.raices();
        boolean boolean47 = funcionCuadratica39.equals(funcionCuadratica45);
        practico5.FuncionCuadratica funcionCuadratica51 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float52 = funcionCuadratica51.getB();
        float float53 = funcionCuadratica51.getC();
        float float54 = funcionCuadratica51.getC();
        practico5.FuncionCuadratica funcionCuadratica58 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float59 = funcionCuadratica58.getB();
        float float60 = funcionCuadratica58.determinante();
        boolean boolean61 = funcionCuadratica51.equals(funcionCuadratica58);
        boolean boolean62 = funcionCuadratica39.equals(funcionCuadratica58);
        funcionCuadratica58.setC(104.0f);
        boolean boolean65 = funcionCuadratica11.equals(funcionCuadratica58);
        boolean boolean66 = funcionCuadratica3.equals(funcionCuadratica11);
        float float67 = funcionCuadratica11.getC();
        practico5.FuncionCuadratica funcionCuadratica71 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float72 = funcionCuadratica71.getB();
        float float73 = funcionCuadratica71.determinante();
        funcionCuadratica71.setB((float) 10L);
        funcionCuadratica71.setA((float) 1);
        funcionCuadratica71.setA((float) '#');
        float float80 = funcionCuadratica71.getB();
        java.lang.Object obj81 = funcionCuadratica71.raices();
        float float82 = funcionCuadratica71.getB();
        boolean boolean83 = funcionCuadratica11.equals(funcionCuadratica71);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.00009997E9f + "'", float35 == 1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 10000.0f + "'", float60 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 100.0f + "'", float72 == 100.0f);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 10000.0f + "'", float73 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 10.0f + "'", float80 == 10.0f);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 10.0f + "'", float82 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getB();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "35.0x^2+-1.0x" + "'", str11.equals("35.0x^2+-1.0x"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test471");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        funcionCuadratica3.setA(131.0f);
        int int10 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test472");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test473");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-387.0f), (float) 0, 2.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica(1.00180056E8f, 1.04000002E12f, 2000.0f);
        int int8 = funcionCuadratica7.numRaices();
        boolean boolean9 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica3.setC(12.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test474");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setC((float) 10);
        float float17 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(262190.0f);
        float float20 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(155211.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test475");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100, (-1.50924237E9f), 32.0f);
        float float4 = funcionCuadratica3.getA();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0x^2+-1.50924237E9x+32.0" + "'", str5.equals("100.0x^2+-1.50924237E9x+32.0"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        funcionCuadratica19.setB((float) (byte) -1);
        funcionCuadratica19.setC((float) (byte) 1);
        float float26 = funcionCuadratica19.eval(1.0f);
        funcionCuadratica19.setA((-39.0f));
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass30 = funcionCuadratica19.getClass();
        funcionCuadratica19.setB(1.00360449E17f);
        float float33 = funcionCuadratica19.getC();
        int int34 = funcionCuadratica19.numRaices();
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica(2.92205101E12f, (float) (byte) 100, 2.56012813E17f);
        float float39 = funcionCuadratica38.getB();
        float float41 = funcionCuadratica38.eval(32.0f);
        boolean boolean42 = funcionCuadratica19.equals(funcionCuadratica38);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 2.59004996E17f + "'", float41 == 2.59004996E17f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test477");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica18.getClass();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica18);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        java.lang.String str42 = funcionCuadratica33.toString();
        funcionCuadratica33.setB(0.0f);
        float float45 = funcionCuadratica33.determinante();
        boolean boolean46 = funcionCuadratica3.equals(funcionCuadratica33);
        float float47 = funcionCuadratica3.getC();
        float float48 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(2.59004996E17f);
        float float51 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x" + "'", str42.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 10.0f + "'", float48 == 10.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.03602E19f) + "'", float51 == (-1.03602E19f));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(8.6488737E11f);
        float float11 = funcionCuadratica3.eval(1.52189115E13f);
        int int12 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(7.4079805E10f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x" + "'", str7.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0032112E38f + "'", float11 == 2.0032112E38f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test479");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        float float16 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        funcionCuadratica20.setB((float) (byte) -1);
        funcionCuadratica20.setC((float) (byte) 1);
        float float26 = funcionCuadratica20.getB();
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica20);
        funcionCuadratica3.setB(100000.0f);
        float float31 = funcionCuadratica3.eval(110.0f);
        float float33 = funcionCuadratica3.eval(1.09791189E12f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.1121001E7f + "'", float31 == 1.1121001E7f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.2054106E25f + "'", float33 == 1.2054106E25f);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test480");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        funcionCuadratica10.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        boolean boolean24 = funcionCuadratica10.equals(funcionCuadratica18);
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str26 = funcionCuadratica3.toString();
        java.lang.Object obj27 = funcionCuadratica3.raices();
        java.lang.String str28 = funcionCuadratica3.toString();
        float float29 = funcionCuadratica3.getC();
        float float30 = funcionCuadratica3.determinante();
        java.lang.String str31 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(1.3095033E32f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+10.0x" + "'", str28.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10.0x^2+10.0x" + "'", str31.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(1000.0f);
        funcionCuadratica3.setB(Float.POSITIVE_INFINITY);
        java.lang.Object obj18 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(1.02576384E8f);
        practico5.FuncionCuadratica funcionCuadratica21 = null;
        try {
            boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test482");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 232.0f, 2000.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int9 = funcionCuadratica8.numRaices();
        java.lang.Object obj10 = funcionCuadratica8.raices();
        int int11 = funcionCuadratica8.numRaices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica8);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.0x^2+232.0x+2000.0" + "'", str4.equals("2.0x^2+232.0x+2000.0"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        boolean boolean21 = funcionCuadratica7.equals(funcionCuadratica15);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica7);
        int int23 = funcionCuadratica7.numRaices();
        java.lang.String str24 = funcionCuadratica7.toString();
        funcionCuadratica7.setA((-3.9995961E10f));
        funcionCuadratica7.setA(9506.0f);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float33 = funcionCuadratica32.getB();
        float float34 = funcionCuadratica32.getC();
        float float35 = funcionCuadratica32.getA();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica32.equals(funcionCuadratica39);
        java.lang.Class<?> wildcardClass42 = funcionCuadratica39.getClass();
        int int43 = funcionCuadratica39.numRaices();
        float float44 = funcionCuadratica39.getB();
        float float45 = funcionCuadratica39.getA();
        funcionCuadratica39.setC(0.0f);
        funcionCuadratica39.setA(12321.0f);
        boolean boolean50 = funcionCuadratica7.equals(funcionCuadratica39);
        float float52 = funcionCuadratica7.eval(6000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-1.0x^2+100.0x" + "'", str24.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 3.42216606E11f + "'", float52 == 3.42216606E11f);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test484");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-5.0163968E8f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00722185E36f, 8.9558088E7f, 1.59996412E11f);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(12321.0f, 104.0f, 262190.0f);
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 104.0f + "'", float4 == 104.0f);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(401.0f, (-4.4474004E7f), 540560.0f);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test488");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.eval((float) 100);
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        float float19 = funcionCuadratica3.determinante();
        float float20 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(Float.POSITIVE_INFINITY);
        float float23 = funcionCuadratica3.getA();
        float float24 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + Float.POSITIVE_INFINITY + "'", float24 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setC(110.0f);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica(1.0f, 10128.0f, 401.0f);
        funcionCuadratica20.setC((float) 1L);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica20);
        float float24 = funcionCuadratica20.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.02576384E8f + "'", float24 == 1.02576384E8f);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) 1L);
        float float14 = funcionCuadratica3.getC();
        float float15 = funcionCuadratica3.getB();
        int int16 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica10.raices();
        java.lang.String str14 = funcionCuadratica10.toString();
        java.lang.String str15 = funcionCuadratica10.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+10.0x" + "'", str14.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+10.0x" + "'", str15.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(99901.0f, 1.0354983E7f, 12321.0f);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) (byte) 1, (-4000.0f), (float) ' ');
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.07220746E14f + "'", float4 == 1.07220746E14f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 99901.0f + "'", float5 == 99901.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-4000.0f) + "'", float11 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.5999872E7f + "'", float12 == 1.5999872E7f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test493");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float13 = funcionCuadratica3.eval(232.0f);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        java.lang.Object obj19 = funcionCuadratica17.raices();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj24 = funcionCuadratica23.raices();
        boolean boolean25 = funcionCuadratica17.equals(funcionCuadratica23);
        java.lang.String str26 = funcionCuadratica17.toString();
        funcionCuadratica17.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float33 = funcionCuadratica32.getB();
        funcionCuadratica32.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica32.equals(funcionCuadratica39);
        java.lang.Class<?> wildcardClass42 = funcionCuadratica32.getClass();
        boolean boolean43 = funcionCuadratica17.equals(funcionCuadratica32);
        float float45 = funcionCuadratica17.eval((float) (-1L));
        float float47 = funcionCuadratica17.eval(131.0f);
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica17);
        funcionCuadratica3.setA(262190.0f);
        java.lang.String str51 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        funcionCuadratica3.setC(1.880975E22f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 56143.0f + "'", float13 == 56143.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+100.0x" + "'", str26.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 171610.0f + "'", float47 == 171610.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "262190.0x^2+10.0x+-1.0" + "'", str51.equals("262190.0x^2+10.0x+-1.0"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.getC();
        float float12 = funcionCuadratica9.getC();
        float float13 = funcionCuadratica9.getB();
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.Object obj15 = funcionCuadratica9.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        float float15 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(8.8604582E8f);
        java.lang.String str21 = funcionCuadratica3.toString();
        java.lang.String str22 = funcionCuadratica3.toString();
        float float23 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float28 = funcionCuadratica27.getB();
        float float29 = funcionCuadratica27.getC();
        float float30 = funcionCuadratica27.getC();
        java.lang.Object obj31 = funcionCuadratica27.raices();
        float float32 = funcionCuadratica27.getC();
        int int33 = funcionCuadratica27.numRaices();
        float float35 = funcionCuadratica27.eval((float) (byte) 10);
        java.lang.Class<?> wildcardClass36 = funcionCuadratica27.getClass();
        boolean boolean37 = funcionCuadratica3.equals(funcionCuadratica27);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+-1.0x+8.8604582E8" + "'", str21.equals("10.0x^2+-1.0x+8.8604582E8"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+-1.0x+8.8604582E8" + "'", str22.equals("10.0x^2+-1.0x+8.8604582E8"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 8.8604582E8f + "'", float23 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 2000.0f + "'", float35 == 2000.0f);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.eval(1000.0f);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float20 = funcionCuadratica19.getB();
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        funcionCuadratica25.setB((float) (byte) -1);
        funcionCuadratica25.setA((float) '#');
        float float31 = funcionCuadratica25.getB();
        int int32 = funcionCuadratica25.numRaices();
        funcionCuadratica25.setB((float) (-1L));
        float float35 = funcionCuadratica25.getC();
        boolean boolean36 = funcionCuadratica3.equals(funcionCuadratica25);
        float float37 = funcionCuadratica25.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, 232.0f, 2.56012813E17f);
        funcionCuadratica3.setB(10040.0f);
        float float6 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.56012813E17f + "'", float6 == 2.56012813E17f);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test498");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        float float18 = funcionCuadratica3.eval((float) (byte) 1);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        java.lang.Object obj20 = funcionCuadratica3.raices();
        float float22 = funcionCuadratica3.eval(443100.0f);
        java.lang.String str23 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 6.2828482E12f + "'", float22 == 6.2828482E12f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str23.equals("32.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(132000.0f, 100.0f, (-800.0f));
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(11310.0f);
        funcionCuadratica3.setC(9413.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test500");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.eval((float) (byte) 10);
        int int12 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2000.0f + "'", float11 == 2000.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

