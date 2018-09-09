package com.amon.springboot.web.enums;

/**
 * 是否有效的枚举类
 * yaming.chen@siemens.com
 *
 * @author chenyaming
 * @date 2016/12/6
 */
public enum ActiveStatus {

    /**
     * 失效
     */
    INACTIVE
    {
        @Override
        public Integer getStatus(){
            return 0;
        }
    }
    /**
     * 有效
     */
    ,ACTIVE

    {
        @Override
        public Integer getStatus(){
            return 1;
        }
    };

    public abstract Integer getStatus();

}
