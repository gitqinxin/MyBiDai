## 同步微信好友数据
### 请求方法
    POST

### 请求URL
    /api/customer/UpdateAccountCustomerList
    
### 是否需要登录
    是

### 请求参数

    {
        "accountWeChatId":"111",//导购微信ID  (*必填)
        "accountWeChatNo":"111",//导购微信号
        "customerList":[//好友列表
                         {
                             "weChatId": 1,// 微信ID (*必填)
                             "weChatNo": 1,// 微信号
                             "weChatNickname": "aaa",// 微信昵称 (*必填)
                             "weChatRemark": "aaa",// 微信备注
                             "weChatAvatar": "aaa",// 微信头像
                             "name": "aaa",// 姓名
                             "gender": 1,// 性别 0-保密 1-男 2-女 (*必填)
                             "telephone": 138888888,// 手机
                             "tags": "aa",// 标签
                             "accountCustomerStatus":  0,// 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝 5-找不到微信用户
                             "accountCustomerRemark": "aaa",// 关系备注
                         },
                         ...
                         {
                              "weChatId": 1,// 微信ID (*必填)
                              "weChatNo": 1,// 微信号
                              "weChatNickname": "aaa",// 微信昵称 (*必填)
                              "weChatRemark": "aaa",// 微信备注
                              "weChatAvatar": "aaa",// 微信头像
                              "name": "aaa",// 姓名
                              "gender": 1,// 性别 0-保密 1-男 2-女 (*必填)
                              "telephone": 138888888,// 手机
                              "tags": "aa",// 标签
                              "accountCustomerStatus":  0,// 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝 5-找不到微信用户
                              "accountCustomerRemark": "aaa",// 关系备注
                         }
                     ]
       
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
