package practico5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(1.04000002E12f);
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) (short) 10);
        funcionCuadratica3.setB(3.0360044E23f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
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
        java.lang.String str30 = funcionCuadratica20.toString();
        float float31 = funcionCuadratica20.getA();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str30.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setC((float) (byte) 10);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        float float17 = funcionCuadratica15.determinante();
        funcionCuadratica15.setB((float) 10L);
        float float20 = funcionCuadratica15.getC();
        funcionCuadratica15.setB(1.00009997E9f);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica15);
        practico5.FuncionCuadratica funcionCuadratica24 = null;
        try {
            boolean boolean25 = funcionCuadratica15.equals(funcionCuadratica24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10000.0f + "'", float17 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
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
        java.lang.Class<?> wildcardClass49 = funcionCuadratica26.getClass();
        try {
            java.lang.Object obj50 = funcionCuadratica26.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float9 = funcionCuadratica8.getB();
        float float10 = funcionCuadratica8.determinante();
        funcionCuadratica8.setB((float) 10L);
        funcionCuadratica8.setA((float) 1);
        funcionCuadratica8.setC((float) (byte) -1);
        float float17 = funcionCuadratica8.getC();
        float float18 = funcionCuadratica8.getA();
        funcionCuadratica8.setB((float) (short) -1);
        funcionCuadratica8.setB((float) 1L);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float28 = funcionCuadratica27.getB();
        funcionCuadratica27.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica27.equals(funcionCuadratica34);
        java.lang.Object obj37 = funcionCuadratica27.raices();
        funcionCuadratica27.setC(0.0f);
        funcionCuadratica27.setC(999899.0f);
        boolean boolean42 = funcionCuadratica3.equals(funcionCuadratica27);
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int47 = funcionCuadratica46.numRaices();
        practico5.FuncionCuadratica funcionCuadratica51 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float52 = funcionCuadratica51.getB();
        float float53 = funcionCuadratica51.determinante();
        funcionCuadratica51.setB((float) 10L);
        funcionCuadratica51.setA((float) 1);
        funcionCuadratica51.setC((float) (byte) -1);
        float float60 = funcionCuadratica51.getC();
        float float61 = funcionCuadratica51.getA();
        funcionCuadratica51.setB((float) (short) -1);
        funcionCuadratica51.setB((float) 1L);
        boolean boolean66 = funcionCuadratica46.equals(funcionCuadratica51);
        boolean boolean67 = funcionCuadratica27.equals(funcionCuadratica51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 10000.0f + "'", float53 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + (-1.0f) + "'", float60 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
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
        float float20 = funcionCuadratica3.getA();
        float float21 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-387.0f) + "'", float21 == (-387.0f));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
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
        java.lang.String str23 = funcionCuadratica10.toString();
        funcionCuadratica10.setB(34.0f);
        funcionCuadratica10.setC(1.09791189E12f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+100.0x" + "'", str23.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        java.lang.Object obj18 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.40576604E11f, (float) 'a', 1.51930253E9f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        funcionCuadratica3.setA(132000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
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
        funcionCuadratica10.setB(99.0f);
        funcionCuadratica10.setA(8.538379E25f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
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
        float float28 = funcionCuadratica20.getC();
        funcionCuadratica20.setA(1.00009997E9f);
        funcionCuadratica20.setA(32.0f);
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
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
        float float40 = funcionCuadratica26.eval(15610.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str38.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 2.43828192E8f + "'", float40 == 2.43828192E8f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
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
        funcionCuadratica3.setA(1.1121001E7f);
        float float19 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        funcionCuadratica15.setB((float) (byte) -1);
        funcionCuadratica15.setC((float) (byte) 1);
        float float21 = funcionCuadratica15.getA();
        float float22 = funcionCuadratica15.getC();
        java.lang.String str23 = funcionCuadratica15.toString();
        float float24 = funcionCuadratica15.determinante();
        float float25 = funcionCuadratica15.getA();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica15);
        float float27 = funcionCuadratica15.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str23.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-39.0f) + "'", float24 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 100);
        funcionCuadratica3.setA((float) 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getB();
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((-1276.0f));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-40.0f), 2.2661277E21f, 1.23676657E15f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(97.0f);
        int int11 = funcionCuadratica3.numRaices();
        float float12 = funcionCuadratica3.getA();
        float float13 = funcionCuadratica3.getB();
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 97.0f + "'", float13 == 97.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getB();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        java.lang.Object obj16 = funcionCuadratica12.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
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
        java.lang.Class<?> wildcardClass46 = funcionCuadratica38.getClass();
        funcionCuadratica38.setA((-224571.0f));
        funcionCuadratica38.setB((-800.0f));
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.determinante();
        int int13 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
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
        funcionCuadratica22.setC(2.92205049E12f);
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
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        funcionCuadratica10.setB((float) (byte) -1);
        funcionCuadratica10.setC((float) (byte) 1);
        float float17 = funcionCuadratica10.eval(1.0f);
        funcionCuadratica10.setA((-39.0f));
        funcionCuadratica10.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        java.lang.Object obj27 = funcionCuadratica25.raices();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        boolean boolean33 = funcionCuadratica25.equals(funcionCuadratica31);
        java.lang.String str34 = funcionCuadratica25.toString();
        funcionCuadratica25.setB(0.0f);
        float float37 = funcionCuadratica25.determinante();
        java.lang.Class<?> wildcardClass38 = funcionCuadratica25.getClass();
        boolean boolean39 = funcionCuadratica10.equals(funcionCuadratica25);
        boolean boolean40 = funcionCuadratica3.equals(funcionCuadratica25);
        funcionCuadratica25.setB(9.9979908E12f);
        float float43 = funcionCuadratica25.getB();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+100.0x" + "'", str34.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 9.9979908E12f + "'", float43 == 9.9979908E12f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica10.setC((float) 'a');
        java.lang.String str15 = funcionCuadratica10.toString();
        float float16 = funcionCuadratica10.determinante();
        float float17 = funcionCuadratica10.determinante();
        java.lang.Object obj18 = funcionCuadratica10.raices();
        float float19 = funcionCuadratica10.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+100.0x+97.0" + "'", str15.equals("10.0x^2+100.0x+97.0"));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 6120.0f + "'", float16 == 6120.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 6120.0f + "'", float17 == 6120.0f);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
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
        float float59 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 10.0f + "'", float59 == 10.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        try {
            java.lang.Object obj5 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
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
        funcionCuadratica3.setC(0.0f);
        float float37 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        float float15 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(1.62048E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 157.0f + "'", float15 == 157.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
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
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        funcionCuadratica35.setB((float) (byte) -1);
        funcionCuadratica35.setC((float) (byte) 1);
        float float41 = funcionCuadratica35.getA();
        java.lang.String str42 = funcionCuadratica35.toString();
        float float43 = funcionCuadratica35.getA();
        float float44 = funcionCuadratica35.getC();
        float float45 = funcionCuadratica35.getB();
        int int46 = funcionCuadratica35.numRaices();
        float float47 = funcionCuadratica35.getB();
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica35);
        funcionCuadratica35.setA(100.0f);
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str42.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10000.0f + "'", float4 == 10000.0f);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(131.0f);
        float float8 = funcionCuadratica3.eval((float) (short) -1);
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 232.0f + "'", float8 == 232.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100.0x^2+-1.0x+131.0" + "'", str9.equals("100.0x^2+-1.0x+131.0"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 131.0f + "'", float11 == 131.0f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1001097.0f, 9.999992E7f, 2.92205101E12f);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
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
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        java.lang.Object obj19 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-0.0f) + "'", obj19.equals((-0.0f)));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
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
        funcionCuadratica3.setC(199.0f);
        float float34 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 199.0f + "'", float34 == 199.0f);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getC();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC(34.0f);
        float float17 = funcionCuadratica3.eval((-30352.0f));
        float float18 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.94767698E10f + "'", float17 == 2.94767698E10f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 5648.0f + "'", float18 == 5648.0f);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
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
        java.lang.String str19 = funcionCuadratica3.toString();
        float float21 = funcionCuadratica3.eval(1.07220746E14f);
        float float22 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str19.equals("10.0x^2+2.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.1496289E29f + "'", float21 == 1.1496289E29f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.0f + "'", float22 == 2.0f);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
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
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        float float34 = funcionCuadratica28.getA();
        float float35 = funcionCuadratica28.getA();
        float float36 = funcionCuadratica28.getA();
        float float37 = funcionCuadratica28.determinante();
        boolean boolean38 = funcionCuadratica17.equals(funcionCuadratica28);
        float float39 = funcionCuadratica28.getB();
        float float41 = funcionCuadratica28.eval(0.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-39.0f) + "'", float37 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
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
        java.lang.Object obj34 = funcionCuadratica3.raices();
        float float35 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-0.0f) + "'", obj34.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.46410004E10f, 1.108416E9f, 0.0f);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(10000.0f);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float17 = funcionCuadratica16.getB();
        funcionCuadratica16.setB((float) (byte) -1);
        funcionCuadratica16.setC((float) (byte) 1);
        float float22 = funcionCuadratica16.getA();
        java.lang.String str23 = funcionCuadratica16.toString();
        float float24 = funcionCuadratica16.getC();
        float float25 = funcionCuadratica16.getB();
        float float27 = funcionCuadratica16.eval((float) '#');
        float float28 = funcionCuadratica16.getA();
        float float29 = funcionCuadratica16.getB();
        float float30 = funcionCuadratica16.determinante();
        float float31 = funcionCuadratica16.getC();
        boolean boolean32 = funcionCuadratica3.equals(funcionCuadratica16);
        funcionCuadratica16.setC(Float.POSITIVE_INFINITY);
        float float35 = funcionCuadratica16.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str23.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 12216.0f + "'", float27 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-1.0f) + "'", float29 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-39.0f) + "'", float30 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + Float.POSITIVE_INFINITY + "'", float35 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
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
        float float19 = funcionCuadratica3.eval((float) '#');
        float float20 = funcionCuadratica3.getA();
        float float21 = funcionCuadratica3.getC();
        float float22 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(99901.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.0f + "'", float22 == 2.0f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.eval(171610.0f);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica20.setA((float) (byte) -1);
        java.lang.String str23 = funcionCuadratica20.toString();
        float float24 = funcionCuadratica20.getC();
        float float25 = funcionCuadratica20.getC();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica20);
        java.lang.String str27 = funcionCuadratica20.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 104.0f + "'", float13 == 104.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.94517084E10f + "'", float16 == 2.94517084E10f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-1.0x^2+100.0x" + "'", str27.equals("-1.0x^2+100.0x"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
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
        java.lang.Class<?> wildcardClass24 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float17 = funcionCuadratica3.getB();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 97.0f + "'", float17 == 97.0f);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 10);
        float float7 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(3.27513384E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 1.02576384E8f, 0.0f);
        funcionCuadratica3.setB(10040.0f);
        float float6 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10040.0f + "'", float6 == 10040.0f);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        float float14 = funcionCuadratica3.eval(0.0f);
        int int15 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
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
        float float28 = funcionCuadratica26.getC();
        float float29 = funcionCuadratica26.getC();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        float float35 = funcionCuadratica33.determinante();
        boolean boolean36 = funcionCuadratica26.equals(funcionCuadratica33);
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        float float42 = funcionCuadratica40.determinante();
        funcionCuadratica40.setB((float) 10L);
        boolean boolean45 = funcionCuadratica33.equals(funcionCuadratica40);
        boolean boolean46 = funcionCuadratica7.equals(funcionCuadratica40);
        funcionCuadratica7.setB((float) 0L);
        java.lang.Class<?> wildcardClass49 = funcionCuadratica7.getClass();
        funcionCuadratica7.setA((-9.2799074E11f));
        funcionCuadratica7.setC(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10000.0f + "'", float35 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10000.0f + "'", float42 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.599677E22f, 0.0f, 2.56012813E17f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
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
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        float float34 = funcionCuadratica28.getA();
        float float35 = funcionCuadratica28.getA();
        float float36 = funcionCuadratica28.getA();
        float float37 = funcionCuadratica28.determinante();
        boolean boolean38 = funcionCuadratica17.equals(funcionCuadratica28);
        float float39 = funcionCuadratica17.getB();
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((-1.9457676E20f), (-38799.0f), 8.9558088E7f);
        int int44 = funcionCuadratica43.numRaices();
        boolean boolean45 = funcionCuadratica17.equals(funcionCuadratica43);
        java.lang.Object obj46 = funcionCuadratica43.raices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-39.0f) + "'", float37 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
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
        float float19 = funcionCuadratica3.getB();
        float float20 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.0f + "'", float19 == 2.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
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
        funcionCuadratica3.setC(1.70024767E17f);
        float float37 = funcionCuadratica3.eval(1.70024741E16f);
        float float38 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 2.8919978E36f + "'", float37 == 2.8919978E36f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
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
        java.lang.String str22 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float31 = funcionCuadratica30.getB();
        java.lang.Object obj32 = funcionCuadratica30.raices();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj37 = funcionCuadratica36.raices();
        boolean boolean38 = funcionCuadratica30.equals(funcionCuadratica36);
        practico5.FuncionCuadratica funcionCuadratica42 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float43 = funcionCuadratica42.getB();
        float float44 = funcionCuadratica42.getC();
        float float45 = funcionCuadratica42.getC();
        practico5.FuncionCuadratica funcionCuadratica49 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float50 = funcionCuadratica49.getB();
        float float51 = funcionCuadratica49.determinante();
        boolean boolean52 = funcionCuadratica42.equals(funcionCuadratica49);
        boolean boolean53 = funcionCuadratica30.equals(funcionCuadratica49);
        float float54 = funcionCuadratica49.getA();
        java.lang.Object obj55 = funcionCuadratica49.raices();
        java.lang.String str56 = funcionCuadratica49.toString();
        boolean boolean57 = funcionCuadratica26.equals(funcionCuadratica49);
        practico5.FuncionCuadratica funcionCuadratica61 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica61.setA((float) (byte) -1);
        java.lang.String str64 = funcionCuadratica61.toString();
        java.lang.String str65 = funcionCuadratica61.toString();
        boolean boolean66 = funcionCuadratica49.equals(funcionCuadratica61);
        float float67 = funcionCuadratica49.getA();
        float float69 = funcionCuadratica49.eval(1233649.0f);
        boolean boolean70 = funcionCuadratica3.equals(funcionCuadratica49);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str22.equals("32.0x^2+100.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 100.0f + "'", float50 == 100.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 10000.0f + "'", float51 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 10.0f + "'", float54 == 10.0f);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "10.0x^2+100.0x" + "'", str56.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-1.0x^2+100.0x" + "'", str64.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-1.0x^2+100.0x" + "'", str65.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 10.0f + "'", float67 == 10.0f);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 1.52190226E13f + "'", float69 == 1.52190226E13f);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        int int12 = funcionCuadratica3.numRaices();
        float float13 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(401.0f);
        int int16 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica20.setA((float) (byte) -1);
        funcionCuadratica20.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        boolean boolean34 = funcionCuadratica20.equals(funcionCuadratica28);
        funcionCuadratica20.setA((float) 10L);
        float float37 = funcionCuadratica20.getC();
        boolean boolean38 = funcionCuadratica3.equals(funcionCuadratica20);
        float float39 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 401.0f + "'", float39 == 401.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
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
        float float18 = funcionCuadratica3.getA();
        int int19 = funcionCuadratica3.numRaices();
        java.lang.Object obj20 = funcionCuadratica3.raices();
        float float21 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-0.0f) + "'", obj20.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
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
        int int24 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float9 = funcionCuadratica3.eval(56143.0f);
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        java.lang.Object obj15 = funcionCuadratica13.raices();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        boolean boolean21 = funcionCuadratica13.equals(funcionCuadratica19);
        java.lang.String str22 = funcionCuadratica13.toString();
        float float23 = funcionCuadratica13.getA();
        float float24 = funcionCuadratica13.getA();
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica13);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 3.15259781E10f + "'", float9 == 3.15259781E10f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x" + "'", str22.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.9877746E24f, (-1.9457676E20f), 99.0f);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0x^2+100.0x" + "'", str9.equals("1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2+100.0x" + "'", str10.equals("1.0x^2+100.0x"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str13 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(121000.0f);
        practico5.FuncionCuadratica funcionCuadratica17 = null;
        try {
            boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+-1.0x" + "'", str13.equals("10.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, 32.0f, (float) 0);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.eval(12216.0f);
        int int10 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.49230656E9f + "'", float9 == 1.49230656E9f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str10 = funcionCuadratica9.toString();
        funcionCuadratica9.setB((float) '4');
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica9);
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str10.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(2.43670528E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
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
        float float17 = funcionCuadratica3.getA();
        float float18 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-39.0f) + "'", float18 == (-39.0f));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
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
        practico5.FuncionCuadratica funcionCuadratica41 = null;
        try {
            boolean boolean42 = funcionCuadratica34.equals(funcionCuadratica41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.eval(232.0f);
        float float7 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 540560.0f + "'", float6 == 540560.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, (-4000.0f), (-399996.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float6 = funcionCuadratica3.eval(1.5295915E31f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "110.0x^2+-4000.0x+-399996.0" + "'", str4.equals("110.0x^2+-4000.0x+-399996.0"));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.eval(2.43670528E9f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 12216.0f + "'", float7 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 5.9375327E18f + "'", float9 == 5.9375327E18f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.eval(1.30393536E8f);
        float float11 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setB((-68.0f));
        funcionCuadratica3.setC(9.9983808E12f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        float float14 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(2.92205652E12f);
        float float14 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.16882259E14f) + "'", float14 == (-1.16882259E14f));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
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
        funcionCuadratica3.setC((float) (byte) 0);
        int int19 = funcionCuadratica3.numRaices();
        float float20 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float9 = funcionCuadratica8.getB();
        float float10 = funcionCuadratica8.determinante();
        funcionCuadratica8.setB((float) 10L);
        funcionCuadratica8.setA((float) 1);
        funcionCuadratica8.setC((float) (byte) -1);
        float float17 = funcionCuadratica8.getC();
        float float18 = funcionCuadratica8.getA();
        funcionCuadratica8.setB((float) (short) -1);
        funcionCuadratica8.setB((float) 1L);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float28 = funcionCuadratica27.getB();
        funcionCuadratica27.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj35 = funcionCuadratica34.raices();
        boolean boolean36 = funcionCuadratica27.equals(funcionCuadratica34);
        java.lang.Object obj37 = funcionCuadratica27.raices();
        funcionCuadratica27.setC(0.0f);
        funcionCuadratica27.setC(999899.0f);
        boolean boolean42 = funcionCuadratica3.equals(funcionCuadratica27);
        float float44 = funcionCuadratica27.eval(1001097.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.00219518E13f + "'", float44 == 1.00219518E13f);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(0.0f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-0.0f) + "'", obj11.equals((-0.0f)));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
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
        funcionCuadratica3.setB((-4000.0f));
        java.lang.Class<?> wildcardClass36 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        funcionCuadratica40.setB((float) (byte) -1);
        funcionCuadratica40.setC((float) (byte) 1);
        float float46 = funcionCuadratica40.getA();
        java.lang.String str47 = funcionCuadratica40.toString();
        float float48 = funcionCuadratica40.getC();
        float float49 = funcionCuadratica40.getC();
        float float51 = funcionCuadratica40.eval(0.0f);
        boolean boolean52 = funcionCuadratica3.equals(funcionCuadratica40);
        float float53 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(1.37487188E11f);
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
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str47.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(56143.0f, 9.9979908E12f, (float) (-1));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.9979908E12f + "'", float5 == 9.9979908E12f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(262190.0f, (-152.0f), 32.0f);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 262190.0f + "'", float4 == 262190.0f);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(6120.0f);
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-9.2799074E11f) + "'", float4 == (-9.2799074E11f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.9999002E8f + "'", float7 == 9.9999002E8f);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0032112E38f, (-68.0f), 9.9983808E12f);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, 232.0f, 12.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        funcionCuadratica7.setB((float) (byte) -1);
        funcionCuadratica7.setC((float) (byte) 1);
        float float13 = funcionCuadratica7.getA();
        java.lang.String str14 = funcionCuadratica7.toString();
        float float15 = funcionCuadratica7.getC();
        float float16 = funcionCuadratica7.getB();
        float float18 = funcionCuadratica7.eval((float) '#');
        float float19 = funcionCuadratica7.determinante();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica7);
        float float21 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str14.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 12216.0f + "'", float18 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-39.0f) + "'", float19 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(3.2012794E37f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float12 = funcionCuadratica10.eval(0.0f);
        funcionCuadratica10.setB((float) 100L);
        funcionCuadratica10.setC((float) 1);
        java.lang.Class<?> wildcardClass17 = funcionCuadratica10.getClass();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica10.getClass();
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setC(10000.0f);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(6.8743594E11f);
        funcionCuadratica3.setA(56143.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
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
        float float18 = funcionCuadratica3.determinante();
        float float19 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        java.lang.String str21 = funcionCuadratica3.toString();
        float float22 = funcionCuadratica3.getC();
        float float23 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 5.0f + "'", float18 == 5.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1.0x^2+1.0x+-1.0" + "'", str21.equals("1.0x^2+1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
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
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        float float37 = funcionCuadratica35.getC();
        float float38 = funcionCuadratica35.getA();
        practico5.FuncionCuadratica funcionCuadratica42 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj43 = funcionCuadratica42.raices();
        boolean boolean44 = funcionCuadratica35.equals(funcionCuadratica42);
        boolean boolean45 = funcionCuadratica3.equals(funcionCuadratica35);
        float float46 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 10.0f + "'", float38 == 10.0f);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, 232.0f, 157.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
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
        java.lang.Object obj28 = funcionCuadratica3.raices();
        java.lang.Object obj29 = funcionCuadratica3.raices();
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
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
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
        java.lang.Class<?> wildcardClass32 = funcionCuadratica20.getClass();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica36.setB((float) (byte) 0);
        float float39 = funcionCuadratica36.getC();
        java.lang.Object obj40 = funcionCuadratica36.raices();
        funcionCuadratica36.setA((float) 'a');
        boolean boolean43 = funcionCuadratica20.equals(funcionCuadratica36);
        funcionCuadratica20.setB(0.0f);
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
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-0.0f) + "'", obj40.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
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
        funcionCuadratica25.setB((float) (byte) 0);
        funcionCuadratica25.setC(10000.0f);
        boolean boolean30 = funcionCuadratica19.equals(funcionCuadratica25);
        float float31 = funcionCuadratica19.determinante();
        java.lang.Class<?> wildcardClass32 = funcionCuadratica19.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getA();
        java.lang.Object obj15 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 157.0f + "'", float13 == 157.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-39.0f) + "'", float14 == (-39.0f));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getA();
        int int6 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        funcionCuadratica10.setB((float) (byte) -1);
        funcionCuadratica10.setA((float) '#');
        funcionCuadratica10.setC((float) (short) 100);
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str19 = funcionCuadratica10.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "35.0x^2+-1.0x+100.0" + "'", str19.equals("35.0x^2+-1.0x+100.0"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        int int7 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        float float13 = funcionCuadratica11.determinante();
        funcionCuadratica11.setB((float) 10L);
        funcionCuadratica11.setA((float) 1);
        funcionCuadratica11.setC((float) (byte) -1);
        float float20 = funcionCuadratica11.getC();
        float float21 = funcionCuadratica11.getA();
        funcionCuadratica11.setB((float) (short) -1);
        boolean boolean24 = funcionCuadratica3.equals(funcionCuadratica11);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
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
        try {
            java.lang.Object obj20 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
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
        java.lang.String str28 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(9.996025E28f);
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str28.equals("10.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getB();
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35.0x^2+-1.0x" + "'", str12.equals("35.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-0.0f) + "'", obj15.equals((-0.0f)));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
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
        float float33 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass34 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getB();
        java.lang.String str12 = funcionCuadratica3.toString();
        java.lang.String str13 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35.0x^2+-1.0x" + "'", str12.equals("35.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "35.0x^2+-1.0x" + "'", str13.equals("35.0x^2+-1.0x"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10000.0f + "'", float7 == 10000.0f);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.determinante();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.getB();
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+10.0x" + "'", str10.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
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
        float float16 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35.0x^2+-1.0x" + "'", str12.equals("35.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
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
        funcionCuadratica3.setB((float) (-1L));
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
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-38799.0f), 0.0f, 999899.0f);
        funcionCuadratica3.setC(1.30507776E8f);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
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
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float28 = funcionCuadratica27.getC();
        java.lang.Object obj29 = funcionCuadratica27.raices();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica27);
        float float31 = funcionCuadratica27.getA();
        funcionCuadratica27.setC((-9.997902E13f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(157.0f);
        int int15 = funcionCuadratica3.numRaices();
        java.lang.Object obj16 = funcionCuadratica3.raices();
        float float17 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10000.0f + "'", float17 == 10000.0f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float6 = funcionCuadratica3.getB();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC((float) 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0x^2" + "'", str8.equals("1.0x^2"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float16 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(1.74241333E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
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
        float float19 = funcionCuadratica3.eval((float) '#');
        funcionCuadratica3.setC((float) 1);
        float float22 = funcionCuadratica3.getA();
        int int23 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setA((-5.089792E9f));
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(8.8616672E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(121000.0f, 9.999992E7f, (-2.890842E34f));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
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
        float float33 = funcionCuadratica3.eval(10.0f);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1001001.0f + "'", float33 == 1001001.0f);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((float) '4');
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.determinante();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.30393536E8x^2+52.0x+-1.0" + "'", str7.equals("1.30393536E8x^2+52.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 5.21576832E8f + "'", float8 == 5.21576832E8f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
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
        int int50 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
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
        funcionCuadratica7.setA(9.9999002E8f);
        float float29 = funcionCuadratica7.getB();
        java.lang.Object obj30 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.74107996E10f) + "'", float26 == (-1.74107996E10f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(210.0f, (float) 10, 1.2791497E9f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(262190.0f);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica11.setA((float) (byte) -1);
        java.lang.String str14 = funcionCuadratica11.toString();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        float float25 = funcionCuadratica18.eval(1.0f);
        funcionCuadratica18.setA((-39.0f));
        funcionCuadratica18.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        java.lang.String str42 = funcionCuadratica33.toString();
        funcionCuadratica33.setB(0.0f);
        float float45 = funcionCuadratica33.determinante();
        java.lang.Class<?> wildcardClass46 = funcionCuadratica33.getClass();
        boolean boolean47 = funcionCuadratica18.equals(funcionCuadratica33);
        boolean boolean48 = funcionCuadratica11.equals(funcionCuadratica33);
        funcionCuadratica33.setB(121000.0f);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica33.getClass();
        boolean boolean52 = funcionCuadratica3.equals(funcionCuadratica33);
        float float54 = funcionCuadratica33.eval(80232.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-1.0x^2+100.0x" + "'", str14.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x" + "'", str42.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 7.4079805E10f + "'", float54 == 7.4079805E10f);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(11310.0f, 32.0f, (-68.0f));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj8 = funcionCuadratica7.raices();
        java.lang.String str9 = funcionCuadratica7.toString();
        java.lang.Object obj10 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica3.setA(1.40576604E11f);
        float float16 = funcionCuadratica3.eval(199.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 5.5669745E15f + "'", float16 == 5.5669745E15f);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
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
        float float19 = funcionCuadratica3.eval((float) '#');
        funcionCuadratica3.setC((float) 1);
        float float23 = funcionCuadratica3.eval((-399.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1591213.0f + "'", float23 == 1591213.0f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(199.0f, 2.8908421E35f, (-1276.0f));
        funcionCuadratica3.setB((float) (byte) 1);
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "199.0x^2+1.0x+-1276.0" + "'", str6.equals("199.0x^2+1.0x+-1276.0"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
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
        java.lang.Class<?> wildcardClass25 = funcionCuadratica10.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
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
        float float19 = funcionCuadratica3.getB();
        int int20 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
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
        java.lang.String str18 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str18.equals("10.0x^2+2.0x+1.0"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.eval(171610.0f);
        float float17 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(100000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 104.0f + "'", float13 == 104.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.94517084E10f + "'", float16 == 2.94517084E10f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
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
        java.lang.Object obj27 = funcionCuadratica19.raices();
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
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) 100, (float) (byte) 100);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((-11424.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.getC();
        float float12 = funcionCuadratica9.getC();
        float float13 = funcionCuadratica9.getB();
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica9);
        float float15 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.getC();
        float float17 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float6 = funcionCuadratica3.getB();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.String str8 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(4.1945094E21f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0x^2" + "'", str8.equals("1.0x^2"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(11310.0f, 32.0f, (-68.0f));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj8 = funcionCuadratica7.raices();
        java.lang.String str9 = funcionCuadratica7.toString();
        java.lang.Object obj10 = funcionCuadratica7.raices();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica7.getClass();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica7.setB(2.56012813E17f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        funcionCuadratica3.setC((-3.0f));
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((-1599983.0f));
        funcionCuadratica3.setB(1.00360449E17f);
        float float13 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-0.0f) + "'", obj8.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.007222E34f + "'", float13 == 1.007222E34f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
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
        funcionCuadratica3.setA(1.1121001E7f);
        float float19 = funcionCuadratica3.getA();
        java.lang.String str20 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.1121001E7f + "'", float19 == 1.1121001E7f);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "1.1121001E7x^2+1.0" + "'", str20.equals("1.1121001E7x^2+1.0"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setA((float) '#');
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(3.2012794E37f);
        float float15 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + Float.POSITIVE_INFINITY + "'", float15 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica10.getClass();
        float float16 = funcionCuadratica10.eval((float) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 110.0f + "'", float16 == 110.0f);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
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
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 0);
        java.lang.Class<?> wildcardClass35 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass36 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.74107996E10f), 1000.0f, 110.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        int int5 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.74107996E10x^2+1000.0x+110.0" + "'", str4.equals("-1.74107996E10x^2+1000.0x+110.0"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.eval(1.29399648E8f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.67442702E17f + "'", float6 == 1.67442702E17f);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        float float17 = funcionCuadratica11.getA();
        java.lang.String str18 = funcionCuadratica11.toString();
        float float19 = funcionCuadratica11.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        funcionCuadratica23.setB((float) (byte) -1);
        funcionCuadratica23.setC((float) (byte) 1);
        float float29 = funcionCuadratica23.getA();
        float float30 = funcionCuadratica23.getC();
        java.lang.String str31 = funcionCuadratica23.toString();
        float float32 = funcionCuadratica23.determinante();
        float float33 = funcionCuadratica23.getA();
        boolean boolean34 = funcionCuadratica11.equals(funcionCuadratica23);
        float float35 = funcionCuadratica23.getB();
        boolean boolean36 = funcionCuadratica3.equals(funcionCuadratica23);
        float float37 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str18.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str31.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-39.0f) + "'", float32 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(1.49230656E9f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica(104.0f, 1.70024767E17f, 0.0f);
        float float14 = funcionCuadratica13.getC();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica13);
        java.lang.Object obj16 = funcionCuadratica13.raices();
        float float17 = funcionCuadratica13.determinante();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) (short) 10, (-39.0f), (float) (short) -1);
        java.lang.String str22 = funcionCuadratica21.toString();
        java.lang.Object obj23 = funcionCuadratica21.raices();
        funcionCuadratica21.setB(1001097.0f);
        boolean boolean26 = funcionCuadratica13.equals(funcionCuadratica21);
        float float27 = funcionCuadratica21.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.890842E34f + "'", float17 == 2.890842E34f);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+-39.0x+-1.0" + "'", str22.equals("10.0x^2+-39.0x+-1.0"));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica3.setA((-68.0f));
        funcionCuadratica3.setC(1.00009997E9f);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica25.setA((float) (byte) -1);
        java.lang.String str28 = funcionCuadratica25.toString();
        java.lang.String str29 = funcionCuadratica25.toString();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        float float42 = funcionCuadratica39.getB();
        funcionCuadratica39.setC(10.0f);
        boolean boolean45 = funcionCuadratica25.equals(funcionCuadratica39);
        float float46 = funcionCuadratica39.getC();
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        funcionCuadratica50.setB((float) (byte) -1);
        funcionCuadratica50.setC((float) (byte) 1);
        float float56 = funcionCuadratica50.getA();
        float float57 = funcionCuadratica50.getA();
        float float58 = funcionCuadratica50.getA();
        float float59 = funcionCuadratica50.determinante();
        boolean boolean60 = funcionCuadratica39.equals(funcionCuadratica50);
        float float61 = funcionCuadratica39.getB();
        practico5.FuncionCuadratica funcionCuadratica65 = new practico5.FuncionCuadratica((-1.9457676E20f), (-38799.0f), 8.9558088E7f);
        int int66 = funcionCuadratica65.numRaices();
        boolean boolean67 = funcionCuadratica39.equals(funcionCuadratica65);
        float float68 = funcionCuadratica39.getC();
        boolean boolean69 = funcionCuadratica3.equals(funcionCuadratica39);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-1.0x^2+100.0x" + "'", str28.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-1.0x^2+100.0x" + "'", str29.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 10.0f + "'", float56 == 10.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 10.0f + "'", float57 == 10.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 10.0f + "'", float58 == 10.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-39.0f) + "'", float59 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 10.0f + "'", float68 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        funcionCuadratica3.setB(99.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
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
        float float24 = funcionCuadratica10.eval(104.0f);
        float float26 = funcionCuadratica10.eval(110.0f);
        funcionCuadratica10.setC(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 118560.0f + "'", float24 == 118560.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 132000.0f + "'", float26 == 132000.0f);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        int int9 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(11310.0f);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float16 = funcionCuadratica15.getB();
        java.lang.Object obj17 = funcionCuadratica15.raices();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj22 = funcionCuadratica21.raices();
        boolean boolean23 = funcionCuadratica15.equals(funcionCuadratica21);
        java.lang.String str24 = funcionCuadratica15.toString();
        funcionCuadratica15.setB(0.0f);
        float float27 = funcionCuadratica15.determinante();
        float float28 = funcionCuadratica15.getA();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica15);
        float float30 = funcionCuadratica15.getA();
        java.lang.Class<?> wildcardClass31 = funcionCuadratica15.getClass();
        funcionCuadratica15.setC(9.9999002E8f);
        float float34 = funcionCuadratica15.getC();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10.0x^2+100.0x" + "'", str24.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 9.9999002E8f + "'", float34 == 9.9999002E8f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
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
        funcionCuadratica3.setB(3.27513384E17f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
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
        java.lang.Object obj31 = funcionCuadratica27.raices();
        float float33 = funcionCuadratica27.eval(99901.0f);
        funcionCuadratica27.setB((-1.50924237E9f));
        float float36 = funcionCuadratica27.getA();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.09791189E12f + "'", float33 == 1.09791189E12f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(157.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        float float16 = funcionCuadratica3.getB();
        int int17 = funcionCuadratica3.numRaices();
        float float18 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 157.0f + "'", float18 == 157.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(199.0f, 2.8908421E35f, (-1276.0f));
        funcionCuadratica3.setB((float) (byte) 1);
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        java.lang.Object obj12 = funcionCuadratica10.raices();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        boolean boolean18 = funcionCuadratica10.equals(funcionCuadratica16);
        java.lang.String str19 = funcionCuadratica10.toString();
        funcionCuadratica10.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        funcionCuadratica25.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj33 = funcionCuadratica32.raices();
        boolean boolean34 = funcionCuadratica25.equals(funcionCuadratica32);
        java.lang.Class<?> wildcardClass35 = funcionCuadratica25.getClass();
        boolean boolean36 = funcionCuadratica10.equals(funcionCuadratica25);
        funcionCuadratica25.setC((-3.0f));
        funcionCuadratica25.setB(5.2230605E9f);
        float float41 = funcionCuadratica25.determinante();
        boolean boolean42 = funcionCuadratica3.equals(funcionCuadratica25);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 199.0f + "'", float6 == 199.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+100.0x" + "'", str19.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 2.7280361E19f + "'", float41 == 2.7280361E19f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(12.0f, 10000.0f, (float) 'a');
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12.0x^2+10000.0x+97.0" + "'", str4.equals("12.0x^2+10000.0x+97.0"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.eval(1.30393536E8f);
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.70024767E17f + "'", float14 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
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
        java.lang.Class<?> wildcardClass70 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.getC();
        float float12 = funcionCuadratica9.getC();
        float float13 = funcionCuadratica9.getB();
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica9);
        float float15 = funcionCuadratica9.determinante();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica9.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 1, 1.1121001E7f, (-11424.0f));
        funcionCuadratica3.setB((float) '#');
        float float7 = funcionCuadratica3.eval((float) '4');
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-6900.0f) + "'", float7 == (-6900.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 2);
        funcionCuadratica3.setC((float) 1L);
        float float14 = funcionCuadratica3.getC();
        int int15 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(131.0f, 12216.0f, (float) (byte) 100);
        funcionCuadratica3.setB((float) 10);
        float float7 = funcionCuadratica3.eval(97.0f);
        float float8 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.eval(6120.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1233649.0f + "'", float7 == 1233649.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 131.0f + "'", float8 == 131.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 4.9065876E9f + "'", float10 == 4.9065876E9f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
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
        float float18 = funcionCuadratica3.determinante();
        float float19 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        java.lang.String str21 = funcionCuadratica3.toString();
        float float22 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((-399996.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 5.0f + "'", float18 == 5.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1.0x^2+1.0x+-1.0" + "'", str21.equals("1.0x^2+1.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.9558088E7f, 104.0f, (-1.50574944E8f));
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 5.3940816E16f + "'", float4 == 5.3940816E16f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.00079956E18f, 8.8616672E8f, (-4.159E7f));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float9 = funcionCuadratica3.eval(2.7280361E19f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
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
        funcionCuadratica10.setA(2.30828008E18f);
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
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float13 = funcionCuadratica3.eval((float) (byte) 1);
        float float15 = funcionCuadratica3.eval(1.60004E8f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        float float18 = funcionCuadratica3.eval(232.0f);
        int int19 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 110.0f + "'", float13 == 110.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.56012813E17f + "'", float15 == 2.56012813E17f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 561440.0f + "'", float18 == 561440.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
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
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        funcionCuadratica23.setB((float) (byte) -1);
        funcionCuadratica23.setC((float) (byte) 1);
        float float29 = funcionCuadratica23.getA();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica23);
        float float31 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC((float) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
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
        java.lang.Object obj40 = funcionCuadratica11.raices();
        funcionCuadratica11.setC(0.0f);
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
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.determinante();
        float float15 = funcionCuadratica3.eval(0.0f);
        float float17 = funcionCuadratica3.eval((float) 10L);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setB(6000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 104.0f + "'", float13 == 104.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 199.0f + "'", float17 == 199.0f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        float float14 = funcionCuadratica9.getB();
        float float15 = funcionCuadratica9.getC();
        float float17 = funcionCuadratica9.eval(99901.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 9.9812082E10f + "'", float17 == 9.9812082E10f);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
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
        int int19 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA((-1.50924237E9f));
        float float22 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 6.0369695E9f + "'", float22 == 6.0369695E9f);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
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
        float float18 = funcionCuadratica3.getA();
        int int19 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(1.9877746E24f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica16.setA((float) (byte) -1);
        java.lang.String str19 = funcionCuadratica16.toString();
        float float21 = funcionCuadratica16.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        float float27 = funcionCuadratica25.getC();
        float float28 = funcionCuadratica25.getA();
        boolean boolean29 = funcionCuadratica16.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        funcionCuadratica33.setB((float) (byte) -1);
        funcionCuadratica33.setC((float) (byte) 1);
        float float39 = funcionCuadratica33.getA();
        java.lang.String str40 = funcionCuadratica33.toString();
        funcionCuadratica33.setC((float) (byte) 100);
        funcionCuadratica33.setC((float) 1L);
        boolean boolean45 = funcionCuadratica16.equals(funcionCuadratica33);
        java.lang.Object obj46 = funcionCuadratica16.raices();
        boolean boolean47 = funcionCuadratica3.equals(funcionCuadratica16);
        funcionCuadratica16.setA(2.30828008E18f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-1.0x^2+100.0x" + "'", str19.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-11424.0f) + "'", float21 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.0f + "'", float39 == 10.0f);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str40.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(0.0f);
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((-6900.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
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
        java.lang.String str30 = funcionCuadratica22.toString();
        float float31 = funcionCuadratica22.getC();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-68.0x^2+100.0x" + "'", str30.equals("-68.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) (byte) 100);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(1.60004E8f);
        funcionCuadratica3.setB(210.0f);
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 210.0f + "'", float15 == 210.0f);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9600.0f, 1.1121001E7f, 1.70024767E17f);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) 1L);
        float float14 = funcionCuadratica3.determinante();
        float float15 = funcionCuadratica3.getB();
        int int16 = funcionCuadratica3.numRaices();
        float float17 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-3.0f) + "'", float14 == (-3.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float14 = funcionCuadratica3.getC();
        float float15 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(10305.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 104.0f + "'", float15 == 104.0f);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
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
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        java.lang.String str28 = funcionCuadratica19.toString();
        funcionCuadratica19.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj42 = funcionCuadratica41.raices();
        boolean boolean43 = funcionCuadratica34.equals(funcionCuadratica41);
        java.lang.Class<?> wildcardClass44 = funcionCuadratica34.getClass();
        boolean boolean45 = funcionCuadratica19.equals(funcionCuadratica34);
        funcionCuadratica34.setC(1.30393536E8f);
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica34);
        float float50 = funcionCuadratica34.eval((-4000.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+100.0x" + "'", str28.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 2.90397536E8f + "'", float50 == 2.90397536E8f);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, (float) 1, 9413.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
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
        funcionCuadratica20.setB(6.554256E34f);
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
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
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
        int int18 = funcionCuadratica3.numRaices();
        float float19 = funcionCuadratica3.getB();
        float float20 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
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
        float float19 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA((-9.6735761E17f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10128.0f + "'", float19 == 10128.0f);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(10000.0f);
        float float9 = funcionCuadratica3.eval(1.46422104E11f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.1439433E23f + "'", float9 == 2.1439433E23f);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        int int14 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(132000.0f);
        float float17 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
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
        funcionCuadratica3.setB(5.21574144E8f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.eval(171610.0f);
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.94671647E10f + "'", float8 == 2.94671647E10f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        float float11 = funcionCuadratica3.eval(2.2661277E21f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + Float.POSITIVE_INFINITY + "'", float11 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5648.0f, (float) 1L, (float) 100);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.eval(1.30393536E8f);
        float float11 = funcionCuadratica3.determinante();
        float float12 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(2.8908421E35f);
        float float16 = funcionCuadratica3.eval(157.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 4.538622E37f + "'", float16 == 4.538622E37f);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        java.lang.String str13 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float19 = funcionCuadratica17.eval(0.0f);
        int int20 = funcionCuadratica17.numRaices();
        java.lang.Object obj21 = funcionCuadratica17.raices();
        java.lang.Class<?> wildcardClass22 = funcionCuadratica17.getClass();
        funcionCuadratica17.setC(1.62048E8f);
        java.lang.Class<?> wildcardClass25 = funcionCuadratica17.getClass();
        float float27 = funcionCuadratica17.eval((-1.74107996E10f));
        java.lang.Class<?> wildcardClass28 = funcionCuadratica17.getClass();
        float float29 = funcionCuadratica17.getC();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica17);
        funcionCuadratica17.setC(104.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+100.0x" + "'", str13.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 3.0313594E21f + "'", float27 == 3.0313594E21f);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.62048E8f + "'", float29 == 1.62048E8f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-399996.0f) + "'", float5 == (-399996.0f));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '#', (-1.0f), (-4000.0f));
        funcionCuadratica3.setB((-152.0f));
        funcionCuadratica3.setA((float) (short) 100);
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
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
        java.lang.String str30 = funcionCuadratica19.toString();
        java.lang.String str31 = funcionCuadratica19.toString();
        java.lang.Object obj32 = funcionCuadratica19.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-39.0x^2+-1.0x+1.0" + "'", str30.equals("-39.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-39.0x^2+-1.0x+1.0" + "'", str31.equals("-39.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-6.163462E37f), 1.1496289E29f, 1.02576384E8f);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + Float.POSITIVE_INFINITY + "'", float4 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) (short) 10);
        float float8 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(1.007222E34f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
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
        java.lang.Object obj34 = funcionCuadratica3.raices();
        float float35 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(1.00360449E17f);
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
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-0.0f) + "'", obj34.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        int int14 = funcionCuadratica10.numRaices();
        funcionCuadratica10.setB((float) (byte) 0);
        float float17 = funcionCuadratica10.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(110.0f);
        float float7 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
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
        java.lang.Class<?> wildcardClass34 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
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
        funcionCuadratica3.setA(1.0072218E35f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6120.0f, 1.59996412E11f, (-9.997902E13f));
        funcionCuadratica3.setC(2.7280361E19f);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
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
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica36.setA((float) (byte) -1);
        funcionCuadratica36.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica44 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float45 = funcionCuadratica44.getB();
        funcionCuadratica44.setB((float) (byte) -1);
        funcionCuadratica44.setC((float) (byte) 1);
        boolean boolean50 = funcionCuadratica36.equals(funcionCuadratica44);
        boolean boolean51 = funcionCuadratica32.equals(funcionCuadratica36);
        java.lang.String str52 = funcionCuadratica36.toString();
        practico5.FuncionCuadratica funcionCuadratica56 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean57 = funcionCuadratica36.equals(funcionCuadratica56);
        funcionCuadratica56.setB(999899.0f);
        java.lang.Object obj60 = funcionCuadratica56.raices();
        float float62 = funcionCuadratica56.eval(99901.0f);
        funcionCuadratica56.setB((-1.50924237E9f));
        boolean boolean65 = funcionCuadratica3.equals(funcionCuadratica56);
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
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-1.0x^2+100.0x" + "'", str52.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.09791189E12f + "'", float62 == 1.09791189E12f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        float float14 = funcionCuadratica3.eval(8.538379E25f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + Float.POSITIVE_INFINITY + "'", float14 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) -1);
        int int16 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
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
        float float43 = funcionCuadratica10.getC();
        funcionCuadratica10.setA(2.8919978E36f);
        java.lang.Object obj46 = funcionCuadratica10.raices();
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
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
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
        funcionCuadratica20.setA(1.00360441E17f);
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
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int9 = funcionCuadratica8.numRaices();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica8);
        float float12 = funcionCuadratica3.eval(Float.POSITIVE_INFINITY);
        java.lang.String str13 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "100.0x^2+1.0x+-1.0" + "'", str13.equals("100.0x^2+1.0x+-1.0"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
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
        funcionCuadratica3.setC((float) (byte) 0);
        int int19 = funcionCuadratica3.numRaices();
        java.lang.Object obj20 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-0.0f) + "'", obj20.equals((-0.0f)));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
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
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj47 = funcionCuadratica46.raices();
        java.lang.String str48 = funcionCuadratica46.toString();
        java.lang.Object obj49 = funcionCuadratica46.raices();
        boolean boolean50 = funcionCuadratica10.equals(funcionCuadratica46);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica10.getClass();
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
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "10.0x^2+100.0x" + "'", str48.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        java.lang.String str9 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        int int12 = funcionCuadratica3.numRaices();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-4000.0f) + "'", float13 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-4000.0f) + "'", float14 == (-4000.0f));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
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
        java.lang.Class<?> wildcardClass25 = funcionCuadratica17.getClass();
        float float26 = funcionCuadratica17.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (-1), (float) 10L);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str4.equals("10.0x^2+-1.0x+10.0"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
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
        float float18 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(9.996025E28f);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(199.0f);
        float float17 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((-68.0f));
        float float14 = funcionCuadratica3.getC();
        float float15 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 4584.0f + "'", float15 == 4584.0f);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 32.0f, 2.5758312E33f);
        float float5 = funcionCuadratica3.eval(0.0f);
        float float6 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5758312E33f + "'", float5 == 2.5758312E33f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.determinante();
        int int12 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(1.40742095E16f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10.0x^2+100.0" + "'", str6.equals("10.0x^2+100.0"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
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
        float float19 = funcionCuadratica3.getC();
        float float21 = funcionCuadratica3.eval(121000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+-68.0x+1.0" + "'", str17.equals("10.0x^2+-68.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.46401772E11f + "'", float21 == 1.46401772E11f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
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
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        java.lang.String str28 = funcionCuadratica19.toString();
        funcionCuadratica19.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj42 = funcionCuadratica41.raices();
        boolean boolean43 = funcionCuadratica34.equals(funcionCuadratica41);
        java.lang.Class<?> wildcardClass44 = funcionCuadratica34.getClass();
        boolean boolean45 = funcionCuadratica19.equals(funcionCuadratica34);
        funcionCuadratica34.setC(1.30393536E8f);
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica34);
        funcionCuadratica3.setB((float) (short) -1);
        float float51 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+100.0x" + "'", str28.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 10.0f + "'", float51 == 10.0f);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(118560.0f);
        float float9 = funcionCuadratica3.getC();
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 118560.0f + "'", float9 == 118560.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+118560.0" + "'", str10.equals("1.30393536E8x^2+118560.0"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(23.0f, 2.890842E34f, (float) ' ');
        float float5 = funcionCuadratica3.eval(2.43670528E9f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + Float.POSITIVE_INFINITY + "'", float5 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
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
        funcionCuadratica3.setA(12216.0f);
        funcionCuadratica3.setC(1.74240006E11f);
        try {
            java.lang.Object obj27 = funcionCuadratica3.raices();
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
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
        funcionCuadratica3.setB(12600.0f);
        float float36 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
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
        float float21 = funcionCuadratica3.eval(8.674031E23f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + Float.NEGATIVE_INFINITY + "'", float21 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) 10);
        funcionCuadratica3.setA(1000.0f);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1000.0f + "'", float9 == 1000.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-399900.0f) + "'", float10 == (-399900.0f));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
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
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
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
        java.lang.Class<?> wildcardClass20 = funcionCuadratica16.getClass();
        float float21 = funcionCuadratica16.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
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
        funcionCuadratica22.setB((float) (byte) 0);
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
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
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
        funcionCuadratica18.setC((-3.0f));
        funcionCuadratica18.setB(5.2230605E9f);
        java.lang.String str34 = funcionCuadratica18.toString();
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+5.2230605E9x+-3.0" + "'", str34.equals("10.0x^2+5.2230605E9x+-3.0"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float11 = funcionCuadratica3.eval(157.0f);
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 262190.0f + "'", float11 == 262190.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(2.0f);
        java.lang.String str14 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(1000.0f);
        funcionCuadratica3.setA((float) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str14.equals("10.0x^2+2.0x+1.0"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.2661277E21f, 1000.0f, 8.9558088E7f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setB((float) 10L);
        funcionCuadratica7.setA((float) 1);
        funcionCuadratica7.setC((float) (byte) -1);
        float float16 = funcionCuadratica7.getC();
        funcionCuadratica7.setB((float) 'a');
        float float19 = funcionCuadratica7.getB();
        int int20 = funcionCuadratica7.numRaices();
        funcionCuadratica7.setB((float) (short) 10);
        int int23 = funcionCuadratica7.numRaices();
        java.lang.String str24 = funcionCuadratica7.toString();
        funcionCuadratica7.setC((float) 10);
        float float28 = funcionCuadratica7.eval(0.0f);
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica7);
        float float30 = funcionCuadratica7.determinante();
        float float32 = funcionCuadratica7.eval(6120.0f);
        java.lang.Object obj33 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 97.0f + "'", float19 == 97.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str24.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 60.0f + "'", float30 == 60.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 3.7515608E7f + "'", float32 == 3.7515608E7f);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(157.0f);
        float float15 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
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
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        funcionCuadratica23.setB((float) (byte) -1);
        funcionCuadratica23.setC((float) (byte) 1);
        float float29 = funcionCuadratica23.getA();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica23);
        java.lang.String str31 = funcionCuadratica3.toString();
        int int32 = funcionCuadratica3.numRaices();
        float float33 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(100000.0f);
        int int36 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str31.equals("32.0x^2+100.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10128.0f + "'", float33 == 10128.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
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
        java.lang.String str46 = funcionCuadratica38.toString();
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
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "10.0x^2+10.0x" + "'", str46.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
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
        funcionCuadratica3.setC(1.6003198E20f);
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float14 = funcionCuadratica12.eval(9413.0f);
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        float float17 = funcionCuadratica3.eval(0.0f);
        float float19 = funcionCuadratica3.eval(12600.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 8.8604582E8f + "'", float14 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.58886003E9f + "'", float19 == 1.58886003E9f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1), 9.9979908E12f, 1.00360449E17f);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 32.0f, 2.5758312E33f);
        funcionCuadratica3.setB(2.2778125E19f);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
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
        funcionCuadratica15.setA(121000.0f);
        float float47 = funcionCuadratica15.getC();
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
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.26785096E8f), 8.8604582E8f, 1.108416E9f);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
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
        float float39 = funcionCuadratica26.eval(10004.0f);
        float float41 = funcionCuadratica26.eval(121000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.00180056E8f + "'", float39 == 1.00180056E8f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.46422108E10f + "'", float41 == 1.46422108E10f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(262190.0f);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica11.setA((float) (byte) -1);
        java.lang.String str14 = funcionCuadratica11.toString();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        float float25 = funcionCuadratica18.eval(1.0f);
        funcionCuadratica18.setA((-39.0f));
        funcionCuadratica18.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        java.lang.String str42 = funcionCuadratica33.toString();
        funcionCuadratica33.setB(0.0f);
        float float45 = funcionCuadratica33.determinante();
        java.lang.Class<?> wildcardClass46 = funcionCuadratica33.getClass();
        boolean boolean47 = funcionCuadratica18.equals(funcionCuadratica33);
        boolean boolean48 = funcionCuadratica11.equals(funcionCuadratica33);
        funcionCuadratica33.setB(121000.0f);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica33.getClass();
        boolean boolean52 = funcionCuadratica3.equals(funcionCuadratica33);
        float float53 = funcionCuadratica33.determinante();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-1.0x^2+100.0x" + "'", str14.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x" + "'", str42.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.46410004E10f + "'", float53 == 1.46410004E10f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-3.0f), 0.0f, (float) (short) 10);
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
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
        funcionCuadratica3.setA((-1.0303324E35f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
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
        try {
            java.lang.Object obj20 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(5.2230605E9f);
        float float12 = funcionCuadratica3.eval(2.9451708E11f);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 8.689414E23f + "'", float12 == 8.689414E23f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(1.46422108E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((-1599983.0f));
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-0.0f) + "'", obj8.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 232.0f + "'", float11 == 232.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        int int6 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        java.lang.Object obj12 = funcionCuadratica10.raices();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        boolean boolean18 = funcionCuadratica10.equals(funcionCuadratica16);
        java.lang.String str19 = funcionCuadratica10.toString();
        funcionCuadratica10.setB(0.0f);
        java.lang.Class<?> wildcardClass22 = funcionCuadratica10.getClass();
        float float24 = funcionCuadratica10.eval((float) 100);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        float float34 = funcionCuadratica28.getA();
        java.lang.String str35 = funcionCuadratica28.toString();
        float float36 = funcionCuadratica28.getC();
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        java.lang.Object obj42 = funcionCuadratica40.raices();
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj47 = funcionCuadratica46.raices();
        boolean boolean48 = funcionCuadratica40.equals(funcionCuadratica46);
        funcionCuadratica40.setA((float) ' ');
        funcionCuadratica40.setC((float) (short) -1);
        float float53 = funcionCuadratica40.determinante();
        float float55 = funcionCuadratica40.eval((float) (byte) 1);
        java.lang.Object obj56 = funcionCuadratica40.raices();
        practico5.FuncionCuadratica funcionCuadratica60 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float61 = funcionCuadratica60.getB();
        funcionCuadratica60.setB((float) (byte) -1);
        funcionCuadratica60.setC((float) (byte) 1);
        float float66 = funcionCuadratica60.getA();
        boolean boolean67 = funcionCuadratica40.equals(funcionCuadratica60);
        boolean boolean68 = funcionCuadratica28.equals(funcionCuadratica40);
        funcionCuadratica28.setC(1233649.0f);
        boolean boolean71 = funcionCuadratica10.equals(funcionCuadratica28);
        boolean boolean72 = funcionCuadratica3.equals(funcionCuadratica10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+100.0x" + "'", str19.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100000.0f + "'", float24 == 100000.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str35.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 10128.0f + "'", float53 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 131.0f + "'", float55 == 131.0f);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 10.0f + "'", float66 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(104.0f, 1.70024767E17f, 0.0f);
        float float4 = funcionCuadratica3.getC();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica6 = null;
        try {
            boolean boolean7 = funcionCuadratica3.equals(funcionCuadratica6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.890842E34f + "'", float5 == 2.890842E34f);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
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
        funcionCuadratica3.setC(2.90397536E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica10.setA((float) (byte) -1);
        java.lang.String str13 = funcionCuadratica10.toString();
        float float14 = funcionCuadratica10.getC();
        float float15 = funcionCuadratica10.getC();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica10);
        float float18 = funcionCuadratica3.eval((-1.16882259E14f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-1.0x^2+100.0x" + "'", str13.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.3661462E29f + "'", float18 == 1.3661462E29f);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
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
        float float46 = funcionCuadratica22.eval(93201.0f);
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
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 8.6873588E10f + "'", float46 == 8.6873588E10f);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 1, 1.30393536E8f, 1.00180056E8f);
        funcionCuadratica3.setA((-224571.0f));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        funcionCuadratica3.setA(1233649.0f);
        funcionCuadratica3.setB(9.999801E18f);
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica13.setA((float) (byte) -1);
        java.lang.String str16 = funcionCuadratica13.toString();
        float float18 = funcionCuadratica13.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj23 = funcionCuadratica22.raices();
        float float24 = funcionCuadratica22.getC();
        float float25 = funcionCuadratica22.getA();
        boolean boolean26 = funcionCuadratica13.equals(funcionCuadratica22);
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float31 = funcionCuadratica30.getB();
        funcionCuadratica30.setB((float) (byte) -1);
        funcionCuadratica30.setC((float) (byte) 1);
        float float36 = funcionCuadratica30.getA();
        java.lang.String str37 = funcionCuadratica30.toString();
        funcionCuadratica30.setC((float) (byte) 100);
        funcionCuadratica30.setC((float) 1L);
        boolean boolean42 = funcionCuadratica13.equals(funcionCuadratica30);
        java.lang.Object obj43 = funcionCuadratica13.raices();
        funcionCuadratica13.setC((float) (-1));
        float float46 = funcionCuadratica13.getC();
        boolean boolean47 = funcionCuadratica3.equals(funcionCuadratica13);
        float float48 = funcionCuadratica13.getC();
        funcionCuadratica13.setC(1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-1.0x^2+100.0x" + "'", str16.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-11424.0f) + "'", float18 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str37.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-1.0f) + "'", float48 == (-1.0f));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.getA();
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 1.02576384E8f, 0.0f);
        float float4 = funcionCuadratica3.getA();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 540560.0f + "'", float4 == 540560.0f);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        int int13 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        float float11 = funcionCuadratica3.determinante();
        float float13 = funcionCuadratica3.eval(2.94767698E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-39.0f) + "'", float11 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 8.688799E21f + "'", float13 == 8.688799E21f);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, (float) (byte) 100, 2.56012813E17f);
        float float4 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.eval(32.0f);
        funcionCuadratica3.setB(4.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.59004996E17f + "'", float6 == 2.59004996E17f);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(121000.0f);
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        java.lang.Object obj15 = funcionCuadratica13.raices();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        boolean boolean21 = funcionCuadratica13.equals(funcionCuadratica19);
        java.lang.String str22 = funcionCuadratica13.toString();
        float float23 = funcionCuadratica13.getA();
        int int24 = funcionCuadratica13.numRaices();
        funcionCuadratica13.setB(1000.0f);
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica13);
        float float29 = funcionCuadratica13.eval((float) (-1L));
        float float30 = funcionCuadratica13.getA();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x" + "'", str22.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-990.0f) + "'", float29 == (-990.0f));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
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
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float37 = funcionCuadratica36.getB();
        funcionCuadratica36.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica43 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj44 = funcionCuadratica43.raices();
        boolean boolean45 = funcionCuadratica36.equals(funcionCuadratica43);
        java.lang.String str46 = funcionCuadratica36.toString();
        float float47 = funcionCuadratica36.getB();
        funcionCuadratica36.setB(121000.0f);
        float float50 = funcionCuadratica36.getC();
        funcionCuadratica36.setC(3.0313594E21f);
        boolean boolean53 = funcionCuadratica3.equals(funcionCuadratica36);
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
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 100.0f + "'", float37 == 100.0f);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "10.0x^2+-1.0x" + "'", str46.equals("10.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getA();
        int int6 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        funcionCuadratica10.setB((float) (byte) -1);
        funcionCuadratica10.setA((float) '#');
        funcionCuadratica10.setC((float) (short) 100);
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica10);
        float float19 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-152.0f) + "'", float19 == (-152.0f));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
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
        funcionCuadratica3.setA(1.30507776E8f);
        float float22 = funcionCuadratica3.eval(3.0313594E21f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + Float.POSITIVE_INFINITY + "'", float22 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
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
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 0);
        float float35 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        float float15 = funcionCuadratica8.getA();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica8.getClass();
        int int17 = funcionCuadratica8.numRaices();
        funcionCuadratica8.setB(2.1439433E23f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
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
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float48 = funcionCuadratica47.getA();
        boolean boolean49 = funcionCuadratica31.equals(funcionCuadratica47);
        funcionCuadratica47.setC((-152.0f));
        float float53 = funcionCuadratica47.eval(5.21574144E8f);
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
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 10.0f + "'", float48 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 2.720396E18f + "'", float53 == 2.720396E18f);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        float float8 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.eval(8.8604582E8f);
        float float11 = funcionCuadratica3.getA();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 7.850772E18f + "'", float10 == 7.850772E18f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(9.9979908E12f);
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5.9375327E18f, 5.9375327E18f, 6000.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.890842E34f, (-399.0f), 1141477.0f);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.7632299E10f, (-5.089792E9f), 2.0032112E38f);
        funcionCuadratica3.setB((-1.00019989E18f));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
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
        java.lang.String str34 = funcionCuadratica18.toString();
        java.lang.Class<?> wildcardClass35 = funcionCuadratica18.getClass();
        float float37 = funcionCuadratica18.eval(1.70024767E17f);
        float float38 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (-1));
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica18);
        java.lang.String str42 = funcionCuadratica18.toString();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-1.0x^2+100.0x" + "'", str34.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-2.890842E34f) + "'", float37 == (-2.890842E34f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-1.0x^2+-1.0x" + "'", str42.equals("-1.0x^2+-1.0x"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
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
        java.lang.Class<?> wildcardClass41 = funcionCuadratica23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(1.9761783E23f);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float14 = funcionCuadratica12.eval(0.0f);
        funcionCuadratica12.setB((float) 100L);
        float float17 = funcionCuadratica12.getB();
        float float18 = funcionCuadratica12.getB();
        float float19 = funcionCuadratica12.getC();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica12);
        float float22 = funcionCuadratica3.eval(0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        float float15 = funcionCuadratica8.getA();
        float float16 = funcionCuadratica8.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.String str8 = funcionCuadratica3.toString();
        int int9 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.eval(1.00360037E17f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "232.0x^2" + "'", str8.equals("232.0x^2"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.3367358E36f + "'", float11 == 2.3367358E36f);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.02677664E9f, 1.67442702E17f, 10128.0f);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        float float8 = funcionCuadratica3.getA();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float9 = funcionCuadratica3.eval((float) 0);
        float float10 = funcionCuadratica3.getB();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+100.0x" + "'", str11.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        java.lang.Object obj10 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
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
        funcionCuadratica19.setA(1.00009997E9f);
        float float40 = funcionCuadratica19.eval((-1.78430156E17f));
        float float41 = funcionCuadratica19.getB();
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
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + Float.POSITIVE_INFINITY + "'", float40 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
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
        float float23 = funcionCuadratica16.getA();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1.0x^2+100.0x" + "'", str10.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-11424.0f) + "'", float12 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
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
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        funcionCuadratica23.setB((float) (byte) -1);
        funcionCuadratica23.setC((float) (byte) 1);
        float float29 = funcionCuadratica23.getA();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica23);
        java.lang.Class<?> wildcardClass31 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        float float14 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
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
        java.lang.Class<?> wildcardClass36 = funcionCuadratica18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(9.9979908E12f);
        float float9 = funcionCuadratica3.eval(1.31380265E14f);
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica(110.0f, (-4000.0f), (-399996.0f));
        int int14 = funcionCuadratica13.numRaices();
        float float15 = funcionCuadratica13.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica13);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-4000.0f) + "'", float15 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC((float) 0);
        funcionCuadratica3.setB((-800.0f));
        funcionCuadratica3.setB(1.9877746E24f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.62048E8f + "'", float4 == 1.62048E8f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC(999899.0f);
        funcionCuadratica3.setA(1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str10 = funcionCuadratica9.toString();
        funcionCuadratica9.setB((float) '4');
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setB((float) 0);
        float float17 = funcionCuadratica3.eval(132000.0f);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float23 = funcionCuadratica21.eval(0.0f);
        funcionCuadratica21.setB((float) 100L);
        float float26 = funcionCuadratica21.getB();
        java.lang.String str27 = funcionCuadratica21.toString();
        float float28 = funcionCuadratica21.determinante();
        int int29 = funcionCuadratica21.numRaices();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        funcionCuadratica33.setB((float) (byte) -1);
        funcionCuadratica33.setC((float) (byte) 1);
        float float40 = funcionCuadratica33.eval(1.0f);
        funcionCuadratica33.setA((-39.0f));
        funcionCuadratica33.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica48 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float49 = funcionCuadratica48.getB();
        java.lang.Object obj50 = funcionCuadratica48.raices();
        practico5.FuncionCuadratica funcionCuadratica54 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj55 = funcionCuadratica54.raices();
        boolean boolean56 = funcionCuadratica48.equals(funcionCuadratica54);
        java.lang.String str57 = funcionCuadratica48.toString();
        funcionCuadratica48.setB(0.0f);
        float float60 = funcionCuadratica48.determinante();
        java.lang.Class<?> wildcardClass61 = funcionCuadratica48.getClass();
        boolean boolean62 = funcionCuadratica33.equals(funcionCuadratica48);
        practico5.FuncionCuadratica funcionCuadratica66 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float68 = funcionCuadratica66.eval((-11424.0f));
        float float69 = funcionCuadratica66.determinante();
        float float70 = funcionCuadratica66.getC();
        float float72 = funcionCuadratica66.eval(0.0f);
        boolean boolean73 = funcionCuadratica33.equals(funcionCuadratica66);
        boolean boolean74 = funcionCuadratica21.equals(funcionCuadratica66);
        boolean boolean75 = funcionCuadratica3.equals(funcionCuadratica66);
        float float76 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str10.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.74240006E11f + "'", float17 == 1.74240006E11f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 100.0f + "'", float49 == 100.0f);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "10.0x^2+100.0x" + "'", str57.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 1.30393536E8f + "'", float68 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 100.0f + "'", float69 == 100.0f);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 100.0f + "'", float76 == 100.0f);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getB();
        float float10 = funcionCuadratica3.eval(1.30507776E8f);
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.9457676E20f) + "'", float10 == (-1.9457676E20f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-11424.0f) + "'", float11 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.eval(35.0f);
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 12600.0f + "'", float10 == 12600.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 10);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float5 = funcionCuadratica3.eval(9413.0f);
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((-0.0f));
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.getB();
        float float11 = funcionCuadratica3.getC();
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.8604582E8f + "'", float5 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2" + "'", str9.equals("10.0x^2"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-0.0f) + "'", float11 == (-0.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2" + "'", str12.equals("10.0x^2"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+10.0x" + "'", str5.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97329.0f, Float.POSITIVE_INFINITY, 7.8529149E18f);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
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
        java.lang.Object obj18 = funcionCuadratica3.raices();
        float float19 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.30828008E18f + "'", float19 == 2.30828008E18f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
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
        java.lang.Class<?> wildcardClass42 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '4', 9.9999002E8f, (float) (-1));
        funcionCuadratica3.setC(2.56012813E17f);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) (byte) 100);
        funcionCuadratica3.setC((float) (short) 1);
        float float13 = funcionCuadratica3.eval(1.23676657E15f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.5295916E32f + "'", float13 == 1.5295916E32f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100000.0f, (-399996.0f), 1.40576604E11f);
        funcionCuadratica3.setC(6.9643198E10f);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA((float) (-1L));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((float) '4');
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.30393536E8x^2+52.0x+-1.0" + "'", str7.equals("1.30393536E8x^2+52.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.30393536E8f + "'", float8 == 1.30393536E8f);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.62324675E10f, 1.1121001E7f, 1.5999872E7f);
        funcionCuadratica3.setB((-800.0f));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
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
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        java.lang.Class<?> wildcardClass26 = funcionCuadratica24.getClass();
        int int27 = funcionCuadratica24.numRaices();
        java.lang.Class<?> wildcardClass28 = funcionCuadratica24.getClass();
        float float29 = funcionCuadratica24.getC();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica24);
        funcionCuadratica24.setB(10004.0f);
        java.lang.String str33 = funcionCuadratica24.toString();
        java.lang.Object obj34 = funcionCuadratica24.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+10004.0x" + "'", str33.equals("10.0x^2+10004.0x"));
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1015697.0f, 11310.0f, 10272.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getB();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica19.setA((float) (byte) -1);
        funcionCuadratica19.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float28 = funcionCuadratica27.getB();
        funcionCuadratica27.setB((float) (byte) -1);
        funcionCuadratica27.setC((float) (byte) 1);
        boolean boolean33 = funcionCuadratica19.equals(funcionCuadratica27);
        boolean boolean34 = funcionCuadratica12.equals(funcionCuadratica19);
        java.lang.String str35 = funcionCuadratica12.toString();
        float float36 = funcionCuadratica12.getB();
        boolean boolean37 = funcionCuadratica3.equals(funcionCuadratica12);
        float float38 = funcionCuadratica3.getC();
        java.lang.String str39 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+100.0x" + "'", str7.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10.0x^2+10.0x" + "'", str35.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "10.0x^2+100.0x" + "'", str39.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((-2.5732339E37f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.9877746E24f, 7.4079805E10f, 118560.0f);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
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
        practico5.FuncionCuadratica funcionCuadratica32 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float33 = funcionCuadratica32.getB();
        java.lang.Object obj34 = funcionCuadratica32.raices();
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj39 = funcionCuadratica38.raices();
        boolean boolean40 = funcionCuadratica32.equals(funcionCuadratica38);
        java.lang.String str41 = funcionCuadratica32.toString();
        float float42 = funcionCuadratica32.getA();
        int int43 = funcionCuadratica32.numRaices();
        float float44 = funcionCuadratica32.determinante();
        funcionCuadratica32.setB(1.51930253E9f);
        java.lang.Object obj47 = funcionCuadratica32.raices();
        float float48 = funcionCuadratica32.determinante();
        practico5.FuncionCuadratica funcionCuadratica52 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        float float53 = funcionCuadratica52.getC();
        boolean boolean54 = funcionCuadratica32.equals(funcionCuadratica52);
        boolean boolean55 = funcionCuadratica3.equals(funcionCuadratica52);
        float float56 = funcionCuadratica52.getB();
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
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "10.0x^2+100.0x" + "'", str41.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10000.0f + "'", float44 == 10000.0f);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 2.30828008E18f + "'", float48 == 2.30828008E18f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 131.0f + "'", float53 == 131.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 100.0f + "'", float56 == 100.0f);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 10004.0f, 2.0032112E38f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float9 = funcionCuadratica7.eval((-11424.0f));
        funcionCuadratica7.setA(1233649.0f);
        funcionCuadratica7.setB(9.999801E18f);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica17.setA((float) (byte) -1);
        java.lang.String str20 = funcionCuadratica17.toString();
        float float22 = funcionCuadratica17.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj27 = funcionCuadratica26.raices();
        float float28 = funcionCuadratica26.getC();
        float float29 = funcionCuadratica26.getA();
        boolean boolean30 = funcionCuadratica17.equals(funcionCuadratica26);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        funcionCuadratica34.setC((float) (byte) 1);
        float float40 = funcionCuadratica34.getA();
        java.lang.String str41 = funcionCuadratica34.toString();
        funcionCuadratica34.setC((float) (byte) 100);
        funcionCuadratica34.setC((float) 1L);
        boolean boolean46 = funcionCuadratica17.equals(funcionCuadratica34);
        java.lang.Object obj47 = funcionCuadratica17.raices();
        funcionCuadratica17.setC((float) (-1));
        float float50 = funcionCuadratica17.getC();
        boolean boolean51 = funcionCuadratica7.equals(funcionCuadratica17);
        float float52 = funcionCuadratica17.getC();
        boolean boolean53 = funcionCuadratica3.equals(funcionCuadratica17);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.30393536E8f + "'", float9 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-1.0x^2+100.0x" + "'", str20.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-11424.0f) + "'", float22 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str41.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-1.0f) + "'", float52 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.9812082E10f, (float) 1L, 93201.0f);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        float float9 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6.0369695E9f, 121000.0f, 3.27513384E17f);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.72042404E18f, 6.8743594E11f, 8.538379E25f);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.determinante();
        float float13 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-39.0f) + "'", float13 == (-39.0f));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
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
        float float28 = funcionCuadratica20.getC();
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
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
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
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        float float34 = funcionCuadratica3.eval((-1.0303324E35f));
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
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + Float.POSITIVE_INFINITY + "'", float34 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.59996412E11f, 8.674031E23f, 1.07220746E14f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, 1.0f, 11310.0f);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        java.lang.String str10 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        float float16 = funcionCuadratica14.determinante();
        funcionCuadratica14.setB((float) 10L);
        funcionCuadratica14.setA((float) 1);
        funcionCuadratica14.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        boolean boolean27 = funcionCuadratica14.equals(funcionCuadratica26);
        int int28 = funcionCuadratica14.numRaices();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica14);
        float float30 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2+10.0x" + "'", str10.equals("1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        int int14 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(132000.0f);
        funcionCuadratica3.setC((-4000.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
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
        java.lang.String str67 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(4584.0f);
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
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "1.1121001E7x^2" + "'", str67.equals("1.1121001E7x^2"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(60.0f, (-38799.0f), 2.890842E34f);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float4 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 1L, 32.0f, (float) 0);
        boolean boolean9 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica3.setC(2.8919978E36f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.9983808E12f, 561440.0f, 8.8604696E7f);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(2.92205101E12f);
        float float10 = funcionCuadratica3.eval(80232.0f);
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.880975E22f + "'", float10 == 1.880975E22f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2.92205101E12x^2+100.0x" + "'", str11.equals("2.92205101E12x^2+100.0x"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6.554256E34f, 1.00009997E9f, 1.30507776E8f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "6.554256E34x^2+1.00009997E9x+1.30507776E8" + "'", str4.equals("6.554256E34x^2+1.00009997E9x+1.30507776E8"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(262190.0f, (-152.0f), 32.0f);
        funcionCuadratica3.setB((-3.9995961E10f));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10004.0f, (-2.99996037E10f), (-399996.0f));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(232.0f, (float) 1, 540560.0f);
        float float4 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 232.0f + "'", float4 == 232.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399996.0f), 160001.0f, 1.0f);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.8604696E7f, 1.62048E8f, 97329.0f);
        funcionCuadratica3.setC((float) (byte) 1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((float) '4');
        funcionCuadratica3.setC((float) 1L);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.30393536E8f + "'", float9 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
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
        float float22 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.56012813E17f + "'", float22 == 2.56012813E17f);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(97.0f);
        float float11 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(10004.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, 9413.0f, 1.9877746E24f);
        funcionCuadratica3.setA(3.0313594E21f);
        try {
            java.lang.Object obj6 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
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
        float float62 = funcionCuadratica43.eval(1.46409882E11f);
        float float63 = funcionCuadratica43.getB();
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
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 2.1435855E23f + "'", float62 == 2.1435855E23f);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 104.0f + "'", float63 == 104.0f);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
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
        funcionCuadratica3.setC(1.60004E8f);
        float float22 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass23 = funcionCuadratica3.getClass();
        float float24 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-2.04805018E10f) + "'", float24 == (-2.04805018E10f));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
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
        float float31 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
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
        java.lang.String str21 = funcionCuadratica3.toString();
        float float22 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass23 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) 1L);
        float float26 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "262190.0x^2+-1.0x+10.0" + "'", str21.equals("262190.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
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
        java.lang.Object obj18 = funcionCuadratica3.raices();
        float float19 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        float float24 = funcionCuadratica23.getC();
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica23);
        float float26 = funcionCuadratica23.getB();
        float float28 = funcionCuadratica23.eval((-2.04805018E10f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.30828008E18f + "'", float19 == 2.30828008E18f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 131.0f + "'", float24 == 131.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 4.1945094E21f + "'", float28 == 4.1945094E21f);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
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
        java.lang.Class<?> wildcardClass39 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(1.00722185E36f);
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
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
        funcionCuadratica3.setB(9.9999002E8f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float4 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 1L, 32.0f, (float) 0);
        boolean boolean9 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica3.setC((-11424.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
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
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float22 = funcionCuadratica21.getB();
        funcionCuadratica21.setC((float) (byte) 10);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        float float30 = funcionCuadratica28.determinante();
        funcionCuadratica28.setB((float) 10L);
        boolean boolean33 = funcionCuadratica21.equals(funcionCuadratica28);
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica21);
        java.lang.Class<?> wildcardClass35 = funcionCuadratica21.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10000.0f + "'", float30 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(15610.0f, (-1276.0f), 2.8919978E36f);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
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
        float float18 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.60004E8f + "'", float16 == 1.60004E8f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int18 = funcionCuadratica17.numRaices();
        java.lang.Object obj19 = funcionCuadratica17.raices();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica17);
        java.lang.Object obj21 = funcionCuadratica17.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
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
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        float float34 = funcionCuadratica28.getA();
        float float35 = funcionCuadratica28.getA();
        float float36 = funcionCuadratica28.getA();
        float float37 = funcionCuadratica28.determinante();
        boolean boolean38 = funcionCuadratica17.equals(funcionCuadratica28);
        float float39 = funcionCuadratica17.getB();
        java.lang.String str40 = funcionCuadratica17.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-39.0f) + "'", float37 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "10.0x^2+100.0x+10.0" + "'", str40.equals("10.0x^2+100.0x+10.0"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
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
        funcionCuadratica21.setB((-11424.0f));
        practico5.FuncionCuadratica funcionCuadratica70 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float72 = funcionCuadratica70.eval(0.0f);
        int int73 = funcionCuadratica70.numRaices();
        float float74 = funcionCuadratica70.getC();
        java.lang.String str75 = funcionCuadratica70.toString();
        float float76 = funcionCuadratica70.getC();
        java.lang.String str77 = funcionCuadratica70.toString();
        boolean boolean78 = funcionCuadratica21.equals(funcionCuadratica70);
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
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "10.0x^2+10.0x" + "'", str75.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.0f + "'", float76 == 0.0f);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "10.0x^2+10.0x" + "'", str77.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4584.0f, 10816.0f, 12.0f);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getA();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        float float15 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
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
        float float19 = funcionCuadratica3.eval((float) '#');
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        java.lang.String str21 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str21.equals("10.0x^2+2.0x+1.0"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        java.lang.String str11 = funcionCuadratica3.toString();
        int int12 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5.6987436E7f, 2.56012813E17f, 1001001.0f);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        java.lang.String str15 = funcionCuadratica3.toString();
        java.lang.String str16 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+2.0x" + "'", str15.equals("10.0x^2+2.0x"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+2.0x" + "'", str16.equals("10.0x^2+2.0x"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
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
        funcionCuadratica3.setC((-1.16882259E14f));
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
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setC(10000.0f);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(6.8743594E11f);
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica18.setA((float) (byte) -1);
        funcionCuadratica18.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float27 = funcionCuadratica26.getB();
        funcionCuadratica26.setB((float) (byte) -1);
        funcionCuadratica26.setC((float) (byte) 1);
        boolean boolean32 = funcionCuadratica18.equals(funcionCuadratica26);
        boolean boolean33 = funcionCuadratica14.equals(funcionCuadratica18);
        java.lang.String str34 = funcionCuadratica18.toString();
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean39 = funcionCuadratica18.equals(funcionCuadratica38);
        float float41 = funcionCuadratica18.eval((-38799.0f));
        int int42 = funcionCuadratica18.numRaices();
        float float43 = funcionCuadratica18.determinante();
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float48 = funcionCuadratica47.getB();
        funcionCuadratica47.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica54 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj55 = funcionCuadratica54.raices();
        boolean boolean56 = funcionCuadratica47.equals(funcionCuadratica54);
        java.lang.Class<?> wildcardClass57 = funcionCuadratica47.getClass();
        java.lang.Class<?> wildcardClass58 = funcionCuadratica47.getClass();
        funcionCuadratica47.setA(199.0f);
        java.lang.String str61 = funcionCuadratica47.toString();
        float float62 = funcionCuadratica47.getB();
        practico5.FuncionCuadratica funcionCuadratica66 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float67 = funcionCuadratica66.getA();
        int int68 = funcionCuadratica66.numRaices();
        float float69 = funcionCuadratica66.determinante();
        boolean boolean70 = funcionCuadratica47.equals(funcionCuadratica66);
        java.lang.Object obj71 = funcionCuadratica47.raices();
        boolean boolean72 = funcionCuadratica18.equals(funcionCuadratica47);
        boolean boolean73 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-1.0x^2+100.0x" + "'", str34.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.50924237E9f) + "'", float41 == (-1.50924237E9f));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10000.0f + "'", float43 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "199.0x^2+-1.0x" + "'", str61.equals("199.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + (-1.0f) + "'", float62 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 10.0f + "'", float67 == 10.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + (-399996.0f) + "'", float69 == (-399996.0f));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(999899.0f);
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.getC();
        try {
            java.lang.Object obj9 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-3.9995961E10f) + "'", float7 == (-3.9995961E10f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float9 = funcionCuadratica3.eval((float) 0);
        float float10 = funcionCuadratica3.getA();
        funcionCuadratica3.setC((-1.50574944E8f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
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
        float float17 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
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
        java.lang.String str16 = funcionCuadratica10.toString();
        java.lang.Object obj17 = funcionCuadratica10.raices();
        float float19 = funcionCuadratica10.eval(210.0f);
        funcionCuadratica10.setA(3.2012794E37f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+10.0x" + "'", str16.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 443100.0f + "'", float19 == 443100.0f);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9413.0f, (float) 10L, 157.0f);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 100);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        float float12 = funcionCuadratica3.eval((float) (-1L));
        java.lang.String str13 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str13.equals("10.0x^2+100.0x+100.0"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setA(2.1435855E23f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica(157.0f, 999899.0f, 999899.0f);
        float float8 = funcionCuadratica7.getB();
        funcionCuadratica7.setC(171610.0f);
        float float11 = funcionCuadratica7.getB();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica3.setA(6.0369695E9f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 999899.0f + "'", float8 == 999899.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 999899.0f + "'", float11 == 999899.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-152.0f), (-224571.0f), 1.74241333E11f);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(110.0f);
        funcionCuadratica3.setB((-152.0f));
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica19.setB((float) (byte) 0);
        float float22 = funcionCuadratica19.getC();
        java.lang.Object obj23 = funcionCuadratica19.raices();
        funcionCuadratica19.setA((float) 'a');
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica19);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (-0.0f) + "'", obj23.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
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
        funcionCuadratica3.setA(1141477.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
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
        funcionCuadratica31.setC(9506.0f);
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
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.eval(7.850772E18f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + Float.POSITIVE_INFINITY + "'", float10 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        java.lang.Class<?> wildcardClass17 = funcionCuadratica12.getClass();
        float float18 = funcionCuadratica12.getC();
        funcionCuadratica12.setA(110.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(5.2230605E9f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.30393536E8f + "'", float6 == 1.30393536E8f);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setC(110.0f);
        float float17 = funcionCuadratica3.getC();
        float float18 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 110.0f + "'", float17 == 110.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        funcionCuadratica9.setC(10.0f);
        int int15 = funcionCuadratica9.numRaices();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica9.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (-39.0f), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(1001097.0f);
        float float8 = funcionCuadratica3.determinante();
        int int9 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+-39.0x+-1.0" + "'", str4.equals("10.0x^2+-39.0x+-1.0"));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.00219519E12f + "'", float8 == 1.00219519E12f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(262190.0f);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica11.setA((float) (byte) -1);
        java.lang.String str14 = funcionCuadratica11.toString();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        funcionCuadratica18.setC((float) (byte) 1);
        float float25 = funcionCuadratica18.eval(1.0f);
        funcionCuadratica18.setA((-39.0f));
        funcionCuadratica18.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        java.lang.Object obj35 = funcionCuadratica33.raices();
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        boolean boolean41 = funcionCuadratica33.equals(funcionCuadratica39);
        java.lang.String str42 = funcionCuadratica33.toString();
        funcionCuadratica33.setB(0.0f);
        float float45 = funcionCuadratica33.determinante();
        java.lang.Class<?> wildcardClass46 = funcionCuadratica33.getClass();
        boolean boolean47 = funcionCuadratica18.equals(funcionCuadratica33);
        boolean boolean48 = funcionCuadratica11.equals(funcionCuadratica33);
        funcionCuadratica33.setB(121000.0f);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica33.getClass();
        boolean boolean52 = funcionCuadratica3.equals(funcionCuadratica33);
        java.lang.Class<?> wildcardClass53 = funcionCuadratica33.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-1.0x^2+100.0x" + "'", str14.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+100.0x" + "'", str42.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica15);
        float float17 = funcionCuadratica15.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 9.9999002E8f + "'", float17 == 9.9999002E8f);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) (byte) 100);
        funcionCuadratica3.setC((float) (short) 1);
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval(2.890842E34f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + Float.POSITIVE_INFINITY + "'", float14 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 1L);
        float float11 = funcionCuadratica3.getA();
        java.lang.String str12 = funcionCuadratica3.toString();
        java.lang.Object obj13 = funcionCuadratica3.raices();
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+1.0x" + "'", str12.equals("10.0x^2+1.0x"));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
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
        float float26 = funcionCuadratica17.getC();
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
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5.2230605E9f, (-399.0f), (float) '4');
        float float4 = funcionCuadratica3.getB();
        try {
            java.lang.Object obj5 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-399.0f) + "'", float4 == (-399.0f));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
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
        funcionCuadratica20.setB(4584.0f);
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
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
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
        java.lang.String str67 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) 100);
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
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "1.1121001E7x^2" + "'", str67.equals("1.1121001E7x^2"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        float float5 = funcionCuadratica3.eval(1.23676657E15f);
        float float6 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.5295915E31f + "'", float5 == 1.5295915E31f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 131.0f + "'", float6 == 131.0f);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getC();
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, (-4000.0f), (float) ' ');
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-4000.0f) + "'", float4 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        float float15 = funcionCuadratica3.getB();
        float float17 = funcionCuadratica3.eval(999899.0f);
        java.lang.String str18 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 401.0f + "'", float15 == 401.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 9.9983808E12f + "'", float17 == 9.9983808E12f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+401.0x+1.0" + "'", str18.equals("10.0x^2+401.0x+1.0"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(110.0f);
        float float7 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.eval(1.40576604E11f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 110.0f + "'", float8 == 110.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.9761782E22f) + "'", float10 == (-1.9761782E22f));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(199.0f);
        java.lang.String str17 = funcionCuadratica3.toString();
        float float18 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(2.5758312E33f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "199.0x^2+-1.0x" + "'", str17.equals("199.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, 2.9451708E11f, 210.0f);
        funcionCuadratica3.setC(2.62324675E10f);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(5.3940816E16f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6000.0f + "'", float10 == 6000.0f);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setC(10000.0f);
        funcionCuadratica3.setC(1.30507776E8f);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(2.8908421E35f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
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
        funcionCuadratica3.setB((-4000.0f));
        float float36 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(56143.0f);
        funcionCuadratica3.setB(8.8604696E7f);
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.747702E27f, (float) (short) 10, (-38799.0f));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
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
        funcionCuadratica3.setB((-240000.0f));
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
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        funcionCuadratica10.setB((float) (byte) -1);
        funcionCuadratica10.setC((float) (byte) 1);
        float float17 = funcionCuadratica10.eval(1.0f);
        funcionCuadratica10.setA((-39.0f));
        funcionCuadratica10.setC((float) 1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        java.lang.Object obj27 = funcionCuadratica25.raices();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        boolean boolean33 = funcionCuadratica25.equals(funcionCuadratica31);
        java.lang.String str34 = funcionCuadratica25.toString();
        funcionCuadratica25.setB(0.0f);
        float float37 = funcionCuadratica25.determinante();
        java.lang.Class<?> wildcardClass38 = funcionCuadratica25.getClass();
        boolean boolean39 = funcionCuadratica10.equals(funcionCuadratica25);
        boolean boolean40 = funcionCuadratica3.equals(funcionCuadratica25);
        funcionCuadratica3.setA(2.0f);
        funcionCuadratica3.setC(12.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+100.0x" + "'", str34.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
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
        funcionCuadratica18.setA(100.0f);
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica29.setB((float) (byte) 0);
        funcionCuadratica29.setC(10000.0f);
        funcionCuadratica29.setB(1.00360449E17f);
        boolean boolean36 = funcionCuadratica18.equals(funcionCuadratica29);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+100.0x" + "'", str20.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0316759E12f, 34.0f, 1.46409882E11f);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
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
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj47 = funcionCuadratica46.raices();
        java.lang.String str48 = funcionCuadratica46.toString();
        java.lang.Object obj49 = funcionCuadratica46.raices();
        boolean boolean50 = funcionCuadratica10.equals(funcionCuadratica46);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica46.getClass();
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
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "10.0x^2+100.0x" + "'", str48.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
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
        funcionCuadratica32.setA((-39.0f));
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
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
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        java.lang.Class<?> wildcardClass25 = funcionCuadratica24.getClass();
        float float26 = funcionCuadratica24.getA();
        float float27 = funcionCuadratica24.getA();
        funcionCuadratica24.setA((-4.159E7f));
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica24);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, (float) 1, 9413.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        java.lang.String str10 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        float float18 = funcionCuadratica16.getC();
        float float19 = funcionCuadratica16.getA();
        boolean boolean20 = funcionCuadratica7.equals(funcionCuadratica16);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        funcionCuadratica24.setB((float) (byte) -1);
        funcionCuadratica24.setC((float) (byte) 1);
        float float30 = funcionCuadratica24.getA();
        java.lang.String str31 = funcionCuadratica24.toString();
        funcionCuadratica24.setC((float) (byte) 100);
        funcionCuadratica24.setC((float) 1L);
        boolean boolean36 = funcionCuadratica7.equals(funcionCuadratica24);
        funcionCuadratica7.setC(0.0f);
        float float40 = funcionCuadratica7.eval(1.00009997E9f);
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica3.setC((-399996.0f));
        int int44 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1.0x^2+100.0x" + "'", str10.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-11424.0f) + "'", float12 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str31.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.00019989E18f) + "'", float40 == (-1.00019989E18f));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
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
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        java.lang.String str28 = funcionCuadratica19.toString();
        funcionCuadratica19.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj42 = funcionCuadratica41.raices();
        boolean boolean43 = funcionCuadratica34.equals(funcionCuadratica41);
        java.lang.Class<?> wildcardClass44 = funcionCuadratica34.getClass();
        boolean boolean45 = funcionCuadratica19.equals(funcionCuadratica34);
        funcionCuadratica34.setC(1.30393536E8f);
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica34);
        try {
            java.lang.Object obj49 = funcionCuadratica34.raices();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+100.0x" + "'", str28.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x+1.0" + "'", str10.equals("10.0x^2+100.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica20.setA((float) (byte) -1);
        funcionCuadratica20.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float29 = funcionCuadratica28.getB();
        funcionCuadratica28.setB((float) (byte) -1);
        funcionCuadratica28.setC((float) (byte) 1);
        boolean boolean34 = funcionCuadratica20.equals(funcionCuadratica28);
        boolean boolean35 = funcionCuadratica16.equals(funcionCuadratica20);
        java.lang.String str36 = funcionCuadratica20.toString();
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean41 = funcionCuadratica20.equals(funcionCuadratica40);
        float float43 = funcionCuadratica20.eval((-38799.0f));
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float48 = funcionCuadratica47.getB();
        funcionCuadratica47.setB((float) (byte) -1);
        funcionCuadratica47.setC((float) (byte) 1);
        float float53 = funcionCuadratica47.getA();
        float float54 = funcionCuadratica47.getC();
        java.lang.String str55 = funcionCuadratica47.toString();
        float float56 = funcionCuadratica47.determinante();
        java.lang.Class<?> wildcardClass57 = funcionCuadratica47.getClass();
        float float58 = funcionCuadratica47.getC();
        float float60 = funcionCuadratica47.eval((-4000.0f));
        funcionCuadratica47.setA(100.0f);
        boolean boolean63 = funcionCuadratica20.equals(funcionCuadratica47);
        boolean boolean64 = funcionCuadratica3.equals(funcionCuadratica47);
        float float66 = funcionCuadratica3.eval(10128.0f);
        funcionCuadratica3.setC(5.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-1.0x^2+100.0x" + "'", str36.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-1.50924237E9f) + "'", float43 == (-1.50924237E9f));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 10.0f + "'", float53 == 10.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str55.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-39.0f) + "'", float56 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 1.0f + "'", float58 == 1.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 1.60004E8f + "'", float60 == 1.60004E8f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 1.02677664E9f + "'", float66 == 1.02677664E9f);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        try {
            java.lang.Object obj8 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-800.0f) + "'", float4 == (-800.0f));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-800.0f) + "'", float6 == (-800.0f));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
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
        funcionCuadratica28.setB(1.9877746E24f);
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
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(199.0f);
        java.lang.String str17 = funcionCuadratica3.toString();
        float float18 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "199.0x^2+-1.0x" + "'", str17.equals("199.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(12321.0f);
        funcionCuadratica3.setC(118560.0f);
        funcionCuadratica3.setA(9.9980119E13f);
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "9.9980119E13x^2+12321.0x+118560.0" + "'", str12.equals("9.9980119E13x^2+12321.0x+118560.0"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-0.0f) + "'", obj6.equals((-0.0f)));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
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
        funcionCuadratica3.setC((float) 10);
        float float24 = funcionCuadratica3.eval(0.0f);
        float float25 = funcionCuadratica3.getB();
        float float26 = funcionCuadratica3.getC();
        java.lang.String str27 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str20.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "1.0x^2+10.0x+10.0" + "'", str27.equals("1.0x^2+10.0x+10.0"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(34.0f);
        funcionCuadratica3.setA(157.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
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
        java.lang.String str67 = funcionCuadratica3.toString();
        float float68 = funcionCuadratica3.getB();
        float float69 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "1.1121001E7x^2" + "'", str67.equals("1.1121001E7x^2"));
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.0f + "'", float68 == 0.0f);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 0.0f + "'", float69 == 0.0f);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        int int14 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(132000.0f);
        funcionCuadratica3.setB(1.0726502E36f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getB();
        float float12 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(1.04000002E12f);
        float float15 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 9600.0f + "'", float12 == 9600.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.04000002E12f + "'", float15 == 1.04000002E12f);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str13 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(9600.0f);
        float float17 = funcionCuadratica3.eval(232.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+-1.0x" + "'", str13.equals("10.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2765440.0f + "'", float17 == 2765440.0f);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1276.0f), 215940.0f, 9.9980119E13f);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
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
        funcionCuadratica3.setA(110.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1001097.0f + "'", float21 == 1001097.0f);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
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
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        float float20 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
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
        int int30 = funcionCuadratica3.numRaices();
        float float31 = funcionCuadratica3.getC();
        float float32 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica36 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica36.setA((float) (byte) -1);
        funcionCuadratica36.setC((float) 0);
        java.lang.Object obj41 = funcionCuadratica36.raices();
        funcionCuadratica36.setC((float) 10L);
        boolean boolean44 = funcionCuadratica3.equals(funcionCuadratica36);
        funcionCuadratica36.setC((-2.04805018E10f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(9.9979908E12f);
        float float9 = funcionCuadratica3.eval(1.31380265E14f);
        int int10 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + Float.POSITIVE_INFINITY + "'", float9 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica12.setB((float) 0L);
        float float15 = funcionCuadratica12.getB();
        float float16 = funcionCuadratica12.getC();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica12);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+10.0x" + "'", str11.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-2.890842E34f), 0.0f, (-30352.0f));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float8 = funcionCuadratica7.getA();
        int int9 = funcionCuadratica7.numRaices();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(157.0f, 999899.0f, 999899.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(171610.0f);
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.determinante();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 999899.0f + "'", float4 == 999899.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.9969027E11f + "'", float8 == 9.9969027E11f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 157.0f + "'", float10 == 157.0f);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
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
        funcionCuadratica19.setA(1.00009997E9f);
        float float40 = funcionCuadratica19.eval((-1.78430156E17f));
        funcionCuadratica19.setB(1.00009997E9f);
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
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + Float.POSITIVE_INFINITY + "'", float40 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
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
        float float24 = funcionCuadratica3.eval((-240000.0f));
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + Float.NEGATIVE_INFINITY + "'", float24 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        funcionCuadratica3.setA(104.0f);
        funcionCuadratica3.setB(0.0f);
        float float12 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10L);
        java.lang.String str15 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "104.0x^2+10.0" + "'", str15.equals("104.0x^2+10.0"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica10.raices();
        funcionCuadratica10.setC(1.5295916E32f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) (byte) 100);
        funcionCuadratica3.setC((float) (short) 1);
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float14 = funcionCuadratica3.eval(1.70024741E16f);
        int int15 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.8908413E34f + "'", float14 == 2.8908413E34f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(199.0f);
        java.lang.String str17 = funcionCuadratica3.toString();
        float float18 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float23 = funcionCuadratica22.getA();
        int int24 = funcionCuadratica22.numRaices();
        float float25 = funcionCuadratica22.determinante();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        funcionCuadratica22.setC(5.21574144E8f);
        float float29 = funcionCuadratica22.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "199.0x^2+-1.0x" + "'", str17.equals("199.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-399996.0f) + "'", float25 == (-399996.0f));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 5.21574144E8f + "'", float29 == 5.21574144E8f);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
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
        float float50 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 10000.0f + "'", float50 == 10000.0f);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
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
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        java.lang.String str33 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((-1.00019989E18f));
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
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str33.equals("32.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
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
        java.lang.String str16 = funcionCuadratica10.toString();
        java.lang.Object obj17 = funcionCuadratica10.raices();
        float float19 = funcionCuadratica10.eval(210.0f);
        funcionCuadratica10.setB(1.00180056E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+10.0x" + "'", str16.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 443100.0f + "'", float19 == 443100.0f);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float13 = funcionCuadratica3.eval((float) (byte) 1);
        float float14 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 110.0f + "'", float13 == 110.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getA();
        funcionCuadratica3.setC((-5.089792E9f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(199.0f);
        java.lang.String str17 = funcionCuadratica3.toString();
        float float18 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float23 = funcionCuadratica22.getA();
        int int24 = funcionCuadratica22.numRaices();
        float float25 = funcionCuadratica22.determinante();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica22);
        float float27 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "199.0x^2+-1.0x" + "'", str17.equals("199.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-399996.0f) + "'", float25 == (-399996.0f));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100, 1.30308388E12f, 5.3940816E16f);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.0206513E16f, 1.628176E7f, 1.46422104E11f);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '#', 3.0360044E23f, 9413.0f);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.00079956E18f, 10272.0f, (-4.00039987E9f));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
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
        float float27 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
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
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj47 = funcionCuadratica46.raices();
        java.lang.String str48 = funcionCuadratica46.toString();
        java.lang.Object obj49 = funcionCuadratica46.raices();
        boolean boolean50 = funcionCuadratica10.equals(funcionCuadratica46);
        float float51 = funcionCuadratica10.getB();
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
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "10.0x^2+100.0x" + "'", str48.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 104.0f + "'", float51 == 104.0f);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
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
        funcionCuadratica3.setC((-90.0f));
        int int29 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((float) '4');
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.30393536E8f + "'", float7 == 1.30393536E8f);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 10004.0f, 2.0032112E38f);
        funcionCuadratica3.setA(1.62048E8f);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.getC();
        float float12 = funcionCuadratica9.getC();
        float float13 = funcionCuadratica9.getB();
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        funcionCuadratica18.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica18.equals(funcionCuadratica25);
        float float28 = funcionCuadratica25.getA();
        boolean boolean29 = funcionCuadratica9.equals(funcionCuadratica25);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) (-1L), (float) (byte) -1, (float) 100L);
        java.lang.Object obj34 = funcionCuadratica33.raices();
        java.lang.Class<?> wildcardClass35 = funcionCuadratica33.getClass();
        float float36 = funcionCuadratica33.determinante();
        boolean boolean37 = funcionCuadratica25.equals(funcionCuadratica33);
        funcionCuadratica25.setB(1.2054106E25f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 401.0f + "'", float36 == 401.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(131.0f, (-1.26785096E8f), 5648.0f);
        float float5 = funcionCuadratica3.eval(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertEquals((float) float5, Float.NaN, 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getA();
        float float5 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        float float14 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(9.9999002E8f);
        float float9 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 2.0f, 15610.0f);
        funcionCuadratica3.setB(4.00079956E18f);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(8.6488737E11f);
        float float10 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x" + "'", str7.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
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
        funcionCuadratica30.setC(5.3940816E16f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-399.0f) + "'", float31 == (-399.0f));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
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
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        java.lang.String str21 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(1000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "10.0x^2+100.0x" + "'", str21.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, (float) (byte) 100, 2.56012813E17f);
        float float4 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.eval(32.0f);
        float float8 = funcionCuadratica3.eval(12321.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.59004996E17f + "'", float6 == 2.59004996E17f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 4.4384392E20f + "'", float8 == 4.4384392E20f);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
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
        funcionCuadratica3.setB((-4000.0f));
        java.lang.Class<?> wildcardClass36 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        funcionCuadratica40.setB((float) (byte) -1);
        funcionCuadratica40.setC((float) (byte) 1);
        float float46 = funcionCuadratica40.getA();
        java.lang.String str47 = funcionCuadratica40.toString();
        float float48 = funcionCuadratica40.getC();
        float float49 = funcionCuadratica40.getC();
        float float51 = funcionCuadratica40.eval(0.0f);
        boolean boolean52 = funcionCuadratica3.equals(funcionCuadratica40);
        float float53 = funcionCuadratica3.getC();
        float float55 = funcionCuadratica3.eval(1.00180056E8f);
        float float57 = funcionCuadratica3.eval((float) '4');
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
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str47.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.00360037E17f + "'", float55 == 1.00360037E17f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + (-180960.0f) + "'", float57 == (-180960.0f));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(110.0f);
        float float14 = funcionCuadratica3.getA();
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 110.0f + "'", float15 == 110.0f);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getB();
        float float13 = funcionCuadratica3.eval(2.5758312E33f);
        float float14 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + Float.POSITIVE_INFINITY + "'", float13 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
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
        float float28 = funcionCuadratica26.getC();
        float float29 = funcionCuadratica26.getC();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        float float35 = funcionCuadratica33.determinante();
        boolean boolean36 = funcionCuadratica26.equals(funcionCuadratica33);
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float41 = funcionCuadratica40.getB();
        float float42 = funcionCuadratica40.determinante();
        funcionCuadratica40.setB((float) 10L);
        boolean boolean45 = funcionCuadratica33.equals(funcionCuadratica40);
        boolean boolean46 = funcionCuadratica7.equals(funcionCuadratica40);
        funcionCuadratica7.setB((float) 0L);
        float float49 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10000.0f + "'", float35 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10000.0f + "'", float42 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.998104E14f, 10305.0f, 4.0f);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.7632299E10f, (-5.089792E9f), 2.0032112E38f);
        try {
            java.lang.Object obj4 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
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
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        float float26 = funcionCuadratica24.getC();
        float float27 = funcionCuadratica24.getC();
        java.lang.Object obj28 = funcionCuadratica24.raices();
        float float29 = funcionCuadratica24.getA();
        java.lang.Object obj30 = funcionCuadratica24.raices();
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica24);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0726502E36f, (float) 'a', 34.0f);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        funcionCuadratica3.setA(104.0f);
        funcionCuadratica3.setB(0.0f);
        float float12 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10L);
        float float15 = funcionCuadratica3.getC();
        int int16 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(2.92205652E12f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
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
        funcionCuadratica3.setC(1.60004E8f);
        java.lang.String str30 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass31 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-68.0x^2+100.0x+1.60004E8" + "'", str30.equals("-68.0x^2+100.0x+1.60004E8"));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
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
        practico5.FuncionCuadratica funcionCuadratica52 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str53 = funcionCuadratica52.toString();
        funcionCuadratica52.setB((float) '4');
        funcionCuadratica52.setC((float) 1L);
        funcionCuadratica52.setB(Float.POSITIVE_INFINITY);
        float float61 = funcionCuadratica52.eval(2.2661277E21f);
        float float63 = funcionCuadratica52.eval(9999001.0f);
        boolean boolean64 = funcionCuadratica26.equals(funcionCuadratica52);
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
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str53.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + Float.POSITIVE_INFINITY + "'", float61 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + Float.POSITIVE_INFINITY + "'", float63 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.70024767E17f, (-4000.0f), 2.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        float float9 = funcionCuadratica7.getC();
        float float10 = funcionCuadratica7.getC();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        float float16 = funcionCuadratica14.determinante();
        boolean boolean17 = funcionCuadratica7.equals(funcionCuadratica14);
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica14);
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        float float24 = funcionCuadratica22.determinante();
        funcionCuadratica22.setB((float) 10L);
        funcionCuadratica22.setA((float) 1);
        funcionCuadratica22.setC((float) (byte) -1);
        float float31 = funcionCuadratica22.getC();
        float float32 = funcionCuadratica22.determinante();
        float float33 = funcionCuadratica22.getB();
        boolean boolean34 = funcionCuadratica14.equals(funcionCuadratica22);
        funcionCuadratica14.setA((-1.0003998E36f));
        float float38 = funcionCuadratica14.eval(8.9558088E7f);
        float float39 = funcionCuadratica14.determinante();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10000.0f + "'", float24 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 104.0f + "'", float32 == 104.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + Float.NEGATIVE_INFINITY + "'", float38 == Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10000.0f + "'", float39 == 10000.0f);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
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
        float float15 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 99901.0f + "'", float14 == 99901.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 99901.0f + "'", float15 == 99901.0f);
    }
}

