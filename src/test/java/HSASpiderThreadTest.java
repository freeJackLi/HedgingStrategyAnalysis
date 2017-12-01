import com.freelxl.coin.hsa.spider.HSASpiderRunnable;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiuliang on 2017/12/1.
 */
public class HSASpiderThreadTest {

    @Test
    public void HSASpiderTest() throws IOException, InterruptedException {


        HSASpiderRunnable hsaSpiderThread = new HSASpiderRunnable("bitmex",
                "btc_usdt",
                "https://www.bitmex.com/api/v1/orderBook?symbol=xbt&depth=5",
                "/Users/lixiuliang/Downloads/hsa");

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(100);
        executorService.scheduleAtFixedRate(hsaSpiderThread,1000,2000, TimeUnit.MILLISECONDS);


//        hsaSpiderThread.start();


        Thread.sleep(Long.MAX_VALUE);


    }
}
