package me.msjo.land.domain.land.dto.res;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Item{
    String 거래금액;
    String 거래유형;
    int 건축년도;
    int 년;
    String 도로명;
    String 도로명건물본번호코드;
    String 도로명건물부번호코드;
    int 도로명시군구코드;
    String 도로명일련번호코드;
    int 도로명지상지하코드;
    int 도로명코드;
    String 동;
    String 등기일자;
    String 매도자;
    String 매수자;
    String 법정동;
    String 법정동본번코드;
    String 법정동부번코드;
    int 법정동시군구코드;
    int 법정동읍면동코드;
    int 법정동지번코드;
    String 아파트;
    int 월;
    int 일;
    String 일련번호;
    double 전용면적;
    String 중개사소재지;
    Object 지번;
    int 지역코드;
    int 층;
    String 해제사유발생일;
    String 해제여부;
}
