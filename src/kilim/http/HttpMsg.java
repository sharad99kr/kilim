/* Copyright (c) 2006, Sriram Srinivasan
 *
 * You may distribute this software under the terms of the license 
 * specified in the file "License"
 */

package kilim.http;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class HttpMsg implements IBuffer {


  @Override
  public Buffer getBuffer(String bufferType) {
    BufferFactory bf=new BufferFactory();
    return  bf.getBuffer(bufferType);
  }
}
