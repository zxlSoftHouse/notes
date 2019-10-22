package com.zxlsofthouse.notes.annotation.checkChildAnnotation;

import java.lang.reflect.Method;

public class BaseController<T> {

    public void init(T a) {
        if (this.getClass().isAnnotationPresent(CheckParam.class)) {
            try {
                Method f = a.getClass().getSuperclass().getMethod("setName", String.class);
                f.invoke(a, 27);
                Method f1 = a.getClass().getSuperclass().getMethod("getName");
                f1.invoke(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
