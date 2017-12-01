import com.freelxl.coin.hsa.utils.DateTimeUtil;
import org.junit.Test;

/**
 * Created by lixiuliang on 2017/12/1.
 */
public class DateTimeUtilTest {

    @Test
    public void dateTimeUtilTest(){

        String currentDateString = DateTimeUtil.getCurrentDateString();

        System.out.println(currentDateString);
    }
}
