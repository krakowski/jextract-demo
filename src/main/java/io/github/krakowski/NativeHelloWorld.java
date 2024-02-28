package io.github.krakowski;

import java.lang.foreign.Arena;

import static org.unix.Linux.printf;

public final class NativeHelloWorld {

    public static void main(String... args) {
        print();
    }

    public static void print() {
        try (var arena = Arena.ofConfined()) {
            var format = arena.allocateUtf8String("Hello %s");
            var value = arena.allocateUtf8String("World");

            printf(format, value.address());
        }
    }
}
