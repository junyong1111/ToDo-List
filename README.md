# ToDo-List
Spring Boot_ ToboList

<img width="1400" alt="스크린샷 2023-11-20 오후 10 22 17" src="https://github.com/junyong1111/ToDo-List/assets/79856225/7eb664dc-299b-4629-b128-128fe0271cd9">


## 구현해야 할 REST API 목록

### getTodoList
- 기본 API 정보

| Method | URI | 출력 포맷 | 설명 |
| --- | --- | --- | --- |
| GET | /todo | JSON | 모든 todo 목록 조회 요청 |

- **요청 파라미터**
    
    없음
    
- **요청 예시**
    
    localhost:8080/todo 
    
- **응답 데이터 목록**

| 필드 | 타입 | 설명 |
| --- | --- | --- |
| JSON Array | Array | Todo 객체를 가진 리스트 |
| id | Int | Todo가 갖는 고유 id |
| content | String | Todo의 내용 |
| isCompleted | String | Todo의 완료 여부 |

응답 예시
```json
[
    {
        "id": 1,
        "content": "Learn javascript",
        "isCompleted": "Y"
    },
    {
        "id": 2,
        "content": "Write a post in my blog",
        "isCompleted": "N"
    }
]
```


### addTodo
- 기본 API 정보

| Method | URI | 출력 포맷 | 설명 |
| --- | --- | --- | --- |
| POST | /todo | JSON | Todo 생성 요청 |

- **요청 파라미터**

| 요청 변수명 | 타입 | 설명 |
| --- | --- | --- |
|    content (필수) | String | Todo의 내용 |
    
- **요청 예시**

```
localhost:8080/todo

{

“content”: “study spring”

}
```

    
- **응답 데이터 목록**

| 필드 | 타입 | 설명 |
| --- | --- | --- |
|   message | String | 응답 메세지 |
|   result | Int | 응답 코드 |

응답 예시
```json
{
    "message": "Success",
    "result": 200
}
```


### deleteTodo
- 기본 API 정보

| Method | URI | 출력 포맷 | 설명 |
| --- | --- | --- | --- |
| DELETE | /todo/{ id } | JSON | Todo 삭제 요청 |

- **요청 파라미터**

| 요청 변수명 | 타입 | 출력 포맷 | 설명 |
| --- | --- | --- | --- |
| id (필수) | String | JSON | Todo의 고유한 id 값 |
    
- **요청 예시**

```
localhost:8080/todo/2
```

    
- **응답 데이터 목록**

| 타입 | 설명 | 설명 |
| --- | --- | --- |
|   message | String | 응답 메세지 |
|   result | Int | 응답 코드 |

응답 예시
```json
{
	"message": "Success",
  "result" : 200
}
```