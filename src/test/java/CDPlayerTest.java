import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nocoder.soundsystem.CDPlayerConfig;
import org.nocoder.soundsystem.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by YANGJINLONG on 2016/11/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldBeNull(){
       assertNotNull(cd);
    }

}
