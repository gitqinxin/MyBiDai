## 更新好友关系表
### 请求方法
    POST

### 请求URL
    /api/customer/UpdateAccountCustomer
    
### 是否需要登录
    是

### 请求参数

    {
        "id": 1,// ID
        "companyId": 1,// 公司ID
        "accountId": 1,// 公司微信账号ID
        "customerId": 1,// 客户微信账号ID
        "status": 1// 帐户状态0:正常 1:删除
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
