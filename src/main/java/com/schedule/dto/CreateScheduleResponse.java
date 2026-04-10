package com.schedule.dto;

import lombok.Getter;

@Getter
public class CreateScheduleResponse {
    private final Long id;
    private final String title;
    private final String content;
    private final String userName;
    private final String password;

    public CreateScheduleResponse(Long id, String title, String content, String userName, String password) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userName = userName;
        this.password = password;
    }
}
