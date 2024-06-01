package me.msjo.land.domain.entity;

//@ExtendWith(MockitoExtension.class)
//@ActiveProfiles("test")
class LibraryServiceTest {

    /*@Mock
    LibraryRepository libraryRepository;
    @Mock
    LibraryMapper libraryMapper;
    @Mock
    LibraryService libraryService;
    @InjectMocks
    LibraryController libraryController;

    private MockMvc mockMvc;

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(libraryController).build();
    }

    private LibraryRegisterReq libraryRegisterReq() {
        return new LibraryRegisterReq("테스트도서관", "032-125-5316", "인천시 효성동 어딘가");
    }

    private LibraryFindListRes libraryFindListRes() {
        return new LibraryFindListRes(1L, "테스트도서관", "032-125-5316", "인천시 효성동 어딘가");
    }

    @Test
    void 도서관_생성은_성공해야한다() throws Exception {

        //given
        LibraryFindListRes libraryFindListRes = libraryFindListRes();

        Mockito.when(libraryService.findById(1L)).thenReturn(libraryFindListRes);
        LibraryFindListRes result = libraryService.findById(1L);

        Assertions.assertEquals(libraryFindListRes, result);
        //when
//        given

        //then

    }

    //두 작업이 이어서 실행되도록 조합하고, 앞선 작업의 결과를 받아 사용 가능 인자타입(동기) :: Function
    @Async
    void thenCompose() throws ExecutionException, InterruptedException {
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello";
        });

        // Future 간에 연관 관계가 있는 경우
        CompletableFuture<String> future = hello.thenCompose(this::mangKyu);
        System.out.println(future.get());
    }

    private CompletableFuture<String> mangKyu(String message) {
        return CompletableFuture.supplyAsync(() -> {
            return message + " " + "MangKyu";
        });
    }

    @Async
    public void timeoutAsync() throws InterruptedException {
        int i = 0;
        for (int j = 0; j < 44000; j++) {
            i += j;
        }
        Thread.sleep(3000);
        System.out.println("i sum is " + i);
    }

    @Async
    public void sendPush() {
        IntStream.range(1, 40000).forEach(i -> {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println();
    }

    @Async
    public void async() throws ExecutionException, InterruptedException {
        System.out.println("start push message logic");
        timeoutAsync();
        thenCompose();
        sendPush();
        System.out.println("success push message logic");
    }

    public void finish() {
        System.out.println("finish");
    }

    @Test
    @Async
    void 동기_비동기_블락_논블락() throws Exception {

        System.out.println("start logic");

        //given
        async();

        //when
        finish();
        //then

    }

    @Test
    void 도서관의_리스트를_올바르게_반환해야한다() throws Exception {

        //given
        Pageable pageable = PageRequest.of(0, 10);

        List<Library> libraries = Arrays.asList(
                Library.of("동양도서관", "032-553-1236", "인천시 동양동 어딘가"),
                Library.of("계양도서관", "032-557-1261", "인천시 계산동 어딘가")
        );
        //when

//        Mockito.doReturn(null).

        //then

    }*/

}