package com.pavelsushko.servicecenter;

import com.formdev.flatlaf.FlatIntelliJLaf;

public class Main {
    public static void main(String[] args) {
        FlatIntelliJLaf.install();
        new LauncherUI();
    }
}