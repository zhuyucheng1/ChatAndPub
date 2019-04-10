package com.just.util;

/**
 * @Author 朱玉成
 * @Date by 2019/3/31
 * @Email zhuyucheng@jsaepay.com
 * @Company:亚银网络科技有限公司
 * @Description:
 */
public class Score {
    private String key;
    private float significance;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public float getSignificance() {
        return significance;
    }

    public void setSignificance(float significance) {
        this.significance = significance;
    }

    @Override
    public String toString() {
        return "关键词=" + key +
                ", 重要程度=" + significance;
    }
}
