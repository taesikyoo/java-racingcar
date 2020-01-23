#구현할 기능 목록

1. 입력
- 자동차
    - 자동차 이름을 입력 받는다.
    - 자동차 이름은 쉼표(,)를 기준으로 구분한다. 
    - 이름은 5자 이하만 가능하다.
- 횟수    
    - 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.

2. 자동차 게임
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 
경우 전진하고, 3 이하의 값이면 멈춘다.

3. 출력
- 자동차 이름과 자동차의 위치를 함께 출력한다. 
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 
- 우승자는 한 명 이상일 수 있다.

---

#todo list
- ~~취소선~~

- 자동차 이름 입력받기
    - ~~이름 하나 입력받기~~
    - ~~이름 여러개 입력받기~~
    - 5자 이하만 입력받도록 하기
    - 같은 이름이 들어왔을 때 에러 핸들링
- ~~시도 횟수 입력받기~~
- ~~자동차 이름과 시도 횟수를 한 메서드에서 입력받기~~
    - ~~CarGameInfo 클래스 만들기~~
    - ~~CarGameInfo 생성자 초기화하기~~
- ~~racingcar.domain.RacingCar 클래스 만들기~~
- ~~CarGame과 CarGameInfo 합치기~~
- ~~Main에 getGameInfo 메서드 만들기~~
    
- ~~실행 결과 하나 출력하기~~
    - ~~racingcar.domain.RacingCar 움직이기~~
    - ~~random number 만들기~~
    
- ~~실행 결과 출력하기~~
    - ~~CarGame의 인스턴스 변수로 Cars 추가~~
    - ~~racingcar.CarGameResult 클래스 만들기~~
    
- ~~최종 우승자 출력하기~~
    - progress를 시각화하기 