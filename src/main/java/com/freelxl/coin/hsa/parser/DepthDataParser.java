package com.freelxl.coin.hsa.parser;

import com.freelxl.coin.hsa.bean.DepthData;

public interface DepthDataParser {

    DepthData parse(String message);
}
