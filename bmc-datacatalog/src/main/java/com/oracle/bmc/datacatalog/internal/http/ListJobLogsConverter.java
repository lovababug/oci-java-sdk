/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.datacatalog.model.*;
import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.extern.slf4j.Slf4j
public class ListJobLogsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static ListJobLogsRequest interceptRequest(ListJobLogsRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client, ListJobLogsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Validate.notBlank(request.getJobExecutionKey(), "jobExecutionKey must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20190325")
                        .path("catalogs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getCatalogId()))
                        .path("jobs")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getJobKey()))
                        .path("executions")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getJobExecutionKey()))
                        .path("logs");

        if (request.getLifecycleState() != null) {
            target =
                    target.queryParam(
                            "lifecycleState",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLifecycleState().getValue()));
        }

        if (request.getSeverity() != null) {
            target =
                    target.queryParam(
                            "severity",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSeverity()));
        }

        if (request.getTimeCreated() != null) {
            target =
                    target.queryParam(
                            "timeCreated",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeCreated()));
        }

        if (request.getTimeUpdated() != null) {
            target =
                    target.queryParam(
                            "timeUpdated",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeUpdated()));
        }

        if (request.getCreatedById() != null) {
            target =
                    target.queryParam(
                            "createdById",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCreatedById()));
        }

        if (request.getUpdatedById() != null) {
            target =
                    target.queryParam(
                            "updatedById",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getUpdatedById()));
        }

        if (request.getFields() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "fields",
                            request.getFields(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getSortBy() != null) {
            target =
                    target.queryParam(
                            "sortBy",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortBy().getValue()));
        }

        if (request.getSortOrder() != null) {
            target =
                    target.queryParam(
                            "sortOrder",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortOrder().getValue()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        return ib;
    }

    public static com.google.common.base.Function<javax.ws.rs.core.Response, ListJobLogsResponse>
            fromResponse() {
        final com.google.common.base.Function<javax.ws.rs.core.Response, ListJobLogsResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response, ListJobLogsResponse>() {
                            @Override
                            public ListJobLogsResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace("Transform function invoked for ListJobLogsResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        JobLogCollection>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        JobLogCollection.class);

                                com.oracle.bmc.http.internal.WithHeaders<JobLogCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                ListJobLogsResponse.Builder builder = ListJobLogsResponse.builder();

                                builder.jobLogCollection(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                ListJobLogsResponse responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}