package entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Marque {
    Volswagen,
    Porsche,
    Ferrari,
    Tesla,
    Yamaha;

    private static final List<Marque> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Marque randomMarque()
    {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
