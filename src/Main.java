/*
 * Copyright(c) 2022 长沙市希尚网络科技有限公司
 * 注意：本内容仅限于长沙市希尚网络科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */


import java.net.http.HttpClient;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author ${USER}
 * @version 1.0 ${DATE}
 */
public class Main {

    public static void main(String[] args) {
        String json = """
            {
                "name": "leo",
                "sex": "man"
            }
            """;

        HttpClient httpClient = HttpClient.newHttpClient();
        httpClient.connectTimeout();
    }
}