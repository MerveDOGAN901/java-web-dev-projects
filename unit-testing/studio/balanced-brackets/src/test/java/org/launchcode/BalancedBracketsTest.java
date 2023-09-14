package org.launchcode;

import launchcode.BalancedBrackets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets turns true.";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"),message);
    }
    @Test
    public void singleBracketBeforeOtherCharacters(){
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result,message);
    }

   /* @Test
    public void testEmptyString() {

        assertTrue(launchcode.BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testStringWithNoBrackets () {
        assertTrue(launchcode.BalancedBrackets.hasBalancedBrackets("Hello no brackets"));
    }

    @Test
    public void strOutsideBracketsReturnsTrue() {
    assertTrue(launchcode.BalancedBrackets.hasBalancedBrackets("[]str"))}

    @Test
    public void testBalancedBrackets1() {
        assertTrue(launchcode.BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void singleRightBracketReturnsFalse() {
        assertFalse(launchcode.BalancedBrackets.hasBalancedBrackets("]"));
    }
*/
    @Test
    public void singleLeftBracketReturnsFalse() {
        assertFalse(launchcode.BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testUnbalancedBrackets4() {
        assertFalse(launchcode.BalancedBrackets.hasBalancedBrackets("]["));
    }
/*
    @Test
    public void testUnbalancedBrackets3() {
        assertFalse(launchcode.BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testUnopenedBrackets() {
        assertFalse(launchcode.BalancedBrackets.hasBalancedBrackets("Launch]"));
    }

    @Test
    public void testCrazyBrackets() {
        assertFalse(launchcode.BalancedBrackets.hasBalancedBrackets("]]]]][[]]["));
    }

    @Test
    public void balancedBracketsInbetweenCharsReturnsTrue() {
        assertTrue(launchcode.BalancedBrackets.hasBalancedBrackets("[st]r"));
    }*/


}