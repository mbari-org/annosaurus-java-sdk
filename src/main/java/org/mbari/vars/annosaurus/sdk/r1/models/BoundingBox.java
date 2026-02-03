package org.mbari.vars.annosaurus.sdk.r1.models;

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

import java.util.UUID;


/**
 * Bean class used for serializing/deserializing bounding box info into JSON
 * All coordinaates are intended to be pixels
 */
public class BoundingBox {
    private int x;
    private int y;
    private int width;
    private int height;
    private String generator;
    private UUID imageReferenceUuid;
    private String project;
    private String verifier;
    private String comment;

    public static String LINK_NAME = "bounding box";

    public BoundingBox() {
    }

    public BoundingBox(int x, int y, int width, int height) {
        this(x, y, width, height, null);
    }

    public BoundingBox(int x, int y, int width, int height, String generator) {
        this(x, y, width, height, generator, null);
    }

    public BoundingBox(int x, int y, int width, int height, String generator, UUID imageReferenceUuid) {
        this(x, y, width, height, generator, imageReferenceUuid, null, null, null);
    }

    public BoundingBox(int x, int y, int width, int height, String generator, UUID imageReferenceUuid, 
            String project, String verifier, String comment) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.generator = generator;
        this.imageReferenceUuid = imageReferenceUuid;
        this.project = project;
        this.verifier = verifier;
        this.comment = comment;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getGenerator() {
        return generator;
    }

    public UUID getImageReferenceUuid() {
        return imageReferenceUuid;
    }

    public String getProject() {
        return project;
    }

    public String getVerifier() {
        return verifier;
    }

    public String getComment() {
        return comment;
    }




    @Override
    public String toString() {
        return "BoundingBox[" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", generator=" + generator +
                ']';
    }
}
