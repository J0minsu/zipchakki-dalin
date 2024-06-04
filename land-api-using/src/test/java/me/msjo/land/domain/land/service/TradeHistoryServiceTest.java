package me.msjo.land.domain.land.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.msjo.land.domain.land.dto.res.Items;
import me.msjo.land.domain.land.dto.res.Root;
import me.msjo.land.domain.land.webclient.LandWebClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@SpringBootTest
@Transactional(readOnly = true)
@ActiveProfiles("test")
//@Rollback(value = false)
class TradeHistoryServiceTest {

    @Autowired LandWebClientService landWebClientService;
    @Autowired ObjectMapper objectMapper;

    int regionCode = 11110;
    int size = 300;
    int page = 1;
    int year = 2013;
    int month = 5;

    @Test
    void 아파트_매매_상세_조회() throws Exception {

        //given
        Root root = landWebClientService.apartmentTradeHistory(regionCode, size, page, year, month).block();

        Items items = root.getResponse().getBody().getItems();

        String result = objectMapper.writeValueAsString(items);

        System.out.println(result);

        //when

        //then

    }

    @Test
    public void 아파트_월세_및_전세_내역_조회() throws Exception {

        //given
        Map result = landWebClientService.apartmentRentalHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }

    @Test
    public void 오피스텔_매매_상세_조회() throws Exception {

        //given
        Map result = landWebClientService.officetelTradeHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }
    @Test
    public void 오피스텔_월세_및_전세_내역_조회() throws Exception {

        //given
        Map result = landWebClientService.officetelRentalHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }

    @Test
    public void 다가구_매매_상세_조회() throws Exception {

        //given
        Map result = landWebClientService.singleAndMultiFamilyHouseTradeHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }
    @Test
    public void 다가구_월세_및_전세_내역_조회() throws Exception {

        //given
        Map result = landWebClientService.singleAndMultiFamilyHouseRentalHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }

    @Test
    public void 연립주택_매매_상세_조회() throws Exception {

        //given
        Map result = landWebClientService.relationalMultiFamilyHouseTradeHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }
    @Test
    public void 연립주택_월세_및_전세_내역_조회() throws Exception {

        //given
        Map result = landWebClientService.relationalMultiFamilyHouseRentalHistory(regionCode, size, page, year, month).block();

        System.out.println(objectMapper.writeValueAsString(result));

        //when

        //then

    }

}
