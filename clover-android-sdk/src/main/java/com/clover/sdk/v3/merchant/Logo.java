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

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getLogoType logoType}</li>
 * <li>{@link #getLogoFilename logoFilename}</li>
 * <li>{@link #getUrl url}</li>
 * </ul>
 */
@SuppressWarnings("all")
public final class Logo implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The type of merchant logo
   */
  public com.clover.sdk.v3.merchant.LogoType getLogoType() {
    return genClient.cacheGet(CacheKey.logoType);
  }

  /**
   * The filename of the logo
   */
  public java.lang.String getLogoFilename() {
    return genClient.cacheGet(CacheKey.logoFilename);
  }

  /**
   * URL of the logo file. Generated from filename.
   */
  public java.lang.String getUrl() {
    return genClient.cacheGet(CacheKey.url);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Logo> {
    logoType {
      @Override
      public Object extractValue(Logo instance) {
        return instance.genClient.extractEnum("logoType", com.clover.sdk.v3.merchant.LogoType.class);
      }
    },
    logoFilename {
      @Override
      public Object extractValue(Logo instance) {
        return instance.genClient.extractOther("logoFilename", java.lang.String.class);
      }
    },
    url {
      @Override
      public Object extractValue(Logo instance) {
        return instance.genClient.extractOther("url", java.lang.String.class);
      }
    },
    ;
  }

  private GenericClient<Logo> genClient = new GenericClient<Logo>(this);

  /**
   * Constructs a new empty instance.
   */
  public Logo() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Logo(String json) throws IllegalArgumentException {
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
  public Logo(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Logo(Logo src) {
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
    genClient.validateNull(getLogoType(), "logoType");

    genClient.validateNull(getLogoFilename(), "logoFilename");
    genClient.validateLength(getLogoFilename(), 100);

    genClient.validateLength(getUrl(), 255);
  }

  /** Checks whether the 'logoType' field is set and is not null */
  public boolean isNotNullLogoType() {
    return genClient.cacheValueIsNotNull(CacheKey.logoType);
  }

  /** Checks whether the 'logoFilename' field is set and is not null */
  public boolean isNotNullLogoFilename() {
    return genClient.cacheValueIsNotNull(CacheKey.logoFilename);
  }

  /** Checks whether the 'url' field is set and is not null */
  public boolean isNotNullUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.url);
  }


  /** Checks whether the 'logoType' field has been set, however the value could be null */
  public boolean hasLogoType() {
    return genClient.cacheHasKey(CacheKey.logoType);
  }

  /** Checks whether the 'logoFilename' field has been set, however the value could be null */
  public boolean hasLogoFilename() {
    return genClient.cacheHasKey(CacheKey.logoFilename);
  }

  /** Checks whether the 'url' field has been set, however the value could be null */
  public boolean hasUrl() {
    return genClient.cacheHasKey(CacheKey.url);
  }


  /**
   * Sets the field 'logoType'.
   */
  public Logo setLogoType(com.clover.sdk.v3.merchant.LogoType logoType) {
    return genClient.setOther(logoType, CacheKey.logoType);
  }

  /**
   * Sets the field 'logoFilename'.
   */
  public Logo setLogoFilename(java.lang.String logoFilename) {
    return genClient.setOther(logoFilename, CacheKey.logoFilename);
  }

  /**
   * Sets the field 'url'.
   */
  public Logo setUrl(java.lang.String url) {
    return genClient.setOther(url, CacheKey.url);
  }


  /** Clears the 'logoType' field, the 'has' method for this field will now return false */
  public void clearLogoType() {
    genClient.clear(CacheKey.logoType);
  }
  /** Clears the 'logoFilename' field, the 'has' method for this field will now return false */
  public void clearLogoFilename() {
    genClient.clear(CacheKey.logoFilename);
  }
  /** Clears the 'url' field, the 'has' method for this field will now return false */
  public void clearUrl() {
    genClient.clear(CacheKey.url);
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
  public Logo copyChanges() {
    Logo copy = new Logo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Logo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Logo(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Logo> CREATOR = new android.os.Parcelable.Creator<Logo>() {
    @Override
    public Logo createFromParcel(android.os.Parcel in) {
      Logo instance = new Logo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Logo[] newArray(int size) {
      return new Logo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Logo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Logo>() {
    @Override
    public Logo create(org.json.JSONObject jsonObject) {
      return new Logo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean LOGOTYPE_IS_REQUIRED = true;

    public static final boolean LOGOFILENAME_IS_REQUIRED = true;
    public static final long LOGOFILENAME_MAX_LEN = 100;

    public static final boolean URL_IS_REQUIRED = false;
    public static final long URL_MAX_LEN = 255;

  }

}
