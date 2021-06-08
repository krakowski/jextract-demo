package io.github.krakowski;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;

import static org.unix.Linux.*;

public final class NativeHelloWorld {

    public static void main(String... args) {
        try (var scope = ResourceScope.newConfinedScope()) {
            var format = CLinker.toCString("Hello %s", scope);
            var value = CLinker.toCString("World", scope);

            printf(format, value.address());
        }
    }
}
