package top.zmy.boot.config.model;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class TeamTest {
    @Resource
    private Team team;

    @Test
    void testTeam() {
        log.info("team:{}", team);
        //测试leader是否为zmy
        assertEquals("zmy", team.getLeader());
        //测试手机号格式是否正确
        assertEquals(team.getPhone().matches("^[0-9]{11}$"), true);
        //测试团队年龄是否在1-5之间
        assertEquals(team.getAge() >=1 && team.getAge() <= 5, true);
        //判断创建时间是否在当前时间之前
        assertEquals(team.getCreateDate().isBefore(LocalDate.now()), true);




    }

}