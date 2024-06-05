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
 * fileName       : TotalDocument
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
@Comment("총괄표제부")
public class TotalDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seq;
    @Comment("지능형건축물")
    // ex) 등급
    String itgBldGrade;

    @Comment("지능형건축물인증점수")
    // ex) 	0
    String itgBldCert;

    @Comment("생성일자")
    // ex) 20220110
    String crtnDay;

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

    @Comment("대지면적(m²)")
    // ex) 	0
    String platArea;

    @Comment("건축면적(m²)")
    // ex) 	15403.97
    String archArea;

    @Comment("건폐율(%)")
    // ex) 	0
    String bcRat;

    @Comment("연면적(m²)")
    // ex) 	224217.01
    String totArea;

    @Comment("용적률산정연면적(m²)")
    // ex) 	21833.55
    String vlRatEstmTotArea;

    @Comment("용적률(%)")
    // ex) 	0
    String vlRat;

    @Comment("주용도코드")
    // ex) 2000
    String mainPurpsCd;

    @Comment("주용도코드명")
    // ex) 공동주택
    String mainPurpsCdNm;

    @Comment("기타용도")
    // ex) 주거시설 근린생 활시설
    String etcPurps;

    @Comment("세대수(세대)")
    // ex) 	4199
    String hhldCnt;

    @Comment("가구수(가구)")
    // ex) 	0
    String fmlyCnt;

    @Comment("주건축물수")
    // ex) 27
    String mainBldCnt;

    @Comment("부속건축물수")
    // ex) 3
    String atchBldCnt;

    @Comment("부속건축물면")
    // ex) 적(m²) 	64.26
    String atchBldArea;

    @Comment("총주차수")
    // ex) 0
    String totPkngCnt;

    @Comment("옥내기계식대수(대)")
    // ex)  0
    String indrMechUtcnt;

    @Comment("옥내기계식면적(m²)")
    // ex)  0
    String indrMechArea;

    @Comment("옥외기계식대수(대)")
    // ex)  0
    String oudrMechUtcnt;

    @Comment("옥외기계식면적(m²)")
    // ex)  0
    String oudrMechArea;

    @Comment("옥내자주식대수(대)")
    // ex)  0
    String indrAutoUtcnt;

    @Comment("옥내자주식면적(m²)")
    // ex)  0
    String indrAutoArea;

    @Comment("옥외자주식대수(대)")
    // ex)  0
    String oudrAutoUtcnt;

    @Comment("옥외자주식면적(m²)")
    // ex)  0
    String oudrAutoArea;

    @Comment("허가일")
    // ex)
    String pmsDay;

    @Comment("착공일")
    // ex)
    String stcnsDay;

    @Comment("사용승인일")
    // ex)
    String useAprDay;

    @Comment("허가번호년")
    // ex)
    String pmsnoYear;

    @Comment("가번호기관코드")
    // ex)
    String pmsnoKikCd;

    @Comment("허가번호기관코드명")
    // ex)
    String pmsnoKikCdNm;

    @Comment("허가번호구분코드")
    // ex)
    String pmsnoGbCd;

    @Comment("허가번호구분코드명")
    // ex)
    String pmsnoGbCdNm;

    @Comment("호수(호)")
    // ex)  	0
    String hoCnt;

    @Comment("에너지효율등급")
    // ex)
    String engrGrade;

    @Comment("에너지절감율")
    // ex) 0
    String engrRat;

    @Comment("EPI점수")
    // ex) 0
    String engrEpi;

    @Comment("친환경건축물등급")
    // ex)
    String gnBldGrade;

    @Comment("친환경건축물인증점수")
    // ex) 0
    String gnBldCert;

    @Comment("순번")
    // ex) 1
    String rnum;

    @Comment("대지위치")
    // ex) 서울특별시 강남 구 개포동 12번지
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
    // ex) 0012
    String bun;

    @Comment("지")
    // ex) 0000
    String ji;

    @Comment("관리건축물대장PK")
    // ex) 11680-103
    String mgmBldrgstPk;

    @Comment("대장구분코드")
    // ex) 2
    String regstrGbCd;

    @Comment("대장구분코드명")
    // ex) 집합
    String regstrGbCdNm;

    @Comment("대장종류코드")
    // ex) 1
    String regstrKindC;

    @Comment("대장종류코드명")
    // ex) 총괄표제부
    String regstrKindCdNm;

    @Comment("신구대장구분코드")
    // ex) 0
    String newOldRegstrGbCd;

    @Comment("신구대장구분코드명")
    // ex) 구대장
    String newOldRegstrGbCdNm;

    @Comment("도로명대지위치")
    // ex) 서울특별시 강남구 개포로109길 5
    String newPlatPlc;

    @Comment("건물명")
    // ex) 대치,대청 아파트
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
    // ex) 116804166040
    String naRoadCd;



}
