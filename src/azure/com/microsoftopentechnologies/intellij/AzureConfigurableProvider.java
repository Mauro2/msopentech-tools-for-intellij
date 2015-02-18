/**
 * Copyright 2015 Microsoft Open Technologies Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	 http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoftopentechnologies.intellij;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nullable;

public class AzureConfigurableProvider extends ConfigurableProvider {
    private final Project myProject;

    public AzureConfigurableProvider(Project project) {
        myProject = project;
    }

    @Override
    public boolean canCreateConfigurable() {
        return !AzurePlugin.IS_ANDROID_STUDIO && AzurePlugin.IS_WINDOWS;
    }
    @Nullable
    @Override
    public Configurable createConfigurable() {
        return new AzureConfigurable(myProject);
    }
}
