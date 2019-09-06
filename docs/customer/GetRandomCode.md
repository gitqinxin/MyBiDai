## 获取随机群二维码
### 请求方法
    POST

### 请求URL
    /api/customer/GetRandomCode
    
### 是否需要登录
    是

### 请求参数

    {
        "id": 1 // 聚合码ID
    }

### 应答参数(data)

    {
        "code": 0,
        "data": {
                "id":1, // 账号ID
                "companyId":"2", // 公司ID
                "name":"1",// 活动名称
                "describe":"1",// 活动描述
                "groupImg":"http://www.www.com/1.jpg", // 群二维码
                "backUrl":"http://www.www.com/1.jpg", // 背景图URL
                "codeUrl":"http://www.www.com/1.jpg", // 聚合码URL
                "currentCode":11, // 当前第几个二维码
                "sweepCount":"111", // 扫码次数
                "status":"111", // 活动状态 0-正常 1-禁用
                "employeeId":"111", // 创建人ID
                "createTime":"1559699009000, // 创建时间
                "updateTime":"1559699009000 // 更新时间
         },
        "message": "成功"
    }
