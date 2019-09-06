## 更新微信好友信息
### 请求方法
    POST

### 请求URL
    /api/customer/UpdateCustomer
    
### 是否需要登录
    是

### 请求参数

    {
        "id": 1,// 账号ID
        "name": "aaa",// 姓名
        "weChatRemark": "aaa",// 微信备注
        "telephone": 138888888,// 手机
        "tags": "aa"// 标签
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
