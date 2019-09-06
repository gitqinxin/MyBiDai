## 更新好友关系状态
### 请求方法
    POST

### 请求URL
    /api/customer/UpdateAccountCustomerStatus
    
### 是否需要登录
    是

### 请求参数

    {
        "accountCustomerId": 1,// 好友关系ID
        "accountCustomerStatus": 1// 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝 5-找不到微信用户
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
