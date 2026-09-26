package com.educomser.ejemplo02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.educomser.ejemplo02.controladores.PruebaController;

@SpringBootTest
class Ejemplo02ApplicationTests {

	@Test
	void contextLoads() {
		PruebaController pruebaController = new PruebaController();
		String despedida = pruebaController.otroEndpoint();
		assertEquals("Hasta la siguiente semana!!", despedida);
	}

}
