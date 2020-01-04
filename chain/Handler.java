package cn.winter.patterns.chain;

/**
 * @author winter
 * @date 2019/8/10 18:23
 */
public abstract class Handler {
    // 责任链中的下一个元素
    protected Handler successor;
    public Handler(Handler successor) {
        this.successor = successor;
    }
    protected abstract void handleRequest(Request request);
}
