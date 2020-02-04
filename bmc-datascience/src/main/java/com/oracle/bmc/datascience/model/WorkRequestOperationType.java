/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datascience.model;

/**
 * The types of work request operations.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.extern.slf4j.Slf4j
public enum WorkRequestOperationType {
    NotebookSessionCreate("NOTEBOOK_SESSION_CREATE"),
    NotebookSessionDelete("NOTEBOOK_SESSION_DELETE"),
    NotebookSessionActivate("NOTEBOOK_SESSION_ACTIVATE"),
    NotebookSessionDeactivate("NOTEBOOK_SESSION_DEACTIVATE"),
    ProjectDelete("PROJECT_DELETE"),
    WorkrequestCancel("WORKREQUEST_CANCEL"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, WorkRequestOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (WorkRequestOperationType v : WorkRequestOperationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    WorkRequestOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static WorkRequestOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'WorkRequestOperationType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
