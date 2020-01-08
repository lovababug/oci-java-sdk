/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.budget.model;

/**
 * The sort order to use. Valid values are 'asc' or 'desc'.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public enum SortOrder {
    Asc("ASC"),
    Desc("DESC"),
    ;

    private final String value;
    private static java.util.Map<String, SortOrder> map;

    static {
        map = new java.util.HashMap<>();
        for (SortOrder v : SortOrder.values()) {
            map.put(v.getValue(), v);
        }
    }

    SortOrder(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortOrder create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new RuntimeException("Invalid SortOrder: " + key);
    }
}
