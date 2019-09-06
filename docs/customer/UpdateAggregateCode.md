## 更新聚合码信息
### 请求方法
    POST

### 请求URL
    /api/customer/UpdateAggregateCode
    
### 是否需要登录
    是

### 请求参数

    {
        "id": 1,// 聚合码ID
        "name":"aaaaaaaaa",// 活动名称
        "describe":"aaaaaaaaa",// 活动描述
        "backUrl": "http://www.com/2.jpg",// 背景图URL
        "currentCode": 1,// 当前第几个二维码
        "status": 0,// 活动状态 0-正常 1-禁用
        "linkInforList": [
          {
            "groupName": "aaaaaaaaa",// 群名称
            "groupImg": "http://www.2.com/1.jpg",// 群二维码
            "visitNum": 55,// 浏览次数
            "groupNum": 121,// 群人数
            "groupStatus": 0// 群状态 0-正常 1-禁用
          },
          {
            "groupName": "aaaaaaaaa",// 群名称
            "groupImg": "http://www.2.com/1.jpg",// 群二维码
            "visitNum": 55,// 浏览次数
            "groupNum": 121,// 群人数
            "groupStatus": 0// 群状态 0-正常 1-禁用
          }
        ]
    }

### 应答参数(data)

    {
        "code": 0,
        "message": "成功"
    }
