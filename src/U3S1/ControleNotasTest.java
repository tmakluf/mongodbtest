package U3S1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControleNotasTest {

	@Test
	void testControleNotas() {
		ControleNotas c = new ControleNotas(10.0, 10.0, 10.0);
		assertNotNull(c);
	}
	@Test
	void testCalculaNotaFinal() {
		ControleNotas c = new ControleNotas(10.0,
				10.0, 10.0);
		double notafinal = c.calculaNotaFinal();
		assertEquals(10.0, notafinal);
	}

}
