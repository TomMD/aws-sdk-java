/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

/**
 * 
 */
public enum SslProtocol {

    SSLv3("SSLv3"),
    TLSv1("TLSv1"),
    TLSv11("TLSv1.1"),
    TLSv12("TLSv1.2");

    private String value;

    private SslProtocol(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return SslProtocol corresponding to the value
     */
    public static SslProtocol fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("SSLv3".equals(value)) {
            return SSLv3;
        } else if ("TLSv1".equals(value)) {
            return TLSv1;
        } else if ("TLSv1.1".equals(value)) {
            return TLSv11;
        } else if ("TLSv1.2".equals(value)) {
            return TLSv12;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}