package bowling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingTest {

	@Test
	void test() {
		Bowling game = new Bowling();
		game.roll(0);
		assertEquals(game.score(),0);
	}

}
