package com.fotile.c2i.ota.bean;

/**
 * Created by fuzya on 2017-09-12.
 */

import java.io.Serializable;

/**
 * 文件名称：UpgradeInfo
 * 创建时间：2017-09-12.
 * 文件作者：fuzya
 * 功能描述：系统升级信息
 */
public class UpgradeInfo implements Serializable {
    public String id; // 数据库中的版本升级id字段，暂无作用
    public String name; // 版本名称
    public String code; // 预留字段，默认为1
    public String packagename; // 包名
    public String md5; // 文件md5
    public String comment; // 升级说明
    public String size; // 升级包文件大小
    public String url; // 升级包下载地址
    public String version; // 返回的升级版本号
    public String forversion; // 可升级此版本固件的版本，如果返回非空，则代表差分包，如果为空，则为全包
    public String upgradeType; // 升级类型，0：强制升级，1：推荐升级

}
