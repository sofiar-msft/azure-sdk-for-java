// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * A snapshot of assets captured daily for the provided metric. Asset details only contain primary properties. Detailed
 * asset data can be retrieved from the asset endpoints.
 */
@Immutable
public final class ReportAssetSnapshotResult {

    /*
     * The name of the metric.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The unique metric name.
     */
    @Generated
    @JsonProperty(value = "metric")
    private String metric;

    /*
     * The customer label that was filtered on, if one was provided.
     */
    @Generated
    @JsonProperty(value = "labelName")
    private String labelName;

    /*
     * The last time this asset data was updated on this metric.
     */
    @Generated
    @JsonProperty(value = "updatedAt")
    private OffsetDateTime updatedAt;

    /*
     * A description of what the metric represents.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * The page of assets that match the provided metric.
     */
    @Generated
    @JsonProperty(value = "assets")
    private AssetPageResult assets;

    /** Creates an instance of ReportAssetSnapshotResult class. */
    @Generated
    private ReportAssetSnapshotResult() {}

    /**
     * Get the displayName property: The name of the metric.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the metric property: The unique metric name.
     *
     * @return the metric value.
     */
    @Generated
    public String getMetric() {
        return this.metric;
    }

    /**
     * Get the labelName property: The customer label that was filtered on, if one was provided.
     *
     * @return the labelName value.
     */
    @Generated
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * Get the updatedAt property: The last time this asset data was updated on this metric.
     *
     * @return the updatedAt value.
     */
    @Generated
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the description property: A description of what the metric represents.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the assets property: The page of assets that match the provided metric.
     *
     * @return the assets value.
     */
    @Generated
    public AssetPageResult getAssets() {
        return this.assets;
    }
}
