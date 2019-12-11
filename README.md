# SpringMVC 기초세팅
* src/main/java/com/signin
  * `controller`, `data`, `repository`, 'service'가 담겨있는 위치.
- src/main/resources/
  - logging가능하게 하는 xml과 `root-context`로 db를 연결하고 , `servlet-context`로 view위치를 선언.
- src/main/resources/mybatis
  - 'mapper'가 담겨있는 폴더.
- src/main/resources/properties
  - db정보와 mybatis mapper의 위치가 담김.
- src/main/webapp/WEB-INF/resources
  - js와 css의 위치.
- src/main/webapp/WEB-INF/views
  - `.jsp`의 위치. 
- src/main/webapp/WEB-INF/web.xml
  - configuration file의 위치 정보.
