/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.proheng;

@org.apache.avro.specific.AvroGenerated
public interface HelloProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"HelloProtocol\",\"namespace\":\"com.proheng\",\"types\":[{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"favorite_number\",\"type\":[\"int\",\"null\"]},{\"name\":\"favorite_color\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Message\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"msg\",\"type\":\"string\"}]}],\"messages\":{\"hello\":{\"request\":[{\"name\":\"user\",\"type\":\"User\"}],\"response\":\"string\"}}}");
  /**
   */
  CharSequence hello(User user);

  @SuppressWarnings("all")
  public interface Callback extends HelloProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = HelloProtocol.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void hello(User user, org.apache.avro.ipc.Callback<CharSequence> callback) throws java.io.IOException;
  }
}