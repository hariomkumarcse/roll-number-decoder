package com.hariom.rolldecoder.model.constants;

import java.util.Map;

/**
 * Hardcoded branch code lookup.
 * Mirrors the legacy Core Java version's branchCode checks (10 / 153 / 154),
 * generalized into a lookup table so more branches can be added easily.
 */
public final class BranchCodes {

    private BranchCodes() {
    }

    private static final Map<Integer, String> CODES = Map.of(
            10, "Computer Science & Engineering (Core)",
            153, "Artificial Intelligence & Machine Learning",
            154, "Data Science"
    );

    public static String nameFor(int code) {
        return CODES.getOrDefault(code, "Unknown Branch");
    }

    public static boolean isKnown(int code) {
        return CODES.containsKey(code);
    }
}
