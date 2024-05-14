package com.capmus.clean.arc.api.author.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorEditRequest {
    private String id;
    private String firstName;
    private String lastName;
}
