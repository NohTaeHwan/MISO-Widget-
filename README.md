# MISO

## List

------

1. [Overview](#overview)
2. [Project info](#project-info)
3. [Description](#description)



## Overview

------

MISO는 Mash-up for Instant Search using open API의 약자입니다. 네이버 , 유튜브 , 다음 등의 사이트에서 제공하는 open API들을 사용하여 사용자가 원하는 검색결과를 얻게해주는 서비스 응용 프로그램입니다. 웹 서핑이나 문서작업 중 궁금한 Text에 대한 사전정보 , 관련 사진 , 동영상 , 지도정보 등을 간단하게 얻어낼 수 있습니다. 



## Project Info

------

목표 , 시스템 흐름도 , 사용기술

### 목표

- 쉽고 편리한 검색 기능 제공
- 간결한 검색 결과 제공
- 재활용성 및 확장성 제공
- 사용자가 원하는 형태의 검색 정보 제공



### 시스템 흐름도

<img src="/Users/taehwan/Library/Application Support/typora-user-images/image-20201105164530496.png" alt="image-20201105164530496" style="zoom:35%;" />

### 사용 기술 및 라이브러리

- Java
- Java fx
- tess4j library : OCR open source
- SystemHook : hooking open source
- IDE : Eclipse , Scene Builder





## Description

------



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

1. ##### 원하는 데이터 카테고리 선택

<img src="/Users/taehwan/Library/Application Support/typora-user-images/image-20201105171352931.png" alt="image-20201105171352931" style="zoom:50%;" align="left" />

##### 2. 검색을 원하는 텍스트에 텍스트 블록 설정

<img src="/Users/taehwan/Library/Application Support/typora-user-images/image-20201105171532046.png" alt="image-20201105171532046" style="zoom:50%;" align="left"/>

##### 3. 지정된 hot key입력 후 검색 결과 출력

<img src="/Users/taehwan/Library/Application Support/typora-user-images/image-20201105171629202.png" alt="image-20201105171629202" style="zoom:50%;" align="left"/>

