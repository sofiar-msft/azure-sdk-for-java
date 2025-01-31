// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VendorSkus. */
public interface VendorSkus {
    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String vendorName, String skuName);

    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String vendorName, String skuName, Context context);

    /**
     * Gets information about the specified sku.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sku along with {@link Response}.
     */
    Response<VendorSku> getWithResponse(String vendorName, String skuName, Context context);

    /**
     * Gets information about the specified sku.
     *
     * @param vendorName The name of the vendor.
     * @param skuName The name of the sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sku.
     */
    VendorSku get(String vendorName, String skuName);

    /**
     * Lists all the skus of a vendor.
     *
     * @param vendorName The name of the vendor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list vendor sku API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VendorSku> list(String vendorName);

    /**
     * Lists all the skus of a vendor.
     *
     * @param vendorName The name of the vendor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list vendor sku API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VendorSku> list(String vendorName, Context context);

    /**
     * Gets information about the specified sku.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sku along with {@link Response}.
     */
    VendorSku getById(String id);

    /**
     * Gets information about the specified sku.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified sku along with {@link Response}.
     */
    Response<VendorSku> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified sku. This operation can take up to 2 hours to complete. This is expected service behavior.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VendorSku resource.
     *
     * @param name resource name.
     * @return the first stage of the new VendorSku definition.
     */
    VendorSku.DefinitionStages.Blank define(String name);
}
