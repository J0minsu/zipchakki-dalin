package me.msjo.land.domain.land.webclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional(readOnly = true)
@ActiveProfiles("test")
class DocumentWebClientServiceTest {

    @Autowired
    DocumentWebClientService documentWebClientService;
    @Autowired
    ObjectMapper objectMapper;

    //mgmBldrgstPk -> 건물 자체의 키값

    int sigunguCd = 41131; //성남 수정구
    int bjdongCd = 10200; //태평동
    //    int sigunguCd = 28245; //인천 계양구
//    int bjdongCd = 10100; //효성동
    int platGbCd = 0;

        int bun = 4528; //다가구
//    int bun = 7346; //아파트
//    int bun = 5113; //오피스텔
//    int bun = 513; //다세대
//    int bun = 154; //인천 연립


    int ji = 0000;
    //    int ji = 0007; //오피스텔
//    int ji = 16; //인천 연립
    int numOfRows = 100;
    int pageNo = 1;


    @Test
    @Order(1)
    void 건축물대장_기본개요_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_기본개요_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
//        result.entrySet().stream().collect(Collectors.toMap(i -> 기본개요_용어맵().get(i), Function.identity()));

        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(2)
    void 건축물대장_총괄표제부_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_총괄표제부_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(3)
    void 건축물대장_표제부_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_표제부_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then
    }

    @Test
    @Order(4)
    void 건축물대장_층별개요_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_층별개요_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(5)
    void 건축물대장_부속지번_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_부속지번_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(6)
    void 건축물대장_전유공용면적_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_전유공용면적_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(7)
    void 건축물대장_오수정화시설_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_오수정화시설_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(8)
    void 건축물대장_주택가격_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_주택가격_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(9)
    void 건축물대장_전유부_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_전유부_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }

    @Test
    @Order(10)
    void 건축물대장_지역지구구역_조회() throws Exception {

        //given
        Map result = documentWebClientService.건축물대장_지역지구구역_조회(sigunguCd, bjdongCd, platGbCd, bun, ji, numOfRows, pageNo, null, null).block();
        //when
        System.out.println(objectMapper.writeValueAsString(result));
        //then

    }


    Map<String, String> 기본개요_용어맵() {

        Map<String, String> map = new HashMap<>();

        map.put("newPlatPlc", "도로명 대지 위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("ji", "지");
        map.put("bylotCnt", "외필지수");
        map.put("naRoadCd", "새주소 도로 코드");
        map.put("naBjdongCd", "새주소 법정동 코드");
        map.put("naUgrndCd", "새주소 지상 지하 코드");
        map.put("naMainBun", "새주소 본번");
        map.put("naSubBun", "새주소 부번");
        map.put("jiyukCd", "지역 코드");
        map.put("jiguCd", "지구 코드");
        map.put("guyukCd", "구역 코드");
        map.put("jiyukCdNm", "지역 코드명");
        map.put("jiguCdNm", "지구 코드명");
        map.put("guyukCdNm", "구역 코드명");
        map.put("crtnDay", "생성일자");
        map.put("rnum", "순번");
        map.put("platPlc", "대지 위치");
        map.put("sigunguCd", "시군구 코드");
        map.put("bjdongCd", "법정동 코드");
        map.put("platGbCd", "대지 구분 코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리 건축물 대장 PK");
        map.put("mgmUpBldrgstPk", "관리 상위 건축물 대장 PK");
        map.put("regstrGbCd", "대장 구분 코드");
        map.put("regstrGbCdNm", "대장 구분 코드명");
        map.put("regstrKindCd", "대장 종류 코드");
        map.put("regstrKindCdNm", "대장 종류 코드명");

        return map;
    }

    Map<String, String> 총괄표제부_용어맵() {
        Map map = Maps.newHashMap();

        map.put("itgBldGrade","지능형건축물등급");
        map.put("itgBldCert","지능형건축물인증점수");
        map.put("crtnDay","생성일자");
        map.put("naBjdongCd","새주소법정동코드");
        map.put("naUgrndCd","새주소지상지하코드");
        map.put("naMainBun","새주소본번");
        map.put("naSubBun","새주소부번");
        map.put("platArea","대지면적(m²)");
        map.put("archArea","건축면적(m²)");
        map.put("bcRat","건폐율(%)");
        map.put("totArea","연면적(m²)");
        map.put("vlRatEstmTotArea","용적률산정연면적(m²)");
        map.put("vlRat","용적률(%)");
        map.put("mainPurpsCd","주용도코드");
        map.put("mainPurpsCdNm","주용도코드명");
        map.put("etcPurps","기타용도");
        map.put("hhldCnt","세대수(세대)");
        map.put("fmlyCnt","가구수(가구)");
        map.put("mainBldCnt","주건축물수");
        map.put("atchBldCnt","부속건축물수");
        map.put("atchBldArea","부속건축물면적(m²)");
        map.put("totPkngCnt","총주차수");
        map.put("indrMechUtcnt","옥내기계식대수(대)");
        map.put("indrMechArea","옥내기계식면적(m²)");
        map.put("oudrMechUtcnt","옥외기계식대수(대)");
        map.put("oudrMechArea","옥외기계식면적(m²)");
        map.put("indrAutoUtcnt","옥내자주식대수(대)");
        map.put("indrAutoArea","옥내자주식면적(m²)");
        map.put("oudrAutoUtcnt","옥외자주식대수(대)");
        map.put("oudrAutoArea","옥외자주식면적(m²)");
        map.put("pmsDay","허가일");
        map.put("stcnsDay","착공일");
        map.put("useAprDay","사용승인일");
        map.put("pmsnoYear","허가번호년");
        map.put("pmsnoKikCd","허가번호기관코드");
        map.put("pmsnoKikCdNm","허가번호기관코드명");
        map.put("pmsnoGbCd","허가번호구분코드");
        map.put("pmsnoGbCdNm","허가번호구분코드명");
        map.put("hoCnt","호수(호)");
        map.put("engrGrade","에너지효율등급");
        map.put("engrRat","에너지절감율");
        map.put("engrEpi","EPI점수");
        map.put("gnBldGrade","친환경건축물등급");
        map.put("gnBldCert","친환경건축물인증점수");
        map.put("rnum","순번");
        map.put("platPlc","대지위치");
        map.put("sigunguCd","시군구코드");
        map.put("bjdongCd","법정동코드");
        map.put("platGbCd","대지구분코드");
        map.put("bun","번");
        map.put("ji","지");
        map.put("mgmBldrgstPk","관리건축물대장PK");
        map.put("regstrGbCd","대장구분코드");
        map.put("regstrGbCdNm","대장구분코드명");
        map.put("regstrKindCd","대장종류코드");
        map.put("regstrKindCdNm","대장종류코드명");
        map.put("newOldRegstrGbCd","신구대장구분코드");
        map.put("newOldRegstrGbCdNm","신구대장구분코드명");
        map.put("newPlatPlc","도로명대지위치");
        map.put("bldNm","건물명");
        map.put("splotNm","특수지명");
        map.put("block","블록");
        map.put("lot","로트");
        map.put("bylotCnt","외필지수");
        map.put("naRoadCd","새주소도로코드");

        return map;
    }

    Map<String, String> 표제부_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("mainPurpsCdNm", "주용도코드명");
        map.put("etcPurps", "기타용도");
        map.put("roofCd", "지붕코드");
        map.put("roofCdNm", "지붕코드명");
        map.put("etcRoof", "기타지붕");
        map.put("hhldCnt", "세대수(세대)");
        map.put("fmlyCnt", "가구수(가구)");
        map.put("heit", "높이(m)");
        map.put("grndFlrCnt", "지상층수");
        map.put("ugrndFlrCnt", "지하층수");
        map.put("rideUseElvtCnt", "승용승강기수");
        map.put("emgenUseElvtCnt", "비상용승강기수");
        map.put("atchBldCnt", "부속건축물수");
        map.put("atchBldArea", "부속건축물면적(m²)");
        map.put("totDongTotArea", "총동연면적(m²)");
        map.put("indrMechUtcnt", "옥내기계식대수(대)");
        map.put("indrMechArea", "옥내기계식면적(m²)");
        map.put("oudrMechUtcnt", "옥외기계식대수(대)");
        map.put("oudrMechArea", "옥외기계식면적(m²)");
        map.put("indrAutoUtcnt", "옥내자주식대수(대)");
        map.put("indrAutoArea", "옥내자주식면적(m²)");
        map.put("oudrAutoUtcnt", "옥외자주식대수(대)");
        map.put("oudrAutoArea", "옥외자주식면적(m²)");
        map.put("pmsDay", "허가일");
        map.put("stcnsDay", "착공일");
        map.put("useAprDay", "사용승인일");
        map.put("pmsnoYear", "허가번호년");
        map.put("pmsnoKikCd", "허가번호기관코드");
        map.put("pmsnoKikCdNm", "허가번호기관코드명");
        map.put("pmsnoGbCd", "허가번호구분코드");
        map.put("pmsnoGbCdNm", "허가번호구분코드명");
        map.put("hoCnt", "호수(호)");
        map.put("engrGrade", "에너지효율등급");
        map.put("engrRat", "에너지절감율");
        map.put("engrEpi", "EPI점수");
        map.put("gnBldGrade", "친환경건축물등급");
        map.put("gnBldCert", "친환경건축물인증점수");
        map.put("itgBldGrade", "지능형건축물등급");
        map.put("itgBldCert", "지능형건축물인증점수");
        map.put("crtnDay", "생성일자");
        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("regstrGbCd", "대장구분코드");
        map.put("regstrGbCdNm", "대장구분코드명");
        map.put("regstrKindCd", "대장종류코드");
        map.put("regstrKindCdNm", "대장종류코드명");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("bylotCnt", "외필지수");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("dongNm", "동명칭");
        map.put("mainAtchGbCd", "주부속구분코드");
        map.put("mainAtchGbCdNm", "주부속구분코드명");
        map.put("platArea", "대지면적(m²)");
        map.put("archArea", "건축면적(m²)");
        map.put("bcRat", "건폐율(%)");
        map.put("totArea", "연면적(m²)");
        map.put("vlRatEstmTotArea", "용적률산정연면적(m²)");
        map.put("vlRat", "용적률(%)");
        map.put("strctCd", "구조코드");
        map.put("strctCdNm", "구조코드명");
        map.put("etcStrct", "기타구조");
        map.put("mainPurpsCd", "주용도코드");
        map.put("rserthqkDsgnApplyYn", "내진설계적용여부");
        map.put("rserthqkAblty", "내진능력");

        return map;
    }


    Map<String, String> 층별개요_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("dongNm", "동명칭");
        map.put("flrGbCd", "층구분코드");
        map.put("flrGbCdNm", "층구분코드명");
        map.put("flrNo", "층번호");
        map.put("flrNoNm", "층번호명");
        map.put("strctCd", "구조코드");
        map.put("strctCdNm", "구조코드명");
        map.put("etcStrct", "기타구조");
        map.put("mainPurpsCd", "주용도코드");
        map.put("mainPurpsCdNm", "주용도코드명");
        map.put("etcPurps", "기타용도");
        map.put("mainAtchGbCd", "주부속구분코드");
        map.put("mainAtchGbCdNm", "주부속구분코드명");
        map.put("area", "면적(m²)");
        map.put("areaExctYn", "면적제외여부");
        map.put("crtnDay", "생성일자");

        return map;
    }

    Map<String, String> 부속지번_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("regstrGbCd", "대장구분코드");
        map.put("regstrGbCdNm", "대장구분코드명");
        map.put("regstrKindCd", "대장종류코드");
        map.put("regstrKindCdNm", "대장종류코드명");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("atchRegstrGbCd", "부속대장구분코드");
        map.put("atchRegstrGbCdNm", "부속대장구분코드명");
        map.put("atchSigunguCd", "부속시군구코드");
        map.put("atchBjdongCd", "부속법정동코드");
        map.put("atchPlatGbCd", "부속대지구분코드");
        map.put("atchBun", "부속번");
        map.put("atchJi", "부속지");
        map.put("atchSplotNm", "부속특수지명");
        map.put("atchBlock", "부속블록");
        map.put("atchLot", "부속로트");
        map.put("atchEtcJibunNm", "부속기타지번명");
        map.put("crtnDay", "생성일자");
        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");

        return map;
    }

    Map<String, String> 전유공용면적_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("regstrGbCd", "대장구분코드");
        map.put("regstrGbCdNm", "대장구분코드명");
        map.put("regstrKindCd", "대장종류코드");
        map.put("regstrKindCdNm", "대장종류코드명");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("dongNm", "동명칭");
        map.put("hoNm", "호명칭");
        map.put("flrGbCd", "층구분코드");
        map.put("flrGbCdNm", "층구분코드명");
        map.put("flrNo", "층번호");
        map.put("flrNoNm", "층번호명");
        map.put("exposPubuseGbCd", "전유공용구분코드");
        map.put("exposPubuseGbCdNm", "전유공용구분코드명");
        map.put("mainAtchGbCd", "주부속구분코드");
        map.put("mainAtchGbCdNm", "주부속구분코드명");
        map.put("strctCd", "구조코드");
        map.put("strctCdNm", "구조코드명");
        map.put("etcStrct", "기타구조");
        map.put("mainPurpsCd", "주용도코드");
        map.put("mainPurpsCdNm", "주용도코드명");
        map.put("etcPurps", "기타용도");
        map.put("area", "면적(m²)");
        map.put("crtnDay", "생성일자");
        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");

        return map;
    }

    Map<String, String> 오수정화시설_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("regstrGbCd", "대장구분코드");
        map.put("regstrGbCdNm", "대장구분코드명");
        map.put("regstrKindCd", "대장종류코드");
        map.put("regstrKindCdNm", "대장종류코드명");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("modeCd", "형식코드");
        map.put("modeCdNm", "형식코드명");
        map.put("etcMode", "기타형식");
        map.put("unitGbCd", "단위구분코드");
        map.put("unitGbCdNm", "단위구분코드명");
        map.put("capaPsper", "용량(인용)");
        map.put("capaLube", "용량(루베)");
        map.put("crtnDay", "생성일자");
        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");

        return map;
    }

    Map<String, String> 주택가격_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("bylotCnt", "외필지수");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("hsprc", "주택가격");
        map.put("crtnDay", "생성일자");
        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("regstrGbCd", "대장구분코드");
        map.put("regstrGbCdNm", "대장구분코드명");
        map.put("regstrKindCd", "대장종류코드");
        map.put("regstrKindCdNm", "대장종류코드명");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("stdDay", "기준일자");

        return map;
    }

    Map<String, String> 전유부_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("regstrGbCd", "대장구분코드");
        map.put("regstrGbCdNm", "대장구분코드명");
        map.put("regstrKindCd", "대장종류코드");
        map.put("regstrKindCdNm", "대장종류코드명");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("bldNm", "건물명");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("naRoadCd", "새주소도로코드");
        map.put("naBjdongCd", "새주소법정동코드");
        map.put("naUgrndCd", "새주소지상지하코드");
        map.put("naMainBun", "새주소본번");
        map.put("naSubBun", "새주소부번");
        map.put("dongNm", "동명칭");
        map.put("hoNm", "호명칭");
        map.put("flrGbCd", "층구분코드");
        map.put("flrGbCdNm", "층구분코드명");
        map.put("flrNo", "층번호");
        map.put("crtnDay", "생성일자");

        return map;
    }

    Map<String, String> 지역지구구역_용어맵() {
        Map<String, String> map = Maps.newHashMap();

        map.put("rnum", "순번");
        map.put("platPlc", "대지위치");
        map.put("sigunguCd", "시군구코드");
        map.put("bjdongCd", "법정동코드");
        map.put("platGbCd", "대지구분코드");
        map.put("bun", "번");
        map.put("ji", "지");
        map.put("mgmBldrgstPk", "관리건축물대장PK");
        map.put("newPlatPlc", "도로명대지위치");
        map.put("splotNm", "특수지명");
        map.put("block", "블록");
        map.put("lot", "로트");
        map.put("jijiguGbCd", "지역지구구역구분코드");
        map.put("jijiguGbCdNm", "지역지구구역구분코드명");
        map.put("jijiguCd", "지역지구구역코드");
        map.put("jijiguCdNm", "지역지구구역코드명");
        map.put("reprYn", "대표여부");
        map.put("etcJijigu", "기타지역지구구역");
        map.put("crtnDay", "생성일자");

        return map;
    }


}