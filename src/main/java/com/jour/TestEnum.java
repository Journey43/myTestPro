package com.jour;

public enum TestEnum {
    APPLE("苹果", 0),
    BANANA("香蕉", 1);

    private final String name;
    private final Integer value;

    TestEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public static String ofName(Integer value) {
        if (value == null) {return "";}
        for(TestEnum v : values()){
            if(v.value == value){
                return v.name;
            }
        }
        return "";
    }
}
