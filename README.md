# springProject-1

## Use Case
![image](https://user-images.githubusercontent.com/108917552/180765254-8a108db5-c81b-434f-b884-7763ed757db0.png)

---
## API 명세서
![image](https://user-images.githubusercontent.com/108917552/180944553-a785ff7c-acb0-47fb-8f36-b8a644fb7dcd.png)
 - 해당 명세에서 두개씩 있는 부분 중 URL에 password가 포함된 것들은 HTML 기능 구현에 사용된 부분입니다.
---
### 1.수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)

- body를 사용했습니다. 나머지 둘은 정보가 주소표시줄에 표시되어 패스워드가 포함된 API에서 패스워드가 주소창에 노출되기 때문에 적합하지 않다고 생각했기 때문입니다.
---
### 2. 어떤 상황에 어떤 방식의 request를 써야하나요?
- 조회는 GET, 작성은 POST, 수정은 PUT, 삭제는 DELETE를 써야합니다.
- 저는 전체 게시글 목록 조회에서는 GET, 게시글 작성에서는 POST, 게시글 조회에서는 GET, 게시글 비밀번호 확인에서는 POST,
게시글 수정에서는 PUT, 게시글 삭제에서는 DELETE를 사용하였습니다.
---
### 3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?

- RESTful한 API를 하려고 노력하였습니다. 최대한 표준에 따른 명명을 사용하였고, URL에도 아이디 외의 정보를 넣지 않았습니다.
- 다만 비밀번호 확인 부분에서 POST를 사용한 것은 RESTful 하지 않은 점이라고 생각합니다.

---
### 4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)

- 각자의 역할에 맞추어 단계를 나누어 분배하였습니다.
---
### 5. 작성한 코드에서 빈(Bean)을 모두 찾아보세요!
#### 종속성 주입 O
 - PostService의 @Service
- PostController의 @RestController

#### 종속성 주입 X
- SpringProject1Application의 @springBootApplication
---
### 6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!

- 가이드라인에서는 요청변수와 반환값으로 나누어 기능,이름,타입,선택여부,설명과 기능,이름,설명을 각각 표로 작성하였고 
API 호출/결과의 예시가 포함되는반면,
제가 작성한 명세서는 메소드, URL, request, response로 다소 간략한 것 같습니다.
----
