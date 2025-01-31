// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.models.OperationValueDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a Compute Operation value. */
@Fluent
public final class OperationValueInner {
    /*
     * The origin of the compute operation.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /*
     * The name of the compute operation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Display properties
     */
    @JsonProperty(value = "display")
    private OperationValueDisplay display;

    /** Creates an instance of OperationValueInner class. */
    public OperationValueInner() {
    }

    /**
     * Get the origin property: The origin of the compute operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the name property: The name of the compute operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: Display properties.
     *
     * @return the display value.
     */
    public OperationValueDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display properties.
     *
     * @param display the display value to set.
     * @return the OperationValueInner object itself.
     */
    public OperationValueInner withDisplay(OperationValueDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
