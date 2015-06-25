package com.intuit.commit.cop;

import junit.framework.Assert;

import org.junit.Test;


public class TestCommitCop {

	
	@Test
	public void testwelcome(){
		String message = CommitCop.welcome();
		Assert.assertEquals("Hello World Sahil-6", message);
	}
}
