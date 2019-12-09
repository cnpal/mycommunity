package com.pal.community.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String redirect_uri;
    private String state;
    private String code;
}
