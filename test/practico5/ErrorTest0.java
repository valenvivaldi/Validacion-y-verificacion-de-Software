package practico5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, (float) (-1), (float) (short) -1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        practico5.FuncionCuadratica funcionCuadratica0 = new practico5.FuncionCuadratica();
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica0", funcionCuadratica0.repOk());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 10, (float) (short) 0, (float) 100L);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (-0.0f), (-68.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getA();
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) 10, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        funcionCuadratica3.setB((float) (short) 10);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0, 0.0f, 1.70024767E17f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-0.0f), 1.0f, 104.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.getC();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getB();
        java.lang.String str8 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, (float) (byte) 0, 10128.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) 10L, 0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) '4', 104.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) (-1), (-800.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 100.0f, 0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        float float6 = funcionCuadratica3.getC();
        float float7 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-0.0f), (-800.0f), (float) 100L);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, (float) ' ', (float) 'a');
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) -1, (float) 2, (-39.0f));
        float float4 = funcionCuadratica3.getB();
        practico5.FuncionCuadratica funcionCuadratica8 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica8.setA((float) (byte) -1);
        java.lang.String str11 = funcionCuadratica8.toString();
        float float13 = funcionCuadratica8.eval((-68.0f));
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica8);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-0.0f), (float) (short) 1, 1.23676657E15f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0, (-4000.0f), 10.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, (-152.0f), (float) 100);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        funcionCuadratica10.setA((float) (short) 0);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica10", funcionCuadratica10.repOk());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        practico5.FuncionCuadratica funcionCuadratica9 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj10 = funcionCuadratica9.raices();
        boolean boolean11 = funcionCuadratica3.equals(funcionCuadratica9);
        java.lang.String str12 = funcionCuadratica3.toString();
        float float14 = funcionCuadratica3.eval(1.30393536E8f);
        java.lang.Object obj15 = funcionCuadratica3.raices();
        funcionCuadratica3.setC(5.2230605E9f);
        funcionCuadratica3.setC(401.0f);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        funcionCuadratica7.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica7", funcionCuadratica7.repOk());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, 8.8604582E8f, 100.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setA((float) (byte) -1);
        funcionCuadratica3.setC((float) 0);
        float float8 = funcionCuadratica3.determinante();
        float float9 = funcionCuadratica3.getA();
        funcionCuadratica3.setA((-0.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (-38799.0f), (float) 1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        funcionCuadratica3.setA((float) (byte) 0);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, 1.51930253E9f, (-1276.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 0.0f, 1021.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0, 9.999992E7f, Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 97.0f, 9.9999002E8f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (short) 0, 12321.0f, 9.9979908E12f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 1, 100.0f, (float) (-1L));
        int int4 = funcionCuadratica3.numRaices();
        float float5 = funcionCuadratica3.getB();
        float float6 = funcionCuadratica3.getA();
        java.lang.Class<?> wildcardClass7 = funcionCuadratica3.getClass();
        float float8 = funcionCuadratica3.getB();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        java.lang.Class<?> wildcardClass20 = funcionCuadratica3.getClass();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (float) (short) 1, 6120.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 110.0f, 2.92205101E12f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        float float5 = funcionCuadratica3.determinante();
        funcionCuadratica3.setB((float) 10L);
        funcionCuadratica3.setA((float) 1);
        funcionCuadratica3.setA((float) '#');
        java.lang.Class<?> wildcardClass12 = funcionCuadratica3.getClass();
        funcionCuadratica3.setB(3.2012794E37f);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 1.23676657E15f, 400.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float4 = funcionCuadratica3.getB();
        funcionCuadratica3.setB((float) (byte) -1);
        practico5.FuncionCuadratica funcionCuadratica10 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj11 = funcionCuadratica10.raices();
        boolean boolean12 = funcionCuadratica3.equals(funcionCuadratica10);
        float float13 = funcionCuadratica10.getA();
        funcionCuadratica10.setC((float) (short) -1);
        practico5.FuncionCuadratica funcionCuadratica19 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        float float20 = funcionCuadratica19.getB();
        java.lang.Object obj21 = funcionCuadratica19.raices();
        practico5.FuncionCuadratica funcionCuadratica25 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj26 = funcionCuadratica25.raices();
        boolean boolean27 = funcionCuadratica19.equals(funcionCuadratica25);
        float float28 = funcionCuadratica25.getB();
        java.lang.Object obj29 = funcionCuadratica25.raices();
        boolean boolean30 = funcionCuadratica10.equals(funcionCuadratica25);
        funcionCuadratica25.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica25", funcionCuadratica25.repOk());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (-1.9457676E20f), (float) 100L);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 1.00219519E12f, 10.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-387.0f), (float) 0, 2.0f);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 2.92205049E12f, (-9.2799074E11f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj4 = funcionCuadratica3.raices();
        java.lang.Object obj5 = funcionCuadratica3.raices();
        funcionCuadratica3.setA((float) 1);
        float float8 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((-0.0f), 1.51930253E9f, 1.37487188E11f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setC(100.0f);
        java.lang.Object obj6 = funcionCuadratica3.raices();
        funcionCuadratica3.setC((float) (short) 10);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 1.46409882E11f, (float) (short) -1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 9600.0f, 262190.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 1015697.0f, (-68.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, (-1362064.0f), 1001001.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 0L, 1.3661462E29f, 2.56012813E17f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        java.lang.String str16 = funcionCuadratica3.toString();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 100.0f, 1.9761783E23f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        float float18 = funcionCuadratica3.getC();
        funcionCuadratica3.setA(9.9969027E11f);
        funcionCuadratica3.setA(5.21576832E8f);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        funcionCuadratica3.setB((float) (byte) 0);
        float float6 = funcionCuadratica3.getA();
        int int7 = funcionCuadratica3.numRaices();
        funcionCuadratica3.setA((-0.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        float float36 = funcionCuadratica3.getA();
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
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
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica((float) (byte) 100, (float) 1, 9413.0f);
        practico5.FuncionCuadratica funcionCuadratica7 = new practico5.FuncionCuadratica((float) 10, (float) (byte) 100, 0.0f);
        java.lang.Object obj8 = funcionCuadratica7.raices();
        java.lang.String str9 = funcionCuadratica7.toString();
        funcionCuadratica7.setC((float) 'a');
        funcionCuadratica7.setA(104.0f);
        boolean boolean14 = funcionCuadratica3.equals(funcionCuadratica7);
        funcionCuadratica3.setA(0.0f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 1.62048E8f, 1.67442702E17f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 4584.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        practico5.FuncionCuadratica funcionCuadratica3 = new practico5.FuncionCuadratica(0.0f, 401.0f, 2.2661277E21f);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOk) for funcionCuadratica3", funcionCuadratica3.repOk());
    }
}

