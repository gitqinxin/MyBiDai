## 获取自动加粉列表
### 请求方法
    POST

### 请求URL
    /api/customer/GetUnpowderedList?pageOffset=0&pageLimit=10
    
### 是否需要登录
    是

### 请求参数

    {
        "gender": 1,// 客户性别 0-保密 1-男 2-女
        "name": "aa", // 名字
        "telephone": 13811111111111,//手机
        "weChatNo": "11"// 微信号
        "status":  4// 不填值获取所有自动加粉列表 4-过滤加粉被拒绝 5-过滤找不到微信用户 6-过滤 加粉被拒绝和找不到微信用户
    }

### 应答参数(data)

    {
        "code": 0,
        "data": [
                    {
                        "customerId":1, // 客户账号ID
                        "weChatId":"2", // 客户微信ID
                        "weChatNo":"2", // 客户微信号
                        "weChatNickname":"1",// 客户微信昵称
                        "weChatAvatar":"http://www.www.com/1.jpg"", // 客户微信头像
                        "name":"111", // 客户姓名
                        "gender":1, // 客户性别 0-保密 1-男 2-女
                        "telephone":"111", // 客户手机
                        "createTime":12222222, // 创建时间
                        "status":1, // 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝
                        "remark":"111", // 关系备注
                    },
                    ...
                    {
                        "customerId":1, // 客户账号ID
                        "weChatId":"2", // 客户微信ID
                        "weChatNo":"2", // 客户微信号
                        "weChatNickname":"1",// 客户微信昵称
                        "weChatAvatar":"http://www.www.com/1.jpg"", // 客户微信头像
                        "name":"111", // 客户姓名
                        "gender":1, // 客户性别 0-保密 1-男 2-女
                        "telephone":"111", // 客户手机
                        "createTime":12222222, // 创建时间
                        "status":1, // 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝
                        "remark":"111", // 关系备注
                    }
         ],
        "message": "成功"
    }
