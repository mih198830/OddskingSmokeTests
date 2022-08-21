# Smoke tests for Oddsking Gambling Games site
<a target="_blank" href="https://oddsking.com/">Oddsking platform testing</a>


## :mechanic: Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/Oddsking%20Smoke%20Tests/">jenkins.autotests.cloud/job</a>


## :blue_book: Content:

- [ Technologies and instruments](Technologies-and-instruments)
- [Tests implemented](Tests-implemented)
- [Jenkins build parameters](Jenkins-build-parameters)
- [Run tests from terminal](Run-tests-from-terminal)
- [Test video example](Test-video-example)
- [Notification to Telegram with report results](Notification-to-Telegram-with-report-results)
- [Jira synchronization](Jira-synchronization)
                                                               
## :technologist: Technologies and instruments
![2022-07-04_22h05_22](https://user-images.githubusercontent.com/61227126/177201975-cc177a1e-8876-46c8-9113-a67d08583a55.png)

## :bookmark_tabs: Tests implemented

## &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

> - [x] :heavy_check_mark: *Testing game search functionality*
> - [x] :heavy_check_mark: *Page title should have header text*
> - [x] :heavy_check_mark: *Registration page opens and available*
> - [x] :o: *Page console log should not have errors*
> - [x] :heavy_check_mark: *Login page opens and available*

## Jenkins build parameters:

- browser (by default chrome)
- browserVersion (by default 100.0)
- browserSize (by default 1920x1080)
- browserMobileView
- threads


## :computer: Run tests from terminal

Local run:
```bash
gradle clean test
```

Remote run:
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

##
![AllureTestOps (1)](https://user-images.githubusercontent.com/61227126/178105147-0d813199-d937-436f-afcb-2f80e941ccaf.png)
<p></a> Report in <a target="_blank" href="https://allure.autotests.cloud/project/1431/dashboards">Allure TestOps</a><p>
 
##
![Allure_Report](https://user-images.githubusercontent.com/61227126/178105175-54c2a093-f0f3-4212-bcc7-2343399d33ba.png)
<p></a> Report in <a target="_blank" href="https://jenkins.autotests.cloud/job/Oddsking%20Smoke%20Tests/8/allure/">Allure</a><p>

## Overview
![2022-07-04_21h56_11](https://user-images.githubusercontent.com/61227126/177201140-a119ff0a-a4eb-4efd-801f-e29c8048eaac.png)

## Suites
![2022-07-05_22h31_03](https://user-images.githubusercontent.com/61227126/177392676-2293aafa-fdc2-4feb-837c-c4ba40591ddc.png)

## Graphs
![2022-07-05_22h32_05](https://user-images.githubusercontent.com/61227126/177392923-d6df4df8-e58a-46c4-8d1b-7391bfc9b46c.png)
  
## ![AllureTestOps (1)](https://user-images.githubusercontent.com/61227126/177992986-b5498dfb-8e67-4e40-a355-afb590f616a8.png) Allure Test Ops [test-cases](https://allure.autotests.cloud/project/1431/test-cases/10912?treeId=0)
![2022-07-05_23h56_34](https://user-images.githubusercontent.com/61227126/177406019-3308e5cd-66f0-4e9c-9c87-62813cfc5edd.png)

Serve report:
```bash
allure serve build/allure-results
```

## :clapper: Test video example
https://user-images.githubusercontent.com/61227126/177204538-95d11128-c324-445e-ac10-c9e7a1b3e657.mp4

  
## ![Jira](https://user-images.githubusercontent.com/61227126/178106099-be57c5c7-810a-44bd-b6b4-0e5c3d77b1c6.png)Jira [synchronization](https://jira.autotests.cloud/browse/AUTO-1198)
![2022-07-09_16h39_02](https://user-images.githubusercontent.com/61227126/178106136-55f87a17-0370-4c8d-8232-6ab8689e10c4.png)

## ![Telegram (1)](https://user-images.githubusercontent.com/61227126/177992751-b5d98d08-29ee-4f20-98ff-8cbacdba530c.png) Notification to Telegram with report results 
![2022-07-07_22h57_38](https://user-images.githubusercontent.com/61227126/177851117-4c09deb4-6cef-48f6-bc07-934f27adb39c.png)

  
:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
