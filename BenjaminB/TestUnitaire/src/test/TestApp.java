package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


import main.*;
class TestApp {
	@Test
	void testSquare() {
		
		assertEquals(16, Main.Square(4));
		assertEquals(16, Main.Square(-4));
		assertEquals(0, Main.Square(0));
		assertEquals(64, Main.Cube(4));
		assertEquals(-64, Main.Cube(-4));
		assertEquals(0, Main.Cube(0));
		assertEquals("kayak", Main.Palindrome("kayak"));
		assertEquals("kayak", Main.Palindrome("kayak"));
	}

	@Test
	void testcheckIfPair() {
		assertEquals(false, SuiteTU.checkIfPair(1));
		assertEquals(true, SuiteTU.checkIfPair(2));
	}@Test
	void testcheckIfPairPairImpair() {
		assertEquals(true, SuiteTU.checkIfPairPairImpair(2, 4, 7));
		assertEquals(false, SuiteTU.checkIfPairPairImpair(1, 2, 3));
	}@Test
	void testcheckIfSumPair() {
		assertEquals(true, SuiteTU.checkIfSumIsPair(2, 4, 6));
		assertEquals(false, SuiteTU.checkIfSumIsPair(1, 1, 1));
		assertEquals(true, SuiteTU.checkIfSumIsPair(0, 0, 0));
	}@Test
	void testcheckIfAllElementsPair() {
		int tab1[]= {2,4,6,8};
		int tab2[]= {1,3,5,7};
		int tab3[]= {0,0,0,0};
		assertEquals(true, SuiteTU.checkIfAllElementsPair(tab1));
		assertEquals(false, SuiteTU.checkIfAllElementsPair(tab2));
		assertEquals(true, SuiteTU.checkIfAllElementsPair(tab3));
		}@Test
		void testcheckIfAllElementUniquePair() {
			ArrayList<Integer>  tab4 = new ArrayList<Integer>(); 
			ArrayList<Integer>  emptyTab = new ArrayList<Integer>(); 
		tab4.add(2);
		tab4.add(4);
		tab4.add(6);
		tab4.add(8);
		int tab5[]= {1,3,5,7};
		int tab6[]= {0,0,0,0};
		int tab7[]= {4,4,4,4};
		int testTab[]= {1,2,3,4,5,6,7,8,9};
		assertEquals(tab4, SuiteTU.exportAllElementsPair(testTab));
		assertEquals(emptyTab, SuiteTU.exportAllElementsPair(tab5));
		}/*@Test
		void testcheckSiTuPeuxAcheter() {
		assertEquals("essaie basique",true, SuiteTU.checkSiTuPeuxAcheter(18));
		assertEquals("essaie null",true, SuiteTU.checkSiTuPeuxAcheter(22));
		assertEquals("essaye faux",false, SuiteTU.checkSiTuPeuxAcheter(46));
		}*/@Test
		void testcheckCase1() {
		assertEquals(true, SuiteTU.checkCase1(120,50));
		assertEquals(false, SuiteTU.checkCase1(99999,1));
		assertEquals(true, SuiteTU.checkCase1(0,0));
		}@Test
		void testcheckCase2() {
		assertEquals(true, SuiteTU.checkCase2(7,7));
		assertEquals(false, SuiteTU.checkCase2(1,1));
		assertEquals(true, SuiteTU.checkCase2(0,0));
		}@Test
		void testcheckCase2a() {
		assertEquals(true, SuiteTU.checkCase2a(7,0));
		assertEquals(false, SuiteTU.checkCase2a(1,1));
		assertEquals(true, SuiteTU.checkCase2a(0,0));
		}@Test
		void testcheckCase3() {
		assertEquals(true, SuiteTU.checkCase3(1,2,3));
		assertEquals(false, SuiteTU.checkCase3(4,7,1));
		assertEquals(true, SuiteTU.checkCase3(3,2,1));
		}@Test
		void test() {
			assertEquals("1", SuiteTU.game(1));
			assertEquals(" [ Fizz Buzz ] ", SuiteTU.game(15));
			assertEquals(" [ Fizz ] ", SuiteTU.game(3));
			assertEquals(" [ Buzz ] ", SuiteTU.game(5));
			assertEquals(" ERROR ", SuiteTU.game(0));
			assertEquals(" ERROR ", SuiteTU.game(-1));
			assertEquals("8", SuiteTU.game(8));
			assertEquals("1", SuiteTU.game(1));
		}

	}

