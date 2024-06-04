package me.msjo.land.domain.land.webclient;

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

/**
 * packageName    : me.msjo.land.domain.land.webclient
 * fileName       : DocumentWebClientService
 * author         : ms.jo
 * date           : 2024/06/04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/06/04        ms.jo       최초 생성
 */
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class DocumentWebClientService {

    WebClient webClient;
    String encodedServiceKey = URLEncoder.encode("UuJOPCi2qcZIX3hit9tiwMYo6rfg5kk8BA/rNeNK1INRhx/MwQXZKQ8rL/0rNr4fDLPpV8vaz+5gO6lboNZKhA==");
    String HTTP = "http";
    String HOST = "apis.data.go.kr";

    /*public Mono<Map> apartmentRentalHistory(int regionCode, int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, int year, int month) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                        .scheme(HTTP)
                                        .host(HOST)
                                        .path("1613000/BldRgstService_v2/getBrHsprcInfo")
                                        .queryParams(makeParams(areaCode, size, page, year, month))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }*/


    private MultiValueMap<String, String> makeParams(int regionCode, int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, int year, int month) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add("serviceKey", encodedServiceKey);
        params.add("pageNo", String.valueOf(page));
        params.add("numOfRows", String.valueOf(size));
        params.add("LAWD_CD", String.valueOf(areaCode));
        params.add("DEAL_YMD", LocalDate.of(year, month, 1).format(DateTimeFormatter.ofPattern("YYYYMM")));
        return params;
    }

}
