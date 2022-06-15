package com.system.mapper;

import com.system.po.UserloginCustom;

/**
 *  拓展类
 */
public interface UserloginMapperCustom {

    UserloginCustom findOneByName(String name) throws Exception;

}
