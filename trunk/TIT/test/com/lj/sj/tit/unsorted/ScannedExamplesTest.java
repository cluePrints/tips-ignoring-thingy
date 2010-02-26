package com.lj.sj.tit.unsorted;

import java.awt.Image;
import java.math.BigDecimal;

import org.junit.Test;

import junit.framework.Assert;

public class ScannedExamplesTest {
	@Test
	public void test()
	{
		BillParser p = new BillParser();
		testImage(p, "bill1", "37.54");
		testImage(p, "bill2", "73.88");
		// testImage(p, "bill3", "232.66");
		// testImage(p, "bill4", "18.07");
		testImage(p, "bill5", "47.82");
		testImage(p, "bill6", "11.50");
		testImage(p, "bill7", "108.00");
		
	}
	private void testImage(BillParser parser, String name, String expectedResult)
	{
		Image image = loadTestImage(name);
		BillData data = parser.parse(image);
		Assert.assertEquals("Wrong bill total amount recognized for file "+name+"",
				new BigDecimal(expectedResult),
				data.getTotal());
	}
	
	private Image loadTestImage(String name)
	{
		return null;
	}
}
