# team12_week4
----------------------------------------------------------------------------------------------------

## Jenkins 프로젝트 설정:

**JDK**  :  jdk 1.8

**Analysis properties**	: <pre><code> 
                            sonar.projectKey = real
                            sonar.projectName = real
                            sonar.projectVersion = 0.0.1
                            **sonar.sources = src(x) -> real/src(o) 으로 설정**
                          </code></pre>
                          
                          
  
**JVM Options**  :  -Xmx500m -XX:MaxPermSize=100m

**Root POM**  : <pre><code>  
                **pom.xml(x) -> real/pom.xml(o)로 설정**
                </code></pre>
                
  
* 깃허브에 올라간 team12_week4 폴더 안에 있는 real 폴더에 프로젝트가 있기 때문에 
Root POM 경로와 Analysis properties에서 sonar.sources의 경로에 real/를 붙여주어야 한다.

*******************************************************************************************

## 실행 방식  :


**입력** : 입력된 정보를 저장하는 Data.txt파일에 원하는 입력값으로 설정(또는 변경)한다.
           입력값의 순서는 총 사용 시간, Plan, 사용회선 순으로 입력해야 한다.

**출력** : 파일을 저장 한 후 실행 시키면 콘솔창에 전화 요금 고지서에 대한 정보가 나타난다. 


--------------------------------------------------------------------------------------------------
##구성 :

+ BasicPlan에서 각 plan의 요금 계산에 사용되는 상수들(기본요금, 추가요금, 초과요금)을 정의해놓고 생성자로 Plan과 사용시간 minite, 라인수 line을 입력받아 객체를 생성한다.

+ calculator 클래스의 calculatorbill함수는 plan 객체를 인자로 받아 해당하는 plan과 minite, line, 기본요금, 추가요금,초과요금을 가지고 계산해 총 금액을 반환하여 준다

+ AppView 클래스는 Java의 파일입출력을 이용하여 Data.txt 파일로부터 Data를 읽어들여 프로그램에 입력시키는 기능을 함과 동시에 사용자에게 제공할 출력문 양식을 제공한다

+ App클래스는 메인 클래스로  Appview 객체와 Calculator 객체를 생성해서, Data.txt에 입력된 값를 단어로 쪼개고 그 값을 Calculator에 넘겨 계산하게 하고 계산된 값을 Appview 를 통해 출력하도록 지시하는 역할을 한다.

+ Gold 클래스는 BasicPlan을 상속받아 super()를 통해 BasicPlan의 생성자를 호출할 때 Gold의 기본요금, 할인 요금, 주어진 사용시간등을 설정하였다.

+ Silver 클래스는 BasicPlan을 상속받아 super()를 통해 BasicPlan의 생성자를 호출할 때 Silver의 기본요금, 할인 요금, 주어진 사용시간등을 설정하였다.





