/*
 * Copyright 2018 Ctp Core Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file was generated by SWIG (http://www.swig.org) and modified.
 * Version 3.0.12
 */

package org.citypay.bls;

import com.google.common.base.Preconditions;

import java.util.Arrays;

public class PublicKey extends BLSObject{

  protected PublicKey(long cPtr, boolean cMemoryOwn) {
    super(cPtr, cMemoryOwn);
  }

  //protected static long getCPtr(PublicKey obj) {
  //  return (obj == null) ? 0 : obj.cPointer;
  //}

  public synchronized void delete() {
        JNI.delete_PublicKey(cPointer);
  }

  public static PublicKey FromBytes(byte[] key) {
    Preconditions.checkNotNull(key);
    Preconditions.checkArgument(key.length == PUBLIC_KEY_SIZE);
    return new PublicKey(JNI.PublicKey_FromBytes(key), true);
  }

  public static PublicKey FromG1(SWIGTYPE_p_g1_t key) {
    return new PublicKey(JNI.PublicKey_FromG1(SWIGTYPE_p_g1_t.getCPtr(key)), true);
  }

  public PublicKey(PublicKey pubKey) {
    this(JNI.new_PublicKey(PublicKey.getCPtr(pubKey), pubKey), true);
  }

  public static PublicKey AggregateInsecure(PublicKeyVector pubKeys) {
    Preconditions.checkNotNull(pubKeys);
    Preconditions.checkArgument(pubKeys.size() > 0, "The number of public keys must be at least 1");
    return new PublicKey(JNI.PublicKey_AggregateInsecure(PublicKeyVector.getCPtr(pubKeys), pubKeys), true);
  }

  public static PublicKey Aggregate(PublicKeyVector pubKeys) {
    Preconditions.checkNotNull(pubKeys);
    Preconditions.checkArgument(pubKeys.size() > 0, "The number of public keys must be at least 1");
    return new PublicKey(JNI.PublicKey_Aggregate(PublicKeyVector.getCPtr(pubKeys), pubKeys), true);
  }

  public void Serialize(byte[] buffer) {
    Preconditions.checkNotNull(buffer);
    Preconditions.checkArgument(buffer.length >= PUBLIC_KEY_SIZE);
    JNI.PublicKey_Serialize__SWIG_0(cPointer, this, buffer);
  }

  public byte [] Serialize() {
    byte [] bytes = new byte[(int)PUBLIC_KEY_SIZE];
    Serialize(bytes);
    return bytes;
  }

  @Override
  public String toString() {
    return "PublicKey(" + Utils.HEX.encode(Serialize()) + ")";
  }

  public long GetFingerprint() {
    return JNI.PublicKey_GetFingerprint(cPointer, this);
  }

  public final static long PUBLIC_KEY_SIZE = JNI.PublicKey_PUBLIC_KEY_SIZE_get();

  @Override
  public boolean equals(Object obj) {
    if (obj == null || !(obj instanceof PublicKey))
      return false;
    PublicKey publicKey = (PublicKey) obj;
    byte[] theseBytes = new byte[(int) PUBLIC_KEY_SIZE];
    Serialize(theseBytes);
    byte[] bytes = new byte[(int) PUBLIC_KEY_SIZE];
    publicKey.Serialize(bytes);
    return Arrays.equals(theseBytes, bytes);
  }
}
