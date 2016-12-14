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

package com.clover.sdk.v3.inventory;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getSortOrder sortOrder}</li>
 * <li>{@link #getItems items}</li>
 * </ul>
 * <p>
 * @see com.clover.sdk.v3.inventory.IInventoryService
 */
@SuppressWarnings("all")
public final class Category implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * The name of the category which will appear in Clover Register App.
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * Integer used to determine how this category is sorted against other categories.
   */
  public java.lang.Integer getSortOrder() {
    return genClient.cacheGet(CacheKey.sortOrder);
  }

  /**
   * Ordered list of items associated with this category.
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getItems() {
    return genClient.cacheGet(CacheKey.items);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Category> {
    id {
      @Override
      public Object extractValue(Category instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Category instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    sortOrder {
      @Override
      public Object extractValue(Category instance) {
        return instance.genClient.extractOther("sortOrder", java.lang.Integer.class);
      }
    },
    items {
      @Override
      public Object extractValue(Category instance) {
        return instance.genClient.extractListRecord("items", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Category> genClient = new GenericClient<Category>(this);

  /**
   * Constructs a new empty instance.
   */
  public Category() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Category(String json) throws IllegalArgumentException {
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
  public Category(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Category(Category src) {
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

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 127);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'sortOrder' field is set and is not null */
  public boolean isNotNullSortOrder() {
    return genClient.cacheValueIsNotNull(CacheKey.sortOrder);
  }

  /** Checks whether the 'items' field is set and is not null */
  public boolean isNotNullItems() {
    return genClient.cacheValueIsNotNull(CacheKey.items);
  }

  /** Checks whether the 'items' field is set and is not null and is not empty */
  public boolean isNotEmptyItems() { return isNotNullItems() && !getItems().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'sortOrder' field has been set, however the value could be null */
  public boolean hasSortOrder() {
    return genClient.cacheHasKey(CacheKey.sortOrder);
  }

  /** Checks whether the 'items' field has been set, however the value could be null */
  public boolean hasItems() {
    return genClient.cacheHasKey(CacheKey.items);
  }


  /**
   * Sets the field 'id'.
   */
  public Category setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Category setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'sortOrder'.
   */
  public Category setSortOrder(java.lang.Integer sortOrder) {
    return genClient.setOther(sortOrder, CacheKey.sortOrder);
  }

  /**
   * Sets the field 'items'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Category setItems(java.util.List<com.clover.sdk.v3.base.Reference> items) {
    return genClient.setArrayRecord(items, CacheKey.items);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'sortOrder' field, the 'has' method for this field will now return false */
  public void clearSortOrder() {
    genClient.clear(CacheKey.sortOrder);
  }
  /** Clears the 'items' field, the 'has' method for this field will now return false */
  public void clearItems() {
    genClient.clear(CacheKey.items);
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
  public Category copyChanges() {
    Category copy = new Category();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Category src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Category(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Category> CREATOR = new android.os.Parcelable.Creator<Category>() {
    @Override
    public Category createFromParcel(android.os.Parcel in) {
      Category instance = new Category(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Category[] newArray(int size) {
      return new Category[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Category> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Category>() {
    @Override
    public Category create(org.json.JSONObject jsonObject) {
      return new Category(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean SORTORDER_IS_REQUIRED = false;

    public static final boolean ITEMS_IS_REQUIRED = false;

  }

}
