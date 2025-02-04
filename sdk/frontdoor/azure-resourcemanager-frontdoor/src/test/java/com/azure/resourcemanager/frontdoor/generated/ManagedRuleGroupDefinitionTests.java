// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleGroupDefinition;

public final class ManagedRuleGroupDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedRuleGroupDefinition model =
            BinaryData
                .fromString(
                    "{\"ruleGroupName\":\"pqjlihhyusps\",\"description\":\"sdvlmfwdgzxulucv\",\"rules\":[{\"ruleId\":\"sreuzvxurisjnh\",\"defaultState\":\"Disabled\",\"defaultAction\":\"Block\",\"description\":\"qjzgxmrhublw\"},{\"ruleId\":\"esutrgjupauutpw\",\"defaultState\":\"Enabled\",\"defaultAction\":\"Allow\",\"description\":\"jqgwzp\"},{\"ruleId\":\"qntcypsxjvfoimwk\",\"defaultState\":\"Enabled\",\"defaultAction\":\"Redirect\",\"description\":\"zjxvydfcea\"},{\"ruleId\":\"lhvygdyftu\",\"defaultState\":\"Enabled\",\"defaultAction\":\"Redirect\",\"description\":\"wjslbiwkojgcyzt\"}]}")
                .toObject(ManagedRuleGroupDefinition.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedRuleGroupDefinition model = new ManagedRuleGroupDefinition();
        model = BinaryData.fromObject(model).toObject(ManagedRuleGroupDefinition.class);
    }
}
