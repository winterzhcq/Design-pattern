package cn.winter.patterns.builder;

/**
 * @author winter
 * @date 2020/1/19 21:50
 */
public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
