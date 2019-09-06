## 更新未加粉信息
### 请求方法
    POST

### 请求URL
    /api/customer/UpdateUnCanonCustomer
    
### 是否需要登录
    是

### 请求参数

    {
        "id": 1,// 账号ID
        "weChatNo": "aaa",// 微信号
        "name": "aaa",// 姓名
        "gender": 1,// 性别 0-保密 1-男 2-女
        "telephone": 138888888,// 手机
        "status"; 1 // 关系状态 0-正常 1-删除(删除的时候传)
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
