# Smoke tests for SharpGamingSite
<a target="_blank" href="https://www.sharpgaming.com/">Sharpgaming</a>


## :mechanic: Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/SharpGamingSmokeTests/">jenkins.autotests.cloud/job</a>
                                                               
## :technologist: Technologies and instruments
![2022-07-04_22h05_22](https://user-images.githubusercontent.com/61227126/177201975-cc177a1e-8876-46c8-9113-a67d08583a55.png)

## :bookmark_tabs: Tests implemented

## &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

> - [x] :heavy_check_mark: *Check that email link exist on the About Us page*
> - [x] :heavy_check_mark: *Open What we Do page and click Vacancies button*
> - [x] :heavy_check_mark: *Open Vacancies page and check vacancies block is available*
> - [x] :heavy_check_mark: *No error about mandatory field*

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
<p></a> Report in <a target="_blank" href="https://allure.autotests.cloud/launch/15463">Allure TestOps</a><p>
 
##
![Allure_Report](https://user-images.githubusercontent.com/61227126/178105175-54c2a093-f0f3-4212-bcc7-2343399d33ba.png)
<p></a> Report in <a target="_blank" href="https://jenkins.autotests.cloud/job/SharpGamingSmokeTests/6/allure/">Allure</a><p>

## Overview
![2022-08-27_21h26_50](https://user-images.githubusercontent.com/61227126/187041308-0abc16c8-9fee-4a38-8de9-cb6413e48bd2.png)

## Suites
![2022-08-27_21h11_29](https://user-images.githubusercontent.com/61227126/187040788-f4dd845a-8fc1-4f1d-acba-f056aa946eeb.png)

## Graphs
![2022-08-27_21h12_00](https://user-images.githubusercontent.com/61227126/187040813-7b974f4f-3e00-44d8-b343-12bde18350aa.png)
  
## ![AllureTestOps (1)](https://user-images.githubusercontent.com/61227126/177992986-b5498dfb-8e67-4e40-a355-afb590f616a8.png) Allure Test Ops [test-cases](https://allure.autotests.cloud/project/1553/test-cases?treeId=0)
![2022-08-27_21h21_02](https://user-images.githubusercontent.com/61227126/187041223-7a86c458-ddda-4f54-91d0-9e67561381be.png)

Serve report:
```bash
allure serve build/allure-results
```

## :clapper: Test video example
https://user-images.githubusercontent.com/61227126/187040978-3c5c7019-c9dc-4806-b981-661ad7ae5609.mp4

## Jira
<p></a><a target="_blank" href="https://jira.autotests.cloud/browse/AUTO-1325">Jira synchronization</a><p>
  
![2022-08-27_22h04_02](https://user-images.githubusercontent.com/61227126/187042577-002567bf-57ec-4cf2-9be3-ee3d0ad2fb38.png)

## ![Telegram (1)](https://user-images.githubusercontent.com/61227126/177992751-b5d98d08-29ee-4f20-98ff-8cbacdba530c.png) Notification to Telegram with report results 
![2022-08-27_22h15_54](https://user-images.githubusercontent.com/61227126/187042987-3308f7b9-8ca0-4df0-abd5-d0b4b8a0fe3e.png)

:arrow_up: [Go up](#lift)
:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
