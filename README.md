# Smoke tests for Oddsking site
<a target="_blank" href="https://oddsking.com/">Oddsking testing</a>


## :mechanic: Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/Oddsking%20Smoke%20Tests/">jenkins.autotests.cloud/job/%s</a>


## :blue_book: Content:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Интеграция с Allure TestOps](#earth_africa-Интеграция-с-Allure-TestOps)
- [Интеграция с Jira](#earth_africa-Интеграция-с-Jira)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)
                                                               
## :technologist: Technologies and instruments
![2022-07-04_22h05_22](https://user-images.githubusercontent.com/61227126/177201975-cc177a1e-8876-46c8-9113-a67d08583a55.png)

## :bookmark_tabs: Реализованы проверки

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

>- [x] *Testing game search functionality*
>- [x] *Page title should have header text*
>- [x] *Page title should have header text*
>- [x] *Page console log should not have errors*
>- [x] *Login page opens and available*

### Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 91.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- browserMobileView (название мобильного устройства, для примера iPhone X)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- videoStorage (адрес, по которому можно получить видео)
- threads (количество потоков)


## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### 
![2022-07-04_21h47_22](https://user-images.githubusercontent.com/61227126/177201173-0ab4817f-3071-4ee5-8c35-87d7bc68c080.png)
<p></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/Oddsking%20Smoke%20Tests/8/allure/">Allure report</a><p>

### Overview
![2022-07-04_21h56_11](https://user-images.githubusercontent.com/61227126/177201140-a119ff0a-a4eb-4efd-801f-e29c8048eaac.png)



Serve report:
```bash
allure serve build/allure-results
```

## :clapper: Test video example:
https://user-images.githubusercontent.com/61227126/177204538-95d11128-c324-445e-ac10-c9e7a1b3e657.mp4


  
:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
