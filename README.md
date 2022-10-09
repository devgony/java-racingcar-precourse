# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## Todo

- [x] feat: architecture design - view(input, output), domain(), controller(Application)
- [x] test: add case for Spot: {defaultSpotShouldBe1, shouldMove1}
- [x] feat: implement Spot {int at, Spot move()}
- [x] test: add case for Car {defaultCar, carNameShouldBeBetween1and5}
- [x] feat: implement Car {String name, Spot spot, void validate(String) throw E}
- [x] test: add case for Cars: {AddCar, shouldYieldWinner, shouldYieldTwoWinnersWithIdenticalSpot}
- [x] feat: implement first class collection Cars {List<Car> car, Cars addCar(Car), Car yieldWinner()}
- [ ] feat: implement Input.scan
- [ ] test: add case for Input: {ShouldParseStringTo3Cars}
- [ ] feat: implement Input {Cars parseCar(String)}
- [ ] feat: implement generateRandom()
- [ ] feat: implement Strategy pattern
