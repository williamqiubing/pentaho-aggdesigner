/*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*
* Copyright 2006 - 2013 Pentaho Corporation.  All rights reserved.
*/

package org.pentaho.aggdes.ui.exec;

import java.util.List;

/**
 * Provides a service to install DDLExecutionCompleteCallback implementations.
 * These are callback mechanisms between pentaho-aggdesigner-ui and plugins.
 */
public class DDLExecutionCallbackService {
    private List<DDLExecutionCompleteCallback> ddlCallbacks;

    public void setDdlCallbacks(List<DDLExecutionCompleteCallback> ddlCallbacks) {
        this.ddlCallbacks = ddlCallbacks;
    }

    public List<DDLExecutionCompleteCallback> getDdlCallbacks() {
        return ddlCallbacks;
    }
}
