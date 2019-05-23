package practico5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(11310.0f, 1.007222E34f, 2.55992969E13f);
        float float5 = funcionCuadratica3.eval(9872.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.943295E37f + "'", float5 == 9.943295E37f);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.1945094E21f, (-8949.0f), 1.46409882E11f);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
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
        float float69 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(6.5542563E35f);
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
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 1.1121001E7f + "'", float69 == 1.1121001E7f);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
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
        funcionCuadratica22.setC(9413.0f);
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
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica(9.9999002E8f, 0.0f, 232.0f);
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica15);
        int int17 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC((-1.74107996E10f));
        float float20 = funcionCuadratica3.determinante();
        java.lang.Object obj21 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass22 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 6.9643198E10f + "'", float20 == 6.9643198E10f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) (short) 1, 1.62048E8f);
        funcionCuadratica3.setA(12600.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        funcionCuadratica3.setA(104.0f);
        funcionCuadratica3.setB(0.0f);
        float float12 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) 10L);
        float float15 = funcionCuadratica3.getC();
        float float17 = funcionCuadratica3.eval(2.72042404E18f);
        funcionCuadratica3.setB(1.8902726E23f);
        float float20 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + Float.POSITIVE_INFINITY + "'", float17 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.8902726E23f + "'", float20 == 1.8902726E23f);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
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
        float float28 = funcionCuadratica22.eval(1.9199824E8f);
        float float29 = funcionCuadratica22.determinante();
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
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 3.68633263E17f + "'", float28 == 3.68633263E17f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10000.0f + "'", float29 == 10000.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
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
        float float28 = funcionCuadratica10.getB();
        float float29 = funcionCuadratica10.getA();
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
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 104.0f + "'", float28 == 104.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
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
        float float27 = funcionCuadratica7.getB();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-1.0x^2+100.0x" + "'", str24.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
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
        float float20 = funcionCuadratica3.getB();
        float float21 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
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
        funcionCuadratica3.setC(10.0f);
        float float35 = funcionCuadratica3.eval((-40.0f));
        funcionCuadratica3.setA(7.850772E18f);
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
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 15610.0f + "'", float35 == 15610.0f);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.eval(2.92205049E12f);
        java.lang.String str8 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.eval(5.21576832E8f);
        funcionCuadratica3.setA(2.8919978E36f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 8.538379E25f + "'", float7 == 8.538379E25f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.72042404E18f + "'", float10 == 2.72042404E18f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
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
        int int24 = funcionCuadratica3.numRaices();
        float float25 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.60004E8f, 110.0f, (-1.7757429E22f));
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.60004E8f + "'", float4 == 1.60004E8f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.689414E23f, 0.0f, (-1.03602E19f));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(97.0f);
        float float9 = funcionCuadratica3.getB();
        float float11 = funcionCuadratica3.eval(9.9980119E13f);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica15.getClass();
        funcionCuadratica15.setA(3.15259781E10f);
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica15);
        float float20 = funcionCuadratica15.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.996025E28f + "'", float11 == 9.996025E28f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 2.0f + "'", float20 == 2.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica10.raices();
        funcionCuadratica10.setA((float) 1L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(157.0f);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        float float16 = funcionCuadratica3.determinante();
        float float17 = funcionCuadratica3.determinante();
        int int18 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(2.72027206E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10000.0f + "'", float17 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
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
        funcionCuadratica10.setB(1.72972816E17f);
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
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) (byte) 100, 131.0f);
        funcionCuadratica3.setB(0.0f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 104.0f, 171610.0f);
        float float5 = funcionCuadratica3.eval((-2.04805018E10f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.389019E20f + "'", float5 == 8.389019E20f);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, (float) 'a', (float) (short) 100);
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.getC();
        int int10 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
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
        java.lang.String str31 = funcionCuadratica24.toString();
        practico5.FuncionCuadratica funcionCuadratica35 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float36 = funcionCuadratica35.getB();
        float float37 = funcionCuadratica35.getC();
        float float38 = funcionCuadratica35.getC();
        float float39 = funcionCuadratica35.getB();
        int int40 = funcionCuadratica35.numRaices();
        practico5.FuncionCuadratica funcionCuadratica44 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float46 = funcionCuadratica44.eval(9413.0f);
        boolean boolean47 = funcionCuadratica35.equals(funcionCuadratica44);
        boolean boolean48 = funcionCuadratica24.equals(funcionCuadratica44);
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10.0x^2+10.0x" + "'", str31.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 8.8604582E8f + "'", float46 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
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
        float float21 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 401.0f + "'", float21 == 401.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
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
        float float15 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setA(157.0f);
        funcionCuadratica3.setC(4.2664473E22f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(34.0f, 10305.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getB();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        java.lang.Object obj16 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
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
        funcionCuadratica3.setA(8.6873588E10f);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-0.0f) + "'", obj8.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.538622E37f, 99901.0f, 9.996025E28f);
        float float4 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 4.538622E37f + "'", float4 == 4.538622E37f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
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
        float float40 = funcionCuadratica20.eval(9.998104E14f);
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
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 9.9962087E30f + "'", float40 == 9.9962087E30f);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
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
        float float29 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
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
        funcionCuadratica3.setB(2.72027206E11f);
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
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
        int int22 = funcionCuadratica3.numRaices();
        float float23 = funcionCuadratica3.getA();
        int int24 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-68.0f) + "'", float23 == (-68.0f));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.eval(7.850772E18f);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica(540560.0f, 1.02576384E8f, 0.0f);
        funcionCuadratica11.setB(10040.0f);
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica11);
        funcionCuadratica11.setA(1.7632299E10f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+10.0x" + "'", str4.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(11310.0f, 1.9199824E8f, (-1.7757429E22f));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-4000.0f), 2.0f, 10128.0f);
        funcionCuadratica3.setA(121000.0f);
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC(2.56012813E17f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "121000.0x^2+2.0x+10128.0" + "'", str7.equals("121000.0x^2+2.0x+10128.0"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(1.40576604E11f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
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
        funcionCuadratica9.setB(1.57933088E8f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str16.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
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
        float float23 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((-1.50924237E9f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
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
        float float21 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass22 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.eval(7.850772E18f);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica(540560.0f, 1.02576384E8f, 0.0f);
        funcionCuadratica11.setB(10040.0f);
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Object obj15 = funcionCuadratica11.raices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+10.0x" + "'", str4.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, (float) 1, 9413.0f);
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((-1.50924237E9f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 9413.0f + "'", float4 == 9413.0f);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getA();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.determinante();
        int int11 = funcionCuadratica3.numRaices();
        float float12 = funcionCuadratica3.determinante();
        float float13 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6120.0f + "'", float10 == 6120.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 6120.0f + "'", float12 == 6120.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 6120.0f + "'", float14 == 6120.0f);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        int int14 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
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
        funcionCuadratica3.setB((-1.5835014E32f));
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
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
        float float20 = funcionCuadratica3.eval(0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+-68.0x+1.0" + "'", str17.equals("10.0x^2+-68.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
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
        int int20 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getB();
        java.lang.String str7 = funcionCuadratica3.toString();
        java.lang.String str8 = funcionCuadratica3.toString();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+10.0x" + "'", str7.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC(1.30507776E8f);
        float float10 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
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
        funcionCuadratica10.setC(1.2791497E9f);
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        funcionCuadratica33.setB((float) (byte) -1);
        funcionCuadratica33.setC((float) (byte) 1);
        java.lang.String str39 = funcionCuadratica33.toString();
        float float40 = funcionCuadratica33.getC();
        practico5.FuncionCuadratica funcionCuadratica44 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int45 = funcionCuadratica44.numRaices();
        float float46 = funcionCuadratica44.getB();
        float float47 = funcionCuadratica44.getA();
        float float49 = funcionCuadratica44.eval((float) 1);
        boolean boolean50 = funcionCuadratica33.equals(funcionCuadratica44);
        int int51 = funcionCuadratica44.numRaices();
        boolean boolean52 = funcionCuadratica10.equals(funcionCuadratica44);
        practico5.FuncionCuadratica funcionCuadratica56 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float57 = funcionCuadratica56.getB();
        funcionCuadratica56.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica63 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj64 = funcionCuadratica63.raices();
        boolean boolean65 = funcionCuadratica56.equals(funcionCuadratica63);
        java.lang.Class<?> wildcardClass66 = funcionCuadratica56.getClass();
        java.lang.Class<?> wildcardClass67 = funcionCuadratica56.getClass();
        funcionCuadratica56.setA(199.0f);
        java.lang.String str70 = funcionCuadratica56.toString();
        float float71 = funcionCuadratica56.getB();
        boolean boolean72 = funcionCuadratica44.equals(funcionCuadratica56);
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
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str39.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 100.0f + "'", float49 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "199.0x^2+-1.0x" + "'", str70.equals("199.0x^2+-1.0x"));
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + (-1.0f) + "'", float71 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.determinante();
        float float12 = funcionCuadratica3.getA();
        int int13 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(1.00360436E16f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.String str11 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(401.0f);
        float float14 = funcionCuadratica3.getC();
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 160761.0f + "'", float15 == 160761.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399.0f), 1.6003198E20f, 1.02677664E9f);
        funcionCuadratica3.setB((-1.03602E19f));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
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
        float float21 = funcionCuadratica3.getB();
        try {
            java.lang.Object obj22 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str9.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
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
        float float19 = funcionCuadratica3.getA();
        float float21 = funcionCuadratica3.eval(3.27513384E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+-68.0x+1.0" + "'", str17.equals("10.0x^2+-68.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0726502E36f + "'", float21 == 1.0726502E36f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        funcionCuadratica3.setC(10.0f);
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x+10.0" + "'", str10.equals("10.0x^2+100.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        float float14 = funcionCuadratica9.getC();
        int int15 = funcionCuadratica9.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.5758312E33f, 4.1246156E13f, 9.943295E37f);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
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
        float float27 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass28 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
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
        float float34 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica9.getB();
        java.lang.Object obj13 = funcionCuadratica9.raices();
        java.lang.Object obj14 = funcionCuadratica9.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-152.0f), 1.0f, 6.2828482E12f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        funcionCuadratica3.setA(262190.0f);
        funcionCuadratica3.setB(171610.0f);
        funcionCuadratica3.setB(1.00360037E17f);
        java.lang.String str14 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(97.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "262190.0x^2+1.00360037E17x" + "'", str14.equals("262190.0x^2+1.00360037E17x"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getC();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        java.lang.String str5 = funcionCuadratica3.toString();
        float float6 = funcionCuadratica3.getC();
        try {
            java.lang.Object obj7 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0" + "'", str5.equals("10.0x^2+100.0"));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
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
        float float21 = funcionCuadratica3.eval(11310.0f);
        float float22 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.2791497E9f + "'", float21 == 1.2791497E9f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
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
        int int33 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC((-4.4474004E7f));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
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
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float24 = funcionCuadratica22.eval(0.0f);
        funcionCuadratica22.setB((float) 100L);
        funcionCuadratica22.setC((float) 1);
        float float29 = funcionCuadratica22.getC();
        boolean boolean30 = funcionCuadratica3.equals(funcionCuadratica22);
        float float31 = funcionCuadratica22.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
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
        funcionCuadratica3.setA(1.8902726E23f);
        int int28 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getC();
        float float9 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica13 = new practico5.FuncionCuadratica(5.0f, 2.56012813E17f, 9.9979908E12f);
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica13);
        funcionCuadratica3.setC(6120.0f);
        try {
            java.lang.Object obj17 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) 10);
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
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
        float float21 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10000.0f + "'", float21 == 10000.0f);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.09791189E12f, 5.6987436E7f, 4.538622E37f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
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
        float float21 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str9.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(121000.0f, 5.6987436E7f, 131.0f);
        float float4 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 131.0f + "'", float4 == 131.0f);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
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
        float float40 = funcionCuadratica26.eval(3.24756785E15f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str38.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0546697E31f + "'", float40 == 1.0546697E31f);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
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
        java.lang.Class<?> wildcardClass29 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(1.70024767E17f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.9449991E11f, (-224571.0f), 1.02677664E9f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.9449991E11x^2+-224571.0x+1.02677664E9" + "'", str4.equals("2.9449991E11x^2+-224571.0x+1.02677664E9"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        int int9 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setC((float) 10L);
        float float13 = funcionCuadratica3.eval((float) (short) 100);
        int int14 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(8.538379E25f);
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setC((-990.0f));
        float float12 = funcionCuadratica3.getA();
        float float14 = funcionCuadratica3.eval(2000.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 4.0019008E7f + "'", float14 == 4.0019008E7f);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
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
        java.lang.String str33 = funcionCuadratica3.toString();
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+100.0x" + "'", str33.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, 1.00009997E9f, (-1.03602E19f));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
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
        try {
            java.lang.Object obj29 = funcionCuadratica3.raices();
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str28.equals("10.0x^2+-1.0x+1.0"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass13 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(1.00009997E9f);
        int int16 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass17 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        float float11 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(10040.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        int int14 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(1000.0f);
        int int17 = funcionCuadratica3.numRaices();
        float float19 = funcionCuadratica3.eval(160761.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.58601746E11f + "'", float19 == 2.58601746E11f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
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
        float float19 = funcionCuadratica9.getB();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 401.0f + "'", float5 == 401.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+100.0x+1.0" + "'", str17.equals("10.0x^2+100.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((float) 1L);
        java.lang.String str11 = funcionCuadratica3.toString();
        float float12 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+1.0x" + "'", str11.equals("10.0x^2+1.0x"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setA((float) ' ');
        funcionCuadratica3.setC((float) (short) -1);
        float float16 = funcionCuadratica3.getA();
        float float17 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica21.setA((float) (byte) -1);
        java.lang.String str24 = funcionCuadratica21.toString();
        float float26 = funcionCuadratica21.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj31 = funcionCuadratica30.raices();
        float float32 = funcionCuadratica30.getC();
        float float33 = funcionCuadratica30.getA();
        boolean boolean34 = funcionCuadratica21.equals(funcionCuadratica30);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float39 = funcionCuadratica38.getB();
        funcionCuadratica38.setB((float) (byte) -1);
        funcionCuadratica38.setC((float) (byte) 1);
        float float44 = funcionCuadratica38.getA();
        java.lang.String str45 = funcionCuadratica38.toString();
        funcionCuadratica38.setC((float) (byte) 100);
        funcionCuadratica38.setC((float) 1L);
        boolean boolean50 = funcionCuadratica21.equals(funcionCuadratica38);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica21.getClass();
        java.lang.String str52 = funcionCuadratica21.toString();
        boolean boolean53 = funcionCuadratica3.equals(funcionCuadratica21);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-1.0x^2+100.0x" + "'", str24.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-11424.0f) + "'", float26 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str45.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-1.0x^2+100.0x" + "'", str52.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
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
        float float35 = funcionCuadratica3.determinante();
        java.lang.String str36 = funcionCuadratica3.toString();
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
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "10.0x^2" + "'", str36.equals("10.0x^2"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.eval(232.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 538340.0f + "'", float6 == 538340.0f);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
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
        java.lang.String str30 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 97.0f + "'", float19 == 97.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str24.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "2.2661277E21x^2+1000.0x+8.9558088E7" + "'", str30.equals("2.2661277E21x^2+1000.0x+8.9558088E7"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getB();
        java.lang.String str8 = funcionCuadratica3.toString();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str8.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(97.0f);
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getA();
        int int13 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) (byte) 100);
        float float21 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
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
        funcionCuadratica20.setB((float) (byte) -1);
        float float33 = funcionCuadratica20.getC();
        int int34 = funcionCuadratica20.numRaices();
        funcionCuadratica20.setA(9600.0f);
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
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float9 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-399996.0f), (-40.0f), 540560.0f);
        float float5 = funcionCuadratica3.eval(104.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4.3258204E9f) + "'", float5 == (-4.3258204E9f));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(1141477.0f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.eval(1.72972816E17f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + Float.POSITIVE_INFINITY + "'", float13 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
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
        java.lang.Object obj16 = funcionCuadratica10.raices();
        java.lang.String str17 = funcionCuadratica10.toString();
        float float18 = funcionCuadratica10.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+10.0x" + "'", str17.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (float) (byte) -1, (float) 100L);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC((-399996.0f));
        float float8 = funcionCuadratica3.eval(7.850772E18f);
        float float9 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((-6.163462E37f));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-6.163462E37f) + "'", float8 == (-6.163462E37f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-399996.0f) + "'", float9 == (-399996.0f));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
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
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica(104.0f, 1.70024767E17f, 0.0f);
        float float38 = funcionCuadratica37.getC();
        float float39 = funcionCuadratica37.determinante();
        boolean boolean40 = funcionCuadratica19.equals(funcionCuadratica37);
        java.lang.String str41 = funcionCuadratica37.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 2.890842E34f + "'", float39 == 2.890842E34f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "104.0x^2+1.70024767E17x" + "'", str41.equals("104.0x^2+1.70024767E17x"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
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
        java.lang.Object obj41 = funcionCuadratica26.raices();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10000.0f + "'", float28 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(60.0f, 1.7012454E28f, 1.30308388E12f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float23 = funcionCuadratica22.getB();
        funcionCuadratica22.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj30 = funcionCuadratica29.raices();
        boolean boolean31 = funcionCuadratica22.equals(funcionCuadratica29);
        float float32 = funcionCuadratica29.getA();
        funcionCuadratica29.setC((float) (short) -1);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float39 = funcionCuadratica38.getB();
        java.lang.Object obj40 = funcionCuadratica38.raices();
        practico5.FuncionCuadratica funcionCuadratica44 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj45 = funcionCuadratica44.raices();
        boolean boolean46 = funcionCuadratica38.equals(funcionCuadratica44);
        float float47 = funcionCuadratica44.getB();
        java.lang.Object obj48 = funcionCuadratica44.raices();
        boolean boolean49 = funcionCuadratica29.equals(funcionCuadratica44);
        boolean boolean50 = funcionCuadratica3.equals(funcionCuadratica44);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 100.0f + "'", float47 == 100.0f);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        float float4 = funcionCuadratica3.determinante();
        float float6 = funcionCuadratica3.eval(262190.0f);
        java.lang.String str7 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-800.0f) + "'", float4 == (-800.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.37487188E11f + "'", float6 == 1.37487188E11f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2.0x^2+100.0" + "'", str7.equals("2.0x^2+100.0"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
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
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        funcionCuadratica19.setB((float) (byte) -1);
        funcionCuadratica19.setC((float) (byte) 1);
        float float25 = funcionCuadratica19.getA();
        float float26 = funcionCuadratica19.getC();
        java.lang.String str27 = funcionCuadratica19.toString();
        funcionCuadratica19.setA((float) 1L);
        float float30 = funcionCuadratica19.getC();
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        java.lang.Object obj36 = funcionCuadratica34.raices();
        practico5.FuncionCuadratica funcionCuadratica40 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj41 = funcionCuadratica40.raices();
        boolean boolean42 = funcionCuadratica34.equals(funcionCuadratica40);
        java.lang.String str43 = funcionCuadratica34.toString();
        funcionCuadratica34.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica49 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float50 = funcionCuadratica49.getB();
        funcionCuadratica49.setB((float) (byte) -1);
        funcionCuadratica49.setC((float) (byte) 1);
        float float55 = funcionCuadratica49.getA();
        java.lang.String str56 = funcionCuadratica49.toString();
        float float57 = funcionCuadratica49.getC();
        float float58 = funcionCuadratica49.getB();
        float float60 = funcionCuadratica49.eval((float) '#');
        float float61 = funcionCuadratica49.determinante();
        funcionCuadratica49.setB((float) 2);
        float float65 = funcionCuadratica49.eval((float) '#');
        funcionCuadratica49.setC((float) 1);
        float float68 = funcionCuadratica49.getA();
        boolean boolean69 = funcionCuadratica34.equals(funcionCuadratica49);
        boolean boolean70 = funcionCuadratica19.equals(funcionCuadratica34);
        boolean boolean71 = funcionCuadratica3.equals(funcionCuadratica19);
        practico5.FuncionCuadratica funcionCuadratica75 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str76 = funcionCuadratica75.toString();
        boolean boolean77 = funcionCuadratica19.equals(funcionCuadratica75);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 401.0f + "'", float15 == 401.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str27.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "10.0x^2+100.0x" + "'", str43.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 100.0f + "'", float50 == 100.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 10.0f + "'", float55 == 10.0f);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str56.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57 == 1.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + (-1.0f) + "'", float58 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 12216.0f + "'", float60 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-39.0f) + "'", float61 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 12321.0f + "'", float65 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 10.0f + "'", float68 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str76.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
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
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
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
        int int28 = funcionCuadratica20.numRaices();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(210.0f);
        float float13 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(1000.0f);
        float float17 = funcionCuadratica3.eval(7.4079805E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.15244175E24f + "'", float17 == 1.15244175E24f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
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
        float float29 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(1.1121001E7f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+10.0x" + "'", str28.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
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
        float float17 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.50536632E10f + "'", float16 == 1.50536632E10f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-79.0f) + "'", float17 == (-79.0f));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
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
        float float16 = funcionCuadratica10.getB();
        float float17 = funcionCuadratica10.getB();
        float float18 = funcionCuadratica10.determinante();
        float float19 = funcionCuadratica10.getA();
        float float21 = funcionCuadratica10.eval((-90.0f));
        float float23 = funcionCuadratica10.eval(1.880975E22f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 80100.0f + "'", float21 == 80100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + Float.POSITIVE_INFINITY + "'", float23 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(1.00009997E9f);
        practico5.FuncionCuadratica funcionCuadratica14 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica14.setB((float) (byte) 0);
        float float17 = funcionCuadratica14.getA();
        java.lang.Object obj18 = funcionCuadratica14.raices();
        float float19 = funcionCuadratica14.getA();
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica14);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-0.0f) + "'", obj18.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(1.74241333E11f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
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
        float float32 = funcionCuadratica3.determinante();
        float float33 = funcionCuadratica3.determinante();
        java.lang.String str34 = funcionCuadratica3.toString();
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10128.0f + "'", float32 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10128.0f + "'", float33 == 10128.0f);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str34.equals("32.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
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
        float float31 = funcionCuadratica3.getB();
        float float32 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getA();
        java.lang.Object obj15 = funcionCuadratica3.raices();
        java.lang.String str16 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+100.0x" + "'", str16.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float5 = funcionCuadratica3.eval(9413.0f);
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((-0.0f));
        java.lang.String str9 = funcionCuadratica3.toString();
        float float10 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(8.6488737E11f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.8604582E8f + "'", float5 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2" + "'", str9.equals("10.0x^2"));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
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
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        funcionCuadratica23.setB((float) (byte) -1);
        funcionCuadratica23.setC((float) (byte) 1);
        float float29 = funcionCuadratica23.getA();
        java.lang.String str30 = funcionCuadratica23.toString();
        float float31 = funcionCuadratica23.getC();
        float float32 = funcionCuadratica23.getB();
        float float34 = funcionCuadratica23.eval((float) '#');
        float float35 = funcionCuadratica23.getA();
        java.lang.Class<?> wildcardClass36 = funcionCuadratica23.getClass();
        float float37 = funcionCuadratica23.determinante();
        java.lang.Class<?> wildcardClass38 = funcionCuadratica23.getClass();
        float float40 = funcionCuadratica23.eval(1141477.0f);
        boolean boolean41 = funcionCuadratica3.equals(funcionCuadratica23);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "10.0x^2+2.0x+1.0" + "'", str19.equals("10.0x^2+2.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str30.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 12216.0f + "'", float34 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10.0f + "'", float35 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-39.0f) + "'", float37 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.30296966E13f + "'", float40 == 1.30296966E13f);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setC((float) (byte) 10);
        funcionCuadratica3.setB(171610.0f);
        funcionCuadratica3.setA(1.8902726E23f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, 1.0f, 11310.0f);
        float float5 = funcionCuadratica3.eval(1.46409882E11f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.1435853E22f + "'", float5 == 2.1435853E22f);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
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
        float float23 = funcionCuadratica17.getB();
        float float24 = funcionCuadratica17.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10000.0f + "'", float19 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
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
        funcionCuadratica10.setB(2.3367358E36f);
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
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
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
        funcionCuadratica3.setC(1.30308388E12f);
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
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
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
        float float46 = funcionCuadratica43.getB();
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
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-38799.0f) + "'", float46 == (-38799.0f));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setA((float) (-1));
        float float15 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB(9600.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 401.0f + "'", float15 == 401.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getC();
        float float12 = funcionCuadratica3.getB();
        float float14 = funcionCuadratica3.eval((float) '#');
        java.lang.String str15 = funcionCuadratica3.toString();
        float float16 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str15.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(160001.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
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
        funcionCuadratica3.setB(2.3367358E36f);
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 1000.0f, 5.21574144E8f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(3.0313594E21f, 9.999992E7f, 104.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica7.setA((float) (byte) -1);
        funcionCuadratica7.setC((float) 0);
        java.lang.Class<?> wildcardClass12 = funcionCuadratica7.getClass();
        int int13 = funcionCuadratica7.numRaices();
        funcionCuadratica7.setC((float) 10L);
        float float17 = funcionCuadratica7.eval((float) (short) 100);
        boolean boolean18 = funcionCuadratica3.equals(funcionCuadratica7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getB();
        float float12 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
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
        java.lang.Object obj16 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        int int19 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(9.9979908E12f);
        float float8 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica12.setB((float) 0L);
        funcionCuadratica12.setA(232.0f);
        funcionCuadratica12.setA(262190.0f);
        funcionCuadratica12.setB(171610.0f);
        funcionCuadratica12.setB(1.00360037E17f);
        boolean boolean23 = funcionCuadratica3.equals(funcionCuadratica12);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.9979908E12f + "'", float8 == 9.9979908E12f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (byte) 10);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica16.setA((float) (byte) -1);
        funcionCuadratica16.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        funcionCuadratica24.setB((float) (byte) -1);
        funcionCuadratica24.setC((float) (byte) 1);
        boolean boolean30 = funcionCuadratica16.equals(funcionCuadratica24);
        boolean boolean31 = funcionCuadratica12.equals(funcionCuadratica16);
        java.lang.String str32 = funcionCuadratica16.toString();
        float float33 = funcionCuadratica16.getC();
        float float35 = funcionCuadratica16.eval(132000.0f);
        funcionCuadratica16.setA(9.9999002E8f);
        float float39 = funcionCuadratica16.eval((-2.890842E34f));
        boolean boolean40 = funcionCuadratica3.equals(funcionCuadratica16);
        float float41 = funcionCuadratica3.getA();
        funcionCuadratica3.setC(6.8743594E11f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-1.0x^2+100.0x" + "'", str32.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.74107996E10f) + "'", float35 == (-1.74107996E10f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + Float.POSITIVE_INFINITY + "'", float39 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
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
        float float18 = funcionCuadratica3.getB();
        java.lang.String str19 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 104.0f + "'", float13 == 104.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.94517084E10f + "'", float16 == 2.94517084E10f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str19.equals("1.0x^2+10.0x+-1.0"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(9.999801E18f, (float) (byte) 1, (-224571.0f));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
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
        float float22 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(9413.0f);
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
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
        java.lang.Object obj18 = funcionCuadratica12.raices();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica12.getClass();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
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
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float24 = funcionCuadratica23.determinante();
        float float25 = funcionCuadratica23.getA();
        boolean boolean26 = funcionCuadratica3.equals(funcionCuadratica23);
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        float float31 = funcionCuadratica30.determinante();
        java.lang.Class<?> wildcardClass32 = funcionCuadratica30.getClass();
        float float33 = funcionCuadratica30.determinante();
        boolean boolean34 = funcionCuadratica23.equals(funcionCuadratica30);
        float float35 = funcionCuadratica30.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 401.0f + "'", float24 == 401.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-800.0f) + "'", float31 == (-800.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-800.0f) + "'", float33 == (-800.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getB();
        float float7 = funcionCuadratica3.getB();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj14 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(2.92205049E12f);
        float float8 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
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
        java.lang.Object obj36 = funcionCuadratica20.raices();
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
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
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
        float float25 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-38864.0f) + "'", float7 == (-38864.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 12216.0f + "'", float8 == 12216.0f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.String str6 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.eval((-68.0f));
        float float9 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(2.2661277E21f);
        funcionCuadratica3.setB(0.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
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
        funcionCuadratica12.setA(1021.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setB(1.52190226E13f);
        float float15 = funcionCuadratica3.getB();
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.52190226E13f + "'", float15 == 1.52190226E13f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.52190226E13f + "'", float16 == 1.52190226E13f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float10 = funcionCuadratica3.eval(1.0f);
        funcionCuadratica3.setA((-39.0f));
        funcionCuadratica3.setC((float) 1);
        funcionCuadratica3.setA((-5.089792E9f));
        funcionCuadratica3.setA(4.538622E37f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
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
        java.lang.String str32 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "1.0x^2+97.0x+-1.0" + "'", str32.equals("1.0x^2+97.0x+-1.0"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getB();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica12);
        float float17 = funcionCuadratica3.eval((-1276.0f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1500576.0f + "'", float17 == 1500576.0f);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) (short) -1, 12216.0f);
        funcionCuadratica3.setB((float) (short) 100);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(1.58886003E9f);
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 12216.0f + "'", float7 == 12216.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.58886003E9x^2+100.0x+12216.0" + "'", str10.equals("1.58886003E9x^2+100.0x+12216.0"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(121000.0f);
        funcionCuadratica3.setB((float) 100);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(110.0f, (-4000.0f), (-399996.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "110.0x^2+-4000.0x+-399996.0" + "'", str4.equals("110.0x^2+-4000.0x+-399996.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-399996.0f) + "'", float5 == (-399996.0f));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(121000.0f);
        float float7 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(8.389019E20f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        funcionCuadratica3.setA(1233649.0f);
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getC();
        funcionCuadratica3.setB(0.0f);
        int int21 = funcionCuadratica3.numRaices();
        float float22 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
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
        funcionCuadratica22.setA(8.538379E25f);
        java.lang.Class<?> wildcardClass31 = funcionCuadratica22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
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
        funcionCuadratica35.setA((-3.0f));
        java.lang.String str48 = funcionCuadratica35.toString();
        funcionCuadratica35.setA(9413.0f);
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
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-3.0x^2+100.0x" + "'", str48.equals("-3.0x^2+100.0x"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.50536632E10f, (-38799.0f), 1.67442702E17f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
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
        funcionCuadratica3.setA(1.74240006E11f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-1.0x^2+100.0x" + "'", str19.equals("-1.0x^2+100.0x"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float8 = funcionCuadratica3.getB();
        float float9 = funcionCuadratica3.getB();
        float float10 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(1.880975E22f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
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
        funcionCuadratica10.setB(2.72042404E18f);
        funcionCuadratica10.setA(7.4079805E10f);
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
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
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
        funcionCuadratica3.setA((float) (-1));
        funcionCuadratica3.setA(8.674031E23f);
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
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
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
        int int19 = funcionCuadratica3.numRaices();
        float float21 = funcionCuadratica3.eval(1.09791189E12f);
        try {
            java.lang.Object obj22 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.2054106E25f + "'", float21 == 1.2054106E25f);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
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
        int int31 = funcionCuadratica3.numRaices();
        java.lang.Object obj32 = funcionCuadratica3.raices();
        float float33 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 2.0f, 15610.0f);
        funcionCuadratica3.setC(6120.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
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
        practico5.FuncionCuadratica funcionCuadratica33 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float34 = funcionCuadratica33.getB();
        float float35 = funcionCuadratica33.determinante();
        funcionCuadratica33.setB((float) 10L);
        funcionCuadratica33.setA((float) 1);
        funcionCuadratica33.setC((float) (byte) -1);
        float float42 = funcionCuadratica33.getC();
        float float43 = funcionCuadratica33.getA();
        java.lang.Object obj44 = funcionCuadratica33.raices();
        float float45 = funcionCuadratica33.getC();
        java.lang.Object obj46 = funcionCuadratica33.raices();
        funcionCuadratica33.setC(0.0f);
        boolean boolean49 = funcionCuadratica3.equals(funcionCuadratica33);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-1.0x^2+10.0x" + "'", str28.equals("-1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 10000.0f + "'", float35 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        int int7 = funcionCuadratica3.numRaices();
        float float9 = funcionCuadratica3.eval((float) (short) 1);
        funcionCuadratica3.setA((-399996.0f));
        float float12 = funcionCuadratica3.getB();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
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
        float float49 = funcionCuadratica13.getC();
        java.lang.Class<?> wildcardClass50 = funcionCuadratica13.getClass();
        funcionCuadratica13.setA(Float.POSITIVE_INFINITY);
        funcionCuadratica13.setA(1.1496289E29f);
        float float55 = funcionCuadratica13.getB();
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
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 100.0f + "'", float55 == 100.0f);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
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
        java.lang.Object obj42 = funcionCuadratica10.raices();
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float48 = funcionCuadratica46.eval((-11424.0f));
        float float49 = funcionCuadratica46.getA();
        java.lang.Class<?> wildcardClass50 = funcionCuadratica46.getClass();
        boolean boolean51 = funcionCuadratica10.equals(funcionCuadratica46);
        int int52 = funcionCuadratica46.numRaices();
        int int53 = funcionCuadratica46.numRaices();
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
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.30393536E8f + "'", float48 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float13 = funcionCuadratica3.eval(232.0f);
        float float14 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Object obj20 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        boolean boolean26 = funcionCuadratica18.equals(funcionCuadratica24);
        funcionCuadratica18.setA((float) ' ');
        float float30 = funcionCuadratica18.eval((float) (short) -1);
        java.lang.String str31 = funcionCuadratica18.toString();
        float float32 = funcionCuadratica18.getB();
        float float33 = funcionCuadratica18.getA();
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 56143.0f + "'", float13 == 56143.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-68.0f) + "'", float30 == (-68.0f));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "32.0x^2+100.0x" + "'", str31.equals("32.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 32.0f + "'", float33 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
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
        funcionCuadratica22.setB(1.37487188E11f);
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
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 100);
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        float float12 = funcionCuadratica3.eval((float) (-1L));
        funcionCuadratica3.setC(9.9979908E12f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1), 2.92205652E12f, 1.70024741E16f);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100000.0f, 3.0313594E21f, 0.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100000.0x^2+3.0313594E21x" + "'", str4.equals("100000.0x^2+3.0313594E21x"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
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
        float float16 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-68.0f) + "'", float16 == (-68.0f));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Object obj18 = funcionCuadratica3.raices();
        funcionCuadratica3.setA(1.599677E22f);
        float float21 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        float float12 = funcionCuadratica3.getA();
        float float13 = funcionCuadratica3.determinante();
        float float14 = funcionCuadratica3.getB();
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(12600.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10000.0f + "'", float15 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.0f, 232.0f, 2000.0f);
        funcionCuadratica3.setC(1.00360449E17f);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(4.9065876E9f, 0.0f, 540560.0f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(2.94767698E10f, 2.58601746E11f, 8.688799E21f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
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
        funcionCuadratica3.setB(8.6740314E21f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        float float5 = funcionCuadratica3.determinante();
        float float6 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.eval(1.00360441E17f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 5.21574144E8f + "'", float5 == 5.21574144E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 5.21574144E8f + "'", float6 == 5.21574144E8f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + Float.POSITIVE_INFINITY + "'", float8 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00360436E16f, 3.7515608E7f, 0.0f);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.0003998E36f), 1233649.0f, (-1.50574944E8f));
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + Float.NEGATIVE_INFINITY + "'", float4 == Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + Float.NEGATIVE_INFINITY + "'", float5 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float9 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        funcionCuadratica3.setB(0.0f);
        int int15 = funcionCuadratica3.numRaices();
        float float16 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
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
        java.lang.Class<?> wildcardClass33 = funcionCuadratica20.getClass();
        java.lang.String str34 = funcionCuadratica20.toString();
        float float35 = funcionCuadratica20.getB();
        int int36 = funcionCuadratica20.numRaices();
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str34.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float11 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 6000.0f + "'", float11 == 6000.0f);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(8.6873588E10f, 232.0f, 131.0f);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) 'a');
        float float8 = funcionCuadratica3.getA();
        int int9 = funcionCuadratica3.numRaices();
        float float10 = funcionCuadratica3.getC();
        java.lang.Object obj11 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((-4.901952E9f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10000.0f + "'", float7 == 10000.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
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
        float float44 = funcionCuadratica15.getA();
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 32.0f + "'", float44 == 32.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
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
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica20.setA((float) (byte) -1);
        java.lang.String str23 = funcionCuadratica20.toString();
        float float25 = funcionCuadratica20.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj30 = funcionCuadratica29.raices();
        float float31 = funcionCuadratica29.getC();
        float float32 = funcionCuadratica29.getA();
        boolean boolean33 = funcionCuadratica20.equals(funcionCuadratica29);
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float38 = funcionCuadratica37.getB();
        funcionCuadratica37.setB((float) (byte) -1);
        funcionCuadratica37.setC((float) (byte) 1);
        float float43 = funcionCuadratica37.getA();
        java.lang.String str44 = funcionCuadratica37.toString();
        funcionCuadratica37.setC((float) (byte) 100);
        funcionCuadratica37.setC((float) 1L);
        boolean boolean49 = funcionCuadratica20.equals(funcionCuadratica37);
        boolean boolean50 = funcionCuadratica3.equals(funcionCuadratica20);
        java.lang.String str51 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10.0x^2+100.0x" + "'", str15.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-11424.0f) + "'", float25 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str44.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "10.0x^2+100.0x" + "'", str51.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setA((float) '#');
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        float float13 = funcionCuadratica3.determinante();
        float float15 = funcionCuadratica3.eval((-1.7757429E22f));
        funcionCuadratica3.setB((-6900.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + Float.POSITIVE_INFINITY + "'", float15 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        float float11 = funcionCuadratica3.getA();
        float float12 = funcionCuadratica3.getC();
        float float13 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass14 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((-4000.0f));
        float float17 = funcionCuadratica3.getC();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
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
        float float39 = funcionCuadratica20.determinante();
        float float40 = funcionCuadratica20.getC();
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
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-39.0f) + "'", float39 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
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
        java.lang.Object obj16 = funcionCuadratica10.raices();
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        java.lang.Object obj22 = funcionCuadratica20.raices();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj27 = funcionCuadratica26.raices();
        boolean boolean28 = funcionCuadratica20.equals(funcionCuadratica26);
        funcionCuadratica20.setA((float) ' ');
        funcionCuadratica20.setC((float) (short) -1);
        float float33 = funcionCuadratica20.determinante();
        float float35 = funcionCuadratica20.eval((float) (byte) 1);
        java.lang.Object obj36 = funcionCuadratica20.raices();
        funcionCuadratica20.setC(1.60004E8f);
        boolean boolean39 = funcionCuadratica10.equals(funcionCuadratica20);
        float float40 = funcionCuadratica20.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10128.0f + "'", float33 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 131.0f + "'", float35 == 131.0f);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
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
        float float22 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica23 = null;
        try {
            boolean boolean24 = funcionCuadratica3.equals(funcionCuadratica23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
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
        float float41 = funcionCuadratica7.getB();
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
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
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
        float float40 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(210.0f, 6120.0f, 100.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float8 = funcionCuadratica7.getB();
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setB((float) 10L);
        funcionCuadratica7.setA((float) 1);
        funcionCuadratica7.setC((float) (byte) -1);
        float float16 = funcionCuadratica7.getC();
        funcionCuadratica7.setB((float) 'a');
        float float20 = funcionCuadratica7.eval(1021.0f);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        float float26 = funcionCuadratica24.getC();
        float float27 = funcionCuadratica24.getA();
        java.lang.Object obj28 = funcionCuadratica24.raices();
        int int29 = funcionCuadratica24.numRaices();
        float float31 = funcionCuadratica24.eval(1.30393536E8f);
        float float32 = funcionCuadratica24.determinante();
        boolean boolean33 = funcionCuadratica7.equals(funcionCuadratica24);
        boolean boolean34 = funcionCuadratica3.equals(funcionCuadratica7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1141477.0f + "'", float20 == 1141477.0f);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.70024767E17f + "'", float31 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10000.0f + "'", float32 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float9 = funcionCuadratica8.getB();
        funcionCuadratica8.setB((float) (byte) -1);
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica8);
        practico5.FuncionCuadratica funcionCuadratica16 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float17 = funcionCuadratica16.getB();
        float float18 = funcionCuadratica16.getC();
        float float19 = funcionCuadratica16.getC();
        practico5.FuncionCuadratica funcionCuadratica23 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float24 = funcionCuadratica23.getB();
        float float25 = funcionCuadratica23.determinante();
        boolean boolean26 = funcionCuadratica16.equals(funcionCuadratica23);
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float31 = funcionCuadratica30.getB();
        float float32 = funcionCuadratica30.determinante();
        funcionCuadratica30.setB((float) 10L);
        boolean boolean35 = funcionCuadratica23.equals(funcionCuadratica30);
        funcionCuadratica23.setB(104.0f);
        practico5.FuncionCuadratica funcionCuadratica41 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float42 = funcionCuadratica41.getB();
        java.lang.Object obj43 = funcionCuadratica41.raices();
        practico5.FuncionCuadratica funcionCuadratica47 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj48 = funcionCuadratica47.raices();
        boolean boolean49 = funcionCuadratica41.equals(funcionCuadratica47);
        java.lang.String str50 = funcionCuadratica41.toString();
        float float52 = funcionCuadratica41.eval(1.30393536E8f);
        boolean boolean53 = funcionCuadratica23.equals(funcionCuadratica41);
        int int54 = funcionCuadratica23.numRaices();
        boolean boolean55 = funcionCuadratica3.equals(funcionCuadratica23);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10000.0f + "'", float25 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10000.0f + "'", float32 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "10.0x^2+100.0x" + "'", str50.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.70024767E17f + "'", float52 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10000.0f, (-399900.0f), 1.74240006E11f);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00360441E17f, 9.9989899E15f, 8.688799E21f);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
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
        float float29 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.74107996E10f) + "'", float26 == (-1.74107996E10f));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 9.9999002E8f + "'", float29 == 9.9999002E8f);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((float) '4');
        funcionCuadratica3.setC((float) 1L);
        funcionCuadratica3.setB(Float.POSITIVE_INFINITY);
        float float12 = funcionCuadratica3.eval(2.2661277E21f);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(1.60744614E17f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str4.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.determinante();
        java.lang.String str7 = funcionCuadratica3.toString();
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0x^2+100.0x" + "'", str7.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        float float14 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
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
        float float35 = funcionCuadratica3.getB();
        float float36 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        funcionCuadratica3.setA(232.0f);
        funcionCuadratica3.setA(262190.0f);
        funcionCuadratica3.setB(171610.0f);
        funcionCuadratica3.setC((-6.163462E37f));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
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
        java.lang.String str18 = funcionCuadratica3.toString();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica3.getClass();
        float float20 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10.0x^2+-1.0x+10.0" + "'", str18.equals("10.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
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
        funcionCuadratica10.setA(12321.0f);
        java.lang.Object obj21 = funcionCuadratica10.raices();
        float float22 = funcionCuadratica10.getC();
        float float23 = funcionCuadratica10.determinante();
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica31.setA((float) (byte) -1);
        funcionCuadratica31.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float40 = funcionCuadratica39.getB();
        funcionCuadratica39.setB((float) (byte) -1);
        funcionCuadratica39.setC((float) (byte) 1);
        boolean boolean45 = funcionCuadratica31.equals(funcionCuadratica39);
        boolean boolean46 = funcionCuadratica27.equals(funcionCuadratica31);
        java.lang.String str47 = funcionCuadratica31.toString();
        practico5.FuncionCuadratica funcionCuadratica51 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        boolean boolean52 = funcionCuadratica31.equals(funcionCuadratica51);
        funcionCuadratica51.setB(999899.0f);
        float float56 = funcionCuadratica51.eval(1141477.0f);
        boolean boolean57 = funcionCuadratica10.equals(funcionCuadratica51);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "-1.0x^2+100.0x" + "'", str47.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 1.31438331E14f + "'", float56 == 1.31438331E14f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(199.0f);
        float float9 = funcionCuadratica3.getC();
        float float10 = funcionCuadratica3.determinante();
        float float12 = funcionCuadratica3.eval(1.3095033E32f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10000.0f + "'", float10 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + Float.POSITIVE_INFINITY + "'", float12 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
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
        funcionCuadratica3.setC((-9.997902E13f));
        practico5.FuncionCuadratica funcionCuadratica37 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float39 = funcionCuadratica37.eval(0.0f);
        int int40 = funcionCuadratica37.numRaices();
        java.lang.Object obj41 = funcionCuadratica37.raices();
        java.lang.Class<?> wildcardClass42 = funcionCuadratica37.getClass();
        funcionCuadratica37.setB((float) 1L);
        boolean boolean45 = funcionCuadratica3.equals(funcionCuadratica37);
        float float46 = funcionCuadratica37.getC();
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
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
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
        funcionCuadratica20.setB((float) (byte) -1);
        float float33 = funcionCuadratica20.getC();
        float float34 = funcionCuadratica20.getA();
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
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
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
        java.lang.Object obj18 = funcionCuadratica10.raices();
        funcionCuadratica10.setC(2.92205652E12f);
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
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
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
        funcionCuadratica10.setB(0.0f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-1.0x^2+100.0x" + "'", str26.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
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
        try {
            java.lang.Object obj20 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
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
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
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
        float float26 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float31 = funcionCuadratica30.getB();
        funcionCuadratica30.setB((float) (byte) -1);
        funcionCuadratica30.setC((float) (byte) 1);
        float float36 = funcionCuadratica30.getA();
        float float37 = funcionCuadratica30.getC();
        java.lang.String str38 = funcionCuadratica30.toString();
        float float39 = funcionCuadratica30.determinante();
        java.lang.Class<?> wildcardClass40 = funcionCuadratica30.getClass();
        float float41 = funcionCuadratica30.getC();
        float float43 = funcionCuadratica30.eval((-4000.0f));
        float float44 = funcionCuadratica30.getC();
        float float45 = funcionCuadratica30.getA();
        funcionCuadratica30.setB(2.56012813E17f);
        funcionCuadratica30.setA((-2.890842E34f));
        boolean boolean50 = funcionCuadratica3.equals(funcionCuadratica30);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 10.0f + "'", float36 == 10.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str38.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-39.0f) + "'", float39 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.60004E8f + "'", float43 == 1.60004E8f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
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
        funcionCuadratica3.setA(1.2791497E9f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10.0x^2+10.0x" + "'", str23.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setA((float) 1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (byte) 100);
        float float8 = funcionCuadratica3.getA();
        java.lang.String str9 = funcionCuadratica3.toString();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float12 = funcionCuadratica3.eval((-152.0f));
        funcionCuadratica3.setA(2.56012813E17f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str9.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 215940.0f + "'", float12 == 215940.0f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00219519E12f, (-4.159E7f), 1.58886003E9f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        java.lang.String str14 = funcionCuadratica9.toString();
        funcionCuadratica9.setB(9.999992E7f);
        java.lang.String str17 = funcionCuadratica9.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10.0x^2+100.0x+100.0" + "'", str14.equals("10.0x^2+100.0x+100.0"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "10.0x^2+9.999992E7x+100.0" + "'", str17.equals("10.0x^2+9.999992E7x+100.0"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        float float10 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float5 = funcionCuadratica3.eval((-11424.0f));
        float float6 = funcionCuadratica3.determinante();
        float float8 = funcionCuadratica3.eval(262190.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.30393536E8f + "'", float5 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 6.8746215E10f + "'", float8 == 6.8746215E10f);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getB();
        java.lang.String str19 = funcionCuadratica3.toString();
        int int20 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(1015697.0f);
        funcionCuadratica3.setA(6120.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-1.0x^2+100.0x" + "'", str19.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
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
        funcionCuadratica3.setC(4.9065876E9f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.70024767E17f + "'", float10 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10000.0f + "'", float11 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "10.0x^2+100.0x" + "'", str13.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
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
        float float26 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 157.0f + "'", float26 == 157.0f);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.determinante();
        float float7 = funcionCuadratica3.getC();
        int int8 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1500576.0f, (-5.0163968E8f), 2.9451708E11f);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
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
        float float32 = funcionCuadratica3.getA();
        float float33 = funcionCuadratica3.getA();
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
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
        funcionCuadratica15.setB(9.943295E37f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10000.0f + "'", float20 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        float float18 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(3.0313594E21f);
        funcionCuadratica3.setC(2.1435855E23f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
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
        funcionCuadratica3.setC(9.9999002E8f);
        java.lang.Class<?> wildcardClass33 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Class<?> wildcardClass18 = funcionCuadratica3.getClass();
        funcionCuadratica3.setC(262190.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
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
        int int56 = funcionCuadratica52.numRaices();
        float float57 = funcionCuadratica52.determinante();
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 4760.0f + "'", float57 == 4760.0f);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass11 = funcionCuadratica3.getClass();
        int int12 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float5 = funcionCuadratica3.eval(9413.0f);
        java.lang.Class<?> wildcardClass6 = funcionCuadratica3.getClass();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(1.0726502E36f);
        funcionCuadratica3.setB(32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 8.8604582E8f + "'", float5 == 8.8604582E8f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
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
        int int17 = funcionCuadratica3.numRaices();
        float float18 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 9413.0f + "'", float18 == 9413.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1L);
        java.lang.String str10 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2+100.0x" + "'", str10.equals("1.0x^2+100.0x"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-240000.0f), (-6.163462E37f), 2.1439433E23f);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
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
        funcionCuadratica3.setA(32.0f);
        java.lang.String str22 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "32.0x^2+2.0x+1.0" + "'", str22.equals("32.0x^2+2.0x+1.0"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
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
        java.lang.Object obj17 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
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
        float float18 = funcionCuadratica10.getA();
        java.lang.Class<?> wildcardClass19 = funcionCuadratica10.getClass();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-387.0f), 1.628176E7f, (float) '4');
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.65095716E14f + "'", float4 == 2.65095716E14f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        float float9 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(110.0f);
        java.lang.Object obj7 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0x^2+2.0x+-39.0" + "'", str4.equals("-1.0x^2+2.0x+-39.0"));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
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
        float float19 = funcionCuadratica12.eval(8.674031E23f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0x^2+100.0x" + "'", str6.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-11424.0f) + "'", float8 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10000.0f + "'", float17 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + Float.POSITIVE_INFINITY + "'", float19 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
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
        java.lang.Object obj32 = funcionCuadratica19.raices();
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
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        java.lang.String str10 = funcionCuadratica9.toString();
        funcionCuadratica9.setB((float) '4');
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica3.setB((float) 0);
        funcionCuadratica3.setA((float) (byte) 10);
        funcionCuadratica3.setA(1.2791497E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-4000.0f) + "'", float5 == (-4000.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str10.equals("1.30393536E8x^2+-1.0"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(100000.0f, (-399996.0f), 1.40576604E11f);
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-5.6230481E16f) + "'", float4 == (-5.6230481E16f));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (-1L), (float) (byte) -1, (float) 100L);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB((-399.0f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, 2.2778125E19f, 2.30828008E18f);
        java.lang.String str4 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(2000.0f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0x^2+2.2778125E19x+2.30828008E18" + "'", str4.equals("100.0x^2+2.2778125E19x+2.30828008E18"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
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
        float float29 = funcionCuadratica3.determinante();
        float float30 = funcionCuadratica3.getC();
        java.lang.Class<?> wildcardClass31 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "10.0x^2+10.0x" + "'", str26.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+10.0x" + "'", str28.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
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
        float float21 = funcionCuadratica3.eval(171610.0f);
        funcionCuadratica3.setB((float) ' ');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str11.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-39.0f) + "'", float12 == (-39.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.1121001E7f + "'", float19 == 1.1121001E7f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 3.27513384E17f + "'", float21 == 3.27513384E17f);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        float float14 = funcionCuadratica10.eval(1.2791497E9f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.6362239E19f + "'", float14 == 1.6362239E19f);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
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
        practico5.FuncionCuadratica funcionCuadratica20 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float21 = funcionCuadratica20.getB();
        float float22 = funcionCuadratica20.getC();
        float float23 = funcionCuadratica20.getC();
        float float24 = funcionCuadratica20.getB();
        java.lang.String str25 = funcionCuadratica20.toString();
        funcionCuadratica20.setA((float) 10L);
        boolean boolean28 = funcionCuadratica3.equals(funcionCuadratica20);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 104.0f + "'", float15 == 104.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "10.0x^2+100.0x" + "'", str25.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100L, 3.2012794E37f, (-2.890842E34f));
        funcionCuadratica3.setC(1.00360037E17f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
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
        java.lang.Object obj28 = funcionCuadratica22.raices();
        java.lang.String str29 = funcionCuadratica22.toString();
        java.lang.Object obj30 = funcionCuadratica22.raices();
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
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "10.0x^2+100.0x" + "'", str29.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        funcionCuadratica3.setC((-0.0f));
        java.lang.Object obj8 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica12.setB((float) (byte) 0);
        float float15 = funcionCuadratica12.getA();
        float float16 = funcionCuadratica12.getA();
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica12);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setA((float) (-1));
        float float15 = funcionCuadratica3.determinante();
        float float16 = funcionCuadratica3.determinante();
        java.lang.Object obj17 = funcionCuadratica3.raices();
        float float18 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 401.0f + "'", float15 == 401.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 401.0f + "'", float16 == 401.0f);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        float float13 = funcionCuadratica10.getA();
        funcionCuadratica10.setB((-11424.0f));
        float float16 = funcionCuadratica10.getA();
        float float17 = funcionCuadratica10.determinante();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        float float23 = funcionCuadratica21.getC();
        float float24 = funcionCuadratica21.getC();
        float float25 = funcionCuadratica21.getB();
        int int26 = funcionCuadratica21.numRaices();
        boolean boolean27 = funcionCuadratica10.equals(funcionCuadratica21);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica(12.0f, 1.74240006E11f, 118560.0f);
        boolean boolean32 = funcionCuadratica21.equals(funcionCuadratica31);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.30507776E8f + "'", float17 == 1.30507776E8f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.determinante();
        java.lang.String str9 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
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
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica(12216.0f, (-1.74107996E10f), 10816.0f);
        boolean boolean20 = funcionCuadratica3.equals(funcionCuadratica19);
        float float21 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 9999001.0f + "'", float15 == 9999001.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
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
        java.lang.Class<?> wildcardClass30 = funcionCuadratica14.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1.0x^2+10.0x" + "'", str10.equals("1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10000.0f + "'", float16 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, 232.0f, 2.56012813E17f);
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(1.7632299E10f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.56012813E17f + "'", float4 == 2.56012813E17f);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.30393536E8f, 0.0f, (float) (-1));
        funcionCuadratica3.setB(0.0f);
        funcionCuadratica3.setB((float) 0L);
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.30393536E8x^2+-1.0" + "'", str8.equals("1.30393536E8x^2+-1.0"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
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
        funcionCuadratica10.setC(99.0f);
        funcionCuadratica10.setB(1.37487188E11f);
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
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
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
        int int53 = funcionCuadratica19.numRaices();
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
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
        float float28 = funcionCuadratica10.getC();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        int int9 = funcionCuadratica3.numRaices();
        float float11 = funcionCuadratica3.eval((float) (byte) 10);
        float float12 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2000.0f + "'", float11 == 2000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
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
        float float44 = funcionCuadratica17.getC();
        funcionCuadratica17.setB(1.0546697E31f);
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, 10128.0f, 401.0f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(9413.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
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
        float float26 = funcionCuadratica3.eval(80232.0f);
        float float27 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10128.0f + "'", float16 == 10128.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 131.0f + "'", float18 == 131.0f);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 2.05992362E11f + "'", float26 == 2.05992362E11f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 32.0f + "'", float27 == 32.0f);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-90.0f), 2.720396E18f, 2.1435855E23f);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(0.0f);
        funcionCuadratica3.setC(999899.0f);
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica21.setA((float) (byte) -1);
        java.lang.String str24 = funcionCuadratica21.toString();
        float float26 = funcionCuadratica21.eval((-68.0f));
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj31 = funcionCuadratica30.raices();
        float float32 = funcionCuadratica30.getC();
        float float33 = funcionCuadratica30.getA();
        boolean boolean34 = funcionCuadratica21.equals(funcionCuadratica30);
        practico5.FuncionCuadratica funcionCuadratica38 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float39 = funcionCuadratica38.getB();
        funcionCuadratica38.setB((float) (byte) -1);
        funcionCuadratica38.setC((float) (byte) 1);
        float float44 = funcionCuadratica38.getA();
        java.lang.String str45 = funcionCuadratica38.toString();
        funcionCuadratica38.setC((float) (byte) 100);
        funcionCuadratica38.setC((float) 1L);
        boolean boolean50 = funcionCuadratica21.equals(funcionCuadratica38);
        java.lang.Class<?> wildcardClass51 = funcionCuadratica38.getClass();
        boolean boolean52 = funcionCuadratica3.equals(funcionCuadratica38);
        funcionCuadratica38.setC(5648.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-1.0x^2+100.0x" + "'", str24.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-11424.0f) + "'", float26 == (-11424.0f));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str45.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
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
        float float21 = funcionCuadratica12.determinante();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10000.0f + "'", float21 == 10000.0f);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(157.0f, 9.9980119E13f, 1.9877746E24f);
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 8.747702E27f + "'", float4 == 8.747702E27f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 157.0f + "'", float5 == 157.0f);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        float float6 = funcionCuadratica3.determinante();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        java.lang.String str8 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        float float6 = funcionCuadratica3.determinante();
        int int7 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10000.0f + "'", float6 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
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
        int int50 = funcionCuadratica7.numRaices();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        int int15 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass16 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) (byte) -1, (-1.0f));
        float float4 = funcionCuadratica3.determinante();
        float float5 = funcionCuadratica3.getA();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        java.lang.String str7 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 401.0f + "'", float4 == 401.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0x^2+-1.0x+-1.0" + "'", str7.equals("100.0x^2+-1.0x+-1.0"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getC();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
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
        float float31 = funcionCuadratica7.eval((-9.6735761E17f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10000.0f + "'", float9 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 97.0f + "'", float19 == 97.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str24.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 10.0f + "'", float28 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 9.357808E35f + "'", float31 == 9.357808E35f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00360441E17f, 0.0f, (-1.50924237E9f));
        funcionCuadratica3.setA(4.0019008E7f);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
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
        float float20 = funcionCuadratica3.eval(9413.0f);
        float float21 = funcionCuadratica3.getB();
        float float22 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.7632299E10f + "'", float20 == 1.7632299E10f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 199.0f + "'", float22 == 199.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
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
        java.lang.Class<?> wildcardClass31 = funcionCuadratica3.getClass();
        float float32 = funcionCuadratica3.getB();
        funcionCuadratica3.setC(1.00722185E36f);
        float float35 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.00722185E36f + "'", float35 == 1.00722185E36f);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
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
        java.lang.Object obj18 = funcionCuadratica3.raices();
        float float19 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100000.0f + "'", float17 == 100000.0f);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-0.0f) + "'", obj18.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
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
        float float18 = funcionCuadratica3.determinante();
        practico5.FuncionCuadratica funcionCuadratica22 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica26.setA((float) (byte) -1);
        funcionCuadratica26.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica34 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float35 = funcionCuadratica34.getB();
        funcionCuadratica34.setB((float) (byte) -1);
        funcionCuadratica34.setC((float) (byte) 1);
        boolean boolean40 = funcionCuadratica26.equals(funcionCuadratica34);
        boolean boolean41 = funcionCuadratica22.equals(funcionCuadratica26);
        practico5.FuncionCuadratica funcionCuadratica45 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float46 = funcionCuadratica45.getB();
        float float47 = funcionCuadratica45.getC();
        float float48 = funcionCuadratica45.getC();
        practico5.FuncionCuadratica funcionCuadratica52 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float53 = funcionCuadratica52.getB();
        float float54 = funcionCuadratica52.determinante();
        boolean boolean55 = funcionCuadratica45.equals(funcionCuadratica52);
        practico5.FuncionCuadratica funcionCuadratica59 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float60 = funcionCuadratica59.getB();
        float float61 = funcionCuadratica59.determinante();
        funcionCuadratica59.setB((float) 10L);
        boolean boolean64 = funcionCuadratica52.equals(funcionCuadratica59);
        boolean boolean65 = funcionCuadratica26.equals(funcionCuadratica59);
        funcionCuadratica26.setB((float) 0L);
        boolean boolean68 = funcionCuadratica3.equals(funcionCuadratica26);
        funcionCuadratica3.setB((float) (-1L));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-68.0f) + "'", float15 == (-68.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "32.0x^2+100.0x" + "'", str16.equals("32.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10000.0f + "'", float18 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 10000.0f + "'", float54 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 10000.0f + "'", float61 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
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
        funcionCuadratica3.setA(131.0f);
        float float37 = funcionCuadratica3.getC();
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
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        float float10 = funcionCuadratica3.eval(171610.0f);
        float float11 = funcionCuadratica3.getB();
        int int12 = funcionCuadratica3.numRaices();
        float float13 = funcionCuadratica3.getA();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.9451708E11f + "'", float10 == 2.9451708E11f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(132000.0f, 12216.0f, 131.0f);
        funcionCuadratica3.setB(100000.0f);
        float float6 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 132000.0f + "'", float6 == 132000.0f);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.70024767E17f, (-4000.0f), 2.0f);
        float float4 = funcionCuadratica3.getA();
        java.lang.String str5 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.70024767E17f + "'", float4 == 1.70024767E17f);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.70024767E17x^2+-4000.0x+2.0" + "'", str5.equals("1.70024767E17x^2+-4000.0x+2.0"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
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
        float float19 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(1.6362239E19f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass5 = funcionCuadratica3.getClass();
        int int6 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        int int11 = funcionCuadratica3.numRaices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
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
        funcionCuadratica15.setC((-1.50924237E9f));
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
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
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
        practico5.FuncionCuadratica funcionCuadratica29 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        float float30 = funcionCuadratica29.getA();
        int int31 = funcionCuadratica29.numRaices();
        float float32 = funcionCuadratica29.getC();
        boolean boolean33 = funcionCuadratica3.equals(funcionCuadratica29);
        java.lang.String str34 = funcionCuadratica29.toString();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 262190.0f + "'", float20 == 262190.0f);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "262190.0x^2+-1.0x+10.0" + "'", str21.equals("262190.0x^2+-1.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10000.0f + "'", float32 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "10.0x^2+2.0x+10000.0" + "'", str34.equals("10.0x^2+2.0x+10000.0"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00360449E17f, 0.0f, (-180960.0f));
        float float4 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 7.264491E22f + "'", float4 == 7.264491E22f);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 10, (float) 10, 0.0f);
        java.lang.String str4 = funcionCuadratica3.toString();
        int int5 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(121000.0f);
        float float8 = funcionCuadratica3.determinante();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0x^2+10.0x" + "'", str4.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.46410004E10f + "'", float8 == 1.46410004E10f);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
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
        float float18 = funcionCuadratica3.eval(9.999801E18f);
        float float19 = funcionCuadratica3.determinante();
        funcionCuadratica3.setA(1.51930253E9f);
        float float23 = funcionCuadratica3.eval(9.998104E14f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-39.0f) + "'", float16 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + Float.POSITIVE_INFINITY + "'", float18 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-39.0f) + "'", float19 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + Float.POSITIVE_INFINITY + "'", float23 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setC((float) (byte) -1);
        float float12 = funcionCuadratica3.getC();
        funcionCuadratica3.setC(999899.0f);
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        float float20 = funcionCuadratica18.getC();
        int int21 = funcionCuadratica18.numRaices();
        float float22 = funcionCuadratica18.getA();
        java.lang.Object obj23 = funcionCuadratica18.raices();
        int int24 = funcionCuadratica18.numRaices();
        boolean boolean25 = funcionCuadratica3.equals(funcionCuadratica18);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
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
        funcionCuadratica10.setA(12321.0f);
        java.lang.Object obj21 = funcionCuadratica10.raices();
        float float22 = funcionCuadratica10.getC();
        practico5.FuncionCuadratica funcionCuadratica26 = new practico5.FuncionCuadratica((float) 1, (float) 10, (float) (byte) 0);
        float float28 = funcionCuadratica26.eval((-11424.0f));
        float float29 = funcionCuadratica26.getA();
        java.lang.String str30 = funcionCuadratica26.toString();
        float float32 = funcionCuadratica26.eval((-399.0f));
        java.lang.String str33 = funcionCuadratica26.toString();
        boolean boolean34 = funcionCuadratica10.equals(funcionCuadratica26);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.30393536E8f + "'", float28 == 1.30393536E8f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "1.0x^2+10.0x" + "'", str30.equals("1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 155211.0f + "'", float32 == 155211.0f);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "1.0x^2+10.0x" + "'", str33.equals("1.0x^2+10.0x"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC((float) (short) 100);
        int int14 = funcionCuadratica9.numRaices();
        java.lang.Class<?> wildcardClass15 = funcionCuadratica9.getClass();
        float float16 = funcionCuadratica9.getC();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 100, (float) 1L, 10.0f);
        funcionCuadratica3.setA(10816.0f);
        java.lang.String str6 = funcionCuadratica3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10816.0x^2+1.0x+10.0" + "'", str6.equals("10816.0x^2+1.0x+10.0"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
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
        float float44 = funcionCuadratica20.getB();
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
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
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
        float float24 = funcionCuadratica3.eval((-4000.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 12216.0f + "'", float14 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 12321.0f + "'", float19 == 12321.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.59992E8f + "'", float24 == 1.59992E8f);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
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
        java.lang.Class<?> wildcardClass30 = funcionCuadratica10.getClass();
        funcionCuadratica10.setC(2.0032112E38f);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-1.0x^2+100.0x" + "'", str26.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-2.890842E34f) + "'", float29 == (-2.890842E34f));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-6900.0f), (-38799.0f), 3.0360044E23f);
        funcionCuadratica3.setB(1.46422108E10f);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setA((-800.0f));
        float float13 = funcionCuadratica3.determinante();
        java.lang.String str14 = funcionCuadratica3.toString();
        funcionCuadratica3.setC(1.108416E9f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10000.0f + "'", float8 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1.0x^2+100.0x" + "'", str10.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10000.0f + "'", float13 == 10000.0f);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-800.0x^2+100.0x" + "'", str14.equals("-800.0x^2+100.0x"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(3.68633263E17f, 1.29399648E8f, 2.56012813E17f);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(97.0f, 9413.0f, 1.9877746E24f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(60.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        float float8 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-0.0f) + "'", obj7.equals((-0.0f)));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
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
        int int32 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA(5.2230605E9f);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(12321.0f);
        float float8 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float13 = funcionCuadratica12.getB();
        float float14 = funcionCuadratica12.getC();
        float float15 = funcionCuadratica12.getA();
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj20 = funcionCuadratica19.raices();
        boolean boolean21 = funcionCuadratica12.equals(funcionCuadratica19);
        funcionCuadratica19.setA((float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica27 = new practico5.FuncionCuadratica((float) 2, 0.0f, (float) (short) 100);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica31.setA((float) (byte) -1);
        funcionCuadratica31.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float40 = funcionCuadratica39.getB();
        funcionCuadratica39.setB((float) (byte) -1);
        funcionCuadratica39.setC((float) (byte) 1);
        boolean boolean45 = funcionCuadratica31.equals(funcionCuadratica39);
        boolean boolean46 = funcionCuadratica27.equals(funcionCuadratica31);
        practico5.FuncionCuadratica funcionCuadratica50 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float51 = funcionCuadratica50.getB();
        float float52 = funcionCuadratica50.getC();
        float float53 = funcionCuadratica50.getC();
        practico5.FuncionCuadratica funcionCuadratica57 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float58 = funcionCuadratica57.getB();
        float float59 = funcionCuadratica57.determinante();
        boolean boolean60 = funcionCuadratica50.equals(funcionCuadratica57);
        practico5.FuncionCuadratica funcionCuadratica64 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float65 = funcionCuadratica64.getB();
        float float66 = funcionCuadratica64.determinante();
        funcionCuadratica64.setB((float) 10L);
        boolean boolean69 = funcionCuadratica57.equals(funcionCuadratica64);
        boolean boolean70 = funcionCuadratica31.equals(funcionCuadratica64);
        funcionCuadratica31.setC(401.0f);
        boolean boolean73 = funcionCuadratica19.equals(funcionCuadratica31);
        boolean boolean74 = funcionCuadratica3.equals(funcionCuadratica19);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 100.0f + "'", float51 == 100.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 100.0f + "'", float58 == 100.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 10000.0f + "'", float59 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 100.0f + "'", float65 == 100.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 10000.0f + "'", float66 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(3.42216606E11f, 2.62324675E10f, (-4.3258204E9f));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
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
        java.lang.String str44 = funcionCuadratica32.toString();
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
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "10.0x^2+-1.0x" + "'", str44.equals("10.0x^2+-1.0x"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getA();
        float float10 = funcionCuadratica3.eval(1141477.0f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.30308388E12f + "'", float10 == 1.30308388E12f);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float11 = funcionCuadratica10.getB();
        float float12 = funcionCuadratica10.determinante();
        boolean boolean13 = funcionCuadratica3.equals(funcionCuadratica10);
        float float14 = funcionCuadratica10.determinante();
        int int15 = funcionCuadratica10.numRaices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10000.0f + "'", float12 == 10000.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10000.0f + "'", float14 == 10000.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 0.0f, 1.00722185E36f);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(540560.0f, 2.0f, 15610.0f);
        funcionCuadratica3.setA(10004.0f);
        float float7 = funcionCuadratica3.eval((-1.0003998E36f));
        try {
            java.lang.Object obj8 = funcionCuadratica3.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-1.74107996E10f), 1000.0f, 110.0f);
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getC();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 110.0f + "'", float5 == 110.0f);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(210.0f);
        float float13 = funcionCuadratica3.getB();
        funcionCuadratica3.setB(1000.0f);
        funcionCuadratica3.setC((-4.00039987E9f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+100.0x" + "'", str10.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
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
        float float34 = funcionCuadratica18.getA();
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
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float13 = funcionCuadratica3.getA();
        int int14 = funcionCuadratica3.numRaices();
        float float15 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(7.8529149E18f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10.0x^2+100.0x" + "'", str12.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        funcionCuadratica3.setC((float) (byte) 1);
        float float9 = funcionCuadratica3.getA();
        java.lang.String str10 = funcionCuadratica3.toString();
        funcionCuadratica3.setC((float) (byte) 100);
        funcionCuadratica3.setC((float) 1L);
        float float15 = funcionCuadratica3.determinante();
        java.lang.String str16 = funcionCuadratica3.toString();
        float float17 = funcionCuadratica3.getC();
        practico5.FuncionCuadratica funcionCuadratica21 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float22 = funcionCuadratica21.getB();
        funcionCuadratica21.setB((float) (byte) -1);
        funcionCuadratica21.setC((float) (byte) 1);
        float float27 = funcionCuadratica21.getA();
        java.lang.String str28 = funcionCuadratica21.toString();
        funcionCuadratica21.setC(0.0f);
        boolean boolean31 = funcionCuadratica3.equals(funcionCuadratica21);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str10.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-39.0f) + "'", float15 == (-39.0f));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str16.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str28.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        float float7 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (byte) 100);
        float float10 = funcionCuadratica3.determinante();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 6000.0f + "'", float10 == 6000.0f);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 100L, 1.9761783E23f, 1.00360441E17f);
        float float5 = funcionCuadratica3.eval(9.943295E37f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + Float.POSITIVE_INFINITY + "'", float5 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
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
        java.lang.Class<?> wildcardClass40 = funcionCuadratica3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float12 = funcionCuadratica11.getB();
        funcionCuadratica11.setB((float) (byte) -1);
        funcionCuadratica11.setC((float) (byte) 1);
        boolean boolean17 = funcionCuadratica3.equals(funcionCuadratica11);
        java.lang.Object obj18 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(2.9449991E11f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
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
        float float24 = funcionCuadratica10.determinante();
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(6.8743594E11f, 1.52190226E13f, 3.15259781E10f);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        funcionCuadratica3.setB((float) 100L);
        float float9 = funcionCuadratica3.eval((-39.0f));
        java.lang.Class<?> wildcardClass10 = funcionCuadratica3.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 11310.0f + "'", float9 == 11310.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        float float5 = funcionCuadratica3.eval(0.0f);
        int int6 = funcionCuadratica3.numRaices();
        float float7 = funcionCuadratica3.getC();
        java.lang.String str8 = funcionCuadratica3.toString();
        java.lang.Object obj9 = funcionCuadratica3.raices();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        float float11 = funcionCuadratica3.getA();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0x^2+10.0x" + "'", str8.equals("10.0x^2+10.0x"));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
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
        funcionCuadratica25.setB(56143.0f);
        float float32 = funcionCuadratica25.getA();
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 10.0f + "'", float32 == 10.0f);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
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
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        java.lang.Object obj26 = funcionCuadratica24.raices();
        practico5.FuncionCuadratica funcionCuadratica30 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj31 = funcionCuadratica30.raices();
        boolean boolean32 = funcionCuadratica24.equals(funcionCuadratica30);
        java.lang.String str33 = funcionCuadratica24.toString();
        funcionCuadratica24.setB(0.0f);
        practico5.FuncionCuadratica funcionCuadratica39 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float40 = funcionCuadratica39.getB();
        funcionCuadratica39.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica46 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj47 = funcionCuadratica46.raices();
        boolean boolean48 = funcionCuadratica39.equals(funcionCuadratica46);
        java.lang.Class<?> wildcardClass49 = funcionCuadratica39.getClass();
        boolean boolean50 = funcionCuadratica24.equals(funcionCuadratica39);
        practico5.FuncionCuadratica funcionCuadratica54 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float55 = funcionCuadratica54.getB();
        java.lang.Object obj56 = funcionCuadratica54.raices();
        practico5.FuncionCuadratica funcionCuadratica60 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj61 = funcionCuadratica60.raices();
        boolean boolean62 = funcionCuadratica54.equals(funcionCuadratica60);
        java.lang.String str63 = funcionCuadratica54.toString();
        funcionCuadratica54.setB(0.0f);
        float float66 = funcionCuadratica54.determinante();
        boolean boolean67 = funcionCuadratica24.equals(funcionCuadratica54);
        boolean boolean68 = funcionCuadratica3.equals(funcionCuadratica54);
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
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10.0x^2+100.0x" + "'", str33.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 100.0f + "'", float55 == 100.0f);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "10.0x^2+100.0x" + "'", str63.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.0f + "'", float66 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
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
        float float22 = funcionCuadratica3.determinante();
        java.lang.Object obj23 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 2.72027206E11f + "'", float22 == 2.72027206E11f);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
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
        float float42 = funcionCuadratica3.getC();
        float float43 = funcionCuadratica3.getB();
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
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 3.2012794E37f + "'", float43 == 3.2012794E37f);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
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
        funcionCuadratica3.setB(1.6362239E19f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 8.8604582E8f + "'", float14 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.00360436E16f, 12216.0f, 10305.0f);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.String str5 = funcionCuadratica3.toString();
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(97.0f);
        float float9 = funcionCuadratica3.getB();
        float float11 = funcionCuadratica3.eval(9.9980119E13f);
        practico5.FuncionCuadratica funcionCuadratica15 = new practico5.FuncionCuadratica((float) 10, 2.0f, 10000.0f);
        java.lang.Class<?> wildcardClass16 = funcionCuadratica15.getClass();
        funcionCuadratica15.setA(3.15259781E10f);
        boolean boolean19 = funcionCuadratica3.equals(funcionCuadratica15);
        try {
            java.lang.Object obj20 = funcionCuadratica15.raices();
            org.junit.Assert.fail("Expected exception of type practico5.PolinomioException; message: El determinante es negativo");
        } catch (practico5.PolinomioException e) {
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0x^2+100.0x" + "'", str5.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 9.996025E28f + "'", float11 == 9.996025E28f);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        int int5 = funcionCuadratica3.numRaices();
        float float6 = funcionCuadratica3.getB();
        int int7 = funcionCuadratica3.numRaices();
        java.lang.Class<?> wildcardClass8 = funcionCuadratica3.getClass();
        java.lang.String str9 = funcionCuadratica3.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10.0x^2+100.0x" + "'", str9.equals("10.0x^2+100.0x"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        java.lang.Object obj13 = funcionCuadratica10.raices();
        float float14 = funcionCuadratica10.getC();
        java.lang.Object obj15 = funcionCuadratica10.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
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
        java.lang.Class<?> wildcardClass17 = funcionCuadratica3.getClass();
        java.lang.Object obj18 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 8.8604582E8f + "'", float14 == 8.8604582E8f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
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
        java.lang.String str16 = funcionCuadratica3.toString();
        funcionCuadratica3.setB((-1.7757429E22f));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "10.0x^2+10.0x" + "'", str16.equals("10.0x^2+10.0x"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        int int8 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setB(5.2230605E9f);
        float float11 = funcionCuadratica3.getB();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        float float13 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 5.2230605E9f + "'", float11 == 5.2230605E9f);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 5.2230605E9f + "'", float13 == 5.2230605E9f);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
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
        float float18 = funcionCuadratica3.getC();
        java.lang.String str19 = funcionCuadratica3.toString();
        java.lang.Object obj20 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        int int25 = funcionCuadratica24.numRaices();
        float float26 = funcionCuadratica24.determinante();
        funcionCuadratica24.setC(262190.0f);
        boolean boolean29 = funcionCuadratica3.equals(funcionCuadratica24);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10000.0f + "'", float5 == 10000.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 104.0f + "'", float13 == 104.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 199.0f + "'", float17 == 199.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "1.0x^2+10.0x+-1.0" + "'", str19.equals("1.0x^2+10.0x+-1.0"));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
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
        java.lang.String str41 = funcionCuadratica23.toString();
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
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "32.0x^2+100.0x+-1.0" + "'", str41.equals("32.0x^2+100.0x+-1.0"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
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
        funcionCuadratica3.setA(9.999801E18f);
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float25 = funcionCuadratica24.getB();
        funcionCuadratica24.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj32 = funcionCuadratica31.raices();
        boolean boolean33 = funcionCuadratica24.equals(funcionCuadratica31);
        java.lang.Object obj34 = funcionCuadratica24.raices();
        funcionCuadratica24.setC(0.0f);
        float float38 = funcionCuadratica24.eval(2.43670528E9f);
        boolean boolean39 = funcionCuadratica3.equals(funcionCuadratica24);
        float float40 = funcionCuadratica24.determinante();
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
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 5.9375326E19f + "'", float38 == 5.9375326E19f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
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
        float float19 = funcionCuadratica3.getB();
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
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((-11424.0f));
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(1141477.0f);
        java.lang.Object obj11 = funcionCuadratica3.raices();
        java.lang.Object obj12 = funcionCuadratica3.raices();
        funcionCuadratica3.setB(4.538622E37f);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
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
        java.lang.String str34 = funcionCuadratica27.toString();
        float float36 = funcionCuadratica27.eval(9.9989899E15f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-1.0x^2+100.0x" + "'", str23.equals("-1.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.09791189E12f + "'", float33 == 1.09791189E12f);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "100.0x^2+999899.0x+10.0" + "'", str34.equals("100.0x^2+999899.0x+10.0"));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 9.9979795E33f + "'", float36 == 9.9979795E33f);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        funcionCuadratica9.setC(2.5758312E33f);
        float float14 = funcionCuadratica9.determinante();
        practico5.FuncionCuadratica funcionCuadratica18 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float19 = funcionCuadratica18.getB();
        java.lang.Object obj20 = funcionCuadratica18.raices();
        practico5.FuncionCuadratica funcionCuadratica24 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj25 = funcionCuadratica24.raices();
        boolean boolean26 = funcionCuadratica18.equals(funcionCuadratica24);
        java.lang.String str27 = funcionCuadratica18.toString();
        practico5.FuncionCuadratica funcionCuadratica31 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float32 = funcionCuadratica31.getB();
        funcionCuadratica31.setB((float) (byte) -1);
        funcionCuadratica31.setC((float) (byte) 1);
        float float37 = funcionCuadratica31.getA();
        java.lang.String str38 = funcionCuadratica31.toString();
        float float39 = funcionCuadratica31.getC();
        float float40 = funcionCuadratica31.getB();
        float float42 = funcionCuadratica31.eval((float) '#');
        float float43 = funcionCuadratica31.getA();
        float float44 = funcionCuadratica31.getB();
        float float45 = funcionCuadratica31.determinante();
        float float46 = funcionCuadratica31.getC();
        boolean boolean47 = funcionCuadratica18.equals(funcionCuadratica31);
        funcionCuadratica31.setC(Float.POSITIVE_INFINITY);
        funcionCuadratica31.setB(400.0f);
        boolean boolean52 = funcionCuadratica9.equals(funcionCuadratica31);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0303324E35f) + "'", float14 == (-1.0303324E35f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10.0x^2+100.0x" + "'", str27.equals("10.0x^2+100.0x"));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "10.0x^2+-1.0x+1.0" + "'", str38.equals("10.0x^2+-1.0x+1.0"));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 12216.0f + "'", float42 == 12216.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-39.0f) + "'", float45 == (-39.0f));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }
}

