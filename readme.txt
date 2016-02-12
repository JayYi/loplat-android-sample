== History == 


2016.02.12 - 장소 정보에 client_code 추가
             동일 client_code를 가지는 장소 내에서의 이동시에 중복해서 ENTER Event를 발생하지 않도록 변경
             장소학습기 (loplat cook) 릴리즈

2016.01.27 - initial release




== Contents ==

디렉토리 소개
- /sample : 샘플코드
- /library : plengi.aar 파일이 실제 라이브러리 파일 임
    		* jar 라이브러리가 필요한 경우 plengi.jar를 사용하고 AndroidManifest.xml 에 있는 권한을 추가
- /doc : library 설명 문서
- /place_registerer : 장소 학습기 안드로이드 앱


샘플코드 간략 소개
- LoplatSampleApplication.java : Application Class를 상속받아 plengi engine을 초기화 수행 함
- LoplatPlengiListener.java : PlengiListener를 상속받아 loplat 서버로부터의 위치 획득 결과를 받음
- MainActivity.java : 위치 획득 요청 Plengi.getInstance(this).refreshPlace() 과 결과를 표시해 주는 부분


코드 구현 Quick Guide

1. PlengiListener를 상속받은 listener class를 생성
	- Asynchronous Result는 모두 해당 리스너를 통해 전달됨
   
2. Application Class를 만듦
	- Plengi 에 1번에서 생성한 Listener를 등록함
	
3. Plengi init 수행 (1회만 수행하면 됨)
	- clientid, clientsecret, uniqueUserId를 인자로 넒김

4. 필요한 기능 호출
	- Background로 장소 변화를 모니터링 하기 위해서는 start() / stop() 함수 사용
	- 현재 장소의 위치를 서버에서 받아오고자 하는 경우 refreshPlace() 호출



코드 구현과 관련해서는 http://www.loplat.com 에서 sdk & docs 부분을 참조


실제 테스트를 위해서는 기존에 학습된 장소가 있어야 함
loplat.com 의 DEMO 탭에서, loplat cook 이라는 학습기 앱을 다운받아서 인식을 원하는 장소에서 학습을 수행함
그 후에 테스트를 해 보면 장소를 인식하는 것을 확인할 수 있음
