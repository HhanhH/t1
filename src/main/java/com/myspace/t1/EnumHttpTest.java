package com.myspace.t1;

import com.mi.cfc.loan.common.util.json.JSON;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/**
 * @Author hanhong
 * @Date 2020/12/18 17:57
 */
public class EnumHttpTest {
    public List<Long> getList() {
        String url = "http://localhost:8001/demo/list/getList";
        URI uri = URI.create(url);
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String result = EntityUtils.toString(response.getEntity());
            List<Long> res = JSON.parseCollection(result, List.class, Long.class);
            return res;
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

}
