package top.zmy.boot.config.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.zmy.boot.config.model.Team;

/**
 * @Author: zmy
 * @Date: 2025/9/11
 * @Version: 1.0
 */
@RestController
@Slf4j
public class TeamController {
    @PostMapping("/team")
    public ResponseEntity<Team> addTeam(@Valid @RequestBody Team team){
        return ResponseEntity.ok(team);
    }

}