package com.just.util;

public class Constants {
	
	public static final String REST_URL = "/api";
	public static final String REST_APP_URL = "/app";
	public static final String REST_PC_URL = "/pc";
	public static final String REST_WAP_URL = "/webapi";
	public static final String WEB_PAGE_URL = "/webpage";
	
	// 登录信息
	// 用户信息
	public static final String LOGIN_APP_USER = "APP_USER";
	
	public static final Integer THREAD_PAGE_SIZE = 100;

	public static final Integer THREAD_PAGE_SIZE_I = 50;
	
	public static final Integer THREAD_PAGE_SIZE_BY_GRANTTICKETS = 200;
	
	public static final String KEY = "KO1NK8HXV635TIECZ7QI4VK3VEDF";//"S1A5SA24521SFA34SDF234ASDFS3";
	
	// 报备模板必须在 最后+上一个空格
	public static final String RECHARGE_FORMAT_TEXT = "您在{0}充 值{1}元，余额：{2}元，下载V-Ka 客户端随时查看余额及消费记录。";
	public static final String PAYMENT_FORMAT_TEXT = "您在{0}消费{1}元，余额：{2}元，下载V-Ka 客户端随时查看余额及消费记录。";
	public static final String REVERSAL_FORMAT_TEXT = "您在{0}有冲销金额返还，金额：{1}元，余额：{2}元，下载V-Ka 客户端随时查看余额及消费记录。";
	public static final String CANCEL_ORDER_FORMAT_TEXT = "您在{0}取消了一笔订单，金额：{1}元，余额：{2}元，下载V-Ka 客户端随时查看余额及消费记录。";
	public static final String VERIFY_CODE_SMS_FORMAT_TEXT = "您的注册验证码:{0},请在2分钟内提交，逾期无效。 ";
	public static final String BIND_CODE_SMS_FORMAT_TEXT = "您的绑定验证码:{0},请在3分钟内提交，逾期无效。 ";
	public static final String COMMON_CODE_SMS_FORMAT_TEXT = "您的验证码:{0},请在3分钟内提交，逾期无效。 ";
	
	public static final Integer SMS_CREATE_CARD = 1001;
	public static final Integer SMS_RECHARGE = 1002;
	public static final Integer SMS_PAYMENT = 1003;
	public static final Integer SMS_CHECK = 1004;
	public static final Integer SMS_CANCEL_ORDER = 1005;
	
	public static final String SMS_COUNT = "SMS_COUNT";         //短信数量
	public static final String PASSWORD_PAY = "PASSWORD_PAY";   // 1消费密码开启  0消费密码不开启
	public static final String PASSWORD_TICKETUSE = "PASSWORD_TICKETUSE";   // 1优惠券使用密码验证开启  0优惠券使用密码验证不开启
	public static final String RECHARGE_TYPE = "RECHARGE_TYPE";  // 1 定额充值  2不定额充值
	public static final String CARD_BALANCE_AMOUNT = "CARD_BALANCE_AMOUNT";  //单卡充值金额上限
	
	public static final Integer LOCKED = 1;
	public static final Integer UNLOCKED = 0;
	
	public static final String LOCAL_PATH = Constants.class.getResource("/").getPath();
	public static final String BUCKE_NAME = "merchants";
	public static final String REMOTE_URL = "http://merchants.oss-cn-hangzhou.aliyuncs.com/";
	public static final String SafetyCertificate_MchId = "/usr/local/";

	/**
	 * 保存商户安全证书的文件名字
	 */
	public static final String FILE_NAME = "SafetyCertificate/";
	public static final String Bank_Logo = "bankLogo/";
	/**
	 * 存放营业执照文件夹
	 */
	public static final String Business_License_Name = "BusinessLicense";

	public static final String SRCB_LIQ_RSP_FILE = "SRCB_LIQ_RSP_FILE";
	/**
	 * 保存积分配置的Key
	 */
	public static final String POINT_CONFIG_KEY = "POINT_CONFIG_KEY";
	
	
	/***
	 * 积分兑换
	 */
	public static final String POINT_EXCHANGE_CONFIG_KEY = "POINT_EXCHANGE_CONFIG_KEY";
	
	
	/***
	 * 积分兑换--默认兑换积分
	 */
	public static final String POINT_EXCHANGE_DEFAULTPOINT_KEY = "POINT_EXCHANGE_DEFAULTPOINT_KEY";
	
	/***
	 * 积分兑换--最大兑换积分
	 */
	public static final String POINT_EXCHANGE_MAXPOINT_KEY = "POINT_EXCHANGE_MAXPOINT_KEY";
	
	/***
	 * 积分兑换--兑换积分基数
	 */
	public static final String POINT_EXCHANGE_BASEPOINT_KEY = "POINT_EXCHANGE_BASEPOINT_KEY";
	
	
	/**
	 * 到期时间跨度(月数)
	 */
	public static final String MEMBER_LEVEL_EXPIRATION_DATE="MEMBER_LEVEL_EXPIRATION_DATE";
	
	
	/**
	 * 消费金额(一元)增加经验值
	 */
	public static final String MEMBER_LEVEL_ADDEXP_EXPEND_BYMONEY="MEMBER_LEVEL_ADDEXP_EXPEND_BYMONEY";
	
	/**
	 * 消费次数(一次)增加经验值
	 */
	public static final String MEMBER_LEVEL_ADDEXP_EXPEND_BYTIMES="MEMBER_LEVEL_ADDEXP_EXPEND_BYTIMES";
	
	/**
	 * 会员折扣与抵扣券是否可同时消费
	 */
	public static final String MEMBER_LEVEL_EXPEND_WITH_REBATE="MEMBER_LEVEL_EXPEND_WITH_REBATE";
	
	/**
	 * 会员折扣与折扣券是否可同时消费
	 */
	public static final String MEMBER_LEVEL_EXPEND_WITH_COUPON="MEMBER_LEVEL_EXPEND_WITH_COUPON";
	
	
	/**
	 * 注册赠送经验值
	 */
	public static final String MEMBER_LEVEL_ADDEXP_BYREGISTER="MEMBER_LEVEL_ADDEXP_BYREGISTER";
	
	/**
	 * 登陆赠送经验值(每天第一次) 
	 */
	public static final String MEMBER_LEVEL_ADDEXP_BYLOGIN="MEMBER_LEVEL_ADDEXP_BYLOGIN";
	
	/**
	 * 签到赠送经验值(每天第一次)
	 */
	public static final String MEMBER_LEVEL_ADDEXP_BYSIGNIN="MEMBER_LEVEL_ADDEXP_BYSIGNIN";
	
	/**
	 * 微信公众号登陆VERIFY_TICKET
	 */
	public static final String COMPONENT_VERIFY_TICKET="COMPONENT_VERIFY_TICKET";
	
	/**
	 * 会员生日关怀提前天数
	 */
	public static final String MEMBER_BIRTHDAY_CARE_BEFORE_DAYS="MEMBER_BIRTHDAY_CARE_BEFORE_DAYS";
	
	
	/**
	 * 微信模版消息的key,在以下场景中用得到,比如把微信模版消息对象set进Request,或者Response
	 * @author guoyu
	 */
	public static final String WX_TEMPLATE_MESSAGE_KEY = "WX_TEMPLATE_MESSAGE_KEY";
	/**
	 * 订单生成的机器IP
	 */
	public static final String SPBILLCREATEIP = "127.0.0.1";

	/**
	 * 订单类型：0-堂食
	 */
	public static final int ORDER_EATIN = 0;

	/**
	 * 订单类型：1-外卖
	 */
	public static final int ORDER_TAKEAWAY = 1;

	public static final String DEFAULT_CITY ="北京市";
	/**
	 * 订单来源：0-vivipos
	 */
	public static final int ORDER_SOURCE_VIVIPOS = 0;
	/**
	 * 订单来源：1-微商城
	 */
	public static final int ORDER_SOURCE_VSHOP = 1;

	/**
	 * 活动折扣与会员折扣是否叠加
	 */
	public static final String ACTIVITY_DISCOUNT_AND_CARD_LEVEL_DISCOUNT_IS_SUPERIMPOSING = "ACTIVITY_DISCOUNT_AND_CARD_LEVEL_DISCOUNT_IS_SUPERIMPOSING";
	/**
	 * 存放支付页面URL
	 */
	public static final String WX_PAY_PAGE_URL = "WX_PAY_PAGE_URL";
	public static final String ALI_PAY_PAGE_URL = "ALI_PAY_PAGE_URL";
	/**
	 * 存放支付完成页面URL
	 */
	public static final String WX_PAY_OVER_PAGE_URL = "WX_PAY_OVER_PAGE_URL";
	public static final String ALI_PAY_OVER_PAGE_URL = "ALI_PAY_OVER_PAGE_URL";
	/**
	 * 存放支付应用名称
	 */
	public static final String PAY_APP_NAME = "PAY_APP_NAME";
	public static final String ALI_PAY_APP_NAME = "ALI_PAY_APP_NAME";
	/**
	 * 存放支付页面配置LOGO
	 */
	public static final String PAY_APP_LOGO = "PAY_APP_LOGO";
	public static final String ALI_PAY_APP_LOGO = "ALI_PAY_APP_LOGO";

	/**
	 * 存放支付后活动页面配置数据
	 */
	public static final String PAY_OVER_AD_CONTENT = "WX_PAY_OVER_AD_CONTENT";
	public static final String USER_AUTH_CONFIG = "USER_AUTH_CONFIG";
	public static final String ALI_USER_AUTH_CONFIG = "ALI_USER_AUTH_CONFIG";
	/**
	 * 存放批量进件EXCEL
	 */
	public static final String Batch_Import_Excel = "BatchImportExcel";
	public static final String WX_PAY_PAGE_DESC = "WX_PAY_PAGE_DESC";
	public static final String WX_PAY_BANK_TYPE = "WX_PAY_BANK_TYPE";

	/**
	 * 交学费银行配置
     */
	public static final String PAY_TUITION_FEE_TYPE = "PAY_TUITION_FEE_TYPE";//缴费种类
	public static final String PAY_TUITION_ACADEMIC_YEAR = "PAY_TUITION_ACADEMIC_YEAR";//缴费学年
	public static final String PAY_TUITION_ACADEMIC_TERM = "PAY_TUITION_ACADEMIC_TERM";//缴费学期
	public static final String PAY_TUITION_DEFAULT_CITY = "PAY_TUITION_DEFAULT_CITY";//默认缴费城市
	public static final String PAY_TUITION_PAY_RULES = "PAY_TUITION_PAY_RULES";//缴费规则
	public static final String PAY_TUITION_SCHOOL_SEAL = "PAY_TUITION_SCHOOL_SEAL";//学校公章
	public static final String PAY_TUITION_APP_ID = "PAY_TUITION_APP_ID";//公众号ID
	public static final String PAY_TUITION_HOT_CITY = "PAY_TUITION_HOT_CITY";//热门城市
	public static final String PAY_TUITION_USER_AUTH = "PAY_TUITION_USER_AUTH";//用户授权
	public static final String PAY_TUITION_EXCEL_COUNT= "PAY_TUITION_EXCEL_COUNT";
	public static final String PAY_TUITION_BANK_LOGO = "PAY_TUITION_BANK_LOGO";//银行logo
	public static final String PAY_TUITION_SMS_SIGN = "PAY_TUITION_SMS_SIGN";//短信签名
	public static final String BANK_INTERFACE_EXCHANGE_CONFIG = "BANK_INTERFACE_EXCHANGE_CONFIG";//银行接口切换标识

	public static final String PAY_TUITION_SCHOOL_LOGO = "PAY_TUITION_SCHOOL_LOGO";//学校公章
	public static final String PAY_TUITION_TEMP = "temp";//临时目录
	public static final String PAY_TUITION_NOTICE_BACKGROUND = "PAY_TUITION_NOTICE_BACKGROUND";//通知书背景图

	public static final String BANK_ADVERTISEMENT_CONFIG = "BANK_ADVERTISEMENT_CONFIG";//存放广告图片
	public static final String COUPON_POOL_MANAGE = "COUPON_POOL_MANAGE";//存放卡券logo图片

	public static final String BANK_LOGO_IMG = "BANK_LOGO_IMG";//银行logo




}
