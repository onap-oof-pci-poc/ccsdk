/*******************************************************************************
 * ============LICENSE_START========================================================================
 * ONAP : ccsdk feature sdnr wt
 * =================================================================================================
 * Copyright (C) 2019 highstreet technologies GmbH Intellectual Property. All rights reserved.
 * =================================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * ============LICENSE_END==========================================================================
 ******************************************************************************/
package org.onap.ccsdk.features.sdnr.wt.devicemanager.config.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClusterRoleInfo {
    private final String Role;
    private final int Index;

    public ClusterRoleInfo(String s) throws Exception {
        final String regex = "([a-zA-Z]*)-([0-9]*)";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(s);
        if (!matcher.find()) {
            throw new Exception("unexpected role format:"+s);
        }
        this.Role = matcher.group(1);
        this.Index = Integer.parseInt(matcher.group(2));
    }

    private ClusterRoleInfo(String role, int idx) {
        this.Role=role;
        this.Index=idx;
    }

    public static ClusterRoleInfo defaultSingleNodeRole() {
        return new ClusterRoleInfo("member",1);
    }

    public String getRole() {
        return Role;
    }
    public int getIndex() {
        return Index;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Index;
        result = prime * result + (Role == null ? 0 : Role.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ClusterRoleInfo other = (ClusterRoleInfo) obj;
        if (Index != other.Index) {
            return false;
        }
        if (Role == null) {
            if (other.Role != null) {
                return false;
            }
        } else if (!Role.equals(other.Role)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "ClusterRoleInfo [Role=" + Role + ", Index=" + Index + "]";
    }
}
