/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

/*
 * Copyright (C) 2016 Clover Network, Inc.
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
 */

package com.clover.sdk.v3.order;

@SuppressWarnings("all")
public class LineItemMapFdParcelable extends com.clover.sdk.FdParcelable<java.util.Map<java.lang.String,java.util.List<com.clover.sdk.v3.order.LineItem>>> {
  public LineItemMapFdParcelable(java.util.Map<java.lang.String,java.util.List<com.clover.sdk.v3.order.LineItem>> value) {
    super(value);
  }

  public LineItemMapFdParcelable(android.os.Parcel in) {
    super(in);
  }

  public static final android.os.Parcelable.Creator<LineItemMapFdParcelable> CREATOR = new android.os.Parcelable.Creator<LineItemMapFdParcelable>() {
    @Override
    public LineItemMapFdParcelable createFromParcel(android.os.Parcel in) {
      return new LineItemMapFdParcelable(in);
    }

    @Override
    public LineItemMapFdParcelable[] newArray(int size) {
      return new LineItemMapFdParcelable[size];
    }
  };
}
