# Framework Benchmark Test

Hardware

iMac 21 (2007 late)

- 2.5GHz Core i5 quad core processor
- a 500GB hard drive
- AMD Radeon HD 6750M graphics with 512MB of video memory.

Software

- Node v0.8.9
- Perl 5.15.7
- PHP 5.4.4
- Apache 2.2

Note: to run plack example, please enter following command to clone repository

    git clone https://github.com/plack/Plack.git plack

## Hello world test case


### Nodejs + Pure HTTP Server

Concurrent 20, 1000 requests

Requests per second:    6438.74 [#/sec] (mean)

Time per request:       3.106 [ms] (mean)

    ab -n 1000 -c 20 http://127.0.0.1:8124/
    This is ApacheBench, Version 2.3 <$Revision: 655654 $>
    Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
    Licensed to The Apache Software Foundation, http://www.apache.org/

    Benchmarking 127.0.0.1 (be patient)
    Completed 100 requests
    Completed 200 requests
    Completed 300 requests
    Completed 400 requests
    Completed 500 requests
    Completed 600 requests
    Completed 700 requests
    Completed 800 requests
    Completed 900 requests
    Completed 1000 requests
    Finished 1000 requests


    Server Software:        
    Server Hostname:        127.0.0.1
    Server Port:            8124

    Document Path:          /
    Document Length:        12 bytes

    Concurrency Level:      20
    Time taken for tests:   0.155 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      113000 bytes
    HTML transferred:       12000 bytes
    Requests per second:    6438.74 [#/sec] (mean)
    Time per request:       3.106 [ms] (mean)
    Time per request:       0.155 [ms] (mean, across all concurrent requests)
    Transfer rate:          710.52 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.3      0       6
    Processing:     0    3   2.3      2      13
    Waiting:        0    3   2.3      2      13
    Total:          0    3   2.3      3      13

    Percentage of the requests served within a certain time (ms)
    50%      3
    66%      3
    75%      4
    80%      4
    90%      6
    95%      9
    98%     11
    99%     12
    100%     13 (longest request)


Concurrent 5, 1000 requests

Requests per second:    6438.74 [#/sec] (mean)

Time per request:       3.106 [ms] (mean)

    ab -n 1000 -c 5 http://127.0.0.1:8124/ 
    This is ApacheBench, Version 2.3 <$Revision: 655654 $>
    Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
    Licensed to The Apache Software Foundation, http://www.apache.org/

    Benchmarking 127.0.0.1 (be patient)
    Completed 100 requests
    Completed 200 requests
    Completed 300 requests
    Completed 400 requests
    Completed 500 requests
    Completed 600 requests
    Completed 700 requests
    Completed 800 requests
    Completed 900 requests
    Completed 1000 requests
    Finished 1000 requests


    Server Software:        
    Server Hostname:        127.0.0.1
    Server Port:            8124

    Document Path:          /
    Document Length:        12 bytes

    Concurrency Level:      5
    Time taken for tests:   0.173 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      113000 bytes
    HTML transferred:       12000 bytes
    Requests per second:    5776.17 [#/sec] (mean)
    Time per request:       0.866 [ms] (mean)
    Time per request:       0.173 [ms] (mean, across all concurrent requests)
    Transfer rate:          637.41 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       5
    Processing:     0    1   1.3      1      11
    Waiting:        0    1   1.2      0      10
    Total:          0    1   1.3      1      11

    Percentage of the requests served within a certain time (ms)
    50%      1
    66%      1
    75%      1
    80%      1
    90%      1
    95%      2
    98%      5
    99%      8
    100%     11 (longest request)

### Express.js

Empty skeleton, Hello world app

Concurrent 20, 1000 requests

Requests per second:    1843.99 [#/sec] (mean)

Time per request:       10.846 [ms] (mean)

    $ ab -n 1000 -c 20 http://127.0.0.1:3000/

    Document Path:          /
    Document Length:        206 bytes

    Concurrency Level:      20
    Time taken for tests:   0.542 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      489012 bytes
    HTML transferred:       207648 bytes
    Requests per second:    1843.99 [#/sec] (mean)
    Time per request:       10.846 [ms] (mean)
    Time per request:       0.542 [ms] (mean, across all concurrent requests)
    Transfer rate:          880.60 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.2      0       1
    Processing:     1   10   2.9     11      21
    Waiting:        1    9   2.8      9      21
    Total:          1   11   2.9     11      21

    Percentage of the requests served within a certain time (ms)
    50%     11
    66%     11
    75%     12
    80%     13
    90%     13
    95%     15
    98%     16
    99%     18
    100%     21 (longest request)

Concurrent 5, 1000 requests:

Requests per second:    1356.17 [#/sec] (mean)
Time per request:       3.687 [ms] (mean)

    ab -n 1000 -c 5 http://127.0.0.1:3000/

    Document Path:          /
    Document Length:        206 bytes

    Concurrency Level:      5
    Time taken for tests:   0.737 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      485060 bytes
    HTML transferred:       206000 bytes
    Requests per second:    1356.17 [#/sec] (mean)
    Time per request:       3.687 [ms] (mean)
    Time per request:       0.737 [ms] (mean, across all concurrent requests)
    Transfer rate:          642.40 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       1
    Processing:     1    3   1.8      3      15
    Waiting:        1    3   1.7      3      15
    Total:          1    4   1.8      3      16

    Percentage of the requests served within a certain time (ms)
    50%      3
    66%      4
    75%      4
    80%      4
    90%      5
    95%      6
    98%      7
    99%     15
    100%     16 (longest request)


### Batman.js

Empty skeleton, Hello World app

Concurrent 20, 1000 requests

Requests per second:    2004.76 [#/sec] (mean)
Time per request:       9.976 [ms] (mean)

    $ ab -n 1000 -c 20 http://127.0.0.1:1047/

    Document Path:          /
    Document Length:        1587 bytes

    Concurrency Level:      20
    Time taken for tests:   0.499 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      1827826 bytes
    HTML transferred:       1588587 bytes
    Requests per second:    2004.76 [#/sec] (mean)
    Time per request:       9.976 [ms] (mean)
    Time per request:       0.499 [ms] (mean, across all concurrent requests)
    Transfer rate:          3578.47 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.2      0       1
    Processing:     1   10   5.2      8      32
    Waiting:        1    7   4.3      6      25
    Total:          1   10   5.2      8      33

    Percentage of the requests served within a certain time (ms)
    50%      8
    66%     10
    75%     11
    80%     11
    90%     16
    95%     23
    98%     32
    99%     32
    100%     33 (longest request)

Concurrent 5, 1000 requests

Requests per second:    1677.64 [#/sec] (mean)
Time per request:       2.980 [ms] (mean)

    $ ab -n 1000 -c 5 http://127.0.0.1:1047/ 

    This is ApacheBench, Version 2.3 <$Revision: 655654 $>
    Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
    Licensed to The Apache Software Foundation, http://www.apache.org/

    Document Path:          /
    Document Length:        1587 bytes

    Concurrency Level:      5
    Time taken for tests:   0.596 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      1826000 bytes
    HTML transferred:       1587000 bytes
    Requests per second:    1677.64 [#/sec] (mean)
    Time per request:       2.980 [ms] (mean)
    Time per request:       0.596 [ms] (mean, across all concurrent requests)
    Transfer rate:          2991.58 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.2      0       4
    Processing:     1    3   2.6      2      20
    Waiting:        1    2   2.1      2      20
    Total:          1    3   2.6      2      20

    Percentage of the requests served within a certain time (ms)
    50%      2
    66%      2
    75%      3
    80%      3
    90%      4
    95%      7
    98%     15
    99%     19
    100%     20 (longest request)

### Apache + PHP Roller Router + Extension + APC

Concurrent 5, 1000 requests:

Requests per second:    496.21 [#/sec] (mean)
Time per request:       10.076 [ms] (mean)

    $ ab -n 1000 -c 5 http://roller.dev/

    Document Path:          /
    Document Length:        70 bytes

    Concurrency Level:      5
    Time taken for tests:   2.015 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      285000 bytes
    HTML transferred:       70000 bytes
    Requests per second:    496.21 [#/sec] (mean)
    Time per request:       10.076 [ms] (mean)
    Time per request:       2.015 [ms] (mean, across all concurrent requests)
    Transfer rate:          138.11 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.6      0       5
    Processing:     6   10   3.0      9      24
    Waiting:        4   10   3.0      9      24
    Total:          6   10   3.0      9      24

    Percentage of the requests served within a certain time (ms)
    50%      9
    66%     11
    75%     12
    80%     12
    90%     14
    95%     16
    98%     18
    99%     20
    100%     24 (longest request)

Concurrent 20, 1000 request

Requests per second:    497.62 [#/sec] (mean)
Time per request:       40.191 [ms] (mean)

    ab -n 1000 -c 20 http://roller.dev/

    Document Path:          /
    Document Length:        70 bytes

    Concurrency Level:      20
    Time taken for tests:   2.010 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      285000 bytes
    HTML transferred:       70000 bytes
    Requests per second:    497.62 [#/sec] (mean)
    Time per request:       40.191 [ms] (mean)
    Time per request:       2.010 [ms] (mean, across all concurrent requests)
    Transfer rate:          138.50 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.5      0       5
    Processing:     9   40   5.7     40      62
    Waiting:        8   40   5.7     39      62
    Total:          9   40   5.7     40      62

    Percentage of the requests served within a certain time (ms)
    50%     40
    66%     42
    75%     43
    80%     44
    90%     47
    95%     49
    98%     53
    99%     55
    100%     62 (longest request)


### Perl 5.15.7 + Plack + Twiggy + Hello World

Concurrent 5, 1000 requests

Requests per second:    2310.10 [#/sec] (mean)
Time per request:       2.164 [ms] (mean)

    $ ab -n 1000 -c 5 http://0.0.0.0:5000/ 
    Document Path:          /
    Document Length:        11 bytes

    Concurrency Level:      5
    Time taken for tests:   0.433 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      76000 bytes
    HTML transferred:       11000 bytes
    Requests per second:    2310.10 [#/sec] (mean)
    Time per request:       2.164 [ms] (mean)
    Time per request:       0.433 [ms] (mean, across all concurrent requests)
    Transfer rate:          171.45 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       2
    Processing:     0    2   0.6      2      10
    Waiting:        0    2   0.5      2       9
    Total:          1    2   0.5      2      10

    Percentage of the requests served within a certain time (ms)
    50%      2
    66%      2
    75%      2
    80%      2
    90%      2
    95%      3
    98%      3
    99%      3
    100%     10 (longest request)

Concurrent 20, 1000 requests

Requests per second:    2116.63 [#/sec] (mean)
Time per request:       9.449 [ms] (mean)

    ab -n 1000 -c 20 http://0.0.0.0:5000/

    Document Path:          /
    Document Length:        11 bytes

    Concurrency Level:      20
    Time taken for tests:   0.472 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      76000 bytes
    HTML transferred:       11000 bytes
    Requests per second:    2116.63 [#/sec] (mean)
    Time per request:       9.449 [ms] (mean)
    Time per request:       0.472 [ms] (mean, across all concurrent requests)
    Transfer rate:          157.09 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       1
    Processing:     1    9   3.1      8      26
    Waiting:        1    9   3.1      8      26
    Total:          1    9   3.1      8      26

    Percentage of the requests served within a certain time (ms)
    50%      8
    66%      9
    75%      9
    80%     11
    90%     11
    95%     14
    98%     25
    99%     26
    100%     26 (longest request)

### Perl 5.15.7 + Plack + Feersum + Hello World

Concurrent 5, 1000 requests

Requests per second:    11860.99 [#/sec] (mean)
Time per request:       0.422 [ms] (mean)

    $ ab -n 1000 -c 5 http://0.0.0.0:5000/

    Server Software:        
    Server Hostname:        0.0.0.0
    Server Port:            5000

    Document Path:          /
    Document Length:        11 bytes

    Concurrency Level:      5
    Time taken for tests:   0.084 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      76000 bytes
    HTML transferred:       11000 bytes
    Requests per second:    11860.99 [#/sec] (mean)
    Time per request:       0.422 [ms] (mean)
    Time per request:       0.084 [ms] (mean, across all concurrent requests)
    Transfer rate:          880.31 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       0
    Processing:     0    0   0.1      0       1
    Waiting:        0    0   0.1      0       1
    Total:          0    0   0.1      0       1

    Percentage of the requests served within a certain time (ms)
    50%      0
    66%      0
    75%      0
    80%      0
    90%      1
    95%      1
    98%      1
    99%      1
    100%      1 (longest request)

Concurrent 20, 1000 requests

Requests per second:    13741.93 [#/sec] (mean)
Time per request:       1.455 [ms] (mean)

    $ ab -n 1000 -c 20 http://0.0.0.0:5000/

    Document Path:          /
    Document Length:        11 bytes

    Concurrency Level:      20
    Time taken for tests:   0.073 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      76608 bytes
    HTML transferred:       11088 bytes
    Requests per second:    13741.93 [#/sec] (mean)
    Time per request:       1.455 [ms] (mean)
    Time per request:       0.073 [ms] (mean, across all concurrent requests)
    Transfer rate:          1028.07 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    1   0.1      1       1
    Processing:     0    1   0.3      1       2
    Waiting:        0    1   0.2      1       2
    Total:          1    1   0.3      1       3

    Percentage of the requests served within a certain time (ms)
    50%      1
    66%      1
    75%      1
    80%      2
    90%      2
    95%      2
    98%      2
    99%      2
    100%      3 (longest request)

