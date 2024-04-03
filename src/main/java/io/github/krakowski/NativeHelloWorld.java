package io.github.krakowski;

import java.lang.foreign.Arena;

import static org.unix.Linux.C_POINTER;
import static org.unix.Linux.printf;

public final class NativeHelloWorld {

    public static void main(String... args) {
        print();
    }

    public static void print() {
        try (var arena = Arena.ofConfined()) {
            var format = arena.allocateFrom("Hello %s");
            var value = arena.allocateFrom("World");

            printf.makeInvoker(C_POINTER)
                  .apply(format, value);
        }
    }
}
