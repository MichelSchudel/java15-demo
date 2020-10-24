package nl.craftsmen.java15demo.memoryapi;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;
import org.junit.jupiter.api.Test;

import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MemoryApiTest {


    @Test
    public void testMemory() {
        VarHandle intHandle = MemoryHandles.varHandle(int.class,
                ByteOrder.nativeOrder());

        try (MemorySegment segment = MemorySegment.allocateNative(100)) {
            MemoryAddress base = segment.baseAddress();
            for (int i = 0; i < 25; i++) {
                final MemoryAddress memoryAddress = base.addOffset(i * 4);
                intHandle.set(memoryAddress, i);
                System.out.println(intHandle.get(memoryAddress));
            }
            ByteBuffer byteBuffer = segment.asByteBuffer();

        }
    }


}
