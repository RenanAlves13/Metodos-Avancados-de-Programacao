package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.FiguraGeometrica;

class PerimetrosTest {

	FiguraGeometrica figuras;
	int perimetroCirculo;
	int perimetroQuadrado;
	int perimetroRetangulo;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		int perimetroQuadrado = figuras.perimetroQ();
		int perimetroCirculo = figuras.perimetroC();
		int perimetroRetangulo = figuras.perimetroR();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
