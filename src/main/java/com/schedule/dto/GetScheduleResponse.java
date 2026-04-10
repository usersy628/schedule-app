package com.schedule.dto;

import lombok.Getter;

@Getter
public class GetScheduleResponse {
    private final Long id;
    private final String title;
    private final String content;
    private final String userName;

    public GetScheduleResponse(Long id, String title, String content, String userName) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userName = userName;
    }
}
