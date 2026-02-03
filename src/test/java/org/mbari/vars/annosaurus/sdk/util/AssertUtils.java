package org.mbari.vars.annosaurus.sdk.util;

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


import org.mbari.vars.annosaurus.sdk.r1.models.AncillaryData;
import org.mbari.vars.annosaurus.sdk.r1.models.Annotation;
import org.mbari.vars.annosaurus.sdk.r1.models.Association;
import org.mbari.vars.annosaurus.sdk.r1.models.CachedVideoReference;
import org.mbari.vars.annosaurus.sdk.r1.models.Image;
import org.mbari.vars.annosaurus.sdk.r1.models.ImageReference;
import org.mbari.vars.annosaurus.sdk.r1.models.Index;

import org.mbari.vcr4j.time.Timecode;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;



public class AssertUtils {


    public static void assertSameAnnotation(Annotation a, Annotation b, boolean checkUuid, boolean checkRelations) {
        if (checkUuid) {
            assertEquals(a.getObservationUuid(), b.getObservationUuid());
            assertEquals(a.getImagedMomentUuid(), b.getImagedMomentUuid());
        }
        assertEquals(a.getVideoReferenceUuid(), b.getVideoReferenceUuid());
        assertEquals(a.getConcept(), b.getConcept());
        assertEquals(a.getObserver(), b.getObserver());
        assertEquals(a.getObservationTimestamp(), b.getObservationTimestamp());
        assertEquals(a.getVideoReferenceUuid(), b.getVideoReferenceUuid());
        assertEquals(a.getDuration(), b.getDuration());
        assertEquals(a.getElapsedTime(), b.getElapsedTime());
        assertEquals(a.getRecordedTimestamp(), b.getRecordedTimestamp());
        assertEquals(a.getGroup(), b.getGroup());
        assertEquals(a.getActivity(), b.getActivity());
        if (checkRelations) {
            assertEquals(a.getAssociations().size(), b.getAssociations().size());
            assertEquals(a.getImageReferences().size(), b.getImageReferences().size());
        }
    }

    public static void assertSameAssociation(Association a, Association b, boolean checkUuid) {
        assertEquals(a.getLinkName(), b.getLinkName());
        assertEquals(a.getLinkValue(), b.getLinkValue());
        assertEquals(a.getToConcept(), b.getToConcept());
        assertEquals(a.getMimeType(), b.getMimeType());
        if (checkUuid) {
            assertEquals(a.getUuid(), b.getUuid());
        }
    }

    public static void assertSameImageReference(ImageReference a, ImageReference b, boolean checkUuid) {
        assertEquals(a.getFormat(), b.getFormat());
        assertEquals(a.getUrl(), b.getUrl());
        assertEquals(a.getDescription(), b.getDescription());
        assertEquals(a.getWidth(), b.getWidth());
        assertEquals(a.getHeight(), b.getHeight());
        if (checkUuid) {
            assertEquals(a.getUuid(), b.getUuid());
        }
    }

    public static void assertSameImage(Image a, Image b, boolean checkUuid) {
        assertEquals(a.getFormat(), b.getFormat());
        assertEquals(a.getUrl(), b.getUrl());
        assertEquals(a.getDescription(), b.getDescription());
        assertEquals(a.getWidth(), b.getWidth());
        assertEquals(a.getHeight(), b.getHeight());
        var tca = Optional.ofNullable(a.getTimecode()).orElse(Timecode.zero()).toString();
        var tcb = Optional.ofNullable(a.getTimecode()).orElse(Timecode.zero()).toString();
        assertEquals(tca, tcb);
        assertEquals(a.getElapsedTime(), b.getElapsedTime());
        assertEquals(a.getRecordedTimestamp(), b.getRecordedTimestamp());
        assertEquals(a.getVideoReferenceUuid(), b.getVideoReferenceUuid());
        if (checkUuid) {
            assertEquals(a.getImageReferenceUuid(), b.getImageReferenceUuid());
            assertEquals(a.getImagedMomentUuid(), b.getImagedMomentUuid());
        }
    }

    public static void assertSameAncillaryData(AncillaryData a, AncillaryData b, boolean checkUuid) {
        assertSameAncillaryData(a, b, checkUuid, true);
    }

    public static void assertSameAncillaryData(AncillaryData a, AncillaryData b, boolean checkUuid, boolean checkTimestamp) {
        if (checkTimestamp) {
            assertEquals(a.getRecordedTimestamp(), b.getRecordedTimestamp());
        }
        assertEquals(a.getAltitude(), b.getAltitude(), 0.001);
        assertEquals(a.getCrs(), b.getCrs());
        assertEquals(a.getDepthMeters(), b.getDepthMeters(), 0.001);
        assertEquals(a.getLatitude(), b.getLatitude(), 0.001);
        assertEquals(a.getLongitude(), b.getLongitude(), 0.001);
        assertEquals(a.getLightTransmission(), b.getLightTransmission(), 0.001);
        assertEquals(a.getOxygenMlL(), b.getOxygenMlL(), 0.001);
        assertEquals(a.getPhi(), b.getPhi());
        assertEquals(a.getPosePositionUnits(), b.getPosePositionUnits());
        assertEquals(a.getPressureDbar(), b.getPressureDbar(), 0.001);
        assertEquals(a.getPsi(), b.getPsi());
        assertEquals(a.getSalinity(), b.getSalinity(), 0.001);
        assertEquals(a.getTemperatureCelsius(), b.getTemperatureCelsius(), 0.001);
        assertEquals(a.getTheta(), b.getTheta());
        assertEquals(a.getX(), b.getX());
        assertEquals(a.getY(), b.getY());
        assertEquals(a.getZ(), b.getZ());
        if (checkUuid) {
            assertEquals(a.getUuid(), b.getUuid());
            assertEquals(a.getImagedMomentUuid(), b.getImagedMomentUuid());
        }
    }

    public static void assertSameCachedVideoReference(CachedVideoReference a, CachedVideoReference b, boolean checkUuid) {
        assertEquals(a.getMissionContact(), b.getMissionContact());
        assertEquals(a.getPlatformName(), b.getPlatformName());
        assertEquals(a.getMissionId(), b.getMissionId());
        assertEquals(a.getVideoReferenceUuid(), b.getVideoReferenceUuid());
        if (checkUuid) {
            assertEquals(a.getUuid(), b.getUuid());
        }
    }

    public static void assertSameIndex(Index a, Index b, boolean checkUuid) {
        assertEquals(a.getElapsedTime(), b.getElapsedTime());
        assertEquals(a.getRecordedTimestamp(), b.getRecordedTimestamp());
        assertEquals(a.getVideoReferenceUuid(), b.getVideoReferenceUuid());
        if (checkUuid) {
            assertEquals(a.getUuid(), b.getUuid());
        }
    }

}

