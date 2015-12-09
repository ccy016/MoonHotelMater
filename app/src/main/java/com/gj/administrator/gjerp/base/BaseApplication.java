package com.gj.administrator.gjerp.base;

import android.app.Application;

import com.gj.administrator.gjerp.util.LogUtil;

/**
 * BaseApplication
 * Created by GuoJun on 2015/12/9.
 */
public class BaseApplication extends Application {

    private static BaseApplication instance;
    public static boolean isDebugmode = false;

    /**
     * <p>
     * 获取BaseApplication实例
     * <p>
     * 单例模式，返回唯一实例
     *
     * @return instance
     */
    public static BaseApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (instance == null) {
            instance = this;
        }

        ActivityManage.init();               // 初始化活动管理器
        LogUtil.setLogStatus(isDebugmode); // 设置是否显示日志

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        LogUtil.e("BaseApplication", "onLowMemory");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        LogUtil.e("BaseApplication", "onTerminate");
    }
}