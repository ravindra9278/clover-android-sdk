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

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getEnforcePlanAuthorization enforcePlanAuthorization}</li>
 * <li>{@link #getEnforceAdditionalAppsAuthorization enforceAdditionalAppsAuthorization}</li>
 * <li>{@link #getDisplayPlanRestrictionAlert displayPlanRestrictionAlert}</li>
 * <li>{@link #getNotifyPlanRestrictionAlert notifyPlanRestrictionAlert}</li>
 * <li>{@link #getDisplayDetailedPlanSelectionDescription displayDetailedPlanSelectionDescription}</li>
 * <li>{@link #getHighlightModel highlightModel}</li>
 * <li>{@link #getTosBillingModel tosBillingModel}</li>
 * <li>{@link #getDisplayRecommendedPlanOnServicePlansPage displayRecommendedPlanOnServicePlansPage}</li>
 * <li>{@link #getEnforceChoosePlan enforceChoosePlan}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantPlanRules extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Flag for OOBE whether or not to enforce plan authorization and how often.
   */
  public com.clover.sdk.v3.merchant.EnforcePlanAuthorization getEnforcePlanAuthorization() {
    return genClient.cacheGet(CacheKey.enforcePlanAuthorization);
  }

  /**
   * Flag for OOBE whether or not to show apps authorization.
   */
  public com.clover.sdk.v3.merchant.EnforceAdditionalAppsAuthorization getEnforceAdditionalAppsAuthorization() {
    return genClient.cacheGet(CacheKey.enforceAdditionalAppsAuthorization);
  }

  /**
   * Flag for OOBE whether or not to show special language about a force plan change based on device restrictions.
   */
  public java.lang.Boolean getDisplayPlanRestrictionAlert() {
    return genClient.cacheGet(CacheKey.displayPlanRestrictionAlert);
  }

  /**
   * Flag to control if notifications (like emails) are sent when a force plan change happens based on device restrictions.
   */
  public java.lang.Boolean getNotifyPlanRestrictionAlert() {
    return genClient.cacheGet(CacheKey.notifyPlanRestrictionAlert);
  }

  /**
   * Flag for OOBE and Service Plans page whether or not to show detailed plan pricing information for the plan selection screen
   */
  public java.lang.Boolean getDisplayDetailedPlanSelectionDescription() {
    return genClient.cacheGet(CacheKey.displayDetailedPlanSelectionDescription);
  }

  /**
   * keys/values specific to this endpoint/type
   */
  public java.util.Map<java.lang.String,java.lang.String> getHighlightModel() {
    return genClient.cacheGet(CacheKey.highlightModel);
  }

  public java.lang.String getTosBillingModel() {
    return genClient.cacheGet(CacheKey.tosBillingModel);
  }

  /**
   * Deprecated but must keep for few app OOBE cycles.
   */
  @Deprecated
  public java.lang.Boolean getDisplayRecommendedPlanOnServicePlansPage() {
    return genClient.cacheGet(CacheKey.displayRecommendedPlanOnServicePlansPage);
  }

  /**
   * Deprecated but must keep for few app OOBE cycles.
   */
  @Deprecated
  public java.lang.Boolean getEnforceChoosePlan() {
    return genClient.cacheGet(CacheKey.enforceChoosePlan);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    enforcePlanAuthorization
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.merchant.EnforcePlanAuthorization.class)),
    enforceAdditionalAppsAuthorization
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.merchant.EnforceAdditionalAppsAuthorization.class)),
    displayPlanRestrictionAlert
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    notifyPlanRestrictionAlert
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    displayDetailedPlanSelectionDescription
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    highlightModel
        (com.clover.sdk.extractors.MapExtractionStrategy.instance()),
    tosBillingModel
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    displayRecommendedPlanOnServicePlansPage
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    enforceChoosePlan
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
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

  private final GenericClient<MerchantPlanRules> genClient;

  /**
   * Constructs a new empty instance.
   */
  public MerchantPlanRules() {
    genClient = new GenericClient<MerchantPlanRules>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected MerchantPlanRules(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantPlanRules(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public MerchantPlanRules(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantPlanRules(MerchantPlanRules src) {
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

  /** Checks whether the 'enforcePlanAuthorization' field is set and is not null */
  public boolean isNotNullEnforcePlanAuthorization() {
    return genClient.cacheValueIsNotNull(CacheKey.enforcePlanAuthorization);
  }

  /** Checks whether the 'enforceAdditionalAppsAuthorization' field is set and is not null */
  public boolean isNotNullEnforceAdditionalAppsAuthorization() {
    return genClient.cacheValueIsNotNull(CacheKey.enforceAdditionalAppsAuthorization);
  }

  /** Checks whether the 'displayPlanRestrictionAlert' field is set and is not null */
  public boolean isNotNullDisplayPlanRestrictionAlert() {
    return genClient.cacheValueIsNotNull(CacheKey.displayPlanRestrictionAlert);
  }

  /** Checks whether the 'notifyPlanRestrictionAlert' field is set and is not null */
  public boolean isNotNullNotifyPlanRestrictionAlert() {
    return genClient.cacheValueIsNotNull(CacheKey.notifyPlanRestrictionAlert);
  }

  /** Checks whether the 'displayDetailedPlanSelectionDescription' field is set and is not null */
  public boolean isNotNullDisplayDetailedPlanSelectionDescription() {
    return genClient.cacheValueIsNotNull(CacheKey.displayDetailedPlanSelectionDescription);
  }

  /** Checks whether the 'highlightModel' field is set and is not null */
  public boolean isNotNullHighlightModel() {
    return genClient.cacheValueIsNotNull(CacheKey.highlightModel);
  }

  /** Checks whether the 'highlightModel' field is set and is not null and is not empty */
  public boolean isNotEmptyHighlightModel() { return isNotNullHighlightModel() && !getHighlightModel().isEmpty(); }

  /** Checks whether the 'tosBillingModel' field is set and is not null */
  public boolean isNotNullTosBillingModel() {
    return genClient.cacheValueIsNotNull(CacheKey.tosBillingModel);
  }

  /** Checks whether the 'displayRecommendedPlanOnServicePlansPage' field is set and is not null */
  public boolean isNotNullDisplayRecommendedPlanOnServicePlansPage() {
    return genClient.cacheValueIsNotNull(CacheKey.displayRecommendedPlanOnServicePlansPage);
  }

  /** Checks whether the 'enforceChoosePlan' field is set and is not null */
  public boolean isNotNullEnforceChoosePlan() {
    return genClient.cacheValueIsNotNull(CacheKey.enforceChoosePlan);
  }



  /** Checks whether the 'enforcePlanAuthorization' field has been set, however the value could be null */
  public boolean hasEnforcePlanAuthorization() {
    return genClient.cacheHasKey(CacheKey.enforcePlanAuthorization);
  }

  /** Checks whether the 'enforceAdditionalAppsAuthorization' field has been set, however the value could be null */
  public boolean hasEnforceAdditionalAppsAuthorization() {
    return genClient.cacheHasKey(CacheKey.enforceAdditionalAppsAuthorization);
  }

  /** Checks whether the 'displayPlanRestrictionAlert' field has been set, however the value could be null */
  public boolean hasDisplayPlanRestrictionAlert() {
    return genClient.cacheHasKey(CacheKey.displayPlanRestrictionAlert);
  }

  /** Checks whether the 'notifyPlanRestrictionAlert' field has been set, however the value could be null */
  public boolean hasNotifyPlanRestrictionAlert() {
    return genClient.cacheHasKey(CacheKey.notifyPlanRestrictionAlert);
  }

  /** Checks whether the 'displayDetailedPlanSelectionDescription' field has been set, however the value could be null */
  public boolean hasDisplayDetailedPlanSelectionDescription() {
    return genClient.cacheHasKey(CacheKey.displayDetailedPlanSelectionDescription);
  }

  /** Checks whether the 'highlightModel' field has been set, however the value could be null */
  public boolean hasHighlightModel() {
    return genClient.cacheHasKey(CacheKey.highlightModel);
  }

  /** Checks whether the 'tosBillingModel' field has been set, however the value could be null */
  public boolean hasTosBillingModel() {
    return genClient.cacheHasKey(CacheKey.tosBillingModel);
  }

  /** Checks whether the 'displayRecommendedPlanOnServicePlansPage' field has been set, however the value could be null */
  public boolean hasDisplayRecommendedPlanOnServicePlansPage() {
    return genClient.cacheHasKey(CacheKey.displayRecommendedPlanOnServicePlansPage);
  }

  /** Checks whether the 'enforceChoosePlan' field has been set, however the value could be null */
  public boolean hasEnforceChoosePlan() {
    return genClient.cacheHasKey(CacheKey.enforceChoosePlan);
  }


  /**
   * Sets the field 'enforcePlanAuthorization'.
   */
  public MerchantPlanRules setEnforcePlanAuthorization(com.clover.sdk.v3.merchant.EnforcePlanAuthorization enforcePlanAuthorization) {
    return genClient.setOther(enforcePlanAuthorization, CacheKey.enforcePlanAuthorization);
  }

  /**
   * Sets the field 'enforceAdditionalAppsAuthorization'.
   */
  public MerchantPlanRules setEnforceAdditionalAppsAuthorization(com.clover.sdk.v3.merchant.EnforceAdditionalAppsAuthorization enforceAdditionalAppsAuthorization) {
    return genClient.setOther(enforceAdditionalAppsAuthorization, CacheKey.enforceAdditionalAppsAuthorization);
  }

  /**
   * Sets the field 'displayPlanRestrictionAlert'.
   */
  public MerchantPlanRules setDisplayPlanRestrictionAlert(java.lang.Boolean displayPlanRestrictionAlert) {
    return genClient.setOther(displayPlanRestrictionAlert, CacheKey.displayPlanRestrictionAlert);
  }

  /**
   * Sets the field 'notifyPlanRestrictionAlert'.
   */
  public MerchantPlanRules setNotifyPlanRestrictionAlert(java.lang.Boolean notifyPlanRestrictionAlert) {
    return genClient.setOther(notifyPlanRestrictionAlert, CacheKey.notifyPlanRestrictionAlert);
  }

  /**
   * Sets the field 'displayDetailedPlanSelectionDescription'.
   */
  public MerchantPlanRules setDisplayDetailedPlanSelectionDescription(java.lang.Boolean displayDetailedPlanSelectionDescription) {
    return genClient.setOther(displayDetailedPlanSelectionDescription, CacheKey.displayDetailedPlanSelectionDescription);
  }

  /**
   * Sets the field 'highlightModel'.
   */
  public MerchantPlanRules setHighlightModel(java.util.Map<java.lang.String,java.lang.String> highlightModel) {
    return genClient.setOther(highlightModel, CacheKey.highlightModel);
  }

  /**
   * Sets the field 'tosBillingModel'.
   */
  public MerchantPlanRules setTosBillingModel(java.lang.String tosBillingModel) {
    return genClient.setOther(tosBillingModel, CacheKey.tosBillingModel);
  }

  /**
   * Sets the field 'displayRecommendedPlanOnServicePlansPage'.
   */
  public MerchantPlanRules setDisplayRecommendedPlanOnServicePlansPage(java.lang.Boolean displayRecommendedPlanOnServicePlansPage) {
    return genClient.setOther(displayRecommendedPlanOnServicePlansPage, CacheKey.displayRecommendedPlanOnServicePlansPage);
  }

  /**
   * Sets the field 'enforceChoosePlan'.
   */
  public MerchantPlanRules setEnforceChoosePlan(java.lang.Boolean enforceChoosePlan) {
    return genClient.setOther(enforceChoosePlan, CacheKey.enforceChoosePlan);
  }


  /** Clears the 'enforcePlanAuthorization' field, the 'has' method for this field will now return false */
  public void clearEnforcePlanAuthorization() {
    genClient.clear(CacheKey.enforcePlanAuthorization);
  }
  /** Clears the 'enforceAdditionalAppsAuthorization' field, the 'has' method for this field will now return false */
  public void clearEnforceAdditionalAppsAuthorization() {
    genClient.clear(CacheKey.enforceAdditionalAppsAuthorization);
  }
  /** Clears the 'displayPlanRestrictionAlert' field, the 'has' method for this field will now return false */
  public void clearDisplayPlanRestrictionAlert() {
    genClient.clear(CacheKey.displayPlanRestrictionAlert);
  }
  /** Clears the 'notifyPlanRestrictionAlert' field, the 'has' method for this field will now return false */
  public void clearNotifyPlanRestrictionAlert() {
    genClient.clear(CacheKey.notifyPlanRestrictionAlert);
  }
  /** Clears the 'displayDetailedPlanSelectionDescription' field, the 'has' method for this field will now return false */
  public void clearDisplayDetailedPlanSelectionDescription() {
    genClient.clear(CacheKey.displayDetailedPlanSelectionDescription);
  }
  /** Clears the 'highlightModel' field, the 'has' method for this field will now return false */
  public void clearHighlightModel() {
    genClient.clear(CacheKey.highlightModel);
  }
  /** Clears the 'tosBillingModel' field, the 'has' method for this field will now return false */
  public void clearTosBillingModel() {
    genClient.clear(CacheKey.tosBillingModel);
  }
  /** Clears the 'displayRecommendedPlanOnServicePlansPage' field, the 'has' method for this field will now return false */
  public void clearDisplayRecommendedPlanOnServicePlansPage() {
    genClient.clear(CacheKey.displayRecommendedPlanOnServicePlansPage);
  }
  /** Clears the 'enforceChoosePlan' field, the 'has' method for this field will now return false */
  public void clearEnforceChoosePlan() {
    genClient.clear(CacheKey.enforceChoosePlan);
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
  public MerchantPlanRules copyChanges() {
    MerchantPlanRules copy = new MerchantPlanRules();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantPlanRules src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantPlanRules(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantPlanRules> CREATOR = new android.os.Parcelable.Creator<MerchantPlanRules>() {
    @Override
    public MerchantPlanRules createFromParcel(android.os.Parcel in) {
      MerchantPlanRules instance = new MerchantPlanRules(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantPlanRules[] newArray(int size) {
      return new MerchantPlanRules[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantPlanRules> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantPlanRules>() {
    public Class<MerchantPlanRules> getCreatedClass() {
      return MerchantPlanRules.class;
    }

    @Override
    public MerchantPlanRules create(org.json.JSONObject jsonObject) {
      return new MerchantPlanRules(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean ENFORCEPLANAUTHORIZATION_IS_REQUIRED = false;
    public static final boolean ENFORCEADDITIONALAPPSAUTHORIZATION_IS_REQUIRED = false;
    public static final boolean DISPLAYPLANRESTRICTIONALERT_IS_REQUIRED = false;
    public static final boolean NOTIFYPLANRESTRICTIONALERT_IS_REQUIRED = false;
    public static final boolean DISPLAYDETAILEDPLANSELECTIONDESCRIPTION_IS_REQUIRED = false;
    public static final boolean HIGHLIGHTMODEL_IS_REQUIRED = false;
    public static final boolean TOSBILLINGMODEL_IS_REQUIRED = false;
    public static final boolean DISPLAYRECOMMENDEDPLANONSERVICEPLANSPAGE_IS_REQUIRED = false;
    public static final boolean ENFORCECHOOSEPLAN_IS_REQUIRED = false;
  }

}