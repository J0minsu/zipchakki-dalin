package me.msjo.land.domain.land.webclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional(readOnly = true)
@ActiveProfiles("test")
class DocumentWebClientServiceTest {

    @Autowired DocumentWebClientService documentWebClientService;
    @Autowired ObjectMapper objectMapper;

    int sigunguCd = 41131;
    int bjdongCd = 10200;
    int platGbCd = 0;
//    int bun = 4528;
    int bun = 2991;
//    int ji = 0000;
    int ji = 0002;
    int numOfRows = 100;
    int pageNo = 1;



    @Test
    void 건축물대장_표제부_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_표제부_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    void 건축물대장_기본개요_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_기본개요_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_총괄표제부_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_총괄표제부_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_층별개요_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_층별개요_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    void 건축물대장_부속지번_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_부속지번_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_전유공용면적_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_전유공용면적_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_오수정화시설_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_오수정화시설_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_주택가격_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_주택가격_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_전유부_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_전유부_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
    @Test
    void 건축물대장_지역지구구역_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_지역지구구역_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }
}