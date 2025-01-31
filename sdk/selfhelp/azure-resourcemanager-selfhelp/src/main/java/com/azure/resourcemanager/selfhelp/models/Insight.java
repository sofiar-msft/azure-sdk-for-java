// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Detailed insights(s) obtained via the invocation of an insight diagnostic. */
@Fluent
public final class Insight {
    /*
     * Article id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * This insight's title.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Detailed result content.
     */
    @JsonProperty(value = "results")
    private String results;

    /*
     * Importance level of the insight.
     */
    @JsonProperty(value = "importanceLevel")
    private ImportanceLevel importanceLevel;

    /** Creates an instance of Insight class. */
    public Insight() {
    }

    /**
     * Get the id property: Article id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Article id.
     *
     * @param id the id value to set.
     * @return the Insight object itself.
     */
    public Insight withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the title property: This insight's title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: This insight's title.
     *
     * @param title the title value to set.
     * @return the Insight object itself.
     */
    public Insight withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the results property: Detailed result content.
     *
     * @return the results value.
     */
    public String results() {
        return this.results;
    }

    /**
     * Set the results property: Detailed result content.
     *
     * @param results the results value to set.
     * @return the Insight object itself.
     */
    public Insight withResults(String results) {
        this.results = results;
        return this;
    }

    /**
     * Get the importanceLevel property: Importance level of the insight.
     *
     * @return the importanceLevel value.
     */
    public ImportanceLevel importanceLevel() {
        return this.importanceLevel;
    }

    /**
     * Set the importanceLevel property: Importance level of the insight.
     *
     * @param importanceLevel the importanceLevel value to set.
     * @return the Insight object itself.
     */
    public Insight withImportanceLevel(ImportanceLevel importanceLevel) {
        this.importanceLevel = importanceLevel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
