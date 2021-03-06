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

package org.citypay.ctpj.bls;

import com.google.common.base.Preconditions;

public class MessageHashVector extends java.util.AbstractList<byte []> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MessageHashVector(long cPtr, boolean cMemoryOwn) {
    Preconditions.checkArgument(cPtr != 0);
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MessageHashVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JNI.delete_ByteArrayVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  MessageHashVector(java.util.Collection<byte[]> e) {
    this.reserve(e.size());
    for(byte[] value: e) {
      this.push_back(value);
    }
  }

  public MessageHashVector() {
    this(JNI.new_ByteArrayVec__SWIG_0(), true);
  }

  public MessageHashVector(long n) {
    this(JNI.new_ByteArrayVec__SWIG_1(n), true);
  }

  public MessageHashVector(MessageHashVector o) {
    this(JNI.new_ByteArrayVec__SWIG_2(MessageHashVector.getCPtr(o), o), true);
  }

  public long capacity() {
    return JNI.ByteArrayVec_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    JNI.ByteArrayVec_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return JNI.ByteArrayVec_isEmpty(swigCPtr, this);
  }

  public void clear() {
    JNI.ByteArrayVec_clear(swigCPtr, this);
  }

  public void push_back(byte [] x) {
    Preconditions.checkArgument(x.length == BLS.MESSAGE_HASH_LEN);
    JNI.ByteArrayVec_push_back(swigCPtr, this, x);
  }

  public byte [] get(int i) {
    return JNI.ByteArrayVec_get(swigCPtr, this, i);
  }

  public byte [] set(int i, byte [] VECTOR_VALUE_IN) {
    Preconditions.checkArgument(VECTOR_VALUE_IN.length == BLS.MESSAGE_HASH_LEN);
    return JNI.ByteArrayVec_set(swigCPtr, this, i, VECTOR_VALUE_IN);
  }

  public int size() {
    return JNI.ByteArrayVec_size(swigCPtr, this);
  }

  public void removeRange(int from, int to) {
    JNI.ByteArrayVec_removeRange(swigCPtr, this, from, to);
  }



}
