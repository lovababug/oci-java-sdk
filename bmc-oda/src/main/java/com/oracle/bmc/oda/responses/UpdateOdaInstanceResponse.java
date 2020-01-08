/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateOdaInstanceResponse {

    /**
     * For use in a PUT or DELETE `if-match` query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you contact Oracle
     * about this request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned OdaInstance instance.
     */
    private OdaInstance odaInstance;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateOdaInstanceResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            odaInstance(o.getOdaInstance());

            return this;
        }
    }
}
