## 主动加粉
### 请求方法
    POST

### 请求URL
    /api/customer/AddAccountCustomer
    
### 是否需要登录
    是

### 请求参数

    {
        "accountIds": [1,2,3...5],// 导购账号ID数组列表
        "customerIds": [1,2,3...5],// 客户ID数组列表
        "message": "aaa"// 验证消息
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
