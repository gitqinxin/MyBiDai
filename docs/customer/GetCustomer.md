## 获取单个客户信息
### 请求方法
    POST

### 请求URL
    /api/customer/GetCustomer
    
### 是否需要登录
    是

### 请求参数

    {
        "id": 1 // 客户帐户ID
    }

### 应答参数(data)

    {
        "code": 0,
        "data": {
                "id":1, // 账号ID
                "companyId":"2", // 公司ID
                "weChatId":"1",// 微信ID
                "weChatNo":"1",// 微信号
                "weChatNickname":"111", // 微信昵称
                "weChatRemark":"111", // 微信备注
                "weChatAvatar":"http://www.www.com/1.jpg", // 微信头像
                "name":"111", // 姓名
                "gender":"111", // 性别 0-保密 1-男 2-女
                "telephone":"111", // 手机
                "tags":"111", // 标签
                "status":"111", // 账号状态 0-正常 1-禁用
                "createTime":"1559699009000, // 创建时间
                "updateTime":"1559699009000 // 更新时间
         },
        "message": "成功"
    }
