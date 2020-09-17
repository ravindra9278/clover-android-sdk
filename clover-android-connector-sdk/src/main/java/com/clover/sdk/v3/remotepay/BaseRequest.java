/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * The base for requests
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getRequestId requestId}</li>
 * <li>{@link #getVersion version}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class BaseRequest extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Identifier for the request
   */
  public java.lang.String getRequestId() {
    return genClient.cacheGet(CacheKey.requestId);
  }

  /**
   * Identifier for the version
   */
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    requestId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    version
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Integer.class)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<BaseRequest> genClient;

  /**
   * Constructs a new empty instance.
   */
  public BaseRequest() {
    genClient = new GenericClient<BaseRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected BaseRequest(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BaseRequest(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public BaseRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BaseRequest(BaseRequest src) {
    this();
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
    genClient.validateCloverId(CacheKey.requestId, getRequestId());
  }

  /** Checks whether the 'requestId' field is set and is not null */
  public boolean isNotNullRequestId() {
    return genClient.cacheValueIsNotNull(CacheKey.requestId);
  }

  /** Checks whether the 'version' field is set and is not null */
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'requestId' field has been set, however the value could be null */
  public boolean hasRequestId() {
    return genClient.cacheHasKey(CacheKey.requestId);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'requestId'.
   */
  public BaseRequest setRequestId(java.lang.String requestId) {
    return genClient.setOther(requestId, CacheKey.requestId);
  }

  /**
   * Sets the field 'version'.
   */
  public BaseRequest setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'requestId' field, the 'has' method for this field will now return false */
  public void clearRequestId() {
    genClient.clear(CacheKey.requestId);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  public void clearVersion() {
    genClient.clear(CacheKey.version);
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
  public BaseRequest copyChanges() {
    BaseRequest copy = new BaseRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(BaseRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new BaseRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<BaseRequest> CREATOR = new android.os.Parcelable.Creator<BaseRequest>() {
    @Override
    public BaseRequest createFromParcel(android.os.Parcel in) {
      BaseRequest instance = new BaseRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public BaseRequest[] newArray(int size) {
      return new BaseRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<BaseRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<BaseRequest>() {
    public Class<BaseRequest> getCreatedClass() {
      return BaseRequest.class;
    }

    @Override
    public BaseRequest create(org.json.JSONObject jsonObject) {
      return new BaseRequest(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean REQUESTID_IS_REQUIRED = false;
    public static final long REQUESTID_MAX_LEN = 13;
    public static final boolean VERSION_IS_REQUIRED = false;
  }

}