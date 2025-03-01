/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.fmod.jni;

public class FMOD_STUDIO_ADVANCEDSETTINGS {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FMOD_STUDIO_ADVANCEDSETTINGS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_ADVANCEDSETTINGS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FMODJNI.delete_FMOD_STUDIO_ADVANCEDSETTINGS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  	if(obj == this) return true;
  	if(obj == null) return false;
  	if (! (obj instanceof FMOD_STUDIO_ADVANCEDSETTINGS)) return false;
    return this.swigCPtr == ((FMOD_STUDIO_ADVANCEDSETTINGS)obj).swigCPtr;
  }
  public int hashCode() {
     return (int)swigCPtr;
  }

  public void setCbsize(int value) {
    FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_cbsize_set(swigCPtr, this, value);
  }

  public int getCbsize() {
    return FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_cbsize_get(swigCPtr, this);
  }

  public void setCommandqueuesize(long value) {
    FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_commandqueuesize_set(swigCPtr, this, value);
  }

  public long getCommandqueuesize() {
    return FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_commandqueuesize_get(swigCPtr, this);
  }

  public void setHandleinitialsize(long value) {
    FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_handleinitialsize_set(swigCPtr, this, value);
  }

  public long getHandleinitialsize() {
    return FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_handleinitialsize_get(swigCPtr, this);
  }

  public void setStudioupdateperiod(int value) {
    FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_studioupdateperiod_set(swigCPtr, this, value);
  }

  public int getStudioupdateperiod() {
    return FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_studioupdateperiod_get(swigCPtr, this);
  }

  public void setIdlesampledatapoolsize(int value) {
    FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_idlesampledatapoolsize_set(swigCPtr, this, value);
  }

  public int getIdlesampledatapoolsize() {
    return FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_idlesampledatapoolsize_get(swigCPtr, this);
  }

  public void setStreamingscheduledelay(long value) {
    FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_streamingscheduledelay_set(swigCPtr, this, value);
  }

  public long getStreamingscheduledelay() {
    return FMODJNI.FMOD_STUDIO_ADVANCEDSETTINGS_streamingscheduledelay_get(swigCPtr, this);
  }

  public FMOD_STUDIO_ADVANCEDSETTINGS() {
    this(FMODJNI.new_FMOD_STUDIO_ADVANCEDSETTINGS(), true);
  }

}
