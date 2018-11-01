package us.cnlist.cop.controller.async;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

public interface SingleCallback<T> extends MethodCallback<T> {

    @Override
    default void onFailure(Method method, Throwable exception) {
        //TODO: Сказать об ошибке
    }

    @Override
    default void onSuccess(Method method, T response) {
        proceed(response);
    }

    void proceed(T response);
}
