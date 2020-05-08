package cn.blog.service;

import cn.blog.Domin.OptionsDomain;

import java.util.List;
import java.util.Map;


public interface OptionService {

    /**
     * 删除网站配置
     */
    void deleteOptionByName(String name);

    /**
     * 更新网站配置
     * */
    void updateOptionByName(String name, String value);

    /**
     * 保存网站配置
     */
    void saveOptions(Map<String, String> options);
    /***
     * 根据名称获取网站配置
     */
    OptionsDomain getOptionByName(String name);

    /**
     * 获取全部网站配置
     */
    List<OptionsDomain> getOptions();
}
