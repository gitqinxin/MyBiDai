## 获取客户信息列表
### 请求方法
    POST

### 请求URL
    /api/customer/GetAccountList
    
### 是否需要登录
    是

### 请求参数

    {
        "departmentId": 1,// 部门ID
        "status": 0 // 状态 0-正常 1-禁用
    }

### 应答参数(data)

    {
        "code": 0,
        "data": [
                    {
                        "id":1, // 账号ID
                        "nickname":"bbb"// 导购名称
                    },
                    ...
                    {
                        "id":1, // 账号ID
                        "nickname":"aaa" // 导购名称
                    }
         ],
        "message": "成功"
    }
