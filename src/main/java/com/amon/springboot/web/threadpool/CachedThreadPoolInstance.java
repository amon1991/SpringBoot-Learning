package com.amon.springboot.web.threadpool;

import java.util.concurrent.ExecutorService;

/**
 * yaming.chen@siemens.com
 *
 * @author chenyaming
 * @date 8/11/16
 */
public final class CachedThreadPoolInstance {

    /**
     * hungry mode
     */
    private static final ExecutorService EXECUTOR = SieExecutors.newCachedThreadPool();

    /**
     * Cannot instantiate.
     */
    private CachedThreadPoolInstance(){
    }

    public static ExecutorService getThreadPoolInstance(){
        return EXECUTOR;
    }

}
