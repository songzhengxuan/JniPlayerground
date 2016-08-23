#include <jni.h>
/* Header for class com_song_jni_HelloJni */

#ifndef _Included_com_song_jni_HelloJni
#define _Included_com_song_jni_HelloJni
#ifdef __cplusplus
extern "C" {
#endif
	/*
	 *  * Class:     com_song_jni_HelloJni
	 *   * Method:    testByteBuffer
	 *    * Signature: (Ljava/nio/ByteBuffer;)V
	 *     */
	JNIEXPORT int JNICALL Java_com_song_jni_HelloJni_testByteBuffer
		  (JNIEnv *, jobject, jobject);

#ifdef __cplusplus
}
#endif
#endif
