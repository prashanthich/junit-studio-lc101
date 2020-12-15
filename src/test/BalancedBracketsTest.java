package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Unit Testing]"));
    }

    @Test
    public void stringInsideAndOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Unit] Testing"));
    }

    @Test
    public void anEmptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void aStringContainEmptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Unit Testing"));
    }

    @Test
    public void aStringWithMultipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Testing:[Manual,Automation]"));
    }

    @Test
    public void bracketsInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Test1], Test2]"));
    }

    @Test
    public void aStringWithNoClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[Test"));
    }

    @Test
    public void anInvalidOpenBracketsInStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Test["));
    }

    @Test
    public void anInvalidClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]T["));
    }

    @Test
    public void multipleBracketsNoProperClosingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Test]"));
    }

    @Test
    public void specialCharactersInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[@&]"));
    }

    @Test
    public void multipleBracketsButNotProperlyArrangedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]T1]]T2[[T3[[T4"));
    }

}
