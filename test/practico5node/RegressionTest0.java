package practico5node;

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
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        try {
            java.lang.Integer int2 = nodeCachingLinkedList0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = practico5node.NodeCachingLinkedList.DEFAULT_MAXIMUM_CACHE_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        try {
            java.lang.Integer int2 = nodeCachingLinkedList0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        try {
            java.lang.Integer int6 = nodeCachingLinkedList0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getNext();
        try {
            java.lang.Class<?> wildcardClass2 = linkedListNode1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        try {
            linkedListNode1.setPrevious(linkedListNode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        try {
            java.lang.Integer int4 = nodeCachingLinkedList0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[20]" + "'", str3.equals("[20]"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode2.getPrevious();
        linkedListNode0.setPrevious(linkedListNode4);
        try {
            java.lang.Integer int6 = linkedListNode4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.Integer int7 = nodeCachingLinkedList0.removeIndex(100);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        linkedListNode0.setValue((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        try {
            java.lang.Integer int8 = nodeCachingLinkedList0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        try {
            linkedListNode3.setValue((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        try {
            java.lang.Integer int6 = nodeCachingLinkedList0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        java.lang.Integer int11 = linkedListNode10.getValue();
        java.lang.Integer int12 = linkedListNode10.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        try {
            java.lang.Integer int6 = nodeCachingLinkedList0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode3.setPrevious(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode10 = linkedListNode9.getNext();
        linkedListNode8.setPrevious(linkedListNode9);
        linkedListNode3.setPrevious(linkedListNode8);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode3.getPrevious();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode3.getNext();
        try {
            linkedListNode2.setNext(linkedListNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.get(0);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1,20]" + "'", str9.equals("[-1,20]"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        try {
            practico5node.LinkedListNode linkedListNode4 = linkedListNode3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getNext();
        try {
            linkedListNode5.setValue((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        linkedListNode6.setPrevious(linkedListNode19);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getNext();
        try {
            linkedListNode1.setValue((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        java.lang.Integer int15 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode6.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        java.lang.Integer int12 = linkedListNode7.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode7.getNext();
        try {
            linkedListNode6.setNext(linkedListNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(linkedListNode13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
        linkedListNode18.setPrevious(linkedListNode19);
        java.lang.Class<?> wildcardClass22 = linkedListNode18.getClass();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        linkedListNode18.setPrevious(linkedListNode23);
        practico5node.LinkedListNode linkedListNode28 = linkedListNode18.getPrevious();
        practico5node.LinkedListNode linkedListNode29 = linkedListNode18.getNext();
        linkedListNode11.setPrevious(linkedListNode29);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(linkedListNode20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(linkedListNode28);
        org.junit.Assert.assertNull(linkedListNode29);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getNext();
        try {
            practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getNext();
        try {
            linkedListNode11.setValue((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode4.getClass();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode4.getPrevious();
        try {
            linkedListNode8.setValue((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(linkedListNode8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        try {
            linkedListNode5.setPrevious(linkedListNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        java.lang.Class<?> wildcardClass47 = linkedListNode34.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        java.lang.Integer int3 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass3 = linkedListNode0.getClass();
        java.lang.Integer int4 = linkedListNode0.getValue();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        try {
            practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
        linkedListNode18.setPrevious(linkedListNode19);
        java.lang.Integer int22 = linkedListNode18.getValue();
        practico5node.LinkedListNode linkedListNode23 = linkedListNode18.getPrevious();
        practico5node.LinkedListNode linkedListNode24 = linkedListNode23.getPrevious();
        linkedListNode0.setPrevious(linkedListNode24);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(linkedListNode20);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(linkedListNode23);
        org.junit.Assert.assertNull(linkedListNode24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        linkedListNode0.setValue((java.lang.Integer) 10);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        java.lang.Integer int47 = linkedListNode34.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(int47);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        java.lang.Integer int16 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        java.lang.Class<?> wildcardClass21 = linkedListNode17.getClass();
        java.lang.Integer int22 = linkedListNode17.getValue();
        linkedListNode6.setNext(linkedListNode17);
        practico5node.LinkedListNode linkedListNode24 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        java.lang.Class<?> wildcardClass29 = linkedListNode25.getClass();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        linkedListNode25.setPrevious(linkedListNode30);
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = linkedListNode36.getNext();
        linkedListNode35.setPrevious(linkedListNode36);
        linkedListNode30.setNext(linkedListNode36);
        linkedListNode24.setPrevious(linkedListNode36);
        linkedListNode0.setNext(linkedListNode36);
        java.lang.Integer int42 = linkedListNode36.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(linkedListNode24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNull(linkedListNode37);
        org.junit.Assert.assertNull(int42);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode5.getPrevious();
        try {
            linkedListNode6.setValue((java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Integer int15 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass17 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int13 = nodeCachingLinkedList0.get(0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getPrevious();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode2.getNext();
        linkedListNode0.setPrevious(linkedListNode4);
        try {
            practico5node.LinkedListNode linkedListNode6 = linkedListNode4.getPrevious();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        java.lang.Class<?> wildcardClass19 = linkedListNode18.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = null;
        try {
            linkedListNode2.setNext(linkedListNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]" + "'", str7.equals("[20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]" + "'", str8.equals("[20]"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        java.lang.Integer int29 = linkedListNode19.getValue();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        java.lang.Integer int35 = linkedListNode30.getValue();
        linkedListNode19.setNext(linkedListNode30);
        java.lang.Class<?> wildcardClass37 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = linkedListNode38.getPrevious();
        java.lang.Integer int49 = linkedListNode48.getValue();
        linkedListNode48.setValue((java.lang.Integer) 1);
        linkedListNode30.setNext(linkedListNode48);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        practico5node.LinkedListNode linkedListNode69 = linkedListNode59.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode53.setPrevious(linkedListNode59);
        linkedListNode48.setPrevious(linkedListNode59);
        linkedListNode0.setNext(linkedListNode59);
        practico5node.LinkedListNode linkedListNode74 = linkedListNode59.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNotNull(linkedListNode48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNotNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNotNull(linkedListNode74);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        java.lang.Integer int3 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getPrevious();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        java.lang.Integer int57 = linkedListNode47.getValue();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode11.setNext(linkedListNode47);
        practico5node.LinkedListNode linkedListNode60 = linkedListNode47.getNext();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode63 = linkedListNode62.getNext();
        linkedListNode61.setPrevious(linkedListNode62);
        java.lang.Class<?> wildcardClass65 = linkedListNode61.getClass();
        java.lang.Integer int66 = linkedListNode61.getValue();
        java.lang.Class<?> wildcardClass67 = linkedListNode61.getClass();
        try {
            linkedListNode60.setNext(linkedListNode61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNull(linkedListNode60);
        org.junit.Assert.assertNull(linkedListNode63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        linkedListNode1.setPrevious(linkedListNode2);
        java.lang.Class<?> wildcardClass5 = linkedListNode1.getClass();
        java.lang.Integer int6 = linkedListNode1.getValue();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        linkedListNode7.setPrevious(linkedListNode12);
        practico5node.LinkedListNode linkedListNode17 = linkedListNode7.getPrevious();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode7.getNext();
        linkedListNode1.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        linkedListNode20.setPrevious(linkedListNode25);
        java.lang.Integer int30 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        java.lang.Integer int36 = linkedListNode31.getValue();
        linkedListNode20.setNext(linkedListNode31);
        java.lang.Class<?> wildcardClass38 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode49 = linkedListNode39.getPrevious();
        java.lang.Integer int50 = linkedListNode49.getValue();
        linkedListNode49.setValue((java.lang.Integer) 1);
        linkedListNode31.setNext(linkedListNode49);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        java.lang.Integer int59 = linkedListNode54.getValue();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        java.lang.Class<?> wildcardClass64 = linkedListNode60.getClass();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        linkedListNode60.setPrevious(linkedListNode65);
        practico5node.LinkedListNode linkedListNode70 = linkedListNode60.getPrevious();
        practico5node.LinkedListNode linkedListNode71 = linkedListNode60.getNext();
        linkedListNode54.setPrevious(linkedListNode60);
        linkedListNode49.setPrevious(linkedListNode60);
        linkedListNode1.setNext(linkedListNode60);
        linkedListNode0.setNext(linkedListNode1);
        practico5node.LinkedListNode linkedListNode76 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode77 = linkedListNode76.getPrevious();
        linkedListNode76.setValue((java.lang.Integer) 1);
        practico5node.LinkedListNode linkedListNode80 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode81 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode82 = linkedListNode81.getNext();
        linkedListNode80.setPrevious(linkedListNode81);
        java.lang.Class<?> wildcardClass84 = linkedListNode80.getClass();
        practico5node.LinkedListNode linkedListNode85 = linkedListNode80.getPrevious();
        practico5node.LinkedListNode linkedListNode86 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode87 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode88 = linkedListNode87.getNext();
        linkedListNode86.setPrevious(linkedListNode87);
        java.lang.Class<?> wildcardClass90 = linkedListNode86.getClass();
        practico5node.LinkedListNode linkedListNode91 = linkedListNode86.getPrevious();
        linkedListNode80.setNext(linkedListNode91);
        linkedListNode76.setNext(linkedListNode91);
        linkedListNode0.setNext(linkedListNode91);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNotNull(linkedListNode49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNotNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode71);
        org.junit.Assert.assertNull(linkedListNode77);
        org.junit.Assert.assertNull(linkedListNode82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(linkedListNode85);
        org.junit.Assert.assertNull(linkedListNode88);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(linkedListNode91);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int9 = nodeCachingLinkedList0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        linkedListNode15.setValue((java.lang.Integer) (-1));
        java.lang.Integer int28 = linkedListNode15.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28.equals((-1)));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        try {
            java.lang.Integer int8 = nodeCachingLinkedList0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        linkedListNode1.setPrevious(linkedListNode2);
        java.lang.Class<?> wildcardClass5 = linkedListNode1.getClass();
        java.lang.Integer int6 = linkedListNode1.getValue();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        linkedListNode7.setPrevious(linkedListNode12);
        practico5node.LinkedListNode linkedListNode17 = linkedListNode7.getPrevious();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode7.getNext();
        linkedListNode1.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        linkedListNode20.setPrevious(linkedListNode25);
        java.lang.Integer int30 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        java.lang.Integer int36 = linkedListNode31.getValue();
        linkedListNode20.setNext(linkedListNode31);
        java.lang.Class<?> wildcardClass38 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode49 = linkedListNode39.getPrevious();
        java.lang.Integer int50 = linkedListNode49.getValue();
        linkedListNode49.setValue((java.lang.Integer) 1);
        linkedListNode31.setNext(linkedListNode49);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        java.lang.Integer int59 = linkedListNode54.getValue();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        java.lang.Class<?> wildcardClass64 = linkedListNode60.getClass();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        linkedListNode60.setPrevious(linkedListNode65);
        practico5node.LinkedListNode linkedListNode70 = linkedListNode60.getPrevious();
        practico5node.LinkedListNode linkedListNode71 = linkedListNode60.getNext();
        linkedListNode54.setPrevious(linkedListNode60);
        linkedListNode49.setPrevious(linkedListNode60);
        linkedListNode1.setNext(linkedListNode60);
        linkedListNode0.setNext(linkedListNode1);
        practico5node.LinkedListNode linkedListNode76 = linkedListNode0.getPrevious();
        try {
            practico5node.LinkedListNode linkedListNode77 = linkedListNode76.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNotNull(linkedListNode49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNotNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode71);
        org.junit.Assert.assertNull(linkedListNode76);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(linkedListNode6);
        org.junit.Assert.assertNull(linkedListNode7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.String str10 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[20,-1,20]" + "'", str10.equals("[20,-1,20]"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass6 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode7.getPrevious();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode15 = linkedListNode14.getNext();
        linkedListNode13.setPrevious(linkedListNode14);
        java.lang.Class<?> wildcardClass17 = linkedListNode13.getClass();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode13.getPrevious();
        linkedListNode7.setNext(linkedListNode18);
        linkedListNode0.setPrevious(linkedListNode18);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode18.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[20]" + "'", str5.equals("[20]"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Class<?> wildcardClass5 = linkedListNode0.getClass();
        java.lang.Integer int6 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode0.getPrevious();
        java.lang.Integer int8 = linkedListNode7.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(linkedListNode7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        try {
            java.lang.Integer int14 = nodeCachingLinkedList0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getNext();
        try {
            practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getPrevious();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        linkedListNode1.setPrevious(linkedListNode2);
        java.lang.Class<?> wildcardClass5 = linkedListNode1.getClass();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        linkedListNode1.setPrevious(linkedListNode6);
        java.lang.Integer int11 = linkedListNode1.getValue();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        java.lang.Integer int17 = linkedListNode12.getValue();
        linkedListNode1.setNext(linkedListNode12);
        java.lang.Class<?> wildcardClass19 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        linkedListNode20.setPrevious(linkedListNode25);
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = linkedListNode36.getNext();
        linkedListNode35.setPrevious(linkedListNode36);
        linkedListNode30.setPrevious(linkedListNode35);
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        linkedListNode35.setNext(linkedListNode41);
        linkedListNode20.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass46 = linkedListNode35.getClass();
        linkedListNode12.setNext(linkedListNode35);
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode50 = linkedListNode49.getNext();
        linkedListNode48.setPrevious(linkedListNode49);
        java.lang.Class<?> wildcardClass52 = linkedListNode48.getClass();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        linkedListNode48.setPrevious(linkedListNode53);
        java.lang.Integer int58 = linkedListNode48.getValue();
        practico5node.LinkedListNode linkedListNode59 = linkedListNode48.getNext();
        linkedListNode12.setNext(linkedListNode48);
        linkedListNode0.setNext(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(linkedListNode37);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(linkedListNode50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode59);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        try {
            java.lang.Integer int8 = nodeCachingLinkedList0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        java.lang.Integer int29 = linkedListNode19.getValue();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        java.lang.Integer int35 = linkedListNode30.getValue();
        linkedListNode19.setNext(linkedListNode30);
        java.lang.Class<?> wildcardClass37 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = linkedListNode38.getPrevious();
        java.lang.Integer int49 = linkedListNode48.getValue();
        linkedListNode48.setValue((java.lang.Integer) 1);
        linkedListNode30.setNext(linkedListNode48);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        practico5node.LinkedListNode linkedListNode69 = linkedListNode59.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode53.setPrevious(linkedListNode59);
        linkedListNode48.setPrevious(linkedListNode59);
        linkedListNode0.setNext(linkedListNode59);
        practico5node.LinkedListNode linkedListNode74 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode75 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode76 = linkedListNode75.getNext();
        linkedListNode74.setPrevious(linkedListNode75);
        practico5node.LinkedListNode linkedListNode78 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode79 = linkedListNode78.getNext();
        linkedListNode74.setNext(linkedListNode78);
        java.lang.Class<?> wildcardClass81 = linkedListNode74.getClass();
        linkedListNode0.setPrevious(linkedListNode74);
        java.lang.Integer int83 = linkedListNode74.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNotNull(linkedListNode48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNotNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode76);
        org.junit.Assert.assertNull(linkedListNode79);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNull(int83);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        java.lang.Integer int6 = linkedListNode5.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        java.lang.Integer int3 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        java.lang.Class<?> wildcardClass9 = linkedListNode5.getClass();
        practico5node.LinkedListNode linkedListNode10 = linkedListNode5.getPrevious();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode15.getNext();
        linkedListNode11.setNext(linkedListNode15);
        linkedListNode10.setPrevious(linkedListNode15);
        java.lang.Integer int19 = linkedListNode15.getValue();
        try {
            linkedListNode4.setNext(linkedListNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
        org.junit.Assert.assertNull(linkedListNode4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode16);
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        java.lang.Integer int57 = linkedListNode47.getValue();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode11.setNext(linkedListNode47);
        practico5node.LinkedListNode linkedListNode60 = linkedListNode47.getNext();
        try {
            java.lang.Integer int61 = linkedListNode60.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNull(linkedListNode60);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode2.getPrevious();
        linkedListNode0.setPrevious(linkedListNode4);
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getPrevious();
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
        org.junit.Assert.assertNull(linkedListNode6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.String str10 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[100]" + "'", str5.equals("[100]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]" + "'", str6.equals("[100]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]" + "'", str10.equals("[]"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode15 = linkedListNode14.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode14);
        org.junit.Assert.assertNull(linkedListNode15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        java.lang.Class<?> wildcardClass9 = linkedListNode5.getClass();
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        linkedListNode5.setPrevious(linkedListNode10);
        java.lang.Class<?> wildcardClass15 = linkedListNode5.getClass();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode5.getPrevious();
        try {
            linkedListNode4.setNext(linkedListNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(linkedListNode16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        java.lang.Integer int5 = linkedListNode0.getValue();
        java.lang.Integer int6 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.get((int) (byte) 0);
        java.lang.String str10 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1,20]" + "'", str10.equals("[-1,20]"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        try {
            java.lang.Integer int8 = nodeCachingLinkedList0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.String str1 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        try {
            java.lang.Integer int12 = nodeCachingLinkedList0.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        linkedListNode12.setPrevious(linkedListNode17);
        java.lang.Integer int22 = linkedListNode12.getValue();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        java.lang.Integer int28 = linkedListNode23.getValue();
        linkedListNode12.setNext(linkedListNode23);
        java.lang.Class<?> wildcardClass30 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        linkedListNode31.setPrevious(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = linkedListNode47.getNext();
        linkedListNode46.setPrevious(linkedListNode47);
        linkedListNode41.setPrevious(linkedListNode46);
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = linkedListNode52.getNext();
        linkedListNode51.setPrevious(linkedListNode52);
        linkedListNode46.setNext(linkedListNode52);
        linkedListNode31.setPrevious(linkedListNode46);
        java.lang.Class<?> wildcardClass57 = linkedListNode46.getClass();
        linkedListNode23.setNext(linkedListNode46);
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        java.lang.Integer int69 = linkedListNode59.getValue();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode23.setNext(linkedListNode59);
        linkedListNode11.setNext(linkedListNode23);
        linkedListNode11.setValue((java.lang.Integer) 100);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode48);
        org.junit.Assert.assertNull(linkedListNode53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode70);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode2.getPrevious();
        linkedListNode0.setPrevious(linkedListNode4);
        linkedListNode0.setValue((java.lang.Integer) 1);
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        java.lang.Integer int15 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode16.setNext(linkedListNode20);
        linkedListNode6.setNext(linkedListNode20);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        java.lang.Class<?> wildcardClass1 = linkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[100,20]" + "'", str7.equals("[100,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100,20]" + "'", str8.equals("[100,20]"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int11 = nodeCachingLinkedList0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[100]" + "'", str5.equals("[100]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]" + "'", str6.equals("[100]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode5.getNext();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        linkedListNode7.setPrevious(linkedListNode12);
        java.lang.Integer int17 = linkedListNode7.getValue();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
        linkedListNode18.setPrevious(linkedListNode19);
        java.lang.Class<?> wildcardClass22 = linkedListNode18.getClass();
        java.lang.Integer int23 = linkedListNode18.getValue();
        linkedListNode7.setNext(linkedListNode18);
        java.lang.Class<?> wildcardClass25 = linkedListNode18.getClass();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        java.lang.Integer int37 = linkedListNode36.getValue();
        linkedListNode36.setValue((java.lang.Integer) 1);
        linkedListNode18.setNext(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        java.lang.Integer int46 = linkedListNode41.getValue();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        practico5node.LinkedListNode linkedListNode57 = linkedListNode47.getPrevious();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode41.setPrevious(linkedListNode47);
        linkedListNode36.setPrevious(linkedListNode47);
        practico5node.LinkedListNode linkedListNode61 = linkedListNode36.getNext();
        try {
            linkedListNode6.setNext(linkedListNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(linkedListNode20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNotNull(linkedListNode57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNull(linkedListNode61);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 100);
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.Integer int13 = nodeCachingLinkedList0.get(1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13.equals(10));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8.equals(20));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        java.lang.Integer int57 = linkedListNode47.getValue();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode11.setNext(linkedListNode47);
        practico5node.LinkedListNode linkedListNode60 = linkedListNode47.getPrevious();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode47.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNotNull(linkedListNode60);
        org.junit.Assert.assertNotNull(linkedListNode61);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) -1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        java.lang.Integer int15 = linkedListNode10.getValue();
        java.lang.Class<?> wildcardClass16 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        java.lang.Class<?> wildcardClass21 = linkedListNode17.getClass();
        practico5node.LinkedListNode linkedListNode22 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = linkedListNode23.getNext();
        linkedListNode22.setPrevious(linkedListNode23);
        linkedListNode17.setPrevious(linkedListNode22);
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode29 = linkedListNode28.getNext();
        linkedListNode27.setPrevious(linkedListNode28);
        java.lang.Class<?> wildcardClass31 = linkedListNode27.getClass();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode34 = linkedListNode33.getNext();
        linkedListNode32.setPrevious(linkedListNode33);
        linkedListNode27.setPrevious(linkedListNode32);
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = linkedListNode38.getNext();
        linkedListNode37.setPrevious(linkedListNode38);
        linkedListNode32.setNext(linkedListNode38);
        linkedListNode17.setPrevious(linkedListNode32);
        linkedListNode10.setPrevious(linkedListNode32);
        linkedListNode5.setPrevious(linkedListNode10);
        java.lang.Integer int45 = linkedListNode5.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(linkedListNode24);
        org.junit.Assert.assertNull(linkedListNode29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(linkedListNode34);
        org.junit.Assert.assertNull(linkedListNode39);
        org.junit.Assert.assertNull(int45);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getNext();
        linkedListNode6.setNext(linkedListNode10);
        linkedListNode5.setPrevious(linkedListNode10);
        java.lang.Integer int14 = linkedListNode5.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        linkedListNode5.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode11.getPrevious();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        java.lang.Class<?> wildcardClass20 = linkedListNode16.getClass();
        linkedListNode11.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode22 = linkedListNode16.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(linkedListNode22);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.Integer int7 = nodeCachingLinkedList0.get(0);
        try {
            java.lang.Integer int9 = nodeCachingLinkedList0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList0.getClass();
        try {
            java.lang.Integer int11 = nodeCachingLinkedList0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[100]" + "'", str5.equals("[100]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]" + "'", str6.equals("[100]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        try {
            java.lang.Integer int13 = nodeCachingLinkedList0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]" + "'", str8.equals("[20]"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12.equals(10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        java.lang.Integer int57 = linkedListNode47.getValue();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode11.setNext(linkedListNode47);
        practico5node.LinkedListNode linkedListNode60 = linkedListNode47.getPrevious();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getPrevious();
        practico5node.LinkedListNode linkedListNode63 = linkedListNode61.getNext();
        practico5node.LinkedListNode linkedListNode64 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNotNull(linkedListNode60);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNull(linkedListNode63);
        org.junit.Assert.assertNull(linkedListNode64);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.Integer int6 = nodeCachingLinkedList0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6.equals(10));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int8 = nodeCachingLinkedList0.get(0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8.equals(20));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        try {
            java.lang.Integer int11 = nodeCachingLinkedList0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[20,-1,20]" + "'", str9.equals("[20,-1,20]"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass6 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        linkedListNode0.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode12 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNull(linkedListNode12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode0.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        try {
            java.lang.Integer int6 = nodeCachingLinkedList0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Class<?> wildcardClass5 = linkedListNode0.getClass();
        java.lang.Integer int6 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode0.getPrevious();
        linkedListNode0.setValue((java.lang.Integer) 0);
        java.lang.Integer int10 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass11 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(linkedListNode7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10.equals(0));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        java.lang.Integer int39 = linkedListNode34.getValue();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass44 = linkedListNode40.getClass();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setPrevious(linkedListNode45);
        practico5node.LinkedListNode linkedListNode50 = linkedListNode40.getPrevious();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode40.getNext();
        linkedListNode34.setPrevious(linkedListNode40);
        linkedListNode29.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        linkedListNode54.setPrevious(linkedListNode59);
        practico5node.LinkedListNode linkedListNode64 = linkedListNode54.getPrevious();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        java.lang.Integer int69 = linkedListNode65.getValue();
        linkedListNode54.setNext(linkedListNode65);
        linkedListNode29.setPrevious(linkedListNode54);
        practico5node.LinkedListNode linkedListNode72 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode73 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode74 = linkedListNode73.getNext();
        linkedListNode72.setPrevious(linkedListNode73);
        java.lang.Class<?> wildcardClass76 = linkedListNode72.getClass();
        practico5node.LinkedListNode linkedListNode77 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode78 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode79 = linkedListNode78.getNext();
        linkedListNode77.setPrevious(linkedListNode78);
        linkedListNode72.setPrevious(linkedListNode77);
        practico5node.LinkedListNode linkedListNode82 = linkedListNode72.getPrevious();
        practico5node.LinkedListNode linkedListNode83 = linkedListNode72.getNext();
        java.lang.Class<?> wildcardClass84 = linkedListNode72.getClass();
        practico5node.LinkedListNode linkedListNode85 = linkedListNode72.getNext();
        linkedListNode54.setPrevious(linkedListNode72);
        practico5node.LinkedListNode linkedListNode87 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode88 = linkedListNode87.getPrevious();
        linkedListNode87.setValue((java.lang.Integer) 1);
        practico5node.LinkedListNode linkedListNode91 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode92 = linkedListNode91.getPrevious();
        linkedListNode91.setValue((java.lang.Integer) 1);
        linkedListNode87.setNext(linkedListNode91);
        linkedListNode54.setNext(linkedListNode91);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode50);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(linkedListNode64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode74);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNull(linkedListNode79);
        org.junit.Assert.assertNotNull(linkedListNode82);
        org.junit.Assert.assertNull(linkedListNode83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNull(linkedListNode85);
        org.junit.Assert.assertNull(linkedListNode88);
        org.junit.Assert.assertNull(linkedListNode92);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 100);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        try {
            java.lang.Integer int12 = nodeCachingLinkedList0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode0.getNext();
        linkedListNode8.setValue((java.lang.Integer) 0);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(linkedListNode8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getPrevious();
        java.lang.Integer int7 = linkedListNode6.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(linkedListNode6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int7 = nodeCachingLinkedList0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[20]" + "'", str5.equals("[20]"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 100);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        linkedListNode11.setValue((java.lang.Integer) (-1));
        practico5node.LinkedListNode linkedListNode14 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode15.getNext();
        linkedListNode14.setPrevious(linkedListNode15);
        java.lang.Class<?> wildcardClass18 = linkedListNode14.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        linkedListNode14.setPrevious(linkedListNode19);
        practico5node.LinkedListNode linkedListNode24 = linkedListNode14.getPrevious();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode14.getNext();
        java.lang.Class<?> wildcardClass26 = linkedListNode14.getClass();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode14.getNext();
        java.lang.Integer int28 = linkedListNode14.getValue();
        linkedListNode11.setPrevious(linkedListNode14);
        practico5node.LinkedListNode linkedListNode30 = linkedListNode14.getNext();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode14.getPrevious();
        linkedListNode0.setNext(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(linkedListNode24);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(linkedListNode30);
        org.junit.Assert.assertNotNull(linkedListNode31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        java.lang.Integer int57 = linkedListNode47.getValue();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode11.setNext(linkedListNode47);
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = linkedListNode64.getNext();
        linkedListNode60.setNext(linkedListNode64);
        java.lang.Class<?> wildcardClass67 = linkedListNode60.getClass();
        practico5node.LinkedListNode linkedListNode68 = linkedListNode60.getNext();
        practico5node.LinkedListNode linkedListNode69 = linkedListNode68.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode68.getNext();
        linkedListNode11.setNext(linkedListNode70);
        try {
            java.lang.Class<?> wildcardClass72 = linkedListNode70.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNull(linkedListNode65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(linkedListNode68);
        org.junit.Assert.assertNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[100,20]" + "'", str7.equals("[100,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100,20]" + "'", str8.equals("[100,20]"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass10 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]" + "'", str8.equals("[20]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[20]" + "'", str9.equals("[20]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        java.lang.Integer int39 = linkedListNode34.getValue();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass44 = linkedListNode40.getClass();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setPrevious(linkedListNode45);
        practico5node.LinkedListNode linkedListNode50 = linkedListNode40.getPrevious();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode40.getNext();
        linkedListNode34.setPrevious(linkedListNode40);
        linkedListNode29.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        linkedListNode54.setPrevious(linkedListNode59);
        practico5node.LinkedListNode linkedListNode64 = linkedListNode54.getPrevious();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        java.lang.Integer int69 = linkedListNode65.getValue();
        linkedListNode54.setNext(linkedListNode65);
        linkedListNode29.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass72 = linkedListNode29.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode50);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(linkedListNode64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setNext(linkedListNode30);
        linkedListNode18.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass35 = linkedListNode30.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode11.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        practico5node.LinkedListNode linkedListNode3 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode3.setPrevious(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode10 = linkedListNode9.getNext();
        linkedListNode8.setPrevious(linkedListNode9);
        linkedListNode3.setPrevious(linkedListNode8);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode3.getPrevious();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode3.getNext();
        java.lang.Class<?> wildcardClass15 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode3.getNext();
        java.lang.Integer int17 = linkedListNode3.getValue();
        linkedListNode0.setPrevious(linkedListNode3);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode3.getNext();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode3.getPrevious();
        java.lang.Integer int21 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode22 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        java.lang.Integer int28 = linkedListNode23.getValue();
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = linkedListNode29.getPrevious();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode29.getNext();
        linkedListNode23.setPrevious(linkedListNode29);
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = linkedListNode43.getNext();
        linkedListNode42.setPrevious(linkedListNode43);
        java.lang.Class<?> wildcardClass46 = linkedListNode42.getClass();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        linkedListNode42.setPrevious(linkedListNode47);
        java.lang.Integer int52 = linkedListNode42.getValue();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        linkedListNode42.setNext(linkedListNode53);
        java.lang.Class<?> wildcardClass60 = linkedListNode53.getClass();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode63 = linkedListNode62.getNext();
        linkedListNode61.setPrevious(linkedListNode62);
        java.lang.Class<?> wildcardClass65 = linkedListNode61.getClass();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode68 = linkedListNode67.getNext();
        linkedListNode66.setPrevious(linkedListNode67);
        linkedListNode61.setPrevious(linkedListNode66);
        practico5node.LinkedListNode linkedListNode71 = linkedListNode61.getPrevious();
        java.lang.Integer int72 = linkedListNode71.getValue();
        linkedListNode71.setValue((java.lang.Integer) 1);
        linkedListNode53.setNext(linkedListNode71);
        practico5node.LinkedListNode linkedListNode76 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode77 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode78 = linkedListNode77.getNext();
        linkedListNode76.setPrevious(linkedListNode77);
        java.lang.Class<?> wildcardClass80 = linkedListNode76.getClass();
        java.lang.Integer int81 = linkedListNode76.getValue();
        practico5node.LinkedListNode linkedListNode82 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode83 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode84 = linkedListNode83.getNext();
        linkedListNode82.setPrevious(linkedListNode83);
        java.lang.Class<?> wildcardClass86 = linkedListNode82.getClass();
        practico5node.LinkedListNode linkedListNode87 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode88 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode89 = linkedListNode88.getNext();
        linkedListNode87.setPrevious(linkedListNode88);
        linkedListNode82.setPrevious(linkedListNode87);
        practico5node.LinkedListNode linkedListNode92 = linkedListNode82.getPrevious();
        practico5node.LinkedListNode linkedListNode93 = linkedListNode82.getNext();
        linkedListNode76.setPrevious(linkedListNode82);
        linkedListNode71.setPrevious(linkedListNode82);
        linkedListNode23.setNext(linkedListNode82);
        linkedListNode22.setNext(linkedListNode23);
        linkedListNode20.setNext(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(linkedListNode20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(linkedListNode39);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNull(linkedListNode44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(linkedListNode63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(linkedListNode68);
        org.junit.Assert.assertNotNull(linkedListNode71);
        org.junit.Assert.assertNull(int72);
        org.junit.Assert.assertNull(linkedListNode78);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNull(int81);
        org.junit.Assert.assertNull(linkedListNode84);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNull(linkedListNode89);
        org.junit.Assert.assertNotNull(linkedListNode92);
        org.junit.Assert.assertNull(linkedListNode93);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode4.getClass();
        linkedListNode4.setValue((java.lang.Integer) 10);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        linkedListNode12.setPrevious(linkedListNode17);
        java.lang.Class<?> wildcardClass22 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode23 = linkedListNode12.getNext();
        linkedListNode0.setNext(linkedListNode23);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(linkedListNode23);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 100);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode6.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        java.lang.Class<?> wildcardClass19 = linkedListNode15.getClass();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setPrevious(linkedListNode20);
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        java.lang.Class<?> wildcardClass29 = linkedListNode25.getClass();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        linkedListNode25.setPrevious(linkedListNode30);
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = linkedListNode36.getNext();
        linkedListNode35.setPrevious(linkedListNode36);
        linkedListNode30.setNext(linkedListNode36);
        linkedListNode15.setPrevious(linkedListNode30);
        linkedListNode6.setPrevious(linkedListNode15);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNull(linkedListNode37);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        try {
            java.lang.Integer int2 = linkedListNode1.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        java.lang.Class<?> wildcardClass9 = linkedListNode5.getClass();
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        linkedListNode5.setPrevious(linkedListNode10);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode5.getNext();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        java.lang.Class<?> wildcardClass20 = linkedListNode16.getClass();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode23 = linkedListNode22.getNext();
        linkedListNode21.setPrevious(linkedListNode22);
        linkedListNode16.setPrevious(linkedListNode21);
        practico5node.LinkedListNode linkedListNode26 = linkedListNode16.getPrevious();
        java.lang.Integer int27 = linkedListNode26.getValue();
        linkedListNode5.setNext(linkedListNode26);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode49 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode50 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode50.getNext();
        linkedListNode49.setPrevious(linkedListNode50);
        linkedListNode44.setNext(linkedListNode50);
        linkedListNode29.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode57 = linkedListNode56.getNext();
        linkedListNode55.setPrevious(linkedListNode56);
        java.lang.Class<?> wildcardClass59 = linkedListNode55.getClass();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        linkedListNode55.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass65 = linkedListNode55.getClass();
        linkedListNode29.setPrevious(linkedListNode55);
        linkedListNode26.setNext(linkedListNode29);
        linkedListNode26.setValue((java.lang.Integer) 20);
        try {
            linkedListNode4.setPrevious(linkedListNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(linkedListNode23);
        org.junit.Assert.assertNotNull(linkedListNode26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        linkedListNode11.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode11.getPrevious();
        java.lang.Integer int22 = linkedListNode21.getValue();
        linkedListNode0.setNext(linkedListNode21);
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        java.lang.Class<?> wildcardClass28 = linkedListNode24.getClass();
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setPrevious(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setNext(linkedListNode45);
        linkedListNode24.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode50 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = linkedListNode51.getNext();
        linkedListNode50.setPrevious(linkedListNode51);
        java.lang.Class<?> wildcardClass54 = linkedListNode50.getClass();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode57 = linkedListNode56.getNext();
        linkedListNode55.setPrevious(linkedListNode56);
        linkedListNode50.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass60 = linkedListNode50.getClass();
        linkedListNode24.setPrevious(linkedListNode50);
        linkedListNode21.setNext(linkedListNode24);
        linkedListNode21.setValue((java.lang.Integer) 20);
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        java.lang.Class<?> wildcardClass69 = linkedListNode65.getClass();
        practico5node.LinkedListNode linkedListNode70 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode71 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode72 = linkedListNode71.getNext();
        linkedListNode70.setPrevious(linkedListNode71);
        linkedListNode65.setPrevious(linkedListNode70);
        practico5node.LinkedListNode linkedListNode75 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode76 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode77 = linkedListNode76.getNext();
        linkedListNode75.setPrevious(linkedListNode76);
        linkedListNode70.setNext(linkedListNode76);
        practico5node.LinkedListNode linkedListNode80 = null;
        linkedListNode76.setNext(linkedListNode80);
        practico5node.LinkedListNode linkedListNode82 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode83 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode84 = linkedListNode83.getNext();
        linkedListNode82.setPrevious(linkedListNode83);
        java.lang.Class<?> wildcardClass86 = linkedListNode82.getClass();
        java.lang.Class<?> wildcardClass87 = linkedListNode82.getClass();
        java.lang.Integer int88 = linkedListNode82.getValue();
        practico5node.LinkedListNode linkedListNode89 = linkedListNode82.getPrevious();
        linkedListNode82.setValue((java.lang.Integer) 0);
        linkedListNode76.setNext(linkedListNode82);
        linkedListNode21.setPrevious(linkedListNode82);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(linkedListNode52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(linkedListNode57);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNull(linkedListNode72);
        org.junit.Assert.assertNull(linkedListNode77);
        org.junit.Assert.assertNull(linkedListNode84);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNull(int88);
        org.junit.Assert.assertNotNull(linkedListNode89);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        java.lang.Integer int15 = linkedListNode10.getValue();
        java.lang.Class<?> wildcardClass16 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        java.lang.Class<?> wildcardClass21 = linkedListNode17.getClass();
        practico5node.LinkedListNode linkedListNode22 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = linkedListNode23.getNext();
        linkedListNode22.setPrevious(linkedListNode23);
        linkedListNode17.setPrevious(linkedListNode22);
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode29 = linkedListNode28.getNext();
        linkedListNode27.setPrevious(linkedListNode28);
        java.lang.Class<?> wildcardClass31 = linkedListNode27.getClass();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode34 = linkedListNode33.getNext();
        linkedListNode32.setPrevious(linkedListNode33);
        linkedListNode27.setPrevious(linkedListNode32);
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = linkedListNode38.getNext();
        linkedListNode37.setPrevious(linkedListNode38);
        linkedListNode32.setNext(linkedListNode38);
        linkedListNode17.setPrevious(linkedListNode32);
        linkedListNode10.setPrevious(linkedListNode32);
        linkedListNode5.setPrevious(linkedListNode10);
        practico5node.LinkedListNode linkedListNode45 = linkedListNode10.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(linkedListNode24);
        org.junit.Assert.assertNull(linkedListNode29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(linkedListNode34);
        org.junit.Assert.assertNull(linkedListNode39);
        org.junit.Assert.assertNotNull(linkedListNode45);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        java.lang.Class<?> wildcardClass2 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(linkedListNode3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode5.getPrevious();
        java.lang.Integer int7 = linkedListNode5.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getNext();
        linkedListNode6.setNext(linkedListNode10);
        linkedListNode5.setPrevious(linkedListNode10);
        practico5node.LinkedListNode linkedListNode14 = linkedListNode10.getPrevious();
        practico5node.LinkedListNode linkedListNode15 = linkedListNode10.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNull(linkedListNode15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getPrevious();
        org.junit.Assert.assertNull(linkedListNode3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Class<?> wildcardClass5 = linkedListNode0.getClass();
        java.lang.Integer int6 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass7 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (byte) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11.equals(20));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Integer int7 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass8 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex(0);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.Integer int7 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(0);
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass6 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        linkedListNode0.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode12 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode15 = linkedListNode14.getNext();
        linkedListNode13.setPrevious(linkedListNode14);
        java.lang.Class<?> wildcardClass17 = linkedListNode13.getClass();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
        linkedListNode18.setPrevious(linkedListNode19);
        linkedListNode13.setPrevious(linkedListNode18);
        practico5node.LinkedListNode linkedListNode23 = linkedListNode13.getPrevious();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        java.lang.Class<?> wildcardClass28 = linkedListNode24.getClass();
        java.lang.Integer int29 = linkedListNode24.getValue();
        java.lang.Class<?> wildcardClass30 = linkedListNode24.getClass();
        linkedListNode13.setNext(linkedListNode24);
        linkedListNode0.setPrevious(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(linkedListNode20);
        org.junit.Assert.assertNotNull(linkedListNode23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        java.lang.Class<?> wildcardClass17 = linkedListNode11.getClass();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(linkedListNode19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        linkedListNode1.setPrevious(linkedListNode2);
        java.lang.Class<?> wildcardClass5 = linkedListNode1.getClass();
        java.lang.Integer int6 = linkedListNode1.getValue();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        linkedListNode7.setPrevious(linkedListNode12);
        practico5node.LinkedListNode linkedListNode17 = linkedListNode7.getPrevious();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode7.getNext();
        linkedListNode1.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        linkedListNode20.setPrevious(linkedListNode25);
        java.lang.Integer int30 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        java.lang.Integer int36 = linkedListNode31.getValue();
        linkedListNode20.setNext(linkedListNode31);
        java.lang.Class<?> wildcardClass38 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode49 = linkedListNode39.getPrevious();
        java.lang.Integer int50 = linkedListNode49.getValue();
        linkedListNode49.setValue((java.lang.Integer) 1);
        linkedListNode31.setNext(linkedListNode49);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        java.lang.Integer int59 = linkedListNode54.getValue();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        java.lang.Class<?> wildcardClass64 = linkedListNode60.getClass();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        linkedListNode60.setPrevious(linkedListNode65);
        practico5node.LinkedListNode linkedListNode70 = linkedListNode60.getPrevious();
        practico5node.LinkedListNode linkedListNode71 = linkedListNode60.getNext();
        linkedListNode54.setPrevious(linkedListNode60);
        linkedListNode49.setPrevious(linkedListNode60);
        linkedListNode1.setNext(linkedListNode60);
        linkedListNode0.setNext(linkedListNode1);
        linkedListNode0.setValue((java.lang.Integer) 100);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNotNull(linkedListNode49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNotNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode71);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setNext(linkedListNode30);
        linkedListNode18.setPrevious(linkedListNode30);
        practico5node.LinkedListNode linkedListNode35 = linkedListNode30.getNext();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        java.lang.Class<?> wildcardClass40 = linkedListNode36.getClass();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        linkedListNode36.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass46 = linkedListNode36.getClass();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode36.getPrevious();
        practico5node.LinkedListNode linkedListNode48 = linkedListNode47.getPrevious();
        linkedListNode30.setPrevious(linkedListNode47);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode48);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        linkedListNode5.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode11.getPrevious();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        java.lang.Class<?> wildcardClass20 = linkedListNode16.getClass();
        java.lang.Integer int21 = linkedListNode16.getValue();
        java.lang.Class<?> wildcardClass22 = linkedListNode16.getClass();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode28 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = linkedListNode29.getNext();
        linkedListNode28.setPrevious(linkedListNode29);
        linkedListNode23.setPrevious(linkedListNode28);
        practico5node.LinkedListNode linkedListNode33 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = linkedListNode34.getNext();
        linkedListNode33.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass37 = linkedListNode33.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        linkedListNode33.setPrevious(linkedListNode38);
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setNext(linkedListNode44);
        linkedListNode23.setPrevious(linkedListNode38);
        linkedListNode16.setPrevious(linkedListNode38);
        try {
            linkedListNode15.setPrevious(linkedListNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(linkedListNode30);
        org.junit.Assert.assertNull(linkedListNode35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNull(linkedListNode45);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        java.lang.Integer int29 = linkedListNode19.getValue();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        java.lang.Integer int35 = linkedListNode30.getValue();
        linkedListNode19.setNext(linkedListNode30);
        java.lang.Class<?> wildcardClass37 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = linkedListNode38.getPrevious();
        java.lang.Integer int49 = linkedListNode48.getValue();
        linkedListNode48.setValue((java.lang.Integer) 1);
        linkedListNode30.setNext(linkedListNode48);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        practico5node.LinkedListNode linkedListNode69 = linkedListNode59.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode53.setPrevious(linkedListNode59);
        linkedListNode48.setPrevious(linkedListNode59);
        linkedListNode0.setNext(linkedListNode59);
        practico5node.LinkedListNode linkedListNode74 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode75 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode76 = linkedListNode75.getNext();
        linkedListNode74.setPrevious(linkedListNode75);
        practico5node.LinkedListNode linkedListNode78 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode79 = linkedListNode78.getNext();
        linkedListNode74.setNext(linkedListNode78);
        java.lang.Class<?> wildcardClass81 = linkedListNode74.getClass();
        linkedListNode0.setPrevious(linkedListNode74);
        practico5node.LinkedListNode linkedListNode83 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNotNull(linkedListNode48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNotNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode76);
        org.junit.Assert.assertNull(linkedListNode79);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(linkedListNode83);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        linkedListNode11.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode11.getPrevious();
        java.lang.Integer int22 = linkedListNode21.getValue();
        linkedListNode0.setNext(linkedListNode21);
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        java.lang.Class<?> wildcardClass28 = linkedListNode24.getClass();
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setPrevious(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setNext(linkedListNode45);
        linkedListNode24.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode50 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = linkedListNode51.getNext();
        linkedListNode50.setPrevious(linkedListNode51);
        java.lang.Class<?> wildcardClass54 = linkedListNode50.getClass();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode57 = linkedListNode56.getNext();
        linkedListNode55.setPrevious(linkedListNode56);
        linkedListNode50.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass60 = linkedListNode50.getClass();
        linkedListNode24.setPrevious(linkedListNode50);
        linkedListNode21.setNext(linkedListNode24);
        practico5node.LinkedListNode linkedListNode63 = linkedListNode21.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(linkedListNode52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(linkedListNode57);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(linkedListNode63);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]" + "'", str8.equals("[20]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[20]" + "'", str9.equals("[20]"));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]" + "'", str8.equals("[20]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[20]" + "'", str9.equals("[20]"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = linkedListNode29.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode34);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex(100);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,20]" + "'", str9.equals("[0,20]"));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        try {
            java.lang.Integer int6 = nodeCachingLinkedList0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode5.getPrevious();
        try {
            practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getPrevious();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        linkedListNode5.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode15 = null;
        linkedListNode11.setNext(linkedListNode15);
        practico5node.LinkedListNode linkedListNode17 = linkedListNode11.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setNext(linkedListNode30);
        linkedListNode18.setPrevious(linkedListNode30);
        practico5node.LinkedListNode linkedListNode35 = linkedListNode30.getNext();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        java.lang.Class<?> wildcardClass40 = linkedListNode36.getClass();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        linkedListNode36.setPrevious(linkedListNode41);
        java.lang.Integer int46 = linkedListNode36.getValue();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        java.lang.Integer int52 = linkedListNode47.getValue();
        linkedListNode36.setNext(linkedListNode47);
        practico5node.LinkedListNode linkedListNode54 = linkedListNode36.getPrevious();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode57 = linkedListNode56.getNext();
        linkedListNode55.setPrevious(linkedListNode56);
        java.lang.Class<?> wildcardClass59 = linkedListNode55.getClass();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        linkedListNode55.setPrevious(linkedListNode60);
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        linkedListNode60.setNext(linkedListNode66);
        linkedListNode54.setPrevious(linkedListNode66);
        linkedListNode30.setPrevious(linkedListNode54);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(linkedListNode54);
        org.junit.Assert.assertNull(linkedListNode57);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNull(linkedListNode67);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        linkedListNode5.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode11.getPrevious();
        try {
            java.lang.Class<?> wildcardClass16 = linkedListNode15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex(0);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6.equals(20));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        java.lang.Integer int37 = linkedListNode36.getValue();
        linkedListNode0.setNext(linkedListNode36);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        java.lang.Integer int49 = linkedListNode39.getValue();
        linkedListNode0.setPrevious(linkedListNode39);
        java.lang.Integer int51 = linkedListNode39.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(int51);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        linkedListNode11.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode11.getPrevious();
        java.lang.Integer int22 = linkedListNode21.getValue();
        linkedListNode0.setNext(linkedListNode21);
        practico5node.LinkedListNode linkedListNode24 = linkedListNode21.getPrevious();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getPrevious();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode25.getNext();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode25.getNext();
        practico5node.LinkedListNode linkedListNode29 = linkedListNode25.getPrevious();
        practico5node.LinkedListNode linkedListNode30 = linkedListNode25.getNext();
        linkedListNode24.setNext(linkedListNode30);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(linkedListNode24);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNull(linkedListNode29);
        org.junit.Assert.assertNull(linkedListNode30);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        linkedListNode0.setValue((java.lang.Integer) 10);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode10.getNext();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode10.getNext();
        linkedListNode0.setNext(linkedListNode10);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode15);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex(10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[100]" + "'", str5.equals("[100]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]" + "'", str6.equals("[100]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) 'a');
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[20]" + "'", str5.equals("[20]"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((-1));
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode10.getNext();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode10.getNext();
        linkedListNode0.setNext(linkedListNode10);
        linkedListNode0.setValue((java.lang.Integer) 100);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        java.lang.Integer int37 = linkedListNode36.getValue();
        linkedListNode0.setNext(linkedListNode36);
        java.lang.Integer int39 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(linkedListNode40);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        try {
            java.lang.Integer int9 = nodeCachingLinkedList0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[100,20]" + "'", str7.equals("[100,20]"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[100]" + "'", str5.equals("[100]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]" + "'", str6.equals("[100]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.Integer int7 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getNext();
        try {
            java.lang.Class<?> wildcardClass12 = linkedListNode11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        java.lang.Integer int29 = linkedListNode19.getValue();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        java.lang.Integer int35 = linkedListNode30.getValue();
        linkedListNode19.setNext(linkedListNode30);
        java.lang.Class<?> wildcardClass37 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = linkedListNode38.getPrevious();
        java.lang.Integer int49 = linkedListNode48.getValue();
        linkedListNode48.setValue((java.lang.Integer) 1);
        linkedListNode30.setNext(linkedListNode48);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        practico5node.LinkedListNode linkedListNode69 = linkedListNode59.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode53.setPrevious(linkedListNode59);
        linkedListNode48.setPrevious(linkedListNode59);
        linkedListNode0.setNext(linkedListNode59);
        java.lang.Class<?> wildcardClass74 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode75 = linkedListNode59.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNotNull(linkedListNode48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNotNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(linkedListNode75);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) ' ');
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]" + "'", str8.equals("[20]"));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) '4');
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode11.getNext();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode11.getPrevious();
        linkedListNode11.setValue((java.lang.Integer) 100);
        practico5node.LinkedListNode linkedListNode22 = linkedListNode11.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode19);
        org.junit.Assert.assertNull(linkedListNode22);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        linkedListNode1.setPrevious(linkedListNode2);
        java.lang.Class<?> wildcardClass5 = linkedListNode1.getClass();
        java.lang.Integer int6 = linkedListNode1.getValue();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        linkedListNode7.setPrevious(linkedListNode12);
        practico5node.LinkedListNode linkedListNode17 = linkedListNode7.getPrevious();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode7.getNext();
        linkedListNode1.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        linkedListNode20.setPrevious(linkedListNode25);
        java.lang.Integer int30 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        java.lang.Integer int36 = linkedListNode31.getValue();
        linkedListNode20.setNext(linkedListNode31);
        java.lang.Class<?> wildcardClass38 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode49 = linkedListNode39.getPrevious();
        java.lang.Integer int50 = linkedListNode49.getValue();
        linkedListNode49.setValue((java.lang.Integer) 1);
        linkedListNode31.setNext(linkedListNode49);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        java.lang.Integer int59 = linkedListNode54.getValue();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = linkedListNode61.getNext();
        linkedListNode60.setPrevious(linkedListNode61);
        java.lang.Class<?> wildcardClass64 = linkedListNode60.getClass();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        linkedListNode60.setPrevious(linkedListNode65);
        practico5node.LinkedListNode linkedListNode70 = linkedListNode60.getPrevious();
        practico5node.LinkedListNode linkedListNode71 = linkedListNode60.getNext();
        linkedListNode54.setPrevious(linkedListNode60);
        linkedListNode49.setPrevious(linkedListNode60);
        linkedListNode1.setNext(linkedListNode60);
        linkedListNode0.setNext(linkedListNode1);
        linkedListNode1.setValue((java.lang.Integer) 0);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNotNull(linkedListNode49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(linkedListNode62);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNotNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode71);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        linkedListNode10.setValue((java.lang.Integer) 100);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.get(0);
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        java.lang.Integer int16 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        java.lang.Class<?> wildcardClass21 = linkedListNode17.getClass();
        java.lang.Integer int22 = linkedListNode17.getValue();
        linkedListNode6.setNext(linkedListNode17);
        java.lang.Class<?> wildcardClass24 = linkedListNode17.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        java.lang.Class<?> wildcardClass29 = linkedListNode25.getClass();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        linkedListNode25.setPrevious(linkedListNode30);
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = linkedListNode36.getNext();
        linkedListNode35.setPrevious(linkedListNode36);
        java.lang.Class<?> wildcardClass39 = linkedListNode35.getClass();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        linkedListNode35.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setNext(linkedListNode46);
        linkedListNode25.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass51 = linkedListNode40.getClass();
        linkedListNode17.setNext(linkedListNode40);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        practico5node.LinkedListNode linkedListNode58 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = linkedListNode59.getNext();
        linkedListNode58.setPrevious(linkedListNode59);
        linkedListNode53.setPrevious(linkedListNode58);
        java.lang.Integer int63 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode64 = linkedListNode53.getNext();
        linkedListNode17.setNext(linkedListNode53);
        linkedListNode0.setNext(linkedListNode53);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNull(linkedListNode37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode60);
        org.junit.Assert.assertNull(int63);
        org.junit.Assert.assertNull(linkedListNode64);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = linkedListNode34.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(linkedListNode47);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        linkedListNode12.setPrevious(linkedListNode17);
        java.lang.Integer int22 = linkedListNode12.getValue();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        java.lang.Integer int28 = linkedListNode23.getValue();
        linkedListNode12.setNext(linkedListNode23);
        java.lang.Class<?> wildcardClass30 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        linkedListNode31.setPrevious(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = linkedListNode47.getNext();
        linkedListNode46.setPrevious(linkedListNode47);
        linkedListNode41.setPrevious(linkedListNode46);
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = linkedListNode52.getNext();
        linkedListNode51.setPrevious(linkedListNode52);
        linkedListNode46.setNext(linkedListNode52);
        linkedListNode31.setPrevious(linkedListNode46);
        java.lang.Class<?> wildcardClass57 = linkedListNode46.getClass();
        linkedListNode23.setNext(linkedListNode46);
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        java.lang.Integer int69 = linkedListNode59.getValue();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode23.setNext(linkedListNode59);
        linkedListNode11.setNext(linkedListNode23);
        practico5node.LinkedListNode linkedListNode73 = linkedListNode11.getPrevious();
        practico5node.LinkedListNode linkedListNode74 = linkedListNode11.getNext();
        practico5node.LinkedListNode linkedListNode75 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode76 = linkedListNode75.getNext();
        practico5node.LinkedListNode linkedListNode77 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode78 = linkedListNode77.getPrevious();
        practico5node.LinkedListNode linkedListNode79 = linkedListNode77.getNext();
        linkedListNode75.setPrevious(linkedListNode79);
        linkedListNode11.setPrevious(linkedListNode79);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode48);
        org.junit.Assert.assertNull(linkedListNode53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNotNull(linkedListNode73);
        org.junit.Assert.assertNotNull(linkedListNode74);
        org.junit.Assert.assertNull(linkedListNode76);
        org.junit.Assert.assertNull(linkedListNode78);
        org.junit.Assert.assertNull(linkedListNode79);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        java.lang.Integer int15 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        linkedListNode11.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode11.getPrevious();
        java.lang.Integer int22 = linkedListNode21.getValue();
        linkedListNode0.setNext(linkedListNode21);
        practico5node.LinkedListNode linkedListNode24 = linkedListNode21.getPrevious();
        linkedListNode21.setValue((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(linkedListNode24);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        linkedListNode12.setPrevious(linkedListNode17);
        java.lang.Integer int22 = linkedListNode12.getValue();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        java.lang.Integer int28 = linkedListNode23.getValue();
        linkedListNode12.setNext(linkedListNode23);
        java.lang.Class<?> wildcardClass30 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        linkedListNode31.setPrevious(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = linkedListNode47.getNext();
        linkedListNode46.setPrevious(linkedListNode47);
        linkedListNode41.setPrevious(linkedListNode46);
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = linkedListNode52.getNext();
        linkedListNode51.setPrevious(linkedListNode52);
        linkedListNode46.setNext(linkedListNode52);
        linkedListNode31.setPrevious(linkedListNode46);
        java.lang.Class<?> wildcardClass57 = linkedListNode46.getClass();
        linkedListNode23.setNext(linkedListNode46);
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        java.lang.Integer int69 = linkedListNode59.getValue();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode23.setNext(linkedListNode59);
        linkedListNode11.setNext(linkedListNode23);
        practico5node.LinkedListNode linkedListNode73 = linkedListNode11.getNext();
        practico5node.LinkedListNode linkedListNode74 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode75 = linkedListNode74.getNext();
        practico5node.LinkedListNode linkedListNode76 = linkedListNode74.getPrevious();
        linkedListNode73.setNext(linkedListNode74);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode48);
        org.junit.Assert.assertNull(linkedListNode53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNotNull(linkedListNode73);
        org.junit.Assert.assertNull(linkedListNode75);
        org.junit.Assert.assertNull(linkedListNode76);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode0.getPrevious();
        java.lang.Class<?> wildcardClass20 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex(10);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[100,20]" + "'", str7.equals("[100,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100,20]" + "'", str8.equals("[100,20]"));
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        practico5node.LinkedListNode linkedListNode3 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode3.setPrevious(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode10 = linkedListNode9.getNext();
        linkedListNode8.setPrevious(linkedListNode9);
        linkedListNode3.setPrevious(linkedListNode8);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode3.getPrevious();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode3.getNext();
        java.lang.Class<?> wildcardClass15 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode3.getNext();
        java.lang.Integer int17 = linkedListNode3.getValue();
        linkedListNode0.setPrevious(linkedListNode3);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode3.getNext();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode3.getPrevious();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode23 = linkedListNode22.getNext();
        linkedListNode21.setPrevious(linkedListNode22);
        java.lang.Class<?> wildcardClass25 = linkedListNode21.getClass();
        java.lang.Integer int26 = linkedListNode21.getValue();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode29 = linkedListNode28.getNext();
        linkedListNode27.setPrevious(linkedListNode28);
        java.lang.Class<?> wildcardClass31 = linkedListNode27.getClass();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode34 = linkedListNode33.getNext();
        linkedListNode32.setPrevious(linkedListNode33);
        linkedListNode27.setPrevious(linkedListNode32);
        practico5node.LinkedListNode linkedListNode37 = linkedListNode27.getPrevious();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode27.getNext();
        linkedListNode21.setPrevious(linkedListNode27);
        linkedListNode3.setNext(linkedListNode21);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(linkedListNode20);
        org.junit.Assert.assertNull(linkedListNode23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(linkedListNode29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(linkedListNode34);
        org.junit.Assert.assertNotNull(linkedListNode37);
        org.junit.Assert.assertNull(linkedListNode38);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode10.getNext();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode10.getNext();
        linkedListNode0.setNext(linkedListNode10);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode0.getPrevious();
        linkedListNode15.setValue((java.lang.Integer) 20);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode15);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        java.lang.Integer int19 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getPrevious();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode20.getPrevious();
        practico5node.LinkedListNode linkedListNode23 = linkedListNode20.getNext();
        linkedListNode0.setNext(linkedListNode23);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode14 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode15.getNext();
        linkedListNode14.setPrevious(linkedListNode15);
        java.lang.Class<?> wildcardClass18 = linkedListNode14.getClass();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode14.getPrevious();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode20.getPrevious();
        linkedListNode14.setNext(linkedListNode25);
        practico5node.LinkedListNode linkedListNode27 = linkedListNode14.getNext();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode14.getNext();
        linkedListNode13.setNext(linkedListNode14);
        linkedListNode13.setValue((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(linkedListNode19);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(linkedListNode25);
        org.junit.Assert.assertNotNull(linkedListNode27);
        org.junit.Assert.assertNotNull(linkedListNode28);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass36 = linkedListNode26.getClass();
        linkedListNode0.setPrevious(linkedListNode26);
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode50 = linkedListNode49.getNext();
        linkedListNode48.setPrevious(linkedListNode49);
        java.lang.Class<?> wildcardClass52 = linkedListNode48.getClass();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        linkedListNode48.setPrevious(linkedListNode53);
        practico5node.LinkedListNode linkedListNode58 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = linkedListNode59.getNext();
        linkedListNode58.setPrevious(linkedListNode59);
        linkedListNode53.setNext(linkedListNode59);
        linkedListNode38.setPrevious(linkedListNode53);
        practico5node.LinkedListNode linkedListNode64 = linkedListNode53.getPrevious();
        linkedListNode26.setNext(linkedListNode53);
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode68 = linkedListNode67.getNext();
        linkedListNode66.setPrevious(linkedListNode67);
        java.lang.Class<?> wildcardClass70 = linkedListNode66.getClass();
        practico5node.LinkedListNode linkedListNode71 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode72 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode73 = linkedListNode72.getNext();
        linkedListNode71.setPrevious(linkedListNode72);
        linkedListNode66.setPrevious(linkedListNode71);
        practico5node.LinkedListNode linkedListNode76 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode77 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode78 = linkedListNode77.getNext();
        linkedListNode76.setPrevious(linkedListNode77);
        java.lang.Class<?> wildcardClass80 = linkedListNode76.getClass();
        practico5node.LinkedListNode linkedListNode81 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode82 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode83 = linkedListNode82.getNext();
        linkedListNode81.setPrevious(linkedListNode82);
        linkedListNode76.setPrevious(linkedListNode81);
        practico5node.LinkedListNode linkedListNode86 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode87 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode88 = linkedListNode87.getNext();
        linkedListNode86.setPrevious(linkedListNode87);
        linkedListNode81.setNext(linkedListNode87);
        linkedListNode66.setPrevious(linkedListNode81);
        practico5node.LinkedListNode linkedListNode92 = linkedListNode66.getNext();
        linkedListNode26.setPrevious(linkedListNode66);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNull(linkedListNode50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNull(linkedListNode60);
        org.junit.Assert.assertNotNull(linkedListNode64);
        org.junit.Assert.assertNull(linkedListNode68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNull(linkedListNode73);
        org.junit.Assert.assertNull(linkedListNode78);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNull(linkedListNode83);
        org.junit.Assert.assertNull(linkedListNode88);
        org.junit.Assert.assertNull(linkedListNode92);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getNext();
        try {
            practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        try {
            java.lang.Integer int8 = nodeCachingLinkedList0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6.equals(20));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        linkedListNode12.setPrevious(linkedListNode17);
        java.lang.Integer int22 = linkedListNode12.getValue();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        java.lang.Integer int28 = linkedListNode23.getValue();
        linkedListNode12.setNext(linkedListNode23);
        java.lang.Class<?> wildcardClass30 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        linkedListNode31.setPrevious(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = linkedListNode47.getNext();
        linkedListNode46.setPrevious(linkedListNode47);
        linkedListNode41.setPrevious(linkedListNode46);
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = linkedListNode52.getNext();
        linkedListNode51.setPrevious(linkedListNode52);
        linkedListNode46.setNext(linkedListNode52);
        linkedListNode31.setPrevious(linkedListNode46);
        java.lang.Class<?> wildcardClass57 = linkedListNode46.getClass();
        linkedListNode23.setNext(linkedListNode46);
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        java.lang.Integer int69 = linkedListNode59.getValue();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode23.setNext(linkedListNode59);
        linkedListNode11.setNext(linkedListNode23);
        practico5node.LinkedListNode linkedListNode73 = linkedListNode11.getPrevious();
        practico5node.LinkedListNode linkedListNode74 = linkedListNode11.getNext();
        linkedListNode74.setValue((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode48);
        org.junit.Assert.assertNull(linkedListNode53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNotNull(linkedListNode73);
        org.junit.Assert.assertNotNull(linkedListNode74);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        linkedListNode0.setValue((java.lang.Integer) (-1));
        practico5node.LinkedListNode linkedListNode3 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode3.setPrevious(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode10 = linkedListNode9.getNext();
        linkedListNode8.setPrevious(linkedListNode9);
        linkedListNode3.setPrevious(linkedListNode8);
        practico5node.LinkedListNode linkedListNode13 = linkedListNode3.getPrevious();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode3.getNext();
        java.lang.Class<?> wildcardClass15 = linkedListNode3.getClass();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode3.getNext();
        java.lang.Integer int17 = linkedListNode3.getValue();
        linkedListNode0.setPrevious(linkedListNode3);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode3.getNext();
        try {
            practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(linkedListNode19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 1);
        try {
            java.lang.Integer int8 = nodeCachingLinkedList0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6.equals(20));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Integer int13 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass14 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        java.lang.Integer int36 = linkedListNode26.getValue();
        linkedListNode15.setNext(linkedListNode26);
        linkedListNode26.setValue((java.lang.Integer) 10);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNull(int36);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode5.getNext();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        linkedListNode7.setPrevious(linkedListNode12);
        java.lang.Integer int17 = linkedListNode7.getValue();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
        linkedListNode18.setPrevious(linkedListNode19);
        java.lang.Class<?> wildcardClass22 = linkedListNode18.getClass();
        java.lang.Integer int23 = linkedListNode18.getValue();
        linkedListNode7.setNext(linkedListNode18);
        java.lang.Class<?> wildcardClass25 = linkedListNode18.getClass();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        java.lang.Integer int37 = linkedListNode36.getValue();
        linkedListNode36.setValue((java.lang.Integer) 1);
        linkedListNode18.setNext(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        java.lang.Integer int46 = linkedListNode41.getValue();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Class<?> wildcardClass51 = linkedListNode47.getClass();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = linkedListNode53.getNext();
        linkedListNode52.setPrevious(linkedListNode53);
        linkedListNode47.setPrevious(linkedListNode52);
        practico5node.LinkedListNode linkedListNode57 = linkedListNode47.getPrevious();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode47.getNext();
        linkedListNode41.setPrevious(linkedListNode47);
        linkedListNode36.setPrevious(linkedListNode47);
        java.lang.Class<?> wildcardClass61 = linkedListNode36.getClass();
        try {
            linkedListNode6.setNext(linkedListNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(linkedListNode20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNotNull(linkedListNode57);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        java.lang.Class<?> wildcardClass11 = linkedListNode6.getClass();
        java.lang.Integer int12 = linkedListNode6.getValue();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode6.getPrevious();
        linkedListNode0.setNext(linkedListNode6);
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = linkedListNode19.getNext();
        linkedListNode15.setNext(linkedListNode19);
        java.lang.Class<?> wildcardClass22 = linkedListNode15.getClass();
        practico5node.LinkedListNode linkedListNode23 = linkedListNode15.getNext();
        linkedListNode6.setNext(linkedListNode23);
        java.lang.Integer int25 = linkedListNode23.getValue();
        java.lang.Integer int26 = linkedListNode23.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(linkedListNode13);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(linkedListNode23);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass36 = linkedListNode26.getClass();
        linkedListNode0.setPrevious(linkedListNode26);
        java.lang.Integer int38 = linkedListNode0.getValue();
        java.lang.Integer int39 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        java.lang.Integer int29 = linkedListNode19.getValue();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        java.lang.Integer int35 = linkedListNode30.getValue();
        linkedListNode19.setNext(linkedListNode30);
        java.lang.Class<?> wildcardClass37 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = linkedListNode38.getPrevious();
        java.lang.Integer int49 = linkedListNode48.getValue();
        linkedListNode48.setValue((java.lang.Integer) 1);
        linkedListNode30.setNext(linkedListNode48);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        practico5node.LinkedListNode linkedListNode69 = linkedListNode59.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode53.setPrevious(linkedListNode59);
        linkedListNode48.setPrevious(linkedListNode59);
        linkedListNode0.setNext(linkedListNode59);
        practico5node.LinkedListNode linkedListNode74 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode75 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode76 = linkedListNode75.getNext();
        linkedListNode74.setPrevious(linkedListNode75);
        practico5node.LinkedListNode linkedListNode78 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode79 = linkedListNode78.getNext();
        linkedListNode74.setNext(linkedListNode78);
        java.lang.Class<?> wildcardClass81 = linkedListNode74.getClass();
        linkedListNode0.setPrevious(linkedListNode74);
        java.lang.Integer int83 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode84 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNotNull(linkedListNode48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNotNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode76);
        org.junit.Assert.assertNull(linkedListNode79);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNull(int83);
        org.junit.Assert.assertNotNull(linkedListNode84);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        java.lang.Class<?> wildcardClass33 = linkedListNode29.getClass();
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        linkedListNode29.setPrevious(linkedListNode34);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setNext(linkedListNode40);
        linkedListNode19.setPrevious(linkedListNode34);
        java.lang.Class<?> wildcardClass45 = linkedListNode34.getClass();
        linkedListNode11.setNext(linkedListNode34);
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode49 = linkedListNode48.getNext();
        linkedListNode47.setPrevious(linkedListNode48);
        java.lang.Integer int51 = linkedListNode47.getValue();
        practico5node.LinkedListNode linkedListNode52 = linkedListNode47.getPrevious();
        linkedListNode34.setNext(linkedListNode52);
        java.lang.Class<?> wildcardClass54 = linkedListNode34.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode49);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNotNull(linkedListNode52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        java.lang.Class<?> wildcardClass6 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getNext();
        linkedListNode7.setPrevious(linkedListNode8);
        linkedListNode0.setPrevious(linkedListNode7);
        practico5node.LinkedListNode linkedListNode12 = linkedListNode0.getPrevious();
        java.lang.Integer int13 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNotNull(linkedListNode12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        linkedListNode12.setPrevious(linkedListNode17);
        java.lang.Integer int22 = linkedListNode12.getValue();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        java.lang.Integer int28 = linkedListNode23.getValue();
        linkedListNode12.setNext(linkedListNode23);
        java.lang.Class<?> wildcardClass30 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode38 = linkedListNode37.getNext();
        linkedListNode36.setPrevious(linkedListNode37);
        linkedListNode31.setPrevious(linkedListNode36);
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode43 = linkedListNode42.getNext();
        linkedListNode41.setPrevious(linkedListNode42);
        java.lang.Class<?> wildcardClass45 = linkedListNode41.getClass();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode48 = linkedListNode47.getNext();
        linkedListNode46.setPrevious(linkedListNode47);
        linkedListNode41.setPrevious(linkedListNode46);
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode53 = linkedListNode52.getNext();
        linkedListNode51.setPrevious(linkedListNode52);
        linkedListNode46.setNext(linkedListNode52);
        linkedListNode31.setPrevious(linkedListNode46);
        java.lang.Class<?> wildcardClass57 = linkedListNode46.getClass();
        linkedListNode23.setNext(linkedListNode46);
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        java.lang.Integer int69 = linkedListNode59.getValue();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode23.setNext(linkedListNode59);
        linkedListNode11.setNext(linkedListNode23);
        practico5node.LinkedListNode linkedListNode73 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode74 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode75 = linkedListNode74.getNext();
        linkedListNode73.setPrevious(linkedListNode74);
        java.lang.Integer int77 = linkedListNode73.getValue();
        practico5node.LinkedListNode linkedListNode78 = linkedListNode73.getPrevious();
        practico5node.LinkedListNode linkedListNode79 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode80 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode81 = linkedListNode80.getNext();
        linkedListNode79.setPrevious(linkedListNode80);
        java.lang.Class<?> wildcardClass83 = linkedListNode79.getClass();
        java.lang.Class<?> wildcardClass84 = linkedListNode79.getClass();
        java.lang.Integer int85 = linkedListNode79.getValue();
        practico5node.LinkedListNode linkedListNode86 = linkedListNode79.getPrevious();
        linkedListNode73.setNext(linkedListNode79);
        practico5node.LinkedListNode linkedListNode88 = linkedListNode79.getPrevious();
        linkedListNode23.setNext(linkedListNode79);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(linkedListNode48);
        org.junit.Assert.assertNull(linkedListNode53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNull(linkedListNode75);
        org.junit.Assert.assertNull(int77);
        org.junit.Assert.assertNotNull(linkedListNode78);
        org.junit.Assert.assertNull(linkedListNode81);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNull(int85);
        org.junit.Assert.assertNotNull(linkedListNode86);
        org.junit.Assert.assertNotNull(linkedListNode88);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) '4');
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex(10);
        try {
            java.lang.Integer int11 = nodeCachingLinkedList0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass7 = nodeCachingLinkedList0.getClass();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        java.lang.Integer int37 = linkedListNode36.getValue();
        linkedListNode0.setNext(linkedListNode36);
        java.lang.Integer int39 = linkedListNode0.getValue();
        linkedListNode0.setValue((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass42 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setNext(linkedListNode30);
        linkedListNode18.setPrevious(linkedListNode30);
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode37 = linkedListNode36.getNext();
        linkedListNode35.setPrevious(linkedListNode36);
        java.lang.Class<?> wildcardClass39 = linkedListNode35.getClass();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        linkedListNode35.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode45 = linkedListNode35.getPrevious();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode35.getNext();
        java.lang.Class<?> wildcardClass47 = linkedListNode35.getClass();
        linkedListNode18.setPrevious(linkedListNode35);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(linkedListNode45);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        java.lang.Integer int39 = linkedListNode34.getValue();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass44 = linkedListNode40.getClass();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setPrevious(linkedListNode45);
        practico5node.LinkedListNode linkedListNode50 = linkedListNode40.getPrevious();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode40.getNext();
        linkedListNode34.setPrevious(linkedListNode40);
        linkedListNode29.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode54 = null;
        linkedListNode40.setPrevious(linkedListNode54);
        practico5node.LinkedListNode linkedListNode56 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode57 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode58 = linkedListNode57.getNext();
        linkedListNode56.setPrevious(linkedListNode57);
        java.lang.Class<?> wildcardClass60 = linkedListNode56.getClass();
        practico5node.LinkedListNode linkedListNode61 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode62 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode63 = linkedListNode62.getNext();
        linkedListNode61.setPrevious(linkedListNode62);
        linkedListNode56.setPrevious(linkedListNode61);
        java.lang.Integer int66 = linkedListNode56.getValue();
        practico5node.LinkedListNode linkedListNode67 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode68 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode69 = linkedListNode68.getNext();
        linkedListNode67.setPrevious(linkedListNode68);
        java.lang.Class<?> wildcardClass71 = linkedListNode67.getClass();
        java.lang.Integer int72 = linkedListNode67.getValue();
        linkedListNode56.setNext(linkedListNode67);
        practico5node.LinkedListNode linkedListNode74 = linkedListNode56.getPrevious();
        practico5node.LinkedListNode linkedListNode75 = linkedListNode56.getPrevious();
        linkedListNode40.setPrevious(linkedListNode56);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode50);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode58);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNull(linkedListNode63);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNull(linkedListNode69);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNull(int72);
        org.junit.Assert.assertNotNull(linkedListNode74);
        org.junit.Assert.assertNotNull(linkedListNode75);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        java.lang.Integer int11 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1,20]" + "'", str9.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Class<?> wildcardClass5 = linkedListNode0.getClass();
        java.lang.Integer int6 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode0.getPrevious();
        java.lang.Class<?> wildcardClass8 = linkedListNode0.getClass();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode0.getNext();
        linkedListNode0.setValue((java.lang.Integer) 100);
        practico5node.LinkedListNode linkedListNode14 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        java.lang.Integer int39 = linkedListNode34.getValue();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass44 = linkedListNode40.getClass();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setPrevious(linkedListNode45);
        practico5node.LinkedListNode linkedListNode50 = linkedListNode40.getPrevious();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode40.getNext();
        linkedListNode34.setPrevious(linkedListNode40);
        linkedListNode29.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        linkedListNode54.setPrevious(linkedListNode59);
        practico5node.LinkedListNode linkedListNode64 = linkedListNode54.getPrevious();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        java.lang.Integer int69 = linkedListNode65.getValue();
        linkedListNode54.setNext(linkedListNode65);
        linkedListNode29.setPrevious(linkedListNode54);
        practico5node.LinkedListNode linkedListNode72 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode73 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode74 = linkedListNode73.getNext();
        linkedListNode72.setPrevious(linkedListNode73);
        practico5node.LinkedListNode linkedListNode76 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode77 = linkedListNode76.getNext();
        linkedListNode72.setNext(linkedListNode76);
        practico5node.LinkedListNode linkedListNode79 = linkedListNode72.getPrevious();
        linkedListNode29.setPrevious(linkedListNode79);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode50);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(linkedListNode64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode74);
        org.junit.Assert.assertNull(linkedListNode77);
        org.junit.Assert.assertNotNull(linkedListNode79);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = linkedListNode0.getNext();
        try {
            practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getPrevious();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode26);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Class<?> wildcardClass7 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode9 = linkedListNode8.getPrevious();
        java.lang.Integer int10 = linkedListNode8.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(linkedListNode8);
        org.junit.Assert.assertNull(linkedListNode9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int13 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.Integer int15 = nodeCachingLinkedList0.get(0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15.equals(20));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) '4');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex(0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10.equals((-1)));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = linkedListNode26.getNext();
        linkedListNode25.setPrevious(linkedListNode26);
        linkedListNode20.setPrevious(linkedListNode25);
        java.lang.Integer int30 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        java.lang.Class<?> wildcardClass35 = linkedListNode31.getClass();
        java.lang.Integer int36 = linkedListNode31.getValue();
        linkedListNode20.setNext(linkedListNode31);
        practico5node.LinkedListNode linkedListNode38 = linkedListNode20.getPrevious();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        practico5node.LinkedListNode linkedListNode49 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode50 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode50.getNext();
        linkedListNode49.setPrevious(linkedListNode50);
        linkedListNode44.setNext(linkedListNode50);
        linkedListNode38.setPrevious(linkedListNode50);
        linkedListNode0.setNext(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(linkedListNode27);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(linkedListNode38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(linkedListNode51);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass10 = linkedListNode0.getClass();
        java.lang.Integer int11 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode18 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        java.lang.Class<?> wildcardClass24 = linkedListNode20.getClass();
        java.lang.Integer int25 = linkedListNode20.getValue();
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        practico5node.LinkedListNode linkedListNode37 = linkedListNode26.getNext();
        linkedListNode20.setPrevious(linkedListNode26);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        java.lang.Integer int49 = linkedListNode39.getValue();
        practico5node.LinkedListNode linkedListNode50 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = linkedListNode51.getNext();
        linkedListNode50.setPrevious(linkedListNode51);
        java.lang.Class<?> wildcardClass54 = linkedListNode50.getClass();
        java.lang.Integer int55 = linkedListNode50.getValue();
        linkedListNode39.setNext(linkedListNode50);
        java.lang.Class<?> wildcardClass57 = linkedListNode50.getClass();
        practico5node.LinkedListNode linkedListNode58 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = linkedListNode59.getNext();
        linkedListNode58.setPrevious(linkedListNode59);
        java.lang.Class<?> wildcardClass62 = linkedListNode58.getClass();
        practico5node.LinkedListNode linkedListNode63 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = linkedListNode64.getNext();
        linkedListNode63.setPrevious(linkedListNode64);
        linkedListNode58.setPrevious(linkedListNode63);
        practico5node.LinkedListNode linkedListNode68 = linkedListNode58.getPrevious();
        java.lang.Integer int69 = linkedListNode68.getValue();
        linkedListNode68.setValue((java.lang.Integer) 1);
        linkedListNode50.setNext(linkedListNode68);
        practico5node.LinkedListNode linkedListNode73 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode74 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode75 = linkedListNode74.getNext();
        linkedListNode73.setPrevious(linkedListNode74);
        java.lang.Class<?> wildcardClass77 = linkedListNode73.getClass();
        java.lang.Integer int78 = linkedListNode73.getValue();
        practico5node.LinkedListNode linkedListNode79 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode80 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode81 = linkedListNode80.getNext();
        linkedListNode79.setPrevious(linkedListNode80);
        java.lang.Class<?> wildcardClass83 = linkedListNode79.getClass();
        practico5node.LinkedListNode linkedListNode84 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode85 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode86 = linkedListNode85.getNext();
        linkedListNode84.setPrevious(linkedListNode85);
        linkedListNode79.setPrevious(linkedListNode84);
        practico5node.LinkedListNode linkedListNode89 = linkedListNode79.getPrevious();
        practico5node.LinkedListNode linkedListNode90 = linkedListNode79.getNext();
        linkedListNode73.setPrevious(linkedListNode79);
        linkedListNode68.setPrevious(linkedListNode79);
        linkedListNode20.setNext(linkedListNode79);
        linkedListNode19.setNext(linkedListNode20);
        practico5node.LinkedListNode linkedListNode95 = linkedListNode19.getPrevious();
        linkedListNode18.setPrevious(linkedListNode95);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(linkedListNode18);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(linkedListNode37);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(linkedListNode60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(linkedListNode65);
        org.junit.Assert.assertNotNull(linkedListNode68);
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(linkedListNode75);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(int78);
        org.junit.Assert.assertNull(linkedListNode81);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNull(linkedListNode86);
        org.junit.Assert.assertNotNull(linkedListNode89);
        org.junit.Assert.assertNull(linkedListNode90);
        org.junit.Assert.assertNull(linkedListNode95);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Integer int4 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode0.getPrevious();
        linkedListNode0.setValue((java.lang.Integer) 0);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(linkedListNode5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0,100]" + "'", str7.equals("[0,100]"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode4 = linkedListNode0.getPrevious();
        linkedListNode0.setValue((java.lang.Integer) 10);
        org.junit.Assert.assertNull(linkedListNode1);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNull(linkedListNode4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex(100);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode3 = linkedListNode2.getNext();
        linkedListNode1.setPrevious(linkedListNode2);
        java.lang.Class<?> wildcardClass5 = linkedListNode1.getClass();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        linkedListNode1.setPrevious(linkedListNode6);
        java.lang.Integer int11 = linkedListNode1.getValue();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode14 = linkedListNode13.getNext();
        linkedListNode12.setPrevious(linkedListNode13);
        java.lang.Class<?> wildcardClass16 = linkedListNode12.getClass();
        java.lang.Integer int17 = linkedListNode12.getValue();
        linkedListNode1.setNext(linkedListNode12);
        practico5node.LinkedListNode linkedListNode19 = linkedListNode1.getPrevious();
        linkedListNode0.setPrevious(linkedListNode19);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode19.getPrevious();
        org.junit.Assert.assertNull(linkedListNode3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(linkedListNode14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(linkedListNode19);
        org.junit.Assert.assertNotNull(linkedListNode21);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8.equals(20));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int13 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str14 = nodeCachingLinkedList0.toString();
        java.lang.Integer int16 = nodeCachingLinkedList0.removeIndex(20);
        java.lang.Integer int18 = nodeCachingLinkedList0.removeIndex((int) (byte) 0);
        java.lang.String str19 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[20]" + "'", str14.equals("[20]"));
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18.equals(20));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[]" + "'", str19.equals("[]"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Integer int7 = linkedListNode0.getValue();
        java.lang.Integer int8 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int13 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str14 = nodeCachingLinkedList0.toString();
        java.lang.Integer int16 = nodeCachingLinkedList0.removeIndex(20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.String str19 = nodeCachingLinkedList0.toString();
        java.lang.Class<?> wildcardClass20 = nodeCachingLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[20]" + "'", str14.equals("[20]"));
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[10,20]" + "'", str19.equals("[10,20]"));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.String str8 = nodeCachingLinkedList0.toString();
        java.lang.String str9 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1,20]" + "'", str8.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1,20]" + "'", str9.equals("[-1,20]"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        java.lang.Integer int39 = linkedListNode34.getValue();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass44 = linkedListNode40.getClass();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setPrevious(linkedListNode45);
        practico5node.LinkedListNode linkedListNode50 = linkedListNode40.getPrevious();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode40.getNext();
        linkedListNode34.setPrevious(linkedListNode40);
        linkedListNode29.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode54 = linkedListNode29.getNext();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode29.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode50);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode54);
        org.junit.Assert.assertNull(linkedListNode55);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        java.lang.Integer int10 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        java.lang.Integer int16 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        java.lang.Class<?> wildcardClass18 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        practico5node.LinkedListNode linkedListNode29 = linkedListNode19.getPrevious();
        java.lang.Integer int30 = linkedListNode29.getValue();
        linkedListNode29.setValue((java.lang.Integer) 1);
        linkedListNode11.setNext(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        java.lang.Integer int39 = linkedListNode34.getValue();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode42 = linkedListNode41.getNext();
        linkedListNode40.setPrevious(linkedListNode41);
        java.lang.Class<?> wildcardClass44 = linkedListNode40.getClass();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode47 = linkedListNode46.getNext();
        linkedListNode45.setPrevious(linkedListNode46);
        linkedListNode40.setPrevious(linkedListNode45);
        practico5node.LinkedListNode linkedListNode50 = linkedListNode40.getPrevious();
        practico5node.LinkedListNode linkedListNode51 = linkedListNode40.getNext();
        linkedListNode34.setPrevious(linkedListNode40);
        linkedListNode29.setPrevious(linkedListNode40);
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = linkedListNode55.getNext();
        linkedListNode54.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass58 = linkedListNode54.getClass();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        linkedListNode54.setPrevious(linkedListNode59);
        practico5node.LinkedListNode linkedListNode64 = linkedListNode54.getPrevious();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode67 = linkedListNode66.getNext();
        linkedListNode65.setPrevious(linkedListNode66);
        java.lang.Integer int69 = linkedListNode65.getValue();
        linkedListNode54.setNext(linkedListNode65);
        linkedListNode29.setPrevious(linkedListNode54);
        linkedListNode54.setValue((java.lang.Integer) 10);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(linkedListNode29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNull(linkedListNode42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(linkedListNode47);
        org.junit.Assert.assertNotNull(linkedListNode50);
        org.junit.Assert.assertNull(linkedListNode51);
        org.junit.Assert.assertNull(linkedListNode56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(linkedListNode64);
        org.junit.Assert.assertNull(linkedListNode67);
        org.junit.Assert.assertNull(int69);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = linkedListNode4.getNext();
        linkedListNode0.setNext(linkedListNode4);
        java.lang.Integer int7 = linkedListNode4.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode5);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex(1);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8.equals(20));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Class<?> wildcardClass15 = linkedListNode11.getClass();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = linkedListNode17.getNext();
        linkedListNode16.setPrevious(linkedListNode17);
        linkedListNode11.setPrevious(linkedListNode16);
        practico5node.LinkedListNode linkedListNode21 = linkedListNode11.getPrevious();
        java.lang.Integer int22 = linkedListNode21.getValue();
        linkedListNode0.setNext(linkedListNode21);
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        java.lang.Class<?> wildcardClass28 = linkedListNode24.getClass();
        practico5node.LinkedListNode linkedListNode29 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = linkedListNode30.getNext();
        linkedListNode29.setPrevious(linkedListNode30);
        linkedListNode24.setPrevious(linkedListNode29);
        practico5node.LinkedListNode linkedListNode34 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode35 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode36 = linkedListNode35.getNext();
        linkedListNode34.setPrevious(linkedListNode35);
        java.lang.Class<?> wildcardClass38 = linkedListNode34.getClass();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        linkedListNode34.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setNext(linkedListNode45);
        linkedListNode24.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode50 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode51 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode52 = linkedListNode51.getNext();
        linkedListNode50.setPrevious(linkedListNode51);
        java.lang.Class<?> wildcardClass54 = linkedListNode50.getClass();
        practico5node.LinkedListNode linkedListNode55 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode56 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode57 = linkedListNode56.getNext();
        linkedListNode55.setPrevious(linkedListNode56);
        linkedListNode50.setPrevious(linkedListNode55);
        java.lang.Class<?> wildcardClass60 = linkedListNode50.getClass();
        linkedListNode24.setPrevious(linkedListNode50);
        linkedListNode21.setNext(linkedListNode24);
        practico5node.LinkedListNode linkedListNode63 = linkedListNode24.getPrevious();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        java.lang.Integer int68 = linkedListNode64.getValue();
        java.lang.Integer int69 = linkedListNode64.getValue();
        linkedListNode24.setPrevious(linkedListNode64);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(linkedListNode18);
        org.junit.Assert.assertNotNull(linkedListNode21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(linkedListNode31);
        org.junit.Assert.assertNull(linkedListNode36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(linkedListNode52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(linkedListNode57);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(linkedListNode63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNull(int68);
        org.junit.Assert.assertNull(int69);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int13 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str14 = nodeCachingLinkedList0.toString();
        java.lang.Integer int16 = nodeCachingLinkedList0.removeIndex(20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 10);
        java.lang.Integer int20 = nodeCachingLinkedList0.removeIndex((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[20]" + "'", str14.equals("[20]"));
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int20);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode0.getNext();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode0.getNext();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode6);
        org.junit.Assert.assertNull(linkedListNode7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        java.lang.Integer int5 = linkedListNode0.getValue();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode8 = linkedListNode7.getNext();
        linkedListNode6.setPrevious(linkedListNode7);
        java.lang.Class<?> wildcardClass10 = linkedListNode6.getClass();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        linkedListNode6.setPrevious(linkedListNode11);
        practico5node.LinkedListNode linkedListNode16 = linkedListNode6.getPrevious();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode6.getNext();
        linkedListNode0.setPrevious(linkedListNode6);
        practico5node.LinkedListNode linkedListNode19 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode20.getNext();
        linkedListNode19.setPrevious(linkedListNode20);
        java.lang.Class<?> wildcardClass23 = linkedListNode19.getClass();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode26 = linkedListNode25.getNext();
        linkedListNode24.setPrevious(linkedListNode25);
        linkedListNode19.setPrevious(linkedListNode24);
        java.lang.Integer int29 = linkedListNode19.getValue();
        practico5node.LinkedListNode linkedListNode30 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = linkedListNode31.getNext();
        linkedListNode30.setPrevious(linkedListNode31);
        java.lang.Class<?> wildcardClass34 = linkedListNode30.getClass();
        java.lang.Integer int35 = linkedListNode30.getValue();
        linkedListNode19.setNext(linkedListNode30);
        java.lang.Class<?> wildcardClass37 = linkedListNode30.getClass();
        practico5node.LinkedListNode linkedListNode38 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = linkedListNode39.getNext();
        linkedListNode38.setPrevious(linkedListNode39);
        java.lang.Class<?> wildcardClass42 = linkedListNode38.getClass();
        practico5node.LinkedListNode linkedListNode43 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = linkedListNode44.getNext();
        linkedListNode43.setPrevious(linkedListNode44);
        linkedListNode38.setPrevious(linkedListNode43);
        practico5node.LinkedListNode linkedListNode48 = linkedListNode38.getPrevious();
        java.lang.Integer int49 = linkedListNode48.getValue();
        linkedListNode48.setValue((java.lang.Integer) 1);
        linkedListNode30.setNext(linkedListNode48);
        practico5node.LinkedListNode linkedListNode53 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode54 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode55 = linkedListNode54.getNext();
        linkedListNode53.setPrevious(linkedListNode54);
        java.lang.Class<?> wildcardClass57 = linkedListNode53.getClass();
        java.lang.Integer int58 = linkedListNode53.getValue();
        practico5node.LinkedListNode linkedListNode59 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode60 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode61 = linkedListNode60.getNext();
        linkedListNode59.setPrevious(linkedListNode60);
        java.lang.Class<?> wildcardClass63 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode64 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode65 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode66 = linkedListNode65.getNext();
        linkedListNode64.setPrevious(linkedListNode65);
        linkedListNode59.setPrevious(linkedListNode64);
        practico5node.LinkedListNode linkedListNode69 = linkedListNode59.getPrevious();
        practico5node.LinkedListNode linkedListNode70 = linkedListNode59.getNext();
        linkedListNode53.setPrevious(linkedListNode59);
        linkedListNode48.setPrevious(linkedListNode59);
        linkedListNode0.setNext(linkedListNode59);
        java.lang.Class<?> wildcardClass74 = linkedListNode59.getClass();
        practico5node.LinkedListNode linkedListNode75 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode76 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode77 = linkedListNode76.getNext();
        linkedListNode75.setPrevious(linkedListNode76);
        practico5node.LinkedListNode linkedListNode79 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode80 = linkedListNode79.getNext();
        linkedListNode75.setNext(linkedListNode79);
        java.lang.Class<?> wildcardClass82 = linkedListNode79.getClass();
        linkedListNode59.setPrevious(linkedListNode79);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(linkedListNode8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(linkedListNode26);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(linkedListNode32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(linkedListNode40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(linkedListNode45);
        org.junit.Assert.assertNotNull(linkedListNode48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(linkedListNode55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(linkedListNode61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(linkedListNode66);
        org.junit.Assert.assertNotNull(linkedListNode69);
        org.junit.Assert.assertNull(linkedListNode70);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNull(linkedListNode77);
        org.junit.Assert.assertNull(linkedListNode80);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode12.getNext();
        linkedListNode11.setPrevious(linkedListNode12);
        java.lang.Integer int15 = linkedListNode11.getValue();
        linkedListNode0.setNext(linkedListNode11);
        practico5node.LinkedListNode linkedListNode17 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode18 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode19 = linkedListNode18.getNext();
        linkedListNode17.setPrevious(linkedListNode18);
        java.lang.Class<?> wildcardClass21 = linkedListNode17.getClass();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode17.getPrevious();
        practico5node.LinkedListNode linkedListNode23 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode24 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode25 = linkedListNode24.getNext();
        linkedListNode23.setPrevious(linkedListNode24);
        java.lang.Class<?> wildcardClass27 = linkedListNode23.getClass();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode23.getPrevious();
        linkedListNode17.setNext(linkedListNode28);
        linkedListNode0.setNext(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNotNull(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(linkedListNode19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(linkedListNode28);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode21 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode22 = linkedListNode21.getNext();
        linkedListNode20.setPrevious(linkedListNode21);
        linkedListNode15.setNext(linkedListNode21);
        linkedListNode0.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode26 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode27 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode28 = linkedListNode27.getNext();
        linkedListNode26.setPrevious(linkedListNode27);
        java.lang.Class<?> wildcardClass30 = linkedListNode26.getClass();
        practico5node.LinkedListNode linkedListNode31 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode32 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode33 = linkedListNode32.getNext();
        linkedListNode31.setPrevious(linkedListNode32);
        linkedListNode26.setPrevious(linkedListNode31);
        practico5node.LinkedListNode linkedListNode36 = linkedListNode26.getPrevious();
        java.lang.Integer int37 = linkedListNode36.getValue();
        linkedListNode0.setNext(linkedListNode36);
        practico5node.LinkedListNode linkedListNode39 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode40 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode41 = linkedListNode40.getNext();
        linkedListNode39.setPrevious(linkedListNode40);
        java.lang.Class<?> wildcardClass43 = linkedListNode39.getClass();
        practico5node.LinkedListNode linkedListNode44 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode45 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode46 = linkedListNode45.getNext();
        linkedListNode44.setPrevious(linkedListNode45);
        linkedListNode39.setPrevious(linkedListNode44);
        java.lang.Integer int49 = linkedListNode39.getValue();
        linkedListNode0.setPrevious(linkedListNode39);
        practico5node.LinkedListNode linkedListNode51 = linkedListNode0.getPrevious();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNull(linkedListNode22);
        org.junit.Assert.assertNull(linkedListNode28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(linkedListNode33);
        org.junit.Assert.assertNotNull(linkedListNode36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNull(linkedListNode41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(linkedListNode46);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNotNull(linkedListNode51);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex(100);
        java.lang.Integer int12 = nodeCachingLinkedList0.removeIndex((int) 'a');
        java.lang.Integer int14 = nodeCachingLinkedList0.removeIndex((int) '#');
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Class<?> wildcardClass1 = nodeCachingLinkedList0.getClass();
        try {
            java.lang.Integer int3 = nodeCachingLinkedList0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        java.lang.Integer int2 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str3 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]" + "'", str3.equals("[]"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        practico5node.LinkedListNode linkedListNode4 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = linkedListNode5.getNext();
        linkedListNode4.setPrevious(linkedListNode5);
        java.lang.Class<?> wildcardClass8 = linkedListNode4.getClass();
        java.lang.Integer int9 = linkedListNode4.getValue();
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode11.getNext();
        linkedListNode10.setPrevious(linkedListNode11);
        java.lang.Class<?> wildcardClass14 = linkedListNode10.getClass();
        practico5node.LinkedListNode linkedListNode15 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode16 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode17 = linkedListNode16.getNext();
        linkedListNode15.setPrevious(linkedListNode16);
        linkedListNode10.setPrevious(linkedListNode15);
        practico5node.LinkedListNode linkedListNode20 = linkedListNode10.getPrevious();
        practico5node.LinkedListNode linkedListNode21 = linkedListNode10.getNext();
        linkedListNode4.setPrevious(linkedListNode10);
        java.lang.Integer int23 = linkedListNode10.getValue();
        linkedListNode0.setNext(linkedListNode10);
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNull(linkedListNode6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(linkedListNode17);
        org.junit.Assert.assertNotNull(linkedListNode20);
        org.junit.Assert.assertNull(linkedListNode21);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        java.lang.String str5 = nodeCachingLinkedList0.toString();
        java.lang.String str6 = nodeCachingLinkedList0.toString();
        java.lang.String str7 = nodeCachingLinkedList0.toString();
        java.lang.Integer int9 = nodeCachingLinkedList0.removeIndex((int) (byte) -1);
        java.lang.Integer int11 = nodeCachingLinkedList0.get(0);
        java.lang.Integer int13 = nodeCachingLinkedList0.removeIndex((int) (short) 0);
        java.lang.String str14 = nodeCachingLinkedList0.toString();
        java.lang.String str15 = nodeCachingLinkedList0.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1,20]" + "'", str5.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[-1,20]" + "'", str6.equals("[-1,20]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1,20]" + "'", str7.equals("[-1,20]"));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11.equals((-1)));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13.equals((-1)));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[20]" + "'", str14.equals("[20]"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[20]" + "'", str15.equals("[20]"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) (-1));
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 0);
        java.lang.Integer int10 = nodeCachingLinkedList0.removeIndex((int) '#');
        try {
            java.lang.Integer int12 = nodeCachingLinkedList0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        practico5node.NodeCachingLinkedList nodeCachingLinkedList0 = new practico5node.NodeCachingLinkedList();
        nodeCachingLinkedList0.addFirst((java.lang.Integer) 20);
        java.lang.Integer int4 = nodeCachingLinkedList0.removeIndex(1);
        java.lang.Integer int6 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        java.lang.Integer int8 = nodeCachingLinkedList0.removeIndex((int) (short) 10);
        try {
            java.lang.Integer int10 = nodeCachingLinkedList0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid index");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        practico5node.LinkedListNode linkedListNode0 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode1 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode2 = linkedListNode1.getNext();
        linkedListNode0.setPrevious(linkedListNode1);
        java.lang.Class<?> wildcardClass4 = linkedListNode0.getClass();
        practico5node.LinkedListNode linkedListNode5 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode6 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode7 = linkedListNode6.getNext();
        linkedListNode5.setPrevious(linkedListNode6);
        linkedListNode0.setPrevious(linkedListNode5);
        practico5node.LinkedListNode linkedListNode10 = new practico5node.LinkedListNode();
        practico5node.LinkedListNode linkedListNode11 = linkedListNode10.getPrevious();
        practico5node.LinkedListNode linkedListNode12 = linkedListNode10.getNext();
        practico5node.LinkedListNode linkedListNode13 = linkedListNode10.getNext();
        linkedListNode0.setNext(linkedListNode10);
        practico5node.LinkedListNode linkedListNode15 = linkedListNode0.getPrevious();
        practico5node.LinkedListNode linkedListNode16 = linkedListNode0.getNext();
        java.lang.Integer int17 = linkedListNode0.getValue();
        org.junit.Assert.assertNull(linkedListNode2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(linkedListNode7);
        org.junit.Assert.assertNull(linkedListNode11);
        org.junit.Assert.assertNull(linkedListNode12);
        org.junit.Assert.assertNull(linkedListNode13);
        org.junit.Assert.assertNotNull(linkedListNode15);
        org.junit.Assert.assertNotNull(linkedListNode16);
        org.junit.Assert.assertNull(int17);
    }
}

