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
public class EnumHttpTest1 {

	public EnumHttpTest1() {
	}

	public List<String> list() {
		List<String> list = new ArrayList<>();
		list.add("1L");
		list.add("2L");
		return list;
	}

}
