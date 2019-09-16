package com.junit5.results.TestResults;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyTestWatcher.class)
class MyTest extends Base{
	@DisplayName("not important test")
	@Test
	void failingTest() {
		fail();
	}

	@DisplayName("very imporrtant test")
	@Test
	void passingTest() {
		assertTrue(true);
	}

}
