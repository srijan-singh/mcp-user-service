package mcp.user_service.controller;

import lombok.extern.slf4j.Slf4j;
import mcp.user_service.pojo.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user-info")
public class UserInfoController {

    private static final String DEFAULT_ID = "1";

    @GetMapping
    public UserData getUserInfo(@RequestParam String userName) {
        log.debug("Request: %s".formatted(userName));
        var response = new UserData(DEFAULT_ID, userName);
        log.debug("Response: %s".formatted(response));
        return response;
    }

}
