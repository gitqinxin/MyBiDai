## 添加群聊天记录
### 请求方法
    POST

### 请求URL
    /api/customer/AddMessageGroup
    
### 是否需要登录
    是

### 请求参数

    {
        "hostId": "aaa",// 本端微信ID 
        "peerId": "ccc",// 对端微信ID
        "sender": "aaa",// 本端标识 0-消息接收方 1-消息发送方
        "msgId": "aaa",// 消息ID
        "msgType": "aa",// 消息类型 0-未知内容,1-Text文本内容,2-Picture图片消息,3-Voice语音消息,4-Video视频消息,5-System系统消息,6-Link链接消息,7-LinkExt扩展的链接消息(小程序分享等),内容为xml格式,暂未使用,8-File文件发送,9-NameCard名片,10-Location位置信息,11-LuckyMoney红包,12-MoneyTrans转账,13-WeApp小程序,14-Emoji暂时未使用,15-RoomManage群管理消息,16-Sys_LuckyMoney领取红包消息,17-RoomSystem群聊系统消息,99-UnSupport不支持的消息
        "content": "aaa",// 消息内容(格式自定义)
        "isSend": 138888888,// 是否发送成功 True-发送成功,False-发送失败
        "deleted": "1",// 是否删除(撤回) 0-正常   1-删除
        "sendTime": 138888888,// 发送时间
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
