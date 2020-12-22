package ltd.newbee.mall.common;

import java.io.Serializable;

public class AppResultData implements Serializable {
    /**
     * 返回说明 默认为success
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object result;

    /**
     * 返回状态 默认为0
     */
    private Integer ret;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    @Override
    public String toString() {
        return "ResultData [msg=" + msg + ", result=" + result + "]";
    }
}
