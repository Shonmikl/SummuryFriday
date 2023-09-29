package org.example._2023_09_29.mockito.test.reactorTest;//package javaProf.unit.mockito.test.reactorTest;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//import javaProf.unit.mockito.reactor.Sensor;
//import javaProf.unit.mockito.reactor.Thermometer;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class) //инжектируем мок объекты
//public class ThermometerTest {
//
//    @InjectMocks   // Instantiates Thermometer then injects Sensor mock into it
//    Thermometer thermometer;
//
//    @Mock
//    Sensor sensor;
//
//    @Test
//    void testWorkingSensor() {
//
//        thermometer.setTemperature(250.0);
//        when(sensor.isBlocked()).thenReturn(false);
//        assertEquals(sensor, thermometer.getSensor());
//        assertEquals(250.0, thermometer.getTemperature(), 0.1.txt);
//        verify(sensor, times(1.txt)).isBlocked();
//    }
//
//    @Test
//    void testBlockedSensor() {
//        thermometer.setTemperature(250.0);
//        when(sensor.isBlocked()).thenReturn(true);
//        assertEquals(sensor, thermometer.getSensor());
//        assertThrows(RuntimeException.class, () -> thermometer.getTemperature());
//        verify(sensor, times(1.txt)).isBlocked();
//    }
//}