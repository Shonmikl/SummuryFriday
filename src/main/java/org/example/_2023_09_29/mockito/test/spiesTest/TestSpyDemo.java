package org.example._2023_09_29.mockito.test.spiesTest;//package javaProf.unit.mockito.test.spiesTest;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TestSpyDemo {

	@Spy
	List<String> listSpy = new ArrayList<>();

	@Test
	public void testSpyReturnsRealValues() throws Exception {
		String str = "Test Spy";

		listSpy.add(str);

		verify(listSpy).add(str);
		assertEquals(1, listSpy.size());
	}
}