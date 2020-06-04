package io.github.krakowski;

import org.unix.Cstring;

import static org.unix.stdio_h.*;

public final class NativeHelloWorld {

    public static void main(String... args) {
        try (var format = Cstring.toCString("Hello %s");
             var value = Cstring.toCString("World")) {

            // Call native printf function
            printf(format.baseAddress(), value.baseAddress());
        }
    }
}
