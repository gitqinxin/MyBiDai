## App 接口规范
### 请求方法
    POST

### 请求URL
    不需要登录:
    /api/xxx/xxx
    
    需要登录:
    /api/xxx/xxx?token=xxxxxxxxxxxxx
    
### 请求参数

    {
      "aaaaa": "xxxxxxxxxxx",
      "bbbbb": "yyyyyyyyyyy"
    }

### 应答参数

    {
        "code": 0,
        "message": "成功",
        "data": {
            "ccccc": "xxxxxxxxxxx",
            "ddddd": "yyyyyyyyyyy"            
        }        
    }
    
### 应答参数说明

#### code

    OK(0),                                  // [默认]成功
    
    UNAUTHORIZED(40100),                    // [默认]没有登录
    
    FORBIDDEN(40300),                       // [默认]登录失败
    FORBIDDEN_USER_DISABLE(40301),          // [扩展]登录失败-用户禁止登录
    FORBIDDEN_TOKEN_INVALID(40302),         // [扩展]登录失败-登录凭证无效
    FORBIDDEN_TOKEN_EXPIRED(40303),         // [扩展]登录失败-登录凭证过期
    
    // 用户名密码登录
    FORBIDDEN_USERNAME_ERROR(40311),        // [扩展]登录失败-用户名不存在
    FORBIDDEN_PASSWORD_ERROR(40312),        // [扩展]登录失败-用户密码错误
    
    // 短信验证码登录
    FORBIDDEN_PHONE_ERROR(40321),           // [扩展]登录失败-手机号不存在
    
    
    BAD_REQUEST(40000),                     // [默认]请求参数错误
    BAD_REQUEST_40001(40001),               // [扩展]业务扩展定义
    BAD_REQUEST_40002(40002),               // [扩展]业务扩展定义
    BAD_REQUEST_40003(40003),               // [扩展]业务扩展定义
    BAD_REQUEST_40004(40004),               // [扩展]业务扩展定义
    BAD_REQUEST_40005(40005),               // [扩展]业务扩展定义
    BAD_REQUEST_40006(40006),               // [扩展]业务扩展定义
    BAD_REQUEST_40007(40007),               // [扩展]业务扩展定义
    BAD_REQUEST_40008(40008),               // [扩展]业务扩展定义
    BAD_REQUEST_40009(40009),               // [扩展]业务扩展定义
    
    // 涉及短验接口
    BAD_REQUEST_SMS_CODE_NOT_EXIST(40061),  // [扩展]短信验证码不存在
    BAD_REQUEST_SMS_CODE_ERROR(40062),      // [扩展]短信验证码不正确
    BAD_REQUEST_SMS_CODE_USED(40063),       // [扩展]短信验证码已使用
    BAD_REQUEST_SMS_CODE_EXPIRE(40064),     // [扩展]短信验证码已过期
    
    
    NOT_FOUND(40400),                       // [默认]请求数据不存在
    
    METHOD_NOT_ALLOWED(40500),              // [默认]请求的接口不在权限之内
    
    SERVER_ERROR(50000);                    // [默认]服务器错误


#### message

    code对应描述

#### data

    业务应答数据(code为0时有效)
    