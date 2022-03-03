package generic;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter fomatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String shortFormat = fomatter.format(LocalTime.now());
        System.out.println(shortFormat);
    }
}

