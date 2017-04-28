package com.ding.data;

import com.ding.annotation.AnnotationUser;
import com.ding.annotation.ClassInfo;
import com.ding.annotation.MethodInfo;
import junit.framework.TestCase;

import javax.swing.*;
import java.lang.reflect.Method;

/**
 * Created by Gurongjing on 2017/4/28.
 * huifang company
 */
public class AnnotationTest extends TestCase{
    public static void test(){
        Class class1 = AnnotationUser.class;
        if(class1.isAnnotationPresent(ClassInfo.class)){
            ClassInfo classInfo = (ClassInfo) class1.getAnnotation(ClassInfo.class);
            System.out.println(classInfo.name());
            System.out.println(classInfo.value());
        }
        Method[] methods = class1.getMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(MethodInfo.class)){
                MethodInfo methodInfo = (MethodInfo) method.getAnnotation(MethodInfo.class);
                System.out.println(methodInfo.name());
                System.out.println(methodInfo.value());
            }
        }
    }

    public static void testAnnotation(){
        AnnotationTest.test();
    }
}
