#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_albert_demo_util_NativeMethod_helloFormC(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}