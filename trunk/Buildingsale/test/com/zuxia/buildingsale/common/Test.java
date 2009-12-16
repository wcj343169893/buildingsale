/**
 *******************************************************************************
 * filename    : Test.java
 * package     : com.zuxia.buildingsale.common
 * createdate  : 2009-12-15 下午05:23:19
 * project     : Buildingsale
 * @version    : 1.0
 * @author     : Administrator
 * (c) Copyright 2009 
 *	＜功能概要＞
 *  XXX
 *******************************************************************************
 */
package com.zuxia.buildingsale.common;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Test概要说明
 * 
 *
 * @author Administrator
 */
public class Test extends TestCase{
	public void testBuilding(){
		System.out.println(Arrays.toString(Building.values()));
		System.out.println(Building.APPLICATION_CURRENT_USER.toString());
		System.out.println(Building.NEXT_PAGE.ordinal());
	}
}
