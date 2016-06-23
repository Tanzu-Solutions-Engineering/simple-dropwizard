package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Saying {

    private long count;

    @Length(max = 3)
    private String content;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long count, String content) {
        this.count = count;
        this.content = content;
    }

    @JsonProperty
    public long getCount() { return count; }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
