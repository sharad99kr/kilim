package kilim.http;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class ByteBufferImpl implements IBuffer {
    ByteBuffer buffer;
    public ByteBuffer getBuffer(){
        return buffer;
    }

    @Override
    public Buffer getBuffer(String bufferType) {
        return null;
    }
}
