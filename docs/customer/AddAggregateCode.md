## 添加聚合码
### 请求方法
    POST

### 请求URL
    /api/customer/AddAggregateCode
    
### 是否需要登录
    是

### 请求参数

    {
        "name":"aaaaaaaaa",// 活动名称
        "backUrl": "http://www.com/2.jpg",// 背景图URL
        "codeUrl": "http://www.com/2.jpg",// 聚合码URL
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
