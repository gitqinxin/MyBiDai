## 添加客户
### 请求方法
    POST

### 请求URL
    /api/customer/AddCustomer
    
### 是否需要登录
    是

### 请求参数

    {
        "weChatNo": 1,// 微信号
        "name": "aaa",// 姓名
        "gender": 1,// 性别 0-保密 1-男 2-女
        "telephone": 138888888// 手机
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
