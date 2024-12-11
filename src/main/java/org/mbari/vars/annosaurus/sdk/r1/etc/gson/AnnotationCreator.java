package org.mbari.vars.annosaurus.sdk.r1.etc.gson;

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
