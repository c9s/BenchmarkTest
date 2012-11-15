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

Requests per second:    6235.46 [#/sec] (mean)

Time per request:       3.106 [ms] (mean)

    ab -n 1000 -c 20 http://0.0.0.0:5000/
    Document Path:          /
    Document Length:        12 bytes

    Concurrency Level:      20
    Time taken for tests:   0.160 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      113000 bytes
    HTML transferred:       12000 bytes
    Requests per second:    6235.46 [#/sec] (mean)
    Time per request:       3.207 [ms] (mean)
    Time per request:       0.160 [ms] (mean, across all concurrent requests)
    Transfer rate:          688.09 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       1
    Processing:     0    3   2.2      3      13
    Waiting:        0    3   2.2      3      13
    Total:          1    3   2.2      3      13

    Percentage of the requests served within a certain time (ms)
    50%      3
    66%      3
    75%      4
    80%      4
    90%      6
    95%      8
    98%     10
    99%     11
    100%     13 (longest request)


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

### Apache + PHP Roller Router + Extension + APC


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

### Perl5.15.7 + Feersum (native)

    Document Path:          /
    Document Length:        0 bytes

    Concurrency Level:      20
    Time taken for tests:   0.051 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      0 bytes
    HTML transferred:       0 bytes
    Requests per second:    19517.91 [#/sec] (mean)
    Time per request:       1.025 [ms] (mean)
    Time per request:       0.051 [ms] (mean, across all concurrent requests)
    Transfer rate:          0.00 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       1
    Processing:     0    1   0.1      0       1
    Waiting:        0    0   0.0      0       0
    Total:          1    1   0.1      1       2
    ERROR: The median and mean for the processing time are more than twice the standard
        deviation apart. These results are NOT reliable.

    Percentage of the requests served within a certain time (ms)
    50%      1
    66%      1
    75%      1
    80%      1
    90%      1
    95%      1
    98%      1
    99%      2
    100%      2 (longest request)

### Perl5.15.7 + Mojo + Feersum

20 Concurrent, 1000 requests

    ab -n 1000 -c 20 http://0.0.0.0:5000/

    Document Path:          /
    Document Length:        12 bytes

    Concurrency Level:      20
    Time taken for tests:   1.101 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      160160 bytes
    HTML transferred:       12012 bytes
    Requests per second:    908.37 [#/sec] (mean)
    Time per request:       22.017 [ms] (mean)
    Time per request:       1.101 [ms] (mean, across all concurrent requests)
    Transfer rate:          142.08 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.1      0       2
    Processing:     9   22   3.3     21      42
    Waiting:        2   18   4.7     20      28
    Total:          9   22   3.3     21      42

    Percentage of the requests served within a certain time (ms)
    50%     21
    66%     22
    75%     22
    80%     22
    90%     24
    95%     30
    98%     30
    99%     33
    100%     42 (longest request)

### Perl5.15.7 + Dancer + Feersum

Requests per second:    1375.89 [#/sec] (mean)
Time per request:       14.536 [ms] (mean)

    Benchmarking 0.0.0.0 (be patient)
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


    Server Software:        Perl
    Server Hostname:        0.0.0.0
    Server Port:            5000

    Document Path:          /
    Document Length:        11 bytes

    Concurrency Level:      20
    Time taken for tests:   0.708 seconds
    Complete requests:      1000
    Failed requests:        0
    Write errors:           0
    Total transferred:      150000 bytes
    HTML transferred:       11000 bytes
    Requests per second:    1412.70 [#/sec] (mean)
    Time per request:       14.157 [ms] (mean)
    Time per request:       0.708 [ms] (mean, across all concurrent requests)
    Transfer rate:          206.94 [Kbytes/sec] received

    Connection Times (ms)
                min  mean[+/-sd] median   max
    Connect:        0    0   0.2      0       1
    Processing:     3   14   0.8     14      15
    Waiting:        3   14   0.8     14      15
    Total:          4   14   0.8     14      16

    Percentage of the requests served within a certain time (ms)
    50%     14
    66%     14
    75%     15
    80%     15
    90%     15
    95%     15
    98%     15
    99%     16
    100%     16 (longest request)
