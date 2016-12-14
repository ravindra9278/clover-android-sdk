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

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getLabelKey labelKey}</li>
 * <li>{@link #getLabel label}</li>
 * <li>{@link #getTaxable taxable}</li>
 * <li>{@link #getIsDefault isDefault}</li>
 * <li>{@link #getFilterCategories filterCategories}</li>
 * <li>{@link #getIsHidden isHidden}</li>
 * <li>{@link #getFee fee}</li>
 * <li>{@link #getMinOrderAmount minOrderAmount}</li>
 * <li>{@link #getMaxOrderAmount maxOrderAmount}</li>
 * <li>{@link #getMaxRadius maxRadius}</li>
 * <li>{@link #getAvgOrderTime avgOrderTime}</li>
 * <li>{@link #getHoursAvailable hoursAvailable}</li>
 * <li>{@link #getCustomerIdMethod customerIdMethod}</li>
 * <li>{@link #getIsDeleted isDeleted}</li>
 * <li>{@link #getSystemOrderTypeId systemOrderTypeId}</li>
 * <li>{@link #getHours hours}</li>
 * <li>{@link #getCategories categories}</li>
 * </ul>
 * <p>
 * @see com.clover.sdk.v3.order.IOrderService
 */
@SuppressWarnings("all")
public final class OrderType implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Label Key
   */
  public java.lang.String getLabelKey() {
    return genClient.cacheGet(CacheKey.labelKey);
  }

  /**
   * Label Key
   */
  public java.lang.String getLabel() {
    return genClient.cacheGet(CacheKey.label);
  }

  /**
   * If this order type is taxable
   */
  public java.lang.Boolean getTaxable() {
    return genClient.cacheGet(CacheKey.taxable);
  }

  /**
   * If this order type is the default
   */
  public java.lang.Boolean getIsDefault() {
    return genClient.cacheGet(CacheKey.isDefault);
  }

  /**
   * If set to false, then this order type includes all of the merchant's categories. Otherwise, it only contains the categories defined in the "categories" field on this object.
   */
  public java.lang.Boolean getFilterCategories() {
    return genClient.cacheGet(CacheKey.filterCategories);
  }

  /**
   * If this order type is hidden on the register
   */
  public java.lang.Boolean getIsHidden() {
    return genClient.cacheGet(CacheKey.isHidden);
  }

  /**
   * The price of a fee added to this order type, not fully implemented at this time.
   */
  public java.lang.Long getFee() {
    return genClient.cacheGet(CacheKey.fee);
  }

  /**
   * The minimum amount required for an order to be placed
   */
  public java.lang.Long getMinOrderAmount() {
    return genClient.cacheGet(CacheKey.minOrderAmount);
  }

  /**
   * The maximum amount for an order allowed
   */
  public java.lang.Long getMaxOrderAmount() {
    return genClient.cacheGet(CacheKey.maxOrderAmount);
  }

  /**
   * The maximum radius allowed for an order (i.e. delivery)
   */
  public java.lang.Long getMaxRadius() {
    return genClient.cacheGet(CacheKey.maxRadius);
  }

  /**
   * The average time it takes to complete the order
   */
  public java.lang.Long getAvgOrderTime() {
    return genClient.cacheGet(CacheKey.avgOrderTime);
  }

  public com.clover.sdk.v3.order.HoursAvailable getHoursAvailable() {
    return genClient.cacheGet(CacheKey.hoursAvailable);
  }

  public com.clover.sdk.v3.order.CustomerIdMethod getCustomerIdMethod() {
    return genClient.cacheGet(CacheKey.customerIdMethod);
  }

  /**
   * If this order type is deleted
   */
  public java.lang.Boolean getIsDeleted() {
    return genClient.cacheGet(CacheKey.isDeleted);
  }

  /**
   * Optional system order type that this order type is associated with.
   */
  public java.lang.String getSystemOrderTypeId() {
    return genClient.cacheGet(CacheKey.systemOrderTypeId);
  }

  /**
   * The hours this order type is available (if they differ from normal merchant hours)
   */
  public com.clover.sdk.v3.hours.HoursSet getHours() {
    return genClient.cacheGet(CacheKey.hours);
  }

  /**
   * The categories of items that can be assigned to this order type
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getCategories() {
    return genClient.cacheGet(CacheKey.categories);
  }


  public static final String AUTHORITY = "com.clover.merchants";

  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<OrderType> {
    id {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    labelKey {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("labelKey", java.lang.String.class);
      }
    },
    label {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("label", java.lang.String.class);
      }
    },
    taxable {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("taxable", java.lang.Boolean.class);
      }
    },
    isDefault {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("isDefault", java.lang.Boolean.class);
      }
    },
    filterCategories {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("filterCategories", java.lang.Boolean.class);
      }
    },
    isHidden {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("isHidden", java.lang.Boolean.class);
      }
    },
    fee {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("fee", java.lang.Long.class);
      }
    },
    minOrderAmount {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("minOrderAmount", java.lang.Long.class);
      }
    },
    maxOrderAmount {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("maxOrderAmount", java.lang.Long.class);
      }
    },
    maxRadius {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("maxRadius", java.lang.Long.class);
      }
    },
    avgOrderTime {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("avgOrderTime", java.lang.Long.class);
      }
    },
    hoursAvailable {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractEnum("hoursAvailable", com.clover.sdk.v3.order.HoursAvailable.class);
      }
    },
    customerIdMethod {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractEnum("customerIdMethod", com.clover.sdk.v3.order.CustomerIdMethod.class);
      }
    },
    isDeleted {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("isDeleted", java.lang.Boolean.class);
      }
    },
    systemOrderTypeId {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractOther("systemOrderTypeId", java.lang.String.class);
      }
    },
    hours {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractRecord("hours", com.clover.sdk.v3.hours.HoursSet.JSON_CREATOR);
      }
    },
    categories {
      @Override
      public Object extractValue(OrderType instance) {
        return instance.genClient.extractListRecord("categories", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<OrderType> genClient = new GenericClient<OrderType>(this);

  /**
   * Constructs a new empty instance.
   */
  public OrderType() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public OrderType(String json) throws IllegalArgumentException {
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
  public OrderType(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public OrderType(OrderType src) {
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

    genClient.validateLength(getLabelKey(), 127);

    genClient.validateLength(getLabel(), 127);

    if (getFee() != null && ( getFee() < 0)) throw new IllegalArgumentException("Invalid value for 'getFee()'");

    if (getMinOrderAmount() != null && ( getMinOrderAmount() < 0)) throw new IllegalArgumentException("Invalid value for 'getMinOrderAmount()'");

    if (getMaxOrderAmount() != null && ( getMaxOrderAmount() < 0)) throw new IllegalArgumentException("Invalid value for 'getMaxOrderAmount()'");

    if (getMaxRadius() != null && ( getMaxRadius() < 0)) throw new IllegalArgumentException("Invalid value for 'getMaxRadius()'");

    if (getAvgOrderTime() != null && ( getAvgOrderTime() < 0)) throw new IllegalArgumentException("Invalid value for 'getAvgOrderTime()'");

    genClient.validateLength(getSystemOrderTypeId(), 13);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'labelKey' field is set and is not null */
  public boolean isNotNullLabelKey() {
    return genClient.cacheValueIsNotNull(CacheKey.labelKey);
  }

  /** Checks whether the 'label' field is set and is not null */
  public boolean isNotNullLabel() {
    return genClient.cacheValueIsNotNull(CacheKey.label);
  }

  /** Checks whether the 'taxable' field is set and is not null */
  public boolean isNotNullTaxable() {
    return genClient.cacheValueIsNotNull(CacheKey.taxable);
  }

  /** Checks whether the 'isDefault' field is set and is not null */
  public boolean isNotNullIsDefault() {
    return genClient.cacheValueIsNotNull(CacheKey.isDefault);
  }

  /** Checks whether the 'filterCategories' field is set and is not null */
  public boolean isNotNullFilterCategories() {
    return genClient.cacheValueIsNotNull(CacheKey.filterCategories);
  }

  /** Checks whether the 'isHidden' field is set and is not null */
  public boolean isNotNullIsHidden() {
    return genClient.cacheValueIsNotNull(CacheKey.isHidden);
  }

  /** Checks whether the 'fee' field is set and is not null */
  public boolean isNotNullFee() {
    return genClient.cacheValueIsNotNull(CacheKey.fee);
  }

  /** Checks whether the 'minOrderAmount' field is set and is not null */
  public boolean isNotNullMinOrderAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.minOrderAmount);
  }

  /** Checks whether the 'maxOrderAmount' field is set and is not null */
  public boolean isNotNullMaxOrderAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.maxOrderAmount);
  }

  /** Checks whether the 'maxRadius' field is set and is not null */
  public boolean isNotNullMaxRadius() {
    return genClient.cacheValueIsNotNull(CacheKey.maxRadius);
  }

  /** Checks whether the 'avgOrderTime' field is set and is not null */
  public boolean isNotNullAvgOrderTime() {
    return genClient.cacheValueIsNotNull(CacheKey.avgOrderTime);
  }

  /** Checks whether the 'hoursAvailable' field is set and is not null */
  public boolean isNotNullHoursAvailable() {
    return genClient.cacheValueIsNotNull(CacheKey.hoursAvailable);
  }

  /** Checks whether the 'customerIdMethod' field is set and is not null */
  public boolean isNotNullCustomerIdMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.customerIdMethod);
  }

  /** Checks whether the 'isDeleted' field is set and is not null */
  public boolean isNotNullIsDeleted() {
    return genClient.cacheValueIsNotNull(CacheKey.isDeleted);
  }

  /** Checks whether the 'systemOrderTypeId' field is set and is not null */
  public boolean isNotNullSystemOrderTypeId() {
    return genClient.cacheValueIsNotNull(CacheKey.systemOrderTypeId);
  }

  /** Checks whether the 'hours' field is set and is not null */
  public boolean isNotNullHours() {
    return genClient.cacheValueIsNotNull(CacheKey.hours);
  }

  /** Checks whether the 'categories' field is set and is not null */
  public boolean isNotNullCategories() {
    return genClient.cacheValueIsNotNull(CacheKey.categories);
  }

  /** Checks whether the 'categories' field is set and is not null and is not empty */
  public boolean isNotEmptyCategories() { return isNotNullCategories() && !getCategories().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'labelKey' field has been set, however the value could be null */
  public boolean hasLabelKey() {
    return genClient.cacheHasKey(CacheKey.labelKey);
  }

  /** Checks whether the 'label' field has been set, however the value could be null */
  public boolean hasLabel() {
    return genClient.cacheHasKey(CacheKey.label);
  }

  /** Checks whether the 'taxable' field has been set, however the value could be null */
  public boolean hasTaxable() {
    return genClient.cacheHasKey(CacheKey.taxable);
  }

  /** Checks whether the 'isDefault' field has been set, however the value could be null */
  public boolean hasIsDefault() {
    return genClient.cacheHasKey(CacheKey.isDefault);
  }

  /** Checks whether the 'filterCategories' field has been set, however the value could be null */
  public boolean hasFilterCategories() {
    return genClient.cacheHasKey(CacheKey.filterCategories);
  }

  /** Checks whether the 'isHidden' field has been set, however the value could be null */
  public boolean hasIsHidden() {
    return genClient.cacheHasKey(CacheKey.isHidden);
  }

  /** Checks whether the 'fee' field has been set, however the value could be null */
  public boolean hasFee() {
    return genClient.cacheHasKey(CacheKey.fee);
  }

  /** Checks whether the 'minOrderAmount' field has been set, however the value could be null */
  public boolean hasMinOrderAmount() {
    return genClient.cacheHasKey(CacheKey.minOrderAmount);
  }

  /** Checks whether the 'maxOrderAmount' field has been set, however the value could be null */
  public boolean hasMaxOrderAmount() {
    return genClient.cacheHasKey(CacheKey.maxOrderAmount);
  }

  /** Checks whether the 'maxRadius' field has been set, however the value could be null */
  public boolean hasMaxRadius() {
    return genClient.cacheHasKey(CacheKey.maxRadius);
  }

  /** Checks whether the 'avgOrderTime' field has been set, however the value could be null */
  public boolean hasAvgOrderTime() {
    return genClient.cacheHasKey(CacheKey.avgOrderTime);
  }

  /** Checks whether the 'hoursAvailable' field has been set, however the value could be null */
  public boolean hasHoursAvailable() {
    return genClient.cacheHasKey(CacheKey.hoursAvailable);
  }

  /** Checks whether the 'customerIdMethod' field has been set, however the value could be null */
  public boolean hasCustomerIdMethod() {
    return genClient.cacheHasKey(CacheKey.customerIdMethod);
  }

  /** Checks whether the 'isDeleted' field has been set, however the value could be null */
  public boolean hasIsDeleted() {
    return genClient.cacheHasKey(CacheKey.isDeleted);
  }

  /** Checks whether the 'systemOrderTypeId' field has been set, however the value could be null */
  public boolean hasSystemOrderTypeId() {
    return genClient.cacheHasKey(CacheKey.systemOrderTypeId);
  }

  /** Checks whether the 'hours' field has been set, however the value could be null */
  public boolean hasHours() {
    return genClient.cacheHasKey(CacheKey.hours);
  }

  /** Checks whether the 'categories' field has been set, however the value could be null */
  public boolean hasCategories() {
    return genClient.cacheHasKey(CacheKey.categories);
  }


  /**
   * Sets the field 'id'.
   */
  public OrderType setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'labelKey'.
   */
  public OrderType setLabelKey(java.lang.String labelKey) {
    return genClient.setOther(labelKey, CacheKey.labelKey);
  }

  /**
   * Sets the field 'label'.
   */
  public OrderType setLabel(java.lang.String label) {
    return genClient.setOther(label, CacheKey.label);
  }

  /**
   * Sets the field 'taxable'.
   */
  public OrderType setTaxable(java.lang.Boolean taxable) {
    return genClient.setOther(taxable, CacheKey.taxable);
  }

  /**
   * Sets the field 'isDefault'.
   */
  public OrderType setIsDefault(java.lang.Boolean isDefault) {
    return genClient.setOther(isDefault, CacheKey.isDefault);
  }

  /**
   * Sets the field 'filterCategories'.
   */
  public OrderType setFilterCategories(java.lang.Boolean filterCategories) {
    return genClient.setOther(filterCategories, CacheKey.filterCategories);
  }

  /**
   * Sets the field 'isHidden'.
   */
  public OrderType setIsHidden(java.lang.Boolean isHidden) {
    return genClient.setOther(isHidden, CacheKey.isHidden);
  }

  /**
   * Sets the field 'fee'.
   */
  public OrderType setFee(java.lang.Long fee) {
    return genClient.setOther(fee, CacheKey.fee);
  }

  /**
   * Sets the field 'minOrderAmount'.
   */
  public OrderType setMinOrderAmount(java.lang.Long minOrderAmount) {
    return genClient.setOther(minOrderAmount, CacheKey.minOrderAmount);
  }

  /**
   * Sets the field 'maxOrderAmount'.
   */
  public OrderType setMaxOrderAmount(java.lang.Long maxOrderAmount) {
    return genClient.setOther(maxOrderAmount, CacheKey.maxOrderAmount);
  }

  /**
   * Sets the field 'maxRadius'.
   */
  public OrderType setMaxRadius(java.lang.Long maxRadius) {
    return genClient.setOther(maxRadius, CacheKey.maxRadius);
  }

  /**
   * Sets the field 'avgOrderTime'.
   */
  public OrderType setAvgOrderTime(java.lang.Long avgOrderTime) {
    return genClient.setOther(avgOrderTime, CacheKey.avgOrderTime);
  }

  /**
   * Sets the field 'hoursAvailable'.
   */
  public OrderType setHoursAvailable(com.clover.sdk.v3.order.HoursAvailable hoursAvailable) {
    return genClient.setOther(hoursAvailable, CacheKey.hoursAvailable);
  }

  /**
   * Sets the field 'customerIdMethod'.
   */
  public OrderType setCustomerIdMethod(com.clover.sdk.v3.order.CustomerIdMethod customerIdMethod) {
    return genClient.setOther(customerIdMethod, CacheKey.customerIdMethod);
  }

  /**
   * Sets the field 'isDeleted'.
   */
  public OrderType setIsDeleted(java.lang.Boolean isDeleted) {
    return genClient.setOther(isDeleted, CacheKey.isDeleted);
  }

  /**
   * Sets the field 'systemOrderTypeId'.
   */
  public OrderType setSystemOrderTypeId(java.lang.String systemOrderTypeId) {
    return genClient.setOther(systemOrderTypeId, CacheKey.systemOrderTypeId);
  }

  /**
   * Sets the field 'hours'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public OrderType setHours(com.clover.sdk.v3.hours.HoursSet hours) {
    return genClient.setRecord(hours, CacheKey.hours);
  }

  /**
   * Sets the field 'categories'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public OrderType setCategories(java.util.List<com.clover.sdk.v3.base.Reference> categories) {
    return genClient.setArrayRecord(categories, CacheKey.categories);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'labelKey' field, the 'has' method for this field will now return false */
  public void clearLabelKey() {
    genClient.clear(CacheKey.labelKey);
  }
  /** Clears the 'label' field, the 'has' method for this field will now return false */
  public void clearLabel() {
    genClient.clear(CacheKey.label);
  }
  /** Clears the 'taxable' field, the 'has' method for this field will now return false */
  public void clearTaxable() {
    genClient.clear(CacheKey.taxable);
  }
  /** Clears the 'isDefault' field, the 'has' method for this field will now return false */
  public void clearIsDefault() {
    genClient.clear(CacheKey.isDefault);
  }
  /** Clears the 'filterCategories' field, the 'has' method for this field will now return false */
  public void clearFilterCategories() {
    genClient.clear(CacheKey.filterCategories);
  }
  /** Clears the 'isHidden' field, the 'has' method for this field will now return false */
  public void clearIsHidden() {
    genClient.clear(CacheKey.isHidden);
  }
  /** Clears the 'fee' field, the 'has' method for this field will now return false */
  public void clearFee() {
    genClient.clear(CacheKey.fee);
  }
  /** Clears the 'minOrderAmount' field, the 'has' method for this field will now return false */
  public void clearMinOrderAmount() {
    genClient.clear(CacheKey.minOrderAmount);
  }
  /** Clears the 'maxOrderAmount' field, the 'has' method for this field will now return false */
  public void clearMaxOrderAmount() {
    genClient.clear(CacheKey.maxOrderAmount);
  }
  /** Clears the 'maxRadius' field, the 'has' method for this field will now return false */
  public void clearMaxRadius() {
    genClient.clear(CacheKey.maxRadius);
  }
  /** Clears the 'avgOrderTime' field, the 'has' method for this field will now return false */
  public void clearAvgOrderTime() {
    genClient.clear(CacheKey.avgOrderTime);
  }
  /** Clears the 'hoursAvailable' field, the 'has' method for this field will now return false */
  public void clearHoursAvailable() {
    genClient.clear(CacheKey.hoursAvailable);
  }
  /** Clears the 'customerIdMethod' field, the 'has' method for this field will now return false */
  public void clearCustomerIdMethod() {
    genClient.clear(CacheKey.customerIdMethod);
  }
  /** Clears the 'isDeleted' field, the 'has' method for this field will now return false */
  public void clearIsDeleted() {
    genClient.clear(CacheKey.isDeleted);
  }
  /** Clears the 'systemOrderTypeId' field, the 'has' method for this field will now return false */
  public void clearSystemOrderTypeId() {
    genClient.clear(CacheKey.systemOrderTypeId);
  }
  /** Clears the 'hours' field, the 'has' method for this field will now return false */
  public void clearHours() {
    genClient.clear(CacheKey.hours);
  }
  /** Clears the 'categories' field, the 'has' method for this field will now return false */
  public void clearCategories() {
    genClient.clear(CacheKey.categories);
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
  public OrderType copyChanges() {
    OrderType copy = new OrderType();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(OrderType src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new OrderType(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<OrderType> CREATOR = new android.os.Parcelable.Creator<OrderType>() {
    @Override
    public OrderType createFromParcel(android.os.Parcel in) {
      OrderType instance = new OrderType(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public OrderType[] newArray(int size) {
      return new OrderType[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<OrderType> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<OrderType>() {
    @Override
    public OrderType create(org.json.JSONObject jsonObject) {
      return new OrderType(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean LABELKEY_IS_REQUIRED = false;
    public static final long LABELKEY_MAX_LEN = 127;

    public static final boolean LABEL_IS_REQUIRED = false;
    public static final long LABEL_MAX_LEN = 127;

    public static final boolean TAXABLE_IS_REQUIRED = false;

    public static final boolean ISDEFAULT_IS_REQUIRED = false;

    public static final boolean FILTERCATEGORIES_IS_REQUIRED = false;

    public static final boolean ISHIDDEN_IS_REQUIRED = false;

    public static final boolean FEE_IS_REQUIRED = false;
    public static final long FEE_MIN = 0;

    public static final boolean MINORDERAMOUNT_IS_REQUIRED = false;
    public static final long MINORDERAMOUNT_MIN = 0;

    public static final boolean MAXORDERAMOUNT_IS_REQUIRED = false;
    public static final long MAXORDERAMOUNT_MIN = 0;

    public static final boolean MAXRADIUS_IS_REQUIRED = false;
    public static final long MAXRADIUS_MIN = 0;

    public static final boolean AVGORDERTIME_IS_REQUIRED = false;
    public static final long AVGORDERTIME_MIN = 0;

    public static final boolean HOURSAVAILABLE_IS_REQUIRED = false;

    public static final boolean CUSTOMERIDMETHOD_IS_REQUIRED = false;

    public static final boolean ISDELETED_IS_REQUIRED = false;

    public static final boolean SYSTEMORDERTYPEID_IS_REQUIRED = false;
    public static final long SYSTEMORDERTYPEID_MAX_LEN = 13;

    public static final boolean HOURS_IS_REQUIRED = false;

    public static final boolean CATEGORIES_IS_REQUIRED = false;

  }

}
