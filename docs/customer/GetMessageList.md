## 获取聊天记录
### 请求方法
    POST

### 请求URL
    /api/customer/GetMessageList?pageOffset=0&pageLimit=10
    
### 是否需要登录
    是

### 请求参数

    {
        "hostId": "aaa",// 导购微信ID *必填
        "peerId": "bbb",// 客户微信ID *必填
        "content": "搜索内容"// 搜索内容 非必填 
    }

### 应答参数(data)

    {
        "code": 0,
        "data": [
            {
                "id":1, // 聊天记录ID
                "companyId":1, // 公司ID
                "hostId":"2", // 导购微信ID
                "peerId":"1",// 客户微信ID
                "sender":1, // 本端标识 0-消息接收方 1-消息发送方
                "msgId":"1",// msgId
                "msgType":"2", // 消息类型 0-未知内容,1-Text文本内容,2-Picture图片消息,3-Voice语音消息,4-Video视频消息,5-System系统消息,6-Link链接消息,7-LinkExt扩展的链接消息(小程序分享等),内容为xml格式,暂未使用,8-File文件发送,9-NameCard名片,10-Location位置信息,11-LuckyMoney红包,12-MoneyTrans转账,13-WeApp小程序,14-Emoji暂时未使用,15-RoomManage群管理消息,16-Sys_LuckyMoney领取红包消息,17-RoomSystem群聊系统消息,99-UnSupport不支持的消息
                "content":"111", // 消息内容
                "isSend":"True",// 是否发送成功 True-发送成功,False-发送失败
                "deleted":0, // 是否删除(撤回) 0-正常 1-删除     
                "sendTime":1559699009000, // 发送时间
                "accountNo":"2", // 导购微信号
                "accountNickname":"2", // 导购微信昵称
                "accountAvatar":"2", // 导购微信头像
                "accountName":"1",// 导购姓名
                "customerNo":"1",// 客户微信号
                "customerNickname":"1",// 客户微信昵称
                "customerAvatar":"2", // 客户微信头像
                "customerName":"1",// 客户姓名
                "createTime":"1559699009000, // 创建时间
                "updateTime":"1559699009000 // 更新时间
            },
            ...
            {
                "id":1, // 聊天记录ID
                "companyId":1, // 公司ID
                "hostId":"2", // 导购微信ID
                "peerId":"1",// 客户微信ID
                "sender":1, // 本端标识 0-消息接收方 1-消息发送方
                "msgId":"1",// msgId
                "msgType":"2", // 消息类型 0-未知内容,1-Text文本内容,2-Picture图片消息,3-Voice语音消息,4-Video视频消息,5-System系统消息,6-Link链接消息,7-LinkExt扩展的链接消息(小程序分享等),内容为xml格式,暂未使用,8-File文件发送,9-NameCard名片,10-Location位置信息,11-LuckyMoney红包,12-MoneyTrans转账,13-WeApp小程序,14-Emoji暂时未使用,15-RoomManage群管理消息,16-Sys_LuckyMoney领取红包消息,17-RoomSystem群聊系统消息,99-UnSupport不支持的消息
                "content":"111", // 消息内容
                "isSend":"True",// 是否发送成功 True-发送成功,False-发送失败
                "deleted":0, // 是否删除(撤回) 0-正常 1-删除     
                "sendTime":1559699009000, // 发送时间
                "accountNo":"2", // 导购微信号
                "accountNickname":"2", // 导购微信昵称
                "accountAvatar":"2", // 导购微信头像
                "accountName":"1",// 导购姓名
                "customerNo":"1",// 客户微信号
                "customerNickname":"1",// 客户微信昵称
                "customerAvatar":"2", // 客户微信头像
                "customerName":"1",// 客户姓名
                "createTime":"1559699009000, // 创建时间
                "updateTime":"1559699009000 // 更新时间
            }
        ],
        "message": "成功",
        "pageControl": {
            "pageLimit": 10,
            "pageOffset": 0,
            "recordCount": 1
        }
    }
