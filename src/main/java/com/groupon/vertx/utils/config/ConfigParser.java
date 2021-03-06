/**
 * Copyright 2016 Inscope Metrics, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.groupon.vertx.utils.config;

import io.vertx.core.json.JsonObject;

/**
 * Config parsing for verticles
 *
 * @author Ville Koskela (ville dot koskela at inscopemetrics dot com)
 * @since 3.2.0
 * @version 3.2.0
 */
public interface ConfigParser {

    /**
     * Parse configuration into a JsonObject.
     *
     * @param configuration the configuration content
     * @return the JsonObject representing the configuration
     */
    JsonObject parse(String configuration);
}
