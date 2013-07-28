/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
public class Coder extends Configurable {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Coder(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGCoderUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Coder(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGCoderUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(Coder obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Coder object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Coder copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Coder(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Coder)
      equal = (((Coder)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 *  
 * @param	inputOptions If non-null, a bag of codec-specific options. 
 *		  
 * @param	unsetOptions If non-null, the bag will be emptied and then 
 *		 filled with  
 * the options in <code>inputOptions</code> that were not set.  
 */
  public void open(KeyValueBag inputOptions, KeyValueBag unsetOptions) {
    VideoJNI.Coder_open(swigCPtr, this, KeyValueBag.getCPtr(inputOptions), inputOptions, KeyValueBag.getCPtr(unsetOptions), unsetOptions);
  }

/**
 * The Codec this StreamCoder will use.  
 * @return	The Codec used by this StreamCoder, or 0 (null) if none. 
 *		  
 */
  public Codec getCodec() {
    long cPtr = VideoJNI.Coder_getCodec(swigCPtr, this);
    return (cPtr == 0) ? null : new Codec(cPtr, false);
  }

/**
 * A short hand for getCodec().getType().  
 * @return	The Type of the Codec we'll use.  
 */
  public MediaDescriptor.Type getCodecType() {
    return MediaDescriptor.Type.swigToEnum(VideoJNI.Coder_getCodecType(swigCPtr, this));
  }

/**
 * A short hand for getCodec().getID().  
 * @return	The ID of the Codec we'll use.  
 */
  public Codec.ID getCodecID() {
    return Codec.ID.swigToEnum(VideoJNI.Coder_getCodecID(swigCPtr, this));
  }

/**
 * The height, in pixels.  
 * @return	The height of the video frames in the attached stream  
 * or -1 if an audio stream, or we cannot determine the height.  
 */
  public int getHeight() {
    return VideoJNI.Coder_getHeight(swigCPtr, this);
  }

/**
 * Set the height, in pixels.  
 * @see		#getHeight()  
 * @param	height Sets the height of video frames we'll encode. No-op 
 *		 when DECODING.  
 */
  public void setHeight(int height) {
    VideoJNI.Coder_setHeight(swigCPtr, this, height);
  }

/**
 * The width, in pixels.  
 * @return	The width of the video frames in the attached stream  
 * or -1 if an audio stream, or we cannot determine the width.  
 */
  public int getWidth() {
    return VideoJNI.Coder_getWidth(swigCPtr, this);
  }

/**
 * Set the width, in pixels  
 * @see		#getWidth()  
 * @param	width Sets the width of video frames we'll encode. No-op when 
 *		 DECODING.  
 */
  public void setWidth(int width) {
    VideoJNI.Coder_setWidth(swigCPtr, this, width);
  }

/**
 * For Video streams, get the Pixel Format in use by the stream.  
 * @return	the Pixel format, or PixelFormat::PIX_FMT_NONE if audio. 
 *		  
 */
  public PixelFormat.Type getPixelFormat() {
    return PixelFormat.Type.swigToEnum(VideoJNI.Coder_getPixelFormat(swigCPtr, this));
  }

/**
 * Set the pixel format to ENCODE with. Ignored if audio or  
 * DECODING.  
 * @param	pixelFmt Pixel format to use.  
 */
  public void setPixelType(PixelFormat.Type pixelFmt) {
    VideoJNI.Coder_setPixelType(swigCPtr, this, pixelFmt.swigValue());
  }

/**
 * Get the sample rate we use for this coder.  
 * @return	The sample rate (in Hz) we use for this stream, or -1 if 
 *		 unknown or video.  
 */
  public int getSampleRate() {
    return VideoJNI.Coder_getSampleRate(swigCPtr, this);
  }

/**
 * Set the sample rate to use when ENCODING. Ignored if DECODING  
 * or a non-audio stream.  
 * @param	sampleRate New sample rate (in Hz) to use.  
 */
  public void setSampleRate(int sampleRate) {
    VideoJNI.Coder_setSampleRate(swigCPtr, this, sampleRate);
  }

/**
 * Get the audio sample format.  
 * @return	The sample format of samples for encoding/decoding.  
 */
  public AudioFormat.Type getSampleFormat() {
    return AudioFormat.Type.swigToEnum(VideoJNI.Coder_getSampleFormat(swigCPtr, this));
  }

/**
 * Set the sample format when ENCODING. Ignored if DECODING  
 * or if the coder is already open.  
 * @param	format The sample format.  
 */
  public void setSampleFormat(AudioFormat.Type format) {
    VideoJNI.Coder_setSampleFormat(swigCPtr, this, format.swigValue());
  }

/**
 * Get the number of channels in this audio stream  
 * @return	The sample rate (in Hz) we use for this stream, or 0 if unknown. 
 *		  
 */
  public int getChannels() {
    return VideoJNI.Coder_getChannels(swigCPtr, this);
  }

/**
 * Set the number of channels to use when ENCODING. Ignored if a  
 * non audio stream, or if DECODING.  
 * @param	channels The number of channels we'll encode with.  
 */
  public void setChannels(int channels) {
    VideoJNI.Coder_setChannels(swigCPtr, this, channels);
  }

/**
 * Get the time base this stream will ENCODE in, or the time base we 
 *  
 * detect while DECODING.  
 * @return	The time base this StreamCoder is using.  
 */
  public Rational getTimeBase() {
    long cPtr = VideoJNI.Coder_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new Rational(cPtr, false);
  }

/**
 * Set the time base we'll use to ENCODE with. A no-op when DECODING. 
 *  
 * As a convenience, we forward this call to the Stream#setTimeBase() 
 *  
 * method.  
 * @see		#getTimeBase()  
 * @param	newTimeBase The new time base to use.  
 */
  public void setTimeBase(Rational newTimeBase) {
    VideoJNI.Coder_setTimeBase(swigCPtr, this, Rational.getCPtr(newTimeBase), newTimeBase);
  }

  public enum Flag {
    FLAG_UNALIGNED(VideoJNI.Coder_FLAG_UNALIGNED_get()),
  /**
   * Use fixed qscale.
   */
    FLAG_QSCALE(VideoJNI.Coder_FLAG_QSCALE_get()),
  /**
   * 4 MV per MB allowed advanced prediction for H.263.
   */
    FLAG_4MV(VideoJNI.Coder_FLAG_4MV_get()),
  /**
   * Use qpel MC.
   */
    FLAG_QPEL(VideoJNI.Coder_FLAG_QPEL_get()),
  /**
   * Use GMC.
   */
    FLAG_GMC(VideoJNI.Coder_FLAG_GMC_get()),
  /**
   * Always try a MB with MV=<0,0>.
   */
    FLAG_MV0(VideoJNI.Coder_FLAG_MV0_get()),
  /**
   * The parent program guarantees that the input for B-frames containing 
   *
   * streams is not written to for at least s->max_b_frames+1 frames, 
   * if
   * this is not set the input will be copied.
   */
    FLAG_INPUT_PRESERVED(VideoJNI.Coder_FLAG_INPUT_PRESERVED_get()),
  /**
   * Use internal 2pass ratecontrol in first pass mode.
   */
    FLAG_PASS1(VideoJNI.Coder_FLAG_PASS1_get()),
  /**
   * Use internal 2pass ratecontrol in second pass mode.
   */
    FLAG_PASS2(VideoJNI.Coder_FLAG_PASS2_get()),
  /**
   * Only decode/encode grayscale.
   */
    FLAG_GRAY(VideoJNI.Coder_FLAG_GRAY_get()),
  /**
   * Don't draw edges.
   */
    FLAG_EMU_EDGE(VideoJNI.Coder_FLAG_EMU_EDGE_get()),
  /**
   * error[?] variables will be set during encoding.
   */
    FLAG_PSNR(VideoJNI.Coder_FLAG_PSNR_get()),
  /**
   * Input bitstream might be truncated at a random
   * location instead of only at frame boundaries.
   */
    FLAG_TRUNCATED(VideoJNI.Coder_FLAG_TRUNCATED_get()),
  /**
   * Normalize adaptive quantization.
   */
    FLAG_NORMALIZE_AQP(VideoJNI.Coder_FLAG_NORMALIZE_AQP_get()),
  /**
   * Use interlaced DCT.
   */
    FLAG_INTERLACED_DCT(VideoJNI.Coder_FLAG_INTERLACED_DCT_get()),
  /**
   * Force low delay.
   */
    FLAG_LOW_DELAY(VideoJNI.Coder_FLAG_LOW_DELAY_get()),
  /**
   * Place global headers in extradata instead of every keyframe.
   */
    FLAG_GLOBAL_HEADER(VideoJNI.Coder_FLAG_GLOBAL_HEADER_get()),
  /**
   * Use only bitexact stuff (except (I)DCT).
   */
    FLAG_BITEXACT(VideoJNI.Coder_FLAG_BITEXACT_get()),
  /**
   * H.263 advanced intra coding MPEG-4 AC prediction
   */
    FLAG_AC_PRED(VideoJNI.Coder_FLAG_AC_PRED_get()),
  /**
   * loop filter
   */
    FLAG_LOOP_FILTER(VideoJNI.Coder_FLAG_LOOP_FILTER_get()),
  /**
   * interlaced motion estimation
   */
    FLAG_INTERLACED_ME(VideoJNI.Coder_FLAG_INTERLACED_ME_get()),
    FLAG_CLOSED_GOP(VideoJNI.Coder_FLAG_CLOSED_GOP_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Flag swigToEnum(int swigValue) {
      Flag[] swigValues = Flag.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flag swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flag.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flag() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flag(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flag(Flag swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum Flag2 {
  /**
   * Allow non spec compliant speedup tricks.
   */
    FLAG2_FAST(VideoJNI.Coder_FLAG2_FAST_get()),
  /**
   * Skip bitstream encoding.
   */
    FLAG2_NO_OUTPUT(VideoJNI.Coder_FLAG2_NO_OUTPUT_get()),
  /**
   *
   */
    FLAG2_LOCAL_HEADER(VideoJNI.Coder_FLAG2_LOCAL_HEADER_get()),
  /**
   * timecode is in drop frame format. DEPRECATED!!!!
   */
    FLAG2_DROP_FRAME_TIMECODE(VideoJNI.Coder_FLAG2_DROP_FRAME_TIMECODE_get()),
  /**
   * Discard cropping information from SPS.
   */
    FLAG2_IGNORE_CROP(VideoJNI.Coder_FLAG2_IGNORE_CROP_get()),
  /**
   * Input bitstream might be truncated at a packet boundaries instead 
   * of only at frame boundaries.
   */
    FLAG2_CHUNKS(VideoJNI.Coder_FLAG2_CHUNKS_get()),
  /**
   * Show all frames before the first keyframe
   */
    FLAG2_SHOW_ALL(VideoJNI.Coder_FLAG2_SHOW_ALL_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Flag2 swigToEnum(int swigValue) {
      Flag2[] swigValues = Flag2.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Flag2 swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Flag2.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Flag2() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Flag2(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Flag2(Flag2 swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}