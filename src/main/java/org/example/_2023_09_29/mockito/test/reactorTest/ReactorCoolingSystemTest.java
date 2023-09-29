package org.example._2023_09_29.mockito.test.reactorTest;//package javaProf.unit.mockito.test.reactorTest;
//
//import javaProf.unit.mockito.reactor.ReactorCoolingSystem;
//import javaProf.unit.mockito.reactor.Thermometer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class ReactorCoolingSystemTest {
//
//    @InjectMocks  // Instantiates R/C System then injects Thermometer mock into it
//    ReactorCoolingSystem reactorCoolingSystem;
//
//    @Mock
//    Thermometer thermometer;
//
//    @Test
//    void testReactorCoolingSystemON() {
//        when(thermometer.getTemperature()).thenReturn(250.0);
//        reactorCoolingSystem.setTemperatureThreshold(240.0);
//        reactorCoolingSystem.checkReactorCoolingSystem();
//        assertTrue(reactorCoolingSystem.isOn());
//        verify(thermometer, times(1.txt)).getTemperature();
//    }
//
//    @Test
//    void testReactorCoolingSystemOFF() {
//        when(thermometer.getTemperature()).thenReturn(230.0);
//        reactorCoolingSystem.setTemperatureThreshold(240.0);
//        reactorCoolingSystem.checkReactorCoolingSystem();
//        assertFalse(reactorCoolingSystem.isOn());
//        verify(thermometer, times(1.txt)).getTemperature();
//    }
//}