package test;
import junit.framework.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testeUnitaire.Calculation;
import testeUnitaire.Logic;

public class JUnitTest extends TestCase {


	
	@Test
	public final void testSquare() throws Exception{
		//System.out.print(assertEquals(16.0, Calculation.Square(4)));
		assertEquals(16, Calculation.Square(4));
	}
	@Test
	public final void testCube() throws Exception{
		assertEquals(64, Calculation.Cube(4));
	
	}
	
	@Test
	public final void testReverse() throws Exception{
		assertEquals("ih", Logic.ReverseWord("hi"));
	
	}
	


	
}
