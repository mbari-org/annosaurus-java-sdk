package org.mbari.vars.annosaurus.sdk.r1.etc.gson;

/*-
 * #%L
 * org.mbari.vars:annosaurus-java-sdk
 * %%
 * Copyright (C) 2025 - 2026 Monterey Bay Aquarium Research Institute
 * %%
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
 * #L%
 */

import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

import org.mbari.vars.annosaurus.sdk.r1.models.Annotation;
import org.mbari.vars.annosaurus.sdk.r1.models.ImagedMoment;

/**
 * @author Brian Schlining
 * @since 2018-07-26T11:24:00
 */
public class AnnotationCreator implements InstanceCreator<ImagedMoment> {
  @Override
  public ImagedMoment createInstance(Type type) {
    return new Annotation();
  }
}
