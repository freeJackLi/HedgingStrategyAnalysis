import com.freelxl.coin.hsa.bean.DepthData;
import com.freelxl.coin.hsa.factory.DepthDataParserFactory;
import com.freelxl.coin.hsa.parser.DepthDataParser;
import org.junit.Test;

public class ParserTest {


    @Test
    public void BITMEX$BTC_USDT$ParserTest() {
        String message = "2017-12-07 13:02:48.270 | 2017-12-07 13:02:52.571[{\"symbol\":\"XBTUSD\",\"level\":0,\"bidSize\":60078,\"bidPrice\":14383.5,\"askPrice\":14384,\"askSize\":55984,\"timestamp\":\"2017-12-07T05:02:49.117Z\"},{\"symbol\":\"XBTUSD\",\"level\":1,\"bidSize\":4000,\"bidPrice\":14382.5,\"askPrice\":14384.5,\"askSize\":3000,\"timestamp\":\"2017-12-07T05:02:49.117Z\"},{\"symbol\":\"XBTUSD\",\"level\":2,\"bidSize\":7500,\"bidPrice\":14382,\"askPrice\":14387.5,\"askSize\":449,\"timestamp\":\"2017-12-07T05:02:49.117Z\"},{\"symbol\":\"XBTUSD\",\"level\":3,\"bidSize\":25270,\"bidPrice\":14380,\"askPrice\":14388,\"askSize\":28447,\"timestamp\":\"2017-12-07T05:02:49.117Z\"},{\"symbol\":\"XBTUSD\",\"level\":4,\"bidSize\":2200,\"bidPrice\":14379.5,\"askPrice\":14390,\"askSize\":131319,\"timestamp\":\"2017-12-07T05:02:49.117Z\"}]";
        DepthDataParser parser = DepthDataParserFactory.getParser("bitmex", "btc_usdt");

        DepthData depthData = parser.parse(message);
        System.out.println(depthData);
    }
}
