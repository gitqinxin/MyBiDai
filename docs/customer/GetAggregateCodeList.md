## 获取聚合码活动列表
### 请求方法
    POST

### 请求URL
    /api/customer/GetAggregateCodeList?pageOffset=0&pageLimit=10
    
### 是否需要登录
    是

### 请求参数

    {
    
    }

### 应答参数(data)

    {
        "code": 0,
        "data": [
                    {
                        "id":1, // 账号ID
                        "name":"1",// 活动名称
                        "describe":"1",// 活动描述
                        "sweepCount":"111", // 扫码次数
                        "status":"111", // 活动状态 0-正常 1-禁用
                        "createTime":"1559699009000, // 创建时间
                        "updateTime":"1559699009000 // 更新时间
                    },
                    ...
                    {
                        "id":1, // 账号ID
                        "name":"1",// 活动名称
                        "describe":"1",// 活动描述
                        "sweepCount":"111", // 扫码次数
                        "status":"111", // 活动状态 0-正常 1-禁用
                        "createTime":"1559699009000, // 创建时间
                        "updateTime":"1559699009000 // 更新时间
                    }
         ],
        "message": "成功"
    }
