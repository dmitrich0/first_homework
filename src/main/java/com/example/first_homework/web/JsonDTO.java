package com.example.first_homework.web;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class OutputJsonDTO {
    Number price;
    Info info;
}

@Getter
class InputJsonDTO {
    Number price;
    Info info;
}
