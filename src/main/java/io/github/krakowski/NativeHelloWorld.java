package io.github.krakowski;

import jdk.incubator.foreign.CSupport;

import static org.unix.stdio_h.*;

public final class NativeHelloWorld {

    public static void main(String... args) {
        try (var format = CSupport.toCString("Hello %s");
             var value = CSupport.toCString("World")) {

            // Call native printf function
            printf(format, value.address());
        }
    }
}
