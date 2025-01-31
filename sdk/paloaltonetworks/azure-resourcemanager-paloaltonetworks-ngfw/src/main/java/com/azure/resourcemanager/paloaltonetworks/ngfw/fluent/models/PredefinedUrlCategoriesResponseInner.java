// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PredefinedUrlCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** predefined url categories response. */
@Fluent
public final class PredefinedUrlCategoriesResponseInner {
    /*
     * predefined url categories
     */
    @JsonProperty(value = "value", required = true)
    private List<PredefinedUrlCategory> value;

    /*
     * next link
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of PredefinedUrlCategoriesResponseInner class. */
    public PredefinedUrlCategoriesResponseInner() {
    }

    /**
     * Get the value property: predefined url categories.
     *
     * @return the value value.
     */
    public List<PredefinedUrlCategory> value() {
        return this.value;
    }

    /**
     * Set the value property: predefined url categories.
     *
     * @param value the value value to set.
     * @return the PredefinedUrlCategoriesResponseInner object itself.
     */
    public PredefinedUrlCategoriesResponseInner withValue(List<PredefinedUrlCategory> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the PredefinedUrlCategoriesResponseInner object itself.
     */
    public PredefinedUrlCategoriesResponseInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model PredefinedUrlCategoriesResponseInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PredefinedUrlCategoriesResponseInner.class);
}
