package me.msjo.land.domain.land.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName    : me.msjo.land.domain.land.entity
 * fileName       : BasicDocument
 * author         : ms.jo
 * date           : 2024/06/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/06/05        ms.jo       최초 생성
 */
@Entity
@Getter
@DynamicUpdate
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@ToString(exclude = "hospital")
@Comment("기본개요")
public class BasicDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seq;

    @Comment("도로명대지위치")
    // ex) 서울특별시 강남구 개포로109길 5
    String newPlatPlc;

    @Comment("건물명")
    // ex) 대치아파트107동
    String bldNm;

    @Comment("특수지명")
    // ex)
    String splotNm;

    @Comment("블록")
    // ex)
    String block;

    @Comment("로트")
    // ex)
    String lot;

    @Comment("외필지수")
    // ex) 0
    String bylotCnt;

    @Comment("새주소도로코드")
    // ex) 1.16804E+11
    String naRoadCd;

    @Comment("새주소법정동코드")
    // ex) 10301
    String naBjdongCd;

    @Comment("새주소지상지하코드")
    // ex) 0
    String naUgrndCd;

    @Comment("새주소본번")
    // ex) 5
    String naMainBun;

    @Comment("새주소부번")
    // ex) 0
    String naSubBun;

    @Comment("지역코드")
    // ex)
    String jiyukCd;

    @Comment("지구코드")
    // ex)
    String jiguCd;

    @Comment("구역코드")
    // ex)
    String guyukCd;

    @Comment("지역코드명")
    // ex)
    String jiyukCdNm;

    @Comment("지구코드명")
    // ex)
    String jiguCdNm;

    @Comment("구역코드명")
    // ex)
    String guyukCdNm;

    @Comment("생성일자")
    // ex) 20171206
    String crtnDay;

    @Comment("순번")
    // ex) 1
    String rnum;

    @Comment("대지위치")
    // ex) 서울특별시 강남구 개포동 12번지
    String platPlc;

    @Comment("시군구코드")
    // ex) 11680
    String sigunguCd;

    @Comment("법정동코드")
    // ex) 10300
    String bjdongCd;

    @Comment("대지구분코드")
    // ex) 0
    String platGbCd;

    @Comment("번")
    // ex) 12
    String bun;

    @Comment("지")
    // ex) 0
    String ji;

    @Comment("관리건축물대장PK")
    // ex) 11680-126446
    String mgmBldrgstPk;

    @Comment("관리상위건축물대장PK")
    // ex) 11680-923
    String mgmUpBldrgstPk;

    @Comment("대장구분코드")
    // ex) 2
    String regstrGbCd;

    @Comment("대장구분코드명")
    // ex) 집합
    String regstrGbCdNm;

    @Comment("대장종류코드")
    // ex) 4
    String regstrKindCd;

    @Comment("대장종류코드명")
    // ex) 전유부
    String regstrKindCdNm;

}
