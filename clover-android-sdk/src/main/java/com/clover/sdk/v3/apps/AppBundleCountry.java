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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getPrice price}</li>
 * <li>{@link #getPricePerDevice pricePerDevice}</li>
 * <li>{@link #getCountry country}</li>
 * </ul>
 */
@SuppressWarnings("all")
public final class AppBundleCountry implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.Long getPrice() {
    return genClient.cacheGet(CacheKey.price);
  }

  public java.lang.Long getPricePerDevice() {
    return genClient.cacheGet(CacheKey.pricePerDevice);
  }

  /**
   * The country of the app bundle country
   */
  public java.lang.String getCountry() {
    return genClient.cacheGet(CacheKey.country);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppBundleCountry> {
    id {
      @Override
      public Object extractValue(AppBundleCountry instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    price {
      @Override
      public Object extractValue(AppBundleCountry instance) {
        return instance.genClient.extractOther("price", java.lang.Long.class);
      }
    },
    pricePerDevice {
      @Override
      public Object extractValue(AppBundleCountry instance) {
        return instance.genClient.extractOther("pricePerDevice", java.lang.Long.class);
      }
    },
    country {
      @Override
      public Object extractValue(AppBundleCountry instance) {
        return instance.genClient.extractOther("country", java.lang.String.class);
      }
    },
    ;
  }

  private GenericClient<AppBundleCountry> genClient = new GenericClient<AppBundleCountry>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppBundleCountry() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppBundleCountry(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AppBundleCountry(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppBundleCountry(AppBundleCountry src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getCountry(), 2);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'price' field is set and is not null */
  public boolean isNotNullPrice() {
    return genClient.cacheValueIsNotNull(CacheKey.price);
  }

  /** Checks whether the 'pricePerDevice' field is set and is not null */
  public boolean isNotNullPricePerDevice() {
    return genClient.cacheValueIsNotNull(CacheKey.pricePerDevice);
  }

  /** Checks whether the 'country' field is set and is not null */
  public boolean isNotNullCountry() {
    return genClient.cacheValueIsNotNull(CacheKey.country);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'price' field has been set, however the value could be null */
  public boolean hasPrice() {
    return genClient.cacheHasKey(CacheKey.price);
  }

  /** Checks whether the 'pricePerDevice' field has been set, however the value could be null */
  public boolean hasPricePerDevice() {
    return genClient.cacheHasKey(CacheKey.pricePerDevice);
  }

  /** Checks whether the 'country' field has been set, however the value could be null */
  public boolean hasCountry() {
    return genClient.cacheHasKey(CacheKey.country);
  }


  /**
   * Sets the field 'id'.
   */
  public AppBundleCountry setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'price'.
   */
  public AppBundleCountry setPrice(java.lang.Long price) {
    return genClient.setOther(price, CacheKey.price);
  }

  /**
   * Sets the field 'pricePerDevice'.
   */
  public AppBundleCountry setPricePerDevice(java.lang.Long pricePerDevice) {
    return genClient.setOther(pricePerDevice, CacheKey.pricePerDevice);
  }

  /**
   * Sets the field 'country'.
   */
  public AppBundleCountry setCountry(java.lang.String country) {
    return genClient.setOther(country, CacheKey.country);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'price' field, the 'has' method for this field will now return false */
  public void clearPrice() {
    genClient.clear(CacheKey.price);
  }
  /** Clears the 'pricePerDevice' field, the 'has' method for this field will now return false */
  public void clearPricePerDevice() {
    genClient.clear(CacheKey.pricePerDevice);
  }
  /** Clears the 'country' field, the 'has' method for this field will now return false */
  public void clearCountry() {
    genClient.clear(CacheKey.country);
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AppBundleCountry copyChanges() {
    AppBundleCountry copy = new AppBundleCountry();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppBundleCountry src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppBundleCountry(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<AppBundleCountry> CREATOR = new android.os.Parcelable.Creator<AppBundleCountry>() {
    @Override
    public AppBundleCountry createFromParcel(android.os.Parcel in) {
      AppBundleCountry instance = new AppBundleCountry(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppBundleCountry[] newArray(int size) {
      return new AppBundleCountry[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppBundleCountry> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppBundleCountry>() {
    @Override
    public AppBundleCountry create(org.json.JSONObject jsonObject) {
      return new AppBundleCountry(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean PRICE_IS_REQUIRED = false;

    public static final boolean PRICEPERDEVICE_IS_REQUIRED = false;

    public static final boolean COUNTRY_IS_REQUIRED = false;
    public static final long COUNTRY_MAX_LEN = 2;

  }

}
