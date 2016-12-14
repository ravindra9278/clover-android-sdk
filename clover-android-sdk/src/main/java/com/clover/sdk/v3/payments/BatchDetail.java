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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getBatchTotals batchTotals}</li>
 * <li>{@link #getServerTotals serverTotals}</li>
 * <li>{@link #getCardTotals cardTotals}</li>
 * <li>{@link #getOpenTips openTips}</li>
 * <li>{@link #getOpenTabs openTabs}</li>
 * </ul>
 */
@SuppressWarnings("all")
public final class BatchDetail implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.payments.BatchTotalStats getBatchTotals() {
    return genClient.cacheGet(CacheKey.batchTotals);
  }

  public java.util.List<com.clover.sdk.v3.payments.ServerTotalStats> getServerTotals() {
    return genClient.cacheGet(CacheKey.serverTotals);
  }

  public java.util.List<com.clover.sdk.v3.payments.BatchCardTotal> getCardTotals() {
    return genClient.cacheGet(CacheKey.cardTotals);
  }

  /**
   * Number of open tips.
   */
  public java.lang.Long getOpenTips() {
    return genClient.cacheGet(CacheKey.openTips);
  }

  /**
   * Number of open tabs.
   */
  public java.lang.Long getOpenTabs() {
    return genClient.cacheGet(CacheKey.openTabs);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<BatchDetail> {
    batchTotals {
      @Override
      public Object extractValue(BatchDetail instance) {
        return instance.genClient.extractRecord("batchTotals", com.clover.sdk.v3.payments.BatchTotalStats.JSON_CREATOR);
      }
    },
    serverTotals {
      @Override
      public Object extractValue(BatchDetail instance) {
        return instance.genClient.extractListRecord("serverTotals", com.clover.sdk.v3.payments.ServerTotalStats.JSON_CREATOR);
      }
    },
    cardTotals {
      @Override
      public Object extractValue(BatchDetail instance) {
        return instance.genClient.extractListRecord("cardTotals", com.clover.sdk.v3.payments.BatchCardTotal.JSON_CREATOR);
      }
    },
    openTips {
      @Override
      public Object extractValue(BatchDetail instance) {
        return instance.genClient.extractOther("openTips", java.lang.Long.class);
      }
    },
    openTabs {
      @Override
      public Object extractValue(BatchDetail instance) {
        return instance.genClient.extractOther("openTabs", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<BatchDetail> genClient = new GenericClient<BatchDetail>(this);

  /**
   * Constructs a new empty instance.
   */
  public BatchDetail() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BatchDetail(String json) throws IllegalArgumentException {
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
  public BatchDetail(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BatchDetail(BatchDetail src) {
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

  /** Checks whether the 'batchTotals' field is set and is not null */
  public boolean isNotNullBatchTotals() {
    return genClient.cacheValueIsNotNull(CacheKey.batchTotals);
  }

  /** Checks whether the 'serverTotals' field is set and is not null */
  public boolean isNotNullServerTotals() {
    return genClient.cacheValueIsNotNull(CacheKey.serverTotals);
  }

  /** Checks whether the 'serverTotals' field is set and is not null and is not empty */
  public boolean isNotEmptyServerTotals() { return isNotNullServerTotals() && !getServerTotals().isEmpty(); }

  /** Checks whether the 'cardTotals' field is set and is not null */
  public boolean isNotNullCardTotals() {
    return genClient.cacheValueIsNotNull(CacheKey.cardTotals);
  }

  /** Checks whether the 'cardTotals' field is set and is not null and is not empty */
  public boolean isNotEmptyCardTotals() { return isNotNullCardTotals() && !getCardTotals().isEmpty(); }

  /** Checks whether the 'openTips' field is set and is not null */
  public boolean isNotNullOpenTips() {
    return genClient.cacheValueIsNotNull(CacheKey.openTips);
  }

  /** Checks whether the 'openTabs' field is set and is not null */
  public boolean isNotNullOpenTabs() {
    return genClient.cacheValueIsNotNull(CacheKey.openTabs);
  }


  /** Checks whether the 'batchTotals' field has been set, however the value could be null */
  public boolean hasBatchTotals() {
    return genClient.cacheHasKey(CacheKey.batchTotals);
  }

  /** Checks whether the 'serverTotals' field has been set, however the value could be null */
  public boolean hasServerTotals() {
    return genClient.cacheHasKey(CacheKey.serverTotals);
  }

  /** Checks whether the 'cardTotals' field has been set, however the value could be null */
  public boolean hasCardTotals() {
    return genClient.cacheHasKey(CacheKey.cardTotals);
  }

  /** Checks whether the 'openTips' field has been set, however the value could be null */
  public boolean hasOpenTips() {
    return genClient.cacheHasKey(CacheKey.openTips);
  }

  /** Checks whether the 'openTabs' field has been set, however the value could be null */
  public boolean hasOpenTabs() {
    return genClient.cacheHasKey(CacheKey.openTabs);
  }


  /**
   * Sets the field 'batchTotals'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public BatchDetail setBatchTotals(com.clover.sdk.v3.payments.BatchTotalStats batchTotals) {
    return genClient.setRecord(batchTotals, CacheKey.batchTotals);
  }

  /**
   * Sets the field 'serverTotals'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public BatchDetail setServerTotals(java.util.List<com.clover.sdk.v3.payments.ServerTotalStats> serverTotals) {
    return genClient.setArrayRecord(serverTotals, CacheKey.serverTotals);
  }

  /**
   * Sets the field 'cardTotals'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public BatchDetail setCardTotals(java.util.List<com.clover.sdk.v3.payments.BatchCardTotal> cardTotals) {
    return genClient.setArrayRecord(cardTotals, CacheKey.cardTotals);
  }

  /**
   * Sets the field 'openTips'.
   */
  public BatchDetail setOpenTips(java.lang.Long openTips) {
    return genClient.setOther(openTips, CacheKey.openTips);
  }

  /**
   * Sets the field 'openTabs'.
   */
  public BatchDetail setOpenTabs(java.lang.Long openTabs) {
    return genClient.setOther(openTabs, CacheKey.openTabs);
  }


  /** Clears the 'batchTotals' field, the 'has' method for this field will now return false */
  public void clearBatchTotals() {
    genClient.clear(CacheKey.batchTotals);
  }
  /** Clears the 'serverTotals' field, the 'has' method for this field will now return false */
  public void clearServerTotals() {
    genClient.clear(CacheKey.serverTotals);
  }
  /** Clears the 'cardTotals' field, the 'has' method for this field will now return false */
  public void clearCardTotals() {
    genClient.clear(CacheKey.cardTotals);
  }
  /** Clears the 'openTips' field, the 'has' method for this field will now return false */
  public void clearOpenTips() {
    genClient.clear(CacheKey.openTips);
  }
  /** Clears the 'openTabs' field, the 'has' method for this field will now return false */
  public void clearOpenTabs() {
    genClient.clear(CacheKey.openTabs);
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
  public BatchDetail copyChanges() {
    BatchDetail copy = new BatchDetail();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(BatchDetail src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new BatchDetail(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<BatchDetail> CREATOR = new android.os.Parcelable.Creator<BatchDetail>() {
    @Override
    public BatchDetail createFromParcel(android.os.Parcel in) {
      BatchDetail instance = new BatchDetail(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public BatchDetail[] newArray(int size) {
      return new BatchDetail[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<BatchDetail> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<BatchDetail>() {
    @Override
    public BatchDetail create(org.json.JSONObject jsonObject) {
      return new BatchDetail(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean BATCHTOTALS_IS_REQUIRED = false;

    public static final boolean SERVERTOTALS_IS_REQUIRED = false;

    public static final boolean CARDTOTALS_IS_REQUIRED = false;

    public static final boolean OPENTIPS_IS_REQUIRED = false;

    public static final boolean OPENTABS_IS_REQUIRED = false;

  }

}
