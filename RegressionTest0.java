import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica3.eval((float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 130.0f + "'", float10 == 130.0f);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        funcionCuadratica0.setB((float) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        float float1 = funcionCuadratica0.getB();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        float float11 = funcionCuadratica7.getA();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        funcionCuadratica7.setC((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0, (float) (byte) 100, (float) ' ');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, 0.0f, (float) (byte) 0);
        boolean boolean4 = funcionCuadratica3.repOk();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, 1.0f, (float) (-1L));
        funcionCuadratica3.setC(0.0f);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) (-1L));
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        funcionCuadratica3.setC((float) ' ');
        float float6 = funcionCuadratica3.getA();
        java.lang.Object obj7 = funcionCuadratica3.raices();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        boolean boolean10 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        java.lang.Object obj11 = funcionCuadratica7.raices();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getC();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        funcionCuadratica3.setB((float) (byte) 0);
        funcionCuadratica3.setB((float) 0L);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, 0.0f, (float) 0);
        funcionCuadratica3.setC((float) ' ');
        float float7 = funcionCuadratica3.eval((float) 100L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100032.0f + "'", float7 == 100032.0f);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Class<?> wildcardClass9 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA((float) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 32.0f + "'", float24 == 32.0f);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float10 = funcionCuadratica7.eval(10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10035.0f + "'", float10 == 10035.0f);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        float float4 = funcionCuadratica3.getC();
        funcionCuadratica3.setC((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getB();
        funcionCuadratica3.setC((float) (short) 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 35.0f + "'", float10 == 35.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.determinante();
        funcionCuadratica7.setC((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-14000.0f) + "'", float9 == (-14000.0f));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        funcionCuadratica7.setB((-12415.0f));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        float float9 = funcionCuadratica7.getB();
        float float11 = funcionCuadratica7.eval((float) 0L);
        funcionCuadratica7.setA((float) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica11 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean12 = funcionCuadratica7.equals(funcionCuadratica11);
        java.lang.Object obj13 = funcionCuadratica11.raices();
        float float14 = funcionCuadratica11.determinante();
        boolean boolean15 = funcionCuadratica3.equals(funcionCuadratica11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-14000.0f) + "'", float14 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        practico5.FuncionCuadratica funcionCuadratica12 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj13 = funcionCuadratica12.raices();
        float float14 = funcionCuadratica12.getB();
        float float15 = funcionCuadratica12.getB();
        boolean boolean16 = funcionCuadratica3.equals(funcionCuadratica12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        boolean boolean13 = funcionCuadratica7.repOk();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setB((float) (short) 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 32.0f + "'", float23 == 32.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-12415.0f) + "'", float24 == (-12415.0f));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10L, (float) (short) 1, (float) 100);
        java.lang.Class<?> wildcardClass4 = funcionCuadratica3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        float float10 = funcionCuadratica7.determinante();
        java.lang.String str11 = funcionCuadratica7.toString();
        float float12 = funcionCuadratica7.determinante();
        java.lang.Object obj13 = funcionCuadratica7.raices();
        float float15 = funcionCuadratica7.eval((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 135.0f + "'", float15 == 135.0f);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        float float5 = funcionCuadratica3.getB();
        int int6 = funcionCuadratica3.numRaices();
        float float8 = funcionCuadratica3.eval((float) ' ');
        float float9 = funcionCuadratica3.getB();
        java.lang.Object obj10 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-33.0f) + "'", float8 == (-33.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(10.0f, 0.0f, (float) 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 100, (float) (-1L));
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-14000.0f) + "'", float10 == (-14000.0f));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "100.0x^2+35.0" + "'", str11.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-14000.0f) + "'", float12 == (-14000.0f));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0.0x^2+-14000.0" + "'", str18.equals("0.0x^2+-14000.0"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(1.0f, (float) 1, (float) 0L);
        funcionCuadratica3.setB((float) 1L);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) (byte) 100, 0.0f, (float) '#');
        boolean boolean8 = funcionCuadratica3.equals(funcionCuadratica7);
        java.lang.Object obj9 = funcionCuadratica7.raices();
        java.lang.String str10 = funcionCuadratica7.toString();
        float float11 = funcionCuadratica7.determinante();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "100.0x^2+35.0" + "'", str10.equals("100.0x^2+35.0"));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-14000.0f) + "'", float11 == (-14000.0f));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-33.0f), (float) (short) -1, (-14000.0f));
        java.lang.Object obj4 = funcionCuadratica3.raices();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) ' ', (float) 1L, (float) 'a');
        float float4 = funcionCuadratica3.getB();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 1L, (float) (short) -1, (float) 100);
        funcionCuadratica3.setA((float) ' ');
    }
}

