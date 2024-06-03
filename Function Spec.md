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
- 국토교통부 아파트매매 실거래 상세 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15057511
- 국토교통부_아파트 전월세 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058017
- 국토교통부_단독/다가구 전월세 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058352
- 	국토교통부_오피스텔 전월세 신고 조회 서비스
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15059249
- 	국토교통부_오피스텔 매매 신고 조회 서비스
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058452
- 	국토교통부_연립다세대 매매 실거래자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058038
- 국토교통부_단독/다가구 매매 실거래 자료
  - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15058022