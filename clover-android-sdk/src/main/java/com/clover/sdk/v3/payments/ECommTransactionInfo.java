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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getECommTransaction eCommTransaction}</li>
 * <li>{@link #getCredentialOnFile credentialOnFile}</li>
 * <li>{@link #getTokenType tokenType}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class ECommTransactionInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Set to True when it is an Ecomm Transaction
   */
  public java.lang.Boolean getECommTransaction() {
    return genClient.cacheGet(CacheKey.eCommTransaction);
  }

  /**
   * Set to true when Card On File is used for the transaction
   */
  public java.lang.Boolean getCredentialOnFile() {
    return genClient.cacheGet(CacheKey.credentialOnFile);
  }

  public com.clover.sdk.v3.tokens.TokenType getTokenType() {
    return genClient.cacheGet(CacheKey.tokenType);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    eCommTransaction
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    credentialOnFile
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    tokenType
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.tokens.TokenType.class)),
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

  private final GenericClient<ECommTransactionInfo> genClient;

  /**
   * Constructs a new empty instance.
   */
  public ECommTransactionInfo() {
    genClient = new GenericClient<ECommTransactionInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected ECommTransactionInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ECommTransactionInfo(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public ECommTransactionInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ECommTransactionInfo(ECommTransactionInfo src) {
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
  }

  /** Checks whether the 'eCommTransaction' field is set and is not null */
  public boolean isNotNullECommTransaction() {
    return genClient.cacheValueIsNotNull(CacheKey.eCommTransaction);
  }

  /** Checks whether the 'credentialOnFile' field is set and is not null */
  public boolean isNotNullCredentialOnFile() {
    return genClient.cacheValueIsNotNull(CacheKey.credentialOnFile);
  }

  /** Checks whether the 'tokenType' field is set and is not null */
  public boolean isNotNullTokenType() {
    return genClient.cacheValueIsNotNull(CacheKey.tokenType);
  }



  /** Checks whether the 'eCommTransaction' field has been set, however the value could be null */
  public boolean hasECommTransaction() {
    return genClient.cacheHasKey(CacheKey.eCommTransaction);
  }

  /** Checks whether the 'credentialOnFile' field has been set, however the value could be null */
  public boolean hasCredentialOnFile() {
    return genClient.cacheHasKey(CacheKey.credentialOnFile);
  }

  /** Checks whether the 'tokenType' field has been set, however the value could be null */
  public boolean hasTokenType() {
    return genClient.cacheHasKey(CacheKey.tokenType);
  }


  /**
   * Sets the field 'eCommTransaction'.
   */
  public ECommTransactionInfo setECommTransaction(java.lang.Boolean eCommTransaction) {
    return genClient.setOther(eCommTransaction, CacheKey.eCommTransaction);
  }

  /**
   * Sets the field 'credentialOnFile'.
   */
  public ECommTransactionInfo setCredentialOnFile(java.lang.Boolean credentialOnFile) {
    return genClient.setOther(credentialOnFile, CacheKey.credentialOnFile);
  }

  /**
   * Sets the field 'tokenType'.
   */
  public ECommTransactionInfo setTokenType(com.clover.sdk.v3.tokens.TokenType tokenType) {
    return genClient.setOther(tokenType, CacheKey.tokenType);
  }


  /** Clears the 'eCommTransaction' field, the 'has' method for this field will now return false */
  public void clearECommTransaction() {
    genClient.clear(CacheKey.eCommTransaction);
  }
  /** Clears the 'credentialOnFile' field, the 'has' method for this field will now return false */
  public void clearCredentialOnFile() {
    genClient.clear(CacheKey.credentialOnFile);
  }
  /** Clears the 'tokenType' field, the 'has' method for this field will now return false */
  public void clearTokenType() {
    genClient.clear(CacheKey.tokenType);
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
  public ECommTransactionInfo copyChanges() {
    ECommTransactionInfo copy = new ECommTransactionInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ECommTransactionInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ECommTransactionInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ECommTransactionInfo> CREATOR = new android.os.Parcelable.Creator<ECommTransactionInfo>() {
    @Override
    public ECommTransactionInfo createFromParcel(android.os.Parcel in) {
      ECommTransactionInfo instance = new ECommTransactionInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ECommTransactionInfo[] newArray(int size) {
      return new ECommTransactionInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ECommTransactionInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ECommTransactionInfo>() {
    public Class<ECommTransactionInfo> getCreatedClass() {
      return ECommTransactionInfo.class;
    }

    @Override
    public ECommTransactionInfo create(org.json.JSONObject jsonObject) {
      return new ECommTransactionInfo(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean ECOMMTRANSACTION_IS_REQUIRED = false;
    public static final boolean CREDENTIALONFILE_IS_REQUIRED = false;
    public static final boolean TOKENTYPE_IS_REQUIRED = false;
  }

}
