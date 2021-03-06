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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeEndpoints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * </p>
     */
    private java.util.List<Endpoint> endpoints;

    /**
     * <p>
     * An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * </p>
     * 
     * @return An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     */

    public java.util.List<Endpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * </p>
     * 
     * @param endpoints
     *        An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     */

    public void setEndpoints(java.util.Collection<Endpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<Endpoint>(endpoints);
    }

    /**
     * <p>
     * An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointsResult withEndpoints(Endpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<Endpoint>(endpoints.length));
        }
        for (Endpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * </p>
     * 
     * @param endpoints
     *        An <code>Endpoints</code> object is returned when a <code>DescribeEndpoints</code> request is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointsResult withEndpoints(java.util.Collection<Endpoint> endpoints) {
        setEndpoints(endpoints);
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointsResult == false)
            return false;
        DescribeEndpointsResult other = (DescribeEndpointsResult) obj;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointsResult clone() {
        try {
            return (DescribeEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
