package macro.mall;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class GitTest {
    @Test
    public void Diff(){
        log.info("commit 之后");
    }
    @Test
    public void checkoutMaster(){
        log.info("test Amend");
        log.info("checkout master idea之后");
    }
    @Test
    public void mergeAndRebase(){

    }
}
