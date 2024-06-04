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

import java.net.URI;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;

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
    String HTTPS = "https";
    String HOST = "apis.data.go.kr";
    String BASE_PATH = "1613000/BldRgstService_v2/";

    public Mono<Map> 건축물대장_표제부_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrTitleInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> 건축물대장_기본개요_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrBasisOulnInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> 건축물대장_총괄표제부_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrRecapTitleInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> 건축물대장_층별개요_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrFlrOulnInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> 건축물대장_부속지번_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrAtchJibunInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    public Mono<Map> 건축물대장_전유공용면적_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrExposPubuseAreaInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> 건축물대장_오수정화시설_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrWclfInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }

    public Mono<Map> 건축물대장_주택가격_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrHsprcInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    public Mono<Map> 건축물대장_전유부_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrExposInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    public Mono<Map> 건축물대장_지역지구구역_조회(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji, int size, int page, LocalDate start, LocalDate end) {

        return webClient.mutate()
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                                    .scheme(HTTPS)
                                    .host(HOST)
                                    .path(BASE_PATH + "getBrJijiguInfo")
                                    .queryParams(makeParams(cityCountyDistrictCode, areaCode, platGbCode, bun, ji, size, page, start, end))
                                    .build()
                )
                .retrieve()
                .bodyToMono(Map.class);
    }


    private MultiValueMap<String, String> makeParams(int cityCountyDistrictCode, int areaCode, int platGbCode, int bun, int ji,
                                                     int size, int page, LocalDate start, LocalDate end) {

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add("serviceKey", encodedServiceKey);
        params.add("sigunguCd", String.valueOf(cityCountyDistrictCode));
        params.add("bjdongCd", String.valueOf(areaCode));
        params.add("platGbCd", String.valueOf(platGbCode));
        params.add("bun", String.format("%4s", bun).replace(" ", "0"));
        params.add("ji", String.format("%4s", ji).replace(" ", "0"));
        if(!Objects.isNull(start)) params.add("startDate", start.format(DateTimeFormatter.ofPattern("YYYYMMdd")));
        if(!Objects.isNull(start)) params.add("endDate", end.format(DateTimeFormatter.ofPattern("YYYYMMdd")));
        params.add("numOfRows", String.valueOf(size));
        params.add("pageNo", String.valueOf(page));

        return params;
    }

}
