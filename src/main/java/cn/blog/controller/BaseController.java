package cn.blog.controller;

import cn.blog.constant.Types;
import cn.blog.constant.WebConst;
import cn.blog.dto.MetaDto;
import cn.blog.dto.cond.ContentCond;
import cn.blog.Domin.UserDomain;
import cn.blog.service.ContentService;
import cn.blog.service.MetaService;
import cn.blog.service.SiteService;
import cn.blog.utils.MapCache;
import cn.blog.utils.TaleUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public abstract class BaseController {

    @Autowired
    private ContentService contentService;

    @Autowired
    private MetaService metaService;

    @Autowired
    private SiteService siteService;


    protected MapCache cache = MapCache.single();

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    /**
     * 获取blog页面需要的公共数据
     * @param request
     * @return
     */
    public BaseController blogBaseData(HttpServletRequest request, ContentCond contentCond){
        List<MetaDto> links = metaService.getMetaList(Types.LINK.getType(), null,WebConst.MAX_POSTS);
        request.setAttribute("links", links);
        return this;
    }
    /**
     * 获取请求绑定的登录对象
     * @param request
     * @return
     */
    public UserDomain user(HttpServletRequest request) {
        return TaleUtils.getLoginUser(request);
    }

    public Integer getUid(HttpServletRequest request){
        return this.user(request).getUid();
    }

    /**
     * 数组转字符串
     *
     * @param arr
     * @return
     */
    public String join(String[] arr) {
        StringBuilder ret = new StringBuilder();
        String[] var3 = arr;
        int var4 = arr.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            String item = var3[var5];
            ret.append(',').append(item);
        }

        return ret.length() > 0 ? ret.substring(1) : ret.toString();
    }
}
