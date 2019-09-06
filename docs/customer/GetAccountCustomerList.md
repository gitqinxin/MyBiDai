## 获取微信好友或者删除列表
### 请求方法
    POST

### 请求URL
    /api/customer/GetAccountCustomerList?pageOffset=0&pageLimit=10
    
### 是否需要登录
    是

### 请求参数

    {
        "accountId": 1,// 帐户ID
        "accountStatus": 0,// 帐户状态
        "departmentId": 0,// 部门ID
        "customerGender": 1,// 客户性别 0-保密 1-男 2-女
        "customerName": "aa", // 客户姓名
        "customerTelephone": 13811111111111,
        "customerRemark": "11",// 客户微信备注
        "customerNickname": "aaa",// 客户微信昵称
        "customerTags": "000",// 客户标签
        "accountCustomerStatus": 0// 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝 5-找不到微信用户
    }

### 应答参数(data)

    {
        "code": 0,
        "data": [
            {
                "accountWeChatId":"111", // 员工微信ID
                "accountWeChatNo":"111", // 员工微信号
                "accountWeChatAvatar":"1.jpg", // 员工微信头像
                "accountCustomerId":"2", // 好友关系ID 
                "accountCustomerStatus":"2", // 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝 5-找不到微信用户
                "accountId":"1",// 帐户ID
                "accountName":"111", // 员工姓名
                "departmentName":"111", // 所属部门名称
                "companyId":"111", // 公司ID
                "createTime":1559699009000, // 创建时间
                "customerWeChatId":"ccc", // 客户微信ID
                "customerWeChatNo":"ccc", // 客户微信号
                "customerWeChatAvatar":"1.jpg", // 客户微信头像
                "customerGender":1, // 客户性别 0-保密 1-男 2-女
                "customerId":"3", // 客户账号ID
                "customerName":"ccc", // 客户姓名
                "customerWeChatNickname":"ccc", // 客户微信昵称
                "customerWeChatRemark":"ccc", // 客户微信备注
                "customerTags":"ccc", // 客户标签
                "customerTelephone":"333", // 客户手机
                "departmentId":"0", // 部门ID
                "employeeId":"0", // 员工ID
                "updateTime":1559699009000 // 更新时间
            },
            ...
            {
                "accountWeChatId":"111", // 员工微信ID
                "accountWeChatNo":"111", // 员工微信号
                "accountWeChatAvatar":"1.jpg", // 员工微信头像
                "accountCustomerId":"2", // 好友关系ID
                "accountCustomerStatus":"2", // 关系状态 0-是好友关系 1-删除 2-未加粉 3-加粉待通过 4-加粉被拒绝 5-找不到微信用户
                "accountId":"1",// 帐户ID
                "accountName":"111", // 员工姓名
                "departmentName":"111", // 所属部门名称
                "companyId":"111", // 公司ID
                "createTime":1559699009000, // 创建时间
                "customerWeChatId":"ccc", // 客户微信ID
                "customerWeChatNo":"ccc", // 客户微信号
                "customerWeChatAvatar":"1.jpg", // 客户微信头像
                "customerGender":1, // 客户性别 0-保密 1-男 2-女
                "customerId":"3", // 客户账号ID
                "customerName":"ccc", // 客户姓名
                "customerWeChatNickname":"ccc", // 客户微信昵称
                "customerWeChatRemark":"ccc", // 客户微信备注
                "customerTags":"ccc", // 客户标签
                "customerTelephone":"333", // 客户手机
                "departmentId":"0", // 部门ID
                "employeeId":"0", // 员工ID
                "updateTime":1559699009000 // 更新时间
            }
        ],
        "message": "成功",
        "pageControl": {
            "pageLimit": 10,
            "pageOffset": 0,
            "recordCount": 1
        }
    }
