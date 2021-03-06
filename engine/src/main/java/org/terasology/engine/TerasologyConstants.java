/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.engine;

import com.google.common.base.Charsets;

import java.nio.charset.Charset;

/**
 * @author Immortius
 */
public final class TerasologyConstants {
    public static final String ENTITY_DATA_FILE = "entity.dat";
    public static final int DEFAULT_PORT = 25777;
    public static final String WORLD_DATA_FILE = "world.dat";
    public static final String MAIN_WORLD = "main";
    public static final Charset CHARSET = Charsets.UTF_8;
    public static final String ENGINE_MODULE = "engine";
    public static final String ASSETS_SUBDIRECTORY = "assets";
    public static final String OVERRIDES_SUBDIRECTORY = "overrides";
    public static final String DELTAS_SUBDIRECTORY = "deltas";

    private TerasologyConstants() {
    }
}
