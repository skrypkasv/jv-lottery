package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUNDARY = 101;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public String getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(NUMBER_BOUNDARY));
        return ball.toString();
    }
}
