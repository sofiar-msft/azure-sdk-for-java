// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.dashboard.models.PrivateLinkResourceListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourceListResultTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResourceListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleted\",\"groupId\":\"zxibqeoj\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"zvddntwndeicbtwn\",\"name\":\"zao\",\"type\":\"vuhrhcffcyddgl\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"groupId\":\"qkwpyeicxmqc\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"hkh\",\"name\":\"xuigdtopbobj\",\"type\":\"ghmewuam\"}],\"nextLink\":\"hrzayvvtpgvdf\"}")
                .toObject(PrivateLinkResourceListResult.class);
    }

    @Test
    public void testSerialize() {
        PrivateLinkResourceListResult model =
            new PrivateLinkResourceListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList()),
                            new PrivateLinkResourceInner().withRequiredZoneNames(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResult.class);
    }
}
