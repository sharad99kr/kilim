package kilim.http;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferFactory {

    public ByteBuffer getBuffer(String bufferType){

        if(bufferType==null){
            return null;
        }
        if(bufferType.equalsIgnoreCase("Byte")){
            return new ByteBufferImpl().getBuffer();
        }
        return null;
    }
}
