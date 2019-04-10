package com.just.fastdfs;

import java.io.Serializable;

/**
 * @Description:
 * @Date 2018/10/10 11:00
 * @Company:亚银网络科技有限公司
 */
public interface FileManagerConfig extends Serializable {

    public static final String FILE_DEFAULT_AUTHOR = "Jsaepay";

    public static final String PROTOCOL = "http://";

    public static final String SEPARATOR = "/";

    public static final String TRACKER_NGNIX_ADDR = "123.206.216.158";

    public static final String TRACKER_NGNIX_PORT = "80";

    public static final String CLIENT_CONFIG_FILE = "fdfs_client.conf";

}
