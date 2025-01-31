// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS property override. */
@Fluent
public final class SsisPropertyOverride {
    /*
     * SSIS package property override value. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /*
     * Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     */
    @JsonProperty(value = "isSensitive")
    private Boolean isSensitive;

    /** Creates an instance of SsisPropertyOverride class. */
    public SsisPropertyOverride() {}

    /**
     * Get the value property: SSIS package property override value. Type: string (or Expression with resultType
     * string).
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: SSIS package property override value. Type: string (or Expression with resultType
     * string).
     *
     * @param value the value value to set.
     * @return the SsisPropertyOverride object itself.
     */
    public SsisPropertyOverride setValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the isSensitive property: Whether SSIS package property override value is sensitive data. Value will be
     * encrypted in SSISDB if it is true.
     *
     * @return the isSensitive value.
     */
    public Boolean isSensitive() {
        return this.isSensitive;
    }

    /**
     * Set the isSensitive property: Whether SSIS package property override value is sensitive data. Value will be
     * encrypted in SSISDB if it is true.
     *
     * @param isSensitive the isSensitive value to set.
     * @return the SsisPropertyOverride object itself.
     */
    public SsisPropertyOverride setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
        return this;
    }
}
