package com.example.demo.pojo;
/*
 //callchain 调用链实体类
 */
public class callchain {
    private String name;
    private int ID;
    private String inf;
    private String nothing;
    public callchain(){

    }
    public callchain(String name,int ID,String inf,String nothing)
    {
        this.name=name;
        this.ID=ID;
        this.inf=inf;
        this.nothing=nothing;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getID() {
        return ID;
    }

    public String getInf() {
        return inf;
    }

    public String getNothing() {
        return nothing;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }

    public void setNothing(String nothing) {
        this.nothing = nothing;
    }
    /*//TraceID 调用链唯一标识
    private String TraceID;

    //CalledNodeID 被调用服务的实例标识
    private String CalledNodeID;

    //CalledclusterID 被调用服务（集群）标识
    private String CalledClusterID;

    //CalledIP 被调用服务所在的IP地址 值可以为NULL
    private String CalledIP;

    //CallingNodeID 调用者的服务实例标识
    private String CallingNodeID;

    //CallingIP 调用方服务所在的IP地址 值可以为NULL
    private String CallingIP;

    //Flag 请求响应发送接收标识
    private String Flag;

    //AppNameMethod 对调用链首节点填写AppName，对调用链非首节点填写被调用的服务名方法名，或者请求的URL。
    private String AppNameMethod;

    //SubSysName 子系统名 值可以为NULL
    private String SubSysName;

    //Protocol 协议类型
    private String Protocol;

    //BeginTime  对服务调用是请求收发的时间，对异步消息通信是消息收发的时间，采用UTC时间记录，格式为YYMMDDHHMMSS.sss，粒度到毫秒。
    private String BeginTime;

    //EndTime  对服务调用是响应收发的时间，对异步消息通信为空，采用UTC时间记录，格式为YYMMDDHHMMSS.sss，粒度到毫秒。  值可以为NULL
    private String EndTime;

    //ReqMsgSize  对服务调用是请求消息大小，对异步消息通信是收发的消息大小，单位为字节。
    private int ReqMsgsize;

    //RspMsgSize  对服务调用是响应消息大小，对消息通信为空，单位为字节。 值可以为NULL
    private int RspMsgSize;

    //ResultCode  对服务调用是调用的返回码，对消息通信为空。0为正常返回码，非0为异常返回码。 值可以为NULL
    private int ResultCode;

    //ResultInfo 结果描述信息，只在异常时输出，最大长度512字节，正常时为空。 值可以为NULL
    private String ResultInfo;

    //SeqNo 埋点序列号，标识调用链中埋点先后顺序，最大长度128字节。
    private String SeqNo;

    //ExtendInfo 预留的扩展字段 值可以为NULL
    private String ExtendInfo;

    public callchain(String TraceID,String CalledNodeID,String CalledClusterID,String CalledIP,String CallingNodeID,String CallingIP
    ,String Flag,String AppNameMethod,String SubSysNmae,String Protocol,String BeginTime, String EndTime,int ReqMsgSize,int RspMsgSize
    ,int ResultCode,String ResultInfo,String SeqNo,String ExtendInfo)
    {
        this.TraceID=TraceID;
        this.CalledNodeID=CalledNodeID;
        this.CalledClusterID=CalledClusterID;
        this.CalledIP=CalledIP;
        this.CallingNodeID=CallingNodeID;
        this.CallingIP=CallingIP;
        this.Flag=Flag;
        this.AppNameMethod=AppNameMethod;
        this.SubSysName=SubSysNmae;
        this.Protocol=Protocol;
        this.BeginTime=BeginTime;
        this.EndTime=EndTime;
        this.ReqMsgsize=ReqMsgSize;
        this.RspMsgSize=RspMsgSize;
        this.ResultCode=ResultCode;
        this.SeqNo=SeqNo;
        this.ExtendInfo=ExtendInfo;
    }*/
}