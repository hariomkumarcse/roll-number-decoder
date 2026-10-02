package com.hariom.rolldecoder.model.constants;

import java.util.Map;

/**
 * Hardcoded college/institute code lookup.
 * Mirrors the legacy Core Java version's instituteCode == 292 check,
 * generalized into a lookup table so more colleges can be added easily.
 */
public final class CollegeCodes {

    private CollegeCodes() {
    }

    private static final Map<Integer, String> CODES = Map.of(
            292, "MIT Meerut"
    );

    public static String nameFor(int code) {
        return CODES.getOrDefault(code, "Unknown College");
    }

    public static boolean isKnown(int code) {
        return CODES.containsKey(code);
    }
}
