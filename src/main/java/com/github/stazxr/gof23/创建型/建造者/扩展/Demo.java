package com.github.stazxr.gof23.创建型.建造者.扩展;

public class Demo {
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    // ....

    private Demo(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
        this.field5 = builder.field5;
    }

    public static final class Builder {
        private String field1;
        private String field2;
        private String field3;
        private String field4;
        private String field5;
        // ....

        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(String field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(String field3) {
            this.field3 = field3;
            return this;
        }

        public Builder field4(String field4) {
            this.field4 = field4;
            return this;
        }

        public Builder field5(String field5) {
            this.field5 = field5;
            return this;
        }

        // 构造外部对象
        public Demo build() {
            return new Demo(this);
        }
    }

    @Override
    public String toString() {
        return "Demo{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                '}';
    }
}
