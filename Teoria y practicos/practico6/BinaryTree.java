package practico6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import korat.finitization.IClassDomain;
import korat.finitization.IFinitization;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

public class BinaryTree {

    public Entry root;
    public int size;
           
    public boolean repOK() {
    	if (root == null)
            return size == 0;
        /* checks that tree has no cycle*/
        Set visited = new HashSet();
        visited.add(root);
        LinkedList workList = new LinkedList();
        workList.add(root); 
        while (!workList.isEmpty()) {
            Entry current = (Entry) workList.removeFirst();
            if (current.left != null) {
                if (!visited.add(current.left))
                    return false;
                workList.add(current.left);
            }
            if (current.right != null) {
                if (!visited.add(current.right))
                    return false;
                workList.add(current.right);
            }
        }
        /* checks that size is consistent*/
        return (visited.size() == size);
    }

  
    
     public static IFinitization finBinaryTree(int nodesNum, int minSize,
             int maxSize, int numKeys) {
         IFinitization f = FinitizationFactory.create(BinaryTree.class);
         IObjSet nodes = f.createObjSet(Entry.class, nodesNum, true);
         IObjSet keys = f.createObjSet(Integer.class);
         IClassDomain elemsClassDomain = f.createClassDomain(Integer.class);
         for (int i = 1; i <= numKeys; i++)
             elemsClassDomain.addObject(new Integer(i));
         keys.addClassDomain(elemsClassDomain);
         keys.setNullAllowed(false);
         elemsClassDomain.includeInIsomorphismCheck(false);

         
         
         f.set("root", nodes);
         f.set("size", f.createIntSet(minSize, maxSize));
         f.set("Node.info",keys);
         f.set("Node.left", nodes);
         f.set("Node.right", nodes);
         return f;
     }
}

