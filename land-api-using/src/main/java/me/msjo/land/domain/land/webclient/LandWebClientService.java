package me.msjo.land.domain.land.webclient;

import me.msjo.land.domain.land.dto.res.Root;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

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
    String HTTP = "http";
    String HOST = "openapi.molit.go.kr";
    String PORT_8081 = ":8081";

    public Mono<Root> apartmentTradeHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Root.class);
    }



    public Mono<Map> apartmentRentalHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST + PORT_8081)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptRent")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    public Mono<Map> officetelTradeHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcOffiTrade")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }



    public Mono<Map> officetelRentalHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcOffiRent")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> singleAndMultiFamilyHouseTradeHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST + PORT_8081)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcSHTrade")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }



    public Mono<Map> singleAndMultiFamilyHouseRentalHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST + PORT_8081)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcSHRent")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    public Mono<Map> relationalMultiFamilyHouseTradeHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST + PORT_8081)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHTrade")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }



    public Mono<Map> relationalMultiFamilyHouseRentalHistory(int areaCode, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST + PORT_8081)
                                        .path("OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcRHRent")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    private MultiValueMap<String, String> makeParams(int areaCode, int size, int page, int year, int month) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add("serviceKey", encodedServiceKey);
        params.add("pageNo", String.valueOf(page));
        params.add("numOfRows", String.valueOf(size));
        params.add("LAWD_CD", String.valueOf(areaCode));
        params.add("DEAL_YMD", LocalDate.of(year, month, 1).format(DateTimeFormatter.ofPattern("YYYYMM")));
        return params;
    }

}
