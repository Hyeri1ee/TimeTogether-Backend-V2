package timetogeter.context.auth.presentation.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import timetogeter.context.auth.application.dto.response.testDTO;

@RestController
public class AuthController {
    @GetMapping(value = "/restDocsTest", produces = MediaType.APPLICATION_JSON_VALUE)
    public testDTO restDocsTestAPI() {
        return new testDTO("test!!");
    }

    @GetMapping(value = "/restDocsTest/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public testDTO restDocsTestParameterAPI(@PathVariable Long id) {
        return new testDTO(id + "test!!");
    }
}
