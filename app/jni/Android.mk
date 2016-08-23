LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := libsong
LOCAL_ARM_MODE := arm
LOCAL_SRC_FILES := \
	hello.h \
	hello.cpp

LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)
