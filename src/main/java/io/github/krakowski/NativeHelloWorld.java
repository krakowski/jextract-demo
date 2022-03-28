package io.github.krakowski;

import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import static org.unix.Linux.printf;

public final class NativeHelloWorld {

    public static void main(String... args) {
        try (var scope = ResourceScope.newConfinedScope()) {
            var allocator = SegmentAllocator.nativeAllocator(scope);
            var format = allocator.allocateUtf8String("Hello %s");
            var value = allocator.allocateUtf8String("World");

            printf(format, value.address());
        }
    }
}
