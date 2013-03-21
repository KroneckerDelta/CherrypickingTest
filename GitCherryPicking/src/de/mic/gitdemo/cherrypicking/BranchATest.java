package de.mic.gitdemo.cherrypicking;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTest.class)
public class BranchATest implements AbstractBranchTest {


	@Test
	public void shouldDoSomething() {
		
		// this test is very slow
		assertTrue(true);
		//really!
	}

	@Override
	public void setupSomethingDoesntMatter() {
		int i = 0;
	}
	
}
