package net.virgapps.formation.java.tri;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TP1Test {
    private int[] tableau;
    
    @Before
    public void init() {
        tableau = TableauUtil.creerTableauRandom(10, 100);
        System.out.println(Arrays.toString(tableau));
    }
    
    /*@Test
    public void testMaxLin() {
        int max = TableauUtil.maxLin(tableau);
        assertTrue(max == 7);
    }*/
    
    @Test
    public void testTriSelection() {
    	int[] tableauTrie = TableauUtil.triSelection(tableau);
    	Arrays.sort(tableau);
    	System.out.println(Arrays.toString(tableau));
    	System.out.println(Arrays.toString(tableauTrie));
    	assertTrue(Arrays.equals(tableauTrie, tableau));
    }
    
    @Test
    public void testTriFusion() {
    	int[] tableauTrie = TableauUtil.triFusion(tableau);
    	Arrays.sort(tableau);
    	System.out.println(Arrays.toString(tableau));
    	System.out.println(Arrays.toString(tableauTrie));
    	assertTrue(Arrays.equals(tableauTrie, tableau));
    }
}
