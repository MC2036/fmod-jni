/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public enum FMOD_TAGTYPE {
  FMOD_TAGTYPE_UNKNOWN(FMODJNI.FMOD_TAGTYPE_UNKNOWN_get()),
  FMOD_TAGTYPE_ID3V1,
  FMOD_TAGTYPE_ID3V2,
  FMOD_TAGTYPE_VORBISCOMMENT,
  FMOD_TAGTYPE_SHOUTCAST,
  FMOD_TAGTYPE_ICECAST,
  FMOD_TAGTYPE_ASF,
  FMOD_TAGTYPE_MIDI,
  FMOD_TAGTYPE_PLAYLIST,
  FMOD_TAGTYPE_FMOD,
  FMOD_TAGTYPE_USER,
  FMOD_TAGTYPE_MAX,
  FMOD_TAGTYPE_FORCEINT(FMODJNI.FMOD_TAGTYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public static FMOD_TAGTYPE swigToEnum(int swigValue) {
    FMOD_TAGTYPE[] swigValues = FMOD_TAGTYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (FMOD_TAGTYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + FMOD_TAGTYPE.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private FMOD_TAGTYPE() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private FMOD_TAGTYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private FMOD_TAGTYPE(FMOD_TAGTYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

