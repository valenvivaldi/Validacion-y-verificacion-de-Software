package practico5node;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (short) -1);
        try {
            java.lang.Integer int13 = nodeCachingLinkedList0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test02");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.Integer int13 = nodeCachingLinkedList0.get((int) (byte) 0);
        try {
            java.lang.Integer int15 = nodeCachingLinkedList0.get(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13.equals(10));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test03");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.String str11 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[10]" + "'", str6.equals("[10]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8.equals(10));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[1]" + "'", str11.equals("[1]"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test04");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.String str10 = nodeCachingLinkedList0.toString();
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) ' ');
        try {
            java.lang.Integer int14 = nodeCachingLinkedList0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[1]" + "'", str10.equals("[1]"));
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test05");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        java.lang.Integer int5 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((-1));
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test06");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test07");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Class<?> wildcardClass1 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass2 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        try {
            java.lang.Integer int9 = nodeCachingLinkedList0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test08");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) '4');
        try {
            java.lang.Integer int12 = nodeCachingLinkedList0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test09");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test10");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex(20);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[1]" + "'", str9.equals("[1]"));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test11");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        java.lang.Integer int14 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass16 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test12");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (byte) 0);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList0.getClass();
        java.lang.String str10 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass11 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.Integer int15 = nodeCachingLinkedList0.removeIndex(0);
        try {
            java.lang.Integer int17 = nodeCachingLinkedList0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15.equals(1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test13");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass12 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int14 = nodeCachingLinkedList0.removeIndex((int) (short) -1);
        java.lang.Integer int16 = nodeCachingLinkedList0.get((int) (short) 1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16.equals(10));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test14");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass8 = nodeCachingLinkedList0.getClass();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[10]" + "'", str7.equals("[10]"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]" + "'", str9.equals("[10]"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test15");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) '4');
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test16");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex(10);
        java.lang.Class<?> wildcardClass12 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int14 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int16 = nodeCachingLinkedList0.removeIndex((-1));
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test17");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test18");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Class<?> wildcardClass6 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        try {
            java.lang.Integer int12 = nodeCachingLinkedList0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test19");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass12 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass13 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass14 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test20");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]" + "'", str6.equals("[-1]"));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test21");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.String str4 = nodeCachingLinkedList0.toString();
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]" + "'", str5.equals("[]"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test22");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.get((int) (byte) 0);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]" + "'", str6.equals("[-1]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]" + "'", str9.equals("[-1]"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test23");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass8 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test24");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) 0);
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str14 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9.equals(1));
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1,0]" + "'", str14.equals("[-1,0]"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test25");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[1]" + "'", str9.equals("[1]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test26");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Class<?> wildcardClass11 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int13 = nodeCachingLinkedList0.get(0);
        java.lang.String str14 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10.equals(100));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1]" + "'", str14.equals("[-1]"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test27");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (byte) 0);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test28");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        java.lang.String str4 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass5 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass6 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]" + "'", str4.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test29");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex(100);
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass12 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]" + "'", str6.equals("[0]"));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test30");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        java.lang.Integer int14 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass16 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test31");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        try {
            java.lang.Integer int14 = nodeCachingLinkedList0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]" + "'", str8.equals("[]"));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test32");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.String str15 = nodeCachingLinkedList0.toString();
        java.lang.String str16 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        try {
            java.lang.Integer int20 = nodeCachingLinkedList0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0]" + "'", str15.equals("[0]"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0]" + "'", str16.equals("[0]"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test33");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int9 = nodeCachingLinkedList0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]" + "'", str5.equals("[0]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]" + "'", str6.equals("[0]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]" + "'", str7.equals("[0]"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test34");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = nodeCachingLinkedList0.getClass();
        java.lang.String str12 = nodeCachingLinkedList0.toString();
        java.lang.Integer int14 = nodeCachingLinkedList0.removeIndex(10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]" + "'", str9.equals("[-1]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]" + "'", str12.equals("[-1]"));
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test35");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.String str13 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[10,10]" + "'", str13.equals("[10,10]"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test36");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        java.lang.Integer int5 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((-1));
        java.lang.String str10 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test37");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.Integer int7 = nodeCachingLinkedList0.get((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[10]" + "'", str5.equals("[10]"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7.equals(10));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test38");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        java.lang.Integer int5 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((-1));
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test39");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) ' ');
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test40");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.get((int) (byte) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = nodeCachingLinkedList0.getClass();
        java.lang.Class<?> wildcardClass12 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1]" + "'", str6.equals("[-1]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test41");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        java.lang.String str2 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass3 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass8 = nodeCachingLinkedList0.getClass();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,10]" + "'", str9.equals("[0,10]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

