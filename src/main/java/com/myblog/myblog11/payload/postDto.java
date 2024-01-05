package com.myblog.myblog11.payload;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class postDto {
    private long id;
    private String description;
    private String content;
    private String title;
}
