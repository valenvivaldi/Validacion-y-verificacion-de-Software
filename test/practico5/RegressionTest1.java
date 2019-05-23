package practico5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.determinante();
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
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        funcionCuadratica33.setB((float) (byte) -1);
        funcionCuadratica33.setC((float) (byte) 1);
        float float39 = funcionCuadratica33.getB();
        boolean boolean40 = funcionCuadratica16.equals(funcionCuadratica33);
        funcionCuadratica16.setB(100000.0f);
        float float44 = funcionCuadratica16.eval(110.0f);
        boolean boolean45 = funcionCuadratica3.equals(funcionCuadratica16);
        float float46 = funcionCuadratica16.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str23.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 12216.0f + "'", float27 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-1.0f) + "'", float29 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.1121001E7f + "'", float44 == 1.1121001E7f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100000.0f + "'", float46 == 100000.0f);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        funcionCuadratica9.setB((float) (byte) -1);
        funcionCuadratica9.setC((float) (byte) 1);
        float float15 = funcionCuadratica9.getA();
        java.lang.String str16 = funcionCuadratica9.toString();
        float float17 = funcionCuadratica9.getC();
        funcionCuadratica9.setC((float) 2);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((-39.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str16.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
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
        java.lang.Object obj16 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 104.0f + "'", float15 == 104.0f);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, (float) (short) 1, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-38799.0f) + "'", float4 == (-38799.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        int int14 = funcionCuadratica3.numRaices();
        java.lang.String str15 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(32.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+100.0x" + "'", str15.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(34.0f);
        float float7 = funcionCuadratica3.getA();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
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
        float float26 = funcionCuadratica3.eval(9999001.0f);
        float float27 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0x^2+100.0x" + "'", str7.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-9.997902E13f) + "'", float26 == (-9.997902E13f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 10);
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x+10.0" + "'", str7.equals("10.0x^2+10.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-300.0f) + "'", float8 == (-300.0f));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
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
        java.lang.Object obj58 = funcionCuadratica48.raices();
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
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(8.674031E23f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
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
        float float28 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 4584.0f + "'", float28 == 4584.0f);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float13 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        float float15 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        int int6 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA((float) (short) 10);
        funcionCuadratica3.setA(1.00180056E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setC(97.0f);
        java.lang.Class<?> wildcardClass17 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(8.9558088E7f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
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
        float float18 = funcionCuadratica3.getA();
        float float20 = funcionCuadratica3.eval(121000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.46409882E11f + "'", float20 == 1.46409882E11f);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+100.0x" + "'", str11.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
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
        float float39 = funcionCuadratica26.getA();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str38.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(1.23676657E15f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
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
        float float44 = funcionCuadratica9.getA();
        float float45 = funcionCuadratica9.determinante();
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 97.0f + "'", float44 == 97.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10000.0f + "'", float45 == 10000.0f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
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
        float float41 = funcionCuadratica28.getA();
        int int42 = funcionCuadratica28.numRaices();
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
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
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
        int int20 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(199.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str19.equals("10.0x^2+2.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
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
        float float22 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(1001001.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        funcionCuadratica13.setB((float) (byte) -1);
        funcionCuadratica13.setC((float) (byte) 1);
        java.lang.String str19 = funcionCuadratica13.toString();
        float float20 = funcionCuadratica13.getC();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int25 = funcionCuadratica24.numRaices();
        float float26 = funcionCuadratica24.getB();
        float float27 = funcionCuadratica24.getA();
        float float29 = funcionCuadratica24.eval((float) 1);
        boolean boolean30 = funcionCuadratica13.equals(funcionCuadratica24);
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica13);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+100.0x" + "'", str8.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str19.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 1L);
        float float11 = funcionCuadratica3.getA();
        java.lang.String str12 = funcionCuadratica3.toString();
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(1.30507776E8f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+1.0x" + "'", str12.equals("10.0x^2+1.0x"));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        funcionCuadratica3.setA(10816.0f);
        try {
            java.lang.Object obj6 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(1.50536632E10f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
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
        float float30 = funcionCuadratica3.eval(540560.0f);
        funcionCuadratica3.setB((-1.74107996E10f));
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
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 2.92205101E12f + "'", float30 == 2.92205101E12f);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-2.890842E34f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        funcionCuadratica3.setA(104.0f);
        funcionCuadratica3.setB(0.0f);
        float float12 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10L);
        float float16 = funcionCuadratica3.eval(100000.0f);
        funcionCuadratica3.setA(400.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.04000002E12f + "'", float16 == 1.04000002E12f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.determinante();
        int int13 = funcionCuadratica3.numRaices();
        float float15 = funcionCuadratica3.eval(15610.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.43670528E9f + "'", float15 == 2.43670528E9f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
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
        java.lang.Class<?> wildcardClass24 = funcionCuadratica10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
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
        java.lang.Class<?> wildcardClass28 = funcionCuadratica7.getClass();
        java.lang.String str29 = funcionCuadratica7.toString();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str14.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str29.equals("10.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(5.6987436E7f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str9.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2000.0f, 5.0f, 0.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
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
        float float22 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str20.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
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
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        float float21 = funcionCuadratica19.getC();
        float float22 = funcionCuadratica19.getB();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica26.setA((float) (byte) -1);
        funcionCuadratica26.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        funcionCuadratica34.setC((float) (byte) 1);
        boolean boolean40 = funcionCuadratica26.equals(funcionCuadratica34);
        boolean boolean41 = funcionCuadratica19.equals(funcionCuadratica26);
        java.lang.String str42 = funcionCuadratica19.toString();
        java.lang.Object obj43 = funcionCuadratica19.raices();
        float float44 = funcionCuadratica19.getB();
        float float45 = funcionCuadratica19.determinante();
        boolean boolean46 = funcionCuadratica3.equals(funcionCuadratica19);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "10.0x^2+10.0x" + "'", str42.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 2);
        funcionCuadratica3.setC((float) 1L);
        float float14 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(1233649.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval(540560.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.92205652E12f + "'", float8 == 2.92205652E12f);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
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
        java.lang.Class<?> wildcardClass49 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
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
        funcionCuadratica3.setA((-40.0f));
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(99901.0f, 1.30393536E8f, 35.0f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
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
        float float24 = funcionCuadratica10.getC();
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(1.9761783E23f);
        funcionCuadratica3.setB(262190.0f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
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
        int int26 = funcionCuadratica9.numRaices();
        java.lang.Object obj27 = funcionCuadratica9.raices();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float6 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(8.689414E23f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(199.0f, 2.8908421E35f, (-1276.0f));
        funcionCuadratica3.setB((float) (byte) 1);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, (float) (short) 1, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-38799.0f) + "'", float4 == (-38799.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(12216.0f, (-1.74107996E10f), 10816.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        float float9 = funcionCuadratica7.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        funcionCuadratica13.setB((float) (byte) -1);
        funcionCuadratica13.setC((float) (byte) 1);
        float float19 = funcionCuadratica13.getA();
        java.lang.String str20 = funcionCuadratica13.toString();
        float float21 = funcionCuadratica13.getC();
        funcionCuadratica13.setC((float) 2);
        boolean boolean24 = funcionCuadratica7.equals(funcionCuadratica13);
        funcionCuadratica13.setC((-4000.0f));
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica13);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str20.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(99901.0f, 1015697.0f, (float) (short) 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
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
        java.lang.Class<?> wildcardClass29 = funcionCuadratica7.getClass();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.74107996E10f) + "'", float26 == (-1.74107996E10f));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        java.lang.Object obj8 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
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
        float float20 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        funcionCuadratica24.setB((float) (byte) -1);
        funcionCuadratica24.setC((float) (byte) 1);
        float float30 = funcionCuadratica24.getA();
        java.lang.String str31 = funcionCuadratica24.toString();
        float float32 = funcionCuadratica24.getC();
        float float33 = funcionCuadratica24.getB();
        float float35 = funcionCuadratica24.eval((float) '#');
        float float36 = funcionCuadratica24.determinante();
        funcionCuadratica24.setB((float) 2);
        float float40 = funcionCuadratica24.eval((float) '#');
        funcionCuadratica24.setC((float) 1);
        float float43 = funcionCuadratica24.getA();
        boolean boolean44 = funcionCuadratica3.equals(funcionCuadratica24);
        float float45 = funcionCuadratica24.getB();
        practico5.FuncionCuadratica funcionCuadratica49 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float50 = funcionCuadratica49.getB();
        float float51 = funcionCuadratica49.determinante();
        funcionCuadratica49.setB((float) 10L);
        funcionCuadratica49.setA((float) 1);
        funcionCuadratica49.setC((float) (byte) -1);
        float float58 = funcionCuadratica49.getC();
        float float59 = funcionCuadratica49.determinante();
        float float61 = funcionCuadratica49.eval(0.0f);
        float float63 = funcionCuadratica49.eval((float) 10L);
        float float64 = funcionCuadratica49.getC();
        boolean boolean65 = funcionCuadratica24.equals(funcionCuadratica49);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str31.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 12216.0f + "'", float35 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-39.0f) + "'", float36 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 12321.0f + "'", float40 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 2.0f + "'", float45 == 2.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 100.0f + "'", float50 == 100.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 10000.0f + "'", float51 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + (-1.0f) + "'", float58 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 104.0f + "'", float59 == 104.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.0f) + "'", float61 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 199.0f + "'", float63 == 199.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-1.0f) + "'", float64 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-152.0f), (float) (byte) 0, 1.59996412E11f);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 'a');
        float float10 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1.0x^2+100.0x" + "'", str10.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
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
        java.lang.String str50 = funcionCuadratica31.toString();
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
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str50.equals("1.0x^2+10.0x+-1.0"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(99901.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.70024767E17f, (-1.9457676E20f), (-9.2799074E11f));
        float float5 = funcionCuadratica3.eval((float) 100L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.7757429E22f) + "'", float5 == (-1.7757429E22f));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, 1.52190226E13f, 2.9451708E11f);
        funcionCuadratica3.setB((float) (short) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
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
        java.lang.String str20 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+100.0x" + "'", str20.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        float float15 = funcionCuadratica3.eval((float) (short) -1);
        java.lang.String str16 = funcionCuadratica3.toString();
        float float17 = funcionCuadratica3.getB();
        float float18 = funcionCuadratica3.getA();
        float float19 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-68.0f) + "'", float15 == (-68.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "32.0x^2+100.0x" + "'", str16.equals("32.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 32.0f + "'", float18 == 32.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 32.0f + "'", float19 == 32.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 232.0f, 2000.0f);
        funcionCuadratica3.setC(1.37487188E11f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        float float6 = funcionCuadratica3.getA();
        java.lang.String str7 = funcionCuadratica3.toString();
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.0x^2+10.0x" + "'", str7.equals("1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0x^2+10.0x" + "'", str8.equals("1.0x^2+10.0x"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
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
        float float22 = funcionCuadratica3.eval(0.0f);
        float float23 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 6.554256E34f + "'", float23 == 6.554256E34f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10128.0f, 1.00360441E17f, 8.674031E23f);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.74240006E11f, (-152.0f), (float) ' ');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        funcionCuadratica3.setB((float) 0L);
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 5.21574144E8f + "'", float8 == 5.21574144E8f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) 'a', (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int8 = funcionCuadratica7.numRaices();
        float float9 = funcionCuadratica7.determinante();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10004.0f + "'", float9 == 10004.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
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
        java.lang.String str37 = funcionCuadratica19.toString();
        float float39 = funcionCuadratica19.eval((float) 'a');
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "1.0x^2+1.0x" + "'", str37.equals("1.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 9506.0f + "'", float39 == 9506.0f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
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
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica47.setB(0.0f);
        java.lang.Class<?> wildcardClass50 = funcionCuadratica47.getClass();
        boolean boolean51 = funcionCuadratica26.equals(funcionCuadratica47);
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
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
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
        java.lang.String str48 = funcionCuadratica13.toString();
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
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-1.0x^2+100.0x+-1.0" + "'", str48.equals("-1.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
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
        java.lang.String str25 = funcionCuadratica10.toString();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "10.0x^2+100.0x" + "'", str25.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
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
        funcionCuadratica7.setA(1.40576604E11f);
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
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getB();
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x+10.0" + "'", str12.equals("10.0x^2+100.0x+10.0"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
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
        float float24 = funcionCuadratica8.getA();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        java.lang.String str7 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2" + "'", str7.equals("10.0x^2"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.92205101E12f, (float) (byte) 100, 2.56012813E17f);
        try {
            java.lang.Object obj4 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
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
        float float46 = funcionCuadratica35.getA();
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
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, (float) 1, 9413.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj8 = funcionCuadratica7.raices();
        java.lang.String str9 = funcionCuadratica7.toString();
        funcionCuadratica7.setC((float) 'a');
        funcionCuadratica7.setA(104.0f);
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica7.setA((-1.7757429E22f));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getC();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-0.0f) + "'", obj9.equals((-0.0f)));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getA();
        int int5 = funcionCuadratica3.numRaices();
        int int6 = funcionCuadratica3.numRaices();
        try {
            java.lang.Object obj7 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica10.getClass();
        int int14 = funcionCuadratica10.numRaices();
        int int15 = funcionCuadratica10.numRaices();
        float float16 = funcionCuadratica10.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
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
        float float20 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(0.0f);
        float float24 = funcionCuadratica3.eval((-1276.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.57933088E8f + "'", float24 == 1.57933088E8f);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
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
        funcionCuadratica3.setC((-1.0f));
        float float38 = funcionCuadratica3.eval(8.9558088E7f);
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
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 8.0206513E16f + "'", float38 == 8.0206513E16f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.eval(262190.0f);
        float float10 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 6.8743594E11f + "'", float9 == 6.8743594E11f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399996.0f), (-40.0f), 540560.0f);
        float float4 = funcionCuadratica3.determinante();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 8.6488737E11f + "'", float4 == 8.6488737E11f);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(5.2230605E9f);
        float float11 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setA((float) (byte) 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.determinante();
        float float13 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(1.60004E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-39.0f) + "'", float13 == (-39.0f));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.00009997E9f);
        funcionCuadratica3.setA(34.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        java.lang.Object obj14 = funcionCuadratica9.raices();
        funcionCuadratica9.setC(4.00079956E18f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica8.setC(1.2791497E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica10.setA((float) (-1L));
        float float15 = funcionCuadratica10.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(34.0f);
        float float12 = funcionCuadratica3.eval(132000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.74241333E11f + "'", float12 == 1.74241333E11f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
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
        float float17 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str14.equals("10.0x^2+2.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1000.0f + "'", float17 == 1000.0f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0x^2+100.0x" + "'", str9.equals("1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(1.00360441E17f);
        float float13 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
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
        float float45 = funcionCuadratica31.getC();
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
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.996025E28f, (float) (short) 10, 8.6488737E11f);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        funcionCuadratica9.setC((float) '#');
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        funcionCuadratica19.setA((float) ' ');
        funcionCuadratica19.setC((float) (short) -1);
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        java.lang.Object obj37 = funcionCuadratica35.raices();
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj42 = funcionCuadratica41.raices();
        boolean boolean43 = funcionCuadratica35.equals(funcionCuadratica41);
        java.lang.String str44 = funcionCuadratica35.toString();
        float float46 = funcionCuadratica35.eval(1.30393536E8f);
        boolean boolean47 = funcionCuadratica19.equals(funcionCuadratica35);
        java.lang.Class<?> wildcardClass48 = funcionCuadratica19.getClass();
        funcionCuadratica19.setB((float) 0);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica19.getClass();
        boolean boolean52 = funcionCuadratica9.equals(funcionCuadratica19);
        int int53 = funcionCuadratica9.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "10.0x^2+100.0x" + "'", str44.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.70024767E17f + "'", float46 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.74241333E11f, 118560.0f, 9.9979908E12f);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        float float6 = funcionCuadratica3.determinante();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(2.5758312E33f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 401.0f + "'", float6 == 401.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
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
        funcionCuadratica3.setA((-5.089792E9f));
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
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) 100);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        float float8 = funcionCuadratica3.getA();
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.determinante();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
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
        funcionCuadratica3.setA(6000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setC((-11424.0f));
        funcionCuadratica3.setC(1.30393536E8f);
        int int8 = funcionCuadratica3.numRaices();
        try {
            java.lang.Object obj9 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        java.lang.String str12 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str12.equals("1.0x^2+10.0x+-1.0"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        int int13 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC(999899.0f);
        float float18 = funcionCuadratica3.getA();
        float float20 = funcionCuadratica3.eval(1.00360441E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0072218E35f + "'", float20 == 1.0072218E35f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) 100, (float) (byte) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0x^2+100.0x+100.0" + "'", str4.equals("1.0x^2+100.0x+100.0"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
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
        float float23 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-2.04805018E10f) + "'", float23 == (-2.04805018E10f));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
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
        funcionCuadratica12.setA(1.1121001E7f);
        java.lang.Object obj21 = funcionCuadratica12.raices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(1.23676657E15f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
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
        float float25 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
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
        funcionCuadratica3.setA(10004.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        float float6 = funcionCuadratica3.eval(262190.0f);
        float float7 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-800.0f) + "'", float4 == (-800.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.37487188E11f + "'", float6 == 1.37487188E11f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-800.0f) + "'", float7 == (-800.0f));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '#', 0.0f, (-30352.0f));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(34.0f);
        float float7 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(132000.0f);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
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
        try {
            java.lang.Object obj28 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
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
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
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
        float float37 = funcionCuadratica3.getA();
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
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.eval(1.30393536E8f);
        int int11 = funcionCuadratica3.numRaices();
        float float12 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
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
        java.lang.Object obj19 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 5.0f + "'", float18 == 5.0f);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.74107996E10f), 0.0f, 999899.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
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
        float float17 = funcionCuadratica10.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+10.0x" + "'", str16.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(157.0f, 999899.0f, 999899.0f);
        float float9 = funcionCuadratica8.getB();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica8);
        float float12 = funcionCuadratica8.eval(10128.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 999899.0f + "'", float9 == 999899.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.62324675E10f + "'", float12 == 2.62324675E10f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica15.setB((float) (byte) 0);
        funcionCuadratica15.setC(10000.0f);
        float float20 = funcionCuadratica15.getC();
        boolean boolean21 = funcionCuadratica9.equals(funcionCuadratica15);
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float26 = funcionCuadratica25.getB();
        float float27 = funcionCuadratica25.determinante();
        boolean boolean28 = funcionCuadratica9.equals(funcionCuadratica25);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10000.0f + "'", float20 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-4000.0f) + "'", float27 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
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
        java.lang.String str20 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "199.0x^2+-1.0x+1.0" + "'", str20.equals("199.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) 'a', (float) (short) 100);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+97.0x+100.0" + "'", str4.equals("10.0x^2+97.0x+100.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
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
        float float31 = funcionCuadratica19.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-39.0x^2+-1.0x+1.0" + "'", str30.equals("-39.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 157.0f + "'", float31 == 157.0f);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        float float16 = funcionCuadratica8.eval((-1.9457676E20f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + Float.NEGATIVE_INFINITY + "'", float16 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 100L);
        java.lang.Class<?> wildcardClass21 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        java.lang.Object obj15 = funcionCuadratica8.raices();
        java.lang.String str16 = funcionCuadratica8.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-1.0x^2+100.0x" + "'", str16.equals("-1.0x^2+100.0x"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(97.0f);
        float float9 = funcionCuadratica3.getB();
        float float11 = funcionCuadratica3.eval(9.9980119E13f);
        int int12 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.996025E28f + "'", float11 == 9.996025E28f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399996.0f), 1.30507776E8f, (-9.997902E13f));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100L, 5.0f, 0.0f);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(232.0f, 1.23676657E15f, 0.0f);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
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
        float float30 = funcionCuadratica9.determinante();
        float float31 = funcionCuadratica9.determinante();
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
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10000.0f + "'", float30 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10000.0f + "'", float31 == 10000.0f);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
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
        funcionCuadratica3.setC(210.0f);
        float float25 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 210.0f + "'", float25 == 210.0f);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
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
        java.lang.String str31 = funcionCuadratica3.toString();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10.0x^2" + "'", str31.equals("10.0x^2"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
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
        funcionCuadratica18.setC((float) (byte) 1);
        float float24 = funcionCuadratica18.getA();
        java.lang.String str25 = funcionCuadratica18.toString();
        float float26 = funcionCuadratica18.getC();
        float float27 = funcionCuadratica18.getB();
        float float29 = funcionCuadratica18.eval((float) '#');
        float float30 = funcionCuadratica18.determinante();
        funcionCuadratica18.setB((float) 2);
        float float34 = funcionCuadratica18.eval((float) '#');
        funcionCuadratica18.setC((float) 1);
        float float37 = funcionCuadratica18.getA();
        boolean boolean38 = funcionCuadratica3.equals(funcionCuadratica18);
        float float39 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str25.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 12216.0f + "'", float29 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-39.0f) + "'", float30 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 12321.0f + "'", float34 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
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
        funcionCuadratica3.setA(1.9877746E24f);
        java.lang.String str21 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "1.9877746E24x^2+-4000.0x+2.0" + "'", str21.equals("1.9877746E24x^2+-4000.0x+2.0"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica(157.0f, 999899.0f, 999899.0f);
        float float9 = funcionCuadratica8.getB();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica8.setC((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 999899.0f + "'", float9 == 999899.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float5 = funcionCuadratica3.eval((float) 0);
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(6120.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        float float5 = funcionCuadratica3.eval(1.23676657E15f);
        int int6 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.5295915E31f + "'", float5 == 1.5295915E31f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getA();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(2.56012813E17f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6120.0f + "'", float10 == 6120.0f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
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
        funcionCuadratica10.setA(10.0f);
        float float25 = funcionCuadratica10.getA();
        funcionCuadratica10.setB(9413.0f);
        java.lang.Class<?> wildcardClass28 = funcionCuadratica10.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.5758312E33f, 3.2012794E37f, 97.0f);
        float float5 = funcionCuadratica3.eval(401.0f);
        float float7 = funcionCuadratica3.eval(32.0f);
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + Float.POSITIVE_INFINITY + "'", float5 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5758312E33f + "'", float8 == 2.5758312E33f);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        funcionCuadratica9.setB(1.0f);
        float float17 = funcionCuadratica9.eval((float) ' ');
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica21.setA((float) (byte) -1);
        java.lang.String str24 = funcionCuadratica21.toString();
        java.lang.String str25 = funcionCuadratica21.toString();
        funcionCuadratica21.setA((float) (byte) 100);
        boolean boolean28 = funcionCuadratica9.equals(funcionCuadratica21);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10272.0f + "'", float17 == 10272.0f);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-1.0x^2+100.0x" + "'", str24.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-1.0x^2+100.0x" + "'", str25.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
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
        float float29 = funcionCuadratica3.eval((float) (-1));
        float float30 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 100);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.00009997E9f + "'", float27 == 1.00009997E9f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
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
        funcionCuadratica3.setB((float) 2);
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.37487188E11f, 262190.0f, 0.0f);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-1276.0f));
        funcionCuadratica3.setC(1.5999872E7f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB((float) 2);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        float float16 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 4.0f + "'", float16 == 4.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        int int15 = funcionCuadratica3.numRaices();
        float float16 = funcionCuadratica3.getB();
        float float17 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
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
        float float17 = funcionCuadratica3.getA();
        float float18 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 9413.0f + "'", float16 == 9413.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
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
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
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
        float float20 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 2.30828008E18f + "'", float20 == 2.30828008E18f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100, (-1.50924237E9f), 32.0f);
        funcionCuadratica3.setB(1.50536632E10f);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
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
        funcionCuadratica3.setA(540560.0f);
        float float37 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 540560.0f + "'", float37 == 540560.0f);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
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
        float float18 = funcionCuadratica3.getB();
        float float19 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
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
        float float27 = funcionCuadratica3.eval(1.0f);
        java.lang.String str28 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 191.0f + "'", float27 == 191.0f);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "157.0x^2+35.0x+-1.0" + "'", str28.equals("157.0x^2+35.0x+-1.0"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(5.21574144E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
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
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        float float24 = funcionCuadratica23.determinante();
        float float26 = funcionCuadratica23.eval(262190.0f);
        funcionCuadratica23.setA((float) (-1L));
        float float29 = funcionCuadratica23.determinante();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica23);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-800.0f) + "'", float24 == (-800.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.37487188E11f + "'", float26 == 1.37487188E11f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 400.0f + "'", float29 == 400.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(110.0f);
        funcionCuadratica3.setA(110.0f);
        funcionCuadratica3.setC((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(9600.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        float float10 = funcionCuadratica3.eval(2.2778125E19f);
        float float11 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((-1.00019989E18f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + Float.POSITIVE_INFINITY + "'", float10 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
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
        funcionCuadratica22.setA(100000.0f);
        float float31 = funcionCuadratica22.getA();
        float float32 = funcionCuadratica22.getA();
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
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100000.0f + "'", float31 == 100000.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100000.0f + "'", float32 == 100000.0f);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
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
        float float41 = funcionCuadratica28.getA();
        float float42 = funcionCuadratica28.getA();
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
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float6 = funcionCuadratica3.getB();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.String str8 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0x^2" + "'", str8.equals("1.0x^2"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
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
        funcionCuadratica3.setC(3.15259781E10f);
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
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.determinante();
        funcionCuadratica9.setB((float) 10L);
        funcionCuadratica9.setA((float) 1);
        funcionCuadratica9.setC((float) (byte) -1);
        float float18 = funcionCuadratica9.getC();
        float float19 = funcionCuadratica9.getA();
        funcionCuadratica9.setB((float) (short) -1);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-399.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
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
        funcionCuadratica20.setC((-399.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.determinante();
        funcionCuadratica9.setB((float) 10L);
        funcionCuadratica9.setA((float) 1);
        funcionCuadratica9.setC((float) (byte) -1);
        float float18 = funcionCuadratica9.getC();
        float float19 = funcionCuadratica9.getA();
        funcionCuadratica9.setB((float) (short) -1);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica9);
        float float23 = funcionCuadratica9.determinante();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 5.0f + "'", float23 == 5.0f);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
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
        funcionCuadratica3.setB(97.0f);
        java.lang.Object obj34 = funcionCuadratica3.raices();
        float float35 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 97.0f + "'", float35 == 97.0f);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) 2);
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float9 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.eval(121000.0f);
        funcionCuadratica3.setB(35.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.46422104E11f + "'", float11 == 1.46422104E11f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        java.lang.String str7 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+100.0x" + "'", str7.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1L);
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, 32.0f, (float) 0);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10128.0f, 1.0f, 9.9983808E12f);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getA();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 10);
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(97329.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x+10.0" + "'", str7.equals("10.0x^2+10.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 157.0f + "'", float13 == 157.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
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
        float float21 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass22 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
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
        float float30 = funcionCuadratica7.eval(11310.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.26785096E8f) + "'", float30 == (-1.26785096E8f));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        java.lang.String str9 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        try {
            java.lang.Object obj12 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(2.0f);
        try {
            java.lang.Object obj14 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
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
        funcionCuadratica22.setA(100000.0f);
        int int31 = funcionCuadratica22.numRaices();
        float float32 = funcionCuadratica22.determinante();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-4.159E7f) + "'", float32 == (-4.159E7f));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float12 = funcionCuadratica3.eval(12321.0f);
        funcionCuadratica3.setA(8.8616672E8f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.51930253E9f + "'", float12 == 1.51930253E9f);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int15 = funcionCuadratica14.numRaices();
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
        boolean boolean34 = funcionCuadratica14.equals(funcionCuadratica19);
        java.lang.Class<?> wildcardClass35 = funcionCuadratica14.getClass();
        boolean boolean36 = funcionCuadratica3.equals(funcionCuadratica14);
        float float37 = funcionCuadratica14.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10000.0f + "'", float21 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 100);
        float float10 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
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
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
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
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(34.0f);
        funcionCuadratica3.setA(131.0f);
        int int10 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2000.0f, 5.0f, 0.0f);
        float float5 = funcionCuadratica3.eval(3.15259781E10f);
        funcionCuadratica3.setB(34.0f);
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.9877746E24f + "'", float5 == 1.9877746E24f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 34.0f + "'", float8 == 34.0f);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.determinante();
        float float12 = funcionCuadratica3.getA();
        java.lang.Object obj13 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
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
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj40 = funcionCuadratica39.raices();
        java.lang.String str41 = funcionCuadratica39.toString();
        java.lang.Object obj42 = funcionCuadratica39.raices();
        funcionCuadratica39.setC(97.0f);
        float float45 = funcionCuadratica39.getB();
        float float47 = funcionCuadratica39.eval(9.9980119E13f);
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica39);
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
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "10.0x^2+100.0x" + "'", str41.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 9.996025E28f + "'", float47 == 9.996025E28f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.70024767E17f, (-4000.0f), 2.0f);
        float float4 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(11310.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.70024767E17f + "'", float4 == 1.70024767E17f);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica15);
        int int17 = funcionCuadratica3.numRaices();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        float float11 = funcionCuadratica9.determinante();
        funcionCuadratica9.setB((float) 10L);
        funcionCuadratica9.setA((float) 1);
        funcionCuadratica9.setC((float) (byte) -1);
        float float18 = funcionCuadratica9.getC();
        float float19 = funcionCuadratica9.getA();
        funcionCuadratica9.setB((float) (short) -1);
        boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str23 = funcionCuadratica3.toString();
        java.lang.Object obj24 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+10.0x" + "'", str23.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float9 = funcionCuadratica3.eval((-2.04805018E10f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 4.1945094E21f + "'", float9 == 4.1945094E21f);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
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
        float float19 = funcionCuadratica11.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 11310.0f + "'", float17 == 11310.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
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
        try {
            java.lang.Object obj22 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1001097.0f + "'", float21 == 1001097.0f);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(110.0f);
        float float7 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((float) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
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
        float float47 = funcionCuadratica38.getB();
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
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 10.0f + "'", float47 == 10.0f);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        java.lang.Object obj10 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
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
        float float30 = funcionCuadratica7.eval((-2.890842E34f));
        float float31 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.74107996E10f) + "'", float26 == (-1.74107996E10f));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + Float.POSITIVE_INFINITY + "'", float30 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((-800.0f));
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj17 = funcionCuadratica16.raices();
        int int18 = funcionCuadratica16.numRaices();
        float float19 = funcionCuadratica16.getB();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica16);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1.0x^2+100.0x" + "'", str10.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        funcionCuadratica3.setA(121000.0f);
        float float6 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 121000.0f + "'", float7 == 121000.0f);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
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
        float float31 = funcionCuadratica24.getC();
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
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
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
        float float28 = funcionCuadratica10.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 99.0f + "'", float28 == 99.0f);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
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
        int int49 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) 2);
        funcionCuadratica3.setA(2.43670528E9f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
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
        funcionCuadratica3.setC(2.94517084E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.9457676E20f), (-38799.0f), 8.9558088E7f);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.9457676E20f) + "'", float4 == (-1.9457676E20f));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        funcionCuadratica9.setB((float) (byte) -1);
        funcionCuadratica9.setC((float) (byte) 1);
        float float15 = funcionCuadratica9.getA();
        java.lang.String str16 = funcionCuadratica9.toString();
        float float17 = funcionCuadratica9.getC();
        funcionCuadratica9.setC((float) 2);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((-4000.0f));
        float float23 = funcionCuadratica9.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str16.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 160001.0f + "'", float23 == 160001.0f);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6120.0f + "'", float10 == 6120.0f);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10305.0f, 400.0f, 1.9761783E23f);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getA();
        float float11 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(110.0f);
        funcionCuadratica3.setC((float) (byte) -1);
        java.lang.Object obj16 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-300.0f), (float) (short) 10, 1.1496289E29f);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
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
        int int35 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
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
        float float28 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass29 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.02576384E8f, (-399.0f), 2.1435855E23f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(191.0f, (-1.9457676E20f), 9.9980119E13f);
        funcionCuadratica3.setA((float) (short) 10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), 1.00360441E17f, 93201.0f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(60.0f, (-30352.0f), (float) ' ');
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
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
        float float36 = funcionCuadratica3.eval(1.74241333E11f);
        float float37 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 3.0360044E23f + "'", float36 == 3.0360044E23f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
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
        float float22 = funcionCuadratica3.getA();
        java.lang.String str23 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+100.0x+97.0" + "'", str23.equals("10.0x^2+100.0x+97.0"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, (float) '#', 1.51930253E9f);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 1, 1.30393536E8f, 1.00180056E8f);
        float float5 = funcionCuadratica3.eval(999899.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.31380265E14f + "'", float5 == 1.31380265E14f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
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
        funcionCuadratica16.setC(1.0072218E35f);
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
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
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
        float float25 = funcionCuadratica10.getC();
        float float26 = funcionCuadratica10.getA();
        float float27 = funcionCuadratica10.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10816.0f + "'", float27 == 10816.0f);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
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
        float float22 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(4.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 32.0f + "'", float22 == 32.0f);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        int int4 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA((float) 10L);
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0x^2+100.0x+-1.0" + "'", str6.equals("1.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((float) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
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
        funcionCuadratica12.setC(5.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int14 = funcionCuadratica13.numRaices();
        float float15 = funcionCuadratica13.getC();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica13.getClass();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica13);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "232.0x^2" + "'", str8.equals("232.0x^2"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(1.9761783E23f);
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getB();
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(12216.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6000.0f + "'", float10 == 6000.0f);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
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
        float float44 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
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
        float float21 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 5.0f + "'", float18 == 5.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
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
        int int25 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str20.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, (float) (short) 1, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(2.2661277E21f);
        java.lang.Object obj7 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-38799.0f) + "'", float4 == (-38799.0f));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
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
        float float38 = funcionCuadratica26.getA();
        funcionCuadratica26.setB(10.0f);
        float float41 = funcionCuadratica26.getC();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
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
        funcionCuadratica3.setB((-1.7757429E22f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+-68.0x+1.0" + "'", str17.equals("10.0x^2+-68.0x+1.0"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (short) 1, 1.62048E8f);
        float float4 = funcionCuadratica3.getA();
        try {
            java.lang.Object obj5 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        float float14 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        java.lang.Object obj15 = funcionCuadratica3.raices();
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 401.0f + "'", float16 == 401.0f);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        java.lang.Object obj16 = funcionCuadratica3.raices();
        java.lang.String str17 = funcionCuadratica3.toString();
        float float19 = funcionCuadratica3.eval(171610.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-0.0f) + "'", obj16.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2" + "'", str17.equals("10.0x^2"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.9449991E11f + "'", float19 == 2.9449991E11f);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 1.02576384E8f, 0.0f);
        funcionCuadratica3.setB(10040.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
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
        float float18 = funcionCuadratica12.determinante();
        float float19 = funcionCuadratica12.determinante();
        java.lang.String str20 = funcionCuadratica12.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+100.0x" + "'", str20.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
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
        float float18 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
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
        java.lang.String str25 = funcionCuadratica3.toString();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "12216.0x^2+-1.0x+1.0" + "'", str25.equals("12216.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.56012813E17f, 157.0f, (float) (byte) 1);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.56012813E17f + "'", float4 == 2.56012813E17f);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
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
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
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
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "35.0x^2+-1.0x" + "'", str12.equals("35.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
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
        funcionCuadratica3.setC((-1276.0f));
        funcionCuadratica3.setA((float) (short) -1);
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
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.74241333E11f, 1001001.0f, 1.46410004E10f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.eval((-1599983.0f));
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.55992969E13f + "'", float6 == 2.55992969E13f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
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
        try {
            java.lang.Object obj24 = funcionCuadratica22.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float7 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(6.554256E34f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        int int15 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        funcionCuadratica19.setA((float) ' ');
        float float31 = funcionCuadratica19.eval((float) (short) -1);
        java.lang.String str32 = funcionCuadratica19.toString();
        float float33 = funcionCuadratica19.getB();
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica19);
        float float35 = funcionCuadratica19.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-68.0f) + "'", float31 == (-68.0f));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "32.0x^2+100.0x" + "'", str32.equals("32.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 100.0f + "'", float33 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10000.0f + "'", float35 == 10000.0f);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getB();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        java.lang.String str16 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "1.0x^2+100.0x" + "'", str16.equals("1.0x^2+100.0x"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        float float6 = funcionCuadratica3.getB();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(232.0f);
        funcionCuadratica3.setA(99.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 10);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        funcionCuadratica10.setB((float) 10L);
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str16 = funcionCuadratica10.toString();
        float float17 = funcionCuadratica10.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+10.0x" + "'", str16.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = null;
        try {
            boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((-1.0f));
        funcionCuadratica3.setA(56143.0f);
        float float17 = funcionCuadratica3.getC();
        java.lang.String str18 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "56143.0x^2+-1.0x+1.0" + "'", str18.equals("56143.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        funcionCuadratica3.setA(262190.0f);
        funcionCuadratica3.setA(5.2230605E9f);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, 1.0f, 100.0f);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2000.0f, 5.0f, 0.0f);
        float float5 = funcionCuadratica3.eval(3.15259781E10f);
        funcionCuadratica3.setB(34.0f);
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.9877746E24f + "'", float5 == 1.9877746E24f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-6.163462E37f), 1.52190226E13f, 999899.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(171610.0f);
        float float7 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.62048E8f + "'", float4 == 1.62048E8f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        float float13 = funcionCuadratica3.eval((-9.2799074E11f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 8.6116676E24f + "'", float13 == 8.6116676E24f);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
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
        float float67 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 10000.0f + "'", float67 == 10000.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        float float8 = funcionCuadratica3.getA();
        funcionCuadratica3.setB(1.51930253E9f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.eval(1.30393536E8f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Object obj20 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        boolean boolean26 = funcionCuadratica18.equals(funcionCuadratica24);
        java.lang.String str27 = funcionCuadratica18.toString();
        float float28 = funcionCuadratica18.getA();
        float float29 = funcionCuadratica18.determinante();
        funcionCuadratica18.setA((-1.0f));
        int int32 = funcionCuadratica18.numRaices();
        boolean boolean33 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.70024767E17f + "'", float14 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10000.0f + "'", float29 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str10 = funcionCuadratica9.toString();
        funcionCuadratica9.setB((float) '4');
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((-68.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str10.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
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
        float float49 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 10.0f + "'", float49 == 10.0f);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.00079956E18f, 9.9999002E8f, 9.9979908E12f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(15610.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
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
        funcionCuadratica3.setA(9.9969027E11f);
        float float53 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-3.99876109E12f) + "'", float53 == (-3.99876109E12f));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
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
        java.lang.String str25 = funcionCuadratica10.toString();
        float float26 = funcionCuadratica10.getB();
        funcionCuadratica10.setA(10004.0f);
        float float30 = funcionCuadratica10.eval(9999001.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "10.0x^2+104.0x" + "'", str25.equals("10.0x^2+104.0x"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 104.0f + "'", float26 == 104.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0002001E18f + "'", float30 == 1.0002001E18f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 232.0f, 2000.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        int int5 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.0x^2+232.0x+2000.0" + "'", str4.equals("2.0x^2+232.0x+2000.0"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
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
        java.lang.String str22 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(8.6488737E11f);
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x" + "'", str22.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(999899.0f);
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-3.9995961E10f) + "'", float7 == (-3.9995961E10f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (-1), (float) 10L);
        funcionCuadratica3.setA(100.0f);
        funcionCuadratica3.setC((-52300.0f));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
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
        java.lang.String str28 = funcionCuadratica3.toString();
        int int29 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(2.92205101E12f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-1.0x^2+10.0x" + "'", str28.equals("-1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Object obj19 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
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
        float float38 = funcionCuadratica20.eval((float) 1);
        float float39 = funcionCuadratica20.getC();
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
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 10.0f + "'", float38 == 10.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        int int14 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(132000.0f);
        java.lang.Class<?> wildcardClass17 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.7757429E22f), 93201.0f, 0.0f);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(121000.0f);
        float float7 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj19 = funcionCuadratica18.raices();
        boolean boolean20 = funcionCuadratica11.equals(funcionCuadratica18);
        float float21 = funcionCuadratica18.getA();
        funcionCuadratica18.setB((-11424.0f));
        float float24 = funcionCuadratica18.getA();
        float float25 = funcionCuadratica18.determinante();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.30507776E8f + "'", float25 == 1.30507776E8f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
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
        float float23 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str22.equals("32.0x^2+100.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
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
        java.lang.String str36 = funcionCuadratica3.toString();
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "32.0x^2+100.0x+100000.0" + "'", str36.equals("32.0x^2+100.0x+100000.0"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
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
        funcionCuadratica20.setB((float) (short) -1);
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
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getB();
        try {
            java.lang.Object obj10 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
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
        funcionCuadratica18.setC((float) (byte) 1);
        float float24 = funcionCuadratica18.getA();
        java.lang.String str25 = funcionCuadratica18.toString();
        float float26 = funcionCuadratica18.getC();
        float float27 = funcionCuadratica18.getB();
        float float29 = funcionCuadratica18.eval((float) '#');
        float float30 = funcionCuadratica18.determinante();
        funcionCuadratica18.setB((float) 2);
        float float34 = funcionCuadratica18.eval((float) '#');
        funcionCuadratica18.setC((float) 1);
        float float37 = funcionCuadratica18.getA();
        boolean boolean38 = funcionCuadratica3.equals(funcionCuadratica18);
        funcionCuadratica3.setC((float) '#');
        practico5.FuncionCuadratica funcionCuadratica44 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        funcionCuadratica44.setA(121000.0f);
        float float47 = funcionCuadratica44.getB();
        boolean boolean48 = funcionCuadratica3.equals(funcionCuadratica44);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str25.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 12216.0f + "'", float29 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-39.0f) + "'", float30 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 12321.0f + "'", float34 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 2.0f + "'", float47 == 2.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
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
        java.lang.String str28 = funcionCuadratica3.toString();
        float float29 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((-1.26785096E8f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-1.0x^2+10.0x" + "'", str28.equals("-1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-9.2799074E11f), 1.7632299E10f, 1000.0f);
        float float5 = funcionCuadratica3.eval(1021.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-9.6735761E17f) + "'", float5 == (-9.6735761E17f));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
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
        funcionCuadratica3.setC(1.8902726E23f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 1L);
        float float11 = funcionCuadratica3.getA();
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+1.0x" + "'", str12.equals("10.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(56143.0f, (-38799.0f), 1.0726502E36f);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
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
        java.lang.Class<?> wildcardClass39 = funcionCuadratica19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5.2230605E9f, 10004.0f, (float) (short) 0);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5.2230605E9x^2+10004.0x" + "'", str4.equals("5.2230605E9x^2+10004.0x"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
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
        funcionCuadratica3.setB((-1276.0f));
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
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
        float float30 = funcionCuadratica25.getA();
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
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        float float9 = funcionCuadratica3.getB();
        int int10 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.eval((-1276.0f));
        float float14 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 5.6987436E7f + "'", float13 == 5.6987436E7f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str6.equals("10.0x^2+100.0x+100.0"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(1.62048E8f);
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        float float12 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.62048E8f + "'", float12 == 1.62048E8f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float13 = funcionCuadratica11.eval(0.0f);
        funcionCuadratica11.setB((float) 100L);
        float float16 = funcionCuadratica11.getB();
        java.lang.String str17 = funcionCuadratica11.toString();
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Object obj19 = funcionCuadratica11.raices();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
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
        int int31 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
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
        funcionCuadratica3.setA(1.0354983E7f);
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
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(131.0f);
        float float8 = funcionCuadratica3.eval((float) (short) -1);
        java.lang.String str9 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((float) '#');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 232.0f + "'", float8 == 232.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100.0x^2+-1.0x+131.0" + "'", str9.equals("100.0x^2+-1.0x+131.0"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        int int15 = funcionCuadratica3.numRaices();
        float float16 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int21 = funcionCuadratica20.numRaices();
        float float22 = funcionCuadratica20.getB();
        float float23 = funcionCuadratica20.getA();
        float float25 = funcionCuadratica20.eval((float) 1);
        float float26 = funcionCuadratica20.getB();
        java.lang.Object obj27 = funcionCuadratica20.raices();
        java.lang.String str28 = funcionCuadratica20.toString();
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica20);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "1.0x^2+100.0x+-1.0" + "'", str28.equals("1.0x^2+100.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.eval(8.8616672E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 7.8529149E18f + "'", float10 == 7.8529149E18f);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
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
        float float16 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 4584.0f + "'", float16 == 4584.0f);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
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
        practico5.FuncionCuadratica funcionCuadratica21 = null;
        try {
            boolean boolean22 = funcionCuadratica17.equals(funcionCuadratica21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
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
        float float32 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100000.0f + "'", float32 == 100000.0f);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        int int6 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
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
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float23 = funcionCuadratica22.determinante();
        funcionCuadratica22.setC(131.0f);
        float float27 = funcionCuadratica22.eval((float) (short) -1);
        java.lang.String str28 = funcionCuadratica22.toString();
        boolean boolean29 = funcionCuadratica12.equals(funcionCuadratica22);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 401.0f + "'", float23 == 401.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 232.0f + "'", float27 == 232.0f);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "100.0x^2+-1.0x+131.0" + "'", str28.equals("100.0x^2+-1.0x+131.0"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
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
        float float36 = funcionCuadratica22.eval(0.0f);
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (-1));
        funcionCuadratica3.setA(5.2230605E9f);
        funcionCuadratica3.setB((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
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
        funcionCuadratica3.setC((-9.997902E13f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (-39.0f), (float) (short) -1);
        java.lang.String str4 = funcionCuadratica3.toString();
        practico5.FuncionCuadratica funcionCuadratica5 = null;
        try {
            boolean boolean6 = funcionCuadratica3.equals(funcionCuadratica5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+-39.0x+-1.0" + "'", str4.equals("10.0x^2+-39.0x+-1.0"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int9 = funcionCuadratica8.numRaices();
        boolean boolean10 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica3.setC((-40.0f));
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.00009997E9f);
        funcionCuadratica3.setB((float) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-38799.0f), 1000.0f, 1.1121001E7f);
        funcionCuadratica3.setC(2.94517084E10f);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((-1.50574944E8f));
        java.lang.String str9 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1.50574944E8x^2+100.0x" + "'", str9.equals("-1.50574944E8x^2+100.0x"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        float float15 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.8908421E35f, 1021.0f, 100.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((float) (short) 10);
        int int7 = funcionCuadratica3.numRaices();
        float float9 = funcionCuadratica3.eval((float) '4');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1021.0f + "'", float4 == 1021.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 80232.0f + "'", float9 == 80232.0f);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        java.lang.String str16 = funcionCuadratica3.toString();
        float float17 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2" + "'", str16.equals("10.0x^2"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setC((-11424.0f));
        funcionCuadratica3.setC(1.30393536E8f);
        int int8 = funcionCuadratica3.numRaices();
        java.lang.String str9 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0x^2+10.0x+1.30393536E8" + "'", str9.equals("1.0x^2+10.0x+1.30393536E8"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
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
        float float26 = funcionCuadratica7.determinante();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
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
        funcionCuadratica3.setA(1.9761783E23f);
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(23.0f);
        funcionCuadratica3.setA(99901.0f);
        float float13 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
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
        try {
            java.lang.Object obj20 = funcionCuadratica17.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
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
        funcionCuadratica3.setB(3.2012794E37f);
        funcionCuadratica3.setB((float) (short) 10);
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float17 = funcionCuadratica16.getB();
        float float18 = funcionCuadratica16.getC();
        float float19 = funcionCuadratica16.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        float float25 = funcionCuadratica23.determinante();
        boolean boolean26 = funcionCuadratica16.equals(funcionCuadratica23);
        boolean boolean27 = funcionCuadratica3.equals(funcionCuadratica16);
        float float28 = funcionCuadratica3.determinante();
        float float29 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10000.0f + "'", float25 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-40.0f) + "'", float28 == (-40.0f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(1.00009997E9f);
        try {
            java.lang.Object obj16 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
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
        java.lang.String str30 = funcionCuadratica10.toString();
        int int31 = funcionCuadratica10.numRaices();
        funcionCuadratica10.setA(1.00360449E17f);
        int int34 = funcionCuadratica10.numRaices();
        float float35 = funcionCuadratica10.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-1.0x^2+100.0x" + "'", str26.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-2.890842E34f) + "'", float29 == (-2.890842E34f));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-1.0x^2+100.0x" + "'", str30.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str10 = funcionCuadratica9.toString();
        funcionCuadratica9.setB((float) '4');
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        java.lang.Object obj19 = funcionCuadratica17.raices();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj24 = funcionCuadratica23.raices();
        boolean boolean25 = funcionCuadratica17.equals(funcionCuadratica23);
        java.lang.String str26 = funcionCuadratica17.toString();
        funcionCuadratica17.setB(0.0f);
        int int29 = funcionCuadratica17.numRaices();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica17.getClass();
        float float31 = funcionCuadratica17.getA();
        float float32 = funcionCuadratica17.getB();
        int int33 = funcionCuadratica17.numRaices();
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica17);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) (byte) 100, (float) 1, 9413.0f);
        practico5.FuncionCuadratica funcionCuadratica42 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica42.setA((float) (byte) -1);
        java.lang.String str45 = funcionCuadratica42.toString();
        float float47 = funcionCuadratica42.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica51 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj52 = funcionCuadratica51.raices();
        float float53 = funcionCuadratica51.getC();
        float float54 = funcionCuadratica51.getA();
        boolean boolean55 = funcionCuadratica42.equals(funcionCuadratica51);
        practico5.FuncionCuadratica funcionCuadratica59 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float60 = funcionCuadratica59.getB();
        funcionCuadratica59.setB((float) (byte) -1);
        funcionCuadratica59.setC((float) (byte) 1);
        float float65 = funcionCuadratica59.getA();
        java.lang.String str66 = funcionCuadratica59.toString();
        funcionCuadratica59.setC((float) (byte) 100);
        funcionCuadratica59.setC((float) 1L);
        boolean boolean71 = funcionCuadratica42.equals(funcionCuadratica59);
        funcionCuadratica42.setC(0.0f);
        float float75 = funcionCuadratica42.eval(1.00009997E9f);
        boolean boolean76 = funcionCuadratica38.equals(funcionCuadratica42);
        boolean boolean77 = funcionCuadratica3.equals(funcionCuadratica42);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str10.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+100.0x" + "'", str26.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-1.0x^2+100.0x" + "'", str45.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-11424.0f) + "'", float47 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 10.0f + "'", float54 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 10.0f + "'", float65 == 10.0f);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str66.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + (-1.00019989E18f) + "'", float75 == (-1.00019989E18f));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
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
        funcionCuadratica18.setC(121000.0f);
        float float33 = funcionCuadratica18.getC();
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
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 121000.0f + "'", float33 == 121000.0f);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.eval(1.37487188E11f);
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.8902726E23f + "'", float8 == 1.8902726E23f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
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
        java.lang.Object obj29 = funcionCuadratica3.raices();
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
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica15.setB((float) (byte) 0);
        funcionCuadratica15.setC(10000.0f);
        float float20 = funcionCuadratica15.getC();
        boolean boolean21 = funcionCuadratica9.equals(funcionCuadratica15);
        java.lang.String str22 = funcionCuadratica9.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10000.0f + "'", float20 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+100.0x" + "'", str22.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
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
        int int33 = funcionCuadratica18.numRaices();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
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
        funcionCuadratica3.setC(262190.0f);
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float28 = funcionCuadratica27.getB();
        java.lang.Object obj29 = funcionCuadratica27.raices();
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj34 = funcionCuadratica33.raices();
        boolean boolean35 = funcionCuadratica27.equals(funcionCuadratica33);
        float float36 = funcionCuadratica27.getA();
        java.lang.String str37 = funcionCuadratica27.toString();
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float43 = funcionCuadratica41.eval(0.0f);
        int int44 = funcionCuadratica41.numRaices();
        java.lang.Object obj45 = funcionCuadratica41.raices();
        java.lang.Class<?> wildcardClass46 = funcionCuadratica41.getClass();
        funcionCuadratica41.setC(1.62048E8f);
        java.lang.Class<?> wildcardClass49 = funcionCuadratica41.getClass();
        float float51 = funcionCuadratica41.eval((-1.74107996E10f));
        java.lang.Class<?> wildcardClass52 = funcionCuadratica41.getClass();
        float float53 = funcionCuadratica41.getC();
        boolean boolean54 = funcionCuadratica27.equals(funcionCuadratica41);
        boolean boolean55 = funcionCuadratica3.equals(funcionCuadratica27);
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
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "10.0x^2+100.0x" + "'", str37.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 3.0313594E21f + "'", float51 == 3.0313594E21f);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.62048E8f + "'", float53 == 1.62048E8f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.eval(1.30393536E8f);
        float float15 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.eval(10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.70024767E17f + "'", float14 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2000.0f + "'", float17 == 2000.0f);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(157.0f, 999899.0f, 999899.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 999899.0f + "'", float4 == 999899.0f);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
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
        funcionCuadratica3.setB(0.0f);
        float float19 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float10 = funcionCuadratica9.getB();
        java.lang.Object obj11 = funcionCuadratica9.raices();
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj16 = funcionCuadratica15.raices();
        boolean boolean17 = funcionCuadratica9.equals(funcionCuadratica15);
        java.lang.String str18 = funcionCuadratica9.toString();
        funcionCuadratica9.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        funcionCuadratica24.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        boolean boolean33 = funcionCuadratica24.equals(funcionCuadratica31);
        java.lang.Class<?> wildcardClass34 = funcionCuadratica24.getClass();
        boolean boolean35 = funcionCuadratica9.equals(funcionCuadratica24);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float40 = funcionCuadratica39.getB();
        java.lang.Object obj41 = funcionCuadratica39.raices();
        practico5.FuncionCuadratica funcionCuadratica45 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj46 = funcionCuadratica45.raices();
        boolean boolean47 = funcionCuadratica39.equals(funcionCuadratica45);
        java.lang.String str48 = funcionCuadratica39.toString();
        funcionCuadratica39.setB(0.0f);
        float float51 = funcionCuadratica39.determinante();
        boolean boolean52 = funcionCuadratica9.equals(funcionCuadratica39);
        float float54 = funcionCuadratica9.eval((float) (short) 0);
        boolean boolean55 = funcionCuadratica3.equals(funcionCuadratica9);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 401.0f + "'", float5 == 401.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+100.0x" + "'", str18.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "10.0x^2+100.0x" + "'", str48.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-6.163462E37f), 1.1496289E29f, 1.02576384E8f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(5.2230605E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.1496289E29f + "'", float4 == 1.1496289E29f);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
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
        java.lang.Object obj33 = funcionCuadratica3.raices();
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
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(6000.0f);
        float float7 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-240000.0f) + "'", float7 == (-240000.0f));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.628176E7f, 9.9979908E12f, (-1.50924237E9f));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setA((float) '#');
        funcionCuadratica3.setB(3.0313594E21f);
        float float14 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 35.0f + "'", float14 == 35.0f);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
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
        funcionCuadratica3.setC(3.15259781E10f);
        float float23 = funcionCuadratica3.getA();
        try {
            java.lang.Object obj24 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 262190.0f + "'", float23 == 262190.0f);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
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
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float26 = funcionCuadratica25.getB();
        java.lang.Object obj27 = funcionCuadratica25.raices();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        boolean boolean33 = funcionCuadratica25.equals(funcionCuadratica31);
        java.lang.String str34 = funcionCuadratica25.toString();
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float39 = funcionCuadratica38.getB();
        funcionCuadratica38.setB((float) (byte) -1);
        funcionCuadratica38.setC((float) (byte) 1);
        float float44 = funcionCuadratica38.getA();
        java.lang.String str45 = funcionCuadratica38.toString();
        float float46 = funcionCuadratica38.getC();
        float float47 = funcionCuadratica38.getB();
        float float49 = funcionCuadratica38.eval((float) '#');
        float float50 = funcionCuadratica38.getA();
        float float51 = funcionCuadratica38.getB();
        float float52 = funcionCuadratica38.determinante();
        float float53 = funcionCuadratica38.getC();
        boolean boolean54 = funcionCuadratica25.equals(funcionCuadratica38);
        boolean boolean55 = funcionCuadratica3.equals(funcionCuadratica38);
        practico5.FuncionCuadratica funcionCuadratica59 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float60 = funcionCuadratica59.getB();
        java.lang.Object obj61 = funcionCuadratica59.raices();
        practico5.FuncionCuadratica funcionCuadratica65 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj66 = funcionCuadratica65.raices();
        boolean boolean67 = funcionCuadratica59.equals(funcionCuadratica65);
        java.lang.String str68 = funcionCuadratica59.toString();
        funcionCuadratica59.setB(0.0f);
        float float71 = funcionCuadratica59.determinante();
        float float72 = funcionCuadratica59.getB();
        float float73 = funcionCuadratica59.getC();
        java.lang.Object obj74 = funcionCuadratica59.raices();
        boolean boolean75 = funcionCuadratica3.equals(funcionCuadratica59);
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
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+100.0x" + "'", str34.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str45.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 12216.0f + "'", float49 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 10.0f + "'", float50 == 10.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-39.0f) + "'", float52 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "10.0x^2+100.0x" + "'", str68.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 0.0f + "'", float73 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (-0.0f) + "'", obj74.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        float float10 = funcionCuadratica3.determinante();
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-38799.0f), 1000.0f, 1.1121001E7f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getB();
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
        float float37 = funcionCuadratica30.getA();
        float float38 = funcionCuadratica30.getA();
        boolean boolean39 = funcionCuadratica22.equals(funcionCuadratica30);
        float float40 = funcionCuadratica30.determinante();
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica30);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-1.0x^2+100.0x" + "'", str16.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-11424.0f) + "'", float18 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 10.0f + "'", float38 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-39.0f) + "'", float40 == (-39.0f));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
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
        practico5.FuncionCuadratica funcionCuadratica21 = null;
        try {
            boolean boolean22 = funcionCuadratica3.equals(funcionCuadratica21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        float float10 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(12.0f);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
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
        float float18 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
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
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(157.0f);
        funcionCuadratica3.setC((-1276.0f));
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "157.0x^2+100.0x+-1276.0" + "'", str10.equals("157.0x^2+100.0x+-1276.0"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.eval(0.0f);
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getA();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
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
        float float18 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        float float5 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(7.480302E24f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
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
        float float47 = funcionCuadratica7.determinante();
        int int48 = funcionCuadratica7.numRaices();
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
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 10000.0f + "'", float47 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.674031E23f, 1.5999872E7f, 99901.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "8.674031E23x^2+1.5999872E7x+99901.0" + "'", str4.equals("8.674031E23x^2+1.5999872E7x+99901.0"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) 'a');
        funcionCuadratica3.setA(8.689414E23f);
        float float17 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 8.689414E23f + "'", float17 == 8.689414E23f);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        java.lang.String str7 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(80232.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x" + "'", str7.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        java.lang.String str10 = funcionCuadratica9.toString();
        float float11 = funcionCuadratica9.getB();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica9);
        float float13 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+10.0x" + "'", str10.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
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
        java.lang.String str25 = funcionCuadratica10.toString();
        float float26 = funcionCuadratica10.getB();
        funcionCuadratica10.setA(10004.0f);
        float float29 = funcionCuadratica10.getA();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "10.0x^2+104.0x" + "'", str25.equals("10.0x^2+104.0x"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 104.0f + "'", float26 == 104.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10004.0f + "'", float29 == 10004.0f);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float7 = funcionCuadratica3.getB();
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1.0x^2+100.0x" + "'", str8.equals("-1.0x^2+100.0x"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setC(10000.0f);
        funcionCuadratica3.setC(1.30507776E8f);
        float float10 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.9877746E24f, 32.0f, 9.9999002E8f);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str10 = funcionCuadratica9.toString();
        funcionCuadratica9.setB((float) '4');
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica9);
        practico5.FuncionCuadratica funcionCuadratica17 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float18 = funcionCuadratica17.getB();
        java.lang.Object obj19 = funcionCuadratica17.raices();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj24 = funcionCuadratica23.raices();
        boolean boolean25 = funcionCuadratica17.equals(funcionCuadratica23);
        java.lang.String str26 = funcionCuadratica17.toString();
        funcionCuadratica17.setB(0.0f);
        int int29 = funcionCuadratica17.numRaices();
        java.lang.Class<?> wildcardClass30 = funcionCuadratica17.getClass();
        float float31 = funcionCuadratica17.getA();
        float float32 = funcionCuadratica17.getB();
        int int33 = funcionCuadratica17.numRaices();
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica17);
        float float35 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str10.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+100.0x" + "'", str26.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 10.0f + "'", float31 == 10.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-4000.0f) + "'", float35 == (-4000.0f));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        float float15 = funcionCuadratica8.getA();
        funcionCuadratica8.setC(121000.0f);
        java.lang.Class<?> wildcardClass18 = funcionCuadratica8.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-1.0x^2+100.0x" + "'", str11.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-11424.0f) + "'", float13 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 10.0f, (float) 2);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
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
        int int19 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
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
        float float43 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(10000.0f);
        float float9 = funcionCuadratica3.eval(10040.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.108416E9f + "'", float9 == 1.108416E9f);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
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
        int int17 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str14.equals("10.0x^2+2.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
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
        float float19 = funcionCuadratica12.getB();
        funcionCuadratica12.setC((float) 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        int int14 = funcionCuadratica3.numRaices();
        java.lang.String str15 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        java.lang.String str17 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+100.0x" + "'", str15.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x" + "'", str17.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
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
        java.lang.String str32 = funcionCuadratica3.toString();
        int int33 = funcionCuadratica3.numRaices();
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "1.0x^2+97.0x+-1.0" + "'", str32.equals("1.0x^2+97.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-2.04805018E10f), 1.37487188E11f, 6120.0f);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.8908421E35f, 1021.0f, 100.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setA((float) (short) 10);
        int int7 = funcionCuadratica3.numRaices();
        float float9 = funcionCuadratica3.eval(9999001.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1021.0f + "'", float4 == 1021.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.998104E14f + "'", float9 == 9.998104E14f);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((float) 100L);
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(5.0f, 2.56012813E17f, 9.9979908E12f);
        funcionCuadratica3.setC(12321.0f);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
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
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica19);
        int int21 = funcionCuadratica3.numRaices();
        float float22 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-39.0f) + "'", float22 == (-39.0f));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
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
        int int35 = funcionCuadratica22.numRaices();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
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
        float float17 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(5.2230605E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
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
        funcionCuadratica14.setA(9.9999002E8f);
        float float21 = funcionCuadratica14.getB();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (-0.0f), 100.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-0.0f) + "'", float4 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (-1), (float) 10L);
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-399.0f) + "'", float4 == (-399.0f));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-11424.0f), 0.0f, (-39.0f));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
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
        float float31 = funcionCuadratica20.determinante();
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
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-4.00039987E9f) + "'", float31 == (-4.00039987E9f));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
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
        float float25 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-1.0x^2+100.0x" + "'", str24.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((-1.00019989E18f));
        float float10 = funcionCuadratica3.determinante();
        java.lang.String str11 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 4.00079956E18f + "'", float10 == 4.00079956E18f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1.0x^2+10.0x+-1.00019989E18" + "'", str11.equals("1.0x^2+10.0x+-1.00019989E18"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        float float13 = funcionCuadratica10.getA();
        funcionCuadratica10.setB((-11424.0f));
        float float17 = funcionCuadratica10.eval(0.0f);
        funcionCuadratica10.setB(131.0f);
        funcionCuadratica10.setB(1.23676657E15f);
        funcionCuadratica10.setB(1.00360441E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
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
        int int28 = funcionCuadratica17.numRaices();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
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
        java.lang.Class<?> wildcardClass40 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.determinante();
        float float13 = funcionCuadratica3.getA();
        float float15 = funcionCuadratica3.eval(1.59996412E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.5598853E23f + "'", float15 == 2.5598853E23f);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
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
        funcionCuadratica3.setC(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.String str13 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+-1.0x" + "'", str13.equals("10.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(171610.0f, 1.60004E8f, 121000.0f);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) 1, (-1.0f));
        float float5 = funcionCuadratica3.eval((float) 0);
        float float6 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((-399996.0f));
        float float9 = funcionCuadratica3.determinante();
        funcionCuadratica3.setC(9.9983808E12f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1599983.0f) + "'", float9 == (-1599983.0f));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(110.0f);
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.9457676E20f), (-38799.0f), 8.9558088E7f);
        funcionCuadratica3.setB(1233649.0f);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((float) '4');
        funcionCuadratica3.setC((float) 1L);
        float float9 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        float float15 = funcionCuadratica13.determinante();
        funcionCuadratica13.setB((float) 10L);
        funcionCuadratica13.setA((float) 1);
        funcionCuadratica13.setC((float) (byte) -1);
        float float22 = funcionCuadratica13.getC();
        funcionCuadratica13.setB((float) 'a');
        float float25 = funcionCuadratica13.getB();
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float30 = funcionCuadratica29.getB();
        funcionCuadratica29.setB((float) (byte) -1);
        funcionCuadratica29.setC((float) (byte) 1);
        float float36 = funcionCuadratica29.eval(1.0f);
        funcionCuadratica29.setA((-39.0f));
        boolean boolean39 = funcionCuadratica13.equals(funcionCuadratica29);
        java.lang.Class<?> wildcardClass40 = funcionCuadratica29.getClass();
        funcionCuadratica29.setA(34.0f);
        boolean boolean43 = funcionCuadratica3.equals(funcionCuadratica29);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.30393536E8f + "'", float9 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 97.0f + "'", float25 == 97.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setA((float) '#');
        float float12 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float6 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setA(561440.0f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-39.0f) + "'", float6 == (-39.0f));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.eval((float) (short) 0);
        float float8 = funcionCuadratica3.determinante();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
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
        float float36 = funcionCuadratica3.eval((float) 10L);
        float float37 = funcionCuadratica3.determinante();
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 97329.0f + "'", float36 == 97329.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 8.8604696E7f + "'", float37 == 8.8604696E7f);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Object obj8 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        float float6 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(0.0f);
        funcionCuadratica3.setB(1.60004E8f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-4000.0f) + "'", float6 == (-4000.0f));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1233649.0f, 1.31438331E14f, 2.30828008E18f);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(191.0f, 1.59996412E11f, 160001.0f);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        funcionCuadratica9.setB(1.0f);
        funcionCuadratica9.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        float float23 = funcionCuadratica21.getC();
        float float24 = funcionCuadratica21.getA();
        practico5.FuncionCuadratica funcionCuadratica28 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj29 = funcionCuadratica28.raices();
        boolean boolean30 = funcionCuadratica21.equals(funcionCuadratica28);
        java.lang.Class<?> wildcardClass31 = funcionCuadratica28.getClass();
        int int32 = funcionCuadratica28.numRaices();
        float float33 = funcionCuadratica28.getB();
        float float34 = funcionCuadratica28.getB();
        float float35 = funcionCuadratica28.getB();
        boolean boolean36 = funcionCuadratica9.equals(funcionCuadratica28);
        float float38 = funcionCuadratica28.eval(1.50536632E10f);
        java.lang.Class<?> wildcardClass39 = funcionCuadratica28.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 2.2661277E21f + "'", float38 == 2.2661277E21f);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
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
        float float19 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.70024767E17f + "'", float19 == 1.70024767E17f);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
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
        float float25 = funcionCuadratica10.getC();
        float float26 = funcionCuadratica10.getA();
        float float27 = funcionCuadratica10.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setA((float) '#');
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(7.480302E24f, 9.9969027E11f, 32.0f);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
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
        float float20 = funcionCuadratica3.determinante();
        float float21 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-387.0f) + "'", float20 == (-387.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-387.0f) + "'", float21 == (-387.0f));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float14 = funcionCuadratica12.eval(9413.0f);
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        float float16 = funcionCuadratica3.getC();
        float float17 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(100000.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 8.8604582E8f + "'", float14 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
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
        java.lang.String str22 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str22.equals("10.0x^2+2.0x+1.0"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        java.lang.String str13 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+100.0x" + "'", str13.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
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
        funcionCuadratica31.setC(0.0f);
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
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, 1.52190226E13f, 2.9451708E11f);
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(1021.0f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0x^2+1.52190226E13x+2.9451708E11" + "'", str4.equals("1.0x^2+1.52190226E13x+2.9451708E11"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
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
        java.lang.Class<?> wildcardClass39 = funcionCuadratica33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        float float13 = funcionCuadratica11.getC();
        float float14 = funcionCuadratica11.getA();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj19 = funcionCuadratica18.raices();
        boolean boolean20 = funcionCuadratica11.equals(funcionCuadratica18);
        boolean boolean21 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica3.setB(97329.0f);
        java.lang.Object obj24 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.29399648E8f, 3.2012794E37f, 121000.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.29399648E8x^2+3.2012794E37x+121000.0" + "'", str4.equals("1.29399648E8x^2+3.2012794E37x+121000.0"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float6 = funcionCuadratica3.eval(0.0f);
        float float7 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-39.0f) + "'", float6 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
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
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.determinante();
        java.lang.String str8 = funcionCuadratica3.toString();
        int int9 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) '#', (-1.0f), (-4000.0f));
        funcionCuadratica3.setB((-152.0f));
        funcionCuadratica3.setA((float) (short) 100);
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.determinante();
        float float10 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float15 = funcionCuadratica14.getB();
        funcionCuadratica14.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj22 = funcionCuadratica21.raices();
        boolean boolean23 = funcionCuadratica14.equals(funcionCuadratica21);
        boolean boolean24 = funcionCuadratica3.equals(funcionCuadratica21);
        java.lang.Class<?> wildcardClass25 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
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
        float float23 = funcionCuadratica10.getC();
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
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, 32.0f, (float) 0);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
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
        funcionCuadratica3.setB(2.5758312E33f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-3.0f) + "'", float14 == (-3.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
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
        float float27 = funcionCuadratica23.eval((-4.00039987E9f));
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
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.6003198E20f + "'", float27 == 1.6003198E20f);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC(34.0f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
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
        float float19 = funcionCuadratica3.eval(9999001.0f);
        funcionCuadratica3.setA(23.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 104.0f + "'", float13 == 104.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 199.0f + "'", float17 == 199.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 9.9980119E13f + "'", float19 == 9.9980119E13f);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
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
        funcionCuadratica3.setA(9.9999002E8f);
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
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
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
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-68.0f) + "'", float16 == (-68.0f));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float14 = funcionCuadratica13.getB();
        funcionCuadratica13.setB((float) (byte) -1);
        funcionCuadratica13.setC((float) (byte) 1);
        float float19 = funcionCuadratica13.getA();
        java.lang.String str20 = funcionCuadratica13.toString();
        float float21 = funcionCuadratica13.getA();
        funcionCuadratica13.setB((-68.0f));
        java.lang.Object obj24 = funcionCuadratica13.raices();
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica13);
        float float26 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(1.74240006E11f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str20.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
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
        float float17 = funcionCuadratica3.getB();
        float float18 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-40.0f) + "'", float18 == (-40.0f));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10.0x^2+100.0x" + "'", str6.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
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
        float float19 = funcionCuadratica3.eval(3.27513384E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-39.0f) + "'", float17 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0726502E36f + "'", float19 == 1.0726502E36f);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
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
        java.lang.Object obj39 = funcionCuadratica11.raices();
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
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(9.9999002E8f);
        funcionCuadratica3.setB(100000.0f);
        float float11 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-2.99996037E10f) + "'", float11 == (-2.99996037E10f));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
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
        java.lang.String str32 = funcionCuadratica20.toString();
        int int33 = funcionCuadratica20.numRaices();
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "32.0x^2+-1.0x+1.0" + "'", str32.equals("32.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(7.850772E18f, 6.8743594E11f, 1001097.0f);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
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
        java.lang.Object obj30 = funcionCuadratica3.raices();
        float float31 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass32 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 97.0f + "'", float31 == 97.0f);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
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
        float float17 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
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
        funcionCuadratica25.setB(121000.0f);
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float47 = funcionCuadratica46.getB();
        funcionCuadratica46.setB((float) 10);
        funcionCuadratica46.setA(1000.0f);
        boolean boolean52 = funcionCuadratica25.equals(funcionCuadratica46);
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
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 104.0f, 171610.0f);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1362064.0f) + "'", float4 == (-1362064.0f));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
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
        float float20 = funcionCuadratica3.getB();
        float float22 = funcionCuadratica3.eval((-3.9995961E10f));
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.599677E22f + "'", float22 == 1.599677E22f);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
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
        funcionCuadratica3.setC((-3.99876109E12f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 5.0f + "'", float18 == 5.0f);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (-1), (float) 10L);
        float float4 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(10004.0f);
        java.lang.String str7 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-399.0f) + "'", float4 == (-399.0f));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10004.0x+10.0" + "'", str7.equals("10.0x^2+10004.0x+10.0"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
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
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica34.setB((float) (byte) 0);
        float float37 = funcionCuadratica34.getA();
        int int38 = funcionCuadratica34.numRaices();
        funcionCuadratica34.setB(121000.0f);
        practico5.FuncionCuadratica funcionCuadratica44 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float45 = funcionCuadratica44.getB();
        java.lang.Object obj46 = funcionCuadratica44.raices();
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj51 = funcionCuadratica50.raices();
        boolean boolean52 = funcionCuadratica44.equals(funcionCuadratica50);
        java.lang.String str53 = funcionCuadratica44.toString();
        float float54 = funcionCuadratica44.getA();
        int int55 = funcionCuadratica44.numRaices();
        funcionCuadratica44.setB(1000.0f);
        boolean boolean58 = funcionCuadratica34.equals(funcionCuadratica44);
        boolean boolean59 = funcionCuadratica20.equals(funcionCuadratica34);
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
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 100.0f + "'", float45 == 100.0f);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "10.0x^2+100.0x" + "'", str53.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 10.0f + "'", float54 == 10.0f);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-387.0f), 160761.0f, (-38799.0f));
    }
}

