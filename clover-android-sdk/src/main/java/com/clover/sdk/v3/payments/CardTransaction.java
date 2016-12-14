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
 * <li>{@link #getCardType cardType}</li>
 * <li>{@link #getEntryType entryType}</li>
 * <li>{@link #getFirst6 first6}</li>
 * <li>{@link #getLast4 last4}</li>
 * <li>{@link #getType type}</li>
 * <li>{@link #getAuthCode authCode}</li>
 * <li>{@link #getReferenceId referenceId}</li>
 * <li>{@link #getTransactionNo transactionNo}</li>
 * <li>{@link #getState state}</li>
 * <li>{@link #getExtra extra}</li>
 * <li>{@link #getBegBalance begBalance}</li>
 * <li>{@link #getEndBalance endBalance}</li>
 * <li>{@link #getAvsResult avsResult}</li>
 * <li>{@link #getCardholderName cardholderName}</li>
 * <li>{@link #getToken token}</li>
 * <li>{@link #getVaultedCard vaultedCard}</li>
 * </ul>
 */
@SuppressWarnings("all")
public final class CardTransaction implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.payments.CardType getCardType() {
    return genClient.cacheGet(CacheKey.cardType);
  }

  public com.clover.sdk.v3.payments.CardEntryType getEntryType() {
    return genClient.cacheGet(CacheKey.entryType);
  }

  /**
   * The first four digits of the card number
   */
  public java.lang.String getFirst6() {
    return genClient.cacheGet(CacheKey.first6);
  }

  /**
   * The last four digits of the card number
   */
  public java.lang.String getLast4() {
    return genClient.cacheGet(CacheKey.last4);
  }

  public com.clover.sdk.v3.payments.CardTransactionType getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  /**
   * Authorization code (if successful)
   */
  public java.lang.String getAuthCode() {
    return genClient.cacheGet(CacheKey.authCode);
  }

  public java.lang.String getReferenceId() {
    return genClient.cacheGet(CacheKey.referenceId);
  }

  public java.lang.String getTransactionNo() {
    return genClient.cacheGet(CacheKey.transactionNo);
  }

  public com.clover.sdk.v3.payments.CardTransactionState getState() {
    return genClient.cacheGet(CacheKey.state);
  }

  /**
   * Extra info to be stored as part of gateway/card transaction
   */
  public java.util.Map<java.lang.String,java.lang.String> getExtra() {
    return genClient.cacheGet(CacheKey.extra);
  }

  public java.lang.Long getBegBalance() {
    return genClient.cacheGet(CacheKey.begBalance);
  }

  public java.lang.Long getEndBalance() {
    return genClient.cacheGet(CacheKey.endBalance);
  }

  public com.clover.sdk.v3.payments.AVSResult getAvsResult() {
    return genClient.cacheGet(CacheKey.avsResult);
  }

  public java.lang.String getCardholderName() {
    return genClient.cacheGet(CacheKey.cardholderName);
  }

  public java.lang.String getToken() {
    return genClient.cacheGet(CacheKey.token);
  }

  /**
   * Vaulted card which can be used for subsequent transactions
   */
  public com.clover.sdk.v3.payments.VaultedCard getVaultedCard() {
    return genClient.cacheGet(CacheKey.vaultedCard);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<CardTransaction> {
    cardType {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractEnum("cardType", com.clover.sdk.v3.payments.CardType.class);
      }
    },
    entryType {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractEnum("entryType", com.clover.sdk.v3.payments.CardEntryType.class);
      }
    },
    first6 {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("first6", java.lang.String.class);
      }
    },
    last4 {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("last4", java.lang.String.class);
      }
    },
    type {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractEnum("type", com.clover.sdk.v3.payments.CardTransactionType.class);
      }
    },
    authCode {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("authCode", java.lang.String.class);
      }
    },
    referenceId {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("referenceId", java.lang.String.class);
      }
    },
    transactionNo {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("transactionNo", java.lang.String.class);
      }
    },
    state {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractEnum("state", com.clover.sdk.v3.payments.CardTransactionState.class);
      }
    },
    extra {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractMap("extra");
      }
    },
    begBalance {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("begBalance", java.lang.Long.class);
      }
    },
    endBalance {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("endBalance", java.lang.Long.class);
      }
    },
    avsResult {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractEnum("avsResult", com.clover.sdk.v3.payments.AVSResult.class);
      }
    },
    cardholderName {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("cardholderName", java.lang.String.class);
      }
    },
    token {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractOther("token", java.lang.String.class);
      }
    },
    vaultedCard {
      @Override
      public Object extractValue(CardTransaction instance) {
        return instance.genClient.extractRecord("vaultedCard", com.clover.sdk.v3.payments.VaultedCard.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<CardTransaction> genClient = new GenericClient<CardTransaction>(this);

  /**
   * Constructs a new empty instance.
   */
  public CardTransaction() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CardTransaction(String json) throws IllegalArgumentException {
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
  public CardTransaction(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CardTransaction(CardTransaction src) {
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

    genClient.validateLength(getFirst6(), 6);

    genClient.validateLength(getLast4(), 4);

    genClient.validateLength(getAuthCode(), 255);

    genClient.validateLength(getReferenceId(), 32);

    genClient.validateLength(getTransactionNo(), 255);

    genClient.validateLength(getToken(), 72);
  }

  /** Checks whether the 'cardType' field is set and is not null */
  public boolean isNotNullCardType() {
    return genClient.cacheValueIsNotNull(CacheKey.cardType);
  }

  /** Checks whether the 'entryType' field is set and is not null */
  public boolean isNotNullEntryType() {
    return genClient.cacheValueIsNotNull(CacheKey.entryType);
  }

  /** Checks whether the 'first6' field is set and is not null */
  public boolean isNotNullFirst6() {
    return genClient.cacheValueIsNotNull(CacheKey.first6);
  }

  /** Checks whether the 'last4' field is set and is not null */
  public boolean isNotNullLast4() {
    return genClient.cacheValueIsNotNull(CacheKey.last4);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'authCode' field is set and is not null */
  public boolean isNotNullAuthCode() {
    return genClient.cacheValueIsNotNull(CacheKey.authCode);
  }

  /** Checks whether the 'referenceId' field is set and is not null */
  public boolean isNotNullReferenceId() {
    return genClient.cacheValueIsNotNull(CacheKey.referenceId);
  }

  /** Checks whether the 'transactionNo' field is set and is not null */
  public boolean isNotNullTransactionNo() {
    return genClient.cacheValueIsNotNull(CacheKey.transactionNo);
  }

  /** Checks whether the 'state' field is set and is not null */
  public boolean isNotNullState() {
    return genClient.cacheValueIsNotNull(CacheKey.state);
  }

  /** Checks whether the 'extra' field is set and is not null */
  public boolean isNotNullExtra() {
    return genClient.cacheValueIsNotNull(CacheKey.extra);
  }

  /** Checks whether the 'extra' field is set and is not null and is not empty */
  public boolean isNotEmptyExtra() { return isNotNullExtra() && !getExtra().isEmpty(); }

  /** Checks whether the 'begBalance' field is set and is not null */
  public boolean isNotNullBegBalance() {
    return genClient.cacheValueIsNotNull(CacheKey.begBalance);
  }

  /** Checks whether the 'endBalance' field is set and is not null */
  public boolean isNotNullEndBalance() {
    return genClient.cacheValueIsNotNull(CacheKey.endBalance);
  }

  /** Checks whether the 'avsResult' field is set and is not null */
  public boolean isNotNullAvsResult() {
    return genClient.cacheValueIsNotNull(CacheKey.avsResult);
  }

  /** Checks whether the 'cardholderName' field is set and is not null */
  public boolean isNotNullCardholderName() {
    return genClient.cacheValueIsNotNull(CacheKey.cardholderName);
  }

  /** Checks whether the 'token' field is set and is not null */
  public boolean isNotNullToken() {
    return genClient.cacheValueIsNotNull(CacheKey.token);
  }

  /** Checks whether the 'vaultedCard' field is set and is not null */
  public boolean isNotNullVaultedCard() {
    return genClient.cacheValueIsNotNull(CacheKey.vaultedCard);
  }


  /** Checks whether the 'cardType' field has been set, however the value could be null */
  public boolean hasCardType() {
    return genClient.cacheHasKey(CacheKey.cardType);
  }

  /** Checks whether the 'entryType' field has been set, however the value could be null */
  public boolean hasEntryType() {
    return genClient.cacheHasKey(CacheKey.entryType);
  }

  /** Checks whether the 'first6' field has been set, however the value could be null */
  public boolean hasFirst6() {
    return genClient.cacheHasKey(CacheKey.first6);
  }

  /** Checks whether the 'last4' field has been set, however the value could be null */
  public boolean hasLast4() {
    return genClient.cacheHasKey(CacheKey.last4);
  }

  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'authCode' field has been set, however the value could be null */
  public boolean hasAuthCode() {
    return genClient.cacheHasKey(CacheKey.authCode);
  }

  /** Checks whether the 'referenceId' field has been set, however the value could be null */
  public boolean hasReferenceId() {
    return genClient.cacheHasKey(CacheKey.referenceId);
  }

  /** Checks whether the 'transactionNo' field has been set, however the value could be null */
  public boolean hasTransactionNo() {
    return genClient.cacheHasKey(CacheKey.transactionNo);
  }

  /** Checks whether the 'state' field has been set, however the value could be null */
  public boolean hasState() {
    return genClient.cacheHasKey(CacheKey.state);
  }

  /** Checks whether the 'extra' field has been set, however the value could be null */
  public boolean hasExtra() {
    return genClient.cacheHasKey(CacheKey.extra);
  }

  /** Checks whether the 'begBalance' field has been set, however the value could be null */
  public boolean hasBegBalance() {
    return genClient.cacheHasKey(CacheKey.begBalance);
  }

  /** Checks whether the 'endBalance' field has been set, however the value could be null */
  public boolean hasEndBalance() {
    return genClient.cacheHasKey(CacheKey.endBalance);
  }

  /** Checks whether the 'avsResult' field has been set, however the value could be null */
  public boolean hasAvsResult() {
    return genClient.cacheHasKey(CacheKey.avsResult);
  }

  /** Checks whether the 'cardholderName' field has been set, however the value could be null */
  public boolean hasCardholderName() {
    return genClient.cacheHasKey(CacheKey.cardholderName);
  }

  /** Checks whether the 'token' field has been set, however the value could be null */
  public boolean hasToken() {
    return genClient.cacheHasKey(CacheKey.token);
  }

  /** Checks whether the 'vaultedCard' field has been set, however the value could be null */
  public boolean hasVaultedCard() {
    return genClient.cacheHasKey(CacheKey.vaultedCard);
  }


  /**
   * Sets the field 'cardType'.
   */
  public CardTransaction setCardType(com.clover.sdk.v3.payments.CardType cardType) {
    return genClient.setOther(cardType, CacheKey.cardType);
  }

  /**
   * Sets the field 'entryType'.
   */
  public CardTransaction setEntryType(com.clover.sdk.v3.payments.CardEntryType entryType) {
    return genClient.setOther(entryType, CacheKey.entryType);
  }

  /**
   * Sets the field 'first6'.
   */
  public CardTransaction setFirst6(java.lang.String first6) {
    return genClient.setOther(first6, CacheKey.first6);
  }

  /**
   * Sets the field 'last4'.
   */
  public CardTransaction setLast4(java.lang.String last4) {
    return genClient.setOther(last4, CacheKey.last4);
  }

  /**
   * Sets the field 'type'.
   */
  public CardTransaction setType(com.clover.sdk.v3.payments.CardTransactionType type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'authCode'.
   */
  public CardTransaction setAuthCode(java.lang.String authCode) {
    return genClient.setOther(authCode, CacheKey.authCode);
  }

  /**
   * Sets the field 'referenceId'.
   */
  public CardTransaction setReferenceId(java.lang.String referenceId) {
    return genClient.setOther(referenceId, CacheKey.referenceId);
  }

  /**
   * Sets the field 'transactionNo'.
   */
  public CardTransaction setTransactionNo(java.lang.String transactionNo) {
    return genClient.setOther(transactionNo, CacheKey.transactionNo);
  }

  /**
   * Sets the field 'state'.
   */
  public CardTransaction setState(com.clover.sdk.v3.payments.CardTransactionState state) {
    return genClient.setOther(state, CacheKey.state);
  }

  /**
   * Sets the field 'extra'.
   */
  public CardTransaction setExtra(java.util.Map<java.lang.String,java.lang.String> extra) {
    return genClient.setOther(extra, CacheKey.extra);
  }

  /**
   * Sets the field 'begBalance'.
   */
  public CardTransaction setBegBalance(java.lang.Long begBalance) {
    return genClient.setOther(begBalance, CacheKey.begBalance);
  }

  /**
   * Sets the field 'endBalance'.
   */
  public CardTransaction setEndBalance(java.lang.Long endBalance) {
    return genClient.setOther(endBalance, CacheKey.endBalance);
  }

  /**
   * Sets the field 'avsResult'.
   */
  public CardTransaction setAvsResult(com.clover.sdk.v3.payments.AVSResult avsResult) {
    return genClient.setOther(avsResult, CacheKey.avsResult);
  }

  /**
   * Sets the field 'cardholderName'.
   */
  public CardTransaction setCardholderName(java.lang.String cardholderName) {
    return genClient.setOther(cardholderName, CacheKey.cardholderName);
  }

  /**
   * Sets the field 'token'.
   */
  public CardTransaction setToken(java.lang.String token) {
    return genClient.setOther(token, CacheKey.token);
  }

  /**
   * Sets the field 'vaultedCard'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CardTransaction setVaultedCard(com.clover.sdk.v3.payments.VaultedCard vaultedCard) {
    return genClient.setRecord(vaultedCard, CacheKey.vaultedCard);
  }


  /** Clears the 'cardType' field, the 'has' method for this field will now return false */
  public void clearCardType() {
    genClient.clear(CacheKey.cardType);
  }
  /** Clears the 'entryType' field, the 'has' method for this field will now return false */
  public void clearEntryType() {
    genClient.clear(CacheKey.entryType);
  }
  /** Clears the 'first6' field, the 'has' method for this field will now return false */
  public void clearFirst6() {
    genClient.clear(CacheKey.first6);
  }
  /** Clears the 'last4' field, the 'has' method for this field will now return false */
  public void clearLast4() {
    genClient.clear(CacheKey.last4);
  }
  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'authCode' field, the 'has' method for this field will now return false */
  public void clearAuthCode() {
    genClient.clear(CacheKey.authCode);
  }
  /** Clears the 'referenceId' field, the 'has' method for this field will now return false */
  public void clearReferenceId() {
    genClient.clear(CacheKey.referenceId);
  }
  /** Clears the 'transactionNo' field, the 'has' method for this field will now return false */
  public void clearTransactionNo() {
    genClient.clear(CacheKey.transactionNo);
  }
  /** Clears the 'state' field, the 'has' method for this field will now return false */
  public void clearState() {
    genClient.clear(CacheKey.state);
  }
  /** Clears the 'extra' field, the 'has' method for this field will now return false */
  public void clearExtra() {
    genClient.clear(CacheKey.extra);
  }
  /** Clears the 'begBalance' field, the 'has' method for this field will now return false */
  public void clearBegBalance() {
    genClient.clear(CacheKey.begBalance);
  }
  /** Clears the 'endBalance' field, the 'has' method for this field will now return false */
  public void clearEndBalance() {
    genClient.clear(CacheKey.endBalance);
  }
  /** Clears the 'avsResult' field, the 'has' method for this field will now return false */
  public void clearAvsResult() {
    genClient.clear(CacheKey.avsResult);
  }
  /** Clears the 'cardholderName' field, the 'has' method for this field will now return false */
  public void clearCardholderName() {
    genClient.clear(CacheKey.cardholderName);
  }
  /** Clears the 'token' field, the 'has' method for this field will now return false */
  public void clearToken() {
    genClient.clear(CacheKey.token);
  }
  /** Clears the 'vaultedCard' field, the 'has' method for this field will now return false */
  public void clearVaultedCard() {
    genClient.clear(CacheKey.vaultedCard);
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
  public CardTransaction copyChanges() {
    CardTransaction copy = new CardTransaction();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CardTransaction src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CardTransaction(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<CardTransaction> CREATOR = new android.os.Parcelable.Creator<CardTransaction>() {
    @Override
    public CardTransaction createFromParcel(android.os.Parcel in) {
      CardTransaction instance = new CardTransaction(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CardTransaction[] newArray(int size) {
      return new CardTransaction[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CardTransaction> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CardTransaction>() {
    @Override
    public CardTransaction create(org.json.JSONObject jsonObject) {
      return new CardTransaction(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean CARDTYPE_IS_REQUIRED = false;

    public static final boolean ENTRYTYPE_IS_REQUIRED = false;

    public static final boolean FIRST6_IS_REQUIRED = false;
    public static final long FIRST6_MAX_LEN = 6;

    public static final boolean LAST4_IS_REQUIRED = false;
    public static final long LAST4_MAX_LEN = 4;

    public static final boolean TYPE_IS_REQUIRED = false;

    public static final boolean AUTHCODE_IS_REQUIRED = false;
    public static final long AUTHCODE_MAX_LEN = 255;

    public static final boolean REFERENCEID_IS_REQUIRED = false;
    public static final long REFERENCEID_MAX_LEN = 32;

    public static final boolean TRANSACTIONNO_IS_REQUIRED = false;
    public static final long TRANSACTIONNO_MAX_LEN = 255;

    public static final boolean STATE_IS_REQUIRED = false;

    public static final boolean EXTRA_IS_REQUIRED = false;

    public static final boolean BEGBALANCE_IS_REQUIRED = false;

    public static final boolean ENDBALANCE_IS_REQUIRED = false;

    public static final boolean AVSRESULT_IS_REQUIRED = false;

    public static final boolean CARDHOLDERNAME_IS_REQUIRED = false;

    public static final boolean TOKEN_IS_REQUIRED = false;
    public static final long TOKEN_MAX_LEN = 72;

    public static final boolean VAULTEDCARD_IS_REQUIRED = false;

  }

}
