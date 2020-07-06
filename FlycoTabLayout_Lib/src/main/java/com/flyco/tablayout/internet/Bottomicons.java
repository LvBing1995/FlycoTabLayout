package com.flyco.tablayout.internet;

public class Bottomicons {

    /**
     * icon : http://shixiantest.oss-cn-hangzhou.aliyuncs.com/49/advert/2020/04/10/ed8b78d798f4b9d9e23842a44080b614.png
     * bgicon : http://shixiantest.oss-cn-hangzhou.aliyuncs.com/49/advert/2020/04/15/18848231af1659ad1e0eb23a02cc8eda.png
     * name : 首页3
     * bgname : 首页
     * sort : 0
     * status : 1
     * remind : 禁用了
     * erectHeight : zzz
     */

    private String icon;
    private String bgicon;
    private String name;
    private String bgname;
    private int sort;
    private int status;
    private String remind;
    private int erectHeight = -1;//特殊TabView需要超出原来父容器高度

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBgicon() {
        return bgicon;
    }

    public void setBgicon(String bgicon) {
        this.bgicon = bgicon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBgname() {
        return bgname;
    }

    public void setBgname(String bgname) {
        this.bgname = bgname;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    public int getErectHeight() {
        return erectHeight;
    }

    public void setErectHeight(int erectHeight) {
        this.erectHeight = erectHeight;
    }
}
