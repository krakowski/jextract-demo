package io.github.krakowski;

import java.lang.foreign.MemorySession;

import static org.unix.Linux.printf;

public final class NativeHelloWorld {

    public static void main(String... args) {
        print();
    }

    public static void print() {
        try (var session = MemorySession.openConfined()) {
            var format = session.allocateUtf8String("Hello %s");
            var value = session.allocateUtf8String("World");

            printf(format, value.address());
        }
    }
}
