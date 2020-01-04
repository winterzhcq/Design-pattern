package cn.winter.patterns.chain;

/**
 * @author winter
 * @date 2019/8/10 18:25
 */
public class Request {
    private RequestType type;
    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }
    public RequestType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
