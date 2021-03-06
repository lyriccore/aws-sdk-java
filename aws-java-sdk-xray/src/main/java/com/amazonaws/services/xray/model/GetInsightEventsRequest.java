/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * Used to retrieve at most the specified value of events.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of events.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     * 
     * @param insightId
     *        The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     * 
     * @return The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * </p>
     * 
     * @param insightId
     *        The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightEventsRequest withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * Used to retrieve at most the specified value of events.
     * </p>
     * 
     * @param maxResults
     *        Used to retrieve at most the specified value of events.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Used to retrieve at most the specified value of events.
     * </p>
     * 
     * @return Used to retrieve at most the specified value of events.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Used to retrieve at most the specified value of events.
     * </p>
     * 
     * @param maxResults
     *        Used to retrieve at most the specified value of events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of events.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous request to retrieve the next page of events.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of events.
     * </p>
     * 
     * @return Specify the pagination token returned by a previous request to retrieve the next page of events.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token returned by a previous request to retrieve the next page of events.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token returned by a previous request to retrieve the next page of events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightEventsRequest == false)
            return false;
        GetInsightEventsRequest other = (GetInsightEventsRequest) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightEventsRequest clone() {
        return (GetInsightEventsRequest) super.clone();
    }

}
