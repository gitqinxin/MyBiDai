## 批量导出全部客户信息
### 请求方法
    POST

### 请求URL
    /api/customer/ExportCustomers
    
### 是否需要登录
    是

### 请求参数

    {
        "gender": 1,// 客户性别 0-保密 1-男 2-女
        "name": "aa", // 名字
        "telephone": 13811111111111,//手机
        "weChatNo": "11"// 微信号
        "status":  0// 0-已加粉列表 2-未加粉列表 不填值获取所有用户池列表
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
