package com.just.util;

/**
 * 错误枚举
 *
 * @author guoyu
 */
public enum ErrorEnum {

	SUCCESS(200, "ok"),
	SERVER_ERROR(500, "服务器发生错误"),
	WX_NOT_BIND_STORE(1088, "商家没有开通微信公众平台或者微信支付功能"),
	ALIPAY_NOT_BIND_STORE(1099, "商家没有开通支付宝支付功能"),
	ACCOUNT_EXISTS(1004, "帐号已存在"),
	ADMIN_ACCOUNT_EXISTS(1098, "管理员帐号已存在"),
	ACCOUNT_LOCKED(1002, "账号锁定"),
	ACCOUNT_NOT_EXISTS(1005, "账号不存在"),
	ACCOUNT_PASS_ERROR(1001, "账号或密码不正确"),
	PASSWORD_EMPTY(1025, "密码为空"),
	PASSWORD_ERROR(1003, "密码错误"),
	BALANCE_NOT_ENOUGH(1007, "余额不足"),
	POINT_NOT_ENOUGH(1013, "积分不足"),
	EXCEL_ERROR(1009, "不是正确的Excel文件"),
	EXCEL_FORMAT(1011, "Excel格式错误"),
	MOBILE_EXISTS(1006, "手机号已存在"),
	NOT_PERMISSION(1008, "没有权限"),
	OVER_COUNT(1010, "超出创建分店数量"),
	PARAM_ERROR(1012, "无效参数"),
	APPKEY_ERROR(1014, "appKey and appSecret is error!"),
	APPKEY_EXPIRED(1015, "appkey expired"),
	CODE_ERROR(1020, "code is error!"),
	CODE_EXPIRED(1021, "code expried!"),
	TOKEN_ERROR(1022, "token错误"),
	TOKEN_EXPIRED(1023, "token已过期"),
	COPONS_EXPIRED(1016, "优惠券已失效"),
	ACTIVITY_EXISTS_IN_DATE(1017, "该时间范围内已存在相同类型活动"),
	ACTIVITY_EXISTS_CLOSE_IN_DATE(1058, "这个时间段内已经存在关闭的相同类型活动"),
	CANCEL_ORDER_INVALID_DATE(1018, "该订单已经超过最后退单时间"),
	SMS_EXPIRED(1019, "短信已过期"),
	EXCEL_OVERFLOW(1024, "excel 数据太多"),
	STORE_NOT_EXIST(1026, "商户信息不存在"),
	ORDER_IS_CANCEL(1027, "订单已取消，请不要重复操作"),
	CATEGORIES_EXIST(1028, "一级种类下存在二级种类"),
	PRODUCT_EXIST(1029, "商品不存在"),
	NAME_EXIST(1030, "名字重复了"),
	USER_NOT_EXIST(1031, "用户不存在"),
	PRODUCT_ATTRIBUTE_EXIST(1033, "该分组下已经存在该商品属性"),
	CARD_BINDED(1032, "该会员卡已经被绑定"),
	STORE_NONSUPPORT_TAKEAWAY(1034, "店铺不支持外卖"),
	NOT_TAKEAWAY_NONSUPPORT_COD(1035, "非外卖店铺不支持货到付款"),
	CARD_NOT_EXIST(1036, "会员不存在"),
	CARD_AMOUNT_NOT_ENOUGH(1037, "会员卡余额不足"),
	ORDERS_NOT_EXIST(1038, "订单不存在"),
	STORE_NOT_FAMILY(1039, "不是同一家店铺"),
	STORE_CODE_NOT_EXISTS(1040, "门店编码不存在"),
	EMPLOYEE_NOT_IS_BRAND(1041, "该员工不是本店员工"),
	STORE_CODE_EXISTS(1042, "该门店编码已存在"),
	TICKET_NOT_ENOUGH(1043, "优惠券数量不足"),
	TICKET_IS_USE(1044, "优惠券已使用", "优惠券已使用"),//this.put("cn_message", "优惠券已使用");
	TICKET_EXPIRE(1045, "优惠券已过期", "优惠券已过期"),//this.put("cn_message", "优惠券已过期");
	TICKET_ERROR(1046, "优惠券错误，非法使用", "优惠券错误，非法使用"),//this.put("cn_message", "优惠券错误，非法使用");
	PRICE_DISCORD(1047, "金额数目不一致", "金额数目不一致"),//this.put("cn_message", "金额数目不一致");
	CARD_BALANCE_OVER(1048, "card balance is over!", "卡内金额已达上限"),
	ACTIVITIES_EXISTS_IN_DATE(1049, "activities exists in date", "时间范围内已存在同种类型的活动"),
	MEMBERTRANSFER_NOTFIND_OUTCARD(1050, "转出会员卡信息不存在"),//Response 有误
	MEMBERTRANSFER_NOTFIND_INCARD(1051, "转入会员卡信息不存在"),
	MEMBERTRANSFER_BALANCE_DEFICIENCY(1052, "转出会员卡余额不足"),
	DISTRICT_STORE_ASSOCIATED(1053, "本区域或下属区域有店铺关联,无法删除"),
	PAYMENTCODE_CODE_EXISTS(1054, "支付码不存在"),
	PAYMENTCODE_CODE_EXPIRE(1055, "支付码已过期"),
	PAYMENTCODE_CODE_EXISTSCARD(1056, "支付码和会员卡卡号不一致"),
	PAYMENTCODE_MORE_CONSUMPTION(1057, "本次消费会员卡与之前消费的会员卡不一致(不能同时消费多张卡)"),
	CANCEL_POINT_NOT_ENOUGH(1059, "消费退单时, 积分不够, 不能退单"),
	CANCEL_TRANS_GIVE_USED(1202, "取消订单时,赠送物品已使用"),
	NONSUPPORT_CANCEL(1060, "该交易类型暂时不支持退单"),
	LEVEL_EXPERIENCE_LIMIT_CONFLICT(1061, "会员等级的经验值上下限与其他会员等级冲突!"),
	LEVEL_HAVE_USER_ERROR(1062, "该等级下已存在会员，无法删除!"),
	SOME_TABLE_NUM(1063, "在同一家店铺中，无法添加相同的桌位号！"),
	SOME_TABLE_NUM_UPD(1065, "在同一家店铺中，已经存在相同的桌位号！"),
	NO_SON_STORE_ERR(1064, "不是分店账户，无法进行相关操作！"),
	NO_SON_STORE_INFO(1066, "没有分店信息，请联系店主！"),
	NO_GET_TABLE_NUM(1067, "桌位号没有获取到！"),
	NO_OPENID(1087, "获取到openId出错"),
	STORE_CONFIG_NOT_EXIST(1089, "店铺没有配置这个功能"),
	PICTURE_DOWLOAD_FAIL(1090, "证书上传失败！"),
	NO_ZONGDIAN_NO_DO(1091, "不是总店，无法操作！"),
	DISTRICT_EMPLOYEE_ASSOCIATED(1010, "本区域或下属区域已分配给员工,无法删除"),
	NO_INVENTORY(1110, "亲，您的手速慢了点，已经被别的朋友抢完了"),
	INVENTORY_PROBLEM(1111, "抱歉，库存不足！"),
	CANCEL_PUBLISHING(1200, "抱歉，该商品已下架！"),
	NORMAL_STOP(1201, "程序正常终止"),
	TOTAL_TIMES_AMOUNT(1202, "系统错误，请联系管理员！"),
	NO_VALID_STATUS(1210, "不能同时使用两个相同类型且都有效的证书，可以停用相同类型的证书"),
	ON_FAIL_BY_RETURN_CODE_FAIL(1230, "支付API系统返回失败，请检测Post给API的数据是否规范合法"),
	ON_FAIL_BY_RETURN_CODE_ERROR(1231, "支付请求逻辑错误，请仔细检测传过去的每一个参数是否合法，或是看API能否被正常访问"),
	ON_FAIL_BY_SIGN_INVALID(1232, "支付请求API返回的数据签名验证失败，有可能数据被篡改了"),
	ON_FAIL_BY_AUTHCODE_EXPIRE(1233, "用户用来支付的二维码已经过期，请重新扫一次码"),
	ON_FAIL_BY_AUTHCODE_INVALID(1234, "商户尚未授权或授权码错误！"),
	ON_FAIL_BY_MONEY_NOT_ENOUGH(1235, "提示用户余额不足，换其他卡支付或是用现金支付"),
	WX_SCAN_ON_FAIL(1236, "支付失败，交易已取消，请重新下单"),
	NOT_FOUNT_MCH_INFO(1237, "商户支付配置有误,请确认是否配置正确"),
	NOT_FOUNT_APP_INFO(1238, "商户支付配置(appId)有误,请确认是否配置正确"),
	DOWNLOAD_ERR(1239, "下载安全证书错误！"),
	ON_WX_REFUND_FAIL(1240, "退款失败,请再重试一次"),
	WX_TRANS_ERR(1241, "有微信的交易数据但没有在交易总表中找到对应的交易数据！"),
	TRANSACTION_ID_IS_NULL(1242, "微信退款ID为空，请联系管理员！"),
	TRANSACTION_IS_BACKED(1243, "该笔交易已经退过，请不要重复操作，如有疑问请联系管理员！"),
	WX_CARD_COUPON_STATE_CONSUMED(1243, "已核销"),
	WX_CARD_COUPON_STATE_EXPIRE(1244, "已过期"),
	WX_CARD_COUPON_STATE_GIFTING(1245 , "转赠中"),
	WX_CARD_COUPON_STATE_GIFT_TIMEOUT(1246 , "转赠超时"),
	WX_CARD_COUPON_STATE_DELETE(1247 , "已删除"),
	WX_CARD_COUPON_STATE_UNAVAILABLE(1248 , "已失效"),
	WX_CARD_COUPON_STATE_INVALID_CODE(1249, "code未被添加或被转赠领取"),
	ALIPAY_REQUEST_ERR(1250, "付款码过期，让客户刷新后再重新下单！"),
	ALIPAY_REQUEST_NETERR(1250, "支付网络错误，请检查网络连接！"),
	ALIPAY_REQUEST_QUERYERR(1251, "查询支付结果有误，为保险起见，请重新提交订单！"),
	INTERNET_ERROR(1253, "网络连接超时，请检查网络连接情况！"),
	ALIPAY_UNKNOWN_ERR(1257, "发生未知的错误，导致支付没有进行，请重新试一次，如果还不行请选择其他方式，事后需要联系管理员！"),
	ALIPAY_UNKNOWN_REFUND_ERR(1260, "发生未知的错误，导致退款没有进行，请重新试一次，如果还不行请联系管理员！"),
	WX_CARD_COUPON_SIGNATURE_ERR(1261, "微信签名错误"),
	WX_CARD_COUNPON_USER_GET_ERR(1262, "微信领取会员卡时有一定延迟,请重新进入会员卡"),
	NO_BACK_POINT(1263, "退单失败,因为赠送物品已使用！"),
	Other_Mobile_Take_Up(1264, "修改失败，手机号码已被他人绑定！"),
	OPENID_IS_NULL(1266, "openid为空，无法进行支付！"),
	STOREID_PARAM_ERROR(1267, "该店铺ID有误！"),
	CASHIER_ALREADY_EXISTS(1268, "您已经绑定该店，请不要重复绑定！"),
	NOT_FOUNT_PUBLIC_PLATFORM_TRUSTEESHIP_INFO(1269, "发送消息的公众号未托管！"),
	ON_FAIL_BY_NOT_REVOKE_PRIVILEGES(1270, "支付失败，本应撤销该订单但没有权限！"),
	ON_FAIL_BY_PARAM_ERR_REVOKE_PRIVILEGES(1271, "撤销失败,请求微信接口参数错误！"),
	ON_FAIL_BY_SIGN_INVALID_REVOKE_PRIVILEGES(1272, "撤销失败,撤销接口返回的数据被篡改了！"),
	WX_ORDER_QUERY_PARAM_ERR(1273, "支付订单查询请求逻辑错误，请仔细检测传过去的每一个参数是否合法"),
	WX_ORDER_QUERY_PARAM_ERR_FAIL(1274),//缺少message-----------------------------
	WX_ORDER_QUERY_SIGN_INVALID(1275, "【支付失败】支付请求API返回的数据签名验证失败，有可能数据被篡改了"),
	WX_ORDER_PAY_FAIL_REFUND(1276),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL_NOTPAY(1277),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL_CLOSED(1278),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL_REVOKED(1279),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL_USERPAYING(1280),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL_PAYERROR(1281),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL_UNKNOW(1282),//缺少message-----------------------------
	WX_ORDER_PAY_FAIL(1283,"微信支付错误"),//缺少message-----------------------------
	WX_ORDER_NO_OUT_TRADE_NO(1284, "交易取消！"),
	WX_REVERSE_REQUEST_ERR(1285, "支付订单撤销请求逻辑错误，请仔细检测传过去的每一个参数是否合法！"),
	WX_REVERSE_REQUEST_RETURN_ERRMSG(1286),//缺少message-----------------------------
	WX_REVERSE_SIGN_INVINID(1287, "【撤销失败】撤销请求API返回的数据签名验证失败，有可能数据被篡改了"),
	CASHIER_LOGIN_NO_SON(1288, "只有分店账号才能被绑定！"),
	WX_REVERSE_REQUEST_RETURN_RECALL_N(1289, "撤销成功！"),
	WX_PAY_SUC(1290, "已经付款成功！"),
	onFailByQuerySignInvalid(1291, "查询请求API返回的数据签名验证失败，有可能数据被篡改了！"),
	onFailByQueryOthersErr(1292),//缺少message-----------------------------
	query_net_err(1293, "网络错误，请重新请求！"),
	AUTH_CODE_INVALID(1294, "请输入有效的条码或二维码！"),
	Load_Certificate_Net_Err(1295, "加载安全证书时，网络连接超时，请重试！"),
	YY_KEY_ERR(1296, "传入的key有误，请检查！"),
	YY_REQUEST_TOTALFEE_ERR(1297, "传入的金额不能为零，请检查！"),
	YY_REQUEST_BODY_ERR(1298, "传入的商品描述不能为空，请检查！"),
	WX_INTERFACE_VALIDATE_ERR(1299, "微信支付,支付配置没有配置正确"),
	NOT_PROXY_MCH(1300, "不是代理账号，没有权限！"),
	MOBILE_OR_OTHERMOBILE_SAME(1301, "同一个品牌存在多个相同账号或手机号，请联系品牌商！"),
	JSPAY_REQUEST_OPENID_IS_NULL(1303, "请求参数有误，openid为空！"),
	JSPAY_REQUEST_MONEY_IS_ZERO(1304, "请求参数有误，金额为零！"),
	JSPAY_REQUEST_NOTIFYURL_IS_NULL(1305, "请求参数有误，回调地址为空！"),
	JSPAY_REQUEST_BOBY_IS_NULL(1306, "请求参数有误，标题为空！"),
	CERTIFICATE_DECRYPTION_ERROR(1302, "证书错误,请联系安装人员"),
	EXPLAN_CLASH_DATE(1307, "该执行计划周期与其他执行计划冲突!"),
	EXPLAN_CLASH_NAME(1308, "该执行计划名称已存在"),
    DATA_FORMAT_ERROR(1309, "请求数据格式错误"),
	QPAY_RETURN_NULL(1310,"财付通返回数据为空,请稍后重试!"),
	QPAY_NET_ERR(1311,"服务器网络连接失败！"),
	QPAY_REFUND_FAIL(1312,"退款失败,需要商户在商户平台手动退款！"),
	QPAY_REFUND_FAIL_ERR_BANKNO(1313,"客户银行账户有误，钱已退回商户财付通账户，请商户通过其它方式退款给用户!"),
	QPAY_TO_REVERSE(1314,"由于用户30s内没有输入密码，本次交易已取消，请重新发起支付！"),
	QJSPAY_GET_TOKENID_ERR(1315,"未知错误！"),
	QPAY_MISSING_PARAMETERS(1316,"缺少必填参数！"),
	QJSPAY_MISSING_MCHINFO(1317,"找不到手Q商户信息！"),
	QJSPAY_DOWNLOAD_CER_ERR(1318,"下载安全证书错误，服务器网络异常！"),
	QJSPAY_TRANS_MISSING(1319,"不存在当前记录！"),
	QJSPAY_TRANS_STATUS_ERR(1320,"当前记录状态有误，不满足退款条件！"),
	QPAY_ORDER_CANCEL(1321,"订单已取消，请重新发起支付！"),
	QPAY_STATUS_UNKNOW(1322,"该订单状态无法确认，请手动查询一次！"),
	GETHTTPCLIENT_ERR(1323,"获取HttpClient错误!"),
	MiSSING_PROXY_INST(1324,"找不到上级机构!"),
	MiSSING_PROXY_BARGAINORID(1325,"填入的代理商商户号不匹配!"),
	MiSSING_PROXY_PUBLICPLATFORM(1326,"找不到公众号的托管信息!"),
	MiSSING_ALIPAY_PROXY_PUBLICPLATFORM(2355,"找不到支付宝授权信息!"),
	SAVA_THIRD_KEY_ERR(1327,"保存第三方密钥失败!"),
	SAVA_LOCAL_KEY_ERR(1328,"保存本地密钥失败!"),
	SAVA_YAYIN_KEY_ERR(1329,"保存亚银密钥失败!"),
	SUB_MCH_ADD_RET_IS_NULL(1335,"微信操作子商户返回为空"),
	PC_PARAM_MISSING(1330,"缺少必填参数!"),
	PC_EMP_ERR(1331,"employee err!"),
	PC_STORE_ERR(1332,"store err!"),
	PC_NOT_MERCHANT_ID(1333,"不是商户员工账号!"),
	PC_MERCHANT_NOT_EXISTS(1334,"商户不存在!"),
	PC_payMchinfoErr(1335,"支付配置有误"),
	PC_chongfudeqrcode(1336,"相同的二维码发起了两次请求!"),
	PC_TRANS_STATUS_ERR(1337,"订单状态不满足退款条件!"),
	PC_refund_exp(1338,"退款异常，请在官方后台退款!"),
	Accepting_Business_Info_Err(1339,"受理商支付配置有误!"),
	Automatic_Feeding_Exp(1340,"自动进件微信返回异常!"),
	Apply_extend_merchant(1344,"申请绿洲计划返回异常!"),
	Edit_extend_merchant(1701,"修改绿洲计划返回异常!"),
	Edit_extend_merchant_NOJUR(1702,"该商户未申请绿洲计划!"),
	Edit_merchant_Head_NOTUSE(1703,"该总店尚未通过审核！暂时无法进件分店!"),
	No_Choice_PayType(1341,"请至少选择一种移动支付方式!"),
	InstId_Not_Exists(1342,"当前机构不存在,无法创建商户!"),
	Bank_Model_MerNum_Err(1343,"银行受理模式下，一个机构只能创建一个品牌!"),
	PC_MERCHANT_NOT_EXISTS_Disable(1345,"商户已被禁用或删除!"),
	PC_MERCHANT_NOT_EXISTS_Error(13079,"商户信息有误!"),

	DISCOUNT_ERROR(1346,"折扣错误"),
	ACTIVITY_HAS_BEEN_DELETED(1347,"活动已被删除！"),
	ACTIVITIES_ARE_BEING_CARRIED_OUT(1348,"活动正在进行！"),
	THERE_ARE_OTHER_TYPES_OF_ACTIVITIES_IN_THE(1347,"有其它类型活动在进行！"),
	CURRENTLY_THERE_IS_NO_DISCOUNT_ACTIVITY(1348,"当前没有折扣活动"),
	AN_ACTIVITY_THAT_IS_NOT_AVAILABLE(1349,"没有可享受的活动"),
	SAVE_EVENT_FAILED(1350,"保存活动失败"),
	MINIMUM_THRESHOLD_VALUE(1351,"活动名称不能重复"),
	ACTIVITY_DUPLICATE(1352,"同一个时间段内只能启用一种类型的活动"),
	BANK_ACTIVITY_CONFIG_DUPLICATE(13521,"同一代理商只可开启一个活动配置"),
	BANK_BLACKWHITELIST_CONFIG_DUPLICATE_TIMESCOPE(13522,"同一银行下同一类型下同一个时间段内只能开启一个黑名单或白名单配置"),
	END_TIME_SHOULD_NOT_BE_LESS_THAN_THE_START_TIME(1352,"结束时间不能小于开始时间"),
	ACTIVITY_HAS_NOT_STARTED(1353,"活动未开始"),
	wx_jspay_total_is_zero(1354,"微信支付金额为零，无法支付"),
	wx_jspay_activiti_compute_service_err(1355,"服务器计算金额为零"),
	wx_jspay_activiti_compute_diff_err(1356,"服务端与客户端折扣金额不一致"),
	UPLOAD_IMAGE_OVERSIZE(1357,"上传LOGO图片不得超过60K"),
	SUB_QQ_ADD_RET_IS_NULL(1358,"手Q操作子商户返回为空"),
	PCDoNotSupportTheNextDayFefund(1359,"暂不受理隔天退款的记录"),
	NotFoundNeedIntoPiecesQQMers(1360,"没有找到需要进件的QQ商户"),
	ProxyQQPayInfoNoConfigure(1361,"QQ代理商支付信息没有配置"),
	MissingMerbelongToInstId(1360,"商户所属机构不存在"),
	wx_jspay_activiti_id_diff_err(1356,"服务端与客户端折活动ID不一致"),
	NULLFILE(1369,"文件为空"),
	NULLCELL(13009,"文件为空"),
	WRONGMODEL(13019,"模板文件有误"),
	FILEOVERSIZE(13020,"文件超过系统一次导入量5000"),
	WxProxyPayUniqueness(13021,"配置信息重复,请检查"),
	WxProxyPayIsDefaultNoUniqueness(13022,"已经开启一个默认配置了"),
	WxProxyPayCerIsNull(13023,"上传证书为空"),
	DpulateCoupon(13024,"该卡券已被添加过，不可重复添加"),
	SendRedPackErr(13025,"抱歉,请您再尝试一次"),
	NoRedPackActivityErr(13026,"抱歉,您的银行还没有开启该活动"),
	NoRedPackDownCerErr(13027,"抱歉,下载发送红包的安全证书出错了"),
	NoRedPackActivityCloseErr(13028,"抱歉,您的银行已关闭该活动"),
	MissRedPackActivityMchInfoErr(13029,"抱歉,缺少发送的相关信息"),
	RedPackHasBeenSent(13030,"抱歉,您来晚了,红包已发完"),
	RedPackRankNoConfig(13031,"抱歉,红包随机数未配置"),
	AgainStatisticsAndAccountsErr(13032,"只能重置交易日期为昨天的数据"),
	Alipay_Config_VALIDATE_ERR(13033, "支付宝支付,支付配置没有配置正确"),
	Alipay_Trans_Duplicate_ERR(13034, "支付宝订单重复"),
	Alipay_Store_Config_ERR(13035, "支付宝第三方授权错误"),
	WXNS_ALIPAY_REQUEST_SIGN_ERROR(13036,"无锡农商支付宝支付请求报文加签失败"),
	WXNS_ALIPAY_RESPONSE_VALIDATE_ERROR(13037,"无锡农商支付宝支付响应报文验签失败"),
	WXNS_ALIPAY_CONFIG_ERROR(13038,"无锡农商支付宝配置有误"),
	ALIPAY_VERTIFY_OUTTRADENO_ERROR(13039,"支付宝异步通知验签订单编号不一致"),
	ALIPAY_VERTIFY_APPID_ERROR(13040,"支付宝异步通知验签APPID不一致"),
	ALIPAY_VERTIFY_MONEY_ERROR(13041,"支付宝异步通知验签订单金额不一致"),
	ALIPAY_VERTIFY_ERROR(13042,"支付宝异步通知验签失败"),
	ALIPAY_TRADE_ERROR(13999,"支付宝刷卡支付失败"),
	ALIPAY_Automatic_Feeding_Exp(13043,"支付宝自动进件返回异常!"),
	NotFoundNeedIntoPiecesAlipayMers(13044,"没有找到需要进件的支付宝商户"),
	ProxyAlipayInfoNoConfigure(13045,"支付宝代理商支付信息没有配置"),
	Alipay_Trade_Cancel_Trade_Sucsess(13046,"订单已支付成功，不支持撤销，请调用退款接口"),
	Accepting_Business_Auth_Err(13047,"受理商授权有误,请重新授权!"),
	NotFindStudentInfo(13048,"没有找到相关信息"),
	GetUserAuthUrlErr(13049,"获取用户授权路径失败"),
	GetWxCommonEntityErr(13050,"获取WxCommonEntity失败"),
	GetWxComponentAccessTokenErr(13051,"获取ComponentAccessToken失败"),
	GetWxUserJsonErr(13052,"获取WxUserJson失败"),
	BankTypeVague(13048,"结果不明确,以公众号里面是否有发为准!"),
	RedPassWordAlreadyUsed(13048,"抱歉,口令已被使用!"),
	SubMchIdIsEmpty(13049,"子商户号为空!"),
	PaymentChannelNotOpen(13050,"该支付渠道未开启!"),
	ParseAttach(13051,"解析支付金额格式错误!"),
	MissPayTuitionBills(13052,"未找到该学生需缴费信息!"),
	ClientAttachAndServerAttachInconsistent(13053,"客户需支付信息与服务端不一致!"),
	ClientTotalFeeAmountAndServerTotalFeeAmountInconsistent(13053,"客户需支付总额与服务端计算不一致!"),
	AttachFormatErr(13054,"attach格式错误!"),
	WrongEXCELModel(13055,"数据模版错误，请重新下载模版!"),
	WrongMONEY(13056,"缴费金额有误请重新确认数据!"),
	FailCounts(13057,"请先处理校验失败数据!"),
	WRCB_MER_REQUEST_SIGN_ERROR(13058,"商户服务平台请求报文加签失败"),
	WRCB_MER_RESPONSE_VALIDATE_ERROR(13059,"商户服务平台响应报文验签失败"),
	YYHTTPS_REQUEST_ERR(13060,"AsiaEagle HTTPSRequest Err!"),
	WRCB_HTTPS_REQUEST_ERR(13061,"WRCB HTTPSRequest Err!"),
	WRCB_HTTPS_REQUEST_EXC(13062,"WRCB HTTPSRequest Exception!"),
	ForwardingPathNotConfigured(13063,"转发路径未配置!"),
	OrderDoneRefund(13064,"请不要重复退款!"),
	NotSupportBankRevoke(13065,"暂不支持撤销操作!"),
	WRCBRespIsNull(13066,"银行返回为空!"),
	InstAliDoneAccount(13067,"该机构支付宝已经对账成功!"),
	InstWxDoneAccount(13068,"该机构微信已经对账成功!"),
	InstAliAccounting(13069,"该机构支付宝正在对账中!"),
	InstWxAccounting(13070,"该机构微信正在对账中!"),
	CanNotReceive(13071,"一天只能领取一次!"),
	RedPackIsDone(13072,"红包已发完,请明天再来!"),

	InvalidatePassWord(13073,"无效的口令!"),
	OrderInfoDetail(13074,"请求参数订单详情GBK编码有误!"),
	InterruptedException(13077,"轮询微信支付订单异常!"),
	PayCanalException(13078,"扫码支付渠道异常!"),
	CopyTopInstIdIsNull(13075,"被复制的机构号为空!"),
	CopyTopInstIdIsErr(13076,"被复制的机构号不满足要求!"),
	JNQueryAPIIsErr(13077,"订单信息有误,不满足发放条件"),
	OrderAmountError(13088,"订单金额格式有误!"),
	DateTimeError(13089,"日期格式转换有误!"),
	NoNeedPayInfo(13090,"对不起，您目前没有未缴纳的收费项目"),
	NotFindTelInfo(13091,"未找到该手机号相关缴费信息！"),
	NotFindStuInfo(13092,"该学生不存在！"),
	QUANTITYBIGTOTAL(13093,"剩余数量有误！"),
	SUB_MEDIA_ID_IS_NULL(13094,"微信上传图片返回为空"),
	PCDeviceInfoIsNull(13095,"设备号不能为空"),
	PCInsufficientPermission(13096,"没有权限,无法使用"),
	PCAccessTokenIsNull(13097,"token为空"),
	PCEMPNOTEXISTS(13098,"用户不存在"),
	MissingToInstId(13100,"商户所属银行不存在"),
	MissingPCModel(13101,"PCPos使用模式不明确"),
	PCNotActivated(13102,"PCPos未激活,无法正常收银"),
	PCDeviceBeOtherActivated(13103,"该设备已经被其它店铺激活,无法再次激活"),
	BuyerLimit(13104,"友情提示：活动只能参加一次哦"),
	MMAPP_BANK_NOT_EXISTS_Disable(13105,"银行已被禁用或删除!"),
	QueryIsNull(13106,"查询结果为空!"),
	PageSizeOrPageIndexIsNull(13107,"pageSize或者pageIndex不能为空!"),
	PageSizeIsTooBig(13108,"pageSize不能超过10条!"),
	PCDeviceActivatedInfoErr(13109,"PCPos激活信息有误,无法继续操作!"),
	NoOperationAuthority(13109,"无操作权限"),
	QueryChanlIsErr(13110,"支付渠道有误"),
	WRCBRespIsERROR(13111,"银行返回参数格式错误!"),
	LimitConfigIsNotExit(18001,"配置不存在"),
	LimitOneForALLConfig(18002,"全部限定模式下，一种支付类型只能开启一个配置"),
	LiqDateError(18003,"清算日期有误"),
	LiqDateDupulate(18004,"清算日期重复"),
	LiqRspConfigIsNotExit(18005,"回盘配置不存在"),
	NoLiqRspFailRecord(18006,"没有需要发送的失败记录"),
	NoEmailCofig(18007,"该银行没有配置需要发送的收件人"),

    file_notex_err(10050,"读取该路径文件不存在!"),
    file_notready_err(10051,"服务器上文件未生成好!"),
    file_check_err(10052,"文件行数与check文件rowCount不吻合!"),
    file_read_err(10053,"读取文件错误!"),
    file_no_detail(10054,"文件没有内容"),
    file_check_info_err(10055,"check文件格式和记录数错误!"),

	;


	/**
	 * 错误信息
	 *
	 * @author guoyu
	 */
	private String message;

	/**
	 * 错误code
	 *
	 * @author guoyu
	 */
	private int code;

	/**
	 * 中文提示,一般情况下用不到,只有之前 xpi过渡到中文提示的版本有使用
	 * @author guoyu
	 */
	private String cnMessage;

	ErrorEnum(int code) {
		this.code = code;
	}

	ErrorEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	ErrorEnum(int code, String message, String cnMessage) {
		this.code = code;
		this.message = message;
		this.cnMessage = cnMessage;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public String getCnMessage() {
		return cnMessage;
	}

}