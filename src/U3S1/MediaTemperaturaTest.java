package U3S1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MediaTemperaturaTest {

	@Test
	void testMediaTemp() {
		MediaTemperatura m = new MediaTemperatura(5);
		m.setLeitura(25.0);
		m.setLeitura(30.0);
		m.setLeitura(30.0);
		m.setLeitura(28.0);
		m.setLeitura(20.0);
		double res = m.mediaTemp();
		assertEquals(26.6, res,0.1);
	}

}
