package com.nuhman.postman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Postman {
    private PostmanInfo info;
    private PostmanItem[] item;
    private PostmanVariable[] variable;
    private PostmanEvent[] event;
}
