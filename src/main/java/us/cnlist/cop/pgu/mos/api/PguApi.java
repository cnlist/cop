package us.cnlist.cop.pgu.mos.api;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PguApi {
    private RestTemplate restTemplate = new RestTemplate();
    private static HttpClient httpclient = HttpClients.createMinimal();
    private static String SIGN_UP = "/v1.0/auth/virtualLogin";
    String guid = "4421a3fb0567714b27dec84d3c3862dc";
    String appVersion = "3.5.0.195 (102)";
    String mobile = "Android 6.0 (SDK 23) unknown generic_x86 (Android SDK built for x86) ";
    String userAgent = "Android";

    public String auth(String phoneNumber, String password) {
        String jsonString = null;

        jsonString = "{\"info\":{\"guid\":\"4421a3fb0567714b27dec84d3c3862dc\"," +
                "\"app_version\":\"3.5.0.195 (102)\"," +
                "\"user_agent\":\"Android\",\"mobile\":\"Android 6.0 (SDK 23) unknown generic_x86 (Android SDK built for x86) \"," +
                "\"session_id\":null},\"device_info\":{\"guid\":\"4421a3fb0567714b27dec84d3c3862dc\"," +
                "\"mobile\":\"Android 6.0 (SDK 23) unknown generic_x86 (Android SDK built for x86) \"," +
                "\"user_agent\":\"Android\",\"app_version\":\"3.5.0.195 (102)\"},\"auth\":{\"login\":\"LOGIX\"" +
                ",\"password\":\"PASSWORX\",\"guid\":\"4421a3fb0567714b27dec84d3c3862dc\"}}";
        jsonString = jsonString.replace("LOGIX", phoneNumber).replace("PASSWORX", password);
        String url = "https://emp.mos.ru/v1.0/auth/virtualLogin?token=887033d0649e62a84f80433e823526a1";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
        ResponseEntity<AuthResponse> response = restTemplate.postForEntity(url, entity, AuthResponse.class);
        return response.getBody().getSession_id();

    }

    public String getFlatId(String sessionID) {
        String url = "https://emp.mos.ru/v1.0/flat/get?token=887033d0649e62a84f80433e823526a1&session_id=AUTHX".replace("AUTHX", sessionID);
        ResponseEntity<GetFlatResponse> response = restTemplate.getForEntity(url, GetFlatResponse.class);
        return response.getBody().getResult()[0].getFlat_id();
    }

    public GetCountersResponse.Counters[] getCounters(String sessionId, String flatId) {
        String jsonString = null;
        jsonString = "{ \"flat_id\": \"FLATX\", \"is_widget\": false, \"info\": { \"guid\": \"4421a3fb0567714b27dec84d3c3862dc\", \"app_version\": \"3.5.0.195 (102)\", \"user_agent\": \"Android\", \"mobile\": \"Android 6.0 (SDK 23) unknown generic_x86 (Android SDK built for x86) \", \"session_id\": \"dcf1ace12e516262edbed6b4da9f067e\" }, \"auth\": { \"session_id\": \"SESSIONX\" } }".replace("SESSIONX", sessionId).replace("FLATX", flatId);
        String url = "https://emp.mos.ru/v1.0/watercounters/get?token=887033d0649e62a84f80433e823526a1";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
        ResponseEntity<GetCountersResponse> response = restTemplate.postForEntity(url, entity, GetCountersResponse.class);
        return response.getBody().getResult().getCounters();
    }

    public void postCountersValue(String flatId, String coldId, Integer coldCount, String hotId, Integer hotCount, String auth) {
        String jsonString = "{ \"flat_id\": \"FLATX\"," +
                " \"counters_data\": [{ \"counter_id\": \"COLDID\"," +
                " \"period\": \"2018-11-01\", \"indication\": \"COLDCOUNT\" }," +
                " { \"counter_id\": \"HOTID\", \"period\": \"2018-11-01\", " +
                "\"indication\": \"hotCount\" }], " +
                "\"info\": { \"guid\": \"4421a3fb0567714b27dec84d3c3862dc\", \"app_version\": \"3.5.0.195 (102)\"," +
                " \"user_agent\": \"Android\", \"mobile\": \"Android 6.0 (SDK 23) unknown generic_x86 (Android SDK built for x86) \", " +
                "\"session_id\": \"dcf1ace12e516262edbed6b4da9f067e\" }," +
                " \"auth\": { \"session_id\": \"AUTHX\" } }";
        jsonString = jsonString.replace("FLATX", flatId).replace("COLDID", coldId)
                .replace("COLDCOUNT", coldCount.toString()).replace("HOTID", hotId)
                .replace("hotCount", hotCount.toString()).replace("AUTHX", auth);
        String url = "https://emp.mos.ru/v1.0/watercounters/addValues?token=887033d0649e62a84f80433e823526a1";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
        try {
            ResponseEntity<PostCounterResponse> response = restTemplate.postForEntity(url, entity, PostCounterResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
