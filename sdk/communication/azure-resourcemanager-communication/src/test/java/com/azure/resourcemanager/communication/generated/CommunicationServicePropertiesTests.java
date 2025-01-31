// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CommunicationServicePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationServiceProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Running\",\"hostName\":\"cuertu\",\"dataLocation\":\"kdosvqw\",\"notificationHubId\":\"mdgbbjfdd\",\"version\":\"bmbexppbhtqqro\",\"immutableResourceId\":\"p\",\"linkedDomains\":[\"algbquxigjyjg\"]}")
                .toObject(CommunicationServiceProperties.class);
        Assertions.assertEquals("kdosvqw", model.dataLocation());
        Assertions.assertEquals("algbquxigjyjg", model.linkedDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationServiceProperties model =
            new CommunicationServiceProperties()
                .withDataLocation("kdosvqw")
                .withLinkedDomains(Arrays.asList("algbquxigjyjg"));
        model = BinaryData.fromObject(model).toObject(CommunicationServiceProperties.class);
        Assertions.assertEquals("kdosvqw", model.dataLocation());
        Assertions.assertEquals("algbquxigjyjg", model.linkedDomains().get(0));
    }
}
