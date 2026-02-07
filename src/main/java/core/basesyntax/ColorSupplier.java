package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        ColorsEnum [] colors = ColorsEnum.values();
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
