# MISO

## List

1. [Overview](#overview)
2. [Project info](#project-info)
3. [Description](#description)



## Overview

MISO는 Mash-up for Instant Search using open API의 약자입니다. 네이버 , 유튜브 , 다음 등의 사이트에서 제공하는 open API들을 사용하여 사용자가 원하는 검색결과를 얻게해주는 서비스 응용 프로그램입니다. 웹 서핑이나 문서작업 중 궁금한 Text에 대한 사전정보 , 관련 사진 , 동영상 , 지도정보 등을 간단하게 얻어낼 수 있습니다. 



## Project Info

목표 , 시스템 흐름도 , 사용기술

### 목표

- 쉽고 편리한 검색 기능 제공
- 간결한 검색 결과 제공
- 재활용성 및 확장성 제공
- 사용자가 원하는 형태의 검색 정보 제공



### 시스템 흐름도

<img width="874" alt="스크린샷 2020-11-05 오후 4 44 53" src="https://user-images.githubusercontent.com/29722673/98215752-89569480-1f8b-11eb-893a-c908f97dc3a0.png" style="zoom:15%;" align="left">

### 사용 기술 및 라이브러리

- Java
- Java fx
- tess4j library : OCR open source
- SystemHook : hooking open source
- IDE : Eclipse , Scene Builder





## Description



### 주요 기능

- 어학 사전 검색 기능
- 백과 사전 검색 기능
- 이미지 검색 기능
- 동영상 검색 기능
- 번역 검색 기능
- 지도 검색 기능

### 검색 방법

- ##### 일반 텍스트

  1. 설정에서 검색에 이용할 hot key를 설정
  2. 검색 카테고리를 클릭하여 지정
  3. 검색하고자 하는 텍스트에 텍스트 블록 설정
  4. 지정된 hot key 입력

- ##### OCR

  1. OCR mode 토글버튼을 클릭하여 on
  2. 검색 카테고리를 클릭하여 지정
  3. 마우스로 검색하고자 하는 영역을 드래그하여 박스 지정



### 사용 예시

##### 1. 원하는 데이터 카테고리 선택

- <img src="https://user-images.githubusercontent.com/29722673/98216052-e7837780-1f8b-11eb-8ecf-d8e0fc18f459.png" alt="miso1" width="25%" height="50%" align="left" />

<br>
##### 2. 검색을 원하는 텍스트에 텍스트 블록 설정
- <img src="https://user-images.githubusercontent.com/29722673/98216217-1b5e9d00-1f8c-11eb-8c54-f036dae0ef5e.png" alt="miso2" style="zoom:15%;" align="left" />

<br>
##### 3. 지정된 hot key입력 후 검색 결과 출력
- <img src="https://user-images.githubusercontent.com/29722673/98216301-37fad500-1f8c-11eb-9699-0719bd3b701c.png" alt="miso3" style="zoom:15%;" align="left" />

<br>
