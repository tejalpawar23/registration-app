package net.codejava;

import org.apache.commons.io.Charsets;

import java.lang.management.PlatformLoggingMXBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class App2 {

    Boolean bool = Boolean.valueOf(true);
    Byte b = Byte.valueOf("1");
    Character c = Character.valueOf('c');
    Double d = Double.valueOf(1.0);
    Float f = Float.valueOf(1.1f);
    Long l = Long.valueOf(1);
    Short sh = Short.valueOf("12");
    short s3 = 3;
    Short sh3 = Short.valueOf(s3);
    Integer i = Integer.valueOf(1);

    Charset utf8 = Charsets.UTF_8;

    static void method() {
        PlatformLoggingMXBean loggingBean = null;
    }

    void lombok() {
        var foo = "foo";
        List<String> lst = new ArrayList<>();
        for (var s : lst) {}
    }

    void security() {
        SecurityManager security = System.getSecurityManager();
    }
    void divide() {
        BigDecimal bd = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(2);
        bd.divide(bd2, RoundingMode.DOWN);
        bd.divide(bd2, RoundingMode.DOWN);
        bd.divide(bd2, 1, RoundingMode.CEILING);
        bd.divide(bd2, 1, RoundingMode.DOWN);
        bd.setScale(2, RoundingMode.DOWN);
    }
    public static void main(String[] args)  {

    }
}