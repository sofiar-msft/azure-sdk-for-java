// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ChangeDataCaptureResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of change data capture resources. */
@Fluent
public final class ChangeDataCaptureListResponse {
    /*
     * Lists all resources of type change data capture.
     */
    @JsonProperty(value = "value", required = true)
    private List<ChangeDataCaptureResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ChangeDataCaptureListResponse class. */
    public ChangeDataCaptureListResponse() {
    }

    /**
     * Get the value property: Lists all resources of type change data capture.
     *
     * @return the value value.
     */
    public List<ChangeDataCaptureResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Lists all resources of type change data capture.
     *
     * @param value the value value to set.
     * @return the ChangeDataCaptureListResponse object itself.
     */
    public ChangeDataCaptureListResponse withValue(List<ChangeDataCaptureResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the ChangeDataCaptureListResponse object itself.
     */
    public ChangeDataCaptureListResponse withNextLink(String nextLink) {
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
                        "Missing required property value in model ChangeDataCaptureListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ChangeDataCaptureListResponse.class);
}
