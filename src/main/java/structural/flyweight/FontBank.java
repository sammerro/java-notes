package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FontBank {
//
//
//    private static FontBank INSTANCE;
//    private FontBank() {}
//
//    public static FontBank getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new FontBank();
//        }
//        return INSTANCE;
//    }

    Map<String, Font> memo = new HashMap<>();

    public Font getFont(String fontFamily, int fontSize, boolean bold) {
        Objects.requireNonNull(fontFamily);
        String KEY = fontFamily + "_" + fontSize + (bold ? "_bold" : "");
        if (memo.get(KEY) == null) {
            memo.put(KEY,new Font(fontFamily, fontSize, bold));
        }
        return memo.get(KEY);
    }



}
