// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.PrivateEndpointConnectionVaultProperties;

public final class PrivateEndpointConnectionVaultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionVaultProperties model =
            BinaryData
                .fromString(
                    "{\"id\":\"fgugnxkrxdqmid\",\"properties\":{\"provisioningState\":\"Deleting\",\"privateEndpoint\":{\"id\":\"qdrabhjybigehoqf\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"anyktzlcuiywg\",\"actionsRequired\":\"wgndrvynhzgpp\"},\"groupIds\":[\"AzureSiteRecovery\",\"AzureBackup\",\"AzureBackup_secondary\"]},\"name\":\"ocpecfvmmco\",\"type\":\"sxlzevgbmqj\",\"location\":\"bcypmi\"}")
                .toObject(PrivateEndpointConnectionVaultProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionVaultProperties model = new PrivateEndpointConnectionVaultProperties();
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionVaultProperties.class);
    }
}
