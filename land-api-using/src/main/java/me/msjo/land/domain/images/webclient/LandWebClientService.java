package me.msjo.land.domain.images.webclient;

import me.msjo.land.domain.images.dto.res.Root;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class LandWebClientService {

    WebClient webClient;
    String encodedServiceKey = URLEncoder.encode("UuJOPCi2qcZIX3hit9tiwMYo6rfg5kk8BA/rNeNK1INRhx/MwQXZKQ8rL/0rNr4fDLPpV8vaz+5gO6lboNZKhA==");

    public Mono<Root> apartmentTradeHistory(int areaCode, int size, int page, int year, int month) {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add("serviceKey", encodedServiceKey);
        params.add("pageNo", String.valueOf(page));
        params.add("numOfRows", String.valueOf(size));
        params.add("LAWD_CD", String.valueOf(areaCode));
        params.add("DEAL_YMD", LocalDate.of(year, month, 1).format(DateTimeFormatter.ofPattern("YYYYMM")));

        DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory();
        uriBuilderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);

        return webClient.mutate()
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .uriBuilderFactory(uriBuilderFactory)
                .build()
                .get()
                .uri(uriBuilder ->
                        uriBuilder
                                .scheme("http")
                                .host("openapi.molit.go.kr")
                                .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev")
                                .queryParams(params)
                                .build()


                )
                .retrieve()
                .bodyToMono(Root.class);
    }


    public Mono<Map> apartmentRentalHistory(int areaCode, int size, int page, int year, int month) {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add("serviceKey", encodedServiceKey);
//        params.add("pageNo", String.valueOf(page));
//        params.add("numOfRows", String.valueOf(size));
        params.add("LAWD_CD", String.valueOf(areaCode));
        params.add("DEAL_YMD", LocalDate.of(year, month, 1).format(DateTimeFormatter.ofPattern("YYYYMM")));

        DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory();
        uriBuilderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);

        return webClient.mutate()
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .uriBuilderFactory(uriBuilderFactory)
                .build()
                .get()
                .uri(uriBuilder -> {
                    URI uri = uriBuilder
                                    .scheme("http")
                                    .host("openapi.molit.go.kr:8081")
                                    .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptRent")
                                    .queryParams(params)
                                    .build();

                    System.out.println(uri);

                    return uri;
                        }


                )
                .retrieve()
                .bodyToMono(Map.class);
    }
}
