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




import org.mbari.vars.annosaurus.sdk.r1.etc.jdk.Strings;
import org.mbari.vars.annosaurus.sdk.r1.models.AncillaryData;
import org.mbari.vars.annosaurus.sdk.r1.models.Annotation;
import org.mbari.vars.annosaurus.sdk.r1.models.Association;
import org.mbari.vars.annosaurus.sdk.r1.models.CachedVideoReference;
import org.mbari.vars.annosaurus.sdk.r1.models.Image;
import org.mbari.vars.annosaurus.sdk.r1.models.ImageReference;

import org.mbari.vcr4j.time.FrameRates;
import org.mbari.vcr4j.time.Timecode;

import java.net.MalformedURLException;
import java.net.URI;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

public class TestUtils {

    private static final Random random = new Random();



    public static List<Annotation> buildRandomAnnotations(int count, boolean extend) {
        var xs = TestUtils.buildRandomAnnotations(count);
        if (extend) {
            xs.forEach(y -> {

                // Add association
                var ass = TestUtils.buildRandomAssociation();
                y.setAssociations(List.of(ass));

                // Add data
                var d = TestUtils.buildRandomAncillaryData();
                d.setImagedMomentUuid(y.getImagedMomentUuid());
                y.setAncillaryData(d);

                // add image reference
                var i = TestUtils.buildRandomImageReference();
                var j = new Image(y, i);
                var ir = new ImageReference(j);
                y.setImageReferences(List.of(ir));
            });
        }
        return new ArrayList<>(xs);
    }

    public static List<Annotation> buildRandomAnnotations(int count) {
        var videoReferenceUuid = UUID.randomUUID();
        return IntStream.range(0, count)
                .mapToObj(i -> {
                    var a = buildRandomAnnotation();
                    a.setVideoReferenceUuid(videoReferenceUuid);
                    return a;
                })
                .toList();
    }


    public static Annotation buildRandomAnnotation() {
        var a = new Annotation();
        a.setConcept(Strings.random(30));
        a.setObserver(Strings.random(10));
        a.setObservationTimestamp(Instant.now());
        a.setVideoReferenceUuid(UUID.randomUUID());
        if (random.nextBoolean()) {
            var t =  random.nextDouble(1000);
            var tc = new Timecode(t, FrameRates.NTSC);
            a.setTimecode(tc);
        }
        if (random.nextBoolean()) {
            a.setElapsedTime(Duration.ofSeconds(random.nextInt(60)));
        }
        a.setRecordedTimestamp(Instant.now());
        if(random.nextBoolean()) {
            a.setDuration(Duration.ofSeconds(random.nextInt(60)));
        }
        if (random.nextBoolean()) {
            a.setDuration(Duration.ofSeconds(random.nextInt(60)));
        }
        a.setGroup(Strings.random(10));
        a.setActivity(Strings.random(10));

        return a;
    }

    public static Association buildRandomAssociation() {
        var linkName = Strings.random(10);
        var linkValue = Strings.random(255);
        var toConcept = Strings.random(10);
        var mimeType = random.nextBoolean() ? "text/plain" : "application/json";
        return new Association(linkName, toConcept, linkValue, mimeType);
    }

    public static ImageReference buildRandomImageReference() {
        var ir = new ImageReference();
        try {
            var url =URI.create("http://www.foo.bar/" + Strings.random(30) + ".jpg").toURL();
            ir.setUrl(url);
        } catch (MalformedURLException e) {
            // this shouldn't ever happen
            throw new RuntimeException(e);
        }
        ir.setDescription(Strings.random(100));
        ir.setFormat("image/jpeg");
        ir.setWidth(random.nextInt(1920));
        ir.setHeight(random.nextInt(1080));
        return ir;
    }


    public static AncillaryData buildRandomAncillaryData() {
        var ad = new AncillaryData();
        ad.setRecordedTimestamp(Instant.now());
        ad.setAltitude(random.nextDouble(1000));
        ad.setCrs(Strings.random(10));
        ad.setDepthMeters(random.nextDouble(4000));
        ad.setLatitude(random.nextDouble(90));
        ad.setLightTransmission(random.nextDouble(100));
        ad.setLongitude(random.nextDouble(180));
        ad.setOxygenMlL(random.nextDouble(10));
        ad.setPhi(random.nextDouble(360));
        ad.setPosePositionUnits(Strings.random(10));
        ad.setPressureDbar(random.nextDouble(4000));
        ad.setPsi(random.nextDouble(360));
        ad.setSalinity(random.nextDouble(40));
        ad.setTemperatureCelsius(random.nextDouble(15));
        ad.setTheta(random.nextDouble(360));
        ad.setX(random.nextDouble(1000));
        ad.setY(random.nextDouble(1000));
        ad.setZ(random.nextDouble(1000));
        return ad;
    }

    public static CachedVideoReference buildRandomCachedVideoReference() {
        return new CachedVideoReference(Strings.random(32), Strings.random(32),
                UUID.randomUUID(), Strings.random(64), UUID.randomUUID());

    }

    public static Timecode randomTimecode() {
        var t =  random.nextDouble(3600);
        var ntsc = new Timecode(t, FrameRates.NTSC);
        return new Timecode(ntsc.toString());
    }
}

