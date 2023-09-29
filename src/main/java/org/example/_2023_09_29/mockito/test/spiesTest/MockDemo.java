package org.example._2023_09_29.mockito.test.spiesTest;//package javaProf.unit.mockito.test.spiesTest;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class MockDemo {

	@Mock
	List<String> listMock = new ArrayList<>();

	@Test
	public void testMockReturnsZero() {
		String str = "Mock";

		listMock.add(str);

		verify(listMock).add(str);
		assertEquals(0, listMock.size());
	}
}