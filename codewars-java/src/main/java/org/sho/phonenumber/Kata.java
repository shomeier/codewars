package org.sho.phonenumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    private static final String PHONE_NUMBER_REGEX = "(\\d{3})(\\d{3})(\\d+)";
    private static final String PHONE_NUMBER_REPLACEMENT = "($1) $2-$3";

    private Kata() {}

    public static String createPhoneNumber(int[] numbers) {
        final var rawString = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return rawString.replaceFirst(PHONE_NUMBER_REGEX, PHONE_NUMBER_REPLACEMENT);
    }
}
