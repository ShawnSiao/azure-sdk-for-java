// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ClusterPrincipalProperties;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import org.junit.jupiter.api.Assertions;

public final class ClusterPrincipalPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPrincipalProperties model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"hwxmnteiwa\",\"role\":\"AllDatabasesViewer\",\"tenantId\":\"km\",\"principalType\":\"Group\",\"tenantName\":\"mmxdcu\",\"principalName\":\"fsrpymzidnse\",\"provisioningState\":\"Moving\",\"aadObjectId\":\"bzsgfyccsne\"}")
                .toObject(ClusterPrincipalProperties.class);
        Assertions.assertEquals("hwxmnteiwa", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_VIEWER, model.role());
        Assertions.assertEquals("km", model.tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, model.principalType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPrincipalProperties model =
            new ClusterPrincipalProperties()
                .withPrincipalId("hwxmnteiwa")
                .withRole(ClusterPrincipalRole.ALL_DATABASES_VIEWER)
                .withTenantId("km")
                .withPrincipalType(PrincipalType.GROUP);
        model = BinaryData.fromObject(model).toObject(ClusterPrincipalProperties.class);
        Assertions.assertEquals("hwxmnteiwa", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_VIEWER, model.role());
        Assertions.assertEquals("km", model.tenantId());
        Assertions.assertEquals(PrincipalType.GROUP, model.principalType());
    }
}
