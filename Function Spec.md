# Function spec


### ✓ 기능 명세
1. 선호하는 주거 환경을 특정짓는 질문들을 제공할 수 있어야 한다.
2. 질문들을 통해 도출된 결과와 가용 자금 상황에 적합한 단지를 추출할 수 있어야 한다.
3. 추출한 단지의 매물정보를 확인할 수 있는 플랫폼으로 이동 가능한 링크를 제공할 수 있어야 한다.

### ✓ 사전 준비
- 🏃🏼 필요 기능을 제공하기 위한 open api 리스트 조회 및 테스트
- 어떤 범위의 질문들을 작성할 지 고민
- 동일 및 비슷한 서비스가 이미 존재하는지
 
### ✓ open api 준비

#### 매매 내역 조회
- 국토교통부 아파트매매 실거래 상세 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15057511
- 국토교통부_아파트 전월세 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058017
- 국토교통부_단독/다가구 전월세 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058352
- 국토교통부_오피스텔 전월세 신고 조회 서비스
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15059249
- 국토교통부_오피스텔 매매 신고 조회 서비스
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058452
- 국토교통부_연립다세대 매매 실거래자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058038
- 국토교통부_단독/다가구 매매 실거래 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058022

#### Documents

- 배경 지식
  - https://doczip.tistory.com/10

- 국토교통부_건축물대장 
  - 표제부 조회
    - 지번주소 및 새주소, 주/부속구분, 대지면적, 건축면적, 건폐율, 용적율, 구조, 용도, 지붕구조, 주차대수 등의 정보를 제공한다.
    - 부속건물들의 구성 및 제원까지 확인 가능(관리사무소 수, 놀이터, 어린이집 등)
  - 기본개요 조회
    - 전국 자치단체의 건축행정정보시스템(세움터)를 통해 생성된 건축물대장의 대장종류, 대장구분, 지번주소 및 새주소, 지역/지구/구역 등의 기본정보를 제공한다.
    - **아파트 포함 단독주택 조회 가능**
  - 총괄표제부 조회
    - 전국 자치단체의 건축행정정보시스템(세움터)를 통해 생성된 건축물대장 총괄표제부의 지번주소 및 새주소, 대지면적, 건축면적, 연면적, 건폐율, 용적율, 용도, 주차방식 및 주차대수, 부속건축물의 면적, 허가관리기관, 에너지관련 등급 등의 정보를 제공한다.
  - **아파트만 조회 가능**
  - 층별개요 조회
    - 전국 자치단체의 건축행정정보시스템(세움터)를 통해 생성된 건축물대장의 층구분, 층번호, 층의 구조, 용도, 면적 등의 층별 정보를 제공한다.
      - 아파트 포함 단독주택 조회 가능