package cn.bproject.neteasynews.http;

/**
 * Created by CaoZike on 2021/12/05.
 */

public interface HttpCallbackListener {
    void onSuccess(String result);
    void onError(Exception e);
}
