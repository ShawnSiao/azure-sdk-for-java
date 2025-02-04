// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.CacheNetworkSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CacheNetworkSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CacheNetworkSettings model =
            BinaryData
                .fromString(
                    "{\"mtu\":910788688,\"utilityAddresses\":[\"fuwutttxf\",\"jrbirphxepcyv\"],\"dnsServers\":[\"nljky\",\"xjvuujqgidokg\"],\"dnsSearchDomain\":\"jyoxgvclt\",\"ntpServer\":\"sncghkjeszz\"}")
                .toObject(CacheNetworkSettings.class);
        Assertions.assertEquals(910788688, model.mtu());
        Assertions.assertEquals("nljky", model.dnsServers().get(0));
        Assertions.assertEquals("jyoxgvclt", model.dnsSearchDomain());
        Assertions.assertEquals("sncghkjeszz", model.ntpServer());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CacheNetworkSettings model =
            new CacheNetworkSettings()
                .withMtu(910788688)
                .withDnsServers(Arrays.asList("nljky", "xjvuujqgidokg"))
                .withDnsSearchDomain("jyoxgvclt")
                .withNtpServer("sncghkjeszz");
        model = BinaryData.fromObject(model).toObject(CacheNetworkSettings.class);
        Assertions.assertEquals(910788688, model.mtu());
        Assertions.assertEquals("nljky", model.dnsServers().get(0));
        Assertions.assertEquals("jyoxgvclt", model.dnsSearchDomain());
        Assertions.assertEquals("sncghkjeszz", model.ntpServer());
    }
}
